package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.MoveElementsCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.uml.service.types.command.NotContainmentMoveCommand;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.UMLPackage;

public class InterruptibleActivityRegionHelper extends ActivityGroupHelper {
	
	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		CreateElementRequest createRequest = isActivityNode(req.getElementType()) ? initCreateActivityNodeRequestInInterruptibleRegion(req) : req;
		return super.getCreateCommand(createRequest);
	}
	
	/**
	 * {@link InterruptibleActivityRegion} cannot contain any {@link ActivityNode}. 
	 * That's why we create new element in {@link Activity} and added it to {@link InterruptibleActivityRegion#getNodes()} referenced list
	 * 
	 * @param baseReq {@link CreateElementRequest} from ItemSemanticEditPolicy with not containment {@link InterruptibleActivityRegion#getNodes()} feature
	 * @return new {@link CreateElementRequest} with {@link Activity} as container and right containment {@link ActivityNode} feature
	 */
	protected CreateElementRequest initCreateActivityNodeRequestInInterruptibleRegion(CreateElementRequest baseReq) {
		if (baseReq == null) {
			return null;
		}
		CreateElementRequest req = new CreateElementRequest(baseReq.getElementType());
		InterruptibleActivityRegion inrruptibleActivityRegion = ((InterruptibleActivityRegion)baseReq.getContainer());
		req.setContainer(inrruptibleActivityRegion.getInActivity());
		req.setContainmentFeature(findActivityFeature(baseReq.getElementType().getEClass()));
		req.setParameter(ActivityNodeHelper.IN_INTERRUPTIBLE_ACTIVITY_REGION, inrruptibleActivityRegion);
		return req;
	}
	
	/**
	 * Find {@link Activity} feature appropriate to {@link InterruptibleActivityRegion} feature.
	 * 
	 * @return Appropriate feature.
	 */
	protected EReference findActivityFeature(EClass eClass) {
		if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_StructuredNode();
		}
		return UMLPackage.eINSTANCE.getActivity_OwnedNode();
	}
	
	private boolean isActivityNode(IElementType type) {
		return UMLPackage.eINSTANCE.getActivityNode().isSuperTypeOf(type.getEClass());
	}
	
	@Override
	protected ICommand getMoveCommand(MoveRequest req) {
		if (req != null) {
			if (isTargetContainerInterruptibleActivityRegioin(req)) {
				return createMoveCommandWithSetReference(req, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node());
			}
		}
		return super.getMoveCommand(req);
	}
	
	private boolean isTargetContainerInterruptibleActivityRegioin(MoveRequest req) {
		return req.getTargetContainer() instanceof InterruptibleActivityRegion;
	}
	
	/**
	 * This method create {@link CompositeCommand}. It contain redirected {@link MoveCommand} to Activity
	 * and commands to set references on ActivityNodes for base container which can't contain they.
	 * 
	 * @param req base {@MoveRequest}
	 * @param featureToSetReference {@link EReference} to set {@link ActivityNode} in base request target container's referenced list
	 * @return {@link CompositeCommand} which contain {@link MoveCommand} elements to Activity and {@link SetValueCommand}s to base container's referenced list
	 */
	protected ICommand createMoveCommandWithSetReference(MoveRequest req, EReference featureToSetReference) {
		EObject nonContainmentContainer = (EObject)req.getTargetContainer();
		CompositeCommand result = new CompositeCommand("Move elements in non containment Activity container");
		MoveElementsCommand moveCommand = new NotContainmentMoveCommand(createMoveToActivityRequest(req));
		result.add(moveCommand);
		for (Object o: req.getElementsToMove().keySet()) {
			if (o instanceof ActivityNode) {
				result.add(new SetValueCommand(new SetRequest(nonContainmentContainer, featureToSetReference, o)));
			}
		}
		return result;
	}
	
	/**
	 * @param base move request in which target container can't contain {@link ActivityNode}
	 * @return {@link MoveRequest} in which replaced base container on {@link Activity}and replaced containment features for it.
	 */
	protected MoveRequest createMoveToActivityRequest(MoveRequest baseReq) {
		if (baseReq == null) {
			return null;
		}
		MoveRequest result = new MoveRequest(baseReq.getEditingDomain(), ((InterruptibleActivityRegion)(baseReq.getTargetContainer())).getInActivity(), baseReq.getElementsToMove());
		for (Object o : baseReq.getElementsToMove().keySet()) {
			if (o instanceof ActivityNode) {
				ActivityNode node = (ActivityNode)o;
				result.setTargetFeature(node ,findActivityFeature(node.eClass()));
			}
		}
		return result;
	}
}
