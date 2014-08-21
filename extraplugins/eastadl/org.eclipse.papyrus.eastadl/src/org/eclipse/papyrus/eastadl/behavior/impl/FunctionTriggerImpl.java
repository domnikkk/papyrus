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
package org.eclipse.papyrus.eastadl.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.behavior.BehaviorPackage;
import org.eclipse.papyrus.eastadl.behavior.FunctionTrigger;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.behavior.TriggerPolicyKind;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionType;
import org.eclipse.uml2.uml.ValueSpecification;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getTriggerPolicy <em>Trigger Policy</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getMode <em>Mode</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getFunction <em>Function</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getPort <em>Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.behavior.impl.FunctionTriggerImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionTriggerImpl extends EAElementImpl implements FunctionTrigger {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EADatatype type;

	/**
	 * The cached value of the '{@link #getBase_ValueSpecification() <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_ValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification base_ValueSpecification;

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
	 * The default value of the '{@link #getTriggerPolicy() <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTriggerPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerPolicyKind TRIGGER_POLICY_EDEFAULT = TriggerPolicyKind.EVENT;

	/**
	 * The cached value of the '{@link #getTriggerPolicy() <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTriggerPolicy()
	 * @generated
	 * @ordered
	 */
	protected TriggerPolicyKind triggerPolicy = TRIGGER_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionType function;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> port;

	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FunctionTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionType basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype() {
		return functionPrototype;
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
		case BehaviorPackage.FUNCTION_TRIGGER__TYPE:
			if (resolve) {
				return getType();
			}
			return basicGetType();
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION:
			if (resolve) {
				return getBase_ValueSpecification();
			}
			return basicGetBase_ValueSpecification();
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
			return getTriggerPolicy();
		case BehaviorPackage.FUNCTION_TRIGGER__MODE:
			return getMode();
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
			if (resolve) {
				return getFunction();
			}
			return basicGetFunction();
		case BehaviorPackage.FUNCTION_TRIGGER__PORT:
			return getPort();
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
			if (resolve) {
				return getFunctionPrototype();
			}
			return basicGetFunctionPrototype();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BehaviorPackage.FUNCTION_TRIGGER__TYPE:
			return type != null;
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION:
			return base_ValueSpecification != null;
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_CLASS:
			return base_Class != null;
		case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
			return triggerPolicy != TRIGGER_POLICY_EDEFAULT;
		case BehaviorPackage.FUNCTION_TRIGGER__MODE:
			return mode != null && !mode.isEmpty();
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
			return function != null;
		case BehaviorPackage.FUNCTION_TRIGGER__PORT:
			return port != null && !port.isEmpty();
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
			return functionPrototype != null;
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
		if (baseClass == EAValue.class) {
			switch (derivedFeatureID) {
			case BehaviorPackage.FUNCTION_TRIGGER__TYPE:
				return ValuesPackage.EA_VALUE__TYPE;
			case BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION:
				return ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION;
			default:
				return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == EAValue.class) {
			switch (baseFeatureID) {
			case ValuesPackage.EA_VALUE__TYPE:
				return BehaviorPackage.FUNCTION_TRIGGER__TYPE;
			case ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION:
				return BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION;
			default:
				return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (baseFeatureID) {
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorPackage.FUNCTION_TRIGGER__TYPE:
			setType((EADatatype) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION:
			setBase_ValueSpecification((ValueSpecification) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
			setTriggerPolicy((TriggerPolicyKind) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__MODE:
			getMode().clear();
			getMode().addAll((Collection<? extends Mode>) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
			setFunction((FunctionType) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends FunctionPort>) newValue);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
			setFunctionPrototype((FunctionPrototype) newValue);
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
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.FUNCTION_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EADatatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EADatatype) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__TYPE, oldType, type));
				}
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EADatatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(EADatatype newType) {
		EADatatype oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__TYPE, oldType, type));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ValueSpecification getBase_ValueSpecification() {
		if (base_ValueSpecification != null && base_ValueSpecification.eIsProxy()) {
			InternalEObject oldBase_ValueSpecification = (InternalEObject) base_ValueSpecification;
			base_ValueSpecification = (ValueSpecification) eResolveProxy(oldBase_ValueSpecification);
			if (base_ValueSpecification != oldBase_ValueSpecification) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
				}
			}
		}
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSpecification basicGetBase_ValueSpecification() {
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBase_ValueSpecification(ValueSpecification newBase_ValueSpecification) {
		ValueSpecification oldBase_ValueSpecification = base_ValueSpecification;
		base_ValueSpecification = newBase_ValueSpecification;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
		}
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
		case BehaviorPackage.FUNCTION_TRIGGER__TYPE:
			setType((EADatatype) null);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_VALUE_SPECIFICATION:
			setBase_ValueSpecification((ValueSpecification) null);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
			setTriggerPolicy(TRIGGER_POLICY_EDEFAULT);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__MODE:
			getMode().clear();
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
			setFunction((FunctionType) null);
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__PORT:
			getPort().clear();
			return;
		case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
			setFunctionPrototype((FunctionPrototype) null);
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
	public FunctionType getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (FunctionType) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION, oldFunction, function));
				}
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject) functionPrototype;
			functionPrototype = (FunctionPrototype) eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
				}
			}
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviorPackage.FUNCTION_TRIGGER__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<FunctionPort> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, BehaviorPackage.FUNCTION_TRIGGER__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TriggerPolicyKind getTriggerPolicy() {
		return triggerPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFunction(FunctionType newFunction) {
		FunctionType oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION, oldFunction, function));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTriggerPolicy(TriggerPolicyKind newTriggerPolicy) {
		TriggerPolicyKind oldTriggerPolicy = triggerPolicy;
		triggerPolicy = newTriggerPolicy == null ? TRIGGER_POLICY_EDEFAULT : newTriggerPolicy;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY, oldTriggerPolicy, triggerPolicy));
		}
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
		result.append(" (triggerPolicy: ");
		result.append(triggerPolicy);
		result.append(')');
		return result.toString();
	}

} // FunctionTriggerImpl
