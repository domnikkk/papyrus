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
import org.eclipse.papyrus.umldi.NameLabel;
import org.eclipse.papyrus.umldi.NamedEdge;
import org.eclipse.papyrus.umldi.NamedShape;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.NameLabelImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.NameLabelImpl#getNamedElementEdge <em>Named Element Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.NameLabelImpl#getNamedElementShape <em>Named Element Shape</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NameLabelImpl extends UmlLabelImpl implements NameLabel {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NameLabelImpl() {
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
		return UMLDIPackage.Literals.NAME_LABEL;
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
		NamedEdge namedElementEdge = getNamedElementEdge();
		if(namedElementEdge != null) {
			return namedElementEdge;
		}
		NamedShape namedElementShape = getNamedElementShape();
		if(namedElementShape != null) {
			return namedElementShape;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedEdge getNamedElementEdge() {
		if(eContainerFeatureID() != UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE)
			return null;
		return (NamedEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNamedElementEdge(NamedEdge newNamedElementEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamedElementEdge, UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNamedElementEdge(NamedEdge newNamedElementEdge) {
		if(newNamedElementEdge != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE && newNamedElementEdge != null)) {
			if(EcoreUtil.isAncestor(this, newNamedElementEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newNamedElementEdge != null)
				msgs = ((InternalEObject)newNamedElementEdge).eInverseAdd(this, UMLDIPackage.NAMED_EDGE__NAME_LABEL, NamedEdge.class, msgs);
			msgs = basicSetNamedElementEdge(newNamedElementEdge, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE, newNamedElementEdge, newNamedElementEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedShape getNamedElementShape() {
		if(eContainerFeatureID() != UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE)
			return null;
		return (NamedShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNamedElementShape(NamedShape newNamedElementShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamedElementShape, UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNamedElementShape(NamedShape newNamedElementShape) {
		if(newNamedElementShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE && newNamedElementShape != null)) {
			if(EcoreUtil.isAncestor(this, newNamedElementShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newNamedElementShape != null)
				msgs = ((InternalEObject)newNamedElementShape).eInverseAdd(this, UMLDIPackage.NAMED_SHAPE__NAME_LABEL, NamedShape.class, msgs);
			msgs = basicSetNamedElementShape(newNamedElementShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE, newNamedElementShape, newNamedElementShape));
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
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNamedElementEdge((NamedEdge)otherEnd, msgs);
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNamedElementShape((NamedShape)otherEnd, msgs);
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
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			return basicSetNamedElementEdge(null, msgs);
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			return basicSetNamedElementShape(null, msgs);
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
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.NAMED_EDGE__NAME_LABEL, NamedEdge.class, msgs);
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.NAMED_SHAPE__NAME_LABEL, NamedShape.class, msgs);
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
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			return getNamedElementEdge();
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			return getNamedElementShape();
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
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			setNamedElementEdge((NamedEdge)newValue);
			return;
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			setNamedElementShape((NamedShape)newValue);
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
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			setNamedElementEdge((NamedEdge)null);
			return;
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			setNamedElementShape((NamedShape)null);
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
		case UMLDIPackage.NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			return getNamedElementEdge() != null;
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			return getNamedElementShape() != null;
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE) || eIsSet(UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE);
	}
} //NameLabelImpl
