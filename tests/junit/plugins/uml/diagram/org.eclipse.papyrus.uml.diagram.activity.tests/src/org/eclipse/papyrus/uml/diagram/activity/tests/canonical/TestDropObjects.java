package org.eclipse.papyrus.uml.diagram.activity.tests.canonical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityActivityContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionNodeAsInEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.activity.tests.IActivityDiagramTestsConstants;
import org.junit.Test;

/**
 * Testing drop action.
 */
public class TestDropObjects extends AbstractPapyrusTestCase {

	@Override
	protected String getProjectName() {
		return IActivityDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IActivityDiagramTestsConstants.FILE_NAME;
	}

	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}

	/**
	 * create childNodeEditPart in parentEditPart
	 */
	protected IGraphicalEditPart createChild(int childVID, IGraphicalEditPart container) {
		final IElementType childType = UMLElementTypes.getElementType(childVID);
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(childType, container.getDiagramPreferencesHint());
		requestcreation.setSize(new Dimension(1, 1));
		requestcreation.setLocation(new Point(10, 10));
		Command cmd = container.getCommand(requestcreation);
		executeOnUIThread(cmd);
		return findChildBySemanticHint(container, childVID);
	}

	private IGraphicalEditPart findChildBySemanticHint(IGraphicalEditPart parent, int vid) {
		IGraphicalEditPart childEP = parent.getChildBySemanticHint(Integer.toString(vid));
		assertNotNull("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, childEP);
		return childEP;
	}

	protected IGraphicalEditPart getActivityCompartmentEditPart() {
		IGraphicalEditPart activityEP = findChildBySemanticHint(getDiagramEditPart(), ActivityEditPart.VISUAL_ID);
		return findChildBySemanticHint(activityEP, ActivityActivityContentCompartmentEditPart.VISUAL_ID);
	}

	@Test
	public void testExpansionNodeInExpansionRegionCompartment() throws Exception {
		IGraphicalEditPart regionEP = createChild(ExpansionRegionEditPart.VISUAL_ID, getActivityCompartmentEditPart());
		IGraphicalEditPart regionCompartmentEP = findChildBySemanticHint(regionEP, ExpansionRegionStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID);
		IGraphicalEditPart expansionNode = createChild(ExpansionNodeAsInEditPart.VISUAL_ID, regionEP);

		DropObjectSequence dropSeq = new DropObjectSequence(expansionNode, regionEP, regionCompartmentEP);
		dropSeq.doSequence();
	}

	/**
	 * Sequence for manage and testing drop object action
	 *
	 */
	public class DropObjectSequence {

		private final IGraphicalEditPart myChild;

		private final IGraphicalEditPart myParent;

		private final IGraphicalEditPart myDropParent;

		public DropObjectSequence(IGraphicalEditPart childEP, IGraphicalEditPart parentEP, IGraphicalEditPart dropParent) {
			assertNotNull(childEP);
			assertNotNull(parentEP);
			assertNotNull(dropParent);

			myChild = childEP;
			myParent = parentEP;
			myDropParent = dropParent;

			assertNotEquals(myChild, myParent);
			assertNotEquals(myChild, myDropParent);
		}

		public void doSequence() {
			testBeforeRemoveView();
			EObject objectToDrop = doHideChild();
			testHide();
			IGraphicalEditPart newGrapticalChild = doDrop(objectToDrop);
			testDrop(newGrapticalChild);
		}

		protected void testBeforeRemoveView() {
			testGraphicalEditParts((IGraphicalEditPart) getChildEP().getParent(), getParentEP());

			EObject childObject = getChildEP().resolveSemanticElement();
			EObject parentObject = getParentEP().resolveSemanticElement();

			testSemantic(parentObject, childObject.eContainer());
		}

		protected EObject doHideChild() {
			EObject result = getChildEP().resolveSemanticElement();
			Command deleteChild = getChildEP().getCommand(new GroupRequest(RequestConstants.REQ_DELETE));
			assertTrue(deleteChild.canExecute());
			executeOnUIThread(deleteChild);
			return result;
		}

		protected void testHide() {
			List<?> childrenAfterHide = getParentEP().getChildren();
			for (Object child : childrenAfterHide) {
				assertNotEquals(child, getChildEP());
			}
		}

		private int getChildVID() {
			return UMLVisualIDRegistry.getVisualID(getChildEP().getNotationView());
		}

		protected IGraphicalEditPart doDrop(EObject objectToDrop) {
			DropObjectsRequest req = createRequest(objectToDrop);
			Command dropCommand = myDropParent.getCommand(req);
			assertTrue(dropCommand.canExecute());
			executeOnUIThread(dropCommand);
			return findChildBySemanticHint(getParentEP(), getChildVID());
		}

		private DropObjectsRequest createRequest(EObject objectToDrop) {
			DropObjectsRequest result = new DropObjectsRequest();
			result.setObjects(Arrays.asList(objectToDrop));
			result.setType(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DROP_OBJECTS);
			result.setLocation(new Point(1, 1));
			return result;
		}

		protected void testDrop(IGraphicalEditPart childEP) {
			testGraphicalEditParts((IGraphicalEditPart) childEP.getParent(), getParentEP());

			EObject childObject = childEP.resolveSemanticElement();
			EObject parentObject = getParentEP().resolveSemanticElement();

			testSemantic(parentObject, childObject.eContainer());
		}

		public final IGraphicalEditPart getChildEP() {
			return myChild;
		}

		public final IGraphicalEditPart getParentEP() {
			return myParent;
		}

		public final IGraphicalEditPart getDropParentEP() {
			return myDropParent;
		}

		protected void testSemantic(EObject parent, EObject expected) {
			assertEquals(parent, expected);
		}

		protected void testGraphicalEditParts(IGraphicalEditPart parent, IGraphicalEditPart expected) {
			assertEquals(parent, expected);
		}
	}
}
