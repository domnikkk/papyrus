/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.tests.createFromPalette;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IMaskManagedLabelEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.common.editparts.UMLCompartmentEditPart;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Element;
import org.junit.Assert;
import org.junit.Before;

/**
 * Abstract class to test nodes
 */
public abstract class AbstractCreateNodeFromPaletteTest extends org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase {

	/** <code>true</code> if semantic tests should be run on graphical manipulation */
	private boolean testSemantic;

	/** command computed on the ui thread */
	protected Command command;

	/** container editpart **/
	protected GraphicalEditPart containerEditPart;

	private int comaprtmentNB;

	private Object rootCompartment;

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#setUp()
	 *
	 * @throws Exception
	 */
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		testSemantic = isSemanticTest();
	}


	/**
	 * Test to create a node.
	 *
	 * @param type
	 *            the type
	 */
	public GraphicalEditPart createANode(IElementType type, final GraphicalEditPart containerEditPart) {

		// CREATION
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, containerEditPart.getDiagramPreferencesHint());
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				command = containerEditPart.getTargetEditPart(requestcreation).getCommand(requestcreation);
			}
		});
		assertNotNull("the command must not be null", command);

		// execute the creation
		executeOnUIThread(command);


		GraphicalEditPart createdEditPart = (GraphicalEditPart) containerEditPart.getChildren().get((containerEditPart.getChildren().size() - 1));
		Assert.assertNotNull("The editpart must be created", createdEditPart); //$NON-NLS-1$
		return createdEditPart;

	}

	/**
	 * Returns <code>true</code> if semantic tests should be also performed
	 *
	 * @return <code>true</code> if semantic tests should be also performed
	 */
	protected boolean isSemanticTest() {
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#getRootView()
	 *
	 * @return
	 */
	@Override
	protected View getRootView() {
		return (View) getContainerEditPart().getModel();
	}

	public abstract DiagramUpdater getDiagramUpdater();

	/**
	 * Returns the container edit part
	 */

	protected IGraphicalEditPart getContainerEditPart() {
		if (rootCompartment != null) {
			return (IGraphicalEditPart) rootCompartment;
		} else {
			return containerEditPart;
		}
	}


	/**
	 * Test to manage child node.
	 *
	 * @param type
	 *            the type
	 * @param containerType
	 *            the container type
	 */
	public void testCreateNodeFromPalette(IElementType type, int numberSemanticChildreen, boolean mustSuceed) {
		// create a node
		testCreateElementFromPalette(type, 0, 1, 1, 1, numberSemanticChildreen, mustSuceed);

	}


	/**
	 * Test to manage child node from diagram
	 *
	 * @param type
	 *            the type
	 */
	public void testCreateNodeFromPalette(IElementType type, boolean mustSuceed) {
		containerEditPart = getDiagramEditPart();
		testCreateNodeFromPalette(type, 0, mustSuceed);
	}

	/**
	 * Test to create child node.
	 *
	 * @param type
	 *            the type
	 * @param containerType
	 *            the container type
	 */
	public void testCreateNodeFromPalette(IElementType type, IElementType containerType, boolean mustSuceed) {
		containerEditPart = createANode(containerType, getDiagramEditPart());
		rootCompartment = null;
		int index = 0;

		for (Object editPart : containerEditPart.getChildren()) {
			if (editPart instanceof ShapeCompartmentEditPart) {
				rootCompartment = (ShapeCompartmentEditPart) (editPart);
			}
		}
		assertNotNull("There should be at least one container for the node tests", rootCompartment); //$NON-NLS-1$

		comaprtmentNB = countCompartmentEdipart();

		testCreateNodeFromPalette(type, 0, mustSuceed);
	}


	protected int countCompartmentEdipart() {
		int index = 0;
		int compartmentEditpartNB = 0;
		while (index < containerEditPart.getChildren().size()) {
			if ((containerEditPart.getChildren().get(index)) instanceof ResizableCompartmentEditPart) {
				compartmentEditpartNB++;
			}
			index++;
		}
		return compartmentEditpartNB;
	}

	protected void testSizeCompartment(int expectedGraphicalChildren) {
		if (comaprtmentNB == 0) {
			// assertEquals(CREATION + INITIALIZATION_TEST, expectedGraphicalChildren, containerEditpart.getNotationView().getChildren().size());
		}
		if (comaprtmentNB == 1) {
			// assertEquals(CREATION + INITIALIZATION_TEST, expectedGraphicalChildren, ((GraphicalEditPart)containerEditpart.getChildren().get(0)).getNotationView().getChildren().size());
		}
		if (comaprtmentNB > 1) {
			boolean foundCompartment = false;
			for (Object compartment : containerEditPart.getChildren()) {
				if (compartment instanceof ResizableCompartmentEditPart) {
					if (((ResizableCompartmentEditPart) compartment).getNotationView().getChildren().size() == expectedGraphicalChildren) {
						foundCompartment = true;
					}
				}
			}
			// Assert.assertTrue("The compartment has not good size", foundCompartment);
		}

	}





	/**
	 * Test to create a node.
	 *
	 * @param type
	 *            the type
	 */
	public void testCreateElementFromPalette(IElementType type, int expectedGraphicalChildren, int expectedSemanticChildren, int addedGraphicalChildren, int addedSemanticChildren, int numberSemanticChildreen, boolean mustSuceed) {
		command = null;
		// CREATION
		//
		testSizeCompartment(expectedGraphicalChildren);
		Element root = (Element) getContainerEditPart().resolveSemanticElement();
		List<Element> ownedElements = root.getOwnedElements();
		if (isSemanticTest()) {
			// assertEquals(CREATION + INITIALIZATION_TEST, expectedSemanticChildren, ownedElements.size());
		}
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getContainerEditPart().getDiagramPreferencesHint());
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				command = getContainerEditPart().getTargetEditPart(requestcreation).getCommand(requestcreation);
			}
		});
		assertNotNull(CREATION + COMMAND_NULL, command);
		if (!mustSuceed) {
			assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command.equals(UnexecutableCommand.INSTANCE));
		}
		else {
			assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, (!command.equals(UnexecutableCommand.INSTANCE)));
			assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute()); //$NON-NLS-1$
			// execute the creation
			executeOnUIThread(command);
			testSizeCompartment(expectedGraphicalChildren + addedSemanticChildren);
			// if(addedGraphicalChildren>=1){
			//			Assert.assertTrue("Node must be  org.eclipse.gmf.runtime.notation.Shape",getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren-1) instanceof Shape); //$NON-NLS-1$
			// }
			//
			if (testSemantic) {
				// assertEquals(CREATION + TEST_THE_EXECUTION, expectedSemanticChildren + addedSemanticChildren, ownedElements.size());
			}
			// undo the creation
			undoOnUIThread();
			testSizeCompartment(expectedGraphicalChildren);
			if (testSemantic) {
				// assertEquals(CREATION + TEST_THE_UNDO, expectedSemanticChildren, ownedElements.size());
			}
			// redo the creation test
			redoOnUIThread();
			// assertEquals(CREATION + TEST_THE_REDO, expectedGraphicalChildren + addedGraphicalChildren, getRootView().getChildren().size());
			if (testSemantic) {
				// assertEquals(CREATION + TEST_THE_REDO, expectedSemanticChildren + addedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
			}

			EditPart createdEditPart = (EditPart) getContainerEditPart().getChildren().get((getContainerEditPart().getChildren().size() - 1));
			Assert.assertNotNull("The editpart must be created", createdEditPart); //$NON-NLS-1$
			//
			//
			// test diagram updater
			if (getDiagramUpdater() != null) {
				Assert.assertNotEquals("Diagram updater must detect that children has been created", 0, getDiagramUpdater().getSemanticChildren(getRootView()).size()); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link has been created", 0, getDiagramUpdater().getContainedLinks(getRootView()).size()); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link are incoming", 0, getDiagramUpdater().getIncomingLinks((View) getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren - 1)).size()); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link are outgoing", 0, getDiagramUpdater().getOutgoingLinks((View) getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren - 1)).size()); //$NON-NLS-1$
				Assert.assertEquals(
						"Diagram updater must detect that no children has ben created in the new element", numberSemanticChildreen, getDiagramUpdater().getSemanticChildren((View) getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren - 1)).size()); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link has been created in the new element", 0, getDiagramUpdater().getContainedLinks((View) getRootView().getChildren().get(expectedGraphicalChildren + addedGraphicalChildren - 1)).size()); //$NON-NLS-1$
			}
			createdEditPart.getChildren();
			for (Iterator<?> iteratorEditPart = createdEditPart.getChildren().iterator(); iteratorEditPart.hasNext();) {
				Object subEditPart = iteratorEditPart.next();
				if (subEditPart instanceof UMLCompartmentEditPart) {
					Assert.assertNotEquals("Diagram updater must detect that children have been created", 0, getDiagramUpdater().getSemanticChildren(((CompartmentEditPart) subEditPart).getNotationView()).size()); //$NON-NLS-1$
				}
				Assert.assertNotEquals("Diagram updater must detect that children has been created", 0, getDiagramUpdater().getSemanticChildren((View)((EditPart)subEditPart).getModel())); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link has been created", 0, getDiagramUpdater().getContainedLinks((View)((EditPart)subEditPart).getModel())); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link are incoming", 0, getDiagramUpdater().getIncomingLinks((View)((EditPart)subEditPart).getModel())); //$NON-NLS-1$
				Assert.assertEquals("Diagram updater must detect that no link are outgoing", 0, getDiagramUpdater().getOutgoingLinks((View)((EditPart)subEditPart).getModel())); //$NON-NLS-1$
	
			}
		}
	}

	/**
	 * this method is used to test the created editpart
	 * 
	 * @param maskmanaged
	 * @param createdEditPart
	 */
	protected void testNodeEditPart(boolean maskmanaged, EditPart createdEditPart, String initialName) {
		if (maskmanaged) {
			Assert.assertNotNull("the created editpolicy must have as MASK_MANAGED_LABEL_EDIT_POLICY", createdEditPart.getEditPolicy(IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY)); //$NON-NLS-1$
		}
		int index = 0;
		while (index < createdEditPart.getChildren().size()) {
			if ((createdEditPart.getChildren().get(index)) instanceof ResizableCompartmentEditPart) {
				ResizableCompartmentEditPart compartment = (ResizableCompartmentEditPart) (createdEditPart.getChildren().get(index));
				Assert.assertFalse("compartment must not be selectable", compartment.isSelectable()); //$NON-NLS-1$
			}
			index++;
		}
		testNameLabel(createdEditPart, initialName);
	}

	protected void testNameLabel(EditPart createdEditPart, String initialName) {
		if (createdEditPart instanceof NamedElementEditPart) {
			GraphicalEditPart namedEditPart = (GraphicalEditPart) ((NamedElementEditPart) createdEditPart).getPrimaryChildEditPart();
			Assert.assertTrue("the primary editpart must be the namelabelEditpart", namedEditPart instanceof ITextAwareEditPart); //$NON-NLS-1$
			String name = namedEditPart.resolveSemanticElement().eClass().getName();
			if (initialName != null) {
				name = initialName;
			}
			if (name.length() < ((ITextAwareEditPart) namedEditPart).getEditText().length()) {
				Assert.assertEquals(" the name must contain the name of the metaclass", name, ((ITextAwareEditPart) namedEditPart).getEditText().substring(0, name.length())); //$NON-NLS-1$
			}
			else {
				// not the same it sure but display the mistake is important
				Assert.assertEquals(" the name must contain the name of the metaclass", name, ((ITextAwareEditPart) namedEditPart).getEditText()); //$NON-NLS-1$
			}
			if (namedEditPart instanceof CompartmentEditPart) {
				Assert.assertTrue("the primary editpart must be the namelabelEditpart", namedEditPart instanceof CompartmentEditPart); //$NON-NLS-1$
				Assert.assertTrue("namelabelEditpart must be editable", ((CompartmentEditPart) namedEditPart).isEditModeEnabled());} //$NON-NLS-1$
			else {
				Assert.assertTrue("the primary editpart must be the namelabelEditpart", namedEditPart instanceof LabelEditPart); //$NON-NLS-1$
			}
		}
	}


	/**
	 * @return
	 */
	protected CreateViewRequest createViewRequestShapeContainer() {
		// TODO Auto-generated method stub
		return null;
	}

}
