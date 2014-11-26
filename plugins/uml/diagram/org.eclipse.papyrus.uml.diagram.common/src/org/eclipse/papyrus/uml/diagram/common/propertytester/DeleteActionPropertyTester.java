/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.propertytester;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.resource.IReadOnlyHandler2;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.readonly.ReadOnlyManager;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.NotationHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.ServiceUtilsForEditPart;

import com.google.common.base.Optional;

/**
 * Property tester to enable different delete actions in Diagram.
 * 
 * @author Gabriel Pascual
 *
 */
public class DeleteActionPropertyTester extends PropertyTester {

	/** The Constant SEMANTIC_DELETION_PROPERTY. */
	private static final String SEMANTIC_DELETION_PROPERTY = "isSemanticDeletion"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	public DeleteActionPropertyTester() {
		super();
	}

	/**
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 *
	 * @param receiver
	 * @param property
	 * @param args
	 * @param expectedValue
	 * @return
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (SEMANTIC_DELETION_PROPERTY.equals(property)) {
			return expectedValue.equals(isSemanticDeletion((IGraphicalEditPart) receiver));
		}

		return false;
	}

	/**
	 * Checks if is semantic deletion.
	 *
	 * @param editPart
	 *            the edit part
	 * @return true, if is semantic deletion
	 */
	private boolean isSemanticDeletion(IGraphicalEditPart editPart) {
		boolean isSemanticDeletion = false;
		TransactionalEditingDomain editingDomain = null;

		// Get Editing Domain
		try {
			editingDomain = ServiceUtilsForEditPart.getInstance().getTransactionalEditingDomain(editPart);
		} catch (ServiceException e) {

		}

		if (editingDomain != null) {

			IReadOnlyHandler2 readOnly = ReadOnlyManager.getReadOnlyHandler(editingDomain);
			EObject semantic = EMFHelper.getEObject(editPart);
			View graphical = NotationHelper.findView(editPart);

			isSemanticDeletion = !(semantic == null || semantic == graphical || semantic.eContainer() == null);


			if (isSemanticDeletion && readOnly != null) {

				// Get URIs
				List<URI> uris = new LinkedList<URI>();
				uris.add(EcoreUtil.getURI(semantic));

				if (graphical != null) {
					uris.add(EcoreUtil.getURI(graphical));
				}

				// Verify RO properties
				Optional<Boolean> result = readOnly.anyReadOnly(ReadOnlyAxis.anyAxis(), uris.toArray(new URI[uris.size()]));
				isSemanticDeletion = !(result.isPresent() && result.get());

			}
		}


		return isSemanticDeletion;
	}
}
