/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IPapyrusNodeFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityParameterNodeItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.PinLayoutEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedBorderNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ActivityParameterNodeEditPart extends RoundedBorderNamedElementEditPart { // BorderNamedElementEditPart RoundedCompartmentEditPart

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3059;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ActivityParameterNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityParameterNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new PinLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * Papyrus codeGen
	 *
	 * @generated
	 **/
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			@Override
			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			@Override
			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			@Override
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new RoundedCompartmentFigure();
	}

	/**
	 * @generated
	 */
	@Override
	public RoundedCompartmentFigure getPrimaryShape() {
		return (RoundedCompartmentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParameterNodeNameEditPart) {
			((ParameterNodeNameEditPart) childEditPart).setLabel(getPrimaryShape().getNameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParameterNodeNameEditPart) {
			return true;
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
	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	@Override
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
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
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 *
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	@Override
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	@Override
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	@Override
	protected void setLineWidth(int width) {
		super.setLineWidth(width);
	}

	/**
	 * @generated
	 */
	@Override
	protected void setLineType(int style) {
		if (primaryShape instanceof IPapyrusNodeFigure) {
			((IPapyrusNodeFigure) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	@Override
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ParameterNodeNameEditPart.VISUAL_ID));
	}
	// /**
	// * @generated NOT implements IPapyrusNodeUMLElementFigure
	// */
	// public class ActivityParameterNodeDescriptor extends RectangleFigure implements IPapyrusNodeUMLElementFigure {
	//
	// /** The helper which handles stereotype aspects */
	// private StereotypeFigureHelper stereotypeHelper;
	//
	// /**
	// * @generated NOT use StereotypeFigureHelper
	// */
	// public ActivityParameterNodeDescriptor() {
	// GridLayout layoutThis = new GridLayout();
	// layoutThis.numColumns = 1;
	// layoutThis.makeColumnsEqualWidth = true;
	// this.setLayoutManager(layoutThis);
	// this.setLineWidth(1);
	// this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100), getMapMode().DPtoLP(50)));
	// // use StereotypeFigureHelper
	// stereotypeHelper = new StereotypeFigureHelper(this) {
	//
	// // @Override
	// // public IMapMode getMapMode() {
	// // return ActivityParameterNodeEditPart.this.getMapMode();
	// // }
	// @Override
	// public Object getStereotypeRectangleConstraint() {
	// GridData constraintStereotypeRect0 = new GridData();
	// constraintStereotypeRect0.verticalAlignment = GridData.BEGINNING;
	// constraintStereotypeRect0.horizontalAlignment = GridData.FILL;
	// constraintStereotypeRect0.horizontalIndent = 0;
	// constraintStereotypeRect0.horizontalSpan = 1;
	// constraintStereotypeRect0.verticalSpan = 1;
	// constraintStereotypeRect0.grabExcessHorizontalSpace = false;
	// constraintStereotypeRect0.grabExcessVerticalSpace = false;
	// return constraintStereotypeRect0;
	// }
	// };
	// }
	//
	// /**
	// * Refresh the layout of the figure
	// */
	// protected void refreshLayout() {
	// }
	//
	// /**
	// * Sets the stereotypes for this figure.
	// *
	// * @param stereotypes
	// * the string representing the stereotypes to be displayed
	// * @param image
	// * the image representing the stereotypes to be displayed
	// * @see org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusUMLElementFigure#setStereotypeDisplay(java.lang.String, org.eclipse.swt.graphics.Image)
	// */
	// @Override
	// public void setStereotypeDisplay(String stereotypes, Image image) {
	// stereotypeHelper.setStereotypeDisplay(stereotypes, image);
	// refreshLayout();
	// }
	//
	// /**
	// * Sets the stereotypes properties for this figure.
	// *
	// * @param stereotypeProperties
	// * the string representing the stereotype properties to be displayed
	// */
	// @Override
	// public void setStereotypePropertiesInBrace(String stereotypeProperties) {
	// stereotypeHelper.setStereotypePropertiesInBrace(stereotypeProperties);
	// refreshLayout();
	// }
	//
	// /**
	// * displays the new string corresponding to the list of stereotypes.
	// *
	// * @param stereotypeProperties
	// * the string to be displayed.
	// */
	// @Override
	// public void setStereotypePropertiesInCompartment(String stereotypeProperties) {
	// stereotypeHelper.setStereotypePropertiesInCompartment(stereotypeProperties);
	// refreshLayout();
	// }
	//
	// /**
	// * Gets the stereotype label.
	// *
	// * @return the stereotype label
	// * @unused
	// * @deprecated
	// */
	// @Deprecated
	// @Override
	// public Label getStereotypesLabel() {
	// return null;// fActionStereotypeLabel;
	// }
	// }
}
