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
import org.eclipse.papyrus.dd.dg.Image;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Image</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.ImageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.ImageImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.ImageImpl#isAspectRatioPreserved <em>Is Aspect Ratio Preserved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends GraphicalElementImpl implements Image {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The default value of the '{@link #isAspectRatioPreserved() <em>Is Aspect Ratio Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspectRatioPreserved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASPECT_RATIO_PRESERVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAspectRatioPreserved() <em>Is Aspect Ratio Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspectRatioPreserved()
	 * @generated
	 * @ordered
	 */
	protected boolean isAspectRatioPreserved = IS_ASPECT_RATIO_PRESERVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.IMAGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds,
			NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.IMAGE__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Bounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.IMAGE__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.IMAGE__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.IMAGE__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAspectRatioPreserved() {
		return isAspectRatioPreserved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAspectRatioPreserved(boolean newIsAspectRatioPreserved) {
		boolean oldIsAspectRatioPreserved = isAspectRatioPreserved;
		isAspectRatioPreserved = newIsAspectRatioPreserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.IMAGE__IS_ASPECT_RATIO_PRESERVED, oldIsAspectRatioPreserved, isAspectRatioPreserved));
	}

	/**
	 * The cached validation expression for the '
	 * {@link #sourceCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Source Cannot Be Empty</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #sourceCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CANNOT_BE_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "source->notEmpty() implies source.size() > 0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sourceCannotBeEmpty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.IMAGE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.IMAGE___SOURCE_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP,
				 SOURCE_CANNOT_BE_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.IMAGE__SOURCE_CANNOT_BE_EMPTY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DGPackage.IMAGE__BOUNDS:
				return basicSetBounds(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DGPackage.IMAGE__SOURCE:
				return getSource();
			case DGPackage.IMAGE__BOUNDS:
				return getBounds();
			case DGPackage.IMAGE__IS_ASPECT_RATIO_PRESERVED:
				return isAspectRatioPreserved();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DGPackage.IMAGE__SOURCE:
				setSource((String)newValue);
				return;
			case DGPackage.IMAGE__BOUNDS:
				setBounds((Bounds)newValue);
				return;
			case DGPackage.IMAGE__IS_ASPECT_RATIO_PRESERVED:
				setIsAspectRatioPreserved((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DGPackage.IMAGE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case DGPackage.IMAGE__BOUNDS:
				setBounds((Bounds)null);
				return;
			case DGPackage.IMAGE__IS_ASPECT_RATIO_PRESERVED:
				setIsAspectRatioPreserved(IS_ASPECT_RATIO_PRESERVED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DGPackage.IMAGE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case DGPackage.IMAGE__BOUNDS:
				return bounds != null;
			case DGPackage.IMAGE__IS_ASPECT_RATIO_PRESERVED:
				return isAspectRatioPreserved != IS_ASPECT_RATIO_PRESERVED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case DGPackage.IMAGE___SOURCE_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP:
				return sourceCannotBeEmpty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(", isAspectRatioPreserved: ");
		result.append(isAspectRatioPreserved);
		result.append(')');
		return result.toString();
	}

} // ImageImpl
