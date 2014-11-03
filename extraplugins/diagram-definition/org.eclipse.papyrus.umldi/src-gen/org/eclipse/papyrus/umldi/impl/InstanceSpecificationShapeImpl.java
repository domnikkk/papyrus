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
import org.eclipse.papyrus.umldi.InstanceSpecificationShape;
import org.eclipse.papyrus.umldi.SlotCompartment;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specification Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.InstanceSpecificationShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.InstanceSpecificationShapeImpl#getSlotCompartment <em>Slot Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InstanceSpecificationShapeImpl extends NamedShapeImpl implements InstanceSpecificationShape {

	/**
	 * The cached value of the '{@link #getSlotCompartment() <em>Slot Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSlotCompartment()
	 * @generated
	 * @ordered
	 */
	protected SlotCompartment slotCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceSpecificationShapeImpl() {
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
		return UMLDIPackage.Literals.INSTANCE_SPECIFICATION_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__NAME_LABEL, UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SlotCompartment getSlotCompartment() {
		return slotCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSlotCompartment(SlotCompartment newSlotCompartment, NotificationChain msgs) {
		SlotCompartment oldSlotCompartment = slotCompartment;
		slotCompartment = newSlotCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT, oldSlotCompartment, newSlotCompartment);
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
	public void setSlotCompartment(SlotCompartment newSlotCompartment) {
		if(newSlotCompartment != slotCompartment) {
			NotificationChain msgs = null;
			if(slotCompartment != null)
				msgs = ((InternalEObject)slotCompartment).eInverseRemove(this, UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE, SlotCompartment.class, msgs);
			if(newSlotCompartment != null)
				msgs = ((InternalEObject)newSlotCompartment).eInverseAdd(this, UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE, SlotCompartment.class, msgs);
			msgs = basicSetSlotCompartment(newSlotCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT, newSlotCompartment, newSlotCompartment));
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
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			if(slotCompartment != null)
				msgs = ((InternalEObject)slotCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT, null, msgs);
			return basicSetSlotCompartment((SlotCompartment)otherEnd, msgs);
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
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			return basicSetSlotCompartment(null, msgs);
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
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			return getSlotCompartment();
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
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			setSlotCompartment((SlotCompartment)newValue);
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
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			setSlotCompartment((SlotCompartment)null);
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
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			return slotCompartment != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT);
	}
} //InstanceSpecificationShapeImpl
