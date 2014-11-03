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
import org.eclipse.papyrus.umldi.ClassifierWithOperationsShape;
import org.eclipse.papyrus.umldi.OperationCompartment;
import org.eclipse.papyrus.umldi.OperationLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl#getClassifierWithOperationsShape <em>Classifier With Operations Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl#getOperationLabel <em>Operation Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OperationCompartmentImpl extends UmlCompartmentImpl implements OperationCompartment {

	/**
	 * The cached value of the '{@link #getOperationLabel() <em>Operation Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOperationLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationLabel> operationLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OperationCompartmentImpl() {
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
		return UMLDIPackage.Literals.OPERATION_COMPARTMENT;
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
		ClassifierWithOperationsShape classifierWithOperationsShape = getClassifierWithOperationsShape();
		if(classifierWithOperationsShape != null) {
			return classifierWithOperationsShape;
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
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.OPERATION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassifierWithOperationsShape getClassifierWithOperationsShape() {
		if(eContainerFeatureID() != UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE)
			return null;
		return (ClassifierWithOperationsShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetClassifierWithOperationsShape(ClassifierWithOperationsShape newClassifierWithOperationsShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassifierWithOperationsShape, UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClassifierWithOperationsShape(ClassifierWithOperationsShape newClassifierWithOperationsShape) {
		if(newClassifierWithOperationsShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE && newClassifierWithOperationsShape != null)) {
			if(EcoreUtil.isAncestor(this, newClassifierWithOperationsShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newClassifierWithOperationsShape != null)
				msgs = ((InternalEObject)newClassifierWithOperationsShape).eInverseAdd(this, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT, ClassifierWithOperationsShape.class, msgs);
			msgs = basicSetClassifierWithOperationsShape(newClassifierWithOperationsShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE, newClassifierWithOperationsShape, newClassifierWithOperationsShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OperationLabel> getOperationLabel() {
		if(operationLabel == null) {
			operationLabel = new EObjectContainmentWithInverseEList<OperationLabel>(OperationLabel.class, this, UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL, UMLDIPackage.OPERATION_LABEL__OPERATION_COMPARTMENT);
		}
		return operationLabel;
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
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetClassifierWithOperationsShape((ClassifierWithOperationsShape)otherEnd, msgs);
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationLabel()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			return basicSetClassifierWithOperationsShape(null, msgs);
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			return ((InternalEList<?>)getOperationLabel()).basicRemove(otherEnd, msgs);
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
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT, ClassifierWithOperationsShape.class, msgs);
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
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			return getClassifierWithOperationsShape();
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			return getOperationLabel();
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
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			setClassifierWithOperationsShape((ClassifierWithOperationsShape)newValue);
			return;
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			getOperationLabel().clear();
			getOperationLabel().addAll((Collection<? extends OperationLabel>)newValue);
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
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			setClassifierWithOperationsShape((ClassifierWithOperationsShape)null);
			return;
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			getOperationLabel().clear();
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
		case UMLDIPackage.OPERATION_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.OPERATION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			return getClassifierWithOperationsShape() != null;
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			return operationLabel != null && !operationLabel.isEmpty();
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL);
	}
} //OperationCompartmentImpl
