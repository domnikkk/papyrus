package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.uml.service.types.command.NotContainmentMoveCommand;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.UMLPackage;

public class ActivityPartitionEditHelper extends ActivityGroupHelper {

	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		CreateElementRequest createRequest = isActivityNode(req.getElementType()) ? getCreatePartitionChildRequest(req) : req;
		return super.getCreateCommand(createRequest);
	}

	/**
	 * All elements which created in ActivityPartition is contained in Activity.
	 * ActivityPartition hasn't containment features.
	 * That's why we need replace ActivityPartion on Activity.
	 *
	 * @return new CreateElementRequest with Activity as a container for new Element.
	 */
	protected CreateElementRequest getCreatePartitionChildRequest(CreateElementRequest req) {
		if (req == null) {
			return null;
		}
		CreateElementRequest result = new CreateElementRequest(req.getEditingDomain(), findActivity(req.getContainer()), req.getElementType());
		result.setParameter(ActivityNodeHelper.IN_PARTITION, req.getContainer());
		result.setContainmentFeature(findActivityFeature(req.getElementType().getEClass()));
		return result;
	}

	@Override
	protected ICommand getMoveCommand(MoveRequest req) {
		if (req != null) {
			if (req.getTargetContainer() instanceof ActivityPartition) {
				CompositeCommand result = new CompositeCommand("Move elements in Partition");
				/**
				 * separate moving elements containment and not
				 */
				for (Object movedElement: req.getElementsToMove().keySet()) {
					if (movedElement instanceof ActivityNode) {
						result.add(createMoveActivityNodeCommand(req, (ActivityNode) movedElement));
					} else {
						result.add(createDefaultMoveCommand(req, (EObject) movedElement));
					}
				}
				return result;
			}
		}
		return super.getMoveCommand(req);
	}

	
	/**
	 * 
	 * Create for {@link ActivityNode} {@link CompositeCommand}.
	 * Contain {@link NotContainmentMoveCommand} to {@link Activity} and 
	 * {@link SetValueCommand} to set not containment reference for {@link ActivityPartition}
	 */
	private ICommand createMoveActivityNodeCommand(MoveRequest baseRequest, ActivityNode node) {
		CompositeCommand cc = new CompositeCommand("Move ActivityNode command");
		
		ActivityPartition partition = (ActivityPartition) baseRequest.getTargetContainer();
		EReference containmentFeature = findActivityFeature(node.eClass());
		Activity activity = findActivity(partition);
		
		MoveRequest moveActivityNodesReq = new MoveRequest(baseRequest.getEditingDomain(), activity, containmentFeature, node);
		
		cc.add(new NotContainmentMoveCommand(moveActivityNodesReq));
		cc.add(new SetValueCommand(new SetRequest(partition, UMLPackage.eINSTANCE.getActivityPartition_Node(), node)));
		return cc;
	}
	
	/**
	 * Create new {@link MoveRequest} for @param movedElement 
	 * and invoke super{@link #getMoveCommand(MoveRequest)} to get default move command
	 */
	private ICommand createDefaultMoveCommand(MoveRequest baseRequest, EObject movedElement) {
		EReference containmentFeature = baseRequest.getTargetFeature(movedElement);
		MoveRequest moveRequest = new MoveRequest(baseRequest.getEditingDomain(), baseRequest.getTargetContainer(), containmentFeature, movedElement);
		return super.getMoveCommand(moveRequest);
	}
	
	/**
	 * Find parent Activity.
	 *
	 * @param editElement
	 *            ActivitiyPartition element
	 * @return <code>null</code> if Activity not found.
	 */
	protected Activity findActivity(EObject editElement) {
		if (editElement instanceof ActivityPartition) {
			ActivityPartition partition = (ActivityPartition) editElement;
			if (partition.eContainer() instanceof Activity) {
				return (Activity) partition.eContainer();
			} else {
				return findActivity(partition.eContainer());
			}
		}
		return null;
	}

	/**
	 * Find Activity feature appropriate to ActivityPartition feature.
	 *
	 * @return Appropriate feature or <code>null</code> if feature not found.
	 */
	protected EReference findActivityFeature(EClass eClass) {
		if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_StructuredNode();
		}
		if (UMLPackage.eINSTANCE.getActivityNode().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_OwnedNode();
		}
		return null;
	}
}