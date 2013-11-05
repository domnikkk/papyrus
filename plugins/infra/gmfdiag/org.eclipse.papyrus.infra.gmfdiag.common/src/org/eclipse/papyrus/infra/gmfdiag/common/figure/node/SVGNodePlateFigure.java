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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.figure.node;

import java.util.ArrayList;

import org.apache.batik.dom.svg.AbstractSVGPathSegList.SVGPathSegMovetoLinetoItem;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGAnimatedLength;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLength;
import org.w3c.dom.svg.SVGPathElement;
import org.w3c.dom.svg.SVGPathSeg;
import org.w3c.dom.svg.SVGPathSegList;
import org.w3c.dom.svg.SVGSVGElement;

/**
 * this figure is used to make links following SVG shape
 * 
 * 
 */
public class SVGNodePlateFigure extends DefaultSizeNodeFigure {

	protected SVGPathSegList pathSegList = null;

	protected SVGDocument svgDocument = null;

	protected DefaultSizeNodeFigure defaultNodePlate;


	/**
	 * associate the SVG document that represent the SVG
	 * 
	 * @param svgDocument
	 *        the SVG document
	 */
	public void setSVGDocument(SVGDocument svgDocument) {
		if(svgDocument == null) {
			this.svgDocument = null;
			this.pathSegList = null;
		} else {
			this.svgDocument = svgDocument;
			Element path = svgDocument.getElementById("PapyrusPath");
			if(path != null) {
				SVGPathElement svgPath = (SVGPathElement)path;
				SVGPathSegList segmentList = svgPath.getPathSegList();
				this.setSegemntList(segmentList);
			}
		}
	}

