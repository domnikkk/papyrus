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
public class InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentItemSemanticEditPolicy() {
		super(UMLElementTypes.InterruptibleActivityRegion_3068);
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
		if (UMLElementTypes.InitialNode_3004 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3005 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3006 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3007 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3008 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3010 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3038 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.MergeNode_3039 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ForkNode_3040 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.JoinNode_3041 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3078 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.SendObjectAction_3042 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.SendSignalAction_3052 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3063 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ValueSpecificationAction_3076 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ConditionalNode_3069 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_StructuredNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ExpansionRegion_3070 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_StructuredNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.LoopNode_3071 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_StructuredNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.SequenceNode_3073 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_StructuredNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.StructuredActivityNode_3065 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_StructuredNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ReadSelfAction_3081 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.DurationConstraint_3034 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPrecondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.DurationConstraint_3035 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPostcondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.TimeConstraint_3036 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPrecondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.TimeConstraint_3037 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPostcondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.IntervalConstraint_3032 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPrecondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.IntervalConstraint_3033 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPostcondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.Constraint_3011 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPrecondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.Constraint_3012 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getAction_LocalPostcondition();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3086 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ReadStructuralFeatureAction_3088 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3091 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.DestroyObjectAction_3095 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.ReadVariableAction_3097 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.AddVariableValueAction_3099 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.BroadcastSignalAction_3102 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3104 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getActivity_OwnedNode();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.Comment_3080 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getElement_OwnedComment();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		if (UMLElementTypes.Constraint_3112 == requestElementType) {
			// adjust the containment feature
			EReference containmentFeature = UMLPackage.eINSTANCE.getNamespace_OwnedRule();
			req.setContainmentFeature(containmentFeature);
			return getGEFWrapper(getSemanticCreationCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
