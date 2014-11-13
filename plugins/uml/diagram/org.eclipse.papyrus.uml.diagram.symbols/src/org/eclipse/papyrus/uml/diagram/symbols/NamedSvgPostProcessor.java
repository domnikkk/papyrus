package org.eclipse.papyrus.uml.diagram.symbols;

import org.eclipse.draw2d.geometry.PrecisionDimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.service.shape.SVGPostProcessor;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.TypedElement;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.svg.SVGAnimatedLength;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGElement;
import org.w3c.dom.svg.SVGLength;
import org.w3c.dom.svg.SVGSVGElement;

/**
 * Represents a SVG post-processor that permit to edit Label contained on SVG.
 *
 */
public class NamedSvgPostProcessor implements SVGPostProcessor {


	private int sendSignalActionInitialWidth = 0;

	private int acceptEventActionInitialWidth = 0;

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.service.shape.SVGPostProcessor#postProcess(org.eclipse.emf.ecore.EObject, org.w3c.dom.svg.SVGDocument)
	 *
	 * @param view
	 * @param document
	 */
	@Override
	public void postProcess(EObject view, SVGDocument document) {

		EObject element = ((View) view).getElement();

		if (element instanceof SendSignalAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof SendSignalAction)) {

			if (((View) view).getElement() instanceof NamedElement && document.getElementById("label") != null) {

				// The element to edit
				Element labelElement = document.getElementById("label");

				// Delete old text
				while (labelElement.getFirstChild() != null) {
					labelElement.removeChild(labelElement.getFirstChild());
				}

				// Set the label
				// labelElement.setAttribute("x", "10");
				// labelElement.setAttribute("y", "15");
				labelElement.setAttribute("style", "font-size:12px");

				// Set text to vertical : "rotate(angle, x, y)"
				// ((Element) labelElement.getParentNode()).setAttribute("transform", ((Element) labelElement.getParentNode()).getAttribute("transform") + "rotate(90, 40, 10)");// "matrix(-6.3121145e-4,-1,1,-6.3121145e-4,22.423964,1064.1626)");

				// Create new text element and set the text to the name of the element
				Text textNode = labelElement.getOwnerDocument().createTextNode(((NamedElement) ((View) view).getElement()).getName());
				labelElement.appendChild(textNode);

				// The root element of the svg file: used to change width
				SVGElement svgRootElement = (SVGElement) document.getRootElement();

				// get the width
				if (sendSignalActionInitialWidth == 0) {
					sendSignalActionInitialWidth = getSvgDimension(document).width;
				}
				int width = Math.max(sendSignalActionInitialWidth, (textNode.getLength() * 7));
				// if name is too long for the svg
				svgRootElement.setAttribute("width", "" + width);

				// to scale the arrow
				// SVGElement polylineElement = (SVGElement) document.getElementById("PapyrusPath");
				// polylineElement.getAttribute("transform");
				// polylineElement.setAttribute("transform", polylineElement.getAttribute("transform") + " " + "scale(" + 1 + ",1)");

			}
		}

		if (element instanceof AcceptEventAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof AcceptEventAction)) {

			if (((View) view).getElement() instanceof NamedElement && document.getElementById("label") != null) {
				// The element to edit
				Element labelElement = document.getElementById("label");

				// Delete old text
				while (labelElement.getFirstChild() != null) {
					labelElement.removeChild(labelElement.getFirstChild());
				}

				// Set the label
				// labelElement.setAttribute("x", "10");
				// labelElement.setAttribute("y", "15");
				labelElement.setAttribute("style", "font-size:15px");

				// Set text to vertical : "rotate(angle, x, y)"
				// ((Element) labelElement.getParentNode()).setAttribute("transform", ((Element) labelElement.getParentNode()).getAttribute("transform") + "rotate(90, 40, 10)");// "matrix(-6.3121145e-4,-1,1,-6.3121145e-4,22.423964,1064.1626)");

				// Create new text element and set the text to the name of the element
				Text textNode = labelElement.getOwnerDocument().createTextNode(((NamedElement) ((View) view).getElement()).getName());
				labelElement.appendChild(textNode);

				// The root element of the svg file: used to change width
				SVGElement svgRootElement = (SVGElement) document.getRootElement();

				// get the width
				if (acceptEventActionInitialWidth == 0) {
					acceptEventActionInitialWidth = getSvgDimension(document).width;
				}
				int width = Math.max(acceptEventActionInitialWidth, (textNode.getLength() * 7));
				// if name is too long for the svg
				svgRootElement.setAttribute("width", "" + width);
			}
		}
	}

	/**
	 * Transforms the given SVG animated length to a base value, assuming the units in the SVG are pixels
	 *
	 * @param length
	 *            The SVG length
	 * @return The base value as a double
	 */
	private double getValueOf(SVGAnimatedLength length) {
		if (length == null) {
			return 0;
		}
		SVGLength base = length.getBaseVal();
		if (base == null) {
			return 0;
		}
		return base.getValue();
	}

	/**
	 * Gets the dimension of the SVG document, assuming the units in the SVG are pixels
	 *
	 * @param svgDocument
	 *            The SVG document
	 * @return The equivalent Draw2D dimension
	 */
	private PrecisionDimension getSvgDimension(SVGDocument svgDocument) {
		double svgWidth = 0;
		double svgHeight = 0;
		SVGSVGElement svgElement = svgDocument.getRootElement();
		if (svgElement != null) {
			svgWidth = getValueOf(svgElement.getWidth());
			svgHeight = getValueOf(svgElement.getHeight());
		}
		return new PrecisionDimension(svgWidth, svgHeight);
	}
}
