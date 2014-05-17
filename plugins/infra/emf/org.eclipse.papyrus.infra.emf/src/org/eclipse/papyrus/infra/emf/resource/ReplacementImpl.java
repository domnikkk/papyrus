/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;


public class ReplacementImpl implements Replacement {

	private EObject parent;

	private EStructuralFeature property;

	private EObject oldValue;

	private EObject newValue;

	public ReplacementImpl(EObject parent, EStructuralFeature property, EObject oldValue, EObject newValue) {
		this.parent = parent;
		this.property = property;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public EObject getEObject() {
		return parent;
	}

	public EStructuralFeature getEStructuralFeature() {
		return property;
	}

	public EObject get(boolean resolve) {
		if(resolve && newValue != null && newValue.eIsProxy()) {
			newValue = EcoreUtil.resolve(newValue, parent);
		}

		return newValue;
	}

	public void set(Object newValue) {
		throw new UnsupportedOperationException();
	}

	public boolean isSet() {
		return newValue != null;
	}

	public void unset() {
		throw new UnsupportedOperationException();
	}

	public EObject getOldValue() {
		return oldValue;
	}

	@Override
	public String toString() {
		return String.format("%s replaced with %s", EcoreUtil.getURI(oldValue), EcoreUtil.getURI(newValue)); //$NON-NLS-1$
	}
}