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
package org.eclipse.papyrus.uml.diagram.ecore.wizard;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.uml.diagram.ecore.helper.UmlToEcoreOptionHelper;
import org.eclipse.swt.widgets.Composite;

/**
 * wizard page to export all diagram from a Papyrus model
 */
public class ConvertToEcoreWizardPage extends WizardPage {

	protected Map<String, String> options;

	protected final Map<String, String> choiceLabels = new HashMap<String, String>();

	/**
	 * Create the wizard.
	 */
	public ConvertToEcoreWizardPage(Map<String, String> options) {
		super("Convert Uml to Ecore");
		setTitle("Convert Uml to Ecore");
		setDescription("Convert Uml to Ecore");
		this.options = options;
	}

	/**
	 * Create contents of the wizard.
	 *
	 * @param parent
	 */
	public void createControl(Composite parent) {
		UmlToEcoreOptionHelper umlToEcoreOptionHelper = new UmlToEcoreOptionHelper(options);
		Composite container = umlToEcoreOptionHelper.createControl(parent);
		setControl(container);
	}
}
