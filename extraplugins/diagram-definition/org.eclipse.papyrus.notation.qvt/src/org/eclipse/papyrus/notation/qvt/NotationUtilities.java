/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.notation.qvt;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionDimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ContainmentSubLinkEditPart;
import org.eclipse.papyrus.uml.diagram.common.figure.node.ConstraintFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.NodeNamedElementFigure;
import org.eclipse.swt.widgets.Shell;

public class NotationUtilities {

	private static Map<Diagram, DiagramEditPart> cache = new HashMap<Diagram, DiagramEditPart>();

	public void renderDiagram(Diagram diagram) {
		if (!cache.containsKey(diagram)) {
			DiagramEditPart editpart = OffscreenEditPartFactory.getInstance().createDiagramEditPart(diagram, new Shell());
			cache.put(diagram, editpart);
		}
	}

	public void disposeDiagram(Diagram diagram) {
		if (cache.containsKey(diagram)) {
			DiagramEditPart editpart = cache.get(diagram);
			editpart.getViewer().getControl().getParent().dispose();
		}
	}

	public Bounds getBounds(Node node) {
		if (cache.containsKey(node.getDiagram())) {
			DiagramEditPart editpart = cache.get(node.getDiagram());
			GraphicalEditPart nodeEditPart = (GraphicalEditPart) editpart.getViewer().getEditPartRegistry().get(node);
			IFigure figure = nodeEditPart.getFigure();
			Rectangle r = figure.getBounds();
			figure.translateToAbsolute(r);

			// special cases
			if (figure.getParent() instanceof NodeNamedElementFigure) {
				NodeNamedElementFigure parent = (NodeNamedElementFigure) figure.getParent();
				IFigure tagLabel = parent.getTaggedLabel();
				if (tagLabel != null) {
					Rectangle tagRect = tagLabel.getBounds();
					tagLabel.translateToAbsolute(tagRect);
					r = tagRect.union(r);
				}
			}
			else if (figure instanceof ConstraintFigure) {
				r = ((IFigure) figure.getChildren().get(1)).getBounds();
				((IFigure) figure.getChildren().get(1)).translateToAbsolute(r);
			}

			Bounds b = NotationFactory.eINSTANCE.createBounds();
			b.setX(r.x);
			b.setY(r.y);
			b.setWidth(r.width);
			b.setHeight(r.height);
			return b;
		}
		return null;
	}

	public LinkedHashSet<Location> getPoints(Edge edge) {
		if (cache.containsKey(edge.getDiagram())) {
			DiagramEditPart editpart = cache.get(edge.getDiagram());
			ConnectionEditPart edgeEditPart = (ConnectionEditPart) editpart.getViewer().getEditPartRegistry().get(edge);
			PointList pl = ((Connection) edgeEditPart.getFigure()).getPoints();

			// special cases
			if (edge.getType().equals(String.valueOf(ContainmentSubLinkEditPart.VISUAL_ID))) {
				Point p0 = pl.getPoint(0);
				Point p1 = pl.getPoint(1);
				double m = p1.getDistance(p0);
				Dimension d = p1.getDifference(p0);
				PrecisionDimension u = new PrecisionDimension(d.width / m, d.height / m);
				Point f = p0.translate(u.scale(-19));
				pl.insertPoint(f, 0);
			}

			LinkedHashSet<Location> points = new LinkedHashSet<Location>();
			for (int i = 0; i < pl.size(); i++) {
				Point p = pl.getPoint(i);
				Location point = NotationFactory.eINSTANCE.createLocation();
				point.setX(p.x);
				point.setY(p.y);
				points.add(point);
			}

			return points;
		}
		return null;
	}
}
