/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	CEA LIST - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.util;

import org.eclipse.emf.common.util.URI;

/**
 * Overrides default generated resource to use uuids instead of index
 */
public class CustomElementCreationMenuModelResource extends ElementCreationMenuModelResourceImpl {
	/**
	 * Creates an instance of the resource.
	 *
	 * @param uri
	 *            the URI of the new resource.
	 */
	public CustomElementCreationMenuModelResource(URI uri) {
		super(uri);
	}

	@Override
	protected boolean useUUIDs() {
		return true;
	}

}
