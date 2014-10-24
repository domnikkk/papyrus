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
package org.eclipse.papyrus.uml.textedit.parameter.tests.suites;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.ui.contributions.ParameterXtextDirectEditorConfiguration;
import org.eclipse.papyrus.uml.textedit.tests.AbstractGrammarTest;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.LiteralReal;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@PluginResource("/model/xtextParameterModel.uml")
public class ParameterGrammarTests extends AbstractGrammarTest<Parameter> {

	protected PrimitiveType type2; /* QName = model::Package1::type2 */

	protected DataType type1; /* QName = model::type1 */

	protected Model rootModel;

	protected Parameter testedParameter;

	@Before
	public void loadTestModel() {
		type2 = findElement(PrimitiveType.class, "type2");
		type1 = findElement(DataType.class, "type1");
		rootModel = findElement(Model.class, "model");

		Component component = (Component) rootModel.createPackagedElement("Component1", UMLPackage.eINSTANCE.getComponent());
		Operation operation = component.createOwnedOperation("op1", new BasicEList<String>(), new BasicEList<Type>());
		testedParameter = operation.createOwnedParameter("p1", null);
	}

	@Test
	public void testParser() throws Exception {
		tester.parseText(testedParameter, "~in p1: <Undefined>");
		Assert.assertEquals(ParameterDirectionKind.IN_LITERAL, testedParameter.getDirection());
		Assert.assertEquals(VisibilityKind.PACKAGE_LITERAL, testedParameter.getVisibility());

		tester.parseText(testedParameter, "p2");
		Assert.assertEquals(ParameterDirectionKind.IN_LITERAL, testedParameter.getDirection()); // Direction is optional; should not change
		Assert.assertEquals(VisibilityKind.PACKAGE_LITERAL, testedParameter.getVisibility()); // Visibility is optional; should not change
		Assert.assertEquals("p2", testedParameter.getName());

		tester.parseText(testedParameter, "p2: model::type1");
		Assert.assertTrue(testedParameter.getType() == type1);

		tester.parseText(testedParameter, "p2 {exception, ordered, stream, unique}");
		Assert.assertTrue(testedParameter.isException());
		Assert.assertTrue(testedParameter.isOrdered());
		Assert.assertTrue(testedParameter.isStream());
		Assert.assertTrue(testedParameter.isUnique());

		tester.parseText(testedParameter, "p2 {}");
		Assert.assertFalse(testedParameter.isException());
		Assert.assertFalse(testedParameter.isOrdered());
		Assert.assertFalse(testedParameter.isStream());
		Assert.assertFalse(testedParameter.isUnique());

		tester.parseText(testedParameter, "p2 = \"Hello\"");
		Assert.assertNotNull(testedParameter.getDefaultValue());
		Assert.assertTrue(testedParameter.getDefaultValue() instanceof LiteralString);
		Assert.assertEquals("Hello", ((LiteralString) testedParameter.getDefaultValue()).getValue());
	}

	@Test
	public void testInitialText() {
		Assert.assertEquals("+ in p1 : <Undefined> {unique}{effect: create}", tester.getInitialText(testedParameter));

		testedParameter.setIsUnique(false);
		Assert.assertEquals("+ in p1 : <Undefined> {effect: create}", tester.getInitialText(testedParameter));

		testedParameter.setIsStream(true);
		testedParameter.setIsOrdered(true);
		testedParameter.setVisibility(VisibilityKind.PROTECTED_LITERAL);
		testedParameter.setType(type1);
		testedParameter.setEffect(ParameterEffectKind.DELETE_LITERAL);
		testedParameter.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		Assert.assertEquals("# return p1 : model::type1 {ordered, stream}{effect: delete}", tester.getInitialText(testedParameter));
	}

	@Test
	public void testDefaultValues() throws Exception {
		testedParameter.setIsUnique(false);

		LiteralReal defaultRealValue = UMLFactory.eINSTANCE.createLiteralReal();
		defaultRealValue.setValue(123.54);
		testedParameter.setDefaultValue(defaultRealValue);

		Assert.assertEquals("+ in p1 : <Undefined> {effect: create} = 123.54", tester.getInitialText(testedParameter));
		tester.parseText(testedParameter, "p1 = .2");
		Assert.assertEquals("The instance of ValueSpecification should not change when compatible types are used", defaultRealValue, testedParameter.getDefaultValue());
		Assert.assertEquals(.2, defaultRealValue.getValue(), 0.001);
	}

	@Override
	public DefaultXtextDirectEditorConfiguration getEditor() {
		return new ParameterXtextDirectEditorConfiguration();
	}
}
