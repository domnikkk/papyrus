package org.eclipse.papyrus.uml.diagram.component.test.canonical;

import org.eclipse.papyrus.junit.framework.classification.FailingTest;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.OperationForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PropertyForInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.RectangleInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestListCompartmentHelper;
import org.junit.Test;

/**
 *
 */
public class TestListCompartmentPropertiesOperationsDrop extends AbstractPapyrusTestCase {

	private TestListCompartmentHelper myHelper;

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getProjectName()
	 *
	 * @return
	 */
	@Override
	protected String getProjectName() {
		return IComponentDiagramTestsConstants.PROJECT_NAME;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase#getFileName()
	 *
	 * @return
	 */
	@Override
	protected String getFileName() {
		return IComponentDiagramTestsConstants.FILE_NAME;
	}

	@FailingTest
	public void testPropertyInInterfaceAttributeCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(RectangleInterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@FailingTest
	public void testOperationInInterfaceOperationCompartment() throws Exception {
		getHelper().checkUnexecutableDrop2Canvas(RectangleInterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testPropertyInInterfaceDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(RectangleInterfaceEditPart.VISUAL_ID, InterfaceAttributeCompartmentEditPart.VISUAL_ID, PropertyForInterfaceEditPart.VISUAL_ID);
	}

	@Test
	public void testOperationInInterfaceDropFromModelExplorer() throws Exception {
		getHelper().checkDropPropertyFromModelExplorer2Canvas(RectangleInterfaceEditPart.VISUAL_ID, InterfaceOperationCompartmentEditPart.VISUAL_ID, OperationForInterfaceEditPart.VISUAL_ID);
	}

	private TestListCompartmentHelper getHelper() {
		if (myHelper == null) {
			myHelper = new ComponentDiagramListCompartmentTestHelper(getDiagramEditPart(), diagramEditor);
		}
		return myHelper;
	}
}
