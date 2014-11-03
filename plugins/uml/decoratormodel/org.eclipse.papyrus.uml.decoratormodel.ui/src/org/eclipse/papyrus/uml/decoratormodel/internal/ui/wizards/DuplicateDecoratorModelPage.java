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

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers.ProfileResourceLabelProvider;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

/**
 * @author damus
 *
 */
public class DuplicateDecoratorModelPage extends AbstractNewDecoratorModelPage<Object, URI> {
	private final ResourceSet resourceSet;

	public DuplicateDecoratorModelPage(ResourceSet resourceSet) {
		super("duplicate", Messages.DuplicateDecoratorModelPage_0, null, URI.class); //$NON-NLS-1$

		this.resourceSet = resourceSet;

		setMessage(Messages.DuplicateDecoratorModelPage_1);
	}

	@Override
	protected void checkInitialSelections(CheckboxTableViewer table, Collection<URI> initialSelections) {
		table.setAllChecked(true);
	}

	@Override
	protected void browseResource() {
		browseResource(Messages.DuplicateDecoratorModelPage_2, Messages.DuplicateDecoratorModelPage_3);
	}

	@Override
	protected IBaseLabelProvider createProfilesLabelProvider() {
		return new DelegatingStyledCellLabelProvider(new ProfileResourceLabelProvider(resourceSet));
	}

	@Override
	protected IStructuredContentProvider createProfilesContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public Object[] getElements(Object inputElement) {
				Set<URI> result = Sets.newLinkedHashSet();

				if (inputElement instanceof Resource) {
					Resource decoratorModelResource = (Resource) inputElement;
					for (TreeIterator<EObject> iter = EcoreUtil.getAllContents(getRoot(decoratorModelResource).getNestedPackages()); iter.hasNext();) {
						EObject next = iter.next();
						if (next instanceof ProfileApplication) {
							EObject profile = (EObject) next.eGet(UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, false);
							if (profile != null) {
								// Add the URI of the resource containing the applied profile
								result.add(EcoreUtil.getURI(profile).trimFragment());
							}
							iter.prune();
						} else if (!(next instanceof Package)) {
							iter.prune();
						}
					}
				} else if (inputElement instanceof URI) {
					URI decoratorModelURI = (URI) inputElement;
					try {
						for (URI next : DecoratorModelIndex.getInstance().getAppliedProfilesByPackage(decoratorModelURI).values()) {
							// Add the URI of the resource containing the applied profile
							result.add(next.trimFragment());
						}
					} catch (CoreException e) {
						StatusManager.getManager().handle(e.getStatus(), StatusManager.SHOW | StatusManager.LOG);
					}
				}

				return result.toArray();
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

	Package getRoot(Resource resource) {
		return Iterables.getFirst(Iterables.filter(resource.getContents(), Package.class), null);
	}

	@Override
	protected String validateExistingFile(IFile file) {
		return NLS.bind(Messages.DuplicateDecoratorModelPage_4, file.getFullPath());
	}

	@Override
	protected String defaultModelName(Object input) {
		String result = null;
		if (input instanceof Resource) {
			Resource resource = (Resource) input;
			result = NLS.bind(Messages.DuplicateDecoratorModelPage_5, getRoot(resource).getName());
		} else {
			try {
				result = NLS.bind(Messages.DuplicateDecoratorModelPage_5, DecoratorModelIndex.getInstance().getDecoratorModelName((URI) input));
			} catch (CoreException e) {
				Activator.getDefault().getLog().log(e.getStatus());
				result = Messages.DuplicateDecoratorModelPage_7;
			}
		}

		return result;
	}

	@Override
	protected String defaultResource(Object input) {
		URI result;

		if (input instanceof Resource) {
			Resource resource = (Resource) input;
			result = resource.getURI();
		} else {
			result = (URI) input;
		}

		String baseName = result.lastSegment();
		String ext = ""; //$NON-NLS-1$
		int dot = baseName.indexOf('.');

		if (dot >= 0) {
			ext = baseName.substring(dot);
			baseName = baseName.substring(0, dot);
		}

		result = result.trimSegments(1).appendSegment(NLS.bind(Messages.DuplicateDecoratorModelPage_6, baseName, ext));

		return result.toPlatformString(true);
	}
}
