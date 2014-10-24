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

package org.eclipse.papyrus.uml.diagram.clazz.custom.parsers;

/**
 * The source end of InstanceSpecification link edge parser
 * 
 */

public class RoleInstanceSpecificationSourceLinkParser extends RoleInstanceSpecificationLinkParser {

	/**
	 * @see org.eclipse.papyrus.uml.diagram.clazz.custom.parsers.RoleInstanceSpecificationLinkParser#getClissifierMemberKind()
	 *
	 * @return
	 */
	@Override
	protected ClassifierMemberKind getClissifierMemberKind() {
		return ClassifierMemberKind.SOURCE;
	}
}
