/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.properties.widgets;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.properties.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.ExternalizeProfileApplicationsWizard;
import org.eclipse.papyrus.uml.decoratormodel.properties.Activator;
import org.eclipse.papyrus.uml.decoratormodel.ui.providers.DeleteEmptyDecoratorModelsPolicy;
import org.eclipse.papyrus.uml.properties.widgets.ProfileApplicationEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

/**
 * Specialized property editor for profile applications of a package that enables editing of the selected profile application.
 */
public class ProfileApplicationPropertyEditor extends org.eclipse.papyrus.uml.properties.widgets.ProfileApplicationPropertyEditor {

	/**
	 * Constructor.
	 *
	 * @param parent
	 * @param style
	 */
	public ProfileApplicationPropertyEditor(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected ProfileApplicationEditor createProfileApplicationEditor(Composite parent, int style) {
		return new ExternalizableProfileApplicationEditor(parent, style);
	}

	//
	// Nested types
	//

	static class ExternalizableProfileApplicationEditor extends ProfileApplicationEditor {

		private Button externalizeButton;

		private Button internalizeButton;

		ExternalizableProfileApplicationEditor(Composite parent, int style) {
			super(parent, style);
		}

		@Override
		protected void createListControls() {
			super.createListControls();

			externalizeButton = createButton(Activator.getDefault().getImage("/icons/full/ctool16/externalize.gif"), Messages.ProfileApplicationPropertyEditor_0); //$NON-NLS-1$
			internalizeButton = createButton(Activator.getDefault().getImage("/icons/full/ctool16/internalize.gif"), Messages.ProfileApplicationPropertyEditor_1); //$NON-NLS-1$
		}

		@Override
		protected ProfileColumnsLabelProvider createProfileColumnsLabelProvider(IBaseLabelProvider labelProvider) {
			return new ExternalizableProfileColumnsLabelProvider(labelProvider);
		}

		@Override
		protected void updateControls() {
			super.updateControls();

			final Package package_ = getInputPackage();
			final Iterable<ProfileApplication> profileApplications = getSelectedProfileApplications();

			boolean allInternalized = false;
			for (ProfileApplication next : profileApplications) {
				allInternalized = next.getApplyingPackage() == package_;
				if (!allInternalized) {
					break;
				}
			}
			externalizeButton.setEnabled(allInternalized);

			boolean allExternalized = false;
			for (ProfileApplication next : profileApplications) {
				allExternalized = next.getApplyingPackage() != package_;
				if (!allExternalized) {
					break;
				}
			}
			internalizeButton.setEnabled(allExternalized);
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			super.widgetSelected(e);

			if (e.widget == externalizeButton) {
				externalizeProfileApplications();
			} else if (e.widget == internalizeButton) {
				internalizeProfileApplications();
			}
		}

		@SuppressWarnings("unchecked")
		Iterable<ProfileApplication> getSelectedProfileApplications() {
			final Package package_ = getInputPackage();
			IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
			return Iterables.transform(selection.toList(), new Function<Object, ProfileApplication>() {
				public ProfileApplication apply(Object input) {
					return package_.getProfileApplication((Profile) input, true);
				}
			});
		}

		Package getInputPackage() {
			return (Package) getContextElement();
		}

		void externalizeProfileApplications() {
			Package package_ = getInputPackage();

			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(package_);
			if (domain != null) {
				ExternalizeProfileApplicationsWizard wizard = new ExternalizeProfileApplicationsWizard();
				final Iterable<ProfileApplication> profileApplications = getSelectedProfileApplications();
				wizard.init(package_, profileApplications);

				WizardDialog dlg = new WizardDialog(getShell(), wizard);
				if (dlg.open() == Window.OK) {
					commit();
					updateControls();
				}
			}
		}

		void internalizeProfileApplications() {
			Package package_ = getInputPackage();

			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(package_);
			if (domain != null) {
				final Iterable<ProfileApplication> profileApplications = getSelectedProfileApplications();
				domain.getCommandStack().execute(DecoratorModelUtils.createReclaimProfileApplicationsCommand(profileApplications, new DeleteEmptyDecoratorModelsPolicy(new SameShellProvider(internalizeButton))));
				commit();
				updateControls();
			}
		}

		//
		// Nested types
		//

		protected class ExternalizableProfileColumnsLabelProvider extends ProfileColumnsLabelProvider {

			public ExternalizableProfileColumnsLabelProvider(IBaseLabelProvider defaultLabelProvider) {
				super(defaultLabelProvider);
			}

			@Override
			public StyledString getStyledText(Object element) {
				StyledString result = super.getStyledText(element);

				ProfileApplication application = null;
				if (element instanceof Profile) {
					application = getInputPackage().getProfileApplication((Profile) element, true);
				} else if (element instanceof ProfileApplication) {
					application = (ProfileApplication) element;
				}

				if ((application != null) && (application.eResource() != getInputPackage().eResource())) {
					Package rootPackage = (Package) EcoreUtil.getRootContainer(application);
					String modelName = rootPackage.getName();
					if (Strings.isNullOrEmpty(modelName)) {
						modelName = rootPackage.eResource().getURI().trimFileExtension().lastSegment();
					}
					String qualifier = " " + NLS.bind(Messages.ProfileApplicationPropertyEditor_2, modelName); //$NON-NLS-1$

					result.append(qualifier, StyledString.DECORATIONS_STYLER);
				}

				return result;
			}
		}
	}

}
