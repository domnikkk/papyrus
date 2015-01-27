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
package org.eclipse.papyrus.sysml14.deprecatedelements;

import org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowPortImpl;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "FlowPort" stereotype see Requirement DerivedProperties Req0010 
 *
 */
public class CustomFlowPortImpl extends FlowPortImpl implements FlowPort {

	@Override
	public boolean isAtomic() {
		// The FlowPort is Atomic if it is not typed by a FlowSpecification
		Boolean isAtomic = true;
		FlowSpecification flowSpec = null;

		if (getBase_Port() != null) {
			// Find FlowPort type
			Type type = getBase_Port().getType();
			if ((type != null) && (type instanceof Interface)) {
				flowSpec = UMLUtil.getStereotypeApplication(type, FlowSpecification.class);
			}

			if (flowSpec != null) {
				isAtomic = false;
			}
		}
		return isAtomic;
	}



	@Override
	public void setIsAtomic(boolean newIsAtomic) {
		// TODO: implement this method to set the 'Is Atomic' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();
	}

}
