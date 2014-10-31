/*******************************************************************************
 * Copyright (c) 2011, 2014 AtoS, CEA LIST and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Anass RADOUANI (AtoS) - test property to enable or disable Export All menu item
 *    Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 440754
 *******************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.export.propertytester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.gmfdiag.export.utils.SelectionHelper;

/**
 * Property tester for Export all diagrams feature.
 */
public class ExportableSelectionPropertyTester extends PropertyTester {

	/** The Constant EXPORTABLE_MODEL_PROPERTY. */
	private static final String EXPORTABLE_MODEL_PROPERTY = "isExportableModel"; //$NON-NLS-1$

	/**
	 * Test.
	 *
	 * @param receiver
	 *            the receiver
	 * @param property
	 *            the property
	 * @param args
	 *            the args
	 * @param expectedValue
	 *            the expected value
	 * @return true, if successful
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		boolean propertyTest = false;
		if (EXPORTABLE_MODEL_PROPERTY.equals(property)) {
			if (receiver instanceof IStructuredSelection) {
				propertyTest = SelectionHelper.isExportableModel((IStructuredSelection) receiver);
			}
		}
		return propertyTest;
	}
}
