/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.synchronizeview.provider;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.ServiceUtilsForEditPart;
import org.eclipse.papyrus.uml.diagram.synchronizeview.editpolicy.SynchronizeViewEditPolicy;

/**
 * this is an editpolicy provider in charge to install a canonical edit policy on papyrus editpart
 */
public class SynchronizeEditPolicyProvider extends AbstractProvider implements IEditPolicyProvider {

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void createEditPolicies(EditPart editPart) {

		if (!(editPart instanceof ITextAwareEditPart)) {
			if (editPart instanceof DiagramEditPart || editPart instanceof CompartmentEditPart || editPart instanceof IBorderedShapeEditPart) {
				editPart.installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new SynchronizeViewEditPolicy());
			}
		}
	}



	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public boolean provides(IOperation operation) {
		CreateEditPoliciesOperation epOperation = (CreateEditPoliciesOperation) operation;

		EditPart gep = epOperation.getEditPart();
		// test if the edipart is a papyrus editpart
		try {
			if (ServiceUtilsForEditPart.getInstance().getServiceRegistry(gep) == null) {
				return false;
			}
		} catch (org.osgi.framework.ServiceException ex) {
			return false;
		} catch (ServiceException e) {
			return false;
		}
		// we are sure that this is a papyrus editpart
		if (!(gep instanceof ITextAwareEditPart)) {
			if (gep instanceof DiagramEditPart || gep instanceof CompartmentEditPart || gep instanceof IBorderedShapeEditPart) {
				return true;
			}
		}



		return false;
	}


}
