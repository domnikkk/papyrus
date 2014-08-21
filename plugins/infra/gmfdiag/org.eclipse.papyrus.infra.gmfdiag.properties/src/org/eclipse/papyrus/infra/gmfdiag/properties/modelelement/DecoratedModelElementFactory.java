/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 417409
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.properties.modelelement;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.NotationHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.providers.ShapeDecorator;
import org.eclipse.papyrus.infra.gmfdiag.properties.Activator;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.AbstractModelElementFactory;

/**
 * A factory for handling the GMF decorated elements
 */
public class DecoratedModelElementFactory extends AbstractModelElementFactory<DecoratedModelElement> {

	@Override
	protected DecoratedModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {
		View view = NotationHelper.findView(sourceElement);

		if (view != null) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(view);
			if (ShapeDecorator.isDecorable(view)) {
				return new DecoratedModelElement(view, domain);
			}

		}

		Activator.log.warn("The selected element cannot be resolved to a Decorated element");
		return null;
	}

	@Override
	protected void updateModelElement(DecoratedModelElement modelElement, Object newSourceElement) {
		View view = NotationHelper.findView(newSourceElement);
		if ((view == null) || !ShapeDecorator.isDecorable(view)) {
			throw new IllegalArgumentException("Cannot resolve decorable View selection: " + newSourceElement);
		}
		modelElement.source = view;
		modelElement.domain = EMFHelper.resolveEditingDomain(view);
	}
}
