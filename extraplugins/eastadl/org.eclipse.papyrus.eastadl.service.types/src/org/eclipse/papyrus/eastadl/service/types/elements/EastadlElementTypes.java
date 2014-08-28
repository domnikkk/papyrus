package org.eclipse.papyrus.eastadl.service.types.elements;

import org.eclipse.gmf.runtime.emf.type.core.AbstractElementTypeEnumerator;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;

public class EastadlElementTypes extends AbstractElementTypeEnumerator {

	/** Constant for SysML nature */
	public static final String SYSML_NATURE = "East-adl_Nature";

	/** IElementType for SysML Allocate */
	public static final IHintedType FUNCTION_ALLOCATE = (IHintedType) getElementType("org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionAllocation"); //$NON-NLS-1$
}
