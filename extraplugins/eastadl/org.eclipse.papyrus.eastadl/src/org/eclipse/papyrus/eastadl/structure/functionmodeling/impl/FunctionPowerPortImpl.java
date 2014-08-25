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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPowerPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Function Power Port</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionPowerPortImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionPowerPortImpl extends FunctionPortImpl implements FunctionPowerPort {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FunctionPowerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public CompositeDatatype basicGetType() {
		CompositeDatatype dataType = null;

		if (getBase_Port() != null) {
			Type umlType = getBase_Port().getType();

			if (umlType != null) {
				dataType = UMLUtil.getStereotypeApplication(umlType, CompositeDatatype.class);
			}
		}

		return dataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FunctionmodelingPackage.FUNCTION_POWER_PORT__TYPE:
			if (resolve) {
				return getType();
			}
			return basicGetType();
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
		case FunctionmodelingPackage.FUNCTION_POWER_PORT__TYPE:
			return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.FUNCTION_POWER_PORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CompositeDatatype getType() {
		CompositeDatatype type = basicGetType();
		return type != null && type.eIsProxy() ? (CompositeDatatype) eResolveProxy((InternalEObject) type) : type;
	}

} // FunctionPowerPortImpl
