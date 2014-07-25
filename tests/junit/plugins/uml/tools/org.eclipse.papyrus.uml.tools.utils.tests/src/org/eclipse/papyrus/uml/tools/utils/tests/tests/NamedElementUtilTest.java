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

package org.eclipse.papyrus.uml.tools.utils.tests.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


/**
 * Tests for the {@link NamedElementUtil} API.
 */
public class NamedElementUtilTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	private Model testModel;

	private Class class_;

	private Association association;

	private AssociationClass associationClass;

	private Dependency dependency;

	private ControlFlow controlFlow;

	private Transition transition;

	private Message message;
	
	private GeneralOrdering generalOrdering;

	public NamedElementUtilTest() {
		super();
	}

	@Test
	public void testIsAutoNamed() {
		assertThat(NamedElementUtil.isAutoNamed(testModel), is(true));
		assertThat(NamedElementUtil.isAutoNamed(class_), is(true));
		assertThat(NamedElementUtil.isAutoNamed(association), is(false));
		assertThat(NamedElementUtil.isAutoNamed(associationClass), is(true));
		assertThat(NamedElementUtil.isAutoNamed(dependency), is(false));
		assertThat(NamedElementUtil.isAutoNamed(controlFlow), is(false));
		assertThat(NamedElementUtil.isAutoNamed(transition), is(false));
		assertThat(NamedElementUtil.isAutoNamed(message), is(true));
		assertThat(NamedElementUtil.isAutoNamed(generalOrdering), is(false));
	}

	@Test
	public void testGetDefaultNameWithIncrement() {
		assertThat(testModel.getName(), is("Model1"));
		assertThat(class_.getName(), is("Class1"));
		assertThat(association.getName(), nullValue());
		assertThat(associationClass.getName(), is("AssociationClass1"));
		assertThat(dependency.getName(), nullValue());
		assertThat(controlFlow.getName(), nullValue());
		assertThat(transition.getName(), nullValue());
		assertThat(message.getName(), is("Message1"));
		assertThat(generalOrdering.getName(), nullValue());
	}

	@Test
	public void testExistingElementHavingNameNotRenamed() {
		Type foo = testModel.getOwnedType("Foo");
		assertThat(foo, notNullValue());
		assertThat(autoName(foo).getName(), is("Foo"));
	}

	@Test
	public void testAutoNameIncrement() {
		Type foo = testModel.getOwnedType("Foo");
		assertThat(foo, notNullValue());
		foo.unsetName();
		assertThat(autoName(foo).getName(), is("Class2"));
	}

	//
	// Test framework
	//

	@Before
	public void createTestModel() {
		testModel = autoName(UMLFactory.eINSTANCE.createModel());
		class_ = autoName(testModel.createOwnedClass(null, false));
		association = autoName(class_.createAssociation(true, AggregationKind.NONE_LITERAL, "foo", 0, 1, testModel.createOwnedClass("Foo", false), false, AggregationKind.NONE_LITERAL, null, 0, LiteralUnlimitedNatural.UNLIMITED));
		associationClass = autoName((AssociationClass)testModel.createOwnedType(null, UMLPackage.Literals.ASSOCIATION_CLASS));
		dependency = autoName(class_.createDependency(associationClass));

		Activity activity = autoName((Activity)class_.createOwnedBehavior(null, UMLPackage.Literals.ACTIVITY));
		controlFlow = autoName((ControlFlow)activity.createEdge(null, UMLPackage.Literals.CONTROL_FLOW));

		StateMachine stateMachine = autoName((StateMachine)class_.createOwnedBehavior(null, UMLPackage.Literals.STATE_MACHINE));
		Region region = autoName(stateMachine.createRegion(null));
		transition = autoName(region.createTransition(null));

		Interaction interaction = autoName((Interaction)class_.createOwnedBehavior(null, UMLPackage.Literals.INTERACTION));
		message = autoName(interaction.createMessage(null));
		generalOrdering = autoName(interaction.createGeneralOrdering(null));
	}

	<N extends NamedElement> N autoName(N element) {
		Collection<?> siblings = (element.eContainer() != null) ? element.eContainer().eContents() : Collections.EMPTY_LIST;
		String name = NamedElementUtil.getDefaultNameWithIncrement(element, siblings);
		if(UML2Util.isEmpty(name)) {
			assertThat(NamedElementUtil.isAutoNamed(element), is(false));
		} else {
			element.setName(name);
		}
		return element;
	}
}
