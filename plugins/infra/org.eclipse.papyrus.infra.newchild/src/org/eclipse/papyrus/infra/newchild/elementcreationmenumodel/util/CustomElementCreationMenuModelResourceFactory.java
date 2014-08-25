/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	CEA LIST - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Custom resource factory to create custom resources with usage of uuids instead of index
 */
public class CustomElementCreationMenuModelResourceFactory extends ElementCreationMenuModelResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CustomElementCreationMenuModelResourceFactory() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new CustomElementCreationMenuModelResource(uri);
		return result;
	}

}
