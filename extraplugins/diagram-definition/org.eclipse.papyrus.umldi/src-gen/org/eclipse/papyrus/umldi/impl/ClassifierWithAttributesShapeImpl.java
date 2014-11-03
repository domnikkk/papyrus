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
import org.eclipse.papyrus.umldi.AttributeCompartment;
import org.eclipse.papyrus.umldi.ClassifierWithAttributesShape;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier With Attributes Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ClassifierWithAttributesShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ClassifierWithAttributesShapeImpl#getAttributeCompartment <em>Attribute Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ClassifierWithAttributesShapeImpl extends ClassifierShapeImpl implements ClassifierWithAttributesShape {

	/**
	 * The cached value of the '{@link #getAttributeCompartment() <em>Attribute Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAttributeCompartment()
	 * @generated
	 * @ordered
	 */
	protected AttributeCompartment attributeCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassifierWithAttributesShapeImpl() {
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
		return UMLDIPackage.Literals.CLASSIFIER_WITH_ATTRIBUTES_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__NAME_LABEL, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeCompartment getAttributeCompartment() {
		return attributeCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAttributeCompartment(AttributeCompartment newAttributeCompartment, NotificationChain msgs) {
		AttributeCompartment oldAttributeCompartment = attributeCompartment;
		attributeCompartment = newAttributeCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT, oldAttributeCompartment, newAttributeCompartment);
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
	public void setAttributeCompartment(AttributeCompartment newAttributeCompartment) {
		if(newAttributeCompartment != attributeCompartment) {
			NotificationChain msgs = null;
			if(attributeCompartment != null)
				msgs = ((InternalEObject)attributeCompartment).eInverseRemove(this, UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE, AttributeCompartment.class, msgs);
			if(newAttributeCompartment != null)
				msgs = ((InternalEObject)newAttributeCompartment).eInverseAdd(this, UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE, AttributeCompartment.class, msgs);
			msgs = basicSetAttributeCompartment(newAttributeCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT, newAttributeCompartment, newAttributeCompartment));
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
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT:
			if(attributeCompartment != null)
				msgs = ((InternalEObject)attributeCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT, null, msgs);
			return basicSetAttributeCompartment((AttributeCompartment)otherEnd, msgs);
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
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT:
			return basicSetAttributeCompartment(null, msgs);
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
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT:
			return getAttributeCompartment();
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
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT:
			setAttributeCompartment((AttributeCompartment)newValue);
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
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT:
			setAttributeCompartment((AttributeCompartment)null);
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
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT:
			return attributeCompartment != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT);
	}
} //ClassifierWithAttributesShapeImpl
