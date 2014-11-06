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
import org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape;
import org.eclipse.papyrus.umldi.ReceptionCompartment;
import org.eclipse.papyrus.umldi.ReceptionLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reception Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl#getSignalShape <em>Signal Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl#getReceptionLabel <em>Reception Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReceptionCompartmentImpl extends UmlCompartmentImpl implements ReceptionCompartment {

	/**
	 * The cached value of the '{@link #getReceptionLabel() <em>Reception Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReceptionLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceptionLabel> receptionLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReceptionCompartmentImpl() {
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
		return UMLDIPackage.Literals.RECEPTION_COMPARTMENT;
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
		ClassifierWithReceptionsShape signalShape = getSignalShape();
		if(signalShape != null) {
			return signalShape;
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
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.RECEPTION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassifierWithReceptionsShape getSignalShape() {
		if(eContainerFeatureID() != UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE)
			return null;
		return (ClassifierWithReceptionsShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignalShape(ClassifierWithReceptionsShape newSignalShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSignalShape, UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignalShape(ClassifierWithReceptionsShape newSignalShape) {
		if(newSignalShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE && newSignalShape != null)) {
			if(EcoreUtil.isAncestor(this, newSignalShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newSignalShape != null)
				msgs = ((InternalEObject)newSignalShape).eInverseAdd(this, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT, ClassifierWithReceptionsShape.class, msgs);
			msgs = basicSetSignalShape(newSignalShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE, newSignalShape, newSignalShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ReceptionLabel> getReceptionLabel() {
		if(receptionLabel == null) {
			receptionLabel = new EObjectContainmentWithInverseEList<ReceptionLabel>(ReceptionLabel.class, this, UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL, UMLDIPackage.RECEPTION_LABEL__RECEPTION_COMPARTMENT);
		}
		return receptionLabel;
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSignalShape((ClassifierWithReceptionsShape)otherEnd, msgs);
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceptionLabel()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			return basicSetSignalShape(null, msgs);
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			return ((InternalEList<?>)getReceptionLabel()).basicRemove(otherEnd, msgs);
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT, ClassifierWithReceptionsShape.class, msgs);
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			return getSignalShape();
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			return getReceptionLabel();
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			setSignalShape((ClassifierWithReceptionsShape)newValue);
			return;
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			getReceptionLabel().clear();
			getReceptionLabel().addAll((Collection<? extends ReceptionLabel>)newValue);
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			setSignalShape((ClassifierWithReceptionsShape)null);
			return;
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			getReceptionLabel().clear();
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
		case UMLDIPackage.RECEPTION_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.RECEPTION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			return getSignalShape() != null;
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			return receptionLabel != null && !receptionLabel.isEmpty();
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL);
	}
} //ReceptionCompartmentImpl
