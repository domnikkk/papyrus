/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net	- Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.menu.actions;

import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.databinding.custom.CustomStyleValueCommand;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart;


/**
 * The Class provides actions for the text alignment.
 */
public class TextAlignmentAction {

	/** The alignment type. */
	private int textAlignment;

	/** the selected elements. */
	private List<IGraphicalEditPart> selectedElements;

	/**
	 * Constructor.
	 *
	 * @param textAlignment
	 *            text Alignment Type
	 * @param selectedElements
	 *            List of selected EditParts
	 */
	public TextAlignmentAction(int textAlignment, List<IGraphicalEditPart> selectedElements) {
		this.textAlignment = textAlignment;
		this.selectedElements = selectedElements;
	}

	/**
	 * Returns the command according to the request.
	 *
	 * @return the command according to the request
	 */
	public Command getCommand() {
		CompoundCommand cc = new CompoundCommand("Change value for text alignment"); //$NON-NLS-1$
		for (IGraphicalEditPart editPart : selectedElements) {
			if (editPart instanceof PapyrusLabelEditPart && editPart.getModel() != null) {
				// get the view
				final View view = (View) editPart.getModel();
				// set the edit command
				Command command = new CustomStyleValueCommand(view, literalPositionConstant(textAlignment), NotationPackage.eINSTANCE.getStringValueStyle(), NotationPackage.eINSTANCE.getStringValueStyle_StringValue(), "textAlignment");
				cc.append(command);
			}
		}
		if (!cc.isEmpty() && cc.canExecute()) {
			return cc;
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * Literal position constant.
	 *
	 * @param textAlignment
	 *            the text alignment
	 * @return the string of the position constant
	 */
	private String literalPositionConstant(int textAlignment) {
		String position;
		switch (textAlignment) {
		case PositionConstants.LEFT:
			position = "left";
			break;
		case PositionConstants.CENTER:
			position = "center";
			break;
		case PositionConstants.RIGHT:
			position = "right";
			break;
		default:
			position = "left";
			break;
		}
		return position;
	}

}
