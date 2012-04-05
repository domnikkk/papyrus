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
package org.eclipse.papyrus.diagram.common.requests;

import org.eclipse.gef.Request;

/**
 * Request to arragne affixed node in the host
 */
public class ArrangeAffixedNodeRequest extends Request {

	/**
	 * Request type
	 */
	public static String ARRANGE_AFFIXED_NODE = "ARRANGE_CHILDREN_PORT";

	/**
	 * Request role
	 */
	public static String ARRANGE_AFFIXED_NODE_ROLE = "ARRANGE_CHILDREN_PORT_ROLE";

	/**
	 * Constructor
	 */
	public ArrangeAffixedNodeRequest() {
		super();
		setType(ARRANGE_AFFIXED_NODE);
	}



}
