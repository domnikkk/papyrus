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

package org.eclipse.papyrus.uml.tools.tests.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.rules.ResourceSetFixture;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.tools.databinding.NamedElementValidator;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationOwner;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


/**
 * Tests the {@link NamedElementValidator} class.
 */
@PluginResource("resources/uml/operations.uml")
public class NamedElementValidatorTest extends AbstractPapyrusTest {

	private static final String DOIT = "doIt";

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	@Rule
	public final ResourceSetFixture model = new ResourceSetFixture();

	private Operation toBeNamed;

	private NamedElementValidator fixture;

	public NamedElementValidatorTest() {
		super();
	}

	/**
	 * Tests that the validator detects indistinguishable elements.
	 */
	@Test
	public void testNameClash() {
		Class foo = toBeNamed.getClass_();

		// Create another just like it with the target name
		Operation copy = EcoreUtil.copy(toBeNamed);
		copy.setName("doIt");
		foo.getOwnedOperations().add(copy);

		// The validator detects it
		assertValidationFails();
	}

	/**
	 * Tests that the validator correctly discriminates overloaded operations with different signatures.
	 */
	@Test
	public void testElementOfDifferentKindDoesNotClash() {
		Class foo = toBeNamed.getClass_();

		// Create an attribute named "doIt"
		foo.createOwnedAttribute(DOIT, getPrimitiveType("Boolean"));

		assertValidationPasses();
	}

	/**
	 * Tests that the validator correctly discriminates overloaded operations with different signatures.
	 */
	@Test
	public void testOverloadDoesNotClash() {
		assertValidationPasses();
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() {
		toBeNamed = getOperation("nameMe");
		houseKeeper.setField("fixture", new NamedElementValidator(toBeNamed));
	}

	Operation getOperation(String name) {
		return ((OperationOwner)model.getModel().getOwnedType("Foo")).getOwnedOperation(name, null, null);
	}

	Type getPrimitiveType(String name) {
		return (Type)model.getModel().getMember(name, false, UMLPackage.Literals.TYPE);
	}

	void assertValidationFails() {
		IStatus status = fixture.validate(DOIT);
		assertThat(status.getSeverity(), not(IStatus.OK));
	}

	void assertValidationPasses() {
		IStatus status = fixture.validate(DOIT);
		assertThat(status.getSeverity(), is(IStatus.OK));
	}
}
