/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.concurrent;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * A ResourceSet with thread-safe Load operations
 * 
 * Resources should be saved using {@link ResourceAccessHelper#saveResource(Resource, java.util.Map)}
 * 
 * @author Camille Letavernier
 *
 * @see {@link ResourceAccessHelper}
 */
public class ThreadSafeResourceSet extends ResourceSetImpl {
	@Override
	protected void demandLoad(Resource resource) throws IOException {
		ResourceAccessHelper.INSTANCE.loadResource(resource, getLoadOptions());
	}
}
