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
import org.eclipse.papyrus.umldi.EnumerationShape;
import org.eclipse.papyrus.umldi.LiteralCompartment;
import org.eclipse.papyrus.umldi.LiteralLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl#getEnumerationShape <em>Enumeration Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl#getLiteralLabel <em>Literal Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LiteralCompartmentImpl extends UmlCompartmentImpl implements LiteralCompartment {

	/**
	 * The cached value of the '{@link #getLiteralLabel() <em>Literal Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLiteralLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralLabel> literalLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LiteralCompartmentImpl() {
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
		return UMLDIPackage.Literals.LITERAL_COMPARTMENT;
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
		EnumerationShape enumerationShape = getEnumerationShape();
		if(enumerationShape != null) {
			return enumerationShape;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.LITERAL_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumerationShape getEnumerationShape() {
		if(eContainerFeatureID() != UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE)
			return null;
		return (EnumerationShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEnumerationShape(EnumerationShape newEnumerationShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnumerationShape, UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnumerationShape(EnumerationShape newEnumerationShape) {
		if(newEnumerationShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE && newEnumerationShape != null)) {
			if(EcoreUtil.isAncestor(this, newEnumerationShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newEnumerationShape != null)
				msgs = ((InternalEObject)newEnumerationShape).eInverseAdd(this, UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT, EnumerationShape.class, msgs);
			msgs = basicSetEnumerationShape(newEnumerationShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE, newEnumerationShape, newEnumerationShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<LiteralLabel> getLiteralLabel() {
		if(literalLabel == null) {
			literalLabel = new EObjectContainmentWithInverseEList<LiteralLabel>(LiteralLabel.class, this, UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL, UMLDIPackage.LITERAL_LABEL__LITERAL_COMPARTMENT);
		}
		return literalLabel;
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
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnumerationShape((EnumerationShape)otherEnd, msgs);
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getLiteralLabel()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			return basicSetEnumerationShape(null, msgs);
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			return ((InternalEList<?>)getLiteralLabel()).basicRemove(otherEnd, msgs);
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
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT, EnumerationShape.class, msgs);
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
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			return getEnumerationShape();
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			return getLiteralLabel();
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
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			setEnumerationShape((EnumerationShape)newValue);
			return;
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			getLiteralLabel().clear();
			getLiteralLabel().addAll((Collection<? extends LiteralLabel>)newValue);
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
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			setEnumerationShape((EnumerationShape)null);
			return;
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			getLiteralLabel().clear();
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
		case UMLDIPackage.LITERAL_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.LITERAL_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			return getEnumerationShape() != null;
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			return literalLabel != null && !literalLabel.isEmpty();
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL);
	}
} //LiteralCompartmentImpl
