/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml14.modelelements;

import java.util.Iterator;

import org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "View" stereotype see Requirement DerivedProperties Req0010 
 *
 */
public class CustomViewImpl extends ViewImpl implements View {


	@Override
	public ViewPoint basicGetViewPoint() {
		// ViewPoint is related to View via a Conform dependency
		ViewPoint viewPoint = null;
		Conform conform = null;

		if (getBase_Package() != null) {
			// Find Conform link
			Iterator<Dependency> itDep = getBase_Package().getClientDependencies().iterator();
			while (itDep.hasNext() && (conform == null)) {
				Dependency currentDependency = itDep.next();
				conform = UMLUtil.getStereotypeApplication(currentDependency, Conform.class);
			}

			// Find ViewPoint
			if (conform != null) {
				Iterator<Element> itElt = conform.getBase_Dependency().getTargets().iterator();
				while (itElt.hasNext()) {
					Element currentElt = itElt.next();
					viewPoint = UMLUtil.getStereotypeApplication(currentElt, ViewPoint.class);
				}
			}
		}
		return viewPoint;
	}


	@Override
	public void setViewPoint(ViewPoint newViewPoint) {
		// TODO: implement this method to set the 'View Point' reference
		// Ensure that you remove @generated or mark it @generated NOT

		// The exception makes the model opening to fail...
		// throw new UnsupportedOperationException();
	}

} 
