/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434302
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 435995
 *  Christian W. Damus - bug 399859
 *  
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.service;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.EditorLifecycleEventListener;
import org.eclipse.papyrus.infra.core.services.EditorLifecycleManager;
import org.eclipse.papyrus.infra.core.services.IService;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.uml.modelrepair.service.IStereotypeRepairService;
import org.eclipse.papyrus.uml.profile.Activator;
import org.eclipse.papyrus.uml.profile.service.ui.RefreshProfileDialog;
import org.eclipse.papyrus.uml.profile.validation.ProfileValidationHelper;
import org.eclipse.papyrus.uml.tools.commands.ApplyProfileCommand;
import org.eclipse.papyrus.uml.tools.helper.IProfileApplicationDelegate;
import org.eclipse.papyrus.uml.tools.helper.ProfileApplicationDelegateRegistry;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.utils.ProfileUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * If a local profile is applied on this model, and this profile has been
 * redefined recently, the user will be asked whether the profile should
 * be reapplied.
 *
 *
 * @author Camille Letavernier
 *
 */
public class ReapplyProfilesService implements IService, EditorLifecycleEventListener {

	private ServicesRegistry servicesRegistry;

	private org.eclipse.uml2.uml.Package rootPackage;

	private IStereotypeRepairService stereotypeRepairService;

	private IMultiDiagramEditor editor;

	/**
	 * {@inheritDoc}
	 */
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		this.servicesRegistry = servicesRegistry;
	}

	/**
	 * {@inheritDoc}
	 */
	public void startService() throws ServiceException {
		try {
			EditorLifecycleManager lifecyleManager = servicesRegistry.getService(EditorLifecycleManager.class);
			lifecyleManager.addEditorLifecycleEventsListener(this);
		} catch (ServiceException ex) {
			return; // If the EditorLifecycleManager is not present, do nothing
		}

		try {
			stereotypeRepairService = servicesRegistry.getService(IStereotypeRepairService.class);
		} catch (ServiceException ex) {
			// If there's no stereotype repair service, then we don't have to worry about waiting for it
		}
	}

	public void checkProfiles() {
		if (editor != null) {
			checkProfilesAfterRepair(editor);
		}
	}

	private void checkProfilesAfterRepair(final IMultiDiagramEditor editor) {
		if (stereotypeRepairService == null) {
			// Just check profiles, now
			checkProfiles(editor);
		} else {
			// Ensure that we only kick in the profile migration after any pending repair has completed
			stereotypeRepairService.getPostRepairExecutor().execute(new Runnable() {

				public void run() {
					checkProfiles(editor);
				}
			});
		}
	}

	protected void checkProfiles(IMultiDiagramEditor editor) {
		ModelSet modelSet;
		try {
			modelSet = servicesRegistry.getService(ModelSet.class);
		} catch (ServiceException ex) {
			return;
		}

		UmlModel umlModel = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		if (umlModel == null) {
			return;
		}

		rootPackage = getRootPackage(umlModel);

		if (rootPackage == null) {
			return;
		}

		checkAndRefreshProfiles(rootPackage, editor);
	}

	protected Package getRootPackage(UmlModel umlModel) {
		try {
			EObject root = umlModel.lookupRoot();
			if (root instanceof Package) {
				return (Package) root;
			}
		} catch (NotFoundException ex) {
			// Ignore the exception: On diagram creation, the root isn't defined yet.
			// There's not profile application, and nothing to do.
			// Activator.log.error(ex);
		}
		return null;
	}

	protected boolean checkAndRefreshProfiles(Package currentPackage, IMultiDiagramEditor editor) {
		if (Display.getCurrent() == null) {
			return false;
		}

		IProfileApplicationDelegate delegate = ProfileApplicationDelegateRegistry.INSTANCE.getDelegate(currentPackage);
		for (ProfileApplication profileApplication : delegate.getProfileApplications(currentPackage)) {
			if (ProfileUtil.isDirty(currentPackage, delegate.getAppliedProfile(profileApplication))) {
				RefreshProfileDialog dialog = new RefreshProfileDialog(editor.getSite().getShell(), this.rootPackage);
				dialog.setCallback(getCallback(dialog));
				dialog.open();
				return true;
			}
		}

		for (Package nestedPackage : currentPackage.getNestedPackages()) {
			if (checkAndRefreshProfiles(nestedPackage, editor)) {
				return true;
			}
		}

		return false;
	}

	protected Runnable getCallback(final RefreshProfileDialog dialog) {
		return new Runnable() {

			public void run() {
				Map<Package, Collection<Profile>> profilesToReapply = dialog.getProfilesToReapply();
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(rootPackage);

				if (domain != null) {

					// Create a flat list of profiles, for validation
					Collection<Profile> allProfiles = new LinkedList<Profile>();
					for (Collection<Profile> profiles : profilesToReapply.values()) {
						allProfiles.addAll(profiles);
					}

					// Validate and apply
					if (ProfileValidationHelper.checkApplicableProfiles(Display.getCurrent().getActiveShell(), allProfiles)) {
						CompoundCommand command = new CompoundCommand();
						for (Map.Entry<Package, Collection<Profile>> profiles : profilesToReapply.entrySet()) {
							command.append(new ApplyProfileCommand(profiles.getKey(), profiles.getValue(), domain));
						}

						domain.getCommandStack().execute(command);
					}

				} else {
					Activator.log.error(new IllegalArgumentException("Cannot reapply profiles on Package " + rootPackage.getQualifiedName() + ". The EditingDomain cannot be found"));
				}

			}

		};
	}

	public void disposeService() throws ServiceException {
		this.rootPackage = null;
		this.stereotypeRepairService = null;
		this.servicesRegistry = null;
		this.editor = null;
	}

	public void postInit(IMultiDiagramEditor editor) {
		if (this.editor == null) {
			this.editor = editor;
		}
	}

	public void postDisplay(IMultiDiagramEditor editor) {
		checkProfilesAfterRepair(editor);
	}

	public void beforeClose(IMultiDiagramEditor editor) {
		if (editor == this.editor) {
			this.editor = null;
		}
	}

}
