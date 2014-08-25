/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.properties.databinding;

import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheetReference;

/**
 *
 * Command to remove all styleSheets from the resource.
 *
 * @author Mickael ADAM
 *
 */
public class RemoveAllModelStyleSheetValueCommand extends RecordingCommand {

	/** The values. */
	private Collection<?> values;

	/** The resource. */
	private Resource resource;

	/** The domain. */
	private TransactionalEditingDomain domain;

	/**
	 * Constructor.
	 *
	 * @param domain
	 *            the domain
	 * @param resource
	 *            the resource
	 * @param values
	 *            the values
	 */
	public RemoveAllModelStyleSheetValueCommand(TransactionalEditingDomain domain, Resource resource, Collection<?> values) {
		super(domain);
		this.resource = resource;
		this.values = values;
		this.domain = domain;
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	public void doExecute() {
		for (Object value : values) {
			if (value instanceof StyleSheetReference) {
				StyleSheetReference styleSheet = (StyleSheetReference) value;

				// Create a request to delete the styleSheet
				DestroyElementRequest request = new DestroyElementRequest(domain, styleSheet, false);
				// Get the command to delete the styleSheet
				DestroyElementCommand command = new DestroyElementCommand(request);
				try {
					// execute command
					command.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
