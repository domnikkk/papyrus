/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.services.controlmode.helper.advice;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.IControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.util.ControlHelper;
import org.eclipse.papyrus.infra.services.edit.utils.RequestParameterConstants;

/**
 * Advice helper for Control Mode service to manage uncontrol during deletion action on the model.
 *
 * @author Gabriel Pascual
 */
public class ControlModeEditHelperAdvice extends AbstractEditHelperAdvice {


	/**
	 * Instantiates a new control mode advice helper.
	 */
	public ControlModeEditHelperAdvice() {
		super();
	}

	/**
	 * Gets the before destroy element command.
	 *
	 * @param request
	 *            the request
	 * @return the before destroy element command
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest)
	 */
	@Override
	protected ICommand getBeforeDestroyElementCommand(DestroyElementRequest request) {
		EObject objectToDestroy = validateRequest(request);
		ICommand afterDestroyElementCommand = null;

		if (objectToDestroy != null) {
			ControlModeRequest controlRequest = ControlModeRequest.createUIUncontrolModelRequest(request.getEditingDomain(), objectToDestroy);
			IControlModeManager controlMng = ControlModeManager.getInstance();
			afterDestroyElementCommand = controlMng.getUncontrolCommand(controlRequest);
		}



		return afterDestroyElementCommand;
	}

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#configureRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 */
	@Override
	public void configureRequest(IEditCommandRequest request) {

		// Add the parameter only if the deleted element has to be uncontrolled
		if (validateRequest(request) != null) {
			request.getParameters().put(RequestParameterConstants.TRANSACTIONAL_NESTING, Boolean.TRUE);
		}
	}



	/**
	 * Validate that request is a destroy element one and that element can is Rooted Controlled Object.
	 *
	 * @param request
	 *            the request
	 * @return true, if successful
	 */
	protected EObject validateRequest(IEditCommandRequest request) {
		EObject uncontrolledObject = null;
		if (request instanceof DestroyElementRequest) {
			EObject objectToDestroy = ((DestroyElementRequest) request).getElementToDestroy();
			if (ControlHelper.isRootControlledObject(objectToDestroy)) {
				uncontrolledObject = objectToDestroy;
			}
		}
		return uncontrolledObject;
	}
}
