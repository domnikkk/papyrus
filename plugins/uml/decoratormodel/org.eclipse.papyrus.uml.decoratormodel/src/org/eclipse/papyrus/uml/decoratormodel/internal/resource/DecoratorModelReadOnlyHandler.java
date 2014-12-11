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

package org.eclipse.papyrus.uml.decoratormodel.internal.resource;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.core.resource.AbstractReadOnlyHandler;
import org.eclipse.papyrus.infra.core.resource.IReadOnlyHandler2;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

/**
 * Read-only handler for profile application resources used by the current model.
 */
public class DecoratorModelReadOnlyHandler extends AbstractReadOnlyHandler {

	public DecoratorModelReadOnlyHandler(EditingDomain editingDomain) {
		super(editingDomain);
	}

	@Override
	public Optional<Boolean> anyReadOnly(Set<ReadOnlyAxis> axes, URI[] uris) {
		// mine is a discretionary read-only policy
		if (axes.contains(ReadOnlyAxis.DISCRETION)) {
			EditingDomain domain = getEditingDomain();
			ResourceSet rset = (domain == null) ? null : domain.getResourceSet();
			if (rset instanceof ModelSet) {
				Set<URI> userModels = Sets.newHashSet();

				for (URI next : uris) {
					Resource resource = rset.getResource(next.trimFragment(), false);
					if ((resource != null) && resource.isLoaded() && DecoratorModelUtils.isDecoratorModel(resource)) {
						userModels.addAll(DecoratorModelUtils.getUserModelResources(resource));
					}
				}

				if (userModels.isEmpty()) {
					// An empty profile applications resource is not read-only; it's waiting for us to add stuff to it!
					return Optional.of(false);
				} else {
					// This resource's read-only status is the same as the resources for which it provides profile applications
					IReadOnlyHandler2 manager = ((ModelSet) rset).getReadOnlyHandler();
					if (manager != null) {
						return manager.anyReadOnly(ReadOnlyAxis.discretionAxes(), Iterables.toArray(userModels, URI.class));
					}
				}
			}
		}

		return Optional.absent();
	}

	@Override
	public Optional<Boolean> makeWritable(Set<ReadOnlyAxis> axes, URI[] uris) {
		// I never make anything writable; my job is to make sure that resources don't appear read-only when they shouldn't
		return Optional.absent();
	}

}
