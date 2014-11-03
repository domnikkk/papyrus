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
package org.eclipse.papyrus.dd.dg.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.dc.Bounds;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.GraphicalElement;
import org.eclipse.papyrus.dd.dg.Use;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Use</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.UseImpl#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.UseImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UseImpl extends GraphicalElementImpl implements Use {

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement referencedElement;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.USE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.USE__BOUNDS, oldBounds, newBounds);
			if(msgs == null)
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
	public void setBounds(Bounds newBounds) {
		if(newBounds != bounds) {
			NotificationChain msgs = null;
			if(bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.USE__BOUNDS, null, msgs);
			if(newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.USE__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.USE__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphicalElement getReferencedElement() {
		if(referencedElement != null && referencedElement.eIsProxy()) {
			InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
			referencedElement = (GraphicalElement)eResolveProxy(oldReferencedElement);
			if(referencedElement != oldReferencedElement) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.USE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
			}
		}
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphicalElement basicGetReferencedElement() {
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReferencedElement(GraphicalElement newReferencedElement) {
		GraphicalElement oldReferencedElement = referencedElement;
		referencedElement = newReferencedElement;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.USE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * The cached validation expression for the ' {@link #referencedElementHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Element Has Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #referencedElementHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_ELEMENT_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "referencedElement->notEmpty() implies referencedElement.id->notEmpty()";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean referencedElementHasId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.USE, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.USE___REFERENCED_ELEMENT_HAS_ID__DIAGNOSTICCHAIN_MAP, REFERENCED_ELEMENT_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.USE__REFERENCED_ELEMENT_HAS_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case DGPackage.USE__BOUNDS:
			return basicSetBounds(null, msgs);
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
		switch(featureID) {
		case DGPackage.USE__BOUNDS:
			return getBounds();
		case DGPackage.USE__REFERENCED_ELEMENT:
			if(resolve)
				return getReferencedElement();
			return basicGetReferencedElement();
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
		switch(featureID) {
		case DGPackage.USE__BOUNDS:
			setBounds((Bounds)newValue);
			return;
		case DGPackage.USE__REFERENCED_ELEMENT:
			setReferencedElement((GraphicalElement)newValue);
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
		switch(featureID) {
		case DGPackage.USE__BOUNDS:
			setBounds((Bounds)null);
			return;
		case DGPackage.USE__REFERENCED_ELEMENT:
			setReferencedElement((GraphicalElement)null);
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
		switch(featureID) {
		case DGPackage.USE__BOUNDS:
			return bounds != null;
		case DGPackage.USE__REFERENCED_ELEMENT:
			return referencedElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch(operationID) {
		case DGPackage.USE___REFERENCED_ELEMENT_HAS_ID__DIAGNOSTICCHAIN_MAP:
			return referencedElementHasId((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} // UseImpl
