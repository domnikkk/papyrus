/**
 */
package org.eclipse.papyrus.eastadl.timing.events.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.dependability.FeatureFlaw;
import org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.impl.EventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Feature Flaw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFeatureFlawImpl#getFeatureFlaw <em>Feature Flaw</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFeatureFlawImpl extends EventImpl implements EventFeatureFlaw {
	/**
	 * The cached value of the '{@link #getFeatureFlaw() <em>Feature Flaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFeatureFlaw()
	 * @generated
	 * @ordered
	 */
	protected FeatureFlaw featureFlaw;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EventFeatureFlawImpl() {
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
		return EventsPackage.Literals.EVENT_FEATURE_FLAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FeatureFlaw getFeatureFlaw() {
		if (featureFlaw != null && featureFlaw.eIsProxy()) {
			InternalEObject oldFeatureFlaw = (InternalEObject) featureFlaw;
			featureFlaw = (FeatureFlaw) eResolveProxy(oldFeatureFlaw);
			if (featureFlaw != oldFeatureFlaw) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.EVENT_FEATURE_FLAW__FEATURE_FLAW, oldFeatureFlaw, featureFlaw));
				}
			}
		}
		return featureFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureFlaw basicGetFeatureFlaw() {
		return featureFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFeatureFlaw(FeatureFlaw newFeatureFlaw) {
		FeatureFlaw oldFeatureFlaw = featureFlaw;
		featureFlaw = newFeatureFlaw;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FEATURE_FLAW__FEATURE_FLAW, oldFeatureFlaw, featureFlaw));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EventsPackage.EVENT_FEATURE_FLAW__FEATURE_FLAW:
			if (resolve) {
				return getFeatureFlaw();
			}
			return basicGetFeatureFlaw();
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
		switch (featureID) {
		case EventsPackage.EVENT_FEATURE_FLAW__FEATURE_FLAW:
			setFeatureFlaw((FeatureFlaw) newValue);
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
		switch (featureID) {
		case EventsPackage.EVENT_FEATURE_FLAW__FEATURE_FLAW:
			setFeatureFlaw((FeatureFlaw) null);
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
		switch (featureID) {
		case EventsPackage.EVENT_FEATURE_FLAW__FEATURE_FLAW:
			return featureFlaw != null;
		}
		return super.eIsSet(featureID);
	}

} // EventFeatureFlawImpl
