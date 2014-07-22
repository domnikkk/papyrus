package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.uml.ExpansionRegion;


public class ExpansionNodeHelper extends ActivityNodeHelper {

	/** 
	 * Parameter name for {@link ConfigureRequest}
	 * Used to pass the parent EObject to actual new element to set it in referenced not containment list.
	 */
	public static final String IN_EXPANSION_REGION = "IN_EXPANSION_REGION";
	
	/** 
	 * Parameter name for {@link ConfigureRequest}
	 * Used to determine feature to add new element in referenced not containment parent list.
	 */
	public static final String EXPANSION_REGION_FEATURE = "EXPANSION_REGION_FEATURE";
	
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		EObject expectedExpansionRegion = (EObject)req.getParameter(IN_EXPANSION_REGION);
		if (expectedExpansionRegion instanceof ExpansionRegion) {
			EObject feature = (EObject)req.getParameter(EXPANSION_REGION_FEATURE);
			return new SetValueCommand(new SetRequest(expectedExpansionRegion, (EReference)feature, req.getElementToConfigure()));
		}
		return super.getConfigureCommand(req);
	}
}
