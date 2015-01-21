/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.bpmn.diagram.common.editpolicy.provider;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

public class BpmnDiagramsEditPolicyProvider extends AbstractProvider
		implements IEditPolicyProvider {

	public static String BPMN_ID = "BPMN";

	public boolean provides(IOperation operation) {
		CreateEditPoliciesOperation epOperation = (CreateEditPoliciesOperation) operation;
		if (!(epOperation.getEditPart() instanceof GraphicalEditPart)) {
			return false;
		}
		

		return false;
	}

	public void createEditPolicies(EditPart editPart) {

	}

}
