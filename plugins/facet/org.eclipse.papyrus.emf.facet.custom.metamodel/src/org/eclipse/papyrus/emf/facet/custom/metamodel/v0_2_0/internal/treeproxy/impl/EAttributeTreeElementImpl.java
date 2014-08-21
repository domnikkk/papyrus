/**
 * Copyright (c) 2012, 2014 Mia-Software, CEA, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 *    Christian W. Damus (CEA) - bug 434133
 */
package org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;

/**
 * An implementation of the model object '<em><b>EAttribute Tree Element</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EAttributeTreeElementImpl#getEAttribute <em>EAttribute </em>}</li>
 * </ul>
 * </p>
 *
 */
public class EAttributeTreeElementImpl extends EStructuralFeatureTreeElementImpl implements EAttributeTreeElement {

	/**
	 * The cached value of the '{@link #getEAttribute() <em>EAttribute</em>}' reference.
	 *
	 * @see #getEAttribute()
	 */
	protected EAttribute eAttribute;

	protected EAttributeTreeElementImpl() {
		super();
	}

	public EAttribute getEAttribute() {
		return eAttribute;
	}

	public void setEAttribute(EAttribute newEAttribute) {
		eAttribute = newEAttribute;
	}

	@Override
	protected EStructuralFeature getEStructuralFeature() {
		return getEAttribute();
	}

} // EAttributeTreeElementImpl
