/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.tree;

/**
 * This enumeration provides all possible actions for Tree (Collapse/Expand)
 *
 */
public enum CollapseAndExpandActionsEnum {
	/**
	 * expand all the tree
	 */
	EXPAND_ALL,

	/**
	 * expand one level from the selected elements
	 */
	EXPAND_ONE_LEVEL,

	/**
	 * expand 2 levels from the selected elements
	 */
	EXPAND_TWO_LEVEL,

	/**
	 * expand all from the selected element
	 */
	EXPAND_ALL_FROM_SELECTION,

	/**
	 * expand tree to find the wanted node
	 */
	EXPAND_TO_NODE,

	/**
	 * collapse all the tree
	 */
	COLLAPSE_ALL,

	/**
	 * collapse all from the selection
	 */
	COLLAPSE_ALL_FROM_SELECTION,

	/**
	 * collapse one level from selected elements
	 */
	COLLAPSE_ONE_LEVEL;



}
