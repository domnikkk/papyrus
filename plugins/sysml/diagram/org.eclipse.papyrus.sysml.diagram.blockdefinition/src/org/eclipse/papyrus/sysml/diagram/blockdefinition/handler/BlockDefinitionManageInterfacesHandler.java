/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.sysml.diagram.blockdefinition.handler;

import org.eclipse.gmf.runtime.common.ui.util.DisplayUtils;
import org.eclipse.papyrus.sysml.diagram.blockdefinition.ui.BlockDefinitionInterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.common.actions.handlers.ManagePortInterfacesHandler;
import org.eclipse.papyrus.uml.diagram.common.dialogs.InterfaceManagerDialog;
import org.eclipse.uml2.uml.Port;

/**
 * Manage Interface handler for Block Definition diagram.
 *
 * @author Gabriel Pascual
 */
public class BlockDefinitionManageInterfacesHandler extends ManagePortInterfacesHandler {

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.actions.handlers.ManagePortInterfacesHandler#getInterfaceManagerDialog(org.eclipse.uml2.uml.Port)
	 *
	 * @param port
	 * @return
	 */
	@Override
	public InterfaceManagerDialog getInterfaceManagerDialog(Port port) {
		return new BlockDefinitionInterfaceManagerDialog(DisplayUtils.getDefaultShell(), port);
	}
}
