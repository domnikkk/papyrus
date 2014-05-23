/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
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
package org.eclipse.papyrus.infra.gmfdiag.css.properties.modelelement;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.NotationHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.properties.Activator;
import org.eclipse.papyrus.infra.gmfdiag.properties.modelelement.CustomStyleModelElement;
import org.eclipse.papyrus.infra.gmfdiag.properties.modelelement.CustomStyleModelElementFactory;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;


public class CSSModelElementFactory extends CustomStyleModelElementFactory {

	@Override
	protected CustomStyleModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {
		View view = NotationHelper.findView(sourceElement);
		if(view == null) {
			Activator.log.warn("The selected element cannot be resolved to a GMF View");
			return null;
		}

		EditingDomain domain = EMFHelper.resolveEditingDomain(view);

		if(domain == null) {
			return new CSSModelElement(view, context);
		} else {
			return new CSSModelElement(view, domain, context);
		}
	}

}
