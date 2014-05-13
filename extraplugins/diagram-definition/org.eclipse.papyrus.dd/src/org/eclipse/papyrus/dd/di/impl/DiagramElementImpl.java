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
package org.eclipse.papyrus.dd.di.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.dd.di.DiagramElement;
import org.eclipse.papyrus.dd.di.Style;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Diagram Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl#getModelElement
 * <em>Model Element</em>}</li>
 * <li>
 * {@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl#getOwningElement
 * <em>Owning Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl#getOwnedElement
 * <em>Owned Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl#getLocalStyle
 * <em>Local Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl#getSharedStyle
 * <em>Shared Style</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class DiagramElementImpl extends MinimalEObjectImpl.Container
		implements DiagramElement {

	/**
	 * The cached value of the '{@link #getLocalStyle() <em>Local Style</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocalStyle()
	 * @generated
	 * @ordered
	 */
	protected Style localStyle;

	/**
	 * The cached value of the '{@link #getSharedStyle() <em>Shared Style</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSharedStyle()
	 * @generated
	 * @ordered
	 */
	protected Style sharedStyle;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DIPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getModelElement() {
		EObject modelElement = basicGetModelElement();
		return modelElement != null && modelElement.eIsProxy() ? eResolveProxy((InternalEObject) modelElement)
				: modelElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetModelElement() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiagramElement getOwningElement() {
		DiagramElement owningElement = basicGetOwningElement();
		return owningElement != null && owningElement.eIsProxy() ? (DiagramElement) eResolveProxy((InternalEObject) owningElement)
				: owningElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiagramElement basicGetOwningElement() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DiagramElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<DiagramElement>(
				DiagramElement.class, this,
				DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Style getLocalStyle() {
		return localStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLocalStyle(Style newLocalStyle,
			NotificationChain msgs) {
		Style oldLocalStyle = localStyle;
		localStyle = newLocalStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE,
					oldLocalStyle, newLocalStyle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocalStyle(Style newLocalStyle) {
		if (newLocalStyle != localStyle) {
			NotificationChain msgs = null;
			if (localStyle != null)
				msgs = ((InternalEObject) localStyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, null,
						msgs);
			if (newLocalStyle != null)
				msgs = ((InternalEObject) newLocalStyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, null,
						msgs);
			msgs = basicSetLocalStyle(newLocalStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, newLocalStyle,
					newLocalStyle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Style getSharedStyle() {
		if (sharedStyle != null && sharedStyle.eIsProxy()) {
			InternalEObject oldSharedStyle = (InternalEObject) sharedStyle;
			sharedStyle = (Style) eResolveProxy(oldSharedStyle);
			if (sharedStyle != oldSharedStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE,
							oldSharedStyle, sharedStyle));
			}
		}
		return sharedStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Style basicGetSharedStyle() {
		return sharedStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSharedStyle(Style newSharedStyle) {
		Style oldSharedStyle = sharedStyle;
		sharedStyle = newSharedStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE, oldSharedStyle,
					sharedStyle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
			return basicSetLocalStyle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
			if (resolve)
				return getModelElement();
			return basicGetModelElement();
		case DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
			if (resolve)
				return getOwningElement();
			return basicGetOwningElement();
		case DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
			return getOwnedElement();
		case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
			return getLocalStyle();
		case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
			if (resolve)
				return getSharedStyle();
			return basicGetSharedStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
			setLocalStyle((Style) newValue);
			return;
		case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
			setSharedStyle((Style) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
			setLocalStyle((Style) null);
			return;
		case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
			setSharedStyle((Style) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
			return isSetModelElement();
		case DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
			return isSetOwningElement();
		case DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
			return isSetOwnedElement();
		case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
			return localStyle != null;
		case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
			return sharedStyle != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetModelElement() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetOwningElement() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetOwnedElement() {
		return false;
	}

} // DiagramElementImpl
