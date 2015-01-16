package org.eclipse.papyrus.uml.diagram.activity.edit.policies;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityCNParametersCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityCNParametersCompartmentItemSemanticEditPolicy() {
		super(UMLElementTypes.Activity_3083);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return super.getCreateCommand(req);
		}
		if (UMLElementTypes.Parameter_3001 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getBehavior_OwnedParameter();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
