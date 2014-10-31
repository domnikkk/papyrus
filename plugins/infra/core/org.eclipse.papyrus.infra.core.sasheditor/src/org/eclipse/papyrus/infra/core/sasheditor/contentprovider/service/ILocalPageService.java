/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.contentprovider.service;


/**
 * Service for PageManager to determine local page.
 * 
 * @author Gabriel Pascual
 *
 */
public interface ILocalPageService {


	/**
	 * Checks if is local page.
	 *
	 * @param content
	 *            the content
	 * @return true, if is local page
	 */
	boolean isLocalPage(Object content);

}
