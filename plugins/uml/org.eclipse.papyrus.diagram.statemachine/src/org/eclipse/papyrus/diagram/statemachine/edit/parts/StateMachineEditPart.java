package org.eclipse.papyrus.diagram.statemachine.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.edit.policies.DiagramDragDropEditPolicy;
import org.eclipse.papyrus.diagram.common.edit.policies.ViewAndFeatureResolver;
import org.eclipse.papyrus.diagram.common.providers.ViewInfo;
import org.eclipse.papyrus.diagram.common.util.DiagramEditPartsUtil;
import org.eclipse.papyrus.diagram.common.util.MDTUtil;
import org.eclipse.papyrus.diagram.statemachine.edit.policies.StateMachineCanonicalEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.edit.policies.StateMachineItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StateMachineEditPart extends DiagramEditPart {

	/**
	 * @generated NOT
	 */
	public final static String MODEL_ID = "UMLStateMachine"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 79;

	/**
	 * @generated
	 */
	private ViewAndFeatureResolver resolver = new ViewAndFeatureResolver() {

		public boolean isEObjectNode(EObject element) {
			if(UMLVisualIDRegistry.getNodeVisualID(getNotationView(), element) > -1) {
				return true;
			}
			return false;
		}

		public boolean isEObjectLink(EObject element) {
			if(UMLVisualIDRegistry.getLinkWithClassVisualID(element) > -1) {
				return true;
			}
			return false;
		}

		public int getEObjectSemanticHint(EObject element) {
			if(element != null) {
				return UMLVisualIDRegistry.getNodeVisualID(getNotationView(),
						element);
			}
			return -1;
		}

		public EStructuralFeature getEStructuralFeatureForEClass(EClass class1) {
			if(UMLPackage.eINSTANCE.getStateMachine().equals(class1)) {
				return UMLPackage.eINSTANCE.getPackage_PackagedElement();
			}
			if(UMLPackage.eINSTANCE.getComment().equals(class1)) {
				return UMLPackage.eINSTANCE.getElement_OwnedComment();
			}
			return null;
		}
	};

	/**
	 * @generated
	 */
	public StateMachineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StateMachineItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new StateMachineCanonicalEditPolicy());

		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DiagramDragDropEditPolicy(resolver));

		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {

		super.handleNotificationEvent(event);
		if(event.getNotifier() instanceof EAnnotation) {
			EAnnotation eAnnotation = (EAnnotation)event.getNotifier();
			if(eAnnotation.getSource() != null
					&& eAnnotation.getSource().equals(
					MDTUtil.FilterViewAndLabelsSource)) {
				DiagramEditPartsUtil.updateDiagram(this);
			}
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object getAdapter(Class adapter) {
		if(adapter != null && adapter.equals(ViewAndFeatureResolver.class)) {
			return this.resolver;
		}

		if(adapter != null && adapter.equals(ViewInfo.class)) {
			return UMLVisualIDRegistry.getDiagramViewInfo();
		}
		return super.getAdapter(adapter);
	}
}
