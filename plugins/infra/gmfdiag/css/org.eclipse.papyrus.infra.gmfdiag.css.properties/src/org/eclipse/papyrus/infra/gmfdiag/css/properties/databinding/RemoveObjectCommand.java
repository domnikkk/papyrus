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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * 
 * Command to remove an EObject from its containing resource and/or its containing object.
 * 
 * @author Mickael ADAM
 *
 */
public class RemoveObjectCommand extends RecordingCommand {


	/** The object. */
	private EObject object;

	/** The domain. */
	private TransactionalEditingDomain domain;

	/**
	 * Constructor.
	 *
	 * @param domain
	 *        the domain
	 * @param object
	 *        the object
	 */
	public RemoveObjectCommand(TransactionalEditingDomain domain, EObject object) {
		super(domain);
		this.domain = domain;
		this.object = object;
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		// Create a request to delete the object
		DestroyElementRequest request = new DestroyElementRequest((TransactionalEditingDomain)domain, (EObject)object, false);
		// Get the command to delete the object
		DestroyElementCommand command = new DestroyElementCommand(request);
		try {
			//execute command
			command.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
