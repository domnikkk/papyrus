/*
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.rules;

import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;


/**
 * A model-set fixture that uses a fully configured service registry to provide the model set.
 */
public class ServiceRegistryModelSetFixture extends ModelSetFixture {

	public ServiceRegistryModelSetFixture() {
		super();
	}

	@Override
	protected ServicesRegistry createServiceRegistry() throws Exception {
		ServicesRegistry result = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);

		try {
			result.startRegistry();
		} catch (ServiceException e) {
			// Try to continue with the test, anyways. This is expected in the test environment
		}

		return result;
	}
}
