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
package org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorAsRectangleEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.SubjectClassifierEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseAsRectangleEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLLinkDescriptor;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLNodeDescriptor;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;

/**
 * overload it to avoid to count links as default named element
 *
 */
public class CustomUMLDiagramUpdater extends UMLDiagramUpdater {

	public static final CustomUMLDiagramUpdater INSTANCE = new CustomUMLDiagramUpdater();

	private CustomUMLDiagramUpdater() {
		// to prevent instantiation
		super();
	}

	/**
	 * overload it to avoid to count links as default named element
	 *
	 * @see org.eclipse.papyrus.uml.diagram.usecase.part.UMLDiagramUpdater#getPackage_1000SemanticChildren(org.eclipse.gmf.runtime.notation.View)
	 *
	 * @param view
	 * @return
	 */
	@Override
	public List<UMLNodeDescriptor> getPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActorAsRectangleEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UseCaseEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UseCaseAsRectangleEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (!(childElement instanceof Association)) {
				if (visualID == SubjectClassifierEditPartTN.VISUAL_ID) {
					result.add(new UMLNodeDescriptor(childElement, visualID));
					continue;
				}
			}
		}
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConstraintEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			// if(visualID == DefaultNamedElementEditPartTN.VISUAL_ID) {
			// result.add(new UMLNodeDescriptor(childElement, visualID));
			// continue;
			// }
		}
		for (Iterator<?> it = modelElement.getOwnedComments().iterator(); it.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommentEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	@Override
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Association_4011(Package container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List<?> targets = link.getEndTypes();
			Object theTarget = targets.size() > 1 ? targets.get(1) : null;
			if (false == theTarget instanceof Type) {
				continue;
			}
			Type dst = (Type) theTarget;
			List<?> sources = link.getEndTypes();
			Object theSource = sources.size() > 1 ? sources.get(0) : null;
			if (false == theSource instanceof Type) {
				continue;
			}
			Type src = (Type) theSource;
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Association_4011, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	@Override
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4011(Type target, CrossReferenceAdapter crossReferencer) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = target; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List<?> targets = link.getEndTypes();
			Object theTarget = targets.size() > 1 ? targets.get(1) : null;
			if (false == theTarget instanceof Type) {
				continue;
			}
			Type dst = (Type) theTarget;
			if (dst != target) {
				continue;
			}
			List<?> sources = link.getEndTypes();
			Object theSource = sources.size() > 1 ? sources.get(0) : null;
			if (false == theSource instanceof Type) {
				continue;
			}
			Type src = (Type) theSource;

			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Association_4011, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	@Override
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4011(Type source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List<?> targets = link.getEndTypes();
			Object theTarget = targets.size() > 1 ? targets.get(1) : null;
			if (false == theTarget instanceof Type) {
				continue;
			}
			Type dst = (Type) theTarget;
			List<?> sources = link.getEndTypes();
			Object theSource = sources.size() > 1 ? sources.get(0) : null;
			if (false == theSource instanceof Type) {
				continue;
			}
			Type src = (Type) theSource;
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Association_4011, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}
}
