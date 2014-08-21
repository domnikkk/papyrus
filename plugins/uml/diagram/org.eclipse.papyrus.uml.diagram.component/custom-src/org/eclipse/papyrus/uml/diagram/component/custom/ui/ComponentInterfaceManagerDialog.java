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
 *  Patrick Tessier (CEA LIST) - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.custom.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.EObjectValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.uml.diagram.common.Messages;
import org.eclipse.papyrus.uml.diagram.common.dialogs.ExtendedSelectionEditor;
import org.eclipse.papyrus.uml.diagram.common.dialogs.InterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.common.dialogs.NewElementRepresentation;
import org.eclipse.papyrus.uml.diagram.common.dialogs.SelectionEditorWrapper;
import org.eclipse.papyrus.uml.diagram.component.custom.command.CreateLollipopPortCommand;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PortEditPart;
import org.eclipse.papyrus.uml.diagram.component.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;

/**
 * This interface is used to displayed required and provided interfaces
 *
 */
public class ComponentInterfaceManagerDialog extends InterfaceManagerDialog {

	protected HashSet<Object> displayedRequiredInterfacesList = new HashSet<Object>();

	protected HashSet<Object> displayedProvidedInterfacesList = new HashSet<Object>();

	protected PortEditPart portEditPart = null;

	protected HashMap<Interface, GraphicalEditPart> initialList = new HashMap<Interface, GraphicalEditPart>();

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 * @param portEditPart
	 */
	public ComponentInterfaceManagerDialog(Shell parentShell, PortEditPart portEditPart) {
		super(parentShell, (Port) portEditPart.resolveSemanticElement());
		this.portEditPart = portEditPart;
		setSelectorLabelProvider(new DisplayedSelectorLabelProvider());
		initDisplayInterfaceList();
	}

