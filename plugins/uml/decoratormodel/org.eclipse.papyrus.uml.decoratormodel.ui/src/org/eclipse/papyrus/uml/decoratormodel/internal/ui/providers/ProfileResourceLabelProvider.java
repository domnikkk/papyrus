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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.papyrus.infra.widgets.providers.DelegatingStyledLabelProvider;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.extensionpoints.Registry;
import org.eclipse.papyrus.uml.extensionpoints.profile.IRegisteredProfile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * A label provider for presentation of decorator model {@link IFile}s or {@link Resource}s in the UI.
 */
public class ProfileResourceLabelProvider extends DelegatingStyledLabelProvider {
	private final ResourceSet resourceSet;

	public ProfileResourceLabelProvider(ResourceSet resourceSet) {
		super(new WorkbenchLabelProvider());

		this.resourceSet = resourceSet;
	}

	@Override
	protected Image customGetImage(Object element) {
		Image result = null;

		if (element instanceof Resource) {
			element = ((Resource) element).getURI();
		}
		if (element instanceof URI) {
			URI uri = (URI) element;
			IRegisteredProfile registered = getRegisteredProfile(uri);
			if (registered != null) {
				result = registered.getImage();
			} else if (uri.isPlatformResource()) {
				IResource file = !uri.isPlatformResource() ? null : ResourcesPlugin.getWorkspace().getRoot().findMember(uri.toPlatformString(true));
				result = delegatedGetImage(file);
			}
		}

		return result;
	}

	@Override
	public StyledString customGetStyledText(Object element) {
		return (element instanceof IFile) ? getStyledText((IFile) element) //
				: (element instanceof Resource) ? getStyledText((Resource) element) //
						: (element instanceof URI) ? getStyledText((URI) element) //
								: null;
	}

	protected StyledString getStyledText(Resource resource) {
		StyledString result;

		URI uri = resource.getURI();
		Package model = resource.isLoaded() ? (Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE) : null;
		if (model == null) {
			result = getStyledText(uri);
		} else if (uri.isPlatformResource()) {
			result = new StyledString();
			result.append(model.getName());

			String qualifier = uri.isPlatformResource() ? uri.toPlatformString(true) : uri.toString();
			result.append(" - " + qualifier, StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
		} else {
			result = getStyledText(model.getName(), resource.getURI());
		}

		return result;
	}

	protected StyledString getStyledText(String modelName, URI uri) {
		StyledString result = new StyledString();
		result.append(modelName);

		String qualifier = uri.isPlatformResource() ? uri.toPlatformString(true) : uri.toString();
		result.append(" - " + qualifier, StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

		return result;
	}

	protected StyledString getStyledText(IFile file) {
		StyledString result = new StyledString();

		IPath path = file.getFullPath().removeFileExtension();
		result.append(path.lastSegment());
		result.append(" - " + path.removeLastSegments(1).toString(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

		return result;
	}

	protected IRegisteredProfile getRegisteredProfile(URI uri) {
		IRegisteredProfile result = null;
		for (IRegisteredProfile next : Registry.getRegisteredProfiles()) {
			if (uri.equals(next.getUri())) {
				result = next;
				break;
			}
		}
		return result;
	}

	protected StyledString getStyledText(URI uri) {
		StyledString result;

		IRegisteredProfile registered = getRegisteredProfile(uri);

		if (registered != null) {
			result = getStyledText(registered.getName(), uri);
		} else {
			Resource resource = (resourceSet == null) ? null : resourceSet.getResource(uri, false);
			if ((resource != null) && resource.isLoaded()) {
				result = getStyledText(resource);
			} else {
				IResource file = !uri.isPlatformResource() ? null : ResourcesPlugin.getWorkspace().getRoot().findMember(uri.toPlatformString(true));
				if (file instanceof IFile) {
					result = getStyledText((IFile) file);
				} else {
					result = getStyledText(Messages.ProfileResourceLabelProvider_0, uri);
				}
			}
		}

		return result;
	}
}
