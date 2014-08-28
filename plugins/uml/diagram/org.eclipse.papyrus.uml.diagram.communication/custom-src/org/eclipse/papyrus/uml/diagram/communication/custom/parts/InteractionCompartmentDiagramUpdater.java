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
package org.eclipse.papyrus.uml.diagram.communication.custom.parts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.part.ICustomDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.DurationObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.LifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.TimeObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLNodeDescriptor;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.PackageableElement;

public class InteractionCompartmentDiagramUpdater implements ICustomDiagramUpdater<UMLNodeDescriptor> {

	/**
	 * <pre>
	 * The original generated method of {@link UMLDiagramUpdater} class is kept commented below.
	 * {@inheritDoc}
	 * </pre>
	 */
	public List<UMLNodeDescriptor> getSemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interaction modelElement = (Interaction) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLifelines().iterator(); it.hasNext();) {
			Lifeline childElement = (Lifeline) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LifelineEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedComments().iterator(); it.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommentEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedRules().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		// Added ".getNearestPackage()"
		for (Iterator<?> it = modelElement.getNearestPackage().getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TimeObservationEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DurationObservationEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
		// ----------------Original code-----------------
		//
		// if(false == view.eContainer() instanceof View) {
		// return Collections.emptyList();
		// }
		// View containerView = (View)view.eContainer();
		// if(!containerView.isSetElement()) {
		// return Collections.emptyList();
		// }
		// Interaction modelElement = (Interaction)containerView.getElement();
		// LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		// for(Iterator<?> it = modelElement.getLifelines().iterator(); it.hasNext();) {
		// Lifeline childElement = (Lifeline)it.next();
		// int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
		// if(visualID == LifelineEditPartCN.VISUAL_ID) {
		// result.add(new UMLNodeDescriptor(childElement, visualID));
		// continue;
		// }
		// }
		// for(Iterator<?> it = modelElement.getOwnedComments().iterator(); it.hasNext();) {
		// Comment childElement = (Comment)it.next();
		// int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
		// if(visualID == CommentEditPartCN.VISUAL_ID) {
		// result.add(new UMLNodeDescriptor(childElement, visualID));
		// continue;
		// }
		// }
		// for(Iterator<?> it = modelElement.getOwnedRules().iterator(); it.hasNext();) {
		// Constraint childElement = (Constraint)it.next();
		// int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
		// if(visualID == ConstraintEditPartCN.VISUAL_ID) {
		// result.add(new UMLNodeDescriptor(childElement, visualID));
		// continue;
		// }
		// }
		// for(Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
		// PackageableElement childElement = (PackageableElement)it.next();
		// int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
		// if(visualID == TimeObservationEditPartCN.VISUAL_ID) {
		// result.add(new UMLNodeDescriptor(childElement, visualID));
		// continue;
		// }
		// if(visualID == DurationObservationEditPartCN.VISUAL_ID) {
		// result.add(new UMLNodeDescriptor(childElement, visualID));
		// continue;
		// }
		// }
		// return result;
	}
}
