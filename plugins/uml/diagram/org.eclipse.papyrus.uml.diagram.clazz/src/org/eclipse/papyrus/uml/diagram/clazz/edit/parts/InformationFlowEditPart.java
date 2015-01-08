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
package org.eclipse.papyrus.uml.diagram.clazz.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.clazz.custom.figure.InformationFlowFigure;
import org.eclipse.papyrus.uml.diagram.clazz.custom.policies.AppliedStereotypeInformationFlowLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.clazz.edit.policies.InformationFlowItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editparts.UMLConnectionNodeEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;

/**
 * @generated
 */
public class InformationFlowEditPart extends UMLConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4026;

	/**
	 * @generated
	 */
	public InformationFlowEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InformationFlowItemSemanticEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeInformationFlowLabelDisplayEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InformationFlowConveyedLabelEditPart) {
			((InformationFlowConveyedLabelEditPart) childEditPart).setLabel(
					getPrimaryShape().getConveyedLabel());
		}
		if (childEditPart instanceof InformationFlowAppliedStereotypeEditPart) {
			((InformationFlowAppliedStereotypeEditPart) childEditPart).setLabel(
					getPrimaryShape().getAppliedStereotypeLabel());
		}
		return false;
	}

	/**
	 * @generated
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InformationFlowConveyedLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof InformationFlowAppliedStereotypeEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 *
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 *
	 * @generated
	 */
	@Override
	protected Connection createConnectionFigure() {
		return new InformationFlowFigure();
	}

	/**
	 * @generated
	 */
	@Override
	public InformationFlowFigure getPrimaryShape() {
		return (InformationFlowFigure) getFigure();
	}
}
