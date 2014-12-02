/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers;

import java.util.concurrent.Executor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.IModelSetSnippet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ResourceAdapter;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.commands.LoadAvailableDecoratorModelsHandler;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences.ProfileExternalizationUIPreferences;
import org.eclipse.papyrus.uml.profile.service.ReapplyProfilesService;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

/**
 * A {@link ModelSet} snippet that intercepts loading of resources to optionally prompt the user to load available profile applications.
 */
public class AvailableDecoratorModelsSnippet extends ResourceAdapter implements IModelSetSnippet {
	private static final String EDITOR_SERVICE_ID = IMultiDiagramEditor.class.getName();

	private Executor profileRefreshExecutor;

	private ModelSet modelSet;

	public AvailableDecoratorModelsSnippet() {
		super();
	}

	@Override
	public void start(ModelSet modelsManager) {
		this.modelSet = modelsManager;
		addAdapter(modelsManager);
		profileRefreshExecutor = UIUtil.createAsyncOnceExecutor();
	}

	@Override
	public void dispose(ModelSet modelsManager) {
		if (modelsManager == modelSet) {
			profileRefreshExecutor = null;
			removeAdapter(modelsManager);
			modelSet = null;
		}
	}

	@Override
	protected void handleResourceLoaded(Resource resource) {
		final Package package_ = (Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE);
		if (package_ != null) {
			// Check whether to prompt for loading available decorator models
			if (isPromptEnabled()) {
				// Only prompt for resources in this user model
				Resource root = EcoreUtil.getRootContainer(package_).eResource();
				if (root != null && modelSet.getURIWithoutExtension().equals(root.getURI().trimFileExtension())) {
					// Schedule a call-back on the UI thread to prompt if there are unloaded profile applications available
					Futures.addCallback(DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(package_, false), //
							promptToLoadDecoratorModels(package_), Activator.getDefault().getExecutorService());
				}
			}

			// Maybe a decorator model was loaded? Check for profile migration. Note that we don't
			// need to invoke profile refresh when loading/discovering resources on first opening
			// the editor because the editor already does that
			if (DecoratorModelUtils.isDecoratorModel(resource) && (profileRefreshExecutor != null)) {
				UmlModel uml = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
				final Package rootPackage = (uml == null) ? null : (Package) EcoreUtil.getObjectByType(uml.getResource().getContents(), UMLPackage.Literals.PACKAGE);
				if (rootPackage != null) {
					profileRefreshExecutor.execute(new Runnable() {

						@Override
						public void run() {
							// Check that the editor wasn't closed in the mean-time
							if (modelSet != null) {
								refreshProfiles(rootPackage);
							}
						}
					});
				}
			}
		}
	}

	boolean isPromptEnabled() {
		boolean result = false;

		if (ProfileExternalizationUIPreferences.getAutoPromptToLoadProfileApplications()) {
			// Even so, only prompt if opening in an editor
			try {
				ServicesRegistry services = ServiceUtilsForResourceSet.getInstance().getServiceRegistry(modelSet);
				result = (services != null) && services.isStarted(EDITOR_SERVICE_ID);

				if (result) {
					// And then only if the editor is not open on a decorator model!
					UmlModel uml = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
					Resource mainResource = (uml == null) ? null : uml.getResource();
					result = (mainResource == null) || !DecoratorModelUtils.isDecoratorModel(mainResource);
				}
			} catch (ServiceException e) {
				// That's fine. If there's no editor, then it can't be opening
			}
		}

		return result;
	}

	static boolean isLoadedAndAttached(EObject object) {
		return !object.eIsProxy() && (object.eResource() != null);
	}

	private FutureCallback<Boolean> promptToLoadDecoratorModels(final Package package_) {
		return new FutureCallback<Boolean>() {
			@Override
			public void onSuccess(Boolean result) {
				if (result && isLoadedAndAttached(package_)) {
					// Still loaded and attached
					IWorkbenchWindow window = Activator.getActiveWorkbenchWindow();
					if (window != null) {
						LoadAvailableDecoratorModelsHandler.promptToLoadAvailableProfileApplications(window.getShell(), package_, true);
					}
				}
			}

			@Override
			public void onFailure(Throwable t) {
				// Don't prompt anything
			}
		};
	}

	protected void refreshProfiles(Package rootPackage) {
		ReapplyProfilesService reapplyProfiles;
		try {
			reapplyProfiles = ServiceUtilsForEObject.getInstance().getService(ReapplyProfilesService.class, rootPackage);
		} catch (ServiceException ex) {
			return;
		}

		reapplyProfiles.checkProfiles();
	}

}