	/**
	 * set the node plate that is wrapped by it.
	 * 
	 * @param defaultNodePlate
	 */
	public void setDefaultNodePlate(IFigure defaultNodePlate) {
		if(defaultNodePlate instanceof DefaultSizeNodeFigure) {
			this.defaultNodePlate = (DefaultSizeNodeFigure)defaultNodePlate;
			this.setDefaultSize(((DefaultSizeNodeFigure)defaultNodePlate).getDefaultSize());
		}
		if(defaultNodePlate instanceof ICustomNodePlate) {
			((ICustomNodePlate)this.defaultNodePlate).setSVGNodePlateContainer(this);
		}
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param width
	 * @param height
	 */
	public SVGNodePlateFigure(int width, int height) {
		super(width, height);
	}

	/**
	 * set the papyrus path to follow the shape
	 * 
	 * @param pathSegList
	 */

	public void setSegemntList(SVGPathSegList pathSegList) {
		this.pathSegList = pathSegList;
	}

	public boolean containShapeCompatment() {
		if(this.getChildren().size() > 0 && this.getChildren().get(0) instanceof IFigure) {
			IFigure primaryShape = (IFigure)this.getChildren().get(0);
			for(Object subFigure : primaryShape.getChildren()) {
				if(subFigure instanceof ScalableCompartmentFigure) {
					return true;
				}
			}
		}
		return false;
	}

	public IFigure getShapeCompatment() {
		if(this.getChildren().size() > 0 && this.getChildren().get(0) instanceof IFigure) {
			IFigure primaryShape = (IFigure)this.getChildren().get(0);
			for(Object subFigure : primaryShape.getChildren()) {
				if(subFigure instanceof ScalableCompartmentFigure) {
					return (IFigure)subFigure;
				}
			}
		}
		return null;
	}


	// This returns as the anchoring area only the central line
	@Override
	public PointList getPolygonPoints() {
		if(this.pathSegList == null) {
			if(defaultNodePlate != null) {
				defaultNodePlate.setBounds(this.getBounds());
				return defaultNodePlate.getPolygonPoints();
			}
			return super.getPolygonPoints();
		}
		double svgWidth = 0;
		double svgHeight = 0;
		SVGSVGElement svgElement = svgDocument.getRootElement();
		if(svgElement != null) {
			SVGAnimatedLength widthALength = svgElement.getWidth();
			SVGAnimatedLength heightALength = svgElement.getHeight();
			if(widthALength != null && heightALength != null) {
				SVGLength svgWidthLength = widthALength.getBaseVal();
				SVGLength svgHeightLength = heightALength.getBaseVal();
				if(svgWidthLength != null && svgHeightLength != null) {
					//	if( width.getUnitType()==width.SVG_LENGTHTYPE_PX){
					svgWidth = svgWidthLength.getValueInSpecifiedUnits();
					svgHeight = svgHeightLength.getValueInSpecifiedUnits();
					//	}
				}
			}
		}

		//transform coordinate to absolute in the context of the SVG
		//getBounds
		ArrayList<PrecisionPoint> pointList = new ArrayList<PrecisionPoint>();

		//current absolute coordinates
		float currentAbsoluteSVGPositionX = 0;
		float currentAbsoluteSVGPositionY = 0;
		for(int i = 0; i < pathSegList.getNumberOfItems(); i++) {
			SVGPathSeg seg = pathSegList.getItem(i);
			if(seg instanceof SVGPathSegMovetoLinetoItem) {
				SVGPathSegMovetoLinetoItem linetoItem = (SVGPathSegMovetoLinetoItem)seg;
				//short value =linetoItem.getPathSegType();
				String letter = linetoItem.getPathSegTypeAsLetter();
				float x = linetoItem.getX();
				float y = linetoItem.getY();
				//	System.out.println("value="+value +" letter="+letter+ " x="+ x+ " y="+y);
				if(letter.equals("M")) {
					currentAbsoluteSVGPositionX = x;
					currentAbsoluteSVGPositionY = y;
					pointList.add(new PrecisionPoint(currentAbsoluteSVGPositionX, currentAbsoluteSVGPositionY));
				} else if(letter.equals("m")) {
					currentAbsoluteSVGPositionX = currentAbsoluteSVGPositionX + x;
					currentAbsoluteSVGPositionY = currentAbsoluteSVGPositionY + y;
					pointList.add(new PrecisionPoint(currentAbsoluteSVGPositionX, currentAbsoluteSVGPositionY));
				} else if(letter.equals("L")) {
					currentAbsoluteSVGPositionX = x;
					currentAbsoluteSVGPositionY = y;
					pointList.add(new PrecisionPoint(currentAbsoluteSVGPositionX, currentAbsoluteSVGPositionY));
				} else if(letter.equals("l")) {
					currentAbsoluteSVGPositionX = currentAbsoluteSVGPositionX + x;
					currentAbsoluteSVGPositionY = currentAbsoluteSVGPositionY + y;
					pointList.add(new PrecisionPoint(currentAbsoluteSVGPositionX, currentAbsoluteSVGPositionY));
				}
			} else {
				System.err.println("this is not i linear segment " + i);
			}
		}


		//get the original size of SVG
		double maxWitdh = 0;
		double maxHeight = 0;
		if(svgWidth != 0 && svgHeight != 0) {
			maxWitdh = svgWidth;
			maxHeight = svgHeight;
		} else {
			for(int i = 0; i < pointList.size(); i++) {
				PrecisionPoint point = pointList.get(i);
				if(point.preciseX() > maxWitdh) {
					maxWitdh = point.preciseX();
				}
				if(point.preciseY() > maxHeight) {
					maxHeight = point.preciseY();
				}
			}
		}
		//System.out.println("Size of the SVG figure is= "+maxHeight +" "+maxHeight);
		PointList points = new PointList(5);
		Rectangle anchorableRectangle = null;
		if(containShapeCompatment()) {
			anchorableRectangle = getShapeCompatment().getBounds();
		}

		else {
			anchorableRectangle = getHandleBounds();
		}
		double ratioX = anchorableRectangle.width / maxWitdh;
		double ratioY = anchorableRectangle.height / maxHeight;
		//PackageFigure packageFigure = getPackageFigure();
		//System.out.println("Begin-------------" );

		for(int i = 0; i < pointList.size(); i++) {
			PrecisionPoint point = pointList.get(i);
			double x = point.preciseX() * ratioX;
			double y = point.preciseY() * ratioY;
			points.addPoint(anchorableRectangle.x + (int)x, anchorableRectangle.y + (int)y);
			//System.out.println("add point x="+x +" y=" +y +" ratioX= "+ratioX+" ratioY="+ratioY );
		}
		//System.out.println("End-------------" );
		return points;
	}
}
