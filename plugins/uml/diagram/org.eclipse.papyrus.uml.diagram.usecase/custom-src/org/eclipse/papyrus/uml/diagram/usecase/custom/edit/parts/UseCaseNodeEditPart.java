package org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart;

/**
 * @author Mickael ADAM
 *
 */
abstract public class UseCaseNodeEditPart extends RoundedCompartmentEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public UseCaseNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultIsOvalValue()
	 *
	 * @return
	 */
	@Override
	protected boolean getDefaultIsOvalValue() {
		return true;
	}

}
