/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Arthur Daussy (Atos) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.util;

import org.eclipse.gmf.runtime.notation.View;

import com.google.common.collect.Multimap;


/**
 * Element which is able to sort element among the fourth side of a figure. Or in a error section if the view is not an good affixed node
 */
public interface AffixedNodeDispatcher {

	/**
	 * North side of a figure
	 */
	public static final int NORTH = 0;

	/**
	 * South side of a figure
	 */
	public static final int SOUTH = 1;

	/**
	 * West side of a figure
	 */
	public static final int WEST = 2;

	/**
	 * East side of a figure
	 */
	public static final int EAST = 3;

	/**
	 * Error section for views which can not be handled
	 */
	public static final int ERROR = 4;

	/**
	 * Sort an {@link Iterable} of views into five sections
	 * 
	 * @param views
	 *        Input
	 * @return {@link Multimap} which sorted views into 5 sections 
	 * {@link AffixedNodeDispatcher#NORTH}
	 * {@link AffixedNodeDispatcher#SOUTH}
	 * {@link AffixedNodeDispatcher#EAST}
	 * {@link AffixedNodeDispatcher#WEST}
	 * {@link AffixedNodeDispatcher#ERROR}
	 */
	public abstract Multimap<Integer, View> dispatch(Iterable<View> views);

}
