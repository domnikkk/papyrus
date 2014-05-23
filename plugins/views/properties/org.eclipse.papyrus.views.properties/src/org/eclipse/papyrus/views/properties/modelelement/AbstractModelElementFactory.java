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
package org.eclipse.papyrus.views.properties.modelelement;

import org.eclipse.papyrus.views.properties.contexts.DataContextElement;


/**
 * This is the AbstractModelElementFactory type. Enjoy.
 */
public abstract class AbstractModelElementFactory<T extends AbstractModelElement> implements ModelElementFactory {

	protected AbstractModelElementFactory() {
		super();
	}

	public final ModelElement createFromSource(Object sourceElement, DataContextElement context) {
		AbstractModelElement result = doCreateFromSource(sourceElement, context);

		if(result != null) {
			result.setFactory(this);
		}

		return result;
	}

	protected abstract T doCreateFromSource(Object sourceElement, DataContextElement context);

	protected abstract void updateModelElement(T modelElement, Object newSourceElement);
}
