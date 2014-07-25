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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.MarkedElement;
import org.eclipse.papyrus.dd.dg.Marker;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Marked Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl#getEndMarker <em>End Marker</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl#getMidMarker <em>Mid Marker</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl#getStartMarker <em>Start Marker</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MarkedElementImpl extends GraphicalElementImpl implements
		MarkedElement {
	/**
	 * The cached value of the '{@link #getEndMarker() <em>End Marker</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndMarker()
	 * @generated
	 * @ordered
	 */
	protected Marker endMarker;

	/**
	 * The cached value of the '{@link #getMidMarker() <em>Mid Marker</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMidMarker()
	 * @generated
	 * @ordered
	 */
	protected Marker midMarker;

	/**
	 * The cached value of the '{@link #getStartMarker() <em>Start Marker</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartMarker()
	 * @generated
	 * @ordered
	 */
	protected Marker startMarker;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.MARKED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Marker getEndMarker() {
		if (endMarker != null && endMarker.eIsProxy()) {
			InternalEObject oldEndMarker = (InternalEObject)endMarker;
			endMarker = (Marker)eResolveProxy(oldEndMarker);
			if (endMarker != oldEndMarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.MARKED_ELEMENT__END_MARKER, oldEndMarker, endMarker));
			}
		}
		return endMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetEndMarker() {
		return endMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndMarker(Marker newEndMarker) {
		Marker oldEndMarker = endMarker;
		endMarker = newEndMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKED_ELEMENT__END_MARKER, oldEndMarker, endMarker));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Marker getMidMarker() {
		if (midMarker != null && midMarker.eIsProxy()) {
			InternalEObject oldMidMarker = (InternalEObject)midMarker;
			midMarker = (Marker)eResolveProxy(oldMidMarker);
			if (midMarker != oldMidMarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.MARKED_ELEMENT__MID_MARKER, oldMidMarker, midMarker));
			}
		}
		return midMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetMidMarker() {
		return midMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidMarker(Marker newMidMarker) {
		Marker oldMidMarker = midMarker;
		midMarker = newMidMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKED_ELEMENT__MID_MARKER, oldMidMarker, midMarker));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Marker getStartMarker() {
		if (startMarker != null && startMarker.eIsProxy()) {
			InternalEObject oldStartMarker = (InternalEObject)startMarker;
			startMarker = (Marker)eResolveProxy(oldStartMarker);
			if (startMarker != oldStartMarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.MARKED_ELEMENT__START_MARKER, oldStartMarker, startMarker));
			}
		}
		return startMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetStartMarker() {
		return startMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMarker(Marker newStartMarker) {
		Marker oldStartMarker = startMarker;
		startMarker = newStartMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKED_ELEMENT__START_MARKER, oldStartMarker, startMarker));
	}

	/**
	 * The cached validation expression for the '
	 * {@link #referencedStartMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Start Marker Has Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #referencedStartMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_START_MARKER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "startMarker->notEmpty() implies startMarker.id->notEmpty()";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean referencedStartMarkerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.MARKED_ELEMENT,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP,
				 REFERENCED_START_MARKER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.MARKED_ELEMENT__REFERENCED_START_MARKER_HAS_ID);
	}

	/**
	 * The cached validation expression for the '
	 * {@link #referencedMidMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Mid Marker Has Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #referencedMidMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_MID_MARKER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "midMarker->notEmpty() implies midMarker.id->notEmpty()";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean referencedMidMarkerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.MARKED_ELEMENT,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP,
				 REFERENCED_MID_MARKER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.MARKED_ELEMENT__REFERENCED_MID_MARKER_HAS_ID);
	}

	/**
	 * The cached validation expression for the '
	 * {@link #referencedEndMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced End Marker Has Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #referencedEndMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_END_MARKER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "endMarker->notEmpty() implies endMarker.id->notEmpty()";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean referencedEndMarkerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.MARKED_ELEMENT,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP,
				 REFERENCED_END_MARKER_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.MARKED_ELEMENT__REFERENCED_END_MARKER_HAS_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DGPackage.MARKED_ELEMENT__END_MARKER:
				if (resolve) return getEndMarker();
				return basicGetEndMarker();
			case DGPackage.MARKED_ELEMENT__MID_MARKER:
				if (resolve) return getMidMarker();
				return basicGetMidMarker();
			case DGPackage.MARKED_ELEMENT__START_MARKER:
				if (resolve) return getStartMarker();
				return basicGetStartMarker();
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
			case DGPackage.MARKED_ELEMENT__END_MARKER:
				setEndMarker((Marker)newValue);
				return;
			case DGPackage.MARKED_ELEMENT__MID_MARKER:
				setMidMarker((Marker)newValue);
				return;
			case DGPackage.MARKED_ELEMENT__START_MARKER:
				setStartMarker((Marker)newValue);
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
			case DGPackage.MARKED_ELEMENT__END_MARKER:
				setEndMarker((Marker)null);
				return;
			case DGPackage.MARKED_ELEMENT__MID_MARKER:
				setMidMarker((Marker)null);
				return;
			case DGPackage.MARKED_ELEMENT__START_MARKER:
				setStartMarker((Marker)null);
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
			case DGPackage.MARKED_ELEMENT__END_MARKER:
				return endMarker != null;
			case DGPackage.MARKED_ELEMENT__MID_MARKER:
				return midMarker != null;
			case DGPackage.MARKED_ELEMENT__START_MARKER:
				return startMarker != null;
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
			case DGPackage.MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP:
				return referencedStartMarkerHasId((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DGPackage.MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP:
				return referencedMidMarkerHasId((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DGPackage.MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP:
				return referencedEndMarkerHasId((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} // MarkedElementImpl
