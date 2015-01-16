/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityDiagramItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.RemoveOrphanViewPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.DuplicatePasteEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.PapyrusCreationEditPolicy;

/**
 * @generated
 */
public class ActivityDiagramEditPart extends PapyrusDiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "PapyrusUMLActivityDiagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public ActivityDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new PapyrusCreationEditPolicy());
		installEditPolicy(DuplicatePasteEditPolicy.PASTE_ROLE, new DuplicatePasteEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityDiagramItemSemanticEditPolicy());
		// in Papyrus diagrams are not strongly synchronised
		// installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityDiagramCanonicalEditPolicy());
		installEditPolicy("RemoveOrphanView", new RemoveOrphanViewPolicy()); //$NON-NLS-1$
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
}
