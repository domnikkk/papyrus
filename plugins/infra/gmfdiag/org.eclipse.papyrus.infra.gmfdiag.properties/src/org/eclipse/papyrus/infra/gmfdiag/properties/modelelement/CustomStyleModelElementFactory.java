/*****************************************************************************
 * Copyright (c) 2012, 2015 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 417409
 *  Christian W. Damus - bug 455075
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.properties.modelelement;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.NotationHelper;
import org.eclipse.papyrus.infra.gmfdiag.properties.Activator;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.AbstractEMFModelElementFactory;


public class CustomStyleModelElementFactory extends AbstractEMFModelElementFactory<CustomStyleModelElement> {

	@Override
	protected CustomStyleModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {
		View view = NotationHelper.findView(sourceElement);

		if (view != null) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(view);
			return new CustomStyleModelElement(view, domain, context);
		}

		Activator.log.warn("The selected element cannot be resolved to a GMF View");
		return null;
	}

	@Override
	protected void updateModelElement(CustomStyleModelElement modelElement, Object newSourceElement) {
		View view = NotationHelper.findView(newSourceElement);
		if (view == null) {
			throw new IllegalArgumentException("Cannot resolve GMF notation view selection: " + newSourceElement);
		}

		updateEMFModelElement(modelElement, view);
		modelElement.view = view;
	}

}
