/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Céline Janssens (ALL4TEC) celine.janssens@all4tec.net
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 443235
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.BorderDisplayEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.LabelAlignmentEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.LabelPrimarySelectionEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.IPapyrusWrappingLabel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;


public abstract class PapyrusLabelEditPart extends LabelEditPart {


	/**
	 * Default Margin when not present in CSS
	 */
	static final int DEFAULT_MARGIN = 1;
	
	/**
	 * CSS Integer property to define the horizontal Label Margin
	 */
	static final String X_MARGIN_PROPERTY = "xMarginLabel"; 
	
	/**
	 * CSS Integer property to define the vertical Label Margin
	 */
	static final String Y_MARGIN_PROPERTY = "yMarginLabel";
	
	
	public PapyrusLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(BorderDisplayEditPolicy.BORDER_DISPLAY_EDITPOLICY, new BorderDisplayEditPolicy());
		installEditPolicy(LabelAlignmentEditPolicy.LABEL_ALIGNMENT_KEY, new LabelAlignmentEditPolicy());
		installEditPolicy(LabelPrimarySelectionEditPolicy.LABEL_PRIMARY_SELECTION_KEY, new LabelPrimarySelectionEditPolicy());
	}
	
	
	
	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart#refreshVisuals()
	 *
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabelMargin();
	}
	
	/**
	 * 
	 */
	public void refreshLabelMargin() {
		IFigure figure = null;

		int horizontalMargin = DEFAULT_MARGIN;
		int verticalMargin= DEFAULT_MARGIN;

		Object model = this.getModel();



		if (model instanceof View) {
			horizontalMargin = NotationUtils.getIntValue((View)model, X_MARGIN_PROPERTY, DEFAULT_MARGIN);
			verticalMargin = NotationUtils.getIntValue((View)model, Y_MARGIN_PROPERTY, DEFAULT_MARGIN);
		}

		if (this instanceof GraphicalEditPart){
			figure = ((GraphicalEditPart) this).getFigure();
			
				if (figure instanceof IPapyrusWrappingLabel){
					((IPapyrusWrappingLabel)figure).setMarginLabel(horizontalMargin, verticalMargin);
				}
			
		}


	}
	
}