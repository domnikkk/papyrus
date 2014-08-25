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
package org.eclipse.papyrus.umldi.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlCompartment;
import org.eclipse.papyrus.umldi.UmlDiagram;
import org.eclipse.papyrus.umldi.UmlEdge;
import org.eclipse.papyrus.umldi.UmlLabel;
import org.eclipse.papyrus.umldi.UmlShape;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public class UMLDIDerivedUnionAdapter extends AdapterImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static UMLDIPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UMLDIDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = UMLDIPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject) notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UMLDIPackage.UML_DIAGRAM:
			notifyUmlDiagramChanged(notification, eClass);
			break;
		case UMLDIPackage.UML_SHAPE:
			notifyUmlShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.UML_EDGE:
			notifyUmlEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.UML_COMPARTMENT:
			notifyUmlCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.UML_LABEL:
			notifyUmlLabelChanged(notification, eClass);
			break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @param derivedUnion
	 *            the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUmlDiagramChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlDiagram.class)) {
		case UMLDIPackage.UML_DIAGRAM__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.UML_DIAGRAM__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.UML_DIAGRAM__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.UML_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_DIAGRAM__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.UML_DIAGRAM__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUmlEdgeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlEdge.class)) {
		case UMLDIPackage.UML_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.UML_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.UML_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.UML_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.UML_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUmlCompartmentChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlCompartment.class)) {
		case UMLDIPackage.UML_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.UML_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.UML_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.UML_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUmlLabelChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlLabel.class)) {
		case UMLDIPackage.UML_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.UML_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.UML_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.UML_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUmlShapeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlShape.class)) {
		case UMLDIPackage.UML_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.UML_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.UML_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.UML_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.UML_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		}
	}
} // UMLDIDerivedUnionAdapter
