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
package org.eclipse.papyrus.infra.gmfdiag.common.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.papyrus.infra.core.editor.reload.IReloadContextProvider;

/**
 * An adapter factory for the outline page contributed by nested diagram editors.
 */
public class DiagramOutlineAdapterFactory implements IAdapterFactory {

	private static final Class<?>[] ADAPTERS = { IReloadContextProvider.class };

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return ADAPTERS;
	}

	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if(adapterType == IReloadContextProvider.class) {
			if(DiagramOutlineReloadContextProvider.isDiagramOutline(adaptableObject)) {
				return new DiagramOutlineReloadContextProvider(adaptableObject);
			}
		}
		return null;
	}

}
