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
 *  Benoit Maggi benoit.maggi@cea.fr  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.ecore.dialog;

import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.uml.diagram.ecore.helper.UmlToEcoreOptionHelper;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * This class is used instead of  org.eclipse.uml2.examples.uml.ui.dialogs.UML2EcoreConverterOptionsDialog
 * so that control code can be refactor in a helper and shared between dialog and wizardPage 
 * 
 * @author Benoit Maggi
 *
 */
public class PapyrusUML2EcoreConverterOptionsDialog extends MessageDialog {

	protected Map<String, String> options;

	public PapyrusUML2EcoreConverterOptionsDialog(Shell parent, String title, String message, Map<String, String> options) {
		super(parent, title, null, message, QUESTION, new String[]{ IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL }, 0);
		this.options = options;
	}

	@Override
	protected Control createCustomArea(Composite parent) {
		UmlToEcoreOptionHelper umlToEcoreOptionHelper = new UmlToEcoreOptionHelper(options);
		return umlToEcoreOptionHelper.createControl(parent);
	}
}
