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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;

/**
 * An implementation of the model object '<em><b>EObject Tree Element</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl#getEObject <em>EObject</em>}</li>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl#getSfTreeElmement <em>Sf Tree
 * Elmement</em>}</li>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 */
public class EObjectTreeElementImpl extends TreeElementImpl implements EObjectTreeElement {

	/**
	 * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
	 *
	 * @see #getEObject()
	 */
	protected EObject eObject;

	/**
	 * The cached value of the '{@link #getSfTreeElmement() <em>Sf Tree Elmement</em>}' containment reference list.
	 *
	 * @see #getSfTreeElmement()
	 */
	protected List<EStructuralFeatureTreeElement> sfTreeElmement;

	protected EObjectTreeElementImpl() {
		super();
	}

	public EObject getEObject() {
		return eObject;
	}

	public EObject basicGetEObject() {
		return eObject;
	}

	public void setEObject(EObject newEObject) {
		eObject = newEObject;
	}

	public List<EStructuralFeatureTreeElement> getSfTreeElmement() {
		if(sfTreeElmement == null) {
			sfTreeElmement = new LinkedList<EStructuralFeatureTreeElement>();
		}
		return sfTreeElmement;
	}

	/**
	 * Try to adapt this object to the requested type.
	 * Check if the underlying EObject ({@link #getEObject()}) can be adapted to the requested type.
	 *
	 * @param key
	 * @return
	 */
	public Object getAdapter(Class key) {
		// Check if the underlying EObject can request to the adaptation
		Object model = getEObject();

		if(key.isInstance(model)) {
			return model;
		} else {
			// Try the platform process
			//			return Platform.getAdapterManager().getAdapter(model, key);
			return null;
		}
	}

} //EObjectTreeElementImpl
