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
package org.eclipse.papyrus.uml.textedit.port.tests.suites;


import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.textedit.port.xtext.ui.contribution.PortXtextDirectEditorConfiguration;
import org.eclipse.papyrus.uml.textedit.tests.AbstractGrammarTest;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@PluginResource("/model/xtextPortModel.uml")
public class PortGrammarTests extends AbstractGrammarTest<Property> {

	protected PrimitiveType type2; /* QName = model::Package1::type2 */

	protected DataType type1; /* QName = model::type1 */

	protected Model rootModel;

	protected Port testedPort;

	@Before
	public void loadTestModel() {
		type2 = findElement(PrimitiveType.class, "type2");
		type1 = findElement(DataType.class, "type1");
		rootModel = findElement(Model.class, "model");

		Component component = (Component) rootModel.createPackagedElement("Component1", UMLPackage.eINSTANCE.getComponent());
		testedPort = (Port) component.createOwnedAttribute("p1", null, UMLPackage.eINSTANCE.getPort());
	}

	@Test
	public void testParser() throws Exception {
		tester.parseText(testedPort, "~/p1: <Undefined>");
		Assert.assertTrue(testedPort.isDerived());
		Assert.assertEquals(VisibilityKind.PACKAGE_LITERAL, testedPort.getVisibility());

		tester.parseText(testedPort, "p2");
		Assert.assertTrue(!testedPort.isDerived()); /* Derived is mandatory, so typing "p2" means it shouldn't be derived anymore */
		Assert.assertEquals(VisibilityKind.PACKAGE_LITERAL, testedPort.getVisibility()); /* Visibility is optional; not typing it means it shouldn't change */
		Assert.assertEquals("p2", testedPort.getName());

		tester.parseText(testedPort, "p2: ~<Undefined>");
		Assert.assertTrue(testedPort.isConjugated());
	}

	@Test
	public void testInitialText() {
		Assert.assertEquals("+ p1 : <Undefined> {unique}", tester.getInitialText(testedPort));

		testedPort.setIsUnique(false);
		Assert.assertEquals("+ p1 : <Undefined>", tester.getInitialText(testedPort));

		testedPort.setIsDerived(true);
		testedPort.setVisibility(VisibilityKind.PROTECTED_LITERAL);
		testedPort.setType(type1);
		Assert.assertEquals("# /p1 : model::type1", tester.getInitialText(testedPort));

		testedPort.setIsConjugated(true);
		Assert.assertEquals("# /p1 : ~model::type1", tester.getInitialText(testedPort));
	}

	@Override
	public DefaultXtextDirectEditorConfiguration getEditor() {
		return new PortXtextDirectEditorConfiguration();
	}
}
