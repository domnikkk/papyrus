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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.FeatureLabelProviderConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract class used to reference features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis#getLocalLabelConfiguration <em>Local Label Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage#getFeatureAxis()
 * @model abstract="true"
 * @generated
 */
public interface FeatureAxis extends IAxis {

	/**
	 * Returns the value of the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the local label configuration to use for this IAxis. This configuration
	 * will override the label configuration defined in the AxisManagerConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Label Configuration</em>' containment reference.
	 * @see #setLocalLabelConfiguration(FeatureLabelProviderConfiguration)
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage#getFeatureAxis_LocalLabelConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	FeatureLabelProviderConfiguration getLocalLabelConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis#getLocalLabelConfiguration <em>Local Label Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Label Configuration</em>' containment reference.
	 * @see #getLocalLabelConfiguration()
	 * @generated
	 */
	void setLocalLabelConfiguration(FeatureLabelProviderConfiguration value);

} // FeatureAxis
