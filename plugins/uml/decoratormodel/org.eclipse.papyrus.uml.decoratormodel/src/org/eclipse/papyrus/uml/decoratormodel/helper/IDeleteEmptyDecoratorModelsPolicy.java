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

package org.eclipse.papyrus.uml.decoratormodel.helper;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * A protocol by which the profile-application reintegration command can query the client whether to delete decorator models that have been emptied of
 * the last of their profile applications.
 */
public interface IDeleteEmptyDecoratorModelsPolicy {
	/**
	 * Queries whether the specified decorator model resources may be deleted now that they contain no more profile applications.
	 * 
	 * @param decoratorModels
	 *            decorator models to delete
	 * @return whether they should be deleted
	 */
	boolean shouldDeleteDecoratorModels(Collection<? extends Resource> decoratorModels);
}
