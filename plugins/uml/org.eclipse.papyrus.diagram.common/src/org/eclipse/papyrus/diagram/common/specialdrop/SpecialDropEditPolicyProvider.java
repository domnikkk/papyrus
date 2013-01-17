/*****************************************************************************
 * Copyright (c) 2013 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.specialdrop;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;


public class SpecialDropEditPolicyProvider implements IEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		if (editPart instanceof IPrimaryEditPart) {
			editPart.installEditPolicy("SpecialDropEditPolicy", new SpecialDropEditPolicy());
		}
	}
	
	public boolean provides(IOperation operation) {
		return true;
	}

	public void addProviderChangeListener(IProviderChangeListener listener) {
	}

	public void removeProviderChangeListener(IProviderChangeListener listener) {
	}
}
