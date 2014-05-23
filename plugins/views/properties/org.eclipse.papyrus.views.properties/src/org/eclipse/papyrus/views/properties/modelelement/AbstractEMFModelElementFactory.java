/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 417409
 *  
 *****************************************************************************/
package org.eclipse.papyrus.views.properties.modelelement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;

/**
 * A partial implementation of a ModelElementFactory for creating {@link EMFModelElement}s
 * 
 * @author Camille Letavernier
 * 
 */
public abstract class AbstractEMFModelElementFactory<T extends EMFModelElement> extends AbstractModelElementFactory<T> {

	@Override
	protected void updateModelElement(T modelElement, Object newSourceElement) {
		EObject eObject = EMFHelper.getEObject(newSourceElement);
		if(eObject == null) {
			throw new IllegalArgumentException("Cannot resolve EObject selection: " + newSourceElement);
		}

		updateEMFModelElement(modelElement, eObject);
	}
	
	public static void updateEMFModelElement(EMFModelElement modelElement, EObject newEObject) {
		modelElement.source = newEObject;
		modelElement.domain = EMFHelper.resolveEditingDomain(newEObject);
	}
}
