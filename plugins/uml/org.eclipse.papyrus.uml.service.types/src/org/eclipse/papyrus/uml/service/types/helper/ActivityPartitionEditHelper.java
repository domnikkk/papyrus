package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.uml.ActivityPartition;

public class ActivityPartitionEditHelper extends ActivityNodeHelper {
	
	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		return super.getCreateCommand(getCreatePartitionChildRequest(req));
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
		result.setParameter(IN_PARTITION, (ActivityPartition)req.getContainer());
		result.setContainmentFeature(findActivityFeature(req.getElementType().getEClass()));
		return result;
	}
}