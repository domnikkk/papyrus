package org.eclipse.papyrus.eastadl.service.types.matcher;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionAllocation;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.util.UMLUtil;

public class AllocateMatcher implements IElementMatcher {

	@Override
	public boolean matches(EObject eObject) {

		boolean isMatch = false;
		if (eObject instanceof Abstraction) {

			Abstraction element = (Abstraction) eObject;
			if (UMLUtil.getStereotypeApplication(element, FunctionAllocation.class) != null) {
				isMatch = true;
			}
		}
		return isMatch;
	}

}
