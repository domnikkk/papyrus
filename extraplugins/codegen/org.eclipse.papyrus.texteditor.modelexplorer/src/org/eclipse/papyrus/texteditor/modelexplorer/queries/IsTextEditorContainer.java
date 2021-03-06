/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ansgar Radermacher (CEA LIST) ansgar.radermacher@cea.fr - Initial API and implementation
 *  (with the help of examining table support from Vincent Lorenzo)
 *
 *****************************************************************************/
package org.eclipse.papyrus.texteditor.modelexplorer.queries;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.infra.viewpoints.policy.NotationUtils;
import org.eclipse.papyrus.texteditor.model.texteditormodel.TextEditorModel;
import org.eclipse.papyrus.views.modelexplorer.queries.AbstractEditorContainerQuery;

/** Returns true if the element contains a Table */
// FIXME this query is declared using Element in the querySet -> change into EObject when the EMF-Facet bug will be corrected 365744
public class IsTextEditorContainer extends AbstractEditorContainerQuery implements IJavaQuery2<EObject, Boolean> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean evaluate(EObject context, IParameterValueList2 parameterValues, IFacetManager manager)
			throws DerivedTypedElementException {
		Iterator<EObject> roots = NotationUtils.getNotationRoots(context);
		if (roots == null) {
			return false;
		}
		while (roots.hasNext()) {
			EObject inner = roots.next();
			if (inner instanceof TextEditorModel) {
				if (EcoreUtil.equals(((TextEditorModel) inner).getEditedObject(), context)) {
					return true;
				}
			}
		}
		return false;
	}
}
