/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 417409
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.css.properties.modelelement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.views.properties.Activator;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.AbstractEMFModelElementFactory;


/**
 * Themes ModelElement factory to provide label provider because
 * CSS EMF model is not in Service registry.
 *
 * @author gpascual
 *
 */
public class CSSThemesModelElementFactory extends AbstractEMFModelElementFactory<CSSThemesModelElement> {


	/**
	 * Default constructor.
	 *
	 */
	public CSSThemesModelElementFactory() {
		super();
	}

	@Override
	protected CSSThemesModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {

		EObject source = EMFHelper.getEObject(sourceElement);
		if (source == null) {
			Activator.log.warn("Unable to resolve the selected element to an EObject"); //$NON-NLS-1$
			return null;
		}

		EditingDomain domain = EMFHelper.resolveEditingDomain(source);

		// Create CSS themes ModelElement
		return new CSSThemesModelElement(source, domain);
	}


}
