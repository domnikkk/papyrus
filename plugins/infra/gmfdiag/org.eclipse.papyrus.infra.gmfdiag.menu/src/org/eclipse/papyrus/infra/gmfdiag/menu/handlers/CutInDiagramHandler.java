/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.menu.handlers;

import org.eclipse.gef.commands.Command;

/**
 * Handler for the Copy Action in Diagram
 */
public class CutInDiagramHandler extends AbstractGraphicalCommandHandler {


	@Override
	protected boolean computeEnabled() {
		return false;
	}

	@Override
	protected Command getCommand() {
		// TODO Auto-generated method stub
		return null;
	}

}
