package org.eclipse.papyrus.eastadl.nattable.manager.axis;

import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.papyrus.eastadl.service.types.elements.EastadlElementTypes;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionAllocation;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
import org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class AllocateAxisManager
		extends
		AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager<FunctionAllocation> {

	@Override
	protected boolean isInstanceOfRequiredStereotypeApplication(Object object) {
		boolean isInstanceof = (object instanceof FunctionAllocation);
		return isInstanceof;
	}

	@Override
	protected boolean isAllowedAsBaseElement(Element element) {
		boolean isAllowed = (element instanceof Abstraction);
		return isAllowed;
	}

	@Override
	protected FunctionAllocation getStereotypeApplication(Element element) {
		FunctionAllocation adlFunctionAllocation = UMLUtil
				.getStereotypeApplication(element, FunctionAllocation.class);
		return adlFunctionAllocation;
	}

	@Override
	protected String getStereotypeApplicationBasePropertyName() {
		String name = FunctionmodelingPackage.eINSTANCE
				.getFunctionAllocation_Base_Abstraction().getName();
		return name;
	}

	@Override
	public boolean canCreateAxisElement(final String elementId) {
		return ((ISpecializationType) EastadlElementTypes.FUNCTION_ALLOCATE)
				.getId().equals(elementId);
	}

	@Override
	protected Element getStereotypeBaseElement(
			final FunctionAllocation stereotypeApplication) {
		return stereotypeApplication.getBase_Abstraction();
	}
}
