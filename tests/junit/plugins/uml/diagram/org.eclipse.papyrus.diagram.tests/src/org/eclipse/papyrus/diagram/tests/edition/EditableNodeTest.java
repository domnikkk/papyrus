package org.eclipse.papyrus.diagram.tests.edition;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.internal.parts.TextCellEditorEx;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.papyrus.uml.diagram.common.directedit.MultiLineCellEditor;
import org.eclipse.papyrus.uml.diagram.common.directedit.MultilineLabelDirectEditManager;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IMultilineEditableFigure;
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;


public  abstract class EditableNodeTest extends EditableElementTest {
	protected Command command = null;

	/**
	 * Test to create a node.
	 *
	 * @param type
	 *        the type
	 */
	public GraphicalEditPart createANode(IElementType type, final GraphicalEditPart containerEditPart) {
		//CREATION
		final CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, containerEditPart.getDiagramPreferencesHint());
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				command = containerEditPart.getCommand(requestcreation);
			}
		});
		assertNotNull("the command must not be null", command);
		assertTrue("the command must be executable", command.canExecute()); //$NON-NLS-1$
		// execute the creation
		executeOnUIThread(command);


		GraphicalEditPart createdEditPart= (GraphicalEditPart)containerEditPart.getChildren().get((containerEditPart.getChildren().size()-1));
		Assert.assertNotNull("The editpart must be created", createdEditPart); //$NON-NLS-1$
		return  createdEditPart;

	}
	@Override
	public void testEdition(IElementType type) {
		GraphicalEditPart createdEditpart=createANode(type, getContainerEditPart());
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				GraphicalEditPart editableEditPart=(GraphicalEditPart) nameEditpart;
				final IFigure nameFigure = editableEditPart.getFigure();
				final Rectangle bounds = nameFigure.getBounds();
				final Point center = bounds.getCenter();
				final DirectEditRequest directEditRequest = new DirectEditRequest();
				directEditRequest.setLocation(center);
				editableEditPart.performRequest(directEditRequest);
				
				//test if there is not primary editpart
				Assert.assertNull("The editpart must not references primarychildEditpart", editableEditPart.getPrimaryChildEditPart());

				//to increase the covering
				//getLabelTextHelper to refactor
				//setLabelTextHelper to refactor
				//getLabelIconHelper to refactor
				//setLabelIconHelper to refactor
				//setParser to refactor
				//performDirectEdit(Point eventLocation) {
				//performDirectEdit(char initialCharacter) {
				//performDirectEditRequest(Request request) {
				//initializeDirectEditManager(final Request request) {
				//initExtendedEditorConfiguration() {
				//updateExtendedEditorConfiguration() {
				//performDefaultDirectEditorEdit(final Request theRequest) {
				//handleNotificationEvent(Notification event) {

				//getDirectEditionType
				//Mode reflexive to Test the editor associated to the element
				Class<?> editableEditPartClass= editableEditPart.getClass();
				try {
					//test is editable
					Method methodisEditable=editableEditPartClass.getDeclaredMethod("isEditable", null);
					if(methodisEditable!=null){
						methodisEditable.setAccessible(true);
						Object resultdirectEditorType=	methodisEditable.invoke(editableEditPart, null);
						Assert.assertEquals("the editpart must be editable", true,resultdirectEditorType); 
					}
					//
					Method methodgetEditTextValidator=editableEditPartClass.getDeclaredMethod("getEditTextValidator", null);
					if(methodgetEditTextValidator!=null){
						methodgetEditTextValidator.setAccessible(true);
						Object result=	methodgetEditTextValidator.invoke(editableEditPart, null);
						Assert.assertNotNull("the editpart must be editable", result); 
						ICellEditorValidator cellvalidato= (ICellEditorValidator)result;
						Assert.assertEquals("the text is valid",null,cellvalidato.isValid("MyElement"));
						
					}
				
					
					
					
					//performDirectEdit(Point eventLocation) {
					//performDirectEdit(char initialCharacter) {
					
					//call and test kind of editor
					Method methodgetDirectEditionType=editableEditPartClass.getDeclaredMethod("getDirectEditionType", null);
					if(methodgetDirectEditionType!=null){
						Object resultdirectEditorType=	methodgetDirectEditionType.invoke(editableEditPart, null);
						Assert.assertEquals("the editpart must be dafault direct editor", IDirectEdition.DEFAULT_DIRECT_EDITOR,resultdirectEditorType); 
					}
					//call and test current editor
					Method methodGetManager=editableEditPartClass.getDeclaredMethod("getManager", null);
					if(methodGetManager!=null){
						methodGetManager.setAccessible(true);
						Object result=	methodGetManager.invoke(editableEditPart, null);
						Assert.assertTrue("the manager to edit name must be a MultilineLabelDirectEditManager", result instanceof MultilineLabelDirectEditManager);	
						MultilineLabelDirectEditManager manager= (MultilineLabelDirectEditManager) result;
						IFigure fig= getPrimaryFigure(editableEditPart);
						
						if(fig instanceof IMultilineEditableFigure) {
							Assert.assertEquals("the editor of this editpart must be multiline editor",MultiLineCellEditor.class, manager.getTextCellEditorClass(editableEditPart)); 
							
						} else {
							Assert.assertEquals("the editor of this editpart must be simple editor",TextCellEditorEx.class, manager.getTextCellEditorClass(editableEditPart)); 
						}
					}
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
