/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.LogicalEventImpl#isIsExternVisible <em>Is Extern Visible</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.LogicalEventImpl#getVisibleThroughFunctionPort <em>Visible Through Function Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalEventImpl extends QuantificationImpl implements LogicalEvent {
	/**
	 * The default value of the '{@link #isIsExternVisible() <em>Is Extern Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsExternVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERN_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternVisible() <em>Is Extern Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsExternVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternVisible = IS_EXTERN_VISIBLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected LogicalEventImpl() {
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
		return AttributequantificationconstraintPackage.Literals.LOGICAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isIsExternVisible() {
		return isExternVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIsExternVisible(boolean newIsExternVisible) {
		boolean oldIsExternVisible = isExternVisible;
		isExternVisible = newIsExternVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributequantificationconstraintPackage.LOGICAL_EVENT__IS_EXTERN_VISIBLE, oldIsExternVisible, isExternVisible));
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
			visibleThroughFunctionPort = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, AttributequantificationconstraintPackage.LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__IS_EXTERN_VISIBLE:
			return isIsExternVisible();
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT:
			return getVisibleThroughFunctionPort();
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
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__IS_EXTERN_VISIBLE:
			setIsExternVisible((Boolean) newValue);
			return;
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT:
			getVisibleThroughFunctionPort().clear();
			getVisibleThroughFunctionPort().addAll((Collection<? extends FunctionPort>) newValue);
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
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__IS_EXTERN_VISIBLE:
			setIsExternVisible(IS_EXTERN_VISIBLE_EDEFAULT);
			return;
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT:
			getVisibleThroughFunctionPort().clear();
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
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__IS_EXTERN_VISIBLE:
			return isExternVisible != IS_EXTERN_VISIBLE_EDEFAULT;
		case AttributequantificationconstraintPackage.LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT:
			return visibleThroughFunctionPort != null && !visibleThroughFunctionPort.isEmpty();
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
		result.append(" (isExternVisible: "); //$NON-NLS-1$
		result.append(isExternVisible);
		result.append(')');
		return result.toString();
	}

} // LogicalEventImpl
