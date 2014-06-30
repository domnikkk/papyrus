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

import java.awt.Color;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Paint;
import org.eclipse.papyrus.dd.dg.PaintServer;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Paint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.PaintImpl#getColor <em>Color</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.PaintImpl#getPaintServer <em>Paint
 * Server</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PaintImpl extends MinimalEObjectImpl.Container implements Paint {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaintServer() <em>Paint Server</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaintServer()
	 * @generated
	 * @ordered
	 */
	protected PaintServer paintServer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.PAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.PAINT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PaintServer getPaintServer() {
		if (paintServer != null && paintServer.eIsProxy()) {
			InternalEObject oldPaintServer = (InternalEObject) paintServer;
			paintServer = (PaintServer) eResolveProxy(oldPaintServer);
			if (paintServer != oldPaintServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DGPackage.PAINT__PAINT_SERVER, oldPaintServer,
							paintServer));
			}
		}
		return paintServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PaintServer basicGetPaintServer() {
		return paintServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPaintServer(PaintServer newPaintServer) {
		PaintServer oldPaintServer = paintServer;
		paintServer = newPaintServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.PAINT__PAINT_SERVER, oldPaintServer, paintServer));
	}

	/**
	 * The cached validation expression for the '
	 * {@link #referencedPaintServerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Paint Server Has Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #referencedPaintServerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_PAINT_SERVER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "paintServer->notEmpty() implies paintServer.id->notEmpty()";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean referencedPaintServerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DGValidator
				.validate(
						DGPackage.Literals.PAINT,
						this,
						diagnostics,
						context,
						"http://www.eclipse.org/emf/2002/Ecore/OCL",
						DGPackage.Literals.PAINT___REFERENCED_PAINT_SERVER_HAS_ID__DIAGNOSTICCHAIN_MAP,
						REFERENCED_PAINT_SERVER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
						Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE,
						DGValidator.PAINT__REFERENCED_PAINT_SERVER_HAS_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.PAINT__COLOR:
			return getColor();
		case DGPackage.PAINT__PAINT_SERVER:
			if (resolve)
				return getPaintServer();
			return basicGetPaintServer();
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
		case DGPackage.PAINT__COLOR:
			setColor((Color) newValue);
			return;
		case DGPackage.PAINT__PAINT_SERVER:
			setPaintServer((PaintServer) newValue);
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
		case DGPackage.PAINT__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case DGPackage.PAINT__PAINT_SERVER:
			setPaintServer((PaintServer) null);
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
		case DGPackage.PAINT__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case DGPackage.PAINT__PAINT_SERVER:
			return paintServer != null;
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
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case DGPackage.PAINT___REFERENCED_PAINT_SERVER_HAS_ID__DIAGNOSTICCHAIN_MAP:
			return referencedPaintServerHasId(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} // PaintImpl
