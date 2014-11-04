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
package org.eclipse.papyrus.uml.diagram.tests.appearance;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.GradientStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.infra.emf.appearance.style.AnnotationStyleProvider;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RectangularShadowBorder;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;

/**
 * This abstract class is used to test the appearance of a node
 *
 */
public abstract class AbstractAppearanceNodeTest  extends AppearanceElementTest{
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
	/**
	 * test the if the background is refreshed on the figure
	 * @param createdEditpart
	 */
	public void testBackgroundColor(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_FillColor(), 0));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command=  new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), null));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the background is not refreshed", Display.getDefault().getSystemColor(SWT.COLOR_BLACK),((NodeFigure)fig).getBackgroundColor());

	}
	/**
	 * get the primary figure that correspond to the edipart
	 * @param createdEditpart
	 * @return a Ifigure
	 */
	protected IFigure getPrimaryFigure(GraphicalEditPart createdEditpart) {
		if(createdEditpart.getFigure() instanceof BorderedNodeFigure){
			IFigure nodePlate = (IFigure)((BorderedNodeFigure)createdEditpart.getFigure()).getChildren().get(0);
			// now verify position of each subfigure
			IFigure fig = ((IFigure)nodePlate.getChildren().get(0));
			return fig;
		}
		else{return createdEditpart.getFigure(); }
	}
	
/**
 * test the if the foreground is refreshed on the figure
 * @param createdEditpart
 */
	public  void testForegroundColor(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getLineStyle_LineColor(), 0));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command=  new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), null));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the foreground is not refreshed", Display.getDefault().getSystemColor(SWT.COLOR_BLACK),((NodeFigure)fig).getForegroundColor());

	}
/**
 * test the if the gradient is refreshed on the figure
 * in the figure the background is taken in account and Color1
 * @param createdEditpart
 */
	public  void testGradient(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		//gradient take in account fill color and gradient 1
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_FillColor(), 0));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command=  new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), null));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), new GradientData(256, 512, GradientStyle.VERTICAL)));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the gradient background is not refreshed", Display.getDefault().getSystemColor(SWT.COLOR_BLACK),((NodeFigure)fig).getBackgroundColor());
		Assert.assertEquals("the gradient  color1 is not refreshed", 0,((NodeFigure)fig).getGradientColor1());
		Assert.assertEquals("the gradient color2 is not refreshed", 256,((NodeFigure)fig).getGradientColor2());
		Assert.assertEquals("the gradient style is not refreshed", 0,((NodeFigure)fig).getGradientStyle());
	}
	
	/**
	 * test the if the line width is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testLineWidth(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getLineStyle_LineWidth(), 10));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command=  new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), null));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the line width is not refreshed", 10,((NodeFigure)fig).getLineWidth());

	}
	/**
	 * test the if the transparency is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testTransparency(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Transparency(), 50));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command=  new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), null));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the transparency is not refreshed", 50,((NodeFigure)fig).getTransparency());
	}
	/**
	 *  test the if the font of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFont(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFontStyle_FontName(), "Arial"));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof WrappingLabel);
				Assert.assertEquals("the Font police is not refreshed", "Arial",((FontData)((WrappingLabel)fig).getFont().getFontData()[0]).getName());
			}
		}

	}
	/**
	 *  test the if the font of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFont_Italic(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFontStyle_Italic(), true));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof WrappingLabel);
				Assert.assertEquals("the Font police is not refreshed", SWT.ITALIC,((FontData)((WrappingLabel)fig).getFont().getFontData()[0]).getStyle());
			}
		}

	}
	
	/**
	 *  test the if the font of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFont_Bold(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFontStyle_Bold(), true));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof WrappingLabel);
				Assert.assertEquals("the Font police is not refreshed", SWT.BOLD,((FontData)((WrappingLabel)fig).getFont().getFontData()[0]).getStyle());
			}
		}

	}
	/**
	 *  test the if the font height of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFontHeight(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Transparency(), 50));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		command=  new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFillStyle_Gradient(), null));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertEquals("the transparency is not refreshed", 50,((NodeFigure)fig).getTransparency());

	}
	
	/**
	 *  test the if the font height of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFont_Underline(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFontStyle_Underline(), true));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Wrappinglabel", fig instanceof WrappingLabel);
				Assert.assertEquals("the Font police is not refreshed", true,((WrappingLabel)fig).isTextUnderlined());
			}
		}


	}
	
	/**
	 *  test the if the font height of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFont_StrikeThrough(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFontStyle_StrikeThrough(), true));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Wrappinglabel", fig instanceof WrappingLabel);
				Assert.assertEquals("the Font police is not refreshed", true,((WrappingLabel)fig).isTextStrikedThrough());
			}
		}


	}
	

	/**
	 *  test the if the font height of the contained label is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testFont_FontColor(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command= new EMFtoGEFCommandWrapper(SetCommand.create(createdEditpart.getEditingDomain(), shape, NotationPackage.eINSTANCE.getFontStyle_FontColor(), FigureUtilities.RGBToInteger(new RGB(0, 255, 0))));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Wrappinglabel", fig instanceof WrappingLabel);
				Assert.assertEquals("the Font police is not refreshed", Display.getDefault().getSystemColor(SWT.COLOR_GREEN),((WrappingLabel)fig).getForegroundColor());
			}
		}


	}
/**
 *  test the if the icon of the contained label is refreshed on the figure
 * @param createdEditpart
 */
	public  void testElementIcon(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command=new EMFtoGEFCommandWrapper( AnnotationStyleProvider.getSetElementIconCommand(createdEditpart.getEditingDomain(), shape, true));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		if(!( createdEditpart instanceof ITextAwareEditPart)){
			EditPart nameEditpart =createdEditpart.getPrimaryChildEditPart();
			if( nameEditpart instanceof ITextAwareEditPart){
				IFigure fig = getPrimaryFigure((GraphicalEditPart)nameEditpart);
				Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof WrappingLabel);
				Assert.assertNotNull("icon of the label is not refreshed", ((WrappingLabel)fig).getIcon());
			}
		}
	}
	/**
	 *  test the if the shadow is refreshed on the figure
	 * @param createdEditpart
	 */
	public  void testShadow(GraphicalEditPart createdEditpart){
		View view=createdEditpart.getNotationView();
		assertTrue("view must be instance of Shape",view instanceof Shape);
		Shape shape= (Shape)view;
		command=new EMFtoGEFCommandWrapper( AnnotationStyleProvider.getSetShadowCommand(createdEditpart.getEditingDomain(), shape, true));
		Assert.assertTrue("the command must be executable", command.canExecute());
		executeOnUIThread(command);
		createdEditpart.refresh();
		createdEditpart.isActive();
		IFigure fig = getPrimaryFigure(createdEditpart);
		Assert.assertTrue("Figure must be an instance of Nodefigure", fig instanceof NodeFigure);
		Assert.assertTrue("the shadow is not refreshed",((NodeFigure)fig).getBorder() instanceof RectangularShadowBorder);
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
		testFont_FontColor(createdEditpart);
		testFont_StrikeThrough(createdEditpart);
		testFont_Underline(createdEditpart);
		testElementIcon(createdEditpart);
		testShadow(createdEditpart);
		testFont_Italic(createdEditpart);
		testFont_Bold(createdEditpart);


	}
}
