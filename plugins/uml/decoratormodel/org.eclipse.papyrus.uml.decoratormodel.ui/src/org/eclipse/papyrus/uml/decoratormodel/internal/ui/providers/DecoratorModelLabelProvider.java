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

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.papyrus.infra.widgets.providers.DelegatingStyledLabelProvider;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndexEvent;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.IDecoratorModelIndexListener;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * A label provider for presentation of decorator model {@link IFile}s or {@link Resource}s in the UI.
 */
public class DecoratorModelLabelProvider extends DelegatingStyledLabelProvider implements IDecoratorModelIndexListener {
	private final ResourceSet resourceSet;

	private volatile Map<URI, String> modelNames;

	public DecoratorModelLabelProvider(ResourceSet resourceSet) {
		super(new WorkbenchLabelProvider());

		this.resourceSet = resourceSet;
		DecoratorModelIndex.getInstance().addIndexListener(this);
	}

	public DecoratorModelLabelProvider() {
		this(null);
	}

	@Override
	public void dispose() {
		DecoratorModelIndex.getInstance().removeIndexListener(this);

		super.dispose();
	}

	@Override
	protected Image customGetImage(Object element) {
		Image result = null;

		if (element instanceof Resource) {
			element = ((Resource) element).getURI();
		}
		if (element instanceof URI) {
			URI uri = (URI) element;
			if (uri.isPlatformResource()) {
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
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
		Package model = resource.isLoaded() ? (Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE) : null;

		String modelName;

		if (model == null) {
			modelName = getModelNames().get(resource.getURI());
		} else {
			modelName = model.getName();
		}

		return getStyledText(modelName, resource.getURI());
	}

	protected StyledString getStyledText(String modelName, URI uri) {
		StyledString result = new StyledString();
		result.append(modelName);

		String qualifier = uri.isPlatformResource() ? uri.toPlatformString(true) : uri.toString();
		result.append(" - " + qualifier, StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

		return result;
	}

	protected StyledString getStyledText(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		return getStyledText(uri);
	}

	protected StyledString getStyledText(URI uri) {
		StyledString result;

		// Get the actual current loaded model name if loaded, otherwise from the index
		Resource resource = (resourceSet != null) ? resourceSet.getResource(uri, false) : null;
		if (resource != null) {
			result = getStyledText(resource);
		} else {
			String modelName = getModelNames().get(uri);
			if (modelName == null) {
				modelName = uri.trimFileExtension().lastSegment();
			}
			result = getStyledText(modelName, uri);
		}

		return result;
	}

	protected synchronized final Map<URI, String> getModelNames() {
		if (modelNames == null) {
			final ListenableFuture<Map<URI, String>> futureModelNames = DecoratorModelIndex.getInstance().getDecoratorModelNamesAsync();

			if (futureModelNames.isDone()) {
				// Get it now
				modelNames = Futures.getUnchecked(futureModelNames);
			} else {
				futureModelNames.addListener(new Runnable() {

					@Override
					public void run() {
						synchronized (DecoratorModelLabelProvider.this) {
							modelNames = Futures.getUnchecked(futureModelNames);
							if (modelNames == null) {
								// Oh, well
								modelNames = Collections.emptyMap();
							} else {
								// Update the labels now
								updateLabels();
							}
						}
					}
				}, Activator.getDefault().getExecutorService());
			}

			if (modelNames == null) {
				// Placeholder until the future result is ready
				modelNames = Collections.emptyMap();
			}
		}

		return modelNames;
	}

	@Override
	public void indexChanged(DecoratorModelIndexEvent event) {
		modelNames = null;
		updateLabels();
	}

	protected void updateLabels() {
		fireLabelProviderChanged(new LabelProviderChangedEvent(this));
	}
}
