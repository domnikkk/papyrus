/*****************************************************************************
 * Copyright (c) 2013 Atos
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

import org.eclipse.emf.ecore.EObject;


/**
 * Interface used to participate at the creation of a chain to reveal a element in the model explorer view.
 * @author adaussy
 *
 */
public interface IModelExplorerRevealerParticipant {
	

	/**
	 * This method is used to create a {@link ChainLink} using the target {@link EObject} as input
	 * @param targetObject Input to create the {@link ChainLink}
	 * @return A {@link IChainLink} if it can handle the {@link EObject} or null if the participant can not handle it
	 */
	public IChainLink getRevealerChain(EObject targetObject);
	
	
}
