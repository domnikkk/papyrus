/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getElectricCurrentExp <em>Electric Current Exp</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getLenghtExp <em>Lenght Exp</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getMassExp <em>Mass Exp</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl#getTimeExp <em>Time Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantityImpl extends EAPackageableElementImpl implements Quantity {
	/**
	 * The default value of the '{@link #getAmountOfSubstanceExp() <em>Amount Of Substance Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAmountOfSubstanceExp()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfSubstanceExp() <em>Amount Of Substance Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAmountOfSubstanceExp()
	 * @generated
	 * @ordered
	 */
	protected int amountOfSubstanceExp = AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getElectricCurrentExp() <em>Electric Current Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getElectricCurrentExp()
	 * @generated
	 * @ordered
	 */
	protected static final int ELECTRIC_CURRENT_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElectricCurrentExp() <em>Electric Current Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getElectricCurrentExp()
	 * @generated
	 * @ordered
	 */
	protected int electricCurrentExp = ELECTRIC_CURRENT_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLenghtExp() <em>Lenght Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLenghtExp()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGHT_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLenghtExp() <em>Lenght Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLenghtExp()
	 * @generated
	 * @ordered
	 */
	protected int lenghtExp = LENGHT_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminousIntensityExp() <em>Luminous Intensity Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLuminousIntensityExp()
	 * @generated
	 * @ordered
	 */
	protected static final int LUMINOUS_INTENSITY_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLuminousIntensityExp() <em>Luminous Intensity Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLuminousIntensityExp()
	 * @generated
	 * @ordered
	 */
	protected int luminousIntensityExp = LUMINOUS_INTENSITY_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMassExp() <em>Mass Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMassExp()
	 * @generated
	 * @ordered
	 */
	protected static final int MASS_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMassExp() <em>Mass Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMassExp()
	 * @generated
	 * @ordered
	 */
	protected int massExp = MASS_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermodynamicTemperatureExp() <em>Thermodynamic Temperature Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getThermodynamicTemperatureExp()
	 * @generated
	 * @ordered
	 */
	protected static final int THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThermodynamicTemperatureExp() <em>Thermodynamic Temperature Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getThermodynamicTemperatureExp()
	 * @generated
	 * @ordered
	 */
	protected int thermodynamicTemperatureExp = THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeExp() <em>Time Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTimeExp()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EXP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeExp() <em>Time Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTimeExp()
	 * @generated
	 * @ordered
	 */
	protected int timeExp = TIME_EXP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected QuantityImpl() {
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
		return DatatypesPackage.Literals.QUANTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getAmountOfSubstanceExp() {
		return amountOfSubstanceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAmountOfSubstanceExp(int newAmountOfSubstanceExp) {
		int oldAmountOfSubstanceExp = amountOfSubstanceExp;
		amountOfSubstanceExp = newAmountOfSubstanceExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP, oldAmountOfSubstanceExp, amountOfSubstanceExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getElectricCurrentExp() {
		return electricCurrentExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setElectricCurrentExp(int newElectricCurrentExp) {
		int oldElectricCurrentExp = electricCurrentExp;
		electricCurrentExp = newElectricCurrentExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__ELECTRIC_CURRENT_EXP, oldElectricCurrentExp, electricCurrentExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getLenghtExp() {
		return lenghtExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLenghtExp(int newLenghtExp) {
		int oldLenghtExp = lenghtExp;
		lenghtExp = newLenghtExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__LENGHT_EXP, oldLenghtExp, lenghtExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getLuminousIntensityExp() {
		return luminousIntensityExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLuminousIntensityExp(int newLuminousIntensityExp) {
		int oldLuminousIntensityExp = luminousIntensityExp;
		luminousIntensityExp = newLuminousIntensityExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__LUMINOUS_INTENSITY_EXP, oldLuminousIntensityExp, luminousIntensityExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getMassExp() {
		return massExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMassExp(int newMassExp) {
		int oldMassExp = massExp;
		massExp = newMassExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__MASS_EXP, oldMassExp, massExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getThermodynamicTemperatureExp() {
		return thermodynamicTemperatureExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setThermodynamicTemperatureExp(int newThermodynamicTemperatureExp) {
		int oldThermodynamicTemperatureExp = thermodynamicTemperatureExp;
		thermodynamicTemperatureExp = newThermodynamicTemperatureExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP, oldThermodynamicTemperatureExp, thermodynamicTemperatureExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getTimeExp() {
		return timeExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTimeExp(int newTimeExp) {
		int oldTimeExp = timeExp;
		timeExp = newTimeExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUANTITY__TIME_EXP, oldTimeExp, timeExp));
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
		case DatatypesPackage.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
			return getAmountOfSubstanceExp();
		case DatatypesPackage.QUANTITY__ELECTRIC_CURRENT_EXP:
			return getElectricCurrentExp();
		case DatatypesPackage.QUANTITY__LENGHT_EXP:
			return getLenghtExp();
		case DatatypesPackage.QUANTITY__LUMINOUS_INTENSITY_EXP:
			return getLuminousIntensityExp();
		case DatatypesPackage.QUANTITY__MASS_EXP:
			return getMassExp();
		case DatatypesPackage.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
			return getThermodynamicTemperatureExp();
		case DatatypesPackage.QUANTITY__TIME_EXP:
			return getTimeExp();
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
		case DatatypesPackage.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
			setAmountOfSubstanceExp((Integer) newValue);
			return;
		case DatatypesPackage.QUANTITY__ELECTRIC_CURRENT_EXP:
			setElectricCurrentExp((Integer) newValue);
			return;
		case DatatypesPackage.QUANTITY__LENGHT_EXP:
			setLenghtExp((Integer) newValue);
			return;
		case DatatypesPackage.QUANTITY__LUMINOUS_INTENSITY_EXP:
			setLuminousIntensityExp((Integer) newValue);
			return;
		case DatatypesPackage.QUANTITY__MASS_EXP:
			setMassExp((Integer) newValue);
			return;
		case DatatypesPackage.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
			setThermodynamicTemperatureExp((Integer) newValue);
			return;
		case DatatypesPackage.QUANTITY__TIME_EXP:
			setTimeExp((Integer) newValue);
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
		case DatatypesPackage.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
			setAmountOfSubstanceExp(AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT);
			return;
		case DatatypesPackage.QUANTITY__ELECTRIC_CURRENT_EXP:
			setElectricCurrentExp(ELECTRIC_CURRENT_EXP_EDEFAULT);
			return;
		case DatatypesPackage.QUANTITY__LENGHT_EXP:
			setLenghtExp(LENGHT_EXP_EDEFAULT);
			return;
		case DatatypesPackage.QUANTITY__LUMINOUS_INTENSITY_EXP:
			setLuminousIntensityExp(LUMINOUS_INTENSITY_EXP_EDEFAULT);
			return;
		case DatatypesPackage.QUANTITY__MASS_EXP:
			setMassExp(MASS_EXP_EDEFAULT);
			return;
		case DatatypesPackage.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
			setThermodynamicTemperatureExp(THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT);
			return;
		case DatatypesPackage.QUANTITY__TIME_EXP:
			setTimeExp(TIME_EXP_EDEFAULT);
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
		case DatatypesPackage.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
			return amountOfSubstanceExp != AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT;
		case DatatypesPackage.QUANTITY__ELECTRIC_CURRENT_EXP:
			return electricCurrentExp != ELECTRIC_CURRENT_EXP_EDEFAULT;
		case DatatypesPackage.QUANTITY__LENGHT_EXP:
			return lenghtExp != LENGHT_EXP_EDEFAULT;
		case DatatypesPackage.QUANTITY__LUMINOUS_INTENSITY_EXP:
			return luminousIntensityExp != LUMINOUS_INTENSITY_EXP_EDEFAULT;
		case DatatypesPackage.QUANTITY__MASS_EXP:
			return massExp != MASS_EXP_EDEFAULT;
		case DatatypesPackage.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
			return thermodynamicTemperatureExp != THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT;
		case DatatypesPackage.QUANTITY__TIME_EXP:
			return timeExp != TIME_EXP_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (amountOfSubstanceExp: "); //$NON-NLS-1$
		result.append(amountOfSubstanceExp);
		result.append(", electricCurrentExp: "); //$NON-NLS-1$
		result.append(electricCurrentExp);
		result.append(", lenghtExp: "); //$NON-NLS-1$
		result.append(lenghtExp);
		result.append(", luminousIntensityExp: "); //$NON-NLS-1$
		result.append(luminousIntensityExp);
		result.append(", massExp: "); //$NON-NLS-1$
		result.append(massExp);
		result.append(", thermodynamicTemperatureExp: "); //$NON-NLS-1$
		result.append(thermodynamicTemperatureExp);
		result.append(", timeExp: "); //$NON-NLS-1$
		result.append(timeExp);
		result.append(')');
		return result.toString();
	}

} // QuantityImpl
