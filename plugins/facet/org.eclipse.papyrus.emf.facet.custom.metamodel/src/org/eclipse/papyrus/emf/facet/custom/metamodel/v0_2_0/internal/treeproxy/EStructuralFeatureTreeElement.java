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
package org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy;

import java.util.List;


/**
 * A representation of the model object '<em><b>EStructural Feature Tree Element</b></em>'.
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement#getReferedEObjectTE <em>Refered EObject TE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEStructuralFeatureTreeElement()
 */
public interface EStructuralFeatureTreeElement extends TreeElement {

	/**
	 * Returns the value of the '<em><b>Refered EObject TE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement}.
	 * It is bidirectional and its opposite is ' {@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement#getParent <em>Parent</em>}'.
	 * <p>
	 * If the meaning of the '<em>Refered EObject TE</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 *
	 * @return the value of the '<em>Refered EObject TE</em>' containment reference list.
	 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEStructuralFeatureTreeElement_ReferedEObjectTE()
	 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement#getParent
	 *      opposite="parent" containment="true"
	 */
	List<EObjectTreeElement> getReferedEObjectTE();
} // EStructuralFeatureTreeElement
