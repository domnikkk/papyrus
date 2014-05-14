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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;

/**
 * An implementation of the model object '<em><b>EStructural Feature Tree Element</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EStructuralFeatureTreeElementImpl#getParent <em>Parent
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EStructuralFeatureTreeElementImpl#getReferedEObjectTE <em>
 * Refered EObject TE</em>}</li>
 * </ul>
 * </p>
 *
 */
public class EStructuralFeatureTreeElementImpl extends TreeElementImpl implements EStructuralFeatureTreeElement {

	/**
	 * The cached value of the '{@link #getReferedEObjectTE() <em>Refered EObject TE</em>}' containment reference list.
	 *
	 * @see #getReferedEObjectTE()
	 */
	protected List<EObjectTreeElement> referedEObjectTE;

	protected EStructuralFeatureTreeElementImpl() {
		super();
	}

	public List<EObjectTreeElement> getReferedEObjectTE() {
		if(referedEObjectTE == null) {
			referedEObjectTE = new LinkedList<EObjectTreeElement>();
		}
		return referedEObjectTE;
	}

	/**
	 * Try to adapt this object to the requested type.
	 * Check if the underlying EObject ({@link #getEObject()}) can be adapted to the requested type.
	 *
	 * @param key
	 * @return
	 */
	public Object getAdapter(Class key) {
		if(key == EStructuralFeature.Setting.class) { //Metamodel element
			return new EStructuralFeature.Setting() {

				public void unset() {
					getEObject().eUnset(getEStructuralFeature());
				}

				public void set(Object newValue) {
					getEObject().eSet(getEStructuralFeature(), newValue);
				}

				public boolean isSet() {
					return getEObject().eIsSet(getEStructuralFeature());
				}

				public EStructuralFeature getEStructuralFeature() {
					return EStructuralFeatureTreeElementImpl.this.getEStructuralFeature();
				}

				public EObject getEObject() {
					return getEObject();
				}

				public Object get(boolean resolve) {
					return getEObject().eGet(getEStructuralFeature(), resolve);
				}
			};
		}

		//Semantic element
		// Check if the underlying EObject can request to the adaptation
		// The semantic EObject of a EReferenceTreeElement is the semantic EObject of it's parent (Which is an EObjectTreeElement)
		final EObject model = getEObject();

		if(key.isInstance(model)) {
			return model;
		}

		return null;
	}

	protected EStructuralFeature getEStructuralFeature() {
		throw new UnsupportedOperationException();
	}
	
	// The semantic EObject of a EReferenceTreeElement is the semantic EObject of it's parent (Which is an EObjectTreeElement)
	protected EObject getEObject() {
		TreeElement parent = getParent();
		if(parent instanceof EObjectTreeElement) { //Should always be true
			return ((EObjectTreeElement)parent).getEObject();
		}
		return null;
	}

} //EStructuralFeatureTreeElementImpl
