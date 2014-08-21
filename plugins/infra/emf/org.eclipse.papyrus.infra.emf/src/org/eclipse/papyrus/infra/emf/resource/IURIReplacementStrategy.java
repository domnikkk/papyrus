/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.resource;

import org.eclipse.emf.common.util.URI;


/**
 * Interface for different strategies to change URI of a Resource
 *
 */
public interface IURIReplacementStrategy {

	URI getReplacementCandidate(URI resourceURI);

}
