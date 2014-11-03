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

package org.eclipse.papyrus.uml.decoratormodel.internal.properties.constraints;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.constraints.constraints.AbstractConstraint;
import org.eclipse.papyrus.infra.constraints.constraints.Constraint;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.properties.Activator;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Iterables;
import com.google.common.collect.SetMultimap;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * A properties constraint matching packages that have loaded or unloaded decorator models.
 */
public class HasExternalizedProfileApplicationsConstraint extends AbstractConstraint {

	/**
	 * Initializes me.
	 */
	public HasExternalizedProfileApplicationsConstraint() {
		super();
	}

	@Override
	protected boolean match(Object selection) {
		boolean result = false;

		EObject object = EMFHelper.getEObject(selection);

		if (object instanceof Package) {
			Package package_ = (Package) object;

			try {
				result = !Iterables.isEmpty(DecoratorModelUtils.getDecoratorModelProfileApplications(package_));
				if (!result) {
					ListenableFuture<SetMultimap<URI, URI>> appliedProfiles = DecoratorModelIndex.getInstance().getAllAppliedProfilesAsync(EcoreUtil.getURI(package_));

					// Optimistic enablement for responsiveness
					result = !appliedProfiles.isDone() || !Futures.get(appliedProfiles, CoreException.class).isEmpty();
				}
			} catch (CoreException e) {
				// Oh, well. I guess we won't show this property
				Activator.getDefault().getLog().log(e.getStatus());
			}
		}

		return result;
	}

	@Override
	protected boolean equivalent(Constraint constraint) {
		if (this == constraint) {
			return true;
		}
		return constraint instanceof HasExternalizedProfileApplicationsConstraint;
	}

	@Override
	public String toString() {
		return "HasExternalizedProfileApplicationsConstraint"; //$NON-NLS-1$
	}
}
