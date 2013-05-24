/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.actions.internal.DeleteFromDiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.IDeleteFromDiagramProvider;
import org.eclipse.papyrus.ui.toolbox.notification.Type;
import org.eclipse.papyrus.ui.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.uml2.uml.NamedElement;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * Command handler for delete from diagram
 */
public class DeleteFromDiagramCommandHandler extends GraphicalCommandHandler implements IHandler {

	/**
	 * ID of extension point used to override the delete from diagram command
	 */
	private static final String DELETE_FROM_DIAGRAM_EXT_POINT = "org.eclipse.papyrus.diagram.common.deleteFromDiagramProvider";

	public DeleteFromDiagramCommandHandler() {
	}

	/**
	 * Store all provider used to override this command
	 */
	private static List<IDeleteFromDiagramProvider> deleteProvider = new ArrayList<IDeleteFromDiagramProvider>();
	
	static {
		IConfigurationElement[] confs = Platform.getExtensionRegistry().getConfigurationElementsFor(DELETE_FROM_DIAGRAM_EXT_POINT);
		List<DeleteFromDiagramProviderWrapper> extension = new ArrayList<DeleteFromDiagramCommandHandler.DeleteFromDiagramProviderWrapper>();
		for(IConfigurationElement conf : confs) {
			try {
				Object impl = conf.createExecutableExtension("impl");
				String priority = conf.getAttribute("priority");
				int p = 0;
				try {
					p = Integer.valueOf(priority);
				} catch (NumberFormatException e) {
					p = -1;
				}
				if(impl instanceof IDeleteFromDiagramProvider) {
					extension.add(new DeleteFromDiagramProviderWrapper((IDeleteFromDiagramProvider)impl, p));
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		Collections.sort(extension, new Comparator<DeleteFromDiagramProviderWrapper>() {

			public int compare(DeleteFromDiagramProviderWrapper o1, DeleteFromDiagramProviderWrapper o2) {
				return  Integer.valueOf(o1.priority).compareTo(Integer.valueOf(o2.priority)) * -1;
			}
		});
		deleteProvider = Lists.transform(extension, new Function<DeleteFromDiagramProviderWrapper, IDeleteFromDiagramProvider>() {

			public IDeleteFromDiagramProvider apply(DeleteFromDiagramProviderWrapper from) {
				return from.provider;
			}
		});
	}

	/**
	 * Wrapper used to sort {@link IDeleteFromDiagramProvider}
	 * @author adaussy
	 *
	 */
	private static class DeleteFromDiagramProviderWrapper {

		public IDeleteFromDiagramProvider provider;

		public int priority;

		public DeleteFromDiagramProviderWrapper(IDeleteFromDiagramProvider provider, int priority) {
			super();
			this.provider = provider;
			this.priority = priority;
		}
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.diagram.common.handlers.GraphicalCommandHandler#getCommand()
	 * 
	 * @return the deletion command
	 * @throws ExecutionException
	 */
	protected Command getCommand() throws ExecutionException {
		// Retrieve currently selected IGraphicalEditPart(s)
		List<IGraphicalEditPart> editParts = getSelectedElements();
		if(editParts.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}
		if(!supportViews(editParts) || isCanonical(editParts)) {
			//notify user that Deletion is impossible
			CompositeCommand cc = new CompositeCommand("Deletation impossible command");////$NON-NLS-1$
			for(final IGraphicalEditPart c : editParts) {
				ListIterator<IDeleteFromDiagramProvider> providerIterator = deleteProvider.listIterator();
				ICommand cmd = new AbstractTransactionalCommand((TransactionalEditingDomain)AdapterFactoryEditingDomain.getEditingDomainFor(c.resolveSemanticElement()), "test", null) {

					@Override
					protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						EObject element = ((IGraphicalEditPart)c).resolveSemanticElement();
						EObject owner = element.eContainer();
						if(element != null && owner != null && owner instanceof NamedElement) {
							String elementLabel = getNameForElement(element);
							String ownerName = getNameForElement(owner);
							StringBuilder label = new StringBuilder("The element ");
							NotificationBuilder popup = new NotificationBuilder().setAsynchronous(true).setTemporary(true).setMessage(label.append(elementLabel).append(" can be deleted because it synchronized with the element ").append(ownerName).toString()).setType(Type.INFO);
							popup.run();
							return CommandResult.newCancelledCommandResult();
						}
						return CommandResult.newCancelledCommandResult();
					}

					/**
					 * @param element
					 * @return
					 */
					protected String getNameForElement(EObject element) {
						String elementLabel;
						if(element instanceof NamedElement) {
							elementLabel = ((NamedElement)element).getName();
						} else {
							elementLabel = "of type" + element.eClass().getName();
						}
						return elementLabel;
					}
				};
				cc.compose(cmd);
			}
			return new ICommandProxy(cc);
		}
		CompositeTransactionalCommand cc  = null;
		for(Iterator<IGraphicalEditPart> iter = editParts.iterator(); iter.hasNext();) {
			
			IGraphicalEditPart editPart = iter.next();
			ICommand cmd = null;
			ListIterator<IDeleteFromDiagramProvider> providerIterator = deleteProvider.listIterator();
			while(cmd == null && providerIterator.hasNext()){
				IDeleteFromDiagramProvider next = providerIterator.next();
				cmd = next.getCommand(editPart);
			}
			if (cmd == null){
				cmd = new CommandProxy(editPart.getCommand(new GroupRequest(RequestConstants.REQ_DELETE)));
			}
			if (cc == null){
				cc = new CompositeTransactionalCommand(editPart.getEditingDomain(), "Delete from diagram handler");
			}
			/* Send the request to the edit part */
			cc.compose(cmd);
		}
		return new ICommandProxy(cc);
	}

	/**
	 * Copied from {@link DeleteFromDiagramAction}
	 */
	private boolean supportViews(List<IGraphicalEditPart> editParts) {
		for(Iterator<IGraphicalEditPart> iter = editParts.iterator(); iter.hasNext();) {
			IGraphicalEditPart object = iter.next();
			if(object instanceof GraphicalEditPart && !((GraphicalEditPart)object).hasNotationView()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Copied from {@link DeleteFromDiagramAction}
	 */
	protected boolean isCanonical(List<IGraphicalEditPart> editParts) {
		boolean isCanonical = false;
		if(!editParts.isEmpty()) {
			for(Iterator<IGraphicalEditPart> si = editParts.iterator(); si.hasNext() && !isCanonical;) {
				IGraphicalEditPart child = si.next();
				View view = (View)child.getAdapter(View.class);
				if(view == null || view.getElement() == null || view.getElement() instanceof View) {
					// If there is no element or the element is a view (e.g.
					// diagram
					// link) than we want to support delete from diagram. See
					// bugzilla#148453.
					isCanonical = false;
					continue;
				}
				if(child instanceof ConnectionEditPart) {
					ConnectionEditPart connection = (ConnectionEditPart)child;
					isCanonical = (!connection.isSemanticConnection());
				} else {
					isCanonical = isCanonical(child);
				}
			}
		}
		return isCanonical;
	}

	/**
	 * Copied from {@link DeleteFromDiagramAction}
	 */
	protected boolean isCanonical(EditPart ep) {
		EObject eObject = (EObject)ep.getAdapter(EObject.class);
		EditPart parent = ep.getParent();
		if(eObject != null && parent != null) { // sanity checks
			CanonicalEditPolicy cep = (CanonicalEditPolicy)parent.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
			return cep != null && cep.isEnabled() && cep.canCreate(eObject);
		}
		return false;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
