/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.menu.utils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
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
 * Utility class to manage delete action in GMF Diagram context.
 * 
 * @author Gabriel Pascual
 *
 */
public final class DeleteActionUtil {

	/**
	 * Instantiates a new delete action util.
	 */
	private DeleteActionUtil() {

	}

	/**
	 * Checks if is semantic deletion.
	 *
	 * @param editPart
	 *            the edit part
	 * @return true, if is semantic deletion
	 */
	public static boolean isSemanticDeletion(IGraphicalEditPart editPart) {
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

	/**
	 * Gets the delete from model command.
	 *
	 * @param editPart
	 *            the edit part
	 * @param editingDomain
	 *            the editing domain
	 * @return the delete from model command
	 */
	public static Command getDeleteFromModelCommand(IGraphicalEditPart editPart, TransactionalEditingDomain editingDomain) {
		// Look for the GMF deletion command
		return editPart.getCommand(new EditCommandRequestWrapper(new DestroyElementRequest(false)));

	}

	/**
	 * Gets the delete from diagram command.
	 *
	 * @param editPart
	 *            the edit part
	 * @return the delete from diagram command
	 */
	public static Command getDeleteFromDiagramCommand(IGraphicalEditPart editPart) {
		return editPart.getCommand(new GroupRequest(RequestConstants.REQ_DELETE));
	}

	/**
	 * Copied from {@link org.eclipse.gmf.runtime.diagram.ui.actions.internal.DeleteFromDiagramAction}.
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.internal.DeleteFromDiagramAction
	 * @param editParts
	 *            the edit parts
	 * @return true, if is canonical
	 */
	public static boolean isCanonical(List<IGraphicalEditPart> editParts) {

		boolean isCanonical = false;
		if (!editParts.isEmpty()) {

			for (Iterator<IGraphicalEditPart> si = editParts.iterator(); si.hasNext() && !isCanonical;) {
				IGraphicalEditPart child = si.next();

				isCanonical = isCanonicalView(child);
				if (isCanonical) {
					isCanonical = isCanonicalEditPart(child);
				} else {
					// If there is no element or the element is a view (e.g.
					// diagram
					// link) than we want to support delete from diagram. See
					// Bug 148453.
					continue;
				}

			}
		}
		return isCanonical;
	}


	/**
	 * Checks if is canonical edit part.
	 *
	 * @param editPart
	 *            the edit part
	 * @return true, if is canonical edit part
	 */
	public static boolean isCanonicalEditPart(IGraphicalEditPart editPart) {
		boolean isCanonical = false;
		if (editPart instanceof ConnectionEditPart) {
			ConnectionEditPart connection = (ConnectionEditPart) editPart;
			isCanonical = (!connection.isSemanticConnection() || (isCanonical(connection.getSource()) && isCanonical(connection.getTarget())));
		} else {
			isCanonical = isCanonical(editPart);
		}

		return isCanonical;

	}

	/**
	 * Copied from {@link DeleteFromDiagramAction}.
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.internal.DeleteFromDiagramAction
	 * @param editParts
	 *            the edit parts
	 * @return true, if is support view
	 */
	public static boolean isSupportView(List<IGraphicalEditPart> editParts) {
		boolean isSupportted = true;
		for (Iterator<IGraphicalEditPart> iter = editParts.iterator(); isSupportted && iter.hasNext();) {
			IGraphicalEditPart object = iter.next();
			isSupportted = isSupportView(object);
		}
		return isSupportted;
	}

	/**
	 * Checks if is support view.
	 *
	 * @param object
	 *            the object
	 * @return true, if is support view
	 */
	public static boolean isSupportView(IGraphicalEditPart object) {
		return !(object instanceof GraphicalEditPart && !((GraphicalEditPart) object).hasNotationView());

	}

	/**
	 * Checks if is not canonical view.
	 *
	 * @param editpart
	 *            the editpart
	 * @return true, if is not canonical view
	 */
	public static boolean isCanonicalView(IGraphicalEditPart editpart) {
		View view = (View) editpart.getAdapter(View.class);
		return view != null || view.getElement() != null || !(view.getElement() instanceof View);
	}

	/**
	 * Copied from {@link DeleteFromDiagramAction}.
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.internal.DeleteFromDiagramAction
	 * @param editPart
	 *            the edit part
	 * @return true, if is canonical
	 */
	public static boolean isCanonical(EditPart editPart) {
		boolean isCanonical = false;
		EObject eObject = EMFHelper.getEObject(editPart);
		EditPart parent = editPart.getParent();
		if (eObject != null && parent != null) { // sanity checks
			CanonicalEditPolicy canonicalEditPolicy = (CanonicalEditPolicy) parent.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
			isCanonical = canonicalEditPolicy != null && canonicalEditPolicy.isEnabled() && canonicalEditPolicy.canCreate(eObject);
		}
		return isCanonical;
	}
}
