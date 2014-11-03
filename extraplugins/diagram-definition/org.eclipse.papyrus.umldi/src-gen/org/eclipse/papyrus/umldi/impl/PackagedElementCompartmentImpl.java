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
import org.eclipse.papyrus.umldi.PackageShape;
import org.eclipse.papyrus.umldi.PackagedElementCompartment;
import org.eclipse.papyrus.umldi.TopUmlDiagramElement;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Element Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl#getPackageShape <em>Package Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl#getTopUmlDiagramElement <em>Top Uml Diagram Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PackagedElementCompartmentImpl extends UmlCompartmentImpl implements PackagedElementCompartment {

	/**
	 * The cached value of the '{@link #getTopUmlDiagramElement() <em>Top Uml Diagram Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTopUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TopUmlDiagramElement> topUmlDiagramElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackagedElementCompartmentImpl() {
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
		return UMLDIPackage.Literals.PACKAGED_ELEMENT_COMPARTMENT;
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
		PackageShape packageShape = getPackageShape();
		if(packageShape != null) {
			return packageShape;
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
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PackageShape getPackageShape() {
		if(eContainerFeatureID() != UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE)
			return null;
		return (PackageShape)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPackageShape(PackageShape newPackageShape, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageShape, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPackageShape(PackageShape newPackageShape) {
		if(newPackageShape != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE && newPackageShape != null)) {
			if(EcoreUtil.isAncestor(this, newPackageShape))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if(newPackageShape != null)
				msgs = ((InternalEObject)newPackageShape).eInverseAdd(this, UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT, PackageShape.class, msgs);
			msgs = basicSetPackageShape(newPackageShape, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE, newPackageShape, newPackageShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TopUmlDiagramElement> getTopUmlDiagramElement() {
		if(topUmlDiagramElement == null) {
			topUmlDiagramElement = new EObjectContainmentWithInverseEList<TopUmlDiagramElement>(TopUmlDiagramElement.class, this, UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT, UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT);
		}
		return topUmlDiagramElement;
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			if(eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPackageShape((PackageShape)otherEnd, msgs);
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopUmlDiagramElement()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			return basicSetPackageShape(null, msgs);
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			return ((InternalEList<?>)getTopUmlDiagramElement()).basicRemove(otherEnd, msgs);
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT, PackageShape.class, msgs);
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			return getPackageShape();
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			return getTopUmlDiagramElement();
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			setPackageShape((PackageShape)newValue);
			return;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			getTopUmlDiagramElement().clear();
			getTopUmlDiagramElement().addAll((Collection<? extends TopUmlDiagramElement>)newValue);
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			setPackageShape((PackageShape)null);
			return;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			getTopUmlDiagramElement().clear();
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
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return isSetOwningUmlDiagramElement();
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			return getPackageShape() != null;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			return topUmlDiagramElement != null && !topUmlDiagramElement.isEmpty();
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
		return super.isSetOwningUmlDiagramElement() || eIsSet(UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT);
	}
} //PackagedElementCompartmentImpl
