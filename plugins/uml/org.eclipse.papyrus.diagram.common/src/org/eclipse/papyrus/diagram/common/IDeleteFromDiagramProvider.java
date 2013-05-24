/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Arthur Daussy <a href="mailto:arthur.daussy@atos.net"> - initial API and implementation
 ******************************************************************************/
package org.eclipse.papyrus.diagram.common;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.diagram.common.handlers.DeleteFromDiagramCommandHandler;


/**
 * This class should be implemented by provider of delete from diagram command
 *  @see DeleteFromDiagramCommandHandler#DELETE_FROM_DIAGRAM_EXT_POINT

 * @author adaussy
 *
 */
public interface IDeleteFromDiagramProvider {
	
	/**
	 * This shall return a not null command if the provider should override the default behavior
	 * @param editpart
	 * @return
	 */
	public ICommand getCommand(IGraphicalEditPart editpart);
}
