/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.editparts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.figure.node.NodeNamedElementFigure;
import org.eclipse.papyrus.umlutils.ui.helper.NameLabelIconHelper;
import org.eclipse.papyrus.umlutils.ui.helper.QualifiedNameHelper;
import org.eclipse.uml2.uml.NamedElement;

/**
 * this editpart manage the display of qualifiedName
 * 
 */
public abstract class NamedElementEditPart extends UmlNodeEditPart implements IUMLNamedElementEditPart {

	/**
	 * {@inheritDoc}
	 */
	public NamedElementEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	public NamedElement getNamedElement() {
		return (NamedElement) getUMLElement();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);

		// set the figure active when the feature of the of a class is true
		if (resolveSemanticElement() != null) {
			refreshqualifiedNameDepth();
			refreshQualifiedName();
			refreshIconNamedLabel();
		}
	}

	private void refreshIconNamedLabel() {
		((NodeNamedElementFigure) getPrimaryShape()).setNameLabelIcon(NameLabelIconHelper.getNameLabelIconValue((View) getModel()));
	}

	private void refreshQualifiedName() {
		((NodeNamedElementFigure) getPrimaryShape()).setQualifiedName(((NamedElement) resolveSemanticElement()).getQualifiedName());
	}

	private void refreshqualifiedNameDepth() {
		((NodeNamedElementFigure) getPrimaryShape()).setDepth(QualifiedNameHelper.getQualifiedNamedepth((View) getModel()));
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshqualifiedNameDepth();
		refreshQualifiedName();
		refreshIconNamedLabel();

	}
}

