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
package org.eclipse.papyrus.dd.dg.editor;

import java.awt.Color;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.dom.svg.SVGOMDocument;
import org.apache.batik.svggen.SVGSyntax;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.dd.dc.Bounds;
import org.eclipse.papyrus.dd.dc.DCPackage;
import org.eclipse.papyrus.dd.dc.Dimension;
import org.eclipse.papyrus.dd.dc.Point;
import org.eclipse.papyrus.dd.dg.Canvas;
import org.eclipse.papyrus.dd.dg.Circle;
import org.eclipse.papyrus.dd.dg.ClipPath;
import org.eclipse.papyrus.dd.dg.ClosePath;
import org.eclipse.papyrus.dd.dg.CubicCurveTo;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Definition;
import org.eclipse.papyrus.dd.dg.Definitions;
import org.eclipse.papyrus.dd.dg.Ellipse;
import org.eclipse.papyrus.dd.dg.EllipticalCurveTo;
import org.eclipse.papyrus.dd.dg.FontDecoration;
import org.eclipse.papyrus.dd.dg.Gradient;
import org.eclipse.papyrus.dd.dg.GradientStop;
import org.eclipse.papyrus.dd.dg.GraphicalElement;
import org.eclipse.papyrus.dd.dg.Group;
import org.eclipse.papyrus.dd.dg.Image;
import org.eclipse.papyrus.dd.dg.Line;
import org.eclipse.papyrus.dd.dg.LineTo;
import org.eclipse.papyrus.dd.dg.LinearGradient;
import org.eclipse.papyrus.dd.dg.MarkedElement;
import org.eclipse.papyrus.dd.dg.Marker;
import org.eclipse.papyrus.dd.dg.Matrix;
import org.eclipse.papyrus.dd.dg.MoveTo;
import org.eclipse.papyrus.dd.dg.Paint;
import org.eclipse.papyrus.dd.dg.PaintServer;
import org.eclipse.papyrus.dd.dg.Path;
import org.eclipse.papyrus.dd.dg.PathCommand;
import org.eclipse.papyrus.dd.dg.Pattern;
import org.eclipse.papyrus.dd.dg.Polygon;
import org.eclipse.papyrus.dd.dg.Polyline;
import org.eclipse.papyrus.dd.dg.QuadraticCurveTo;
import org.eclipse.papyrus.dd.dg.RadialGradient;
import org.eclipse.papyrus.dd.dg.Rectangle;
import org.eclipse.papyrus.dd.dg.RootCanvas;
import org.eclipse.papyrus.dd.dg.Rotate;
import org.eclipse.papyrus.dd.dg.Scale;
import org.eclipse.papyrus.dd.dg.Skew;
import org.eclipse.papyrus.dd.dg.Style;
import org.eclipse.papyrus.dd.dg.StyleRule;
import org.eclipse.papyrus.dd.dg.StyleSelector;
import org.eclipse.papyrus.dd.dg.StyleSheet;
import org.eclipse.papyrus.dd.dg.Text;
import org.eclipse.papyrus.dd.dg.Transform;
import org.eclipse.papyrus.dd.dg.Translate;
import org.eclipse.papyrus.dd.dg.Use;
import org.eclipse.papyrus.dd.dg.util.DGSwitch;
import org.eclipse.papyrus.dd.editor.DDEditorPlugin;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGTextElement;

/**
 * This class converts a DG model resource into a SVG document
 */
public class DGToSVGConverter extends DGSwitch<Object> implements SVGSyntax {

	/**
	 * This is the CSS background-color property
	 */
	public static final String SVG_BACKGROUND_COLOR_ATTRIBUTE = "background-color";

	/**
	 * This is the CSS text-decoration property
	 */
	public static final String SVG_TEXT_DECORATION_ATTRIBUTE = "text-decoration";

	/**
	 * This is the CSS marker-start property
	 */
	public static final String SVG_MARKER_START_ATTRIBUTE = "marker-start";

	/**
	 * This is the CSS marker-mid property
	 */
	public static final String SVG_MARKER_MID_ATTRIBUTE = "marker-mid";

	/**
	 * This is the CSS marker-end property
	 */
	public static final String SVG_MARKER_END_ATTRIBUTE = "marker-end";

	/**
	 * This is the created SVG document
	 */
	private SVGOMDocument svgDocument;

	/**
	 * This is a cache used in the conversion process
	 */
	private Map<EObject, Object> cache = new HashMap<EObject, Object>();

