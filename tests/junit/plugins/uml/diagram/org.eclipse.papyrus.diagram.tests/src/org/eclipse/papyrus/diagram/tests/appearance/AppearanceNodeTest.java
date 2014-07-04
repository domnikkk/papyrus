/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * (CEA LIST) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.diagram.tests.appearance;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;

/**
 * This abstract class is used to test the appearance of a node
 *
 */
public abstract class AppearanceNodeTest  extends AppearanceElementTest{
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
	public void testBackgroundColor(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_FillColor(), 0));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		IFigure fig=createdEditpart.getFigure();
		
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the background is not refreshed", Display.getDefault().getSystemColor(SWT.COLOR_BLACK),((NodeFigure)fig).getBackgroundColor());

	}
	public  void testForegroundColor(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testGradient(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testLineWidth(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testTransparency(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testFont(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testFontHeight(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testElementIcon(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}
	public  void testShadow(GraphicalEditPart createdEditpart){
		testBackgroundColor(createdEditpart);
	}

	@Override
	public void testAppearance(IElementType type) {
		GraphicalEditPart createdEditpart=createANode(type, getContainerEditPart());
		testBackgroundColor(createdEditpart);
		testForegroundColor(createdEditpart);
		testGradient(createdEditpart);
		testLineWidth(createdEditpart);
		testTransparency(createdEditpart);
		testFont(createdEditpart);
		testFontHeight(createdEditpart);
		testElementIcon(createdEditpart);
		testShadow(createdEditpart);


	}
}
