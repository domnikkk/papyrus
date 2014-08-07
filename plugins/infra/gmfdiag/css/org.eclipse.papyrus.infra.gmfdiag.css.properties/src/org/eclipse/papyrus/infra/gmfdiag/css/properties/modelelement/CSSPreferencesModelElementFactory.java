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

import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.PreferencesModelElement;
import org.eclipse.papyrus.views.properties.modelelement.PreferencesModelElementFactory;


public class CSSPreferencesModelElementFactory extends PreferencesModelElementFactory {

	@Override
	protected PreferencesModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {
		return new CSSPreferencesModelElement(context);
	}
}
