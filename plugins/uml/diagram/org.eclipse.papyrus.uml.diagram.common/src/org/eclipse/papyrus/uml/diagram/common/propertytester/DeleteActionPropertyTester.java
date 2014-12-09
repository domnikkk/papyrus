/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.propertytester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.infra.gmfdiag.menu.utils.DeleteActionUtil;

/**
 * Property tester to enable different delete actions in Diagram.
 * 
 * @author Gabriel Pascual
 *
 */
public class DeleteActionPropertyTester extends PropertyTester {

	/** The Constant SEMANTIC_DELETION_PROPERTY. */
	private static final String SEMANTIC_DELETION_PROPERTY = "isSemanticDeletion"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	public DeleteActionPropertyTester() {
		super();
	}

	/**
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 *
	 * @param receiver
	 * @param property
	 * @param args
	 * @param expectedValue
	 * @return
	 */
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (SEMANTIC_DELETION_PROPERTY.equals(property)) {
			return expectedValue.equals(DeleteActionUtil.isSemanticDeletion((IGraphicalEditPart) receiver));
		}

		return false;
	}
}
