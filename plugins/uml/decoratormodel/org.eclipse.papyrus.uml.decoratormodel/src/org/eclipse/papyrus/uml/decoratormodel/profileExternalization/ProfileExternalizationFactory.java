/**
 * Copyright (c) 2014 Christian W. Damus and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 */
package org.eclipse.papyrus.uml.decoratormodel.profileExternalization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage
 * @generated
 */
public interface ProfileExternalizationFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ProfileExternalizationFactory eINSTANCE = org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ProfileExternalizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apply Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Apply Profiles</em>'.
	 * @generated
	 */
	ApplyProfiles createApplyProfiles();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProfileExternalizationPackage getProfileExternalizationPackage();

} // ProfileExternalizationFactory
