/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.editpolicies;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.helper.FloatingLabelHelper;
import org.eclipse.papyrus.uml.tools.utils.ICustomAppearance;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;

// TODO: Auto-generated Javadoc
/**
 * Specific edit policy for label displaying stereotypes and their properties for edges representing
 * UML elements.
 */
public class MaskManagedFloatingLabelEditPolicy extends AbstractMaskManagedEditPolicy {

	/**
	 * Creates a new PropertyLabelEditPolicy.
	 */
	public MaskManagedFloatingLabelEditPolicy() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addAdditionalListeners() {
		super.addAdditionalListeners();
		NamedElement umlElement = getUMLElement();
		// check host semantic element is not null
		if (umlElement == null) {
			Activator.log.error("No semantic element present when adding listeners in FloatingLabelEditPolicy", null);
			return;
		}
		// adds a listener to the element itself, and to linked elements, like Type
		if (umlElement instanceof TypedElement) {
			if (((TypedElement) umlElement).getType() != null) {
				getDiagramEventBroker().addNotificationListener(((TypedElement) umlElement).getType(), this);
			}
		}
		if (umlElement instanceof MultiplicityElement) {
			getDiagramEventBroker().addNotificationListener(((MultiplicityElement) umlElement).getUpperValue(), this);
			getDiagramEventBroker().addNotificationListener(((MultiplicityElement) umlElement).getLowerValue(), this);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<String> getDefaultDisplayValue() {
		NamedElement umlElement = getUMLElement();
		if (umlElement != null) {

			/**
			 * default uml operation display.
			 */
			if (umlElement instanceof Operation) {
				return ICustomAppearance.DEFAULT_UML_OPERATION;
			}

			/**
			 * default uml Port ins composite diagrams.
			 */
			if (umlElement instanceof Port) {
				return ICustomAppearance.DEFAULT_UML_PORT;
			}

			/**
			 * default uml Parameter in composite diagrams.
			 */
			if (umlElement instanceof Parameter) {
				return ICustomAppearance.DEFAULT_UML_PARAMETER;
			}

			/**
			 * default uml instancespecification .
			 */
			if (umlElement instanceof InstanceSpecification) {
				return ICustomAppearance.DEFAULT_UML_INSTANCESPECIFICATION;
			}

			/**
			 * default uml Signal .
			 */
			if (umlElement instanceof Signal) {
				return Arrays.asList(ICustomAppearance.DISP_NAME, ICustomAppearance.DISP_TYPE);
			}

		}
		return ICustomAppearance.DEFAULT_UML_FLOATING_LABEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, String> getMasks() {
		return FloatingLabelHelper.getInstance().getMasks();
	}

	/**
	 * {@inheritedDoc}.
	 *
	 * @return the UML element
	 */
	@Override
	public NamedElement getUMLElement() {
		EObject element = super.getUMLElement();
		if (element instanceof NamedElement) {
			return (NamedElement) element;
		}
		return null;
	}

	/**
	 * {@inheritedDoc}.
	 *
	 * @param notification
	 *            the notification
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		// change the label of the figure managed by the host edit part (managed by the parent edit
		// part in general...)
		// it must be changed only if:
		// - the annotation corresponding to the display of the stereotype changes
		// - the stereotype application list has changed
		Object object = notification.getNotifier();
		NamedElement property = getUMLElement();
		Object feature = notification.getFeature();
		if (object == null || property == null || feature == null) {
			return;
		}

		if (feature == UMLPackage.eINSTANCE.getLiteralInteger_Value()) {
			refreshDisplay();
		} else if (feature == UMLPackage.eINSTANCE.getLiteralUnlimitedNatural_Value()) {
			refreshDisplay();
		}
		if (object.equals(property)) {
			notifyNamedElementChanged(property, notification);
		}
		if (isMaskManagedAnnotation(object)) {
			refreshDisplay();
		}
		if (isRemovedMaskManagedLabelAnnotation(object, notification)) {
			refreshDisplay();
		}
	}

	/**
	 * notifies that the named element has changed.
	 *
	 * @param namedElement
	 *            the property that has changed
	 * @param notification
	 *            the notification send when the element has been changed
	 */
	protected void notifyNamedElementChanged(NamedElement namedElement, Notification notification) {
		switch (notification.getFeatureID(NamedElement.class)) {
		case UMLPackage.NAMED_ELEMENT__NAME:
			refreshDisplay();
			break;
		case UMLPackage.NAMED_ELEMENT__VISIBILITY:
			refreshDisplay();
			break;
		default:
			// does nothing in other cases
			break;
		}
	}

	/**
	 * Returns the view controlled by the host edit part.
	 *
	 * @return the view controlled by the host edit part
	 */
	@Override
	protected View getView() {
		if (getHost().getModel() instanceof View) {
			if (((View) getHost().getModel()).eContainer() instanceof View) {
				return (View) ((View) getHost().getModel()).eContainer();
			}
			return null;
		}
		return null;
	}


	/**
	 * Refreshes the display of the edit part.
	 */
	@Override
	public void refreshDisplay() {
		// calls the helper for this edit Part
		FloatingLabelHelper.getInstance().refreshEditPartDisplay((GraphicalEditPart) getHost());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void removeAdditionalListeners() {
		super.removeAdditionalListeners();
		NamedElement umlElement = getUMLElement();
		if (umlElement == null) {
			// check semantic element is not null and this is really an instance of NamedElement
			return;
		}
		// remove listener to the element itself, and to linked elements, like Type
		if (umlElement instanceof TypedElement) {
			if (((TypedElement) umlElement).getType() != null) {
				getDiagramEventBroker().removeNotificationListener(((TypedElement) umlElement).getType(), this);
			}
		}
		if (umlElement instanceof MultiplicityElement) {
			getDiagramEventBroker().removeNotificationListener(((MultiplicityElement) umlElement).getUpperValue(), this);
			getDiagramEventBroker().removeNotificationListener(((MultiplicityElement) umlElement).getLowerValue(), this);
		}
	}
}
