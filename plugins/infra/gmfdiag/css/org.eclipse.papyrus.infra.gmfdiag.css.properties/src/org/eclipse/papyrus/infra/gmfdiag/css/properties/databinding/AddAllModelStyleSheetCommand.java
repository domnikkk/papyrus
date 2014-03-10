/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mickaël Adam (ALL4TEC) mickael.adam@all4tec.net - Initial API and implementation
 *  
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.css.properties.databinding;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.ModelStyleSheets;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheet;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsPackage;

/**
 * Add stylesheet's model Command.
 *
 * @author Mickael ADAM
 */
public class AddAllModelStyleSheetCommand extends RecordingCommand {

	/** The resource. */
	private Resource resource;

	/** The values. */
	private Collection<?> values;

	/**
	 * Constructor.
	 *
	 * @param domain
	 *        the domain
	 * @param resource
	 *        the resource
	 * @param values
	 *        the values
	 */
	public AddAllModelStyleSheetCommand(TransactionalEditingDomain domain, Resource resource, Collection<?> values) {
		super(domain);
		this.resource = resource;
		this.values = values;
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	public void doExecute() {

		//Get the model styleSheet on the resource
		Object modelStyleSheetObject = EcoreUtil.getObjectByType(resource.getContents(), StylesheetsPackage.Literals.MODEL_STYLE_SHEETS);

		//For each styleSheet
		for(Object styleSheetRef : values) {
			//Add it to the modelStyleSheet
			((ModelStyleSheets)modelStyleSheetObject).getStylesheets().add((StyleSheet)styleSheetRef);
		}
		//Add the modelStyleSheet to the resource
		resource.getContents().add(((ModelStyleSheets)modelStyleSheetObject));
	}
}
