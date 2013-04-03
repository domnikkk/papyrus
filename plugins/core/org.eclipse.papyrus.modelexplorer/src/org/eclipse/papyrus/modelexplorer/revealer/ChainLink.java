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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.modelexplorer.matching.IMatchingItem;


/**
 * Basic Implemenation of {@link IChainLink}
 * @author adaussy
 *
 */
public class ChainLink implements IChainLink{
	
	/**
	 * {@link IChainLink#getNextObject()}
	 */
	private EObject nexObject;

	/**
	 * {@link IChainLink#getMatchingObjects()}
	 */
	private List<IMatchingItem> matchingElements = new ArrayList<IMatchingItem>();

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.modelexplorer.revealer.IChainLink#getNextObject()
	 */
	public EObject getNextObject() {
		return nexObject;
	}

	/**
	 * {@link IChainLink#getNextObject()}
	 * @param nexObject
	 */
	public void setNexObject(EObject nexObject) {
		this.nexObject = nexObject;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.modelexplorer.revealer.IChainLink#getMatchingObjects()
	 */
	public List<IMatchingItem> getMatchingObjects() {
		return matchingElements;
	}
}
