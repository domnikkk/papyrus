/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.handlers;

import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.controlmode.ControlModeManager;
import org.eclipse.papyrus.controlmode.helper.LabelHelper;
import org.eclipse.papyrus.controlmode.interfaces.IControlModeManager;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.controlmode.ui.CreateModelFragmentDialog;
import org.eclipse.papyrus.modelexplorer.handler.AbstractModelExplorerHandler;
import org.eclipse.papyrus.ui.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.swt.widgets.Display;

/**
 * Handler used to control an element
 * 
 * @author adaussy
 * 
 */
public class ControlCommandHandler extends AbstractModelExplorerHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<EObject> selection = getCurrentSelectionAdaptedToType(event, EObject.class);
		if(selection == null || selection.isEmpty() || selection.size() > 1) {
			NotificationBuilder.createInfoPopup("Nothing to control").run();
			return null;
		}
		EObject eObjectToControl = selection.get(0);
		CreateModelFragmentDialog dialog = new CreateModelFragmentDialog(Display.getCurrent().getActiveShell(), eObjectToControl.eResource(), getDefaultLabelResource(eObjectToControl));
		if(dialog.open() == Dialog.OK) {
			ControlModeRequest controlRequest = ControlModeRequest.createUIControlModelRequest(getEditingDomain(), eObjectToControl, dialog.getURI());
			IControlModeManager controlMng = ControlModeManager.getInstance();
			ICommand controlCommand = controlMng.getControlCommand(controlRequest);
			getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(controlCommand));
		}
		return null;
	}

	/**
	 * Compute a default name for the new resource
	 * TODO plug in naming strategy
	 * 
	 * @param eObject
	 * @return
	 */
	protected String getDefaultLabelResource(EObject eObject) {
		String defaultName = null;
		EStructuralFeature feature = eObject.eClass().getEStructuralFeature("name");
		if(feature != null) {
			Object eGet = eObject.eGet(feature);
			if(eGet instanceof String) {
				defaultName = (String)eGet;
			}
		}
		if(defaultName == null) {
			LabelHelper.getPrettyLabel(eObject);
			Pattern p = Pattern.compile("<<.*>>");
			defaultName = p.matcher(defaultName).replaceAll("");
		}
		StringBuilder b = new StringBuilder();
		for(Character c : defaultName.toCharArray()) {
			if(Character.isJavaIdentifierPart(c)) {
				b.append(c);
			} else {
				b.append("_");
			}
		}
		return b.toString();
	}
}
