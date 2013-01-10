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
package org.eclipse.papyrus.infra.nattable.model.tableeditorconfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Table Editor Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.nattable.model.tableeditorconfiguration.LocalTableEditorConfiguration#getDefaultTableEditorConfiguration <em>Default Table Editor Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.tableeditorconfiguration.TableEditorConfigurationPackage#getLocalTableEditorConfiguration()
 * @model
 * @generated
 */
public interface LocalTableEditorConfiguration extends TableEditorConfiguration {
	/**
	 * Returns the value of the '<em><b>Default Table Editor Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Table Editor Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Table Editor Configuration</em>' reference.
	 * @see #setDefaultTableEditorConfiguration(TableEditorConfiguration)
	 * @see org.eclipse.papyrus.infra.nattable.model.tableeditorconfiguration.TableEditorConfigurationPackage#getLocalTableEditorConfiguration_DefaultTableEditorConfiguration()
	 * @model
	 * @generated
	 */
	TableEditorConfiguration getDefaultTableEditorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.nattable.model.tableeditorconfiguration.LocalTableEditorConfiguration#getDefaultTableEditorConfiguration <em>Default Table Editor Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Table Editor Configuration</em>' reference.
	 * @see #getDefaultTableEditorConfiguration()
	 * @generated
	 */
	void setDefaultTableEditorConfiguration(TableEditorConfiguration value);

} // LocalTableEditorConfiguration
