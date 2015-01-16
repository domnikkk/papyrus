package org.eclipse.papyrus.uml.diagram.activity.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IPapyrusNodeFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.SelectableBorderedNodeFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityDiagramChangeStereotypedShapeEditpolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.CreateActionLocalConditionEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.CustomDiagramDragDropEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.DeleteActionViewEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ObjectFlowWithPinsCreationEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ReadStructuralFeatureActionCanonicalEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ReadStructuralFeatureActionItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.locator.PinPositionLocator;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.BorderItemResizableEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ChangeStereotypedShapeEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.PapyrusCreationEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ReadStructuralFeatureActionEditPart extends RoundedCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3088;

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
	public ReadStructuralFeatureActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new PapyrusCreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ReadStructuralFeatureActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		// in Papyrus diagrams are not strongly synchronised
		// installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new org.eclipse.papyrus.uml.diagram.activity.edit.policies.ReadStructuralFeatureActionCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		installEditPolicy(RequestConstants.REQ_CREATE, new CreateActionLocalConditionEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ObjectFlowWithPinsCreationEditPolicy());
		installEditPolicy(RequestConstants.REQ_DELETE, new DeleteActionViewEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ReadStructuralFeatureActionCanonicalEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		installEditPolicy(ChangeStereotypedShapeEditPolicy.CHANGE_SHAPE_POLICY, new ActivityDiagramChangeStereotypedShapeEditpolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new CustomDiagramDragDropEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
				case ReadStructuralFeatureActionFloatingNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						@Override
						protected List<?> createSelectionHandles() {
							MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				case InputPinInReadStructuralFeatureAsObjectEditPart.VISUAL_ID:
				case OutputPinInReadStructuralFeatureAsResultEditPart.VISUAL_ID:
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
	protected IFigure createNodeShape() {
		return primaryShape = new RoundedCompartmentFigure();
	}

	/**
	 * @generated
	 */
	public RoundedCompartmentFigure getPrimaryShape() {
		return (RoundedCompartmentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ReadStructuralFeatureActionNameEditPart) {
			((ReadStructuralFeatureActionNameEditPart) childEditPart).setLabel(getPrimaryShape().getNameLabel());
			return true;
		}
		// Papyrus Gencode :Affixed Pin locator for Actions
		if (childEditPart instanceof InputPinInReadStructuralFeatureAsObjectEditPart) {
			IBorderItemLocator locator = new PinPositionLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((InputPinInReadStructuralFeatureAsObjectEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		// Papyrus Gencode :Affixed Pin locator for Actions
		if (childEditPart instanceof OutputPinInReadStructuralFeatureAsResultEditPart) {
			IBorderItemLocator locator = new PinPositionLocator(getMainFigure(), PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(((OutputPinInReadStructuralFeatureAsResultEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ReadStructuralFeatureActionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InputPinInReadStructuralFeatureAsObjectEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((InputPinInReadStructuralFeatureAsObjectEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof OutputPinInReadStructuralFeatureAsResultEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((OutputPinInReadStructuralFeatureAsResultEditPart) childEditPart).getFigure());
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof ReadStructuralFeatureActionFloatingNameEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ReadStructuralFeatureActionNameEditPart.VISUAL_ID));
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#handleNotificationEvent(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (UMLPackage.Literals.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE.equals(feature)) {
			final Object result = this.resolveSemanticElement().eGet(UMLPackage.Literals.READ_STRUCTURAL_FEATURE_ACTION__RESULT);
			final Object object = this.resolveSemanticElement().eGet(UMLPackage.Literals.STRUCTURAL_FEATURE_ACTION__OBJECT);
			Object _feature = notification.getNewValue();
			if (_feature instanceof StructuralFeature) {
				org.eclipse.emf.common.command.Command cmdSetResultType = null;
				org.eclipse.emf.common.command.Command cmdSetObjectType = null;
				StructuralFeature newFeature = (StructuralFeature) _feature;
				Type type = newFeature.getType();
				if (type != null) {
					cmdSetResultType = SetCommand.create(getEditingDomain(), result, UMLPackage.Literals.TYPED_ELEMENT__TYPE, type);
				}
				Element owner = newFeature.getOwner();
				if (owner != null) {
					cmdSetObjectType = SetCommand.create(getEditingDomain(), object, UMLPackage.Literals.TYPED_ELEMENT__TYPE, owner);
				}
				try {
					if (cmdSetResultType != null) {
						if (cmdSetResultType.canExecute()) {
							CommandStack commandStack = getEditingDomain().getCommandStack();
							if (commandStack instanceof TransactionalCommandStack) {
								((TransactionalCommandStack) commandStack).execute(cmdSetResultType, Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE));
							} else {
								commandStack.execute(cmdSetResultType);
							}
						}
					}
					if (cmdSetObjectType != null) {
						if (cmdSetObjectType.canExecute()) {
							CommandStack commandStack = getEditingDomain().getCommandStack();
							if (commandStack instanceof TransactionalCommandStack) {
								((TransactionalCommandStack) commandStack).execute(cmdSetObjectType, Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE));
							} else {
								commandStack.execute(cmdSetObjectType);
							}
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (RollbackException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
