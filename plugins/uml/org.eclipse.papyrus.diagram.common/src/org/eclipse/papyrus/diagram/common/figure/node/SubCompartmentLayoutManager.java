/****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Patrick Tessier (CEA LIST), Thibault Landre (Atos Origin) - Initial API and implementation
 *	
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.figure.node;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

/**
 * this is the layout manager in charge to place element in compartment element
 * 
 */
public class SubCompartmentLayoutManager extends AbstractLayout {

	protected final static int NORMAL_COMPARTMENT_HEIGHT = 13;

	protected final static int MINIMUM_COMPARTMENT_HEIGHT = 5;

	protected final static int MINIMUM_COMPARTMENT_WIDTH = 20;

	protected int preferedHeight = MINIMUM_COMPARTMENT_HEIGHT;

	@Override
	protected Dimension calculatePreferredSize(IFigure figure, int wHint, int hHint) {
		Dimension dim = new Dimension(MINIMUM_COMPARTMENT_WIDTH, NORMAL_COMPARTMENT_HEIGHT);
		if(!figure.getChildren().isEmpty()) {
			Object compartment = figure.getChildren().get(0);
			if(compartment instanceof ResizableCompartmentFigure) {

				ResizableCompartmentFigure resizableCompartmentFigure = (ResizableCompartmentFigure)compartment;
				ScrollPane scrollPane = resizableCompartmentFigure.getScrollPane();
				IFigure contents = scrollPane.getContents();
				dim.width = Math.max(MINIMUM_COMPARTMENT_WIDTH, resizableCompartmentFigure.getPreferredSize().width);
				if(!contents.getChildren().isEmpty()) {
					dim.height = Math.max(MINIMUM_COMPARTMENT_HEIGHT, resizableCompartmentFigure.getPreferredSize().height);
				} else {
					dim.height = MINIMUM_COMPARTMENT_HEIGHT;
				}
			}else{
				dim = figure.getPreferredSize();
			}
		}
		return dim;
	}
	
//	/**
//	 * obtain a prefered size
//	 * 
//	 * @param figure
//	 *        that can contain a GMF compartment figure
//	 * @return a the size
//	 */
//	public Dimension getPreferedSize(IFigure figure) {
//		Dimension dim = figure.getPreferredSize();
//		if(figure.getChildren().size() > 0) {
//			Object compartment = figure.getChildren().get(0);
//			if(compartment instanceof ResizableCompartmentFigure) {
//				dim.height = ((ResizableCompartmentFigure)compartment).getPreferredSize().height + 10;
//				if(dim.height == 0) {
//					dim.height = MINIMUM_COMPARTMENT_HEIGHT;
//				}
//
//			}
//		}
//		return dim;
//	}

	@Override
	public Dimension getMinimumSize(IFigure container, int wHint, int hHint) {
		return new Dimension(MINIMUM_COMPARTMENT_WIDTH, MINIMUM_COMPARTMENT_HEIGHT);
	}

	public void layout(IFigure container) {
		for(int i = 0; i < container.getChildren().size(); i++) {
			IFigure child = ((IFigure)container.getChildren().get(i));
			Rectangle bound = new Rectangle(child.getBounds());
			bound.setSize(getPreferedSize(child));
			bound.x = container.getBounds().x;
			bound.width = container.getBounds().width;
			if(i > 0) {
				bound.y = ((IFigure)container.getChildren().get(i - 1)).getBounds().getBottomLeft().y + 1;
			} else {
				bound.y = container.getBounds().y;
			}
			child.setBounds(bound);
		}
		// container
		int containersize = container.getChildren().size();
		if(containersize > 0) {
			IFigure lastChild = (IFigure)container.getChildren().get(containersize - 1);
			Rectangle lastRectangle = lastChild.getBounds();
			lastRectangle.height = container.getBounds().y + container.getBounds().height - lastRectangle.y;
			lastRectangle.width = container.getBounds().width;
			lastChild.setBounds(lastRectangle);
		}
	}

	public Dimension getPreferedSize(IFigure figure) {
		return calculatePreferredSize(figure, -1, -1);
	}

	/**
	 * Sets the constraint for the given figure.
	 * 
	 * @param child
	 *        the child
	 * @param constraint
	 *        the child's new constraint
	 */
	@Override
	public void setConstraint(IFigure child, Object constraint) {
		if(constraint instanceof Rectangle && ((Rectangle)constraint).height > NORMAL_COMPARTMENT_HEIGHT) {
			preferedHeight = ((Rectangle)constraint).height;
		} else {
			preferedHeight = NORMAL_COMPARTMENT_HEIGHT;
		}
		invalidate(child);
	}

}
