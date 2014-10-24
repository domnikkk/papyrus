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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.umldi.InstanceSpecificationShape;
import org.eclipse.papyrus.umldi.SlotCompartment;
import org.eclipse.papyrus.umldi.SlotLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl#getSlotLabel <em>Slot Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl#getInstanceSpecificationShape <em>Instance Specification Shape</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SlotCompartmentImpl extends UmlCompartmentImpl implements SlotCompartment {

	/**
	 * The cached value of the '{@link #getSlotLabel() <em>Slot Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSlotLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotLabel> slotLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SlotCompartmentImpl() {
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
		return UMLDIPackage.Literals.SLOT_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.SLOT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public UmlDiagramElement getOwningUmlDiagramElement() {
		UmlDiagramElement owningUmlDiagramElement = basicGetOwningUmlDiagramElement();
		return owningUmlDiagramElement != null && owningUmlDiagramElement.eIsProxy() ? (UmlDiagramElement)eResolveProxy((InternalEObject)owningUmlDiagramElement) : owningUmlDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public UmlDiagramElement basicGetOwningUmlDiagramElement() {
		InstanceSpecificationShape instanceSpecificationShape = getInstanceSpecificationShape();
		if(instanceSpecificationShape != null) {
			return instanceSpecificationShape;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SlotLabel> getSlotLabel() {
		if(slotLabel == null) {
			slotLabel = new EObjectContainmentWithInverseEList<SlotLabel>(SlotLabel.class, this, UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL, UMLDIPackage.SLOT_LABEL__SLOT_COMPARTMENT);
		}
		return slotLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstanceSpecificationShape getInstanceSpecificationShape() {
		if(eContainerFeatureID() != UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE)
			return null;
		return (InstanceSpecificationShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInstanceSpecificationShape(InstanceSpecificationShape newInstanceSpecificationShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInstanceSpecificationShape, UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInstanceSpecificationShape(InstanceSpecificationShape newInstanceSpecificationShape) {
		if(newInstanceSpecificationShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE && newInstanceSpecificationShape != null)) {
			if(EcoreUtil.isAncestor(this, newInstanceSpecificationShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newInstanceSpecificationShape != null)
				msgs = ((InternalEObject)newInstanceSpecificationShape).eInverseAdd(this, UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT, InstanceSpecificationShape.class, msgs);
			msgs = basicSetInstanceSpecificationShape(newInstanceSpecificationShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE, newInstanceSpecificationShape, newInstanceSpecificationShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlotLabel()).basicAdd(otherEnd, msgs);
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInstanceSpecificationShape((InstanceSpecificationShape)otherEnd, msgs);
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
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			return ((InternalEList<?>)getSlotLabel()).basicRemove(otherEnd, msgs);
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			return basicSetInstanceSpecificationShape(null, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch(eContainerFeatureID()) {
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT, InstanceSpecificationShape.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			return getSlotLabel();
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			return getInstanceSpecificationShape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			getSlotLabel().clear();
			getSlotLabel().addAll((Collection<? extends SlotLabel>)newValue);
			return;
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			setInstanceSpecificationShape((InstanceSpecificationShape)newValue);
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
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			getSlotLabel().clear();
			return;
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			setInstanceSpecificationShape((InstanceSpecificationShape)null);
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
		case UMLDIPackage.SLOT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.SLOT_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			return slotLabel != null && !slotLabel.isEmpty();
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			return getInstanceSpecificationShape() != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwningUmlDiagramElement() {
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE);
	}
} //SlotCompartmentImpl
