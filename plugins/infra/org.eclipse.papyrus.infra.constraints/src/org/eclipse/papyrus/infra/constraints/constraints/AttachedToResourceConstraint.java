/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.constraints.constraints;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;

/**
 * A properties view constraint that matches objects that are attached to some resource.
 */
public class AttachedToResourceConstraint extends AbstractConstraint {

	/**
	 * Initializes me.
	 */
	public AttachedToResourceConstraint() {
		super();
	}

	@Override
	protected boolean match(Object selection) {
		boolean result = false;

		EObject object = EMFHelper.getEObject(selection);

		if (object != null) {
			result = object.eResource() != null;
		}

		return result;
	}

	@Override
	protected boolean equivalent(Constraint constraint) {
		if (this == constraint) {
			return true;
		}
		return constraint instanceof AttachedToResourceConstraint;
	}

	@Override
	public String toString() {
		return "AttachedToResourceConstraint"; //$NON-NLS-1$
	}
}
