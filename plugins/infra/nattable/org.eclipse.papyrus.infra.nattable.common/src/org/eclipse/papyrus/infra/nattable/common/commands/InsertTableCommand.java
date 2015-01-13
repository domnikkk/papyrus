/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.common.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;


/**
 * Insert a table with the specified owner
 */
public class InsertTableCommand extends RecordingCommand {

	/** FIXME the domain of Recording command should be accessible */
	protected TransactionalEditingDomain transactionalEditingDomain;

	/** table to be inserted */
	protected Table table;

	/** owner of the table */
	protected EObject owner;

	/**
	 * @param transactionalEditingDomain
	 * @param label
	 * @param table
	 *            to be inserted
	 * @param owner
	 *            of the table
	 */
	public InsertTableCommand(TransactionalEditingDomain transactionalEditingDomain, String label, Table table, EObject owner) {
		super(transactionalEditingDomain, label);
		this.transactionalEditingDomain = transactionalEditingDomain;
		this.owner = owner;
		this.table = table;
	}

	/*
	 * (non-Javadoc)
	 * <<<<<<< HEAD
	 *
	 * =======
	 *
	 * >>>>>>> refs/heads/master
	 *
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		Resource targetResource = NotationUtils.getNotationResourceForDiagram(owner, transactionalEditingDomain);
		table.setOwner(owner);
		if (targetResource != null) {
			targetResource.getContents().add(table);
		}
	}
}
