/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Time Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#isIsLogicalTimeSuspended <em>Is Logical Time Suspended</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#getEndPointReference <em>End Point Reference</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#getStartPointReference <em>Start Point Reference</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl#getConsecutiveTimeCondition <em>Consecutive Time Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalTimeConditionImpl extends EAElementImpl implements LogicalTimeCondition {
	/**
	 * The default value of the '{@link #isIsLogicalTimeSuspended() <em>Is Logical Time Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLogicalTimeSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOGICAL_TIME_SUSPENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLogicalTimeSuspended() <em>Is Logical Time Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLogicalTimeSuspended()
	 * @generated
	 * @ordered
	 */
	protected boolean isLogicalTimeSuspended = IS_LOGICAL_TIME_SUSPENDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndPointReference() <em>End Point Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointReference()
	 * @generated
	 * @ordered
	 */
	protected TransitionEvent endPointReference;

	/**
	 * The cached value of the '{@link #getStartPointReference() <em>Start Point Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointReference()
	 * @generated
	 * @ordered
	 */
	protected TransitionEvent startPointReference;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected EAValue width;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected EAValue lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected EAValue upper;

	/**
	 * The cached value of the '{@link #getConsecutiveTimeCondition() <em>Consecutive Time Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveTimeCondition()
	 * @generated
	 * @ordered
	 */
	protected LogicalTimeCondition consecutiveTimeCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalTimeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalconstraintPackage.Literals.LOGICAL_TIME_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLogicalTimeSuspended() {
		return isLogicalTimeSuspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLogicalTimeSuspended(boolean newIsLogicalTimeSuspended) {
		boolean oldIsLogicalTimeSuspended = isLogicalTimeSuspended;
		isLogicalTimeSuspended = newIsLogicalTimeSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED, oldIsLogicalTimeSuspended, isLogicalTimeSuspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent getEndPointReference() {
		if (endPointReference != null && endPointReference.eIsProxy()) {
			InternalEObject oldEndPointReference = (InternalEObject)endPointReference;
			endPointReference = (TransitionEvent)eResolveProxy(oldEndPointReference);
			if (endPointReference != oldEndPointReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__END_POINT_REFERENCE, oldEndPointReference, endPointReference));
			}
		}
		return endPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent basicGetEndPointReference() {
		return endPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointReference(TransitionEvent newEndPointReference) {
		TransitionEvent oldEndPointReference = endPointReference;
		endPointReference = newEndPointReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__END_POINT_REFERENCE, oldEndPointReference, endPointReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent getStartPointReference() {
		if (startPointReference != null && startPointReference.eIsProxy()) {
			InternalEObject oldStartPointReference = (InternalEObject)startPointReference;
			startPointReference = (TransitionEvent)eResolveProxy(oldStartPointReference);
			if (startPointReference != oldStartPointReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__START_POINT_REFERENCE, oldStartPointReference, startPointReference));
			}
		}
		return startPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent basicGetStartPointReference() {
		return startPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPointReference(TransitionEvent newStartPointReference) {
		TransitionEvent oldStartPointReference = startPointReference;
		startPointReference = newStartPointReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__START_POINT_REFERENCE, oldStartPointReference, startPointReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAValue getWidth() {
		if (width != null && width.eIsProxy()) {
			InternalEObject oldWidth = (InternalEObject)width;
			width = (EAValue)eResolveProxy(oldWidth);
			if (width != oldWidth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__WIDTH, oldWidth, width));
			}
		}
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAValue basicGetWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(EAValue newWidth) {
		EAValue oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAValue getLower() {
		if (lower != null && lower.eIsProxy()) {
			InternalEObject oldLower = (InternalEObject)lower;
			lower = (EAValue)eResolveProxy(oldLower);
			if (lower != oldLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__LOWER, oldLower, lower));
			}
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAValue basicGetLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(EAValue newLower) {
		EAValue oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAValue getUpper() {
		if (upper != null && upper.eIsProxy()) {
			InternalEObject oldUpper = (InternalEObject)upper;
			upper = (EAValue)eResolveProxy(oldUpper);
			if (upper != oldUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__UPPER, oldUpper, upper));
			}
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAValue basicGetUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(EAValue newUpper) {
		EAValue oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTimeCondition getConsecutiveTimeCondition() {
		if (consecutiveTimeCondition != null && consecutiveTimeCondition.eIsProxy()) {
			InternalEObject oldConsecutiveTimeCondition = (InternalEObject)consecutiveTimeCondition;
			consecutiveTimeCondition = (LogicalTimeCondition)eResolveProxy(oldConsecutiveTimeCondition);
			if (consecutiveTimeCondition != oldConsecutiveTimeCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION, oldConsecutiveTimeCondition, consecutiveTimeCondition));
			}
		}
		return consecutiveTimeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTimeCondition basicGetConsecutiveTimeCondition() {
		return consecutiveTimeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsecutiveTimeCondition(LogicalTimeCondition newConsecutiveTimeCondition) {
		LogicalTimeCondition oldConsecutiveTimeCondition = consecutiveTimeCondition;
		consecutiveTimeCondition = newConsecutiveTimeCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION, oldConsecutiveTimeCondition, consecutiveTimeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED:
				return isIsLogicalTimeSuspended();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__END_POINT_REFERENCE:
				if (resolve) return getEndPointReference();
				return basicGetEndPointReference();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__START_POINT_REFERENCE:
				if (resolve) return getStartPointReference();
				return basicGetStartPointReference();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__WIDTH:
				if (resolve) return getWidth();
				return basicGetWidth();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION:
				if (resolve) return getConsecutiveTimeCondition();
				return basicGetConsecutiveTimeCondition();
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
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED:
				setIsLogicalTimeSuspended((Boolean)newValue);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__END_POINT_REFERENCE:
				setEndPointReference((TransitionEvent)newValue);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__START_POINT_REFERENCE:
				setStartPointReference((TransitionEvent)newValue);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__WIDTH:
				setWidth((EAValue)newValue);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__LOWER:
				setLower((EAValue)newValue);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__UPPER:
				setUpper((EAValue)newValue);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION:
				setConsecutiveTimeCondition((LogicalTimeCondition)newValue);
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
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED:
				setIsLogicalTimeSuspended(IS_LOGICAL_TIME_SUSPENDED_EDEFAULT);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__END_POINT_REFERENCE:
				setEndPointReference((TransitionEvent)null);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__START_POINT_REFERENCE:
				setStartPointReference((TransitionEvent)null);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__WIDTH:
				setWidth((EAValue)null);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__LOWER:
				setLower((EAValue)null);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__UPPER:
				setUpper((EAValue)null);
				return;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION:
				setConsecutiveTimeCondition((LogicalTimeCondition)null);
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
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED:
				return isLogicalTimeSuspended != IS_LOGICAL_TIME_SUSPENDED_EDEFAULT;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__END_POINT_REFERENCE:
				return endPointReference != null;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__START_POINT_REFERENCE:
				return startPointReference != null;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__WIDTH:
				return width != null;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__LOWER:
				return lower != null;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__UPPER:
				return upper != null;
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION:
				return consecutiveTimeCondition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLogicalTimeSuspended: ");
		result.append(isLogicalTimeSuspended);
		result.append(')');
		return result.toString();
	}

} //LogicalTimeConditionImpl
