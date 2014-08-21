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
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.css.properties.databinding;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * Command to add a object to the resource.
 *
 * @author Mickael ADAM
 */
public class AddModelStyleSheetCommand extends RecordingCommand {

	/** The resource. */
	private Resource resource;

	/** The object. */
	private EObject object;

	/**
	 * Instantiates a new adds the model style sheet command.
	 *
	 * @param domain
	 *            the domain
	 * @param resource
	 *            the resource
	 * @param object
	 *            the object
	 */
	public AddModelStyleSheetCommand(TransactionalEditingDomain domain, Resource resource, EObject object) {
		super(domain);
		this.resource = resource;
		this.object = object;
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */

	@Override
	public void doExecute() {
		resource.getContents().add(object);
	}
}
