/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *	Gabriel Pascual (ALL4TEc) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.custom.actions;

import org.eclipse.gmf.runtime.common.ui.util.DisplayUtils;
import org.eclipse.papyrus.uml.diagram.common.actions.handlers.ManagePortInterfacesHandler;
import org.eclipse.papyrus.uml.diagram.common.dialogs.IPortInterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.component.custom.ui.ComponentInterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;

/**
 * This handler provides the action to manage the provided and required {@link Interface} for a {@link Port}.
 */
public class ComponentManageInterfacesHandler extends ManagePortInterfacesHandler {

	public ComponentManageInterfacesHandler() {
		super();
	}


	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.actions.handlers.ManagePortInterfacesHandler#getInterfaceManagerDialog(org.eclipse.uml2.uml.Port)
	 *
	 * @param port
	 * @return
	 */
	@Override
	public IPortInterfaceManagerDialog getInterfaceManagerDialog(Port port) {
		return new ComponentInterfaceManagerDialog(DisplayUtils.getDefaultShell(), (PortEditPart) getPortEditPart());
	}
}
