/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NattablestyleFactoryImpl extends EFactoryImpl implements NattablestyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static NattablestyleFactory init() {
		try {
			NattablestyleFactory theNattablestyleFactory = (NattablestyleFactory) EPackage.Registry.INSTANCE.getEFactory(NattablestylePackage.eNS_URI);
			if (theNattablestyleFactory != null) {
				return theNattablestyleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NattablestyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NattablestyleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NattablestylePackage.NAMED_STYLE:
			return createNamedStyle();
		case NattablestylePackage.FONT_STYLE:
			return createFontStyle();
		case NattablestylePackage.CELL_TEXT_STYLE:
			return createCellTextStyle();
		case NattablestylePackage.INT_VALUE_STYLE:
			return createIntValueStyle();
		case NattablestylePackage.INT_LIST_VALUE_STYLE:
			return createIntListValueStyle();
		case NattablestylePackage.BOOLEAN_VALUE_STYLE:
			return createBooleanValueStyle();
		case NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE:
			return createBooleanListValueStyle();
		case NattablestylePackage.DOUBLE_VALUE_STYLE:
			return createDoubleValueStyle();
		case NattablestylePackage.DOUBLE_LIST_VALUE_STYLE:
			return createDoubleListValueStyle();
		case NattablestylePackage.STRING_VALUE_STYLE:
			return createStringValueStyle();
		case NattablestylePackage.STRING_LIST_VALUE_STYLE:
			return createStringListValueStyle();
		case NattablestylePackage.TABLE_DISPLAY_STYLE:
			return createTableDisplayStyle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case NattablestylePackage.CELL_TEXT_ALIGNMENT:
			return createCellTextAlignmentFromString(eDataType, initialValue);
		case NattablestylePackage.DISPLAY_STYLE:
			return createDisplayStyleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case NattablestylePackage.CELL_TEXT_ALIGNMENT:
			return convertCellTextAlignmentToString(eDataType, instanceValue);
		case NattablestylePackage.DISPLAY_STYLE:
			return convertDisplayStyleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NamedStyle createNamedStyle() {
		NamedStyleImpl namedStyle = new NamedStyleImpl();
		return namedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FontStyle createFontStyle() {
		FontStyleImpl fontStyle = new FontStyleImpl();
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CellTextStyle createCellTextStyle() {
		CellTextStyleImpl cellTextStyle = new CellTextStyleImpl();
		return cellTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IntValueStyle createIntValueStyle() {
		IntValueStyleImpl intValueStyle = new IntValueStyleImpl();
		return intValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IntListValueStyle createIntListValueStyle() {
		IntListValueStyleImpl intListValueStyle = new IntListValueStyleImpl();
		return intListValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BooleanValueStyle createBooleanValueStyle() {
		BooleanValueStyleImpl booleanValueStyle = new BooleanValueStyleImpl();
		return booleanValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BooleanListValueStyle createBooleanListValueStyle() {
		BooleanListValueStyleImpl booleanListValueStyle = new BooleanListValueStyleImpl();
		return booleanListValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DoubleValueStyle createDoubleValueStyle() {
		DoubleValueStyleImpl doubleValueStyle = new DoubleValueStyleImpl();
		return doubleValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DoubleListValueStyle createDoubleListValueStyle() {
		DoubleListValueStyleImpl doubleListValueStyle = new DoubleListValueStyleImpl();
		return doubleListValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StringValueStyle createStringValueStyle() {
		StringValueStyleImpl stringValueStyle = new StringValueStyleImpl();
		return stringValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StringListValueStyle createStringListValueStyle() {
		StringListValueStyleImpl stringListValueStyle = new StringListValueStyleImpl();
		return stringListValueStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableDisplayStyle createTableDisplayStyle() {
		TableDisplayStyleImpl tableDisplayStyle = new TableDisplayStyleImpl();
		return tableDisplayStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CellTextAlignment createCellTextAlignmentFromString(EDataType eDataType, String initialValue) {
		CellTextAlignment result = CellTextAlignment.get(initialValue);
		if (result == null)
		{
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertCellTextAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DisplayStyle createDisplayStyleFromString(EDataType eDataType, String initialValue) {
		DisplayStyle result = DisplayStyle.get(initialValue);
		if (result == null)
		{
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertDisplayStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NattablestylePackage getNattablestylePackage() {
		return (NattablestylePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NattablestylePackage getPackage() {
		return NattablestylePackage.eINSTANCE;
	}

} // NattablestyleFactoryImpl
