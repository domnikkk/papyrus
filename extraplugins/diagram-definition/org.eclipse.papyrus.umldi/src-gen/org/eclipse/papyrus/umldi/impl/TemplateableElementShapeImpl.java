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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.umldi.TemplateParameterCompartment;
import org.eclipse.papyrus.umldi.TemplateableElementShape;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templateable Element Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TemplateableElementShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.TemplateableElementShapeImpl#getTemplateParameterCompartment <em>Template Parameter Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class TemplateableElementShapeImpl extends NamedShapeImpl implements TemplateableElementShape {

	/**
	 * The cached value of the '{@link #getTemplateParameterCompartment() <em>Template Parameter Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateParameterCompartment()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameterCompartment templateParameterCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TemplateableElementShapeImpl() {
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
		return UMLDIPackage.Literals.TEMPLATEABLE_ELEMENT_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__NAME_LABEL, UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TemplateParameterCompartment getTemplateParameterCompartment() {
		return templateParameterCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameterCompartment(TemplateParameterCompartment newTemplateParameterCompartment, NotificationChain msgs) {
		TemplateParameterCompartment oldTemplateParameterCompartment = templateParameterCompartment;
		templateParameterCompartment = newTemplateParameterCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, oldTemplateParameterCompartment, newTemplateParameterCompartment);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateParameterCompartment(TemplateParameterCompartment newTemplateParameterCompartment) {
		if(newTemplateParameterCompartment != templateParameterCompartment) {
			NotificationChain msgs = null;
			if(templateParameterCompartment != null)
				msgs = ((InternalEObject)templateParameterCompartment).eInverseRemove(this, UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATEABLE_ELEMENT_SHAPE, TemplateParameterCompartment.class, msgs);
			if(newTemplateParameterCompartment != null)
				msgs = ((InternalEObject)newTemplateParameterCompartment).eInverseAdd(this, UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATEABLE_ELEMENT_SHAPE, TemplateParameterCompartment.class, msgs);
			msgs = basicSetTemplateParameterCompartment(newTemplateParameterCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, newTemplateParameterCompartment, newTemplateParameterCompartment));
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
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			if(templateParameterCompartment != null)
				msgs = ((InternalEObject)templateParameterCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, null, msgs);
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
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
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
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
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
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
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
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			return templateParameterCompartment != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT);
	}
} //TemplateableElementShapeImpl
