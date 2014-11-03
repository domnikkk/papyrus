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
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.svggen.SVGSyntax;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.papyrus.dd.dg.EllipticalArcTo;
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
import org.eclipse.papyrus.dd.dg.TextAnchor;
import org.eclipse.papyrus.dd.dg.Transform;
import org.eclipse.papyrus.dd.dg.Translate;
import org.eclipse.papyrus.dd.dg.Use;
import org.eclipse.papyrus.dd.dg.util.DGSwitch;
import org.eclipse.papyrus.dd.editor.DDEditorPlugin;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;

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
	 * This is the layout property
	 */
	public static final String SVG_LAYOUT_ATTRIBUTE = "layout";

	/**
	 * This is the layout data property
	 */
	public static final String SVG_LAYOUT_DATA_ATTRIBUTE = "layoutData";

	/**
	 * This is the DG model resource
	 */
	private Resource resource;

	/**
	 * This is the created SVG document
	 */
	private Document svgDocument;

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
	public Document convert(RootCanvas canvas) {
		if (canvas == null)
			return null;

		// set the DG model resource
		this.resource = canvas.eResource();

		// create a new SVG document
		final DOMImplementation impl = getDOMImplementation();
		svgDocument = (Document) impl.createDocument(SVG_NAMESPACE_URI,
				SVG_SVG_TAG, null);

		// establish a base URL for the SVG document to resolve relative links
		svgDocument.setDocumentURI(resource.getURI().toString());

		// iterate over all contents and convert them
		for (TreeIterator<EObject> iterator = canvas.eAllContents(); iterator.hasNext();)
			doSwitch(iterator.next());

		return svgDocument;
	}

	/**
	 * @return an instance of the DOM Implementation
	 */
	protected DOMImplementation getDOMImplementation() {
		return SVGDOMImplementation.getDOMImplementation();
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
	protected String convertDoubleToString(Double d) {
		return String.valueOf(d);
	}

	/**
	 * Converts a <code>Reference</code> to a URI string
	 * 
	 * @param reference
	 *            The EObject reference
	 * @return The URI encoding of the reference
	 */
	protected String convertReferenceToURI(Definition referenced) {
		Resource referencedResource = referenced.eResource();
		URI uri = referencedResource.getURI();
		String uriFragment = referenced.getId();
		if (resource.equals(referencedResource))
			return '#' + uriFragment;
		return uri.appendFragment(uriFragment).toString();
	}

	/**
	 * Converts a <code>Reference</code> to a URL string
	 * 
	 * @param reference
	 *            The EObject reference
	 * @return The URL encoding of the reference
	 */
	protected String convertReferenceToURL(Definition reference) {
		return "url(" + convertReferenceToURI(reference) + ")";
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

		svg.setAttribute(CSS_OVERFLOW_PROPERTY, "visible");

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

		circle.setAttribute(SVG_R_ATTRIBUTE,
				convertDoubleToString(object.getRadius()));

		return super.caseCircle(object);
	}

	@Override
	public Object caseClipPath(ClipPath object) {
		Element clipPath = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_CLIP_PATH_TAG));
		getParentElement(object).appendChild(clipPath);

		clipPath.setAttribute(SVG_CLIP_PATH_UNITS_ATTRIBUTE,
				SVG_OBJECT_BOUNDING_BOX_VALUE);

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
		} else
			sb.append("0.0,0.0");
		sb.append(" ");
		if (object.getEndControl() != null) {
			Point end = object.getEndControl();
			sb.append(convertDoubleToString(end.getX()) + ","
					+ convertDoubleToString(end.getY()));
		} else
			sb.append("0.0,0.0");
		sb.append(" ");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		} else
			sb.append("0.0,0.0");

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
						convertDoubleToString(center.getY()));
		}

		if (object.getRadii() != null) {
			Dimension radii = object.getRadii();
			ellipse.setAttribute(SVG_RX_ATTRIBUTE,
					convertDoubleToString(radii.getWidth()));
			ellipse.setAttribute(SVG_RY_ATTRIBUTE,
					convertDoubleToString(radii.getHeight()));
		} else {
			ellipse.setAttribute(SVG_RX_ATTRIBUTE, "0.0");
			ellipse.setAttribute(SVG_RY_ATTRIBUTE, "0.0");
		}

		return super.caseEllipse(object);
	}

	@Override
	public Object caseEllipticalArcTo(EllipticalArcTo object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append(object.isRelative() ? "a" : "A");
		if (object.getRadii() != null) {
			Dimension radii = object.getRadii();
			sb.append(convertDoubleToString(radii.getWidth()) + ","
					+ convertDoubleToString(radii.getHeight()));
		} else
			sb.append("0.0,0.0");
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
		} else
			sb.append("0.0,0.0");

		return super.casePathCommand(object);
	}

	@Override
	public Object caseGradient(Gradient object) {
		Element gradient = (Element) lookup(object);

		if (gradient != null) {
			if (object.getTransforms().size() > 0) {
				String transforms = "";
				for (Transform transform : object.getTransforms()) {
					transforms += (transforms.length() > 0) ? " " : "";
					transforms += (String) doSwitch(transform);
				}
				gradient.setAttribute(SVG_GRADIENT_TRANSFORM_ATTRIBUTE,
						transforms);
			}
		}

		return super.caseGradient(object);
	}

	@Override
	public Object caseGradientStop(GradientStop object) {
		Element stop = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_STOP_TAG));
		getParentElement(object).appendChild(stop);

		if (object.eIsSet(DGPackage.Literals.GRADIENT_STOP__OFFSET))
			stop.setAttribute(SVG_OFFSET_ATTRIBUTE,
					convertDoubleToString(object.getOffset()) + "%");

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
			if (object.getClasses().size() > 0) {
				String classes = "";
				for (String class_ : object.getClasses()) {
					classes += (classes.length() > 0) ? ", " : "";
					classes += class_;
				}
				element.setAttribute(SVG_CLASS_ATTRIBUTE, classes);
			}

			if (object.getStyle() != null) {
				String value = (String) doSwitch(object.getStyle());
				element.setAttribute(SVG_STYLE_ATTRIBUTE, value);
			}

			if (object.getClipPath() != null) {
				element.setAttribute(SVG_CLIP_PATH_ATTRIBUTE,
						convertReferenceToURL(object.getClipPath()));
			}

			if (object.getTransforms().size() > 0) {
				String transforms = "";
				for (Transform transform : object.getTransforms()) {
					transforms += (transforms.length() > 0) ? " " : "";
					transforms += (String) doSwitch(transform);
				}
				element.setAttribute(SVG_TRANSFORM_ATTRIBUTE, transforms);
			}

			if (object.getLayoutData() != null)
				element.setAttribute(SVG_LAYOUT_DATA_ATTRIBUTE,
						object.getLayoutData());
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

		if (object.getLayout() != null)
			g.setAttribute(SVG_LAYOUT_ATTRIBUTE, object.getLayout());

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
			image.setAttribute(SVG_WIDTH_ATTRIBUTE,
					convertDoubleToString(bounds.getWidth()));
			image.setAttribute(SVG_HEIGHT_ATTRIBUTE,
					convertDoubleToString(bounds.getHeight()));
		} else {
			image.setAttribute(SVG_WIDTH_ATTRIBUTE, "0.0");
			image.setAttribute(SVG_HEIGHT_ATTRIBUTE, "0.0");
		}

		if (object.getSource() != null && object.getSource().length() > 0)
			image.setAttributeNS(XLINK_NAMESPACE_URI, XLINK_HREF_QNAME,
					object.getSource());
		else
			image.setAttributeNS(XLINK_NAMESPACE_URI, XLINK_HREF_QNAME,
					"http://missing.reference");

		String preserve = object.isAspectRatioPreserved() ? "xMidYMid meet"
				: "none";
		image.setAttribute(SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE, preserve);

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

		gradient.setAttribute(SVG_GRADIENT_UNITS_ATTRIBUTE,
				SVG_OBJECT_BOUNDING_BOX_VALUE);

		if (object.getStart() != null) {
			Point start = object.getStart();
			if (start.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_X1_ATTRIBUTE,
						convertDoubleToString(start.getX()) + "%");
			if (start.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_Y1_ATTRIBUTE,
						convertDoubleToString(start.getY()) + "%");
		}

		if (object.getEnd() != null) {
			Point end = object.getEnd();
			if (end.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_X2_ATTRIBUTE,
						convertDoubleToString(end.getX()) + "%");
			if (end.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_Y2_ATTRIBUTE,
						convertDoubleToString(end.getY()) + "%");
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
		} else
			sb.append("0.0,0.0");

		return super.caseLineTo(object);
	}

	@Override
	public Object caseMarkedElement(MarkedElement object) {
		Element element = (Element) lookup(object);

		if (element != null) {
			if (object.getStartMarker() != null)
				element.setAttribute(SVG_MARKER_START_ATTRIBUTE,
						convertReferenceToURL(object.getStartMarker()));
			if (object.getMidMarker() != null)
				element.setAttribute(SVG_MARKER_MID_ATTRIBUTE,
						convertReferenceToURL(object.getMidMarker()));
			if (object.getEndMarker() != null)
				element.setAttribute(SVG_MARKER_END_ATTRIBUTE,
						convertReferenceToURL(object.getEndMarker()));
		}

		return super.caseMarkedElement(object);
	}

	@Override
	public Object caseMarker(Marker object) {
		Element marker = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_MARKER_TAG));
		getParentElement(object).appendChild(marker);

		marker.setAttribute(SVG_MARKER_UNITS_ATTRIBUTE, SVG_STROKE_WIDTH_VALUE);
		marker.setAttribute(SVG_ORIENT_ATTRIBUTE, SVG_AUTO_VALUE);

		if (object.getSize() != null) {
			Dimension size = object.getSize();
			if (size.eIsSet(DCPackage.Literals.DIMENSION__WIDTH))
				marker.setAttribute(SVG_MARKER_WIDTH_ATTRIBUTE,
						convertDoubleToString(size.getWidth()));
			if (size.eIsSet(DCPackage.Literals.DIMENSION__HEIGHT))
				marker.setAttribute(SVG_MARKER_HEIGHT_ATTRIBUTE,
						convertDoubleToString(size.getHeight()));
		}

		if (object.getReference() != null) {
			Point reference = object.getReference();
			if (reference.eIsSet(DCPackage.Literals.POINT__X))
				marker.setAttribute(SVG_REF_X_ATTRIBUTE,
						convertDoubleToString(reference.getX()));
			if (reference.eIsSet(DCPackage.Literals.POINT__Y))
				marker.setAttribute(SVG_REF_Y_ATTRIBUTE,
						convertDoubleToString(reference.getY()));
		}

		return super.caseMarker(object);
	}

	@Override
	public Object caseMatrix(Matrix object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append("matrix(");
		sb.append(convertDoubleToString(object.getA()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getB()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getC()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getD()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getE()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getF()));
		sb.append(")");

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
		} else
			sb.append("0.0,0.0");

		return super.caseMoveTo(object);
	}

	@Override
	public Object casePaint(Paint object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.eIsSet(DGPackage.Literals.PAINT__COLOR))
			sb.append(convertColorToString(object.getColor()));
		else if (object.getPaintServer() != null)
			sb.append(convertReferenceToURL(object.getPaintServer()));
		else
			sb.append("none");

		return super.casePaint(object);
	}

	@Override
	public Object casePaintServer(PaintServer object) {
		return super.casePaintServer(object);
	}

	@Override
	public Object casePath(Path object) {
		Element path = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_PATH_TAG));
		getParentElement(object).appendChild(path);

		if (!object.getCommands().isEmpty()) {
			StringBuffer sb = new StringBuffer();
			for (PathCommand command : object.getCommands()) {
				String c = (String) doSwitch(command);
				sb.append(sb.length() > 0 ? " " : "");
				sb.append(c);
			}
			path.setAttribute(SVG_D_ATTRIBUTE, sb.toString());
		}

		return super.casePath(object);
	}

	@Override
	public Object casePathCommand(PathCommand object) {
		return super.casePathCommand(object);
	}

	@Override
	public Object casePattern(Pattern object) {
		Element pattern = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_PATTERN_TAG));
		getParentElement(object).appendChild(pattern);

		pattern.setAttribute(SVG_PATTERN_UNITS_ATTRIBUTE,
				SVG_OBJECT_BOUNDING_BOX_VALUE);

		if (object.getBounds() != null) {
			Bounds bounds = object.getBounds();
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__X))
				pattern.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(bounds.getX()) + "%");
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__Y))
				pattern.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(bounds.getY()) + "%");
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__WIDTH))
				pattern.setAttribute(SVG_WIDTH_ATTRIBUTE,
						convertDoubleToString(bounds.getWidth()) + "%");
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__HEIGHT))
				pattern.setAttribute(SVG_HEIGHT_ATTRIBUTE,
						convertDoubleToString(bounds.getHeight()) + "%");
		}

		if (object.getTransforms().size() > 0) {
			String transforms = "";
			for (Transform transform : object.getTransforms()) {
				transforms += (transforms.length() > 0) ? " " : "";
				transforms += (String) doSwitch(transform);
			}
			pattern.setAttribute(SVG_PATTERN_TRANSFORM_ATTRIBUTE, transforms);
		}

		return super.casePattern(object);
	}

	@Override
	public Object casePolygon(Polygon object) {
		Element polygon = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_POLYGON_TAG));
		getParentElement(object).appendChild(polygon);

		if (!object.getPoints().isEmpty()) {
			StringBuffer sb = new StringBuffer();
			for (Point point : object.getPoints()) {
				sb.append(sb.length() > 0 ? " " : "");
				sb.append(convertDoubleToString(point.getX()));
				sb.append(",");
				sb.append(convertDoubleToString(point.getY()));
			}
			polygon.setAttribute(SVG_POINTS_ATTRIBUTE, sb.toString());
		}

		return super.casePolygon(object);
	}

	@Override
	public Object casePolyline(Polyline object) {
		Element polyline = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_POLYLINE_TAG));
		getParentElement(object).appendChild(polyline);

		if (!object.getPoints().isEmpty()) {
			StringBuffer sb = new StringBuffer();
			for (Point point : object.getPoints()) {
				sb.append(sb.length() > 0 ? " " : "");
				sb.append(convertDoubleToString(point.getX()));
				sb.append(",");
				sb.append(convertDoubleToString(point.getY()));
			}
			polyline.setAttribute(SVG_POINTS_ATTRIBUTE, sb.toString());
		}

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
		} else
			sb.append("0.0,0.0");
		sb.append(" ");
		if (object.getPoint() != null) {
			Point point = object.getPoint();
			sb.append(convertDoubleToString(point.getX()) + ","
					+ convertDoubleToString(point.getY()));
		} else
			sb.append("0.0,0.0");

		return super.caseQuadraticCurveTo(object);
	}

	@Override
	public Object caseRadialGradient(RadialGradient object) {
		Element gradient = map(object, svgDocument.createElementNS(
				SVG_NAMESPACE_URI, SVG_RADIAL_GRADIENT_TAG));
		getParentElement(object).appendChild(gradient);

		gradient.setAttribute(SVG_GRADIENT_UNITS_ATTRIBUTE,
				SVG_OBJECT_BOUNDING_BOX_VALUE);

		if (object.eIsSet(DGPackage.Literals.RADIAL_GRADIENT__RADIUS)) {
			gradient.setAttribute(SVG_R_ATTRIBUTE,
					convertDoubleToString(object.getRadius()) + "%");
		}

		if (object.getCenter() != null) {
			Point center = object.getCenter();
			if (center.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_CX_ATTRIBUTE,
						convertDoubleToString(center.getX()) + "%");
			if (center.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_CY_ATTRIBUTE,
						convertDoubleToString(center.getY()) + "%");
		}

		if (object.getFocus() != null) {
			Point focus = object.getFocus();
			if (focus.eIsSet(DCPackage.Literals.POINT__X))
				gradient.setAttribute(SVG_FX_ATTRIBUTE,
						convertDoubleToString(focus.getX()) + "%");
			if (focus.eIsSet(DCPackage.Literals.POINT__Y))
				gradient.setAttribute(SVG_FY_ATTRIBUTE,
						convertDoubleToString(focus.getY()) + "%");
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
			rect.setAttribute(SVG_WIDTH_ATTRIBUTE,
					convertDoubleToString(bounds.getWidth()));
			rect.setAttribute(SVG_HEIGHT_ATTRIBUTE,
					convertDoubleToString(bounds.getHeight()));
		} else {
			rect.setAttribute(SVG_WIDTH_ATTRIBUTE, "0.0");
			rect.setAttribute(SVG_HEIGHT_ATTRIBUTE, "0.0");
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
		svg.setAttribute(XMLNS_PREFIX, SVG_NAMESPACE_URI);
		svg.setAttribute(XMLNS_PREFIX + ":" + XLINK_PREFIX, XLINK_NAMESPACE_URI);
		svg.setAttribute(SVG_ONLOAD_ATTRIBUTE, "validate(evt.target)");

		if (object.eIsSet(DGPackage.Literals.ROOT_CANVAS__BACKGROUND_COLOR)) {
			String background = convertColorToString(object
					.getBackgroundColor());
			svg.setAttribute(SVG_BACKGROUND_COLOR_ATTRIBUTE, background);
		}

		for (StyleSheet styleSheet : object.getExternalStyleSheets()) {
			String target = "xml-stylesheet";
			String data = "type=\"text/css\" href=\""
					+ styleSheet.eResource().getURI() + ".css\" ?>";
			ProcessingInstruction pi = svgDocument.createProcessingInstruction(
					target, data);
			svgDocument.insertBefore(pi, svgDocument.getDocumentElement());
		}

		try {
			URL url = DDEditorPlugin.getPlugin().getBundle()
					.getEntry("/scripts/Layout.js");
			url = FileLocator.toFileURL(url);
			Element script = svgDocument.createElementNS(SVG_NAMESPACE_URI,
					SVG_SCRIPT_TAG);
			script.setAttributeNS(XLINK_NAMESPACE_URI, XLINK_HREF_QNAME,
					url.toString());
			svg.appendChild(script);
		} catch (IOException e) {
			DDEditorPlugin.getPlugin().log(e);
		}

		for (String s : object.getScripts()) {
			try {
				URL url = FileLocator.toFileURL(new URL(s));
				Element script = svgDocument.createElementNS(SVG_NAMESPACE_URI,
						SVG_SCRIPT_TAG);
				script.setAttributeNS(XLINK_NAMESPACE_URI, XLINK_HREF_QNAME,
						url.toString());
				svg.appendChild(script);
			} catch (IOException e) {
				DDEditorPlugin.getPlugin().log(e);
			}
		}

		if (object.getDefinitions() != null) {
			doSwitch(object.getDefinitions());
		}

		return super.caseRootCanvas(object);
	}

	@Override
	public Object caseRotate(Rotate object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append("rotate(");
		sb.append(convertDoubleToString(object.getAngle()));
		if (object.getCenter() != null) {
			Point center = object.getCenter();
			sb.append(", ");
			sb.append(convertDoubleToString(center.getX()));
			sb.append(", ");
			sb.append(convertDoubleToString(center.getY()));
		}
		sb.append(")");

		return super.caseRotate(object);
	}

	@Override
	public Object caseScale(Scale object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append("scale(");
		sb.append(convertDoubleToString(object.getFactorX()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getFactorY()));
		sb.append(")");

		return super.caseScale(object);
	}

	@Override
	public Object caseSkew(Skew object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.eIsSet(DGPackage.Literals.SKEW__ANGLE_X)) {
			sb.append("skewX(");
			sb.append(convertDoubleToString(object.getAngleX()));
			sb.append(")");
		}

		sb.append(sb.length() > 0 ? " " : "");

		if (object.eIsSet(DGPackage.Literals.SKEW__ANGLE_Y)) {
			sb.append("skewY(");
			sb.append(convertDoubleToString(object.getAngleY()));
			sb.append(")");
		}

		return super.caseSkew(object);
	}

	@Override
	public Object caseStyle(Style object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.eIsSet(DGPackage.Literals.STYLE__FILL)) {
			String value = (object.getFill() == null) ? "none"
					: (String) doSwitch(object.getFill());
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
			for (double d : object.getStrokeDashLengths()) {
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

		if (sb.length() > 0)
			sb.deleteCharAt(sb.length() - 1);

		return super.caseStyle(object);
	}

	@Override
	public Object caseStyleRule(StyleRule object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (!object.getSelectors().isEmpty() && object.getStyle() != null) {
			for (StyleSelector selector : object.getSelectors()) {
				sb.append(sb.length() > 0 ? ", " : "");
				sb.append((String) doSwitch(selector));
			}

			if (object.getStyle() != null) {
				String style = (String) doSwitch(object.getStyle());
				sb.append(" { " + style + " }");
			}
		}

		return super.caseStyleRule(object);
	}

	@Override
	public Object caseStyleSelector(StyleSelector object) {
		StringBuffer sb = map(object, new StringBuffer());

		if (object.eIsSet(DGPackage.Literals.STYLE_SELECTOR__KIND)) {
			switch (object.getKind()) {
			case CANVAS:
				sb.append(SVG_SVG_TAG);
				break;
			case CIRCLE:
				sb.append(SVG_CIRCLE_TAG);
				break;
			case CLIP_PATH:
				sb.append(SVG_CLIP_PATH_TAG);
				break;
			case ELLIPSE:
				sb.append(SVG_ELLIPSE_TAG);
				break;
			case GROUP:
				sb.append(SVG_G_TAG);
				break;
			case IMAGE:
				sb.append(SVG_IMAGE_TAG);
				break;
			case LINE:
				sb.append(SVG_LINE_TAG);
				break;
			case MARKER:
				sb.append(SVG_MARKER_TAG);
				break;
			case PATH:
				sb.append(SVG_PATH_TAG);
				break;
			case POLYGON:
				sb.append(SVG_POLYGON_TAG);
				break;
			case POLYLINE:
				sb.append(SVG_POLYLINE_TAG);
				break;
			case RECTANGLE:
				sb.append(SVG_RECT_TAG);
				break;
			case TEXT:
				sb.append(SVG_TEXT_TAG);
				break;
			case USE:
				sb.append(SVG_USE_TAG);
				break;
			}
		}

		for (String class_ : object.getClasses())
			sb.append("." + class_);

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
		for (StyleRule rule : object.getRules()) {
			sb.append("\n\t\t\t" + (String) doSwitch(rule));
		}
		styleSheet.setAttribute(SVG_TYPE_ATTRIBUTE, "text/css");
		styleSheet.appendChild(svgDocument.createCDATASection(sb.toString()));

		return super.caseStyleSheet(object);
	}

	@Override
	public Object caseText(Text object) {
		Element text = (Element) map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_TEXT_TAG));
		getParentElement(object).appendChild(text);

		if (object.getData() != null) {
			text.setTextContent(object.getData());
		}

		if (object.getBounds() != null) {
			Bounds bounds = object.getBounds();
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__X))
				text.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(bounds.getX()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__Y))
				text.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(bounds.getY()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__WIDTH))
				text.setAttribute(SVG_WIDTH_ATTRIBUTE,
						convertDoubleToString(bounds.getWidth()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__HEIGHT))
				text.setAttribute(SVG_HEIGHT_ATTRIBUTE,
						convertDoubleToString(bounds.getHeight()));
		}

		if (object.getAnchor() != null) {
			TextAnchor ta = object.getAnchor();
			String value = null;
			if (ta.equals(TextAnchor.START))
				value = "start";
			else if (ta.equals(TextAnchor.MIDDLE))
				value = "middle";
			else if (ta.equals(TextAnchor.END))
				value = "end";
			text.setAttribute(SVG_TEXT_ANCHOR_ATTRIBUTE, value);
		}

		return super.caseText(object);
	}

	@Override
	public Object caseTransform(Transform object) {
		return super.caseTransform(object);
	}

	@Override
	public Object caseTranslate(Translate object) {
		StringBuffer sb = map(object, new StringBuffer());

		sb.append("translate(");
		sb.append(convertDoubleToString(object.getDeltaX()));
		sb.append(", ");
		sb.append(convertDoubleToString(object.getDeltaY()));
		sb.append(")");

		return super.caseTranslate(object);
	}

	@Override
	public Object caseUse(Use object) {
		Element use = map(object,
				svgDocument.createElementNS(SVG_NAMESPACE_URI, SVG_USE_TAG));
		getParentElement(object).appendChild(use);

		if (object.getReferencedElement() != null) {
			use.setAttributeNS(XLINK_NAMESPACE_URI, XLINK_HREF_QNAME,
					convertReferenceToURI(object.getReferencedElement()));
		}

		if (object.getBounds() != null) {
			Bounds bounds = object.getBounds();
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__X))
				use.setAttribute(SVG_X_ATTRIBUTE,
						convertDoubleToString(bounds.getX()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__Y))
				use.setAttribute(SVG_Y_ATTRIBUTE,
						convertDoubleToString(bounds.getY()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__WIDTH))
				use.setAttribute(SVG_WIDTH_ATTRIBUTE,
						convertDoubleToString(bounds.getWidth()));
			if (bounds.eIsSet(DCPackage.Literals.BOUNDS__HEIGHT))
				use.setAttribute(SVG_HEIGHT_ATTRIBUTE,
						convertDoubleToString(bounds.getHeight()));
		}

		return super.caseUse(object);
	}

}
