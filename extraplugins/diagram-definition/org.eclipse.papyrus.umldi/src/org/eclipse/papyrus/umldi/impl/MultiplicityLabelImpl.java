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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.papyrus.umldi.AssociationEdge;
import org.eclipse.papyrus.umldi.MultiplicityLabel;
import org.eclipse.papyrus.umldi.PropertyEdge;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl#getPropertyEdge <em>Property Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl#getAssociationEdge <em>Association Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MultiplicityLabelImpl extends UmlLabelImpl implements MultiplicityLabel {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MultiplicityLabelImpl() {
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
		return UMLDIPackage.Literals.MULTIPLICITY_LABEL;
	}

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
		PropertyEdge propertyEdge = getPropertyEdge();
		if(propertyEdge != null) {
			return propertyEdge;
		}
		AssociationEdge associationEdge = getAssociationEdge();
		if(associationEdge != null) {
			return associationEdge;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyEdge getPropertyEdge() {
		if(eContainerFeatureID() != UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE)
			return null;
		return (PropertyEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPropertyEdge(PropertyEdge newPropertyEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPropertyEdge, UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPropertyEdge(PropertyEdge newPropertyEdge) {
		if(newPropertyEdge != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE && newPropertyEdge != null)) {
			if(EcoreUtil.isAncestor(this, newPropertyEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newPropertyEdge != null)
				msgs = ((InternalEObject)newPropertyEdge).eInverseAdd(this, UMLDIPackage.PROPERTY_EDGE__MULTIPLICITY_LABEL, PropertyEdge.class, msgs);
			msgs = basicSetPropertyEdge(newPropertyEdge, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE, newPropertyEdge, newPropertyEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationEdge getAssociationEdge() {
		if(eContainerFeatureID() != UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE)
			return null;
		return (AssociationEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociationEdge(AssociationEdge newAssociationEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociationEdge, UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationEdge(AssociationEdge newAssociationEdge) {
		if(newAssociationEdge != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE && newAssociationEdge != null)) {
			if(EcoreUtil.isAncestor(this, newAssociationEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newAssociationEdge != null)
				msgs = ((InternalEObject)newAssociationEdge).eInverseAdd(this, UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL, AssociationEdge.class, msgs);
			msgs = basicSetAssociationEdge(newAssociationEdge, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE, newAssociationEdge, newAssociationEdge));
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
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPropertyEdge((PropertyEdge)otherEnd, msgs);
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAssociationEdge((AssociationEdge)otherEnd, msgs);
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
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			return basicSetPropertyEdge(null, msgs);
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			return basicSetAssociationEdge(null, msgs);
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
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.PROPERTY_EDGE__MULTIPLICITY_LABEL, PropertyEdge.class, msgs);
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL, AssociationEdge.class, msgs);
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
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			return getPropertyEdge();
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			return getAssociationEdge();
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
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			setPropertyEdge((PropertyEdge)newValue);
			return;
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			setAssociationEdge((AssociationEdge)newValue);
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
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			setPropertyEdge((PropertyEdge)null);
			return;
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			setAssociationEdge((AssociationEdge)null);
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
		case UMLDIPackage.MULTIPLICITY_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			return getPropertyEdge() != null;
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			return getAssociationEdge() != null;
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
	public boolean isSetOwningUmlDiagramElement() {
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE) || eIsSet(UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE);
	}
} //MultiplicityLabelImpl
