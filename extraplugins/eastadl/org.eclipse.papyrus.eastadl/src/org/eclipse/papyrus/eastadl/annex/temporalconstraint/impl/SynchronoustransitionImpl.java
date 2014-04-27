/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronoustransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.SynchronoustransitionImpl#getReadTransitionEvent <em>Read Transition Event</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.SynchronoustransitionImpl#getWriteTransitionEvent <em>Write Transition Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronoustransitionImpl extends TransitionImpl implements Synchronoustransition {
	/**
	 * The cached value of the '{@link #getReadTransitionEvent() <em>Read Transition Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected TransitionEvent readTransitionEvent;

	/**
	 * The cached value of the '{@link #getWriteTransitionEvent() <em>Write Transition Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected TransitionEvent writeTransitionEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronoustransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalconstraintPackage.Literals.SYNCHRONOUSTRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent getReadTransitionEvent() {
		if (readTransitionEvent != null && readTransitionEvent.eIsProxy()) {
			InternalEObject oldReadTransitionEvent = (InternalEObject)readTransitionEvent;
			readTransitionEvent = (TransitionEvent)eResolveProxy(oldReadTransitionEvent);
			if (readTransitionEvent != oldReadTransitionEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT, oldReadTransitionEvent, readTransitionEvent));
			}
		}
		return readTransitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent basicGetReadTransitionEvent() {
		return readTransitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadTransitionEvent(TransitionEvent newReadTransitionEvent) {
		TransitionEvent oldReadTransitionEvent = readTransitionEvent;
		readTransitionEvent = newReadTransitionEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT, oldReadTransitionEvent, readTransitionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent getWriteTransitionEvent() {
		if (writeTransitionEvent != null && writeTransitionEvent.eIsProxy()) {
			InternalEObject oldWriteTransitionEvent = (InternalEObject)writeTransitionEvent;
			writeTransitionEvent = (TransitionEvent)eResolveProxy(oldWriteTransitionEvent);
			if (writeTransitionEvent != oldWriteTransitionEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT, oldWriteTransitionEvent, writeTransitionEvent));
			}
		}
		return writeTransitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent basicGetWriteTransitionEvent() {
		return writeTransitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteTransitionEvent(TransitionEvent newWriteTransitionEvent) {
		TransitionEvent oldWriteTransitionEvent = writeTransitionEvent;
		writeTransitionEvent = newWriteTransitionEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT, oldWriteTransitionEvent, writeTransitionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT:
				if (resolve) return getReadTransitionEvent();
				return basicGetReadTransitionEvent();
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT:
				if (resolve) return getWriteTransitionEvent();
				return basicGetWriteTransitionEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT:
				setReadTransitionEvent((TransitionEvent)newValue);
				return;
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT:
				setWriteTransitionEvent((TransitionEvent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT:
				setReadTransitionEvent((TransitionEvent)null);
				return;
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT:
				setWriteTransitionEvent((TransitionEvent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT:
				return readTransitionEvent != null;
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT:
				return writeTransitionEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronoustransitionImpl
