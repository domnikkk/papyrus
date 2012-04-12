/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Olivier Melois (ATOS) olivier.melois@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.table.helpers;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.widgets.nattable.instance.tableinstance2.TableInstance2;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.core.adaptor.gmf.MoveOpenableCommand;
import org.eclipse.papyrus.table.instance.papyrustableinstance.PapyrusTableInstance;
import org.eclipse.papyrus.uml.service.types.utils.ElementUtil;

/**
 * Helper used to move the tables into the right resources when controlling a package.
 */
public class TableMoveHelper {

	/**
	 * Adds commands to move every table that descend from the selection to the target resource.
	 */
	public static void addAllTableMoveCommands(EditingDomain domain, EObject selection, Resource target, CompoundCommand commandToModify) {
		/*
		 * All the tables in the tables that descend from the selection.
		 */
		Iterable<EObject> allDescendingPapyrusTables = ElementUtil.createDescendantTablesIterable(selection);

		/*
		 * Making sure the editing domain is transactional.
		 */
		if(!(domain instanceof TransactionalEditingDomain)) {
			throw new RuntimeException("Unable to retrieve the transactional editing domain");////$NON-NLS-1$
		}
		TransactionalEditingDomain editingDomain = (TransactionalEditingDomain)domain;

		/*
		 * Moving every table from the new resource.
		 */
		for(EObject descendant : allDescendingPapyrusTables) {
			if(descendant instanceof PapyrusTableInstance) {
				PapyrusTableInstance papyrusTable = (PapyrusTableInstance)descendant;
				addMoveTableCommand(editingDomain, papyrusTable, target, commandToModify);
			}
		}
	}


	/**
	 * Adds a command to move a papyrus table and the matching table2 instance, to the compound command.
	 */
	protected static void addMoveTableCommand(TransactionalEditingDomain editingDomain, PapyrusTableInstance papyrusTable, Resource target, CompoundCommand commandToModify) {
		//The command has to move both the table and its table2.
		TableInstance2 papyrusTable2 = papyrusTable.getTable();

		/*
		 * Has the target resource been loaded, and is it in read only mode ?
		 */
		if(editingDomain.isReadOnly(target)) {
			return;
		}

		/*
		 * Moving both the table instance and the table2 instance.
		 */
		if(target != null) {
			MoveOpenableCommand mvTabCmd = new MoveOpenableCommand(editingDomain, "moving table", papyrusTable, target);//$NON-NLS-1$
			if(mvTabCmd != null && mvTabCmd.canExecute()) {
				commandToModify.append(new GMFtoEMFCommandWrapper(mvTabCmd));
			}

			MoveOpenableCommand mvTab2Cmd = new MoveOpenableCommand(editingDomain, "moving table2", papyrusTable2, target);//$NON-NLS-1$
			if(mvTab2Cmd != null && mvTab2Cmd.canExecute()) {
				commandToModify.append(new GMFtoEMFCommandWrapper(mvTab2Cmd));
			}
		}
	}

}
