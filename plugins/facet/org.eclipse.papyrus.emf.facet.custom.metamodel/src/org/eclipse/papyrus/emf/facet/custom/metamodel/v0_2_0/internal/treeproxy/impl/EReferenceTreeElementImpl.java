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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;

/**
 * An implementation of the model object '<em><b>EReference Tree Element</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EReferenceTreeElementImpl#getEReference <em>EReference
 * </em>}</li>
 * </ul>
 * </p>
 *
 */
public class EReferenceTreeElementImpl extends EStructuralFeatureTreeElementImpl implements EReferenceTreeElement {

	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 *
	 * @see #getEReference()
	 */
	protected EReference eReference;

	protected EReferenceTreeElementImpl() {
		super();
	}

	public EReference getEReference() {
		return eReference;
	}

	public void setEReference(EReference newEReference) {
		eReference = newEReference;
	}

	@Override
	public EObjectTreeElement getParent() {
		return (EObjectTreeElement)super.getParent();
	}

	public void setParent(EObjectTreeElement parent) {
		super.setParent(parent);
	}

} //EReferenceTreeElementImpl
