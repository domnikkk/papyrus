/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.test.canonical;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.utils.classification.FailingTest;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DataTypeAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DataTypeOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.EnumerationEnumerationLiteralCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestChildLabel;
import org.junit.Test;

/**
 * The Class TestComponentDiagramChildNode.
 */

public class TestCompositeDiagramChildLabel extends TestChildLabel {

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeDiagramCommand();
	}

	@Override
	protected String getProjectName() {
		return ICompositeDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICompositeDiagramTestsConstants.FILE_NAME;
	}
	
	/**
	* Test to manage Property.
	*/
	@Test
	@FailingTest
	public void testToProperty() {
	testToManageTopNodeWithMask(UMLElementTypes.DataType_2068,UMLElementTypes.Property_3101, DataTypeAttributeCompartmentEditPart.VISUAL_ID,null);
	}
	/**
	* Test to manage Operation.
	*/
	@Test
	@FailingTest
	public void testToOperation() {
	testToManageTopNodeWithMask(UMLElementTypes.DataType_2068,UMLElementTypes.Operation_3102, DataTypeOperationCompartmentEditPart.VISUAL_ID,null);
	}
	/**
	* Test to manage EnumerationLiteral.
	*/
	@Test
	@FailingTest
	public void testToEnumerationLiteral() {
	testToManageTopNode(UMLElementTypes.Enumeration_2067,UMLElementTypes.EnumerationLiteral_3066, EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID,null);
	}

	
}
