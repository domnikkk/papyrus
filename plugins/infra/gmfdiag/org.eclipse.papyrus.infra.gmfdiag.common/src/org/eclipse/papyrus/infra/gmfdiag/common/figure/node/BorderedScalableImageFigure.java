/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *  Mickaël ADAM (ALL4TEC) - mickael.adam@all4tec.net - implementation of layout BorderedLayoutManager to provide maintain ratio
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.figure.node;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.FigureUtils;

/**
 * Scalable Image figure that will be aligned in the middle/center and keep its own ratio.
 *
 * It is also used to serve as specific implementation in Papyrus, as debug items can be easily added.
 */
public class BorderedScalableImageFigure extends ScalableImageFigure {

	public BorderedScalableImageFigure(RenderedImage renderedImage, boolean useDefaultImageSize, boolean useOriginalColors, boolean antiAlias) {
		super(renderedImage, useDefaultImageSize, useOriginalColors, antiAlias);
		//		setBorder(new LineBorder(ColorConstants.red, 1));
		//set a layout managger to overide maintain ratio
		setLayoutManager(new BorderedLayoutManager());
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		//Get the parent bounds
		Rectangle parentBounds = getParent().getBounds().getCopy();
		//set the clip of the graphics to the parent clip
		graphics.setClip(parentBounds);
		super.paintFigure(graphics);
	}

	class BorderedLayoutManager extends AbstractLayout {

		/**
		 * @see org.eclipse.draw2d.LayoutManager#layout(org.eclipse.draw2d.IFigure)
		 *
		 * @param container
		 */
		@Override
		public void layout(IFigure container) {

			//if there is aspect ratio and only one figure is set
			if(isMaintainAspectRatio() && container.getParent().getChildren().size() == 1) {
				//If the ration is maintained
				ScalableCompartmentFigure scalableCompartmentFigure = FigureUtils.findParentFigureInstance(container, ScalableCompartmentFigure.class);

				Rectangle scalableCompartmentBounds = scalableCompartmentFigure != null ? scalableCompartmentBounds = scalableCompartmentFigure.getBounds() : container.getBounds();

				double scale = scalableCompartmentBounds.preciseWidth() / scalableCompartmentBounds.preciseHeight();
				Point center = new Point(scalableCompartmentBounds.x + scalableCompartmentBounds.width / 2, scalableCompartmentBounds.y + scalableCompartmentBounds.height / 2);

				int width = 0;
				int height = 0;
				int y = 0;
				int x = 0;

				//Case width>height
				if(scalableCompartmentBounds.width > scalableCompartmentBounds.height) {
					width = (int)(scalableCompartmentBounds.preciseWidth() / scale);
					height = scalableCompartmentBounds.height;
					y = scalableCompartmentBounds.y;
					x = center.x - width / 2;
				} else {
					//Case height>width
					width = scalableCompartmentBounds.width;
					height = (int)(scalableCompartmentBounds.preciseHeight() * scale);
					y = center.y - height / 2;
					x = scalableCompartmentBounds.x;
				}

				container.setBounds(new Rectangle(x, y, width, height));
			}
			//Look for a ScrollBarPane to hide ScrollPane
			IFigure parentFigure = container;
			while(!(parentFigure instanceof ScrollPane) && parentFigure.getParent() != null) {
				parentFigure = parentFigure.getParent();
			}
			//Hide the ScrollBar if a ScrollPan is found
			if(parentFigure instanceof ScrollPane) {
				((ScrollPane)parentFigure).setScrollBarVisibility(org.eclipse.draw2d.ScrollPane.NEVER);
			}

		}

		/**
		 * @see org.eclipse.draw2d.AbstractLayout#calculatePreferredSize(org.eclipse.draw2d.IFigure, int, int)
		 *
		 * @param container
		 * @param wHint
		 * @param hHint
		 * @return
		 */
		@Override
		protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
