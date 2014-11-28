/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.controlmode.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.IControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.util.ControlHelper;

/**
 * Utility class to manage Control Mode request in a GMF diagram context.
 * 
 * @author Gabriel Pascual
 *
 */
public final class ControlModeUtil {

	/**
	 * Constructor.
	 *
	 */
	private ControlModeUtil() {
	}


	/**
	 * Gets the uncontrolled command.
	 *
	 * @param editPart
	 *            the edit part
	 * @param editingDomain
	 *            the editing domain
	 * @return the uncontrolled command
	 */
	public static ICommand getUncontrolledCommand(IGraphicalEditPart editPart, TransactionalEditingDomain editingDomain) {
		ICommand uncontrolCommand = null;
		if (!(editPart instanceof DiagramEditPart)) {

			// Look for uncontrol mode command
			EObject eObjectToControl = EMFHelper.getEObject(editPart);
			if (eObjectToControl != null && ControlHelper.isRootControlledObject(eObjectToControl)) {
				ControlModeRequest controlRequest = ControlModeRequest.createUIUncontrolModelRequest(editingDomain, eObjectToControl);
				IControlModeManager controlMng = ControlModeManager.getInstance();
				ICommand controlModeCommand = controlMng.getUncontrolCommand(controlRequest);

				if (controlModeCommand.canExecute()) {
					uncontrolCommand = controlModeCommand;
				}
			}
		}
		return uncontrolCommand;
	}
}
