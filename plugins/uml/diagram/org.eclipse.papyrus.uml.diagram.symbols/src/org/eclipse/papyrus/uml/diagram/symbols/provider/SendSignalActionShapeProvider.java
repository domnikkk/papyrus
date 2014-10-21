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
package org.eclipse.papyrus.uml.diagram.symbols.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.service.shape.ArrowShapeProvider;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.TypedElement;


/**
 * Shape Provider for {@link SendSignalAction} or for {@link TypedElement} that are typed by an {@link SendSignalAction}.
 */
public class SendSignalActionShapeProvider extends ArrowShapeProvider {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean providesShapes(EObject view) {
		if (!(view instanceof View)) {
			return false;
		}

		EObject element = ((View) view).getElement();

		if (element instanceof SendSignalAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof SendSignalAction)) {
			return true;
		}
		return false;
	}

}
