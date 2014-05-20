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


/**
 * 
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 *
 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage
 */
public interface TreeproxyFactory {

	/**
	 * The singleton instance of the factory.
	 *
	 */
	TreeproxyFactory eINSTANCE = org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EObject Tree Element</em>'.
	 *
	 * @return a new object of class '<em>EObject Tree Element</em>'.
	 */
	EObjectTreeElement createEObjectTreeElement();

	/**
	 * Returns a new object of class '<em>EReference Tree Element</em>'.
	 *
	 * @return a new object of class '<em>EReference Tree Element</em>'.
	 */
	EReferenceTreeElement createEReferenceTreeElement();

	/**
	 * Returns a new object of class '<em>EAttribute Tree Element</em>'.
	 *
	 * @return a new object of class '<em>EAttribute Tree Element</em>'.
	 */
	EAttributeTreeElement createEAttributeTreeElement();

	/**
	 * Returns a new object of class '<em>EStructural Feature Tree Element</em>'.
	 *
	 * @return a new object of class '<em>EStructural Feature Tree Element</em>'.
	 */
	EStructuralFeatureTreeElement createEStructuralFeatureTreeElement();

} //TreeproxyFactory
