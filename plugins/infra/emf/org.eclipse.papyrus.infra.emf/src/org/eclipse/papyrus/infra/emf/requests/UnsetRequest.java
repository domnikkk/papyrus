/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.requests;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.type.core.EditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;


/**
 * A request to unset the value of a feature. Especially useful for explicitly {@link EStructuralFeature#isUnsettable() unsettable} features.
 */
public class UnsetRequest extends AbstractEditCommandRequest {

	private final EObject elementToEdit;

	private final EStructuralFeature feature;

	public UnsetRequest(TransactionalEditingDomain editingDomain, EObject elementToEdit, EStructuralFeature feature) {
		super(editingDomain);

		this.elementToEdit = elementToEdit;
		this.feature = feature;
	}

	public UnsetRequest(EObject elementToEdit, EStructuralFeature feature) {
		this(TransactionUtil.getEditingDomain(elementToEdit), elementToEdit, feature);
	}

	public Object getEditHelperContext() {
		IClientContext context = getClientContext();

		if (context == null) {
			return elementToEdit;
		} else {
			return new EditHelperContext(elementToEdit, context);
		}
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public EObject getElementToEdit() {
		return elementToEdit;
	}

	@Override
	public List<? extends EObject> getElementsToEdit() {
		if (elementToEdit != null) {
			return Collections.singletonList(elementToEdit);
		}

		return Collections.emptyList();
	}

}
