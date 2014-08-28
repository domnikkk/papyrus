/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.synchronizeview.editpolicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.synchronizeview.customization.ISynchroSemanticChild;
import org.eclipse.papyrus.uml.diagram.synchronizeview.customization.SynchroSemanticChildRegistry;
import org.eclipse.uml2.uml.Element;

/**
 * this edit policy is used to allowing synchronization between graphical element and element in the model
 * It is based on canonical editpolicy but it has several differencies:
 * - View Service cannot be called. To call it we need to get the identifier of the child that could be place in compartment. I is not possible to
 * find in a generic way
 * --> link to each Diagram Updater, and moreover some child has been created by custom code. In fact, the hierarchy of visual element must follow the
 * hierachy of semantic element.
 * --> this is not the case so the Diagram updater generated from the gmfgen has not the good info.
 * To allow the creation we base our work on the mechanism of the drop.
 */
public class SynchronizeViewEditPolicy extends CanonicalEditPolicy {

	ISynchroSemanticChild synchroSemanticChild = null;

	EObject derivedSemanticHost = null;

	@Override
	public void activate() {
		super.activate();
		synchroSemanticChild = SynchroSemanticChildRegistry.getInstance().getSynchroSemanticChild(getHost().getClass());
		if (synchroSemanticChild != null) {
			derivedSemanticHost = synchroSemanticChild.getSemanticEObjectToListen((getSemanticHost()));
			if (derivedSemanticHost != null) {
				addListenerFilter("SYNCHRONIZE", this, derivedSemanticHost);
			}
		}
	}

	@Override
	public boolean isEnabled() {
		// by default there is no synchronization
		if (getCanonicalStyle() == null) {
			return false;
		}
		return super.isEnabled();
	}

	@Override
	protected List<EObject> getSemanticChildrenList() {
		ArrayList<EObject> result = new ArrayList<EObject>();
		Class<? extends EditPart> EditPart = getHost().getClass();
		ISynchroSemanticChild synchroSemanticChild = SynchroSemanticChildRegistry.getInstance().getSynchroSemanticChild(EditPart);
		if (synchroSemanticChild != null) {
			ArrayList<EObject> ancestor = getAllEObjectAncestor();
			List<EObject> tmplist = (synchroSemanticChild.getSynchroSemanticChild((getSemanticHost())));
			for (Iterator<EObject> iterator = tmplist.iterator(); iterator.hasNext();) {
				EObject eObject = iterator.next();
				if (ancestor.contains(eObject)) {
					return Collections.emptyList();
				}
			}
			return tmplist;
		}
		if (getSemanticHost() instanceof Element) {
			result.addAll(((Element) getSemanticHost()).getOwnedElements());
			return result;
		}

		return result;
	}


	/**
	 * This method is used to calculate if a semantic element has been already display in parent to avoid loop of display
	 *
	 * @return the list of all semantic element display by parents edipart.
	 */
	protected ArrayList<EObject> getAllEObjectAncestor() {
		ArrayList<EObject> ancestor = new ArrayList<EObject>();
		EditPart currentEditPart = getHost();
		if (currentEditPart.getModel() instanceof View) {
			ancestor.add(((View) currentEditPart.getModel()).getElement());
		}
		while (currentEditPart.getParent() != null) {
			currentEditPart = currentEditPart.getParent();
			if (currentEditPart.getModel() instanceof View) {
				ancestor.add(((View) currentEditPart.getModel()).getElement());
			}
		}
		return ancestor;

	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		if (synchroSemanticChild != null) {
			if (derivedSemanticHost == null && (synchroSemanticChild.getSemanticEObjectToListen((getSemanticHost())) != null)) {
				derivedSemanticHost = synchroSemanticChild.getSemanticEObjectToListen((getSemanticHost()));
				addListenerFilter("SYNCHRONIZE", this, derivedSemanticHost);
			}
		}
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy#refreshSemantic()
	 *      In order to connect the drop mechanism this method has be overloaded
	 */
	@Override
	protected void refreshSemantic() {
		List<IAdaptable> createdViews = refreshSemanticChildrenByDrop();
		makeViewsImmutable(createdViews);
	}

	/**
	 * this method is extracted from refreshSemanticChildren
	 * but instead of using the service view it uses the drop
	 *
	 * @return
	 */
	protected List<IAdaptable> refreshSemanticChildrenByDrop() {
		// -------------- code from superClass----------------
		// Don't try to refresh children if the semantic element
		// cannot be resolved.
		if (resolveSemanticElement() == null) {
			return Collections.emptyList();
		}

		// current views
		List<View> viewChildren = getViewChildren();
		List<EObject> semanticChildren = new ArrayList<EObject>(getSemanticChildrenList());

		List<View> orphaned = cleanCanonicalSemanticChildren(viewChildren, semanticChildren);
		boolean changed = false;
		//
		// delete all the remaining orphaned views
		if (!orphaned.isEmpty()) {
			changed = deleteViews(orphaned.iterator());
		}

		//
		// create a view for each remaining semantic element.
		List<IAdaptable> createdViews = Collections.emptyList();
		if (!semanticChildren.isEmpty()) {
			createdViews = createViews(semanticChildren);
		}

		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}


		return createdViews;
	}

	@Override
	protected Command getCreateViewCommand(CreateRequest request) {
		// transform the request to drop request
		if (request instanceof CreateViewRequest) {
			CreateViewRequest createViewRequest = (CreateViewRequest) request;
			createViewRequest.getViewDescriptors();

			CompoundCommand compoundCommand = new CompoundCommand();
			for (Iterator<? extends ViewDescriptor> iterator = createViewRequest.getViewDescriptors().iterator(); iterator.hasNext();) {
				ViewDescriptor viewDescriptor = iterator.next();
				EObject element = (EObject) viewDescriptor.getElementAdapter().getAdapter(EObject.class);

				if (element != null) {
					ArrayList<EObject> elementToDrop = new ArrayList<EObject>();
					elementToDrop.add(element);
					DropObjectsRequest dropRequest = new DropObjectsRequest();
					dropRequest.setObjects(elementToDrop);
					dropRequest.setLocation(createViewRequest.getLocation());

					Command cmd = getHost().getCommand(dropRequest);
					if (cmd != null && cmd.canExecute()) {
						compoundCommand.add(cmd);
					}
				}

			}
			return compoundCommand;

		}
		Command cmd = super.getCreateViewCommand(request);

		return cmd;
	}

	@Override
	protected boolean shouldDeleteView(View view) {
		// in order to avoid duplication of views allow deleting of edges
		if (view instanceof Edge && view.getElement() == null) {

			return true;
		}
		// it is managed by the service edit.
		return false;
	}


	@SuppressWarnings("unchecked")
	@Override
	protected List<View> getViewChildren() {
		List<View> children = super.getViewChildren();
		children.addAll(((GraphicalEditPart) getHost()).getNotationView().getDiagram().getEdges());
		return children;
	}

}
