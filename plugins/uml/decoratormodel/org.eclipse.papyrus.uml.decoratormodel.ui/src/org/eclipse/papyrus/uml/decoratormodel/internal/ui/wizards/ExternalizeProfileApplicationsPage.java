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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers.EncapsulatedAdapterFactoryLabelProvider;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.Lists;

/**
 * @author damus
 *
 */
public class ExternalizeProfileApplicationsPage extends AbstractNewDecoratorModelPage<Package, ProfileApplication> {
	public ExternalizeProfileApplicationsPage() {
		super("externalize", Messages.ExternalizeProfileApplicationsPage_0, null, ProfileApplication.class); //$NON-NLS-1$

		setMessage(Messages.ExternalizeProfileApplicationsPage_1);
	}

	@Override
	protected void browseResource() {
		browseResource(Messages.ExternalizeProfileApplicationsPage_2, Messages.ExternalizeProfileApplicationsPage_3);
	}

	@Override
	protected IBaseLabelProvider createProfilesLabelProvider() {
		return EncapsulatedAdapterFactoryLabelProvider.appliedProfiles();
	}

	@Override
	protected IStructuredContentProvider createProfilesContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public Object[] getElements(Object inputElement) {
				Object[] result = null;

				if (inputElement instanceof Package) {
					Package package_ = (Package) inputElement;
					List<ProfileApplication> profileApplications = Lists.newArrayList();

					for (ProfileApplication next : package_.getProfileApplications()) {
						Profile profile = next.getAppliedProfile();

						if ((profile != null) && !profile.eIsProxy()) {
							profileApplications.add(next);
						}
					}

					result = profileApplications.toArray();
				}

				return (result == null) ? new Object[0] : result;
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				// Pass
			}

			@Override
			public void dispose() {
				// Pass
			}
		};
	}

	@Override
	protected String validateExistingFile(IFile file) {
		String result = null;

		String conflictingProfile = null;
		if (!DecoratorModelUtils.isDecoratorModel(getResourceURI())) {
			result = Messages.ExternalizeProfileApplicationsPage_4;
		} else if ((conflictingProfile = findProfileApplication(file)) != null) {
			result = NLS.bind(Messages.ExternalizeProfileApplicationsPage_5, conflictingProfile, getInput().getName());
		}

		return result;
	}

	private String findProfileApplication(IFile decoratorModel) {
		URI decoratorModelURI = URI.createPlatformResourceURI(decoratorModel.getFullPath().toString(), true);
		String result = null;

		try {
			Set<URI> applied = DecoratorModelIndex.getInstance().getAppliedProfiles(EcoreUtil.getURI(getInput()), decoratorModelURI);
			for (ProfileApplication profileApplication : getSelectedProfileApplications()) {
				if (applied.contains(EcoreUtil.getURI(profileApplication.getAppliedProfile()))) {
					result = profileApplication.getAppliedProfile().getName();
				}
			}
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
		}

		return result;
	}

	@Override
	protected String defaultResource(Package package_) {
		String resourceName = (package_ == null) ? "" : UML2Util.getValidJavaIdentifier(package_.getName()); //$NON-NLS-1$
		if ((resourceName.length() > 0) && Character.isUpperCase(resourceName.charAt(0))) {
			resourceName = Character.toLowerCase(resourceName.charAt(0)) + resourceName.substring(1);
		}

		IPath result = new Path(package_.eResource().getURI().toPlatformString(true)).removeLastSegments(1).append(resourceName).addFileExtension(getFileExtension());

		return result.toString();
	}
}
