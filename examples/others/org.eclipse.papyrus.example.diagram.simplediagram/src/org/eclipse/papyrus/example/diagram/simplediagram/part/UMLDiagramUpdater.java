package org.eclipse.papyrus.example.diagram.simplediagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.example.diagram.simplediagram.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.example.diagram.simplediagram.edit.parts.ModelEditPart;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * @generated
 */
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) view.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it
				.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getModel_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComponent_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComponent_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComponent_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<UMLNodeDescriptor> getSemanticChildren(View view) {
			return UMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<UMLLinkDescriptor> getContainedLinks(View view) {
			return UMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<UMLLinkDescriptor> getIncomingLinks(View view) {
			return UMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<UMLLinkDescriptor> getOutgoingLinks(View view) {
			return UMLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
