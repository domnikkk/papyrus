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
package org.eclipse.papyrus.views.properties.modelelement;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.ui.preferences.ScopedPreferenceStore;


public class PreferencesModelElementFactory extends AbstractModelElementFactory<PreferencesModelElement> {

	@Override
	protected PreferencesModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {
		return new PreferencesModelElement(context);
	}

	@Override
	protected void updateModelElement(PreferencesModelElement modelElement, Object newSourceElement) {
		if (!(newSourceElement instanceof DataContextElement)) {
			throw new IllegalArgumentException("Cannot resolve DataContextElement selection: " + newSourceElement);
		}

		DataContextElement context = (DataContextElement) newSourceElement;
		modelElement.context = context;
		modelElement.store = new ScopedPreferenceStore(InstanceScope.INSTANCE, context.getName());
	}
}