	/**
	 * Constructs a new DG to SVG converter instance
	 */
	public DGToSVGConverter() {
		super();
	}

	/**
	 * Converts a given DG model resource to a corresponding SVG document
	 * 
	 * @param resource
	 *            The DG model resource
	 * @return The SVG document
	 */
	public SVGOMDocument convert(Resource resource) {
		if (resource == null)
			return null;

		// create a new SVG document
		final DOMImplementation impl = SVGDOMImplementation
				.getDOMImplementation();
		svgDocument = (SVGOMDocument) impl.createDocument(SVG_NAMESPACE_URI,
				SVG_SVG_TAG, null);

		// establish a base URL for the SVG document to resolve relative links
		URL url = DDEditorPlugin.getPlugin().getBundle().getEntry("/svg");
		svgDocument.setURLObject(url);

		// iterate over all contents and convert them
		for (TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
				resource, true); iterator.hasNext();)
			doSwitch(iterator.next());

		return svgDocument;
	}

	/**
	 * Converts a <code>Color</code> to a string
	 * 
	 * @param c
	 *            The color to convert
	 * @return The string encoding of the color
	 */
	protected String convertColorToString(Color c) {
		return String.format("#%02X%02X%02X", c.getRed(), c.getGreen(),
				c.getBlue());
	}

	/**
	 * Converts a <code>Double</code> to a string
	 * 
	 * @param d
	 *            The double value
	 * @return The string encoding of the double
	 */
	protected static String convertDoubleToString(Double d) {
		DecimalFormat f = new DecimalFormat("#.00");
		return f.format(d);
	}

	/**
	 * Converts a <code>Double</code> to a string
	 * 
	 * @param d
	 *            The double value
	 * @return The string encoding of the double
	 */
	protected static String convertReferenceToURI(EObject reference) {
		return "url(" + EcoreUtil.getURI(reference) + ")";
	}

	/**
	 * Stores in the cache a mapping from theEObject to object
	 * 
	 * @param theEObject
	 *            The key of the mapping
	 * @param object
	 *            The value of the mapping
	 * @return the value of the mapping
	 */
	protected <S> S map(EObject theEObject, S object) {
		cache.put(theEObject, object);
		return object;
	}

	/**
	 * Looks up in the cache a mapping from theEObject to object
	 * 
	 * @param theEObject
	 *            The key of the mapping
	 * @return the value of the mapping
	 */
	protected Object lookup(EObject theEObject) {
		return cache.get(theEObject);
	}

	/**
	 * Get the SVG parent element that corresponds to the given DG child element
	 * 
	 * @param member
	 *            The child element
	 * @return The parent element
	 */
	protected Element getParentElement(EObject child) {
		return (Element) doSwitch(child.eContainer());
	}

	@Override
	public Object doSwitch(EObject theEObject) {
		Object value;
		if (cache.containsKey(theEObject))
			value = cache.get(theEObject);
		else
			value = super.doSwitch(theEObject);
		return (value instanceof StringBuffer) ? value.toString() : value;
	}

	@Override
	public Object defaultCase(EObject object) {
		return cache.get(object);
	}

	@Override
	public Object caseCanvas(Canvas object) {
		Element svg = (Element) lookup(object);

		if (svg == null) {
			svg = map(object,
					svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_SVG_TAG));
			getParentElement(object).appendChild(svg);
		}

		if (object.getBounds() != null) {
			Bounds bounds = object.getBounds();
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__X))
				svg.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(bounds.getX()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__Y))
				svg.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(bounds.getY()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__WIDTH))
				svg.setAttribute(SVG_WIDTH_ATTRIBUTE,
						convertDoubleToString(bounds.getWidth()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__HEIGHT))
				svg.setAttribute(SVG_HEIGHT_ATTRIBUTE,
						convertDoubleToString(bounds.getHeight()));
		}

		return super.caseCanvas(object);
	}

	@Override
	public Object caseCircle(Circle object) {
		Element circle = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_CIRCLE_TAG));
		getParentElement(object).appendChild(circle);

		if (object.getCenter() != null) {
			Point center = object.getCenter();
			if (center.eIsSet(DCPackage.Literals.POINT__X))
				circle.setAttribute(SVG_CX_ATTRIBUTE,
						convertDoubleToString(center.getX()));
			if (center.eIsSet(DCPackage.Literals.POINT__Y))
				circle.setAttribute(SVG_CY_ATTRIBUTE,
						convertDoubleToString(center.getY()));
		}

		if (object.eIsSet(DGPackage.Literals.CIRCLE__RADIUS))
			circle.setAttribute(SVG_R_ATTRIBUTE,
					convertDoubleToString(object.getRadius()));

		return super.caseCircle(object);
	}

	@Override
	public Object caseClipPath(ClipPath object) {
		Element clipPath = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_CLIP_PATH_TAG));
		getParentElement(object).appendChild(clipPath);

		return super.caseClipPath(object);
	}

	@Override
	public Object caseClosePath(ClosePath object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "z" : "Z");

		return super.caseClosePath(object);
	}

	@Override
	public Object caseCubicCurveTo(CubicCurveTo object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "c" : "C");
		if (object.getStartControl() != null) {
			Point start = object.getStartControl();
			sb.append(convertDoubleToString(start.getX()) + ","
					+ convertDoubleToString(start.getY()));
		}
		sb.append(" ");
		if (object.getEndControl() != null) {
			Point end = object.getEndControl();
			sb.append(convertDoubleToString(end.getX()) + ","
					+ convertDoubleToString(end.getY()));
		}
		sb.append(" ");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		}

		return super.caseCubicCurveTo(object);
	}

	@Override
	public Object caseDefinition(Definition object) {
		Element definition = (Element) lookup(object);

		if (object.getId() != null) {
			definition.setAttribute(SVG_ID_ATTRIBUTE, object.getId());
		}

		return super.caseDefinition(object);
	}

	@Override
	public Object caseDefinitions(Definitions object) {
		Element defs = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_DEFS_TAG));
		getParentElement(object).appendChild(defs);

		return super.caseDefinitions(object);
	}

	@Override
	public Object caseEllipse(Ellipse object) {
		Element ellipse = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_ELLIPSE_TAG));
		getParentElement(object).appendChild(ellipse);

		if (object.getCenter() != null) {
			Point center = object.getCenter();
			if (center.eIsSet(DCPackage.Literals.POINT__X))
				ellipse.setAttribute(SVG_CX_ATTRIBUTE,
						convertDoubleToString(center.getX()));
			if (center.eIsSet(DCPackage.Literals.POINT__Y))
				ellipse.setAttribute(SVG_CY_ATTRIBUTE,
						convertDoubleToString(center.getX()));
		}

		if (object.getRadii() != null) {
			Dimension radii = object.getRadii();
			if (radii.eIsSet(DCPackage.Literals.DIMENSION__WIDTH))
				ellipse.setAttribute(SVG_RX_ATTRIBUTE,
						convertDoubleToString(radii.getWidth()));
			if (radii.eIsSet(DCPackage.Literals.DIMENSION__HEIGHT))
				ellipse.setAttribute(SVG_RY_ATTRIBUTE,
						convertDoubleToString(radii.getHeight()));
		}

		return super.caseEllipse(object);
	}

	@Override
	public Object caseEllipticalCurveTo(EllipticalCurveTo object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "a" : "A");
		if (object.getRadii() != null) {
			Dimension radii = object.getRadii();
			sb.append(convertDoubleToString(radii.getWidth()) + ","
					+ convertDoubleToString(radii.getHeight()));
		}
		sb.append(" ");
		sb.append(convertDoubleToString(object.getRotation()));
		sb.append(" ");
		sb.append(object.isLargeArc() ? "1" : "0");
		sb.append(",");
		sb.append(object.isSweep() ? "1" : "0");
		sb.append(" ");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		}

		return super.casePathCommand(object);
	}

	@Override
	public Object caseGradient(Gradient object) {
		return super.caseGradient(object);
	}

	@Override
	public Object caseGradientStop(GradientStop object) {
		Element stop = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_STOP_TAG));
		getParentElement(object).appendChild(stop);

		if (object.eIsSet(DGPackage.Literals.GRADIENT_STOP__OFFSET))
			stop.setAttribute(SVG_OFFSET_ATTRIBUTE,
					convertDoubleToString(object.getOpacity()));

		if (object.eIsSet(DGPackage.Literals.GRADIENT_STOP__COLOR))
			stop.setAttribute(SVG_STOP_COLOR_ATTRIBUTE,
					convertColorToString(object.getColor()));

		if (object.eIsSet(DGPackage.Literals.GRADIENT_STOP__OPACITY))
			stop.setAttribute(SVG_STOP_OPACITY_ATTRIBUTE,
					convertDoubleToString(object.getOpacity()));

		return super.caseGradientStop(object);
	}

	@Override
	public Object caseGraphicalElement(GraphicalElement object) {
		Element element = (Element) lookup(object);

		if (element != null) {
			String keywords = "";
			for (String keyword : object.getKeyword()) {
				keywords += (keywords.length() > 0) ? ", " : "";
				keywords += keyword;
			}
			if (keywords.length() > 0)
				element.setAttribute(SVG_CLASS_ATTRIBUTE, keywords);

			if (object.getStyle() != null) {
				String value = (String) doSwitch(object.getStyle());
				element.setAttribute(SVG_STYLE_ATTRIBUTE, value);
			}
		}

		return super.caseGraphicalElement(object);
	}

	@Override
	public Object caseGroup(Group object) {
		Element g = (Element) lookup(object);

		if (g == null) {
			g = map(object,
					svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_G_TAG));
			getParentElement(object).appendChild(g);
		}

		return super.caseGroup(object);
	}

	@Override
	public Object caseImage(Image object) {
		Element image = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_IMAGE_TAG));
		getParentElement(object).appendChild(image);

		if (object.getBounds() != null) {
			Bounds bounds = object.getBounds();
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__X))
				image.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(bounds.getX()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__Y))
				image.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(bounds.getY()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__WIDTH))
				image.setAttribute(SVG_WIDTH_ATTRIBUTE,
						convertDoubleToString(bounds.getWidth()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__HEIGHT))
				image.setAttribute(SVG_HEIGHT_ATTRIBUTE,
						convertDoubleToString(bounds.getHeight()));
		}

		if (object.getSource() != null) {
			image.setAttribute(XLINK_HREF_ATTRIBUTE, object.getSource());
		}

		if (object.eIsSet(DGPackage.Literals.IMAGE__IS_ASPECT_RATIO_PRESERVED)) {
			String preserve = object.isAspectRatioPreserved() ? "xMidYMid meet"
					: "none";
			image.setAttribute(SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE, preserve);
		}

		return super.caseImage(object);
	}

	@Override
	public Object caseLine(Line object) {
		Element line = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_LINE_TAG));
		getParentElement(object).appendChild(line);

		if (object.getStart() != null) {
			Point start = object.getStart();
			if (start.eIsSet(DCPackage.Literals.POINT__X))
				line.setAttribute(SVG_X1_ATTRIBUTE,
						convertDoubleToString(start.getX()));
			if (start.eIsSet(DCPackage.Literals.POINT__Y))
				line.setAttribute(SVG_Y1_ATTRIBUTE,
						convertDoubleToString(start.getY()));
		}

		if (object.getEnd() != null) {
			Point end = object.getEnd();
			if (end.eIsSet(DCPackage.Literals.POINT__X))
				line.setAttribute(SVG_X2_ATTRIBUTE,
						convertDoubleToString(end.getX()));
			if (end.eIsSet(DCPackage.Literals.POINT__Y))
				line.setAttribute(SVG_Y2_ATTRIBUTE,
						convertDoubleToString(end.getY()));
		}

		return super.caseLine(object);
	}

	@Override
	public Object caseLinearGradient(LinearGradient object) {
		Element gradient = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_LINEAR_GRADIENT_TAG));
		getParentElement(object).appendChild(gradient);

		if (object.getStart() != null) {
			Point start = object.getStart();
			if (start.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_X1_ATTRIBUTE,
						convertDoubleToString(start.getX()));
			if (start.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_Y1_ATTRIBUTE,
						convertDoubleToString(start.getY()));
		}

		if (object.getEnd() != null) {
			Point end = object.getEnd();
			if (end.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_X2_ATTRIBUTE,
						convertDoubleToString(end.getX()));
			if (end.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_Y2_ATTRIBUTE,
						convertDoubleToString(end.getY()));
		}

		return super.caseLinearGradient(object);
	}

	@Override
	public Object caseLineTo(LineTo object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "l" : "L");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		}

		return super.caseLineTo(object);
	}

	@Override
	public Object caseMarkedElement(MarkedElement object) {
		Element element = (Element) lookup(object);

		if (element != null) {
			if (object.getStartMarker() != null)
				element.setAttribute(SVG_MARKER_START_ATTRIBUTE,
						convertReferenceToURI(object.getStartMarker()));
			if (object.getMidMarker() != null)
				element.setAttribute(SVG_MARKER_MID_ATTRIBUTE,
						convertReferenceToURI(object.getMidMarker()));
			if (object.getEndMarker() != null)
				element.setAttribute(SVG_MARKER_END_ATTRIBUTE,
						convertReferenceToURI(object.getEndMarker()));
		}

		return super.caseMarkedElement(object);
	}

	@Override
	public Object caseMarker(Marker object) {
		Element marker = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_MARKER_TAG));
		getParentElement(object).appendChild(marker);

		return super.caseMarker(object);
	}

	@Override
	public Object caseMatrix(Matrix object) {
		// TODO Auto-generated method stub
		return super.caseMatrix(object);
	}

	@Override
	public Object caseMoveTo(MoveTo object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "m" : "M");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		}

		return super.caseMoveTo(object);
	}

	@Override
	public Object casePaint(Paint object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.eIsSet(DGPackage.Literals.PAINT__COLOR))
			sb.append(convertColorToString(object.getColor()));
		else if (object.getPaintServer() != null)
			sb.append(convertReferenceToURI(object.getPaintServer()));

		return super.casePaint(object);
	}

	@Override
	public Object casePaintServer(PaintServer object) {
		// TODO Auto-generated method stub
		return super.casePaintServer(object);
	}

	@Override
	public Object casePath(Path object) {
		Element path = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_PATH_TAG));
		getParentElement(object).appendChild(path);

		StringBuffer sb = new StringBuffer();
		for (PathCommand command : object.getCommand()) {
			String c = (String) doSwitch(command);
			sb.append(sb.length() > 0 ? " " : "");
			sb.append(c);
		}
		path.setAttribute(SVG_D_ATTRIBUTE, sb.toString());

		return super.casePath(object);
	}

	@Override
	public Object casePathCommand(PathCommand object) {
		return super.casePathCommand(object);
	}

	@Override
	public Object casePattern(Pattern object) {
		// TODO Auto-generated method stub
		return super.casePattern(object);
	}

	@Override
	public Object casePolygon(Polygon object) {
		Element polygon = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_POLYGON_TAG));
		getParentElement(object).appendChild(polygon);

		StringBuffer sb = new StringBuffer();
		for (Point point : object.getPoint()) {
			sb.append(sb.length() > 0 ? " " : "");
			sb.append(convertDoubleToString(point.getX()));
			sb.append(",");
			sb.append(convertDoubleToString(point.getY()));
		}
		polygon.setAttribute(SVG_POINTS_ATTRIBUTE, sb.toString());

		return super.casePolygon(object);
	}

	@Override
	public Object casePolyline(Polyline object) {
		Element polyline = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_POLYLINE_TAG));
		getParentElement(object).appendChild(polyline);

		StringBuffer sb = new StringBuffer();
		for (Point point : object.getPoint()) {
			sb.append(sb.length() > 0 ? " " : "");
			sb.append(convertDoubleToString(point.getX()));
			sb.append(",");
			sb.append(convertDoubleToString(point.getY()));
		}
		polyline.setAttribute(SVG_POINTS_ATTRIBUTE, sb.toString());

		return super.casePolyline(object);
	}

	@Override
	public Object caseQuadraticCurveTo(QuadraticCurveTo object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "q" : "Q");
		if (object.getControl() != null) {
			Point end = object.getControl();
			sb.append(convertDoubleToString(end.getX()) + ","
					+ convertDoubleToString(end.getY()));
		}
		sb.append(" ");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		}

		return super.caseQuadraticCurveTo(object);
	}

	@Override
	public Object caseRadialGradient(RadialGradient object) {
		Element gradient = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_RADIAL_GRADIENT_TAG));
		getParentElement(object).appendChild(gradient);

		if (object.eIsSet(DGPackage.Literals.RADIAL_GRADIENT__RADIUS)) {
			gradient.setAttribute(SVG_R_ATTRIBUTE,
					convertDoubleToString(object.getRadius()));
		}

		if (object.getCenter() != null) {
			Point center = object.getCenter();
			if (center.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_CX_ATTRIBUTE,
						convertDoubleToString(center.getX()));
			if (center.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_CY_ATTRIBUTE,
						convertDoubleToString(center.getY()));
		}

		if (object.getFocus() != null) {
			Point focus = object.getFocus();
			if (focus.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_FX_ATTRIBUTE,
						convertDoubleToString(focus.getX()));
			if (focus.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_FY_ATTRIBUTE,
						convertDoubleToString(focus.getY()));
		}

		return super.caseRadialGradient(object);
	}

	@Override
	public Object caseRectangle(Rectangle object) {
		Element rect = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_RECT_TAG));
		getParentElement(object).appendChild(rect);

		if (object.getBounds() != null) {
			Bounds bounds = object.getBounds();
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__X))
				rect.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(bounds.getX()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__Y))
				rect.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(bounds.getY()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__WIDTH))
				rect.setAttribute(SVG_WIDTH_ATTRIBUTE,
						convertDoubleToString(bounds.getWidth()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__HEIGHT))
				rect.setAttribute(SVG_HEIGHT_ATTRIBUTE,
						convertDoubleToString(bounds.getHeight()));
		}

		if (object.eIsSet(DGPackage.Literals.RECTANGLE__CORNER_RADIUS)) {
			rect.setAttribute(SVG_RX_ATTRIBUTE,
					convertDoubleToString(object.getCornerRadius()));
			rect.setAttribute(SVG_RY_ATTRIBUTE,
					convertDoubleToString(object.getCornerRadius()));
		}

		return super.caseRectangle(object);
	}

	@Override
	public Object caseRootCanvas(RootCanvas object) {
		Element svg = map(object, svgDocument.getDocumentElement());

		// for (StyleSheet externalStyleSheet : object.getStyleSheet()) {
		// TODO: handle external style sheets
		// }

		if (object.eIsSet(DGPackage.Literals.ROOT_CANVAS__BACKGROUND_COLOR)) {
			String background = convertColorToString(object
					.getBackgroundColor());
			svg.setAttribute(SVG_BACKGROUND_COLOR_ATTRIBUTE, background);
		}

		if (object.getDefinitions() != null) {
			doSwitch(object.getDefinitions());
		}

		return super.caseRootCanvas(object);
	}

	@Override
	public Object caseRotate(Rotate object) {
		// TODO Auto-generated method stub
		return super.caseRotate(object);
	}

	@Override
	public Object caseScale(Scale object) {
		// TODO Auto-generated method stub
		return super.caseScale(object);
	}

	@Override
	public Object caseSkew(Skew object) {
		// TODO Auto-generated method stub
		return super.caseSkew(object);
	}

	@Override
	public Object caseStyle(Style object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.eIsSet(DGPackage.Literals.STYLE__FILL)) {
			String value = (object.getFill() == null) ? "none"
					: ((String) doSwitch(object.getFill()));
			sb.append(SVG_FILL_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FILL_OPACITY)) {
			String value = convertDoubleToString(object.getFillOpacity());
			sb.append(SVG_FILL_OPACITY_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__STROKE)) {
			String value = (object.getStroke() == null) ? "none"
					: (String) doSwitch(object.getStroke());
			sb.append(SVG_STROKE_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__STROKE_OPACITY)) {
			String value = convertDoubleToString(object.getStrokeOpacity());
			sb.append(SVG_STROKE_OPACITY_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__STROKE_WIDTH)) {
			String value = convertDoubleToString(object.getStrokeWidth());
			sb.append(SVG_STROKE_WIDTH_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__STROKE_DASH_LENGTH)) {
			StringBuffer value = new StringBuffer();
			for (double d : object.getStrokeDashLength()) {
				value.append(value.length() > 0 ? ", " : "");
				value.append(convertDoubleToString(d));
			}
			sb.append(SVG_STROKE_DASHARRAY_ATTRIBUTE + ": " + value.toString()
					+ "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FONT_NAME)) {
			String value = "\"" + object.getFontName() + "\"";
			sb.append(SVG_FONT_FAMILY_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FONT_SIZE)) {
			String value = convertDoubleToString(object.getFontSize());
			sb.append(SVG_FONT_SIZE_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FONT_BOLD)) {
			String value = object.isFontBold() ? "bold" : "normal";
			sb.append(SVG_FONT_WEIGHT_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FONT_ITALIC)) {
			String value = object.isFontItalic() ? "italic" : "normal";
			sb.append(SVG_FONT_STYLE_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FONT_BOLD)) {
			String value = object.isFontBold() ? "bold" : "normal";
			sb.append(SVG_FONT_WEIGHT_ATTRIBUTE + ": " + value + "; ");
		}

		if (object.eIsSet(DGPackage.Literals.STYLE__FONT_DECORATION)) {
			FontDecoration fd = object.getFontDecoration();
			String value = "none";
			if (fd != null) {
				if (fd.equals(FontDecoration.UNDERLINE))
					value = "underline";
				else if (fd.equals(FontDecoration.OVERLINE))
					value = "overline";
				else if (fd.equals(FontDecoration.LINE_THROUGH))
					value = "line-through";
			}
			sb.append(SVG_TEXT_DECORATION_ATTRIBUTE + ": " + value + "; ");
		}

		return super.caseStyle(object);
	}

	@Override
	public Object caseStyleRule(StyleRule object) {
		StringBuffer sb = map(object, new StringBuffer());

		for (StyleSelector selector : object.getSelector()) {
			sb.append(sb.length() > 0 ? ", " : "");
			sb.append((String) doSwitch(selector));
		}

		if (object.getStyle() != null) {
			String style = (String) doSwitch(object.getStyle());
			sb.append(" { " + style + "}");
		}

		return super.caseStyleRule(object);
	}

	@Override
	public Object caseStyleSelector(StyleSelector object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.getType() != null) {
			EClass type = object.getType();
			if (DGPackage.Literals.CANVAS.equals(type))
				sb.append(SVG_SVG_TAG);
			else if (DGPackage.Literals.GROUP.equals(type))
				sb.append(SVG_G_TAG);
			else if (DGPackage.Literals.RECTANGLE.equals(type))
				sb.append(SVG_RECT_TAG);
			else if (DGPackage.Literals.CIRCLE.equals(type))
				sb.append(SVG_CIRCLE_TAG);
			else if (DGPackage.Literals.ELLIPSE.equals(type))
				sb.append(SVG_ELLIPSE_TAG);
			else if (DGPackage.Literals.TEXT.equals(type))
				sb.append(SVG_TEXT_TAG);
			else if (DGPackage.Literals.LINE.equals(type))
				sb.append(SVG_LINE_TAG);
			else if (DGPackage.Literals.POLYGON.equals(type))
				sb.append(SVG_POLYGON_TAG);
			else if (DGPackage.Literals.POLYLINE.equals(type))
				sb.append(SVG_POLYLINE_TAG);
			else if (DGPackage.Literals.CLIP_PATH.equals(type))
				sb.append(SVG_CLIP_PATH_TAG);
			else if (DGPackage.Literals.IMAGE.equals(type))
				sb.append(SVG_IMAGE_TAG);
			else if (DGPackage.Literals.MARKER.equals(type))
				sb.append(SVG_MARKER_TAG);
			else if (DGPackage.Literals.PATH.equals(type))
				sb.append(SVG_PATH_TAG);
		}

		for (String keyword : object.getKeyword())
			sb.append("." + keyword);

		if (sb.length() == 0) {
			sb.append("*");
		}

		return super.caseStyleSelector(object);
	}

	@Override
	public Object caseStyleSheet(StyleSheet object) {
		Element styleSheet = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_STYLE_TAG));
		getParentElement(object).appendChild(styleSheet);

		StringBuffer sb = new StringBuffer();
		for (StyleRule rule : object.getRule()) {
			sb.append("\n\t\t\t" + (String) doSwitch(rule));
		}
		styleSheet.setAttribute(SVG_TYPE_ATTRIBUTE, "text/css");
		styleSheet.appendChild(svgDocument.createCDATASection(sb.toString()
				+ "\n\t\t"));

		return super.caseStyleSheet(object);
	}

	@Override
	public Object caseText(Text object) {
		SVGTextElement text = (SVGTextElement) map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_TEXT_TAG));
		getParentElement(object).appendChild(text);

		if (object.getData() != null) {
			text.setTextContent(object.getData());
		}

		if (object.getPosition() != null) {
			Point position = object.getPosition();
			if (position.eIsSet(DCPackage.Literals.POINT__X))
				text.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(position.getX()));
			if (position.eIsSet(DCPackage.Literals.POINT__Y))
				text.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(position.getY()));
		}

		return super.caseText(object);
	}

	@Override
	public Object caseTransform(Transform object) {
		// TODO Auto-generated method stub
		return super.caseTransform(object);
	}

	@Override
	public Object caseTranslate(Translate object) {
		// TODO Auto-generated method stub
		return super.caseTranslate(object);
	}

	@Override
	public Object caseUse(Use object) {
		// TODO Auto-generated method stub
		return super.caseUse(object);
	}

}
