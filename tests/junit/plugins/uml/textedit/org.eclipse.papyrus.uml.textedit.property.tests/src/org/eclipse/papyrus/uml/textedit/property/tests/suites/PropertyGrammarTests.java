/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.textedit.property.tests.suites;

import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.textedit.property.xtext.ui.contributions.PropertyXtextDirectEditorConfiguration;
import org.eclipse.papyrus.uml.textedit.tests.AbstractGrammarTest;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@PluginResource("/model/xtextPropertyModel.uml")
public class PropertyGrammarTests extends AbstractGrammarTest<Property> {

	protected PrimitiveType type2; /* QName = model::Package1::type2 */

	protected DataType type1; /* QName = model::type1 */

	protected Model rootModel;

	protected Property testedProperty;

	@Before
	public void loadTestModel() {
		type2 = findElement(PrimitiveType.class, "type2");
		type1 = findElement(DataType.class, "type1");
		rootModel = findElement(Model.class, "model");

		Component component = (Component) rootModel.createPackagedElement("Component1", UMLPackage.eINSTANCE.getComponent());
		testedProperty = component.createOwnedAttribute("p1", null);
	}

	@Test
	public void testParser() throws Exception {
		tester.parseText(testedProperty, "~/p1: <Undefined>");
		Assert.assertTrue(testedProperty.isDerived());
		Assert.assertEquals(VisibilityKind.PACKAGE_LITERAL, testedProperty.getVisibility());

		tester.parseText(testedProperty, "p2");
		Assert.assertTrue(!testedProperty.isDerived()); /* Derived is mandatory, so typing "p2" means it shouldn't be derived anymore */
		Assert.assertEquals(VisibilityKind.PACKAGE_LITERAL, testedProperty.getVisibility()); /* Visibility is optional; not typing it means it shouldn't change */
		Assert.assertEquals("p2", testedProperty.getName());
	}

	@Test
	public void testInitialText() {
		Assert.assertEquals("+ p1 : <Undefined> {unique}", tester.getInitialText(testedProperty));

		testedProperty.setIsUnique(false);
		Assert.assertEquals("+ p1 : <Undefined>", tester.getInitialText(testedProperty));

		testedProperty.setIsDerived(true);
		testedProperty.setVisibility(VisibilityKind.PROTECTED_LITERAL);
		testedProperty.setType(type1);
		Assert.assertEquals("# /p1 : model::type1", tester.getInitialText(testedProperty));
	}

	@Override
	public DefaultXtextDirectEditorConfiguration getEditor() {
		return new PropertyXtextDirectEditorConfiguration();
	}
}
