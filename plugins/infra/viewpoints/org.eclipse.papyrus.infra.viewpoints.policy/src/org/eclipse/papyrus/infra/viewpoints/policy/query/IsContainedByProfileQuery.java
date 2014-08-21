/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger remi.schnekenburger@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.policy.query;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.constraints.constraints.JavaQuery;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;

/**
 * Query to check that an element is contained directly or indirectly by a profile
 *
 * @author Remi Schnekenburger
 */
public class IsContainedByProfileQuery implements JavaQuery {

	/**
	 * {@inheritDoc}
	 */
	public boolean match(Object selection) {
		EObject eObject = null;
		if (selection instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection) selection).getFirstElement();
			if (o instanceof EObject) {
				eObject = (EObject) o;
			}
		} else {
			// try to edapt into eobject
			eObject = EMFHelper.getEObject(selection);
		}

		return hasProfileInHierarchy(eObject);
	}

	protected boolean hasProfileInHierarchy(EObject eObject) {
		if (eObject == null) {
			return false;
		}
		if (isProfileMetaclass(eObject)) {
			return true;
		}

		// ask to its container recursively
		return hasProfileInHierarchy(eObject.eContainer());
	}

	protected boolean isProfileMetaclass(EObject eObject) {
		EClass eclass = eObject.eClass();
		if (eclass == null) {
			return false;
		}

		String eclassName = eclass.getName();
		if ("Profile".equals(eclassName)) {
			return true;
		}
		return false;

	}

}
