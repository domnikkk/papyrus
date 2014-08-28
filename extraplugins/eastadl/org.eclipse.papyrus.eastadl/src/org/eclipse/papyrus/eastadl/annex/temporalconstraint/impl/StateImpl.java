/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.State;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.dependability.Hazard;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#isIsErrorState <em>Is Error State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#isIsHazard <em>Is Hazard</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#isIsInitState <em>Is Init State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#isIsMode <em>Is Mode</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#getHazardDeclaration <em>Hazard Declaration</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#getModeDeclaration <em>Mode Declaration</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#getQuantificationInvariant <em>Quantification Invariant</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl#getTimeInvariant <em>Time Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EAElementImpl implements State {
	/**
	 * The default value of the '{@link #isIsErrorState() <em>Is Error State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsErrorState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ERROR_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsErrorState() <em>Is Error State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsErrorState()
	 * @generated
	 * @ordered
	 */
	protected boolean isErrorState = IS_ERROR_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHazard() <em>Is Hazard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsHazard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HAZARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHazard() <em>Is Hazard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsHazard()
	 * @generated
	 * @ordered
	 */
	protected boolean isHazard = IS_HAZARD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInitState() <em>Is Init State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsInitState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INIT_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitState() <em>Is Init State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsInitState()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitState = IS_INIT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMode() <em>Is Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMode() <em>Is Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsMode()
	 * @generated
	 * @ordered
	 */
	protected boolean isMode = IS_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazardDeclaration() <em>Hazard Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHazardDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazardDeclaration;

	/**
	 * The cached value of the '{@link #getModeDeclaration() <em>Mode Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getModeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modeDeclaration;

	/**
	 * The cached value of the '{@link #getQuantificationInvariant() <em>Quantification Invariant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getQuantificationInvariant()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> quantificationInvariant;

	/**
	 * The cached value of the '{@link #getTimeInvariant() <em>Time Invariant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTimeInvariant()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTimeCondition> timeInvariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StateImpl() {
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
		return TemporalconstraintPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isIsErrorState() {
		return isErrorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIsErrorState(boolean newIsErrorState) {
		boolean oldIsErrorState = isErrorState;
		isErrorState = newIsErrorState;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.STATE__IS_ERROR_STATE, oldIsErrorState, isErrorState));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isIsHazard() {
		return isHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIsHazard(boolean newIsHazard) {
		boolean oldIsHazard = isHazard;
		isHazard = newIsHazard;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.STATE__IS_HAZARD, oldIsHazard, isHazard));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isIsInitState() {
		return isInitState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIsInitState(boolean newIsInitState) {
		boolean oldIsInitState = isInitState;
		isInitState = newIsInitState;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.STATE__IS_INIT_STATE, oldIsInitState, isInitState));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isIsMode() {
		return isMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIsMode(boolean newIsMode) {
		boolean oldIsMode = isMode;
		isMode = newIsMode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.STATE__IS_MODE, oldIsMode, isMode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Hazard> getHazardDeclaration() {
		if (hazardDeclaration == null) {
			hazardDeclaration = new EObjectResolvingEList<Hazard>(Hazard.class, this, TemporalconstraintPackage.STATE__HAZARD_DECLARATION);
		}
		return hazardDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Mode> getModeDeclaration() {
		if (modeDeclaration == null) {
			modeDeclaration = new EObjectResolvingEList<Mode>(Mode.class, this, TemporalconstraintPackage.STATE__MODE_DECLARATION);
		}
		return modeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Quantification> getQuantificationInvariant() {
		if (quantificationInvariant == null) {
			quantificationInvariant = new EObjectResolvingEList<Quantification>(Quantification.class, this, TemporalconstraintPackage.STATE__QUANTIFICATION_INVARIANT);
		}
		return quantificationInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<LogicalTimeCondition> getTimeInvariant() {
		if (timeInvariant == null) {
			timeInvariant = new EObjectResolvingEList<LogicalTimeCondition>(LogicalTimeCondition.class, this, TemporalconstraintPackage.STATE__TIME_INVARIANT);
		}
		return timeInvariant;
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
		case TemporalconstraintPackage.STATE__IS_ERROR_STATE:
			return isIsErrorState();
		case TemporalconstraintPackage.STATE__IS_HAZARD:
			return isIsHazard();
		case TemporalconstraintPackage.STATE__IS_INIT_STATE:
			return isIsInitState();
		case TemporalconstraintPackage.STATE__IS_MODE:
			return isIsMode();
		case TemporalconstraintPackage.STATE__HAZARD_DECLARATION:
			return getHazardDeclaration();
		case TemporalconstraintPackage.STATE__MODE_DECLARATION:
			return getModeDeclaration();
		case TemporalconstraintPackage.STATE__QUANTIFICATION_INVARIANT:
			return getQuantificationInvariant();
		case TemporalconstraintPackage.STATE__TIME_INVARIANT:
			return getTimeInvariant();
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
		switch (featureID) {
		case TemporalconstraintPackage.STATE__IS_ERROR_STATE:
			setIsErrorState((Boolean) newValue);
			return;
		case TemporalconstraintPackage.STATE__IS_HAZARD:
			setIsHazard((Boolean) newValue);
			return;
		case TemporalconstraintPackage.STATE__IS_INIT_STATE:
			setIsInitState((Boolean) newValue);
			return;
		case TemporalconstraintPackage.STATE__IS_MODE:
			setIsMode((Boolean) newValue);
			return;
		case TemporalconstraintPackage.STATE__HAZARD_DECLARATION:
			getHazardDeclaration().clear();
			getHazardDeclaration().addAll((Collection<? extends Hazard>) newValue);
			return;
		case TemporalconstraintPackage.STATE__MODE_DECLARATION:
			getModeDeclaration().clear();
			getModeDeclaration().addAll((Collection<? extends Mode>) newValue);
			return;
		case TemporalconstraintPackage.STATE__QUANTIFICATION_INVARIANT:
			getQuantificationInvariant().clear();
			getQuantificationInvariant().addAll((Collection<? extends Quantification>) newValue);
			return;
		case TemporalconstraintPackage.STATE__TIME_INVARIANT:
			getTimeInvariant().clear();
			getTimeInvariant().addAll((Collection<? extends LogicalTimeCondition>) newValue);
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
		case TemporalconstraintPackage.STATE__IS_ERROR_STATE:
			setIsErrorState(IS_ERROR_STATE_EDEFAULT);
			return;
		case TemporalconstraintPackage.STATE__IS_HAZARD:
			setIsHazard(IS_HAZARD_EDEFAULT);
			return;
		case TemporalconstraintPackage.STATE__IS_INIT_STATE:
			setIsInitState(IS_INIT_STATE_EDEFAULT);
			return;
		case TemporalconstraintPackage.STATE__IS_MODE:
			setIsMode(IS_MODE_EDEFAULT);
			return;
		case TemporalconstraintPackage.STATE__HAZARD_DECLARATION:
			getHazardDeclaration().clear();
			return;
		case TemporalconstraintPackage.STATE__MODE_DECLARATION:
			getModeDeclaration().clear();
			return;
		case TemporalconstraintPackage.STATE__QUANTIFICATION_INVARIANT:
			getQuantificationInvariant().clear();
			return;
		case TemporalconstraintPackage.STATE__TIME_INVARIANT:
			getTimeInvariant().clear();
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
		case TemporalconstraintPackage.STATE__IS_ERROR_STATE:
			return isErrorState != IS_ERROR_STATE_EDEFAULT;
		case TemporalconstraintPackage.STATE__IS_HAZARD:
			return isHazard != IS_HAZARD_EDEFAULT;
		case TemporalconstraintPackage.STATE__IS_INIT_STATE:
			return isInitState != IS_INIT_STATE_EDEFAULT;
		case TemporalconstraintPackage.STATE__IS_MODE:
			return isMode != IS_MODE_EDEFAULT;
		case TemporalconstraintPackage.STATE__HAZARD_DECLARATION:
			return hazardDeclaration != null && !hazardDeclaration.isEmpty();
		case TemporalconstraintPackage.STATE__MODE_DECLARATION:
			return modeDeclaration != null && !modeDeclaration.isEmpty();
		case TemporalconstraintPackage.STATE__QUANTIFICATION_INVARIANT:
			return quantificationInvariant != null && !quantificationInvariant.isEmpty();
		case TemporalconstraintPackage.STATE__TIME_INVARIANT:
			return timeInvariant != null && !timeInvariant.isEmpty();
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
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isErrorState: ");
		result.append(isErrorState);
		result.append(", isHazard: ");
		result.append(isHazard);
		result.append(", isInitState: ");
		result.append(isInitState);
		result.append(", isMode: ");
		result.append(isMode);
		result.append(')');
		return result.toString();
	}

} // StateImpl
