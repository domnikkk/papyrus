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
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.rules.ResourceSetFixture;
import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test cases for the {@link UMLUtil} class.
 */
public class UMLUtilTest extends AbstractPapyrusTest {
	static final String BLOCK = "SysML::Blocks::Block";
	static final String CONSTRAINT_BLOCK = "SysML::Constraints::ConstraintBlock";

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	@Rule
	public final ResourceSetFixture model = new ResourceSetFixture();

	private Class block1;

	private Class block2;

	private Class constraintblock1;

	private Stereotype block;

	private Stereotype constraintBlock;

	public UMLUtilTest() {
		super();
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetApplicableStereotype_strict_notApplicable() {
		assertThat(UMLUtil.getApplicableStereotype(model.getModel(), BLOCK, true), nullValue());
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetApplicableStereotype_strict_applicable() {
		assertThat(UMLUtil.getApplicableStereotype(block1, BLOCK, true), is(block));
		assertThat(UMLUtil.getApplicableStereotype(constraintblock1, CONSTRAINT_BLOCK, true), is(constraintBlock));
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetApplicableStereotype_notStrict_notApplicable() {
		assertThat(UMLUtil.getApplicableStereotype(model.getModel(), BLOCK, false), nullValue());
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetApplicableStereotype_notStrict_applicable() {
		assertThat(UMLUtil.getApplicableStereotype(block1, BLOCK, false), is(block));
		assertThat(UMLUtil.getApplicableStereotype(block1, CONSTRAINT_BLOCK, false), is(constraintBlock));
		assertThat(UMLUtil.getApplicableStereotype(constraintblock1, BLOCK, false), is(block));
		assertThat(UMLUtil.getApplicableStereotype(constraintblock1, CONSTRAINT_BLOCK, false), is(constraintBlock));
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetAppliedSubstereotype_notApplied() {
		assertThat(UMLUtil.getAppliedSubstereotype(model.getModel(), block), nullValue());
		assertThat(UMLUtil.getAppliedSubstereotype(block2, constraintBlock), nullValue());
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetAppliedSubstereotype_applied() {
		assertThat(UMLUtil.getAppliedSubstereotype(block2, block), is(block));
		assertThat(UMLUtil.getAppliedSubstereotype(constraintblock1, constraintBlock), is(constraintBlock));
		assertThat(UMLUtil.getAppliedSubstereotype(constraintblock1, block), is(constraintBlock));
	}

	@Test
	@PluginResource("/resources/substereotypes.uml")
	public void testGetAppliedSuperstereotype() {
		assertThat(UMLUtil.getAppliedSuperstereotype(block2, BLOCK), is(block));
		assertThat(UMLUtil.getAppliedSuperstereotype(block2, CONSTRAINT_BLOCK), nullValue());
		assertThat(UMLUtil.getAppliedSuperstereotype(constraintblock1, BLOCK), is(block));
		assertThat(UMLUtil.getAppliedSuperstereotype(constraintblock1, CONSTRAINT_BLOCK), is(constraintBlock));
	}

	//
	// Test framework
	//

	@Before
	public void setupModel() {
		block1 = (Class) model.getModel().getOwnedType("Block1");
		block2 = (Class) model.getModel().getOwnedType("Block2");
		constraintblock1 = (Class) model.getModel().getOwnedType("ConstraintBlock1");

		block = model.getModel().getAppliedProfile("SysML::Blocks").getOwnedStereotype("Block");
		constraintBlock = model.getModel().getAppliedProfile("SysML::Constraints").getOwnedStereotype("ConstraintBlock");
	}
}
