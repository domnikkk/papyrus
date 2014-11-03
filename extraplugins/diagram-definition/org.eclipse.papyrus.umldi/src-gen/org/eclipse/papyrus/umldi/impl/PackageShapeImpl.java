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
import org.eclipse.papyrus.umldi.PackageShape;
import org.eclipse.papyrus.umldi.PackagedElementCompartment;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.PackageShapeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.PackageShapeImpl#getPackagedElementCompartment <em>Packaged Element Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PackageShapeImpl extends TemplateableElementShapeImpl implements PackageShape {

	/**
	 * The cached value of the '{@link #getPackagedElementCompartment() <em>Packaged Element Compartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPackagedElementCompartment()
	 * @generated
	 * @ordered
	 */
	protected PackagedElementCompartment packagedElementCompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackageShapeImpl() {
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
		return UMLDIPackage.Literals.PACKAGE_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.PACKAGE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.PACKAGE_SHAPE__NAME_LABEL, UMLDIPackage.PACKAGE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT, UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PackagedElementCompartment getPackagedElementCompartment() {
		return packagedElementCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPackagedElementCompartment(PackagedElementCompartment newPackagedElementCompartment, NotificationChain msgs) {
		PackagedElementCompartment oldPackagedElementCompartment = packagedElementCompartment;
		packagedElementCompartment = newPackagedElementCompartment;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT, oldPackagedElementCompartment, newPackagedElementCompartment);
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
	@Override
	public void setPackagedElementCompartment(PackagedElementCompartment newPackagedElementCompartment) {
		if(newPackagedElementCompartment != packagedElementCompartment) {
			NotificationChain msgs = null;
			if(packagedElementCompartment != null)
				msgs = ((InternalEObject)packagedElementCompartment).eInverseRemove(this, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE, PackagedElementCompartment.class, msgs);
			if(newPackagedElementCompartment != null)
				msgs = ((InternalEObject)newPackagedElementCompartment).eInverseAdd(this, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE, PackagedElementCompartment.class, msgs);
			msgs = basicSetPackagedElementCompartment(newPackagedElementCompartment, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT, newPackagedElementCompartment, newPackagedElementCompartment));
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
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			if(packagedElementCompartment != null)
				msgs = ((InternalEObject)packagedElementCompartment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT, null, msgs);
			return basicSetPackagedElementCompartment((PackagedElementCompartment)otherEnd, msgs);
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
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			return basicSetPackagedElementCompartment(null, msgs);
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
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			return getPackagedElementCompartment();
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
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			setPackagedElementCompartment((PackagedElementCompartment)newValue);
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
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			setPackagedElementCompartment((PackagedElementCompartment)null);
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
		case UMLDIPackage.PACKAGE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			return packagedElementCompartment != null;
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT);
	}
} //PackageShapeImpl
