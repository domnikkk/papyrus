/**
 */
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortImpl#getBase_Port <em>Base Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortImpl#isIsShield <em>Is Shield</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortImpl#getContainedPin <em>Contained Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortImpl#getReferencedPin <em>Referenced Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortImpl#getContainedPort <em>Contained Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwarePortImpl extends AllocationTargetImpl implements HardwarePort {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #isIsShield() <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isIsShield()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShield() <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isIsShield()
	 * @generated
	 * @ordered
	 */
	protected boolean isShield = IS_SHIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedPin() <em>Contained Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContainedPin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> containedPin;

	/**
	 * The cached value of the '{@link #getReferencedPin() <em>Referenced Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferencedPin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> referencedPin;

	/**
	 * The cached value of the '{@link #getContainedPort() <em>Contained Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContainedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> containedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HardwarePortImpl() {
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
		return HardwaremodelingPackage.Literals.HARDWARE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject) base_Port;
			base_Port = (Port) eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT, oldBase_Port, base_Port));
				}
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT, oldBase_Port, base_Port));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwaremodelingPackage.HARDWARE_PORT__BASE_CLASS, oldBase_Class, base_Class));
				}
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isIsShield() {
		return isShield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsShield(boolean newIsShield) {
		boolean oldIsShield = isShield;
		isShield = newIsShield;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT__IS_SHIELD, oldIsShield, isShield));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HardwarePin> getContainedPin() {
		if (containedPin == null) {
			containedPin = new EObjectResolvingEList<HardwarePin>(HardwarePin.class, this, HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PIN);
		}
		return containedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HardwarePin> getReferencedPin() {
		if (referencedPin == null) {
			referencedPin = new EObjectResolvingEList<HardwarePin>(HardwarePin.class, this, HardwaremodelingPackage.HARDWARE_PORT__REFERENCED_PIN);
		}
		return referencedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HardwarePort> getContainedPort() {
		if (containedPort == null) {
			containedPort = new EObjectResolvingEList<HardwarePort>(HardwarePort.class, this, HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PORT);
		}
		return containedPort;
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
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT:
			if (resolve) {
				return getBase_Port();
			}
			return basicGetBase_Port();
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case HardwaremodelingPackage.HARDWARE_PORT__IS_SHIELD:
			return isIsShield();
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PIN:
			return getContainedPin();
		case HardwaremodelingPackage.HARDWARE_PORT__REFERENCED_PIN:
			return getReferencedPin();
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PORT:
			return getContainedPort();
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
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT:
			setBase_Port((Port) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__IS_SHIELD:
			setIsShield((Boolean) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PIN:
			getContainedPin().clear();
			getContainedPin().addAll((Collection<? extends HardwarePin>) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__REFERENCED_PIN:
			getReferencedPin().clear();
			getReferencedPin().addAll((Collection<? extends HardwarePin>) newValue);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PORT:
			getContainedPort().clear();
			getContainedPort().addAll((Collection<? extends HardwarePort>) newValue);
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
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT:
			setBase_Port((Port) null);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__IS_SHIELD:
			setIsShield(IS_SHIELD_EDEFAULT);
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PIN:
			getContainedPin().clear();
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__REFERENCED_PIN:
			getReferencedPin().clear();
			return;
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PORT:
			getContainedPort().clear();
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
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT:
			return base_Port != null;
		case HardwaremodelingPackage.HARDWARE_PORT__BASE_CLASS:
			return base_Class != null;
		case HardwaremodelingPackage.HARDWARE_PORT__IS_SHIELD:
			return isShield != IS_SHIELD_EDEFAULT;
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PIN:
			return containedPin != null && !containedPin.isEmpty();
		case HardwaremodelingPackage.HARDWARE_PORT__REFERENCED_PIN:
			return referencedPin != null && !referencedPin.isEmpty();
		case HardwaremodelingPackage.HARDWARE_PORT__CONTAINED_PORT:
			return containedPort != null && !containedPort.isEmpty();
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAPort.class) {
			switch (derivedFeatureID) {
			case HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT:
				return ElementsPackage.EA_PORT__BASE_PORT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAPort.class) {
			switch (baseFeatureID) {
			case ElementsPackage.EA_PORT__BASE_PORT:
				return HardwaremodelingPackage.HARDWARE_PORT__BASE_PORT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isShield: ");
		result.append(isShield);
		result.append(')');
		return result.toString();
	}

} // HardwarePortImpl
