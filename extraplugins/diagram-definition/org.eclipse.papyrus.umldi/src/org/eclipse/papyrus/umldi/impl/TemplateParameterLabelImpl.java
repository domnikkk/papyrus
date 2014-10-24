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
import org.eclipse.papyrus.umldi.TemplateParameterCompartment;
import org.eclipse.papyrus.umldi.TemplateParameterLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TemplateParameterLabelImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TemplateParameterLabelImpl#getTemplateParameterCompartment <em>Template Parameter Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TemplateParameterLabelImpl extends NameLabelImpl implements TemplateParameterLabel {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TemplateParameterLabelImpl() {
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
		return UMLDIPackage.Literals.TEMPLATE_PARAMETER_LABEL;
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
		TemplateParameterCompartment templateParameterCompartment = getTemplateParameterCompartment();
		if(templateParameterCompartment != null) {
			return templateParameterCompartment;
		}
		return super.basicGetOwningUmlDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TemplateParameterCompartment getTemplateParameterCompartment() {
		if(eContainerFeatureID() != UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT)
			return null;
		return (TemplateParameterCompartment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameterCompartment(TemplateParameterCompartment newTemplateParameterCompartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplateParameterCompartment, UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateParameterCompartment(TemplateParameterCompartment newTemplateParameterCompartment) {
		if(newTemplateParameterCompartment != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT && newTemplateParameterCompartment != null)) {
			if(EcoreUtil.isAncestor(this, newTemplateParameterCompartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newTemplateParameterCompartment != null)
				msgs = ((InternalEObject)newTemplateParameterCompartment).eInverseAdd(this, UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATE_PARAMETER_LABEL, TemplateParameterCompartment.class, msgs);
			msgs = basicSetTemplateParameterCompartment(newTemplateParameterCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT, newTemplateParameterCompartment, newTemplateParameterCompartment));
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTemplateParameterCompartment((TemplateParameterCompartment)otherEnd, msgs);
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			return basicSetTemplateParameterCompartment(null, msgs);
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATE_PARAMETER_LABEL, TemplateParameterCompartment.class, msgs);
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			return getTemplateParameterCompartment();
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			setTemplateParameterCompartment((TemplateParameterCompartment)newValue);
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			setTemplateParameterCompartment((TemplateParameterCompartment)null);
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
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			return getTemplateParameterCompartment() != null;
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT);
	}
} //TemplateParameterLabelImpl
