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
package org.eclipse.papyrus.uml.diagram.communication.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ConnectorDurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ConnectorTimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.DurationObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.InteractionEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.LifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.MessageEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.TimeObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLElementTypes {

	/**
	 * @generated
	 */
	private UMLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(UMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interaction_8002 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Interaction_8002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Diagram_8016 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Diagram_8016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Lifeline_8001 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Lifeline_8001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_8004 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Constraint_8004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Comment_8005 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Comment_8005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TimeObservation_8006 = getElementType("org.eclipse.papyrus.uml.diagram.communication.TimeObservation_8006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DurationObservation_8007 = getElementType("org.eclipse.papyrus.uml.diagram.communication.DurationObservation_8007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_8009 = getElementType("org.eclipse.papyrus.uml.diagram.communication.Message_8009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommentAnnotatedElement_8010 = getElementType("org.eclipse.papyrus.uml.diagram.communication.CommentAnnotatedElement_8010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConstraintConstrainedElement_8011 = getElementType("org.eclipse.papyrus.uml.diagram.communication.ConstraintConstrainedElement_8011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DurationObservationEvent_8012 = getElementType("org.eclipse.papyrus.uml.diagram.communication.DurationObservationEvent_8012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TimeObservationEvent_8013 = getElementType("org.eclipse.papyrus.uml.diagram.communication.TimeObservationEvent_8013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 *
	 * @generated
	 */
	public static synchronized ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Package_1000, UMLPackage.eINSTANCE.getPackage());


			elements.put(Interaction_8002, UMLPackage.eINSTANCE.getInteraction());


			elements.put(Diagram_8016, NotationPackage.eINSTANCE.getDiagram());


			elements.put(Lifeline_8001, UMLPackage.eINSTANCE.getLifeline());


			elements.put(Constraint_8004, UMLPackage.eINSTANCE.getConstraint());


			elements.put(Comment_8005, UMLPackage.eINSTANCE.getComment());


			elements.put(TimeObservation_8006, UMLPackage.eINSTANCE.getTimeObservation());


			elements.put(DurationObservation_8007, UMLPackage.eINSTANCE.getDurationObservation());


			elements.put(Message_8009, UMLPackage.eINSTANCE.getMessage());

			elements.put(CommentAnnotatedElement_8010, UMLPackage.eINSTANCE.getComment_AnnotatedElement());

			elements.put(ConstraintConstrainedElement_8011, UMLPackage.eINSTANCE.getConstraint_ConstrainedElement());

			elements.put(DurationObservationEvent_8012, UMLPackage.eINSTANCE.getDurationObservation_Event());

			elements.put(TimeObservationEvent_8013, UMLPackage.eINSTANCE.getTimeObservation_Event());
		}
		return elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static synchronized boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Interaction_8002);
			KNOWN_ELEMENT_TYPES.add(Diagram_8016);
			KNOWN_ELEMENT_TYPES.add(Lifeline_8001);
			KNOWN_ELEMENT_TYPES.add(Constraint_8004);
			KNOWN_ELEMENT_TYPES.add(Comment_8005);
			KNOWN_ELEMENT_TYPES.add(TimeObservation_8006);
			KNOWN_ELEMENT_TYPES.add(DurationObservation_8007);
			KNOWN_ELEMENT_TYPES.add(Message_8009);
			KNOWN_ELEMENT_TYPES.add(CommentAnnotatedElement_8010);
			KNOWN_ELEMENT_TYPES.add(ConstraintConstrainedElement_8011);
			KNOWN_ELEMENT_TYPES.add(DurationObservationEvent_8012);
			KNOWN_ELEMENT_TYPES.add(TimeObservationEvent_8013);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModelEditPart.VISUAL_ID:
			return Package_1000;
		case InteractionEditPart.VISUAL_ID:
			return Interaction_8002;
		case ShortCutDiagramEditPart.VISUAL_ID:
			return Diagram_8016;
		case LifelineEditPartCN.VISUAL_ID:
			return Lifeline_8001;
		case ConstraintEditPartCN.VISUAL_ID:
			return Constraint_8004;
		case CommentEditPartCN.VISUAL_ID:
			return Comment_8005;
		case TimeObservationEditPartCN.VISUAL_ID:
			return TimeObservation_8006;
		case DurationObservationEditPartCN.VISUAL_ID:
			return DurationObservation_8007;
		case MessageEditPart.VISUAL_ID:
			return Message_8009;
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return CommentAnnotatedElement_8010;
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return ConstraintConstrainedElement_8011;
		case ConnectorDurationObservationEditPart.VISUAL_ID:
			return DurationObservationEvent_8012;
		case ConnectorTimeObservationEditPart.VISUAL_ID:
			return TimeObservationEvent_8013;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes.getElement(elementTypeAdapter);
		}
	};
}
