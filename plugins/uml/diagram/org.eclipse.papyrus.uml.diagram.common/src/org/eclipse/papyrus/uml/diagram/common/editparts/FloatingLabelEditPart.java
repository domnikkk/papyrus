/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 * 
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.editparts;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IndirectMaskLabelEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.NamedStyleProperties;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.MaskManagedFloatingLabelEditPolicy;

/**
 * The Class FloatingNameEditPart.
 */
public class FloatingLabelEditPart extends PapyrusLabelEditPart implements NamedStyleProperties {


	/** The Constant DEFAULT_LABEL_DISPLAYED. */
	private static final boolean DEFAULT_LABEL_DISPLAYED = false;

	/**
	 * Instantiates a new floating label edit part.
	 *
	 * @param view
	 *            the view
	 */
	public FloatingLabelEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart#createDefaultEditPolicies()
	 *
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(IndirectMaskLabelEditPolicy.INDRIRECT_MASK_MANAGED_LABEL, new MaskManagedFloatingLabelEditPolicy());
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#refreshVisibility()
	 *
	 */
	@Override
	protected void refreshVisibility() {
		super.refreshVisibility();
		// get the value of the CSS property
		boolean isLabelDisplayed = NotationUtils.getBooleanValue((View) getModel(), DISPLAY_FLOATING_LABEL, getDefaultLabelVisibility());

		// Set the visibility of the label
		getFigure().setVisible(isLabelDisplayed);
	}

	/**
	 * Gets the default label displayed value.
	 *
	 * @return the default label displayed value
	 */
	protected boolean getDefaultLabelVisibility() {
		return DEFAULT_LABEL_DISPLAYED;
	}

}
