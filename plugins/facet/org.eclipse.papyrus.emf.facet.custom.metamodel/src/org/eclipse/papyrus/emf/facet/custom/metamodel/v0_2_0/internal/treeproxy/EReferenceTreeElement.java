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

import org.eclipse.emf.ecore.EReference;

/**
 * A representation of the model object '<em><b>EReference Tree Element</b></em>'.
 *
 * Represents an EReference as a link between two model elements in a tree view
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement#getEReference <em>EReference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEReferenceTreeElement()
 */
public interface EReferenceTreeElement extends EStructuralFeatureTreeElement {

	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * The EReference represented by this tree element
	 *
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEReferenceTreeElement_EReference()
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement#getEReference
	 * <em>EReference</em>}' reference.
	 *
	 * @param value
	 *            the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 */
	void setEReference(EReference value);

	public EObjectTreeElement getParent();

	public void setParent(EObjectTreeElement parent);

} // EReferenceTreeElement
