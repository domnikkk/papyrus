package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;

public class ExpansionRegionHelper extends ActivityNodeHelper {

	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		CreateElementRequest createRequest = isRequestToCreateExpansionNode(req) ? getCreateExpansionRegionAffixedChildRequest(req) : req;
		return super.getCreateCommand(createRequest);
	}

	/**
	 * This method return new request for creation {@link ExpansionNode} with right containment feature {@link ExpansionRegion#getInputElements()} and
	 * {@link ExpansionRegion#getOutputElements()} are referenced list and
	 * cannot contains {@link ExpansionNode}. Thats why we add new {@link ExpansionNode} element to {@link StructuredActivityNode#getNodes()}
	 * containment list
	 * 
	 * @param ItemSemanticPolicy
	 *        {@link CreateElementRequest}
	 * @return {@link CreateElementRequest} with changed containment feature
	 */
	protected CreateElementRequest getCreateExpansionRegionAffixedChildRequest(CreateElementRequest req) {
		if(req == null) {
			return null;
		}
		CreateElementRequest result = new CreateElementRequest(req.getEditingDomain(), req.getContainer(), req.getElementType());
		result.setParameter(ExpansionNodeHelper.IN_EXPANSION_REGION, req.getContainer());
		result.setParameter(ExpansionNodeHelper.EXPANSION_REGION_FEATURE, req.getContainmentFeature());
		result.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
		return result;
	}

	/**
	 * Method check CreateEmentRequest to create {@link ExpansionNode} It check new ElementType and check containmentFeature
	 * 
	 * @param ItemSematicPolicy
	 *        {@link CreateElementRequest}
	 * @return
	 */
	protected boolean isRequestToCreateExpansionNode(CreateElementRequest req) {
		IElementType newElementType = req.getElementType();
		EReference feature = req.getContainmentFeature();
		return isExpansionNodeType(newElementType) && isExpansionNodeFeature(feature);
	}

	/**
	 * Check can this feature add {@link ExpansionNode} to {@link ExpansionRegion#getInputElements()} or {@link ExpansionRegion#getOutputElements()}
	 * 
	 * @param {@link CreateElementRequest} containment feature.
	 */
	protected boolean isExpansionNodeFeature(EReference feature) {
		return UMLPackage.eINSTANCE.getExpansionRegion_InputElement().equals(feature) || UMLPackage.eINSTANCE.getExpansionRegion_OutputElement().equals(feature);
	}

	/**
	 * Check is this type {@link ExpansionNode}
	 * 
	 * @param type
	 *        the {@link CreateElementRequest} new {@link IElementType}
	 */
	protected boolean isExpansionNodeType(IElementType type) {
		return UMLPackage.eINSTANCE.getExpansionNode().equals(type.getEClass());
	}
}
