/*****************************************************************************
 * Copyright (c) 2011, 2014 LIFL and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  LIFL - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.services;

/**
 * The different states that a service can have.
 *
 * @author dumoulin
 *
 */
public enum ServiceState {
	registered, created, initialized, starting, started, disposed, error
}
