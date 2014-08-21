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
package org.eclipse.papyrus.uml.diagram.timing.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IPapyrusNodeFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.SelectableBorderedNodeFigure;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.PapyrusCreationEditPolicy;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.policies.CustomFullLifelineItemSemanticEditPolicyCN;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.policies.TimeRulerVisibilityRefreshEditPolicy;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.policies.TimingDiagramDragDropEditPolicy;
import org.eclipse.papyrus.uml.diagram.timing.custom.figures.FullLifelineFigure;
import org.eclipse.papyrus.uml.diagram.timing.edit.policies.FullLifelineItemSemanticEditPolicyCN;
import org.eclipse.papyrus.uml.diagram.timing.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class FullLifelineEditPartCN extends LifelineEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 19;

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
	public FullLifelineEditPartCN(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new PapyrusCreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new FullLifelineItemSemanticEditPolicyCN());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new TimingDiagramDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CustomFullLifelineItemSemanticEditPolicyCN());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		installEditPolicy(TimeRulerVisibilityRefreshEditPolicy.ROLE, new TimeRulerVisibilityRefreshEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	@Override
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
	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new FullLifelineFigure();
	}

	/**
	 * org.eclipse.papyrus.uml.diagram.timing.custom.figures.FullLifelineFigure
	 * 
	 * @generated
	 */
	@Override
	public FullLifelineFigure getPrimaryShape() {
		return (FullLifelineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FullLifelineNameEditPart) {
			((FullLifelineNameEditPart) childEditPart).setLabel(getPrimaryShape().getLifelineLabelFigure());
			return true;
		}
		if (childEditPart instanceof FullLifelineStateDefinitionCompartmentEditPartCN) {
			IFigure pane = getPrimaryShape().getStateDefinitionContainerFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((FullLifelineStateDefinitionCompartmentEditPartCN) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FullLifelineTimelineCompartmentEditPartCN) {
			IFigure pane = getPrimaryShape().getTimelineContainerFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((FullLifelineTimelineCompartmentEditPartCN) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FullLifelineTimeRulerCompartmentEditPartCN) {
			IFigure pane = getPrimaryShape().getTimeRulerContainerFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((FullLifelineTimeRulerCompartmentEditPartCN) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FullLifelineNameEditPart) {
			return true;
		}
		if (childEditPart instanceof FullLifelineStateDefinitionCompartmentEditPartCN) {
			IFigure pane = getPrimaryShape().getStateDefinitionContainerFigure();
			pane.remove(((FullLifelineStateDefinitionCompartmentEditPartCN) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FullLifelineTimelineCompartmentEditPartCN) {
			IFigure pane = getPrimaryShape().getTimelineContainerFigure();
			pane.remove(((FullLifelineTimelineCompartmentEditPartCN) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FullLifelineTimeRulerCompartmentEditPartCN) {
			IFigure pane = getPrimaryShape().getTimeRulerContainerFigure();
			pane.remove(((FullLifelineTimeRulerCompartmentEditPartCN) childEditPart).getFigure());
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
		if (editPart instanceof FullLifelineStateDefinitionCompartmentEditPartCN) {
			return getPrimaryShape().getStateDefinitionContainerFigure();
		}
		if (editPart instanceof FullLifelineTimelineCompartmentEditPartCN) {
			return getPrimaryShape().getTimelineContainerFigure();
		}
		if (editPart instanceof FullLifelineTimeRulerCompartmentEditPartCN) {
			return getPrimaryShape().getTimeRulerContainerFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	@Override
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
		return new SelectableBorderedNodeFigure(createMainFigureWithSVG());
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	@Override
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(FullLifelineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	@Override
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UMLElementTypes.Node_9) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(FullLifelineStateDefinitionCompartmentEditPartCN.VISUAL_ID));
			}
			if (type == UMLElementTypes.Node_24) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(FullLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}
}
