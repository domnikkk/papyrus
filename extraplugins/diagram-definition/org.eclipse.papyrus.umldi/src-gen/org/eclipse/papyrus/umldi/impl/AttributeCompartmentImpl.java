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
import org.eclipse.papyrus.umldi.AttributeCompartment;
import org.eclipse.papyrus.umldi.ClassifierWithAttributesShape;
import org.eclipse.papyrus.umldi.PropertyLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl#getClassifierWithAttributesShape <em>Classifier With Attributes Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl#getAttributeLabel <em>Attribute Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AttributeCompartmentImpl extends UmlCompartmentImpl implements AttributeCompartment {

	/**
	 * The cached value of the '{@link #getAttributeLabel() <em>Attribute Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAttributeLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyLabel> attributeLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AttributeCompartmentImpl() {
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
		return UMLDIPackage.Literals.ATTRIBUTE_COMPARTMENT;
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
		ClassifierWithAttributesShape classifierWithAttributesShape = getClassifierWithAttributesShape();
		if(classifierWithAttributesShape != null) {
			return classifierWithAttributesShape;
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
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.ATTRIBUTE_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassifierWithAttributesShape getClassifierWithAttributesShape() {
		if(eContainerFeatureID() != UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE)
			return null;
		return (ClassifierWithAttributesShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetClassifierWithAttributesShape(ClassifierWithAttributesShape newClassifierWithAttributesShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassifierWithAttributesShape, UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClassifierWithAttributesShape(ClassifierWithAttributesShape newClassifierWithAttributesShape) {
		if(newClassifierWithAttributesShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE && newClassifierWithAttributesShape != null)) {
			if(EcoreUtil.isAncestor(this, newClassifierWithAttributesShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newClassifierWithAttributesShape != null)
				msgs = ((InternalEObject)newClassifierWithAttributesShape).eInverseAdd(this, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT, ClassifierWithAttributesShape.class, msgs);
			msgs = basicSetClassifierWithAttributesShape(newClassifierWithAttributesShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE, newClassifierWithAttributesShape, newClassifierWithAttributesShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PropertyLabel> getAttributeLabel() {
		if(attributeLabel == null) {
			attributeLabel = new EObjectContainmentWithInverseEList<PropertyLabel>(PropertyLabel.class, this, UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL, UMLDIPackage.PROPERTY_LABEL__ATTRIBUTE_COMPARTMENT);
		}
		return attributeLabel;
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetClassifierWithAttributesShape((ClassifierWithAttributesShape)otherEnd, msgs);
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeLabel()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			return basicSetClassifierWithAttributesShape(null, msgs);
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			return ((InternalEList<?>)getAttributeLabel()).basicRemove(otherEnd, msgs);
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT, ClassifierWithAttributesShape.class, msgs);
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			return getClassifierWithAttributesShape();
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			return getAttributeLabel();
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			setClassifierWithAttributesShape((ClassifierWithAttributesShape)newValue);
			return;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			getAttributeLabel().clear();
			getAttributeLabel().addAll((Collection<? extends PropertyLabel>)newValue);
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			setClassifierWithAttributesShape((ClassifierWithAttributesShape)null);
			return;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			getAttributeLabel().clear();
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
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			return getClassifierWithAttributesShape() != null;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			return attributeLabel != null && !attributeLabel.isEmpty();
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL);
	}
} //AttributeCompartmentImpl
