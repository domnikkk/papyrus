/*****************************************************************************
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
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.resource;

/**
 * Protocol for receiving notifications of index change events.
 */
public interface IDecoratorModelIndexListener {
	/**
	 * Notifies me that the index has changed, usually due to changes to workspace resources that are decorator models.
	 * 
	 * @param event
	 *            the change event
	 */
	void indexChanged(DecoratorModelIndexEvent event);
}
