/**
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 */
package org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl;

import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;

/**
 * An implementation of the model object '<em><b>Tree Element</b></em>'.
 * <p>
 * </p>
 *
 */
public abstract class TreeElementImpl extends AdaptableTreeElementImpl implements TreeElement {

	protected TreeElement parent;

	protected TreeElementImpl() {
		super();
	}

	/**
	 * Returns the parent TreeElement
	 */
	public TreeElement getParent() {
		return parent;
	}

	/**
	 * Sets the parent TreeElement
	 */
	public void setParent(TreeElement newParent) {
		parent = newParent;
	}

} //TreeElementImpl
