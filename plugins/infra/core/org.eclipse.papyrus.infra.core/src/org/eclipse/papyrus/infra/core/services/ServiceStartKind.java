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
 * Kind of possible start method for a service. LAZY - The service start when it
 * is requested for the first time. STARTUP - The service start as soon as the
 * registry is started, or when the service is added is the registry is already
 * started.
 * 
 * @author dumoulin
 * 
 */
public enum ServiceStartKind {

	LAZY, STARTUP;
}
