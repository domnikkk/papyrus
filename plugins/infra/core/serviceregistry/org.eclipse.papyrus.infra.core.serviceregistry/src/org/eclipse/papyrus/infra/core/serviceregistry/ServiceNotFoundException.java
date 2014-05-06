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
package org.eclipse.papyrus.infra.core.serviceregistry;

/**
 * Service is not found.
 * 
 * @author dumoulin
 * 
 */
public class ServiceNotFoundException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 */
	public ServiceNotFoundException() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param message
	 * @param cause
	 */
	public ServiceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor.
	 * 
	 * @param message
	 */
	public ServiceNotFoundException(String message) {
		super(message);
	}

	/**
	 * Constructor.
	 * 
	 * @param cause
	 */
	public ServiceNotFoundException(Throwable cause) {
		super(cause);
	}

}
