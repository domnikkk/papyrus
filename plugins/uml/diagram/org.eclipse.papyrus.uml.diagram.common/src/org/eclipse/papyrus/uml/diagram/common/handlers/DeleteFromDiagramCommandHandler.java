/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 411570
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.handlers;

import org.eclipse.gef.commands.Command;


/**
 * Command handler for delete from diagram
 * 
 * @deprecated Since 1.1.0 and the moving of handler to org.eclipse.papyrus.infra.gmfdiag.menu plugin. Use {@link org.eclipse.papyrus.infra.gmfdiag.menu.handlers.DeleteFromDiagramCommandHandler}.
 */
@Deprecated
public class DeleteFromDiagramCommandHandler extends org.eclipse.papyrus.infra.gmfdiag.menu.handlers.DeleteFromDiagramCommandHandler {

	/**
	 * Constructor.
	 *
	 */
	public DeleteFromDiagramCommandHandler() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.menu.handlers.DeleteFromDiagramCommandHandler#getCommand()
	 *
	 * @return
	 */
	@Override
	protected Command getCommand() {
		return super.getCommand();
	}



}
