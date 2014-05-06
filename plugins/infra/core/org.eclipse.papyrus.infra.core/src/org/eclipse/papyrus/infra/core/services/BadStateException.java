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
 * @author cedric dumoulin
 * 
 */
public class BadStateException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * 
	 */
	public BadStateException(ServiceState expectedState, ServiceState state, ServiceDescriptor descriptor) {
		super("Bad state for service '" + descriptor.getKey() + "'. Expected '" + expectedState + "' found '" + state + "'.");
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param text
	 * @param state
	 * @param serviceDescriptor
	 */
	public BadStateException(String text, ServiceState state, ServiceDescriptor descriptor) {
		super(text + " (Service= '" + descriptor.getKey() + ", state= " + state + ")"); 
	}

}
