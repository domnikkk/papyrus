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
package org.eclipse.papyrus.dd.di;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.papyrus.dd.di.DIPackage
 * @generated
 */
public interface DIFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	DIFactory eINSTANCE = org.eclipse.papyrus.dd.di.impl.DIFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DIPackage getDIPackage();

} // DIFactory
