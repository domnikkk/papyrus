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
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.infra.extendedtypes.provider;

import org.eclipse.emf.common.notify.Adapter;

/**
 * This is the factory that is used to provide the interfaces needed to support
 * Viewers. The adapters generated by this factory convert EMF adapter
 * notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The
 * adapters also support Eclipse property sheets. Note that most of the adapters
 * are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class CustomExtendedtypesItemProviderAdapterFactory extends
		ExtendedtypesItemProviderAdapterFactory {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Adapter createExtendedElementTypeSetAdapter() {
		if (extendedElementTypeSetItemProvider == null) {
			extendedElementTypeSetItemProvider = new CustomExtendedElementTypeSetItemProvider(this);
		}

		return extendedElementTypeSetItemProvider;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Adapter createAspectSemanticTypeConfigurationAdapter() {
		if(aspectSemanticTypeConfigurationItemProvider == null) {
			aspectSemanticTypeConfigurationItemProvider = new CustomAspectSemanticTypeConfigurationItemProvider(this);
		}
		return aspectSemanticTypeConfigurationItemProvider;
	}
	
}
