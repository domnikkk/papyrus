/*****************************************************************************
 * Copyright (c) 2011 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.readonly;

import java.util.Iterator;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;

public class ReadOnlyTester extends PropertyTester {

	public static final String IS_READ_ONLY = "isReadOnly"; //$NON-NLS-1$

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if(IS_READ_ONLY.equals(property) && receiver instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection)receiver;

			Iterator<?> it = selection.iterator();
			while(it.hasNext()) {
				Object obj = it.next();
				Object businessObject = getBusinessModel(obj);
				if(businessObject instanceof EObject) {
					Resource resource = ((EObject)businessObject).eResource();
					if (resource != null && resource.getResourceSet() != null) {
						return ReadOnlyManager.isReadOnly(resource, WorkspaceEditingDomainFactory.INSTANCE.getEditingDomain(resource.getResourceSet()));
					}
				}
			}
		}
		return false;
	}

	/**
	 * Get the business object associated to this object, if any. This method
	 * navigate throw the object if the object is an graphical artefact or a
	 * diagram artifact.
	 * 
	 * @param object
	 * @return Object
	 */
	public static Object getBusinessModel(Object object) {
		if(object instanceof EditPart) {
			// Check model. It can be a GraphNode.
			Object model = ((EditPart)object).getModel();
			if(model instanceof View) { // Notation / GMF
				return getBusinessElement((View)((EditPart)object).getModel());
			} else {
				return model;
			}

		} else if(object instanceof View) {
			return ((View)object).getElement();

		} else if(object instanceof IAdaptable) {
			// Among others this is useful to retrieve the selected object from
			// an explorer item.
			return ((IAdaptable)object).getAdapter(EObject.class);

		} else {
			return object;
		}
	}

	/**
	 * Get the business object from a GraphElement.
	 * 
	 * @param object
	 * @return
	 */
	protected static Object getBusinessElement(View object) {
		try {
			return object.getElement();
		} catch (NullPointerException e) {
			// no business element
			return null;
		}
	}
}
