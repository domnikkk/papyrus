/*****************************************************************************
 * Copyright (c) 2011 ATOS.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		Olivier Mélois (ATOS) olivier.melois@atos.net - Bug 376703 
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.compartment.descriptors;

import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.papyrus.sysml.portandflows.FlowProperty;
import org.eclipse.papyrus.uml.service.types.utils.ElementUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Property;


public class PartCompartmentDescriptor implements IPropertyCompartmentDescriptor {

	/**
	 * {@inheritDoc}
	 */
	public String getType() {
		return SysMLGraphicalTypes.COMPARTMENT_SYSML_PART_AS_LIST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isCompatibleWithProperty(Property property) {
		return (property.getAggregation() == AggregationKind.COMPOSITE_LITERAL);
	}
}
