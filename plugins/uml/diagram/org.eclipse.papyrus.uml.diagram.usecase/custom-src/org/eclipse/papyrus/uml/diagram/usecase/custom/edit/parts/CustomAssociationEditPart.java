/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.figure.AssociationFigure;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

/**
 * @generated
 */
public class CustomAssociationEditPart extends AssociationEditPart {

	public CustomAssociationEditPart(View view) {
		super(view);
	}

	@Override
	public void activate() {
		super.activate();
		addAssociationEndListeners();
	}

	@Override
	public void deactivate() {
		removeAssociationEndListeners();
		super.deactivate();
	}

	protected void addAssociationEndListeners() {
		addListenerFilter("AssociationEndListenersSource", this, getSourceProperty());
		addListenerFilter("AssociationEndListenersTarget", this, getTargetProperty());
	}

	protected void removeAssociationEndListeners() {
		removeListenerFilter("AssociationEndListenersSource");
		removeListenerFilter("AssociationEndListenersTarget");
	}

	@Override
	protected void refreshVisuals() {
		Property source = getSourceProperty();
		Property target = getTargetProperty();
		int sourceType = 0;
		int targetType = 0;
		// navigable?
		if (source != null && source.isNavigable()) {
			sourceType += AssociationFigure.navigable;
		}
		if (target != null && target.isNavigable()) {
			targetType += AssociationFigure.navigable;
		}
		getPrimaryShape().setEnd(sourceType, targetType);
		super.refreshVisuals();
	}

	protected Property getSourceProperty() {
		IGraphicalEditPart graphicalSource = (IGraphicalEditPart) getSource();
		if (graphicalSource != null) {
			return getRelatedProperty(graphicalSource.resolveSemanticElement());
		}
		return null;
	}

	protected Property getTargetProperty() {
		IGraphicalEditPart graphicalTarget = (IGraphicalEditPart) getTarget();
		if (graphicalTarget != null) {
			return getRelatedProperty(graphicalTarget.resolveSemanticElement());
		}
		return null;
	}

	protected Property getRelatedProperty(EObject obj) {
		if (obj != null && resolveSemanticElement() instanceof Association) {
			EList<Property> ends = ((Association) resolveSemanticElement()).getMemberEnds();
			for (Property end : ends) {
				if (obj.equals(end.getType())) {
					return end;
				}
			}
		}
		return null;
	}
}
