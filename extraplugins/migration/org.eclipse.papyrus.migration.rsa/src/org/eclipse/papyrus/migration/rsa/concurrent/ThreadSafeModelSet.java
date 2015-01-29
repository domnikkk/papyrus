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
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;

/**
 * A ModelSet with thread-safe load operations
 * 
 * Note: since Save operations are delegated to IModels, save operations are <strong>thread-safe</strong>.
 * Resources of this ResourceSet should be saved by delegating to {@link ResourceAccessHelper#saveResource(Resource, Map<?, ?>)}
 * 
 * @see {@link ResourceAccessHelper}
 */
public class ThreadSafeModelSet extends DiResourceSet {
	@Override
	protected void demandLoad(Resource resource) throws IOException {
		Resource resourceWithOptions = setResourceOptions(resource);
		ResourceAccessHelper.INSTANCE.loadResource(resourceWithOptions, getLoadOptions());
	}
}
