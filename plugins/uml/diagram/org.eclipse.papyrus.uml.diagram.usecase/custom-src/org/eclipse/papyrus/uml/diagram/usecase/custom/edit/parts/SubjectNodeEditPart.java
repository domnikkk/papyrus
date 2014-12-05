package org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart;

/**
 * @author Mickael ADAM
 *
 */
abstract public class SubjectNodeEditPart extends RoundedCompartmentEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public SubjectNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#getDefaultNamePosition()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultNamePosition() {
		return PositionConstants.LEFT;
	}

}
