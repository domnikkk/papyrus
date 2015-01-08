/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.timing.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.EventChain;
import org.eclipse.papyrus.eastadl.timing.TimingPackage;


/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Event Chain</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl#getSegment <em>Segment</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl#getResponse <em>Response</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.impl.EventChainImpl#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventChainImpl extends TimingDescriptionImpl implements EventChain {

	/**
	 * The cached value of the '{@link #getSegment() <em>Segment</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> segment;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Event response;

	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Event stimulus;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EventChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimingPackage.EVENT_CHAIN__SEGMENT:
			return getSegment();
		case TimingPackage.EVENT_CHAIN__RESPONSE:
			if (resolve)
				return getResponse();
			return basicGetResponse();
		case TimingPackage.EVENT_CHAIN__STIMULUS:
			if (resolve)
				return getStimulus();
			return basicGetStimulus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TimingPackage.EVENT_CHAIN__SEGMENT:
			return segment != null && !segment.isEmpty();
		case TimingPackage.EVENT_CHAIN__RESPONSE:
			return response != null;
		case TimingPackage.EVENT_CHAIN__STIMULUS:
			return stimulus != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimingPackage.EVENT_CHAIN__SEGMENT:
			getSegment().clear();
			getSegment().addAll((Collection<? extends EventChain>) newValue);
			return;
		case TimingPackage.EVENT_CHAIN__RESPONSE:
			setResponse((Event) newValue);
			return;
		case TimingPackage.EVENT_CHAIN__STIMULUS:
			setStimulus((Event) newValue);
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
	protected EClass eStaticClass() {
		return TimingPackage.Literals.EVENT_CHAIN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TimingPackage.EVENT_CHAIN__SEGMENT:
			getSegment().clear();
			return;
		case TimingPackage.EVENT_CHAIN__RESPONSE:
			setResponse((Event) null);
			return;
		case TimingPackage.EVENT_CHAIN__STIMULUS:
			setStimulus((Event) null);
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
	public Event getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject) response;
			response = (Event) eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingPackage.EVENT_CHAIN__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Event basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setResponse(Event newResponse) {
		Event oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.EVENT_CHAIN__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EventChain> getSegment() {
		if (segment == null) {
			segment = new EObjectResolvingEList<EventChain>(EventChain.class, this, TimingPackage.EVENT_CHAIN__SEGMENT);
		}
		return segment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Event getStimulus() {
		if (stimulus != null && stimulus.eIsProxy()) {
			InternalEObject oldStimulus = (InternalEObject) stimulus;
			stimulus = (Event) eResolveProxy(oldStimulus);
			if (stimulus != oldStimulus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingPackage.EVENT_CHAIN__STIMULUS, oldStimulus, stimulus));
			}
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Event basicGetStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStimulus(Event newStimulus) {
		Event oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.EVENT_CHAIN__STIMULUS, oldStimulus, stimulus));
	}

} // EventChainImpl
