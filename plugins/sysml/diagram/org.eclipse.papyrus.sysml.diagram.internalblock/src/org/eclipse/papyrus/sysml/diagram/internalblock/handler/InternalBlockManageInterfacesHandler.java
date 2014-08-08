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

package org.eclipse.papyrus.sysml.diagram.internalblock.handler;

import org.eclipse.gmf.runtime.common.ui.util.DisplayUtils;
import org.eclipse.papyrus.sysml.diagram.internalblock.ui.InternalBlockInterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.common.actions.handlers.ManagePortInterfacesHandler;
import org.eclipse.papyrus.uml.diagram.common.dialogs.IPortInterfaceManagerDialog;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Usage;

/**
 * <pre>
 * This handler provides the handler to manage the provided and required {@link Interface} 
 * of a {@link Port} without graphically creating {@link InterfaceRealization} and 
 * {@link Usage} relationships.
 * </pre>
 */
public class InternalBlockManageInterfacesHandler extends ManagePortInterfacesHandler {



	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.actions.handlers.ManagePortInterfacesHandler#getInterfaceManagerDialog(org.eclipse.uml2.uml.Port)
	 *
	 * @param port
	 * @return
	 */
	@Override
	public IPortInterfaceManagerDialog getInterfaceManagerDialog(Port port) {
		return new InternalBlockInterfaceManagerDialog(DisplayUtils.getDefaultShell(), port);

	}
}
