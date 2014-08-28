/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.test.canonical;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.InvalidTest;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestLinkOwnedBySource;
import org.junit.Test;

/**
 * The Class TestCompositeDiagramLinkOwnedBySource use to test link that are contained by the owner of the target and the source.
 */
public class TestCompositeDiagramLinkOwnedBySource extends TestLinkOwnedBySource {
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getDiagramCommandCreation()
	 *
	 * @return
	 */
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeDiagramCommand();
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getProjectName()
	 *
	 * @return
	 */
	
	@Override
	protected String getProjectName() {
		return ICompositeDiagramTestsConstants.PROJECT_NAME;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getFileName()
	 *
	 * @return
	 */
	
	@Override
	protected String getFileName() {
		return ICompositeDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage generalization.
	 */
	@Test
	public void testToManageGeneralization() {
		testToManageLink(UMLElementTypes.Class_2073, UMLElementTypes.Class_2073, UMLElementTypes.Generalization_4015, UMLElementTypes.Package_1000, true);
	}	

	
	/**
	 * Test class to collaboration generalization.
	 */
	@Test
	public void testClassToCollaborationGeneralization() {
		testToManageLink(UMLElementTypes.Class_2073, UMLElementTypes.Collaboration_2075, UMLElementTypes.Generalization_4015, UMLElementTypes.Package_1000, true);
	}		

	/**
	 * Test collaboration to class generalization.
	 */
	@Test
	public void testCollaborationToClassGeneralization() {
		testToManageLink(UMLElementTypes.Collaboration_2075, UMLElementTypes.Class_2073, UMLElementTypes.Generalization_4015, UMLElementTypes.Package_1000, true);
	}	
	/**
	* Test to manage component.
	*/
	@Test
	@InvalidTest
	public void testToComponentRealization() {
	testToManageLink(UMLElementTypes.Component_2069, UMLElementTypes.Interface_2076, UMLElementTypes.ComponentRealization_4004, UMLElementTypes.Package_1000, true);
	}
	
}
