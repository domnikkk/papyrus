package org.eclipse.papyrus.uml.diagram.activity.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IPapyrusNodeFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.SelectableBorderedNodeFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityCanonicalEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityDiagramChangeStereotypedShapeEditpolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityItemSemanticEditPolicyCN;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.DeleteActionViewEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.figures.ActivityFigure;
import org.eclipse.papyrus.uml.diagram.activity.locator.ParameterNodeLocator;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.BorderItemResizableEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ChangeStereotypedShapeEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.PapyrusCreationEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.QualifiedNameDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideCompartmentEditPolicy;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ActivityEditPartCN extends RoundedCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3083;

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
	public ActivityEditPartCN(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new PapyrusCreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityItemSemanticEditPolicyCN());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		// in Papyrus diagrams are not strongly synchronised
		// installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityCanonicalEditPolicyCN());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(ChangeStereotypedShapeEditPolicy.CHANGE_SHAPE_POLICY, new ActivityDiagramChangeStereotypedShapeEditpolicy());
		installEditPolicy(RequestConstants.REQ_DELETE, new DeleteActionViewEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		installEditPolicy(QualifiedNameDisplayEditPolicy.QUALIFIED_NAME_POLICY, new QualifiedNameDisplayEditPolicy());
		installEditPolicy(ShowHideCompartmentEditPolicy.SHOW_HIDE_COMPARTMENT_POLICY, new ShowHideCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ActivityCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (UMLVisualIDRegistry.getVisualID(childView)) {
				case ActivityParameterNodeEditPart.VISUAL_ID:
					return new BorderItemResizableEditPolicy();
				}
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
	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new ActivityFigure();
	}

	/**
	 * @generated
	 */
	@Override
	public ActivityFigure getPrimaryShape() {
		return (ActivityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPartCN) {
			((ActivityNameEditPartCN) childEditPart).setLabel(getPrimaryShape().getNameLabel());
			return true;
		}
		if (childEditPart instanceof ActivityIsSingleExecutionCNEditPart) {
			((ActivityIsSingleExecutionCNEditPart) childEditPart).setLabel(getPrimaryShape().getHeaderSingleExecution());
			return true;
		}
		if (childEditPart instanceof ActivityCNParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getParameterFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((ActivityCNParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCNPreConditionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPreconditionFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((ActivityCNPreConditionsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCNPostConditionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPostconditionFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((ActivityCNPostConditionsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCNContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getContentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way
			pane.add(((ActivityCNContentCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		// Papyrus Gencode :Affixed Activity Parameter Node locator for Activity
		if (childEditPart instanceof ActivityParameterNodeEditPart) {
			IBorderItemLocator locator = new ParameterNodeLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((ActivityParameterNodeEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPartCN) {
			return true;
		}
		if (childEditPart instanceof ActivityIsSingleExecutionCNEditPart) {
			return true;
		}
		if (childEditPart instanceof ActivityCNParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getParameterFigure();
			pane.remove(((ActivityCNParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCNPreConditionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPreconditionFigure();
			pane.remove(((ActivityCNPreConditionsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCNPostConditionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPostconditionFigure();
			pane.remove(((ActivityCNPostConditionsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCNContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getContentFigure();
			pane.remove(((ActivityCNContentCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityParameterNodeEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ActivityParameterNodeEditPart) childEditPart).getFigure());
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
		if (editPart instanceof ActivityCNParametersCompartmentEditPart) {
			return getPrimaryShape().getParameterFigure();
		}
		if (editPart instanceof ActivityCNPreConditionsCompartmentEditPart) {
			return getPrimaryShape().getPreconditionFigure();
		}
		if (editPart instanceof ActivityCNPostConditionsCompartmentEditPart) {
			return getPrimaryShape().getPostconditionFigure();
		}
		if (editPart instanceof ActivityCNContentCompartmentEditPart) {
			return getPrimaryShape().getContentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(200, 100);
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
	protected NodeFigure createMainFigure() {
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityNameEditPartCN.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	@Override
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UMLElementTypes.Parameter_3001) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityCNParametersCompartmentEditPart.VISUAL_ID));
			}
			if (type == UMLElementTypes.Constraint_3002) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityCNPreConditionsCompartmentEditPart.VISUAL_ID));
			}
			if (type == UMLElementTypes.Constraint_3003) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityCNPostConditionsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}
}
