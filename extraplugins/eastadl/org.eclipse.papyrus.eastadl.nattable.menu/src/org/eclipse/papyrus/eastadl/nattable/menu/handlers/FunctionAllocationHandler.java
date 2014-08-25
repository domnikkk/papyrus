package org.eclipse.papyrus.eastadl.nattable.menu.handlers;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.eastadl.service.types.elements.EastadlElementTypes;

public class FunctionAllocationHandler extends AbstractEastadlNattableCreateCommandHandler {

	/**
	 * <pre>
	 * @see org.eclipse.papyrus.uml.service.types.handlers.AbstractCreateCommandHandler#getElementTypeToCreate()
	 *
	 * @return the IElementType this handler is supposed to create
	 *
	 * </pre>
	 *
	 * @generated
	 */
	@Override
	protected IElementType getElementTypeToCreate() {
		return EastadlElementTypes.FUNCTION_ALLOCATE;
	}


}
