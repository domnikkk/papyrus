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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage
 * @generated
 */
public interface NattablestyleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	NattablestyleFactory eINSTANCE = org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestyleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Named Style</em>'.
	 * @generated
	 */
	NamedStyle createNamedStyle();

	/**
	 * Returns a new object of class '<em>Font Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Font Style</em>'.
	 * @generated
	 */
	FontStyle createFontStyle();

	/**
	 * Returns a new object of class '<em>Cell Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Cell Text Style</em>'.
	 * @generated
	 */
	CellTextStyle createCellTextStyle();

	/**
	 * Returns a new object of class '<em>Int Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Int Value Style</em>'.
	 * @generated
	 */
	IntValueStyle createIntValueStyle();

	/**
	 * Returns a new object of class '<em>Int List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Int List Value Style</em>'.
	 * @generated
	 */
	IntListValueStyle createIntListValueStyle();

	/**
	 * Returns a new object of class '<em>Boolean Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Boolean Value Style</em>'.
	 * @generated
	 */
	BooleanValueStyle createBooleanValueStyle();

	/**
	 * Returns a new object of class '<em>Boolean List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Boolean List Value Style</em>'.
	 * @generated
	 */
	BooleanListValueStyle createBooleanListValueStyle();

	/**
	 * Returns a new object of class '<em>Double Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Double Value Style</em>'.
	 * @generated
	 */
	DoubleValueStyle createDoubleValueStyle();

	/**
	 * Returns a new object of class '<em>Double List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Double List Value Style</em>'.
	 * @generated
	 */
	DoubleListValueStyle createDoubleListValueStyle();

	/**
	 * Returns a new object of class '<em>String Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>String Value Style</em>'.
	 * @generated
	 */
	StringValueStyle createStringValueStyle();

	/**
	 * Returns a new object of class '<em>String List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>String List Value Style</em>'.
	 * @generated
	 */
	StringListValueStyle createStringListValueStyle();

	/**
	 * Returns a new object of class '<em>Table Display Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Table Display Style</em>'.
	 * @generated
	 */
	TableDisplayStyle createTableDisplayStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	NattablestylePackage getNattablestylePackage();

} // NattablestyleFactory