	/**
	 * init the collection to detect displayed interfaces
	 */
	protected void initDisplayInterfaceList() {

		if ((portEditPart.getSourceConnections().size() > 0)) {

			for (Object currentConnection : portEditPart.getSourceConnections()) {
				ConnectionEditPart connection = (ConnectionEditPart) currentConnection;
				EObjectValueStyle valueStyle = (EObjectValueStyle) ((View) connection.getModel()).getStyle(NotationPackage.eINSTANCE.getEObjectValueStyle());
				if (valueStyle != null) {
					if (valueStyle.getName().equals("REQUIRED")) {
						displayedRequiredInterfacesList.add(((GraphicalEditPart) connection.getTarget()).resolveSemanticElement());
					} else {
						displayedProvidedInterfacesList.add(((GraphicalEditPart) connection.getTarget()).resolveSemanticElement());
					}
					initialList.put((Interface) ((GraphicalEditPart) connection.getTarget()).resolveSemanticElement(), ((GraphicalEditPart) connection.getTarget()));

				}
			}
		}

	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.dialogs.InterfaceManagerDialog#getCommand()
	 *
	 * @return
	 */
	@Override
	public Command getCommand() {
		CompoundCommand cmd = new CompoundCommand();
		Command supCmd = super.getCommand();
		if (supCmd.canExecute()) {
			cmd.add(super.getCommand());
		}
		cmd.add(createDisplayedInterfaceCommand());
		return cmd;
	}

	@Override
	protected void createEditors() {
		Composite parent = (Composite) getDialogArea();
		Composite subComposite = new Composite(parent, SWT.NONE);

		subComposite.setLayout(new FormLayout());
		// createDisplay button
		Button Displaybutton = new Button(subComposite, SWT.PUSH);
		Displaybutton.setText("Display seletected Interface");
		DisplayInterfaceListener displayInterfaceListener = new DisplayInterfaceListener();
		Displaybutton.addSelectionListener(displayInterfaceListener);


		FormData formData = new FormData();
		formData.left = new FormAttachment(0, 700);
		Displaybutton.setLayoutData(formData);

		// create Remove
		Button RemoveDisplaybutton = new Button(subComposite, SWT.PUSH);
		RemoveDisplaybutton.setText(" Do not Display selected Interface");
		RemoveDisplayInterfaceListener removeDisplayInterfaceListener = new RemoveDisplayInterfaceListener();
		RemoveDisplaybutton.addSelectionListener(removeDisplayInterfaceListener);

		formData = new FormData();
		formData.left = new FormAttachment(0, 500);
		RemoveDisplaybutton.setLayoutData(formData);

		super.createEditors();
	}

	/**
	 *
	 * @return the command that will be used to display interfaces
	 */
	protected Command createDisplayedInterfaceCommand() {
		// Update list from initial List
		HashMap<Object, GraphicalEditPart> viewToRemove = new HashMap<Object, GraphicalEditPart>();
		HashSet<Object> requiredInterfaceToDisplay = new HashSet<Object>();
		HashSet<Object> providedInterfaceToDisplay = new HashSet<Object>();
		// create the list of provided interface to display
		for (Object currentInterface : displayedProvidedInterfacesList) {
			if (!initialList.keySet().contains(currentInterface)) {
				providedInterfaceToDisplay.add(currentInterface);
			}
		}
		// create the list of required interface to display
		for (Object currentInterface : displayedRequiredInterfacesList) {
			if (!initialList.keySet().contains(currentInterface)) {
				requiredInterfaceToDisplay.add(currentInterface);
			}
		}
		// create the list of interface to not display
		for (Interface currentInterface : initialList.keySet()) {
			if ((!displayedRequiredInterfacesList.contains(currentInterface)) && (!displayedProvidedInterfacesList.contains(currentInterface))) {
				viewToRemove.put(currentInterface, initialList.get(currentInterface));
			}
		}

		CompoundCommand cmd = new CompoundCommand();
		CreateLollipopPortCommand comd = new CreateLollipopPortCommand(this.portEditPart.getEditingDomain(), providedInterfaceToDisplay, requiredInterfaceToDisplay, this.portEditPart);
		cmd.add(new org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper(comd));
		if (viewToRemove.values().size() > 0) {
			cmd.add(deleteDisplayInterface(viewToRemove.values()));
		}
		return cmd;
	}

	@Override
	protected SelectionEditorWrapper createEditor(Composite parent, IElementSelector selector, String message, boolean withCreateButton, SelectionListener listener, List<Object> initialSelection) {
		ExtendedSelectionEditor editor = new ExtendedSelectionEditor(parent, selector, getSelectorLabelProvider(), initialSelection);
		editor.setMessage(message);
		editor.setAdditionalButton(withCreateButton, Messages.InterfaceManagerDialog_CreateNewInterface, listener);
		return new SelectionEditorWrapper(editor, editor.getClass());
	}

	/**
	 * @param editPartToRemove
	 *            list of editpart that represents displayed interfaces, never null
	 * @return the command of interface representation to remove, never null
	 */
	protected Command deleteDisplayInterface(Collection<GraphicalEditPart> editPartToRemove) {
		CompoundCommand cmd = new CompoundCommand();
		Request deleteViewRequest = new GroupRequest(RequestConstants.REQ_DELETE);


		for (GraphicalEditPart editPart : editPartToRemove) {
			cmd.add(editPart.getCommand(deleteViewRequest));
		}

		return cmd;
	}

	/**
	 * inner to class attached to a button to display interfaces
	 *
	 */
	class DisplayInterfaceListener extends SelectionAdapter {

		@Override
		public void widgetSelected(SelectionEvent event) {
			IStructuredSelection selection = (IStructuredSelection) getProvidedEditor().getSelection();
			for (Object o : selection.toArray()) {

				displayedProvidedInterfacesList.add(o);
			}


			selection = (IStructuredSelection) getRequiredEditor().getSelection();
			for (Object o : selection.toArray()) {
				displayedRequiredInterfacesList.add(o);
			}
			getProvidedEditor().refresh();
			getRequiredEditor().refresh();
		}

	}

	/**
	 * inner to class attached to a button to remove displayed interfaces
	 *
	 */
	class RemoveDisplayInterfaceListener extends SelectionAdapter {

		@Override
		public void widgetSelected(SelectionEvent event) {

			// Handle provided interfaces selection
			IStructuredSelection structuredSelection = (IStructuredSelection) getProvidedEditor().getSelection();
			for (Object selection : structuredSelection.toArray()) {
				displayedProvidedInterfacesList.remove(selection);
			}

			// Handle required interfaces selection
			structuredSelection = (IStructuredSelection) getRequiredEditor().getSelection();
			for (Object o : structuredSelection.toArray()) {

				displayedRequiredInterfacesList.remove(o);
			}

			// Refresh both list
			getProvidedEditor().refresh();
			getRequiredEditor().refresh();
		}

	}


	/**
	 *
	 * This class provides a CustomLabelProvider for this dialog.
	 * This class manages the {@link NewElementRepresentation} and consider them like Interfaces
	 *
	 *
	 */
	public class DisplayedSelectorLabelProvider extends SelectorLabelProvider {

		private static final String ICONS_OBJ16_LOLLIPOP_GIF = "icons/obj16/lollipop.gif"; //$NON-NLS-1$

		/**
		 * @see org.eclipse.papyrus.uml.diagram.component.custom.ui.InterfaceManagerDialog.CreateElementLabelProvider#getImage(java.lang.Object)
		 *
		 * @param element
		 * @return
		 */
		@Override
		public Image getImage(Object element) {

			if (displayedRequiredInterfacesList.contains(element) || displayedProvidedInterfacesList.contains(element)) {
				return org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(UMLDiagramEditorPlugin.ID, ICONS_OBJ16_LOLLIPOP_GIF);
			}
			return super.getImage(element);
		}

	}
}
