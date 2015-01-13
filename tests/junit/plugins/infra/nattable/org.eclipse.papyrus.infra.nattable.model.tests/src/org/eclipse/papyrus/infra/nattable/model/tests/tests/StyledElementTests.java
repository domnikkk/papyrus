/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.model.tests.tests;


import org.eclipse.papyrus.infra.nattable.model.nattable.NattableFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class provides some test to verify that NOT generated code has not been destroyed
 *
 * @author vl222926
 *
 */
public class StyledElementTests extends AbstractPapyrusTest {

	@Test
	public void test_StyleCreation() {
		Table table = NattableFactory.eINSTANCE.createTable();
		Style style = table.createStyle(NattablestylePackage.eINSTANCE.getIntValueStyle());
		Assert.assertNotNull(style);
		Assert.assertTrue(style instanceof IntValueStyle);
		Assert.assertTrue(table.getStyles().contains(style));
	}

	@Test
	public void test_getNamedStyle() {
		Table table = NattableFactory.eINSTANCE.createTable();
		Style style = table.createStyle(NattablestylePackage.eINSTANCE.getNamedStyle());
		Assert.assertNotNull(style);
		Assert.assertTrue(style instanceof NamedStyle);
		String styleName = "myNiceStyle";
		((NamedStyle) style).setName(styleName);
		Style value = table.getNamedStyle(NattablestylePackage.eINSTANCE.getNamedStyle(), styleName);
		Assert.assertTrue(value == style);

	}

	@Test
	public void test_getStyle() {
		Table table = NattableFactory.eINSTANCE.createTable();
		Style style = table.createStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle());
		Assert.assertNotNull(style);
		Assert.assertTrue(style instanceof BooleanValueStyle);
		Assert.assertTrue(table.getStyles().contains(style));
		Assert.assertTrue(style == table.getStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle()));

	}
}
