/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.contentprovider.service;


/**
 * Basic implementation of the local page service which contains the root element that contains pages.
 */
public abstract class AbstractLocalPageService implements ILocalPageService {

	/** The root element. */
	protected Object rootElement = null;

	/**
	 * Constructor.
	 *
	 */
	public AbstractLocalPageService(Object rootElement) {
		this.rootElement = rootElement;
	}



}
