/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC)  gabriel.pascual@all4tec.net -  bug 382954
 */
package org.eclipse.papyrus.uml.diagram.clazz.custom.policies;

import java.util.List;

import org.eclipse.papyrus.uml.diagram.clazz.custom.parsers.EndMemberKind;
import org.eclipse.uml2.uml.Property;

/**
 * this a listener to refresh the source role of the instance specification
 *
 */
public class ISRoleSourceDisplayEditPolicy extends InstanceSpecificationRoleDisplayEditPolicy {

	@Override
	protected Property getprefvalue(List<Property> array) {
		return array.get(EndMemberKind.SOURCE.getIndex());
	}

}
