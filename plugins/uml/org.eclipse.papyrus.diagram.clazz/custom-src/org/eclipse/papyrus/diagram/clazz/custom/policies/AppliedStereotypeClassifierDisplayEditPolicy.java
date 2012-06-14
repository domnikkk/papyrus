/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   Arthur Daussy  -382605: 382610: [ClassDiagram] Display  stereotype and Mask for nested classifier label
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.clazz.custom.policies;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.papyrus.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy;
import org.eclipse.papyrus.diagram.common.helper.ClassifierLabelHelper;
import org.eclipse.uml2.uml.Classifier;


public class AppliedStereotypeClassifierDisplayEditPolicy extends AbstractAppliedStereotypeDisplayEditPolicy {
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Classifier getUMLElement() {
		return (Classifier)super.getUMLElement();
	};

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void refreshDisplay() {
		// calls the helper for this edit Part
		ClassifierLabelHelper.getInstance().refreshEditPartDisplay((GraphicalEditPart)getHost());
	}

}
