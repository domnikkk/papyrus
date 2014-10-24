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

import org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape;
import org.eclipse.papyrus.umldi.ReceptionCompartment;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier With Receptions Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ClassifierWithReceptionsShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ClassifierWithReceptionsShapeImpl#getReceptionCompartment <em>Reception Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ClassifierWithReceptionsShapeImpl extends ClassifierWithOperationsShapeImpl implements ClassifierWithReceptionsShape {

	/**
	 * The cached value of the '{@link #getReceptionCompartment() <em>Reception Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReceptionCompartment()
	 * @generated
	 * @ordered
	 */
	protected ReceptionCompartment receptionCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassifierWithReceptionsShapeImpl() {
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
		return UMLDIPackage.Literals.CLASSIFIER_WITH_RECEPTIONS_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__NAME_LABEL, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__ATTRIBUTE_COMPARTMENT, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__OPERATION_COMPARTMENT, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReceptionCompartment getReceptionCompartment() {
		return receptionCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReceptionCompartment(ReceptionCompartment newReceptionCompartment, NotificationChain msgs) {
		ReceptionCompartment oldReceptionCompartment = receptionCompartment;
		receptionCompartment = newReceptionCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT, oldReceptionCompartment, newReceptionCompartment);
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
	public void setReceptionCompartment(ReceptionCompartment newReceptionCompartment) {
		if(newReceptionCompartment != receptionCompartment) {
			NotificationChain msgs = null;
			if(receptionCompartment != null)
				msgs = ((InternalEObject)receptionCompartment).eInverseRemove(this, UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE, ReceptionCompartment.class, msgs);
			if(newReceptionCompartment != null)
				msgs = ((InternalEObject)newReceptionCompartment).eInverseAdd(this, UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE, ReceptionCompartment.class, msgs);
			msgs = basicSetReceptionCompartment(newReceptionCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT, newReceptionCompartment, newReceptionCompartment));
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
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT:
			if(receptionCompartment != null)
				msgs = ((InternalEObject)receptionCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT, null, msgs);
			return basicSetReceptionCompartment((ReceptionCompartment)otherEnd, msgs);
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
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT:
			return basicSetReceptionCompartment(null, msgs);
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
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT:
			return getReceptionCompartment();
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
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT:
			setReceptionCompartment((ReceptionCompartment)newValue);
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
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT:
			setReceptionCompartment((ReceptionCompartment)null);
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
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT:
			return receptionCompartment != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT);
	}
} //ClassifierWithReceptionsShapeImpl
