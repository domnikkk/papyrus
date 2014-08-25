/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding;
import org.eclipse.papyrus.eastadl.dependability.errormodel.Anomaly;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl#getVisibleThroughFunctionPort <em>Visible Through Function Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl#getVisibleThroughHardwarePin <em>Visible Through Hardware Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl#getVisibleThroughHardwarePort <em>Visible Through Hardware Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl#getAttribute <em>Attribute</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl#getVisibleThroughAnomaly <em>Visible Through Anomaly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorAttributeBindingImpl extends RelationshipImpl implements BehaviorAttributeBinding {
	/**
	 * The cached value of the '{@link #getVisibleThroughFunctionPort() <em>Visible Through Function Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getVisibleThroughFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> visibleThroughFunctionPort;

	/**
	 * The cached value of the '{@link #getVisibleThroughHardwarePin() <em>Visible Through Hardware Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getVisibleThroughHardwarePin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> visibleThroughHardwarePin;

	/**
	 * The cached value of the '{@link #getVisibleThroughHardwarePort() <em>Visible Through Hardware Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getVisibleThroughHardwarePort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> visibleThroughHardwarePort;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getVisibleThroughAnomaly() <em>Visible Through Anomaly</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getVisibleThroughAnomaly()
	 * @generated
	 * @ordered
	 */
	protected EList<Anomaly> visibleThroughAnomaly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BehaviorAttributeBindingImpl() {
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
		return AttributequantificationconstraintPackage.Literals.BEHAVIOR_ATTRIBUTE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<FunctionPort> getVisibleThroughFunctionPort() {
		if (visibleThroughFunctionPort == null) {
			visibleThroughFunctionPort = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT);
		}
		return visibleThroughFunctionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HardwarePin> getVisibleThroughHardwarePin() {
		if (visibleThroughHardwarePin == null) {
			visibleThroughHardwarePin = new EObjectResolvingEList<HardwarePin>(HardwarePin.class, this, AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN);
		}
		return visibleThroughHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HardwarePort> getVisibleThroughHardwarePort() {
		if (visibleThroughHardwarePort == null) {
			visibleThroughHardwarePort = new EObjectResolvingEList<HardwarePort>(HardwarePort.class, this, AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT);
		}
		return visibleThroughHardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<Attribute>(Attribute.class, this, AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Anomaly> getVisibleThroughAnomaly() {
		if (visibleThroughAnomaly == null) {
			visibleThroughAnomaly = new EObjectResolvingEList<Anomaly>(Anomaly.class, this, AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY);
		}
		return visibleThroughAnomaly;
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
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT:
			return getVisibleThroughFunctionPort();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN:
			return getVisibleThroughHardwarePin();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT:
			return getVisibleThroughHardwarePort();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE:
			return getAttribute();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY:
			return getVisibleThroughAnomaly();
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
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT:
			getVisibleThroughFunctionPort().clear();
			getVisibleThroughFunctionPort().addAll((Collection<? extends FunctionPort>) newValue);
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN:
			getVisibleThroughHardwarePin().clear();
			getVisibleThroughHardwarePin().addAll((Collection<? extends HardwarePin>) newValue);
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT:
			getVisibleThroughHardwarePort().clear();
			getVisibleThroughHardwarePort().addAll((Collection<? extends HardwarePort>) newValue);
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY:
			getVisibleThroughAnomaly().clear();
			getVisibleThroughAnomaly().addAll((Collection<? extends Anomaly>) newValue);
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
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT:
			getVisibleThroughFunctionPort().clear();
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN:
			getVisibleThroughHardwarePin().clear();
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT:
			getVisibleThroughHardwarePort().clear();
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE:
			getAttribute().clear();
			return;
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY:
			getVisibleThroughAnomaly().clear();
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
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT:
			return visibleThroughFunctionPort != null && !visibleThroughFunctionPort.isEmpty();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN:
			return visibleThroughHardwarePin != null && !visibleThroughHardwarePin.isEmpty();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT:
			return visibleThroughHardwarePort != null && !visibleThroughHardwarePort.isEmpty();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY:
			return visibleThroughAnomaly != null && !visibleThroughAnomaly.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorAttributeBindingImpl
