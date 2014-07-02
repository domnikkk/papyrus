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

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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
	 public abstract void testBackgroundColor(GraphicalEditPart createdEditpart);
	 public abstract void testForegroundColor(GraphicalEditPart createdEditpart);
	 public abstract void testGradient(GraphicalEditPart createdEditpart);
	 public abstract void testLineWidth(GraphicalEditPart createdEditpart);
	 public abstract void testTransparency(GraphicalEditPart createdEditpart);
	 public abstract void testFont(GraphicalEditPart createdEditpart);
	 public abstract void testFontHeight(GraphicalEditPart createdEditpart);
	 public abstract void testElementIcon(GraphicalEditPart createdEditpart);
	 public abstract void testShadow(GraphicalEditPart createdEditpart);
	
	@Override
	void testAppearance(IElementType type) {
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
