/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.emf.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IHierarchicContentProvider;


/**
 * An EMF-standard content provider that implements the Papyrus {@link IHierarchicContentProvider} interface.
 */
public class AdapterFactoryHierarchicContentProvider extends AdapterFactoryContentProvider implements IHierarchicContentProvider {

	public AdapterFactoryHierarchicContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public boolean isValidValue(Object element) {
		return true;
	}

}
