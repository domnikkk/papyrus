/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.common.edit.part;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.emf.appearance.helper.AppearanceHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.PapyrusWrappingLabel;
import org.eclipse.papyrus.sysml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.edit.part.AbstractElementLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.util.DiagramEditPartsUtil;
import org.eclipse.swt.graphics.Image;

/**
 * This class implements a FlowPort affixed label edit part.
 */
public class FlowPortAffixedLabelNameEditPart extends AbstractElementLabelEditPart implements IBorderItemEditPart {

	/** label provider for icons */
	private final ILabelProvider labelProvider;

	/** Constructor */
	public FlowPortAffixedLabelNameEditPart(View view) {
		super(view);
		addSnapBackLocation();
		labelProvider = Activator.getInstance().getLabelProvider();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
	}

	@Override
	public IBorderItemLocator getBorderItemLocator() {
		IFigure parentFigure = getFigure().getParent();
		if (parentFigure != null && parentFigure.getLayoutManager() != null) {
			Object constraint = parentFigure.getLayoutManager().getConstraint(getFigure());
			return (IBorderItemLocator) constraint;
		}
		return null;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Image getLabelIcon() {
		EObject parserElement = getParserElement();
		if (parserElement == null) {
			return null;
		}

		List<View> views = DiagramEditPartsUtil.findViews(parserElement, getViewer());
		for (View view : views) {
			if (AppearanceHelper.showElementIcon(view)) {
				return labelProvider.getImage(parserElement);
			}
		}

		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IFigure createFigure() {
		IFigure label = createFigurePrim();
		defaultText = getLabelTextHelper(label);
		return label;
	}

	protected IFigure createFigurePrim() {
		return new PapyrusWrappingLabel();
	}

	
	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart#getDefaultTextAlignment()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultTextAlignment() {
		return PositionConstants.LEFT;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLabelRole() {
		return "Label"; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getIconPathRole() {
		return ""; //$NON-NLS-1$
	}
}
