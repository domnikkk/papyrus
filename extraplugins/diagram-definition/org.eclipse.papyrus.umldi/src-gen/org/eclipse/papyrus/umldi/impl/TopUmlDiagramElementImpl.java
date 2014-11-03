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

import org.eclipse.papyrus.umldi.PackagedElementCompartment;
import org.eclipse.papyrus.umldi.TopUmlDiagramElement;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagram;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Uml Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl#getPackageCompartment <em>Package Compartment</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl#getUmlDiagram <em>Uml Diagram</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class TopUmlDiagramElementImpl extends UmlDiagramElementImpl implements TopUmlDiagramElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TopUmlDiagramElementImpl() {
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
		return UMLDIPackage.Literals.TOP_UML_DIAGRAM_ELEMENT;
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
		PackagedElementCompartment packageCompartment = getPackageCompartment();
		if(packageCompartment != null) {
			return packageCompartment;
		}
		UmlDiagram umlDiagram = getUmlDiagram();
		if(umlDiagram != null) {
			return umlDiagram;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PackagedElementCompartment getPackageCompartment() {
		if(eContainerFeatureID() != UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT)
			return null;
		return (PackagedElementCompartment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPackageCompartment(PackagedElementCompartment newPackageCompartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageCompartment, UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPackageCompartment(PackagedElementCompartment newPackageCompartment) {
		if(newPackageCompartment != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT && newPackageCompartment != null)) {
			if(EcoreUtil.isAncestor(this, newPackageCompartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newPackageCompartment != null)
				msgs = ((InternalEObject)newPackageCompartment).eInverseAdd(this, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT, PackagedElementCompartment.class, msgs);
			msgs = basicSetPackageCompartment(newPackageCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT, newPackageCompartment, newPackageCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UmlDiagram getUmlDiagram() {
		if(eContainerFeatureID() != UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM)
			return null;
		return (UmlDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetUmlDiagram(UmlDiagram newUmlDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlDiagram, UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUmlDiagram(UmlDiagram newUmlDiagram) {
		if(newUmlDiagram != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM && newUmlDiagram != null)) {
			if(EcoreUtil.isAncestor(this, newUmlDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newUmlDiagram != null)
				msgs = ((InternalEObject)newUmlDiagram).eInverseAdd(this, UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT, UmlDiagram.class, msgs);
			msgs = basicSetUmlDiagram(newUmlDiagram, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM, newUmlDiagram, newUmlDiagram));
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPackageCompartment((PackagedElementCompartment)otherEnd, msgs);
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetUmlDiagram((UmlDiagram)otherEnd, msgs);
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			return basicSetPackageCompartment(null, msgs);
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			return basicSetUmlDiagram(null, msgs);
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT, PackagedElementCompartment.class, msgs);
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT, UmlDiagram.class, msgs);
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			return getPackageCompartment();
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			return getUmlDiagram();
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			setPackageCompartment((PackagedElementCompartment)newValue);
			return;
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			setUmlDiagram((UmlDiagram)newValue);
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			setPackageCompartment((PackagedElementCompartment)null);
			return;
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			setUmlDiagram((UmlDiagram)null);
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
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT:
			return getPackageCompartment() != null;
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM:
			return getUmlDiagram() != null;
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT) || eIsSet(UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM);
	}
} //TopUmlDiagramElementImpl
