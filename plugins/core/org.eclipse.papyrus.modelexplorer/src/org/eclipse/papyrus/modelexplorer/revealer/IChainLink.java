/*****************************************************************************
 * Copyright (c) 2012 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer.revealer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.modelexplorer.matching.IMatchingItem;


/**
 * Interface used to describe a Chain Link in the chain used to reveal an element is the model explorer
 * @author adaussy
 *
 */
public interface IChainLink {
	
	/**
	 * @return The next {@link EObject} to use as a input for computation of the next {@link IChainLink}
	 */
	public EObject getNextObject();
	
	/**
	 * @return List all the {@link IMatchingItem} which has to be reveal between the Input Object and the Next Object (Order : Input to ancestor)
	 */
	public List<IMatchingItem> getMatchingObjects();
}
