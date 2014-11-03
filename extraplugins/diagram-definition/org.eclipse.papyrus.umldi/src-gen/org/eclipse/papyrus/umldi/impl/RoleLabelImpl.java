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
import org.eclipse.papyrus.umldi.InstanceSpecificationEdge;
import org.eclipse.papyrus.umldi.RoleLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.RoleLabelImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.RoleLabelImpl#getAssociationEdge <em>Association Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.RoleLabelImpl#getInstanceSpecificationEdge <em>Instance Specification Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RoleLabelImpl extends NameLabelImpl implements RoleLabel {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RoleLabelImpl() {
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
		return UMLDIPackage.Literals.ROLE_LABEL;
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
		AssociationEdge associationEdge = getAssociationEdge();
		if(associationEdge != null) {
			return associationEdge;
		}
		InstanceSpecificationEdge instanceSpecificationEdge = getInstanceSpecificationEdge();
		if(instanceSpecificationEdge != null) {
			return instanceSpecificationEdge;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationEdge getAssociationEdge() {
		if(eContainerFeatureID() != UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE)
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
		msgs = eBasicSetContainer((InternalEObject)newAssociationEdge, UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationEdge(AssociationEdge newAssociationEdge) {
		if(newAssociationEdge != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE && newAssociationEdge != null)) {
			if(EcoreUtil.isAncestor(this, newAssociationEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newAssociationEdge != null)
				msgs = ((InternalEObject)newAssociationEdge).eInverseAdd(this, UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL, AssociationEdge.class, msgs);
			msgs = basicSetAssociationEdge(newAssociationEdge, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE, newAssociationEdge, newAssociationEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstanceSpecificationEdge getInstanceSpecificationEdge() {
		if(eContainerFeatureID() != UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE)
			return null;
		return (InstanceSpecificationEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInstanceSpecificationEdge(InstanceSpecificationEdge newInstanceSpecificationEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInstanceSpecificationEdge, UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInstanceSpecificationEdge(InstanceSpecificationEdge newInstanceSpecificationEdge) {
		if(newInstanceSpecificationEdge != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE && newInstanceSpecificationEdge != null)) {
			if(EcoreUtil.isAncestor(this, newInstanceSpecificationEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newInstanceSpecificationEdge != null)
				msgs = ((InternalEObject)newInstanceSpecificationEdge).eInverseAdd(this, UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__END_ROLE_LABEL, InstanceSpecificationEdge.class, msgs);
			msgs = basicSetInstanceSpecificationEdge(newInstanceSpecificationEdge, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE, newInstanceSpecificationEdge, newInstanceSpecificationEdge));
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
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAssociationEdge((AssociationEdge)otherEnd, msgs);
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInstanceSpecificationEdge((InstanceSpecificationEdge)otherEnd, msgs);
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
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			return basicSetAssociationEdge(null, msgs);
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			return basicSetInstanceSpecificationEdge(null, msgs);
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
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL, AssociationEdge.class, msgs);
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__END_ROLE_LABEL, InstanceSpecificationEdge.class, msgs);
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
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			return getAssociationEdge();
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			return getInstanceSpecificationEdge();
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
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			setAssociationEdge((AssociationEdge)newValue);
			return;
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			setInstanceSpecificationEdge((InstanceSpecificationEdge)newValue);
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
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			setAssociationEdge((AssociationEdge)null);
			return;
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			setInstanceSpecificationEdge((InstanceSpecificationEdge)null);
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
		case UMLDIPackage.ROLE_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			return getAssociationEdge() != null;
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			return getInstanceSpecificationEdge() != null;
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE) || eIsSet(UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE);
	}
} //RoleLabelImpl
