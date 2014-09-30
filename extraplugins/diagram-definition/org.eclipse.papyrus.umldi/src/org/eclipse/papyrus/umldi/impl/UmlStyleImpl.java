/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.di.impl.StyleImpl;

import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlStyle;

import org.eclipse.papyrus.umldi.util.UMLDIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlStyleImpl#getFontName <em>Font Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlStyleImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlStyleImpl extends StyleImpl implements UmlStyle {

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final double FONT_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected double fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UmlStyleImpl() {
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
		return UMLDIPackage.Literals.UML_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if(eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_STYLE__FONT_NAME, oldFontName, fontName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFontSize(double newFontSize) {
		double oldFontSize = fontSize;
		fontSize = newFontSize;
		if(eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_STYLE__FONT_SIZE, oldFontSize, fontSize));
		}
	}

	/**
	 * The cached validation expression for the '{@link #fontsizePositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Fontsize Positive</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #fontsizePositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FONTSIZE_POSITIVE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "fontSize > 0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean fontsizePositive(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UMLDIValidator.validate(UMLDIPackage.Literals.UML_STYLE, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", UMLDIPackage.Literals.UML_STYLE___FONTSIZE_POSITIVE__DIAGNOSTICCHAIN_MAP, FONTSIZE_POSITIVE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, UMLDIValidator.DIAGNOSTIC_SOURCE, UMLDIValidator.UML_STYLE__FONTSIZE_POSITIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case UMLDIPackage.UML_STYLE__FONT_NAME:
			return getFontName();
		case UMLDIPackage.UML_STYLE__FONT_SIZE:
			return getFontSize();
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
		switch(featureID) {
		case UMLDIPackage.UML_STYLE__FONT_NAME:
			setFontName((String)newValue);
			return;
		case UMLDIPackage.UML_STYLE__FONT_SIZE:
			setFontSize((Double)newValue);
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
		switch(featureID) {
		case UMLDIPackage.UML_STYLE__FONT_NAME:
			setFontName(FONT_NAME_EDEFAULT);
			return;
		case UMLDIPackage.UML_STYLE__FONT_SIZE:
			setFontSize(FONT_SIZE_EDEFAULT);
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
		switch(featureID) {
		case UMLDIPackage.UML_STYLE__FONT_NAME:
			return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
		case UMLDIPackage.UML_STYLE__FONT_SIZE:
			return fontSize != FONT_SIZE_EDEFAULT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch(operationID) {
		case UMLDIPackage.UML_STYLE___FONTSIZE_POSITIVE__DIAGNOSTICCHAIN_MAP:
			return fontsizePositive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fontName: ");
		result.append(fontName);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(')');
		return result.toString();
	}
} //UmlStyleImpl
