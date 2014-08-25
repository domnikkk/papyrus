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
package org.eclipse.papyrus.eastadl.dependability.errormodel.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorBehavior;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FailureOutPort;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePropagationLink;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultInPort;
import org.eclipse.papyrus.eastadl.dependability.errormodel.InternalFaultPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ProcessFaultPrototype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAType;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionType;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Error Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getFaultFailureConnector <em>Fault Failure Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getPart <em>Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getErrorBehaviorDescription <em>Error Behavior Description</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getFailure <em>Failure</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getExternalFault <em>External Fault</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getInternalFault <em>Internal Fault</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getProcessFault <em>Process Fault</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrorModelTypeImpl#getHwTarget <em>Hw Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelTypeImpl extends TraceableSpecificationImpl implements ErrorModelType {

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionType> target;

	/**
	 * The cached value of the '{@link #getHwTarget() <em>Hw Target</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getHwTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentType> hwTarget;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ErrorModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
			return getFaultFailureConnector();
		case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
			return getPart();
		case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
			return getErrorBehaviorDescription();
		case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
			return getFailure();
		case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
			return getExternalFault();
		case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
			return getInternalFault();
		case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
			return getProcessFault();
		case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
			return getTarget();
		case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
			return getHwTarget();
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
		case ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS:
			return base_Class != null;
		case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
			return !getFaultFailureConnector().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
			return !getPart().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
			return !getErrorBehaviorDescription().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
			return !getFailure().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
			return !getExternalFault().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
			return !getInternalFault().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
			return !getProcessFault().isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
			return target != null && !target.isEmpty();
		case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
			return hwTarget != null && !hwTarget.isEmpty();
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
		if (baseClass == EAType.class) {
			switch (derivedFeatureID) {
			case ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS:
				return ElementsPackage.EA_TYPE__BASE_CLASS;
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
		if (baseClass == EAType.class) {
			switch (baseFeatureID) {
			case ElementsPackage.EA_TYPE__BASE_CLASS:
				return ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends FunctionType>) newValue);
			return;
		case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
			getHwTarget().clear();
			getHwTarget().addAll((Collection<? extends HardwareComponentType>) newValue);
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
		return ErrormodelPackage.Literals.ERROR_MODEL_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ErrormodelPackage.ERROR_MODEL_TYPE__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
			getTarget().clear();
			return;
		case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
			getHwTarget().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<ErrorBehavior> getErrorBehaviorDescription() {
		EList<ErrorBehavior> results = new BasicEList<ErrorBehavior>();
		ErrorBehavior adlErrorBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlErrorBehavior = UMLUtil.getStereotypeApplication(element, ErrorBehavior.class);
				if (adlErrorBehavior != null) {
					results.add(adlErrorBehavior);
				}
			}
		}

		return new BasicInternalEList<ErrorBehavior>(ErrorBehavior.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<FaultInPort> getExternalFault() {
		EList<FaultInPort> groupedPorts = new BasicEList<FaultInPort>();
		FaultInPort currentFlowPort;

		if (getBase_Class() != null) {
			// Parse owned Ports
			Iterator<Port> itDep = getBase_Class().getOwnedPorts().iterator();
			while (itDep.hasNext()) {
				Port currentPort = itDep.next();

				// Test if currentPort is stereotyped FaultInPort
				currentFlowPort = UMLUtil.getStereotypeApplication(currentPort, FaultInPort.class);

				if (currentFlowPort != null) {
					groupedPorts.add(currentFlowPort);
				}
			}
		}

		// Convert to InternalEList<?>
		return new BasicInternalEList<FaultInPort>(FaultInPort.class, groupedPorts.size(), groupedPorts.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<FailureOutPort> getFailure() {
		EList<FailureOutPort> groupedPorts = new BasicEList<FailureOutPort>();
		FailureOutPort currentFlowPort;

		if (getBase_Class() != null) {
			// Parse owned Ports
			Iterator<Port> itDep = getBase_Class().getOwnedPorts().iterator();
			while (itDep.hasNext()) {
				Port currentPort = itDep.next();

				// Test if currentPort is stereotyped FailureOutputPort

				currentFlowPort = UMLUtil.getStereotypeApplication(currentPort, FailureOutPort.class);

				if (currentFlowPort != null) {
					groupedPorts.add(currentFlowPort);
				}
			}
		}

		// Convert to InternalEList<?>
		return new BasicInternalEList<FailureOutPort>(FailureOutPort.class, groupedPorts.size(), groupedPorts.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<FaultFailurePropagationLink> getFaultFailureConnector() {
		EList<FaultFailurePropagationLink> connectors = new BasicEList<FaultFailurePropagationLink>();
		FaultFailurePropagationLink currentConnectorPrototype;

		if (getBase_Class() != null) {
			// Parse owned Connectors
			Iterator<Connector> itDep = getBase_Class().getOwnedConnectors().iterator();
			while (itDep.hasNext()) {
				Connector currentConnector = itDep.next();

				// Test if currentConnector is stereotyped FaultFailurePropagationLink

				currentConnectorPrototype = UMLUtil.getStereotypeApplication(currentConnector,
						FaultFailurePropagationLink.class);

				if (currentConnectorPrototype != null) {
					connectors.add(currentConnectorPrototype);
				}
			}
		}

		// Convert to InternalEList<?>
		return new BasicInternalEList<FaultFailurePropagationLink>(FaultFailurePropagationLink.class,
				connectors.size(), connectors.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HardwareComponentType> getHwTarget() {
		if (hwTarget == null) {
			hwTarget = new EObjectResolvingEList<HardwareComponentType>(HardwareComponentType.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET);
		}
		return hwTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<InternalFaultPrototype> getInternalFault() {
		EList<InternalFaultPrototype> parts = new BasicEList<InternalFaultPrototype>();
		InternalFaultPrototype currentFunctionPrototype;

		if (getBase_Class() != null) {
			// Parse owned Properties
			Iterator<Property> itDep = getBase_Class().getAttributes().iterator();
			while (itDep.hasNext()) {
				Property currentProperty = itDep.next();

				// Test if currentProperty is stereotyped InternalFaultPrototype

				currentFunctionPrototype = UMLUtil.getStereotypeApplication(currentProperty,
						InternalFaultPrototype.class);

				if (currentFunctionPrototype != null) {
					parts.add(currentFunctionPrototype);
				}
			}
		}

		// Convert to InternalEList<?>
		return new BasicInternalEList<InternalFaultPrototype>(InternalFaultPrototype.class, parts.size(), parts
				.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<ErrorModelPrototype> getPart() {
		EList<ErrorModelPrototype> parts = new BasicEList<ErrorModelPrototype>();
		ErrorModelPrototype currentFunctionPrototype;

		if (getBase_Class() != null) {
			// Parse owned Properties
			Iterator<Property> itDep = getBase_Class().getAttributes().iterator();
			while (itDep.hasNext()) {
				Property currentProperty = itDep.next();

				// Test if currentProperty is stereotyped ErrorModelPrototype


				currentFunctionPrototype = UMLUtil.getStereotypeApplication(currentProperty,
						ErrorModelPrototype.class);

				if (currentFunctionPrototype != null) {
					parts.add(currentFunctionPrototype);
				}
			}
		}

		// Convert to InternalEList<?>
		return new BasicInternalEList<ErrorModelPrototype>(ErrorModelPrototype.class, parts.size(), parts.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<ProcessFaultPrototype> getProcessFault() {
		EList<ProcessFaultPrototype> parts = new BasicEList<ProcessFaultPrototype>();
		ProcessFaultPrototype currentFunctionPrototype;

		if (getBase_Class() != null) {
			// Parse owned Properties
			Iterator<Property> itDep = getBase_Class().getAttributes().iterator();
			while (itDep.hasNext()) {
				Property currentProperty = itDep.next();

				// Test if currentProperty is stereotyped ADLFunctionPrototype
				currentFunctionPrototype = UMLUtil.getStereotypeApplication(currentProperty,
						ProcessFaultPrototype.class);



				if (currentFunctionPrototype != null) {
					parts.add(currentFunctionPrototype);
				}
			}
		}

		// Convert to InternalEList<?>
		return new BasicInternalEList<ProcessFaultPrototype>(ProcessFaultPrototype.class, parts.size(), parts.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<FunctionType> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<FunctionType>(FunctionType.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__TARGET);
		}
		return target;
	}

} // ErrorModelTypeImpl
