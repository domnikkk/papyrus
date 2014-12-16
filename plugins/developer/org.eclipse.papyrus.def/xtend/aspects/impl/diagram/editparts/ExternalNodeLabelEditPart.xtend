/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package aspects.impl.diagram.editparts

import xpt.diagram.editparts.Common
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel
import com.google.inject.Inject

/**
 * @author Mickael ADAM
 *
 */
class ExternalNodeLabelEditPart extends impl.diagram.editparts.ExternalNodeLabelEditPart {

	override additionalEditPolicies(GenExternalNodeLabel it){
	'''
		installEditPolicy(org.eclipse.gef.EditPolicy.PRIMARY_DRAG_ROLE, new org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.ExternalLabelPrimaryDragRoleEditPolicy());
	'''
	}
	
}