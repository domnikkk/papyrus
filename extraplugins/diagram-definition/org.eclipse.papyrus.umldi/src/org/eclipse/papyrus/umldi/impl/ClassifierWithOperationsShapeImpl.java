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
package org.eclipse.papyrus.umldi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.umldi.ClassifierWithOperationsShape;
import org.eclipse.papyrus.umldi.OperationCompartment;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier With Operations Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ClassifierWithOperationsShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ClassifierWithOperationsShapeImpl#getOperationCompartment <em>Operation Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ClassifierWithOperationsShapeImpl extends ClassifierWithAttributesShapeImpl implements ClassifierWithOperationsShape {

	/**
	 * The cached value of the '{@link #getOperationCompartment() <em>Operation Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOperationCompartment()
	 * @generated
	 * @ordered
	 */
	protected OperationCompartment operationCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassifierWithOperationsShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLDIPackage.Literals.CLASSIFIER_WITH_OPERATIONS_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOwnedUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__NAME_LABEL, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__ATTRIBUTE_COMPARTMENT, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationCompartment getOperationCompartment() {
		return operationCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOperationCompartment(OperationCompartment newOperationCompartment, NotificationChain msgs) {
		OperationCompartment oldOperationCompartment = operationCompartment;
		operationCompartment = newOperationCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT, oldOperationCompartment, newOperationCompartment);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOperationCompartment(OperationCompartment newOperationCompartment) {
		if(newOperationCompartment != operationCompartment) {
			NotificationChain msgs = null;
			if(operationCompartment != null)
				msgs = ((InternalEObject)operationCompartment).eInverseRemove(this, UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE, OperationCompartment.class, msgs);
			if(newOperationCompartment != null)
				msgs = ((InternalEObject)newOperationCompartment).eInverseAdd(this, UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE, OperationCompartment.class, msgs);
			msgs = basicSetOperationCompartment(newOperationCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT, newOperationCompartment, newOperationCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT:
			if(operationCompartment != null)
				msgs = ((InternalEObject)operationCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT, null, msgs);
			return basicSetOperationCompartment((OperationCompartment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT:
			return basicSetOperationCompartment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT:
			return getOperationCompartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT:
			setOperationCompartment((OperationCompartment)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT:
			setOperationCompartment((OperationCompartment)null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT:
			return operationCompartment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT);
	}
} //ClassifierWithOperationsShapeImpl
