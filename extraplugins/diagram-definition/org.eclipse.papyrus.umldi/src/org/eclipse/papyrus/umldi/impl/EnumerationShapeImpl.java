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
import org.eclipse.papyrus.umldi.EnumerationShape;
import org.eclipse.papyrus.umldi.LiteralCompartment;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.EnumerationShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.EnumerationShapeImpl#getLiteralCompartment <em>Literal Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EnumerationShapeImpl extends ClassifierShapeImpl implements EnumerationShape {

	/**
	 * The cached value of the '{@link #getLiteralCompartment() <em>Literal Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLiteralCompartment()
	 * @generated
	 * @ordered
	 */
	protected LiteralCompartment literalCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnumerationShapeImpl() {
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
		return UMLDIPackage.Literals.ENUMERATION_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.ENUMERATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.ENUMERATION_SHAPE__NAME_LABEL, UMLDIPackage.ENUMERATION_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LiteralCompartment getLiteralCompartment() {
		return literalCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLiteralCompartment(LiteralCompartment newLiteralCompartment, NotificationChain msgs) {
		LiteralCompartment oldLiteralCompartment = literalCompartment;
		literalCompartment = newLiteralCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT, oldLiteralCompartment, newLiteralCompartment);
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
	public void setLiteralCompartment(LiteralCompartment newLiteralCompartment) {
		if(newLiteralCompartment != literalCompartment) {
			NotificationChain msgs = null;
			if(literalCompartment != null)
				msgs = ((InternalEObject)literalCompartment).eInverseRemove(this, UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE, LiteralCompartment.class, msgs);
			if(newLiteralCompartment != null)
				msgs = ((InternalEObject)newLiteralCompartment).eInverseAdd(this, UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE, LiteralCompartment.class, msgs);
			msgs = basicSetLiteralCompartment(newLiteralCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT, newLiteralCompartment, newLiteralCompartment));
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
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			if(literalCompartment != null)
				msgs = ((InternalEObject)literalCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT, null, msgs);
			return basicSetLiteralCompartment((LiteralCompartment)otherEnd, msgs);
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
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			return basicSetLiteralCompartment(null, msgs);
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
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			return getLiteralCompartment();
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
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			setLiteralCompartment((LiteralCompartment)newValue);
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
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			setLiteralCompartment((LiteralCompartment)null);
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
		case UMLDIPackage.ENUMERATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			return literalCompartment != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT);
	}
} //EnumerationShapeImpl
