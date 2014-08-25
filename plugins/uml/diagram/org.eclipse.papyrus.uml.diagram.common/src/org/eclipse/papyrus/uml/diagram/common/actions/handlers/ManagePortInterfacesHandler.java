/*****************************************************************************
 * Copyright (c) 2009-2011 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and  implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.actions.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.util.DisplayUtils;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.uml.diagram.common.Messages;
import org.eclipse.papyrus.uml.diagram.common.dialogs.IPortInterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.common.dialogs.InterfaceManagerDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * This handler provides the action to manage the provided and required {@link Interface} for a {@link Port}.
 */
public class ManagePortInterfacesHandler extends AbstractHandler {

	/** The port edit part. */
	private EditPart portEditPart = null;


	/**
	 * Instantiates a new manage port interfaces handler.
	 */
	public ManagePortInterfacesHandler() {
		super();
	}

	/**
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// Do something only if there is a selection
		if (selection.isEmpty()) {
			return null;
		}

		// Handle structured selection
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			// Verify if selection is an EditPart
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof EditPart) {
				portEditPart = (EditPart) firstElement;

				// Verify if semantic element is a Port
				EObject selectedElement = EMFHelper.getEObject(portEditPart);
				if (selectedElement instanceof Port) {
					Port port = (Port) selectedElement;

					// Run action
					ManageProvidedInterfaceAction action = new ManageProvidedInterfaceAction(port);
					try {
						ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(port).getCommandStack().execute(new GEFtoEMFCommandWrapper(action.getCommand()));
					} catch (ServiceException ex) {
						throw new ExecutionException("An unexpected exception occurred", ex);
					}
				}
			}
		}

		return null;
	}

	/**
	 * Gets the interface manager dialog.
	 * <p>
	 * Default implementation returns {@link InterfaceManagerDialog}.
	 * </p>
	 *
	 * @param port
	 *            the port
	 * @return the interface manager dialog
	 */
	public IPortInterfaceManagerDialog getInterfaceManagerDialog(Port port) {
		return new InterfaceManagerDialog(DisplayUtils.getDefaultShell(), port);
	}

	/**
	 * Gets the port edit part.
	 *
	 * @return the port edit part
	 */
	protected EditPart getPortEditPart() {
		return portEditPart;
	}

	/**
	 * This class provides the action to manage the provided and required interfaces.
	 */
	public class ManageProvidedInterfaceAction {

		/** the {@link Port}. */
		private Port port = null;

		/** the {@link Type} of the port. */
		private Type type = null;

		/**
		 *
		 * Constructor.
		 *
		 * @param editpart
		 *            the editpart of the port
		 */
		public ManageProvidedInterfaceAction(Port port) {
			this.port = port;
			this.type = port.getType();
		}

		/**
		 * Returns the command to add/remove provided/required interfaces.
		 *
		 * @return the command
		 *         the command to add/remove provided/required interfaces
		 */
		public Command getCommand() {
			if (type != null && !(type instanceof Classifier)) {
				return UnexecutableCommand.INSTANCE;
			} else if (type == null) {
				// Display message if Port type is undefined
				MessageDialog dialog = new MessageDialog(DisplayUtils.getDefaultShell(), Messages.InterfaceManagerDialog_Title, null, Messages.ManageProvidedInterfacesHandler_TheTypeOfThePortIsNotDefined, MessageDialog.WARNING,
						new String[] { Messages.ManageProvidedInterfacesHandler_OK }, 0);
				dialog.open();

			} else {

				// Launch manager
				IPortInterfaceManagerDialog dialog = getInterfaceManagerDialog(port);
				if (dialog.open() == Window.OK) {
					return dialog.getCommand();
				}
			}
			return UnexecutableCommand.INSTANCE;
		}
	}

}
