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
package org.eclipse.papyrus.eastadl.structure.functionmodeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.EADirectionKind;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Function Flow Port</b></em> '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionFlowPortImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionFlowPortImpl#getDefaultValue <em>Default Value</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionFlowPortImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionFlowPortImpl extends FunctionPortImpl implements FunctionFlowPort {

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected EAValue defaultValue;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EADirectionKind DIRECTION_EDEFAULT = EADirectionKind.IN;
	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EADirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FunctionFlowPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public EADatatype basicGetType() {
		EADatatype dataType = null;

		if (getBase_Port() != null) {
			Type umlType = getBase_Port().getType();


			if (umlType != null) {
				dataType = UMLUtil.getStereotypeApplication(umlType, EADatatype.class);
			}
		}

		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAValue getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject) defaultValue;
			defaultValue = (EAValue) eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionmodelingPackage.FUNCTION_FLOW_PORT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAValue basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDefaultValue(EAValue newDefaultValue) {
		EAValue oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_FLOW_PORT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EADirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDirection(EADirectionKind newDirection) {
		EADirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_FLOW_PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DEFAULT_VALUE:
			if (resolve)
				return getDefaultValue();
			return basicGetDefaultValue();
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DIRECTION:
			return getDirection();
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
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__TYPE:
			return basicGetType() != null;
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DEFAULT_VALUE:
			return defaultValue != null;
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
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
		result.append(" (direction: "); //$NON-NLS-1$
		result.append(direction);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DEFAULT_VALUE:
			setDefaultValue((EAValue) newValue);
			return;
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DIRECTION:
			setDirection((EADirectionKind) newValue);
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
		return FunctionmodelingPackage.Literals.FUNCTION_FLOW_PORT;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DEFAULT_VALUE:
			setDefaultValue((EAValue) null);
			return;
		case FunctionmodelingPackage.FUNCTION_FLOW_PORT__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return getBase_Port().getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EADatatype getType() {
		EADatatype type = basicGetType();
		return type != null && type.eIsProxy() ? (EADatatype) eResolveProxy((InternalEObject) type) : type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public boolean isIsAtomic() {
		// Always true in EAST-ADL2
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
	}

} // FunctionFlowPortImpl
