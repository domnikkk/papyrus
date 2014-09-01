package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.MoveElementsCommand;
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
				ActivityPartition partition = (ActivityPartition) req.getTargetContainer();
				CompositeCommand result = new CompositeCommand("Move elements in Partition");
				MoveElementsCommand moveCommand = new NotContainmentMoveCommand(createMoveToPartitionRequest(req));
				result.add(moveCommand);
				for (Object o : req.getElementsToMove().keySet()) {
					result.add(new SetValueCommand(new SetRequest(partition, UMLPackage.eINSTANCE.getActivityPartition_Node(), o)));
				}
				return result;
			}
		}
		return super.getMoveCommand(req);
	}

	/**
	 * @param base
	 *            move request in which target container is ActivityPartition
	 * @return MoveRequest in which replaced Partition container on Activity and replaced containment features for it.
	 */
	private MoveRequest createMoveToPartitionRequest(MoveRequest baseReq) {
		if (baseReq == null) {
			return null;
		}
		MoveRequest result = new MoveRequest(baseReq.getEditingDomain(), findActivity(baseReq.getTargetContainer()), baseReq.getElementsToMove());
		for (Object o : baseReq.getElementsToMove().keySet()) {
			if (o instanceof ActivityNode) {
				ActivityNode node = (ActivityNode) o;
				result.setTargetFeature(node, findActivityFeature(node.eClass()));
			}
		}
		return result;
	}

	/**
	 * Find parent Activity.
	 *
	 * @param editElement
	 *            ActivitiyPartition element
	 * @return null if Activity not found.
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
	 * @return Appropriate feature. If feature not found return partitionFeature param
	 */
	protected EReference findActivityFeature(EClass eClass) {
		if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_StructuredNode();
		}
		if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_StructuredNode();
		}
		return UMLPackage.eINSTANCE.getActivity_OwnedNode();
	}
}