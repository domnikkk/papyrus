package org.eclipse.papyrus.uml.diagram.tests.canonical;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.diagram.common.part.UmlGmfDiagramEditor;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;

/**
 * ListCompartmentN test helper
 *
 */
public abstract class TestListCompartmentHelper extends AbstractPapyrusTest {

	private boolean myOperationFailed = false;

	private final DiagramEditPart myDiagramEditPart;

	/** The diagram editor. */
	private final UmlGmfDiagramEditor myDiagramEditor;

	public TestListCompartmentHelper(DiagramEditPart diagramEditPart, UmlGmfDiagramEditor diagramEditor) {
		myDiagramEditPart = diagramEditPart;
		myDiagramEditor = diagramEditor;
	}

	public void checkDuplicate(int parent, int parentContainer, int child) {
		checkDuplicate(parent, parentContainer, child, 0);
	}

	public void checkDuplicate(int parent, int parentContainer, int child, int nestedChild) {
		IGraphicalEditPart parentEP = createChild(parent, myDiagramEditPart, 0);
		IGraphicalEditPart targetEP = findChildBySemanticHint(parentEP, parentContainer);
		IGraphicalEditPart dndEP = createChild(nestedChild > 0 ? nestedChild : child, targetEP, 0);
		{
			Command ddCommand = createDropCommand(dndEP, myDiagramEditPart);
			Assert.assertTrue(ddCommand.canExecute());
			executeOnUIThread(ddCommand);
		}
		IGraphicalEditPart canvasDnDEP = findChildBySemanticHint(myDiagramEditPart, nestedChild > 0 ? child : getDefaultNamedElementVisualId());
		{
			Command ddCommand = createDropCommand(canvasDnDEP, targetEP);
			Assert.assertFalse(canvasDnDEP.getClass().getName() + " can't be dropped to the " + targetEP.getClass().getName() + " due the duplication behavior rule.", ddCommand.canExecute());
		}
	}

	public void checkUnexecutableChildCreate(int targetVisualId, int targetCompartmentVisualId, int childVisualId) {
		IGraphicalEditPart targetEP = createChild(targetVisualId, myDiagramEditPart, 0);
		IGraphicalEditPart targetCompartmentEP = findChildBySemanticHint(targetEP, targetCompartmentVisualId);
		Command command = getCreateChildCommand(childVisualId, targetCompartmentEP);
		Assert.assertFalse("The " + childVisualId + "-visualId can't be created in the " + targetCompartmentEP.getClass().getName(), command.canExecute());
	}

	public void checkUnexecutableDrop2Canvas(int targetVisualId, int targetCompartmentVisualId, int childVisualId) {
		IGraphicalEditPart targetEP = createChild(targetVisualId, myDiagramEditPart, 0);
		IGraphicalEditPart targetCompartmentEP = findChildBySemanticHint(targetEP, targetCompartmentVisualId);
		IGraphicalEditPart childEP = createChild(childVisualId, targetCompartmentEP, 0);
		EObject semantic = childEP.resolveSemanticElement();
		Assert.assertTrue(semantic != null && (semantic instanceof Property || semantic instanceof Operation));
		Command command = createDropCommand(childEP, myDiagramEditPart);
		Assert.assertFalse("The " + childEP.getClass().getName() + " can't be droped to the Canvas.", command.canExecute());
	}

	public void checkDropPropertyFromModelExplorer2Canvas(int targetVisualId, int targetCompartmentVisualId, int childVisualId) throws Exception {
		IGraphicalEditPart targetEP = createChild(targetVisualId, myDiagramEditPart, 0);
		IGraphicalEditPart targetCompartmentEP = findChildBySemanticHint(targetEP, targetCompartmentVisualId);
		IGraphicalEditPart childEP = createChild(childVisualId, targetCompartmentEP, 0);
		EObject semantic = childEP.resolveSemanticElement();
		Assert.assertTrue(semantic != null && (semantic instanceof Property || semantic instanceof Operation));
		List<EObject> forDrop = new ArrayList<EObject>();
		forDrop.add(semantic);
		Command ddCommand = createDropCommandFromModelExplorer2Canvas(forDrop);
		Assert.assertTrue(ddCommand.canExecute());
	}

	private Command createDropCommandFromModelExplorer2Canvas(List<EObject> elements) {
		DropObjectsRequest req = new DropObjectsRequest();
		req.setObjects(elements);
		req.setAllowedDetail(DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK);
		req.setLocation(new Point(15, 15));
		req.setRequiredDetail(DND.DROP_COPY);
		req.setType(RequestConstants.REQ_DROP_OBJECTS);
		return myDiagramEditPart.getCommand(req);
	}

	private Command getCreateChildCommand(int childVID, IGraphicalEditPart container) {
		final IElementType childType = getElementType(childVID);
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(childType, container.getDiagramPreferencesHint());
		requestcreation.setSize(new Dimension(1, 1));
		requestcreation.setLocation(new Point(10, 10));
		return container.getCommand(requestcreation);
	}

	public void checkUnexecutableDrop(int targetVisualId, int targetCompartmentVisualId, int dropableVisualId) {
		IGraphicalEditPart targetEP = createChild(targetVisualId, myDiagramEditPart, 0);
		IGraphicalEditPart dropableEP = createChild(dropableVisualId, myDiagramEditPart, 1);
		IGraphicalEditPart targetCompartmentEP = findChildBySemanticHint(targetEP, targetCompartmentVisualId);
		Command command = createDropCommand(dropableEP, targetCompartmentEP);
		Assert.assertFalse("The " + dropableEP.getClass().getName() + " can't be droped to the " + targetCompartmentEP.getClass().getName(), command.canExecute());
	}

	protected abstract int getDefaultNamedElementVisualId();

	protected abstract IElementType getElementType(int childVID);

	protected abstract int getVisualID(View view);

	private void executeOnUIThread(final Command command) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				execute(command);
			}
		});
	}

	private void assertLastOperationSuccessful() {
		Assert.assertFalse("The operation failed. Look at the log, or put a breakpoint on ExecutionException or DefaultOperationHistory#notifyNotOK to find the cause.", this.myOperationFailed); //$NON-NLS-1$
	}

	/**
	 * Reset the "operation failed" state. Call this before executing each
	 * operation for which you want to test whether if failed with {@link assertLastOperationSuccessful()}.
	 */
	private void resetLastOperationFailedState() {
		myOperationFailed = false;
	}

	/** Execute the given command in the diagram editor. */
	private void execute(final Command command) {
		resetLastOperationFailedState();
		getCommandStack().execute(new GEFtoEMFCommandWrapper(command));
		assertLastOperationSuccessful();
	}

	/** The command stack to use to execute commands on the diagram. */
	private CommandStack getCommandStack() {
		// not "diagramEditor.getDiagramEditDomain().getDiagramCommandStack()"
		// because it messes up undo contexts
		return myDiagramEditor.getEditingDomain().getCommandStack();
	}

	private Command createDropCommand(IGraphicalEditPart child, IGraphicalEditPart newParent) {
		CompoundCommand c = new CompoundCommand();
		ChangeBoundsRequest changeBoundsRequest = new ChangeBoundsRequest(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DRAG);
		changeBoundsRequest.setEditParts(child);
		changeBoundsRequest.setLocation(new Point(15, 15));
		c.add(child.getCommand(changeBoundsRequest));
		myDiagramEditPart.getEditingDomain().getCommandStack().execute(new GEFtoEMFCommandWrapper(c));
		changeBoundsRequest.setType(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DROP);
		c.add(newParent.getCommand(changeBoundsRequest));
		return c;
	}

	private IGraphicalEditPart createChild(int childVID, IGraphicalEditPart container, int number) {
		Command cmd = getCreateChildCommand(childVID, container);
		executeOnUIThread(cmd);
		return findChild(container, childVID, number);
	}


	private IGraphicalEditPart findChild(IGraphicalEditPart parent, int vid, int number) {
		List<?> children = parent.getChildren();
		if (number > children.size() - 1) {
			Assert.fail("Parent " + parent + ", type " + parent.getNotationView() + " hasn't less children then " + number);
		}
		IGraphicalEditPart childEP = (IGraphicalEditPart) children.get(number);
		assertNotNull("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, childEP);
		Assert.assertEquals("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, getVisualID(childEP.getNotationView()), vid);
		return childEP;
	}

	private IGraphicalEditPart findChildBySemanticHint(IGraphicalEditPart parent, int vid) {
		IGraphicalEditPart childEP = parent.getChildBySemanticHint(Integer.toString(vid));
		assertNotNull("Parent " + parent + ", type " + parent.getNotationView() + " looking for: " + vid, childEP);
		return childEP;
	}
}
