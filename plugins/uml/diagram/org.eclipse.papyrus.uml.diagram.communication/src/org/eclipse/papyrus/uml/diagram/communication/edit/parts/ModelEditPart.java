/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.communication.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.PasteEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.PapyrusCreationEditPolicy;
import org.eclipse.papyrus.uml.diagram.communication.custom.edit.policies.CustomDiagramDragDropEditPolicy;
import org.eclipse.papyrus.uml.diagram.communication.custom.edit.policies.CustomOrphanViewPolicy;
import org.eclipse.papyrus.uml.diagram.communication.edit.policies.PackageItemSemanticEditPolicy;

/**
 * @generated
 */
public class ModelEditPart extends PapyrusDiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "PapyrusUMLCommunicationDiagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public ModelEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new PapyrusCreationEditPolicy());
		installEditPolicy(PasteEditPolicy.PASTE_ROLE, new PasteEditPolicy());

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PackageItemSemanticEditPolicy());
		// in Papyrus diagrams are not strongly synchronised
		// installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new org.eclipse.papyrus.uml.diagram.communication.edit.policies.ModelCanonicalEditPolicy());

		installEditPolicy("RemoveOrphanView", new CustomOrphanViewPolicy()); //$NON-NLS-1$
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new CustomDiagramDragDropEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
}
