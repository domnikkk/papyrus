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

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * Label decorator for packages to indicate availability of externalized profile applications, decorator models loaded for a package, etc.
 */
public class DecoratorModelLabelDecorator extends BaseLabelProvider implements ILightweightLabelDecorator {

	public DecoratorModelLabelDecorator() {
		super();
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		EObject eObject = EMFHelper.getEObject(element);

		if ((eObject instanceof Package) && (eObject.eResource() != null)) {
			decoratePackage((Package) eObject, decoration);
		} else if (element instanceof IFile) {
			decorateFile((IFile) element, decoration);
		} else if (element instanceof IPapyrusFile) {
			decorateFile((IPapyrusFile) element, decoration);
		}
	}

	private void decorateFile(IFile file, IDecoration decoration) {
		IContentType type = IDE.getContentType(file);
		if ((type != null) && type.isKindOf(DecoratorModelUtils.DECORATOR_MODEL_CONTENT_TYPE)) {
			addOverlay(decoration);
		}
	}

	private void decorateFile(IPapyrusFile file, IDecoration decoration) {
		for (IResource resource : file.getAssociatedResources()) {
			if (resource.getType() == IResource.FILE) {
				IContentType type = IDE.getContentType((IFile) resource);
				if ((type != null) && type.isKindOf(DecoratorModelUtils.DECORATOR_MODEL_CONTENT_TYPE)) {
					addOverlay(decoration);
					break;
				}
			}
		}
	}

	private void addOverlay(IDecoration decoration) {
		decoration.addOverlay(Activator.getDefault().getIcon("full/ovr16/profileApps.png"), IDecoration.TOP_RIGHT); //$NON-NLS-1$
	}

	private void decoratePackage(Package package_, IDecoration decoration) {
		// Root packages only, because the presentation of decorator models to display is recursive over controlled units.
		// Also exclude any packages that are decorated by the main model if the main model is a decorator model
		if ((package_.eContainer() == null) && !isUserOpenedDecoratorModel(package_)) {
			if (!decoratePackageIcon(package_, decoration)) {
				// Short-circuit the rest of the decoration of this package because we'll be revisiting it
				return;
			}
		}

		decoratePackageText(package_, decoration);
	}

	/**
	 * Is the given package the root of a model that is decorated by a decorator model opened as the main UML model of the model-set?
	 */
	private static boolean isUserOpenedDecoratorModel(Package package_) {
		boolean result = false;

		ResourceSet rset = EMFHelper.getResourceSet(package_);
		if (rset instanceof ModelSet) {
			UmlModel uml = (UmlModel) ((ModelSet) rset).getModel(UmlModel.MODEL_ID);
			if (uml != null) {
				Resource main = uml.getResource();
				if (DecoratorModelUtils.isDecoratorModel(main)) {
					if (DecoratorModelUtils.isDecoratorModelFor(main, package_.eResource())) {
						result = true;
					} else {
						for (Package next : DecoratorModelUtils.getLoadedSubUnitPackages(package_)) {
							if (DecoratorModelUtils.isDecoratorModelFor(main, next.eResource())) {
								result = true;
								break;
							}
						}
					}
				}
			}
		}

		return result;
	}

	private boolean decoratePackageIcon(Package package_, IDecoration decoration) {
		boolean result = false;

		ListenableFuture<Boolean> hasUnloadedDecoratorModels = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(package_, true);
		if (hasUnloadedDecoratorModels.isDone()) {
			result = true;
			if (Futures.getUnchecked(hasUnloadedDecoratorModels)) {
				addOverlay(decoration);
			}
			result = true;
		} else {
			hasUnloadedDecoratorModels.addListener(postUpdate(package_), Activator.getDefault().getExecutorService());
		}

		return result;
	}

	private void decoratePackageText(Package package_, IDecoration decoration) {
		// Decorate packages with a suffix listing the loaded profile application model names
		Set<Package> profileApplicationModels = null;
		for (ProfileApplication profileApplication : DecoratorModelUtils.getDecoratorModelProfileApplications(package_)) {
			if (profileApplicationModels == null) {
				profileApplicationModels = Sets.newLinkedHashSet();
			}
			profileApplicationModels.add((Package) EcoreUtil.getRootContainer(profileApplication));
		}
		if (profileApplicationModels != null) {
			StringBuilder suffix = new StringBuilder();

			for (Package next : profileApplicationModels) {
				if (suffix.length() == 0) {
					suffix.append(" ("); //$NON-NLS-1$
				} else {
					suffix.append(", "); //$NON-NLS-1$
				}

				String modelName = next.getName();
				if (modelName == null) {
					modelName = next.eResource().getURI().trimFileExtension().lastSegment();
				}
				suffix.append(modelName);
			}

			if (suffix.length() > 0) {
				suffix.append(")"); //$NON-NLS-1$
			}

			if (suffix.length() > 0) {
				decoration.addSuffix(suffix.toString());
			}
		}
	}

	private Runnable postUpdate(final Object element) {
		return new Runnable() {

			@Override
			public void run() {
				fireLabelProviderChanged(new LabelProviderChangedEvent(DecoratorModelLabelDecorator.this, element));
			}
		};
	}
}
