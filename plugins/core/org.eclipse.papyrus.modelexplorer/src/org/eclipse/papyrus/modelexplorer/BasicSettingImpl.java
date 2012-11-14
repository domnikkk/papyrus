/*****************************************************************************
 * Copyright (c) 2012 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;

/**
 * Basic implementation of the Setting interface
 * 
 * @author mvelten
 *
 */
public class BasicSettingImpl implements Setting {

	protected EObject obj;
	protected EStructuralFeature feature;

	public BasicSettingImpl(EObject obj, EStructuralFeature feature) {
		this.obj = obj;
		this.feature = feature;
	}

	public EObject getEObject() {
		return obj;
	}

	public EStructuralFeature getEStructuralFeature() {
		return feature;
	}

	public Object get(boolean resolve) {
		return obj.eGet(feature);
	}

	public void set(Object newValue) {
		obj.eSet(feature, newValue);
	}

	public boolean isSet() {
		return obj.eIsSet(feature);
	}

	public void unset() {
		obj.eUnset(feature);
	}
}
