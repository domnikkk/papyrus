/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.umlnotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Classifier Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLClassifierShapeImpl#isUseClassifierShape <em>Use Classifier Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLClassifierShapeImpl extends UMLShapeImpl implements UMLClassifierShape {

	/**
	 * The default value of the '{@link #isUseClassifierShape() <em>Use Classifier Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isUseClassifierShape()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CLASSIFIER_SHAPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseClassifierShape() <em>Use Classifier Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isUseClassifierShape()
	 * @generated
	 * @ordered
	 */
	protected boolean useClassifierShape = USE_CLASSIFIER_SHAPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UMLClassifierShapeImpl() {
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
		return PapyrusUMLNotationPackage.Literals.UML_CLASSIFIER_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isUseClassifierShape() {
		return useClassifierShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setUseClassifierShape(boolean newUseClassifierShape) {
		boolean oldUseClassifierShape = useClassifierShape;
		useClassifierShape = newUseClassifierShape;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE, oldUseClassifierShape, useClassifierShape));
		}
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
		case PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE:
			return isUseClassifierShape();
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
		case PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE:
			setUseClassifierShape((Boolean) newValue);
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
		case PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE:
			setUseClassifierShape(USE_CLASSIFIER_SHAPE_EDEFAULT);
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
		case PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE:
			return useClassifierShape != USE_CLASSIFIER_SHAPE_EDEFAULT;
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
		result.append(" (useClassifierShape: ");
		result.append(useClassifierShape);
		result.append(')');
		return result.toString();
	}

} // UMLClassifierShapeImpl
