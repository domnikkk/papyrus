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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionAllocation;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
import org.eclipse.uml2.uml.Abstraction;


/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Function Allocation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionAllocationImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionAllocationImpl#getAllocatedElement <em>Allocated Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionAllocationImpl#getBase_Abstraction <em>Base Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionAllocationImpl extends EAElementImpl implements FunctionAllocation {

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TargetInstanceRef target;
	/**
	 * The cached value of the '{@link #getAllocatedElement() <em>Allocated Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAllocatedElement()
	 * @generated
	 * @ordered
	 */
	protected AllocatedElementInstanceRef allocatedElement;

	/**
	 * The cached value of the '{@link #getBase_Abstraction() <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Abstraction()
	 * @generated
	 * @ordered
	 */
	protected Abstraction base_Abstraction;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FunctionAllocationImpl() {
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
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
			return getTarget();
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
			return getAllocatedElement();
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__BASE_ABSTRACTION:
			if (resolve)
				return getBase_Abstraction();
			return basicGetBase_Abstraction();
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
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
			return target != null;
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
			return allocatedElement != null;
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__BASE_ABSTRACTION:
			return base_Abstraction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
			setTarget((TargetInstanceRef) newValue);
			return;
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
			setAllocatedElement((AllocatedElementInstanceRef) newValue);
			return;
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__BASE_ABSTRACTION:
			setBase_Abstraction((Abstraction) newValue);
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
		return FunctionmodelingPackage.Literals.FUNCTION_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
			setTarget((TargetInstanceRef) null);
			return;
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
			setAllocatedElement((AllocatedElementInstanceRef) null);
			return;
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__BASE_ABSTRACTION:
			setBase_Abstraction((Abstraction) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AllocatedElementInstanceRef getAllocatedElement() {
		return allocatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetAllocatedElement(AllocatedElementInstanceRef newAllocatedElement, NotificationChain msgs) {
		AllocatedElementInstanceRef oldAllocatedElement = allocatedElement;
		allocatedElement = newAllocatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, oldAllocatedElement, newAllocatedElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAllocatedElement(AllocatedElementInstanceRef newAllocatedElement) {
		if (newAllocatedElement != allocatedElement) {
			NotificationChain msgs = null;
			if (allocatedElement != null)
				msgs = ((InternalEObject) allocatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, null, msgs);
			if (newAllocatedElement != null)
				msgs = ((InternalEObject) newAllocatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, null, msgs);
			msgs = basicSetAllocatedElement(newAllocatedElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, newAllocatedElement, newAllocatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Abstraction getBase_Abstraction() {
		if (base_Abstraction != null && base_Abstraction.eIsProxy()) {
			InternalEObject oldBase_Abstraction = (InternalEObject) base_Abstraction;
			base_Abstraction = (Abstraction) eResolveProxy(oldBase_Abstraction);
			if (base_Abstraction != oldBase_Abstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionmodelingPackage.FUNCTION_ALLOCATION__BASE_ABSTRACTION, oldBase_Abstraction, base_Abstraction));
			}
		}
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Abstraction basicGetBase_Abstraction() {
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Abstraction(Abstraction newBase_Abstraction) {
		Abstraction oldBase_Abstraction = base_Abstraction;
		base_Abstraction = newBase_Abstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__BASE_ABSTRACTION, oldBase_Abstraction, base_Abstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
			return basicSetTarget(null, msgs);
		case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
			return basicSetAllocatedElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TargetInstanceRef getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetInstanceRef newTarget, NotificationChain msgs) {
		TargetInstanceRef oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTarget(TargetInstanceRef newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, newTarget, newTarget));
	}

} // FunctionAllocationImpl
