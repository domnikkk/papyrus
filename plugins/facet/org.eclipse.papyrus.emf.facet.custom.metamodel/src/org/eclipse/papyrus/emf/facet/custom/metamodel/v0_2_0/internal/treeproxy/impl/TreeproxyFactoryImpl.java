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

import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyFactory;

/**
 * An implementation of the model <b>Factory</b>.
 *
 */
public class TreeproxyFactoryImpl implements TreeproxyFactory {

	/**
	 * Creates the default factory implementation.
	 *
	 */
	public static TreeproxyFactory init() {
		return new TreeproxyFactoryImpl();
	}

	public TreeproxyFactoryImpl() {
		super();
	}

	public EObjectTreeElement createEObjectTreeElement() {
		EObjectTreeElementImpl eObjectTreeElement = new EObjectTreeElementImpl();
		return eObjectTreeElement;
	}

	public EReferenceTreeElement createEReferenceTreeElement() {
		EReferenceTreeElementImpl eReferenceTreeElement = new EReferenceTreeElementImpl();
		return eReferenceTreeElement;
	}

	public EAttributeTreeElement createEAttributeTreeElement() {
		EAttributeTreeElementImpl eAttributeTreeElement = new EAttributeTreeElementImpl();
		return eAttributeTreeElement;
	}

	public EStructuralFeatureTreeElement createEStructuralFeatureTreeElement() {
		EStructuralFeatureTreeElementImpl eStructuralFeatureTreeElement = new EStructuralFeatureTreeElementImpl();
		return eStructuralFeatureTreeElement;
	}

} //TreeproxyFactoryImpl
