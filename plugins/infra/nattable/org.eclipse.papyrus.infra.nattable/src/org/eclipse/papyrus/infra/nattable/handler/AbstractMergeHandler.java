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
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.handler;

import java.util.List;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.command.CommandIds;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;

/**
 * The Abstract handler used for the merge actions
 *
 * @author QL238289
 *
 */
public abstract class AbstractMergeHandler extends AbstractTableHandler {

	/**
	 *
	 * Apply the merge option (all rows / all columns) to the table
	 *
	 * @param mergeCommand
	 * @param tableDomain
	 *
	 */
	protected void executeMergeCommands(CompositeCommand mergeCommand, TransactionalEditingDomain tableDomain) {
		if (!mergeCommand.isEmpty()) {
			tableDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(mergeCommand));
		}
	}


	/**
	 *
	 * Resets the Table's merge booleans if any would conflict with the selected merge options
	 *
	 * @param commandId
	 * @param mergeCommand
	 */
	protected void updateTableSpanBooleans(String commandId, CompositeCommand mergeCommand) {
		TransactionalEditingDomain tableDomain = getTableEditingDomain();
		BooleanValueStyle mergeRows = (BooleanValueStyle) HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(getTable())
				.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_ROWS);
		BooleanValueStyle mergeColumns = (BooleanValueStyle) HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(getTable())
				.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_COLUMNS);

		if (mergeRows != null && mergeRows.isBooleanValue() && !commandId.equals(CommandIds.COMMAND_MERGE_ROWS)) {
			SetRequest mergeRowRequest = new SetRequest(tableDomain, mergeRows, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
			SetValueCommand mergeRowCommand = new SetValueCommand(mergeRowRequest);
			mergeCommand.add(mergeRowCommand);
		}
		if (mergeColumns != null && mergeColumns.isBooleanValue() && !commandId.equals(CommandIds.COMMAND_MERGE_COLUMNS)) {
			SetRequest mergeColumnRequest = new SetRequest(tableDomain, mergeColumns, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
			SetValueCommand mergeColumnCommand = new SetValueCommand(mergeColumnRequest);
			mergeCommand.add(mergeColumnCommand);
		}
	}


	/**
	 *
	 * Resets the Axis' merge booleans if any were not in the current selection of the merge option
	 *
	 * @param commandId
	 * @param mergeCommand
	 */
	protected void updateAxisSpanBooleans(String commandId, CompositeCommand mergeCommand) {
		TransactionalEditingDomain tableDomain = getTableEditingDomain();
		List<IAxis> rowIAxisList = getTable().getCurrentRowAxisProvider().getAxis();
		List<IAxis> columnIAxisList = getTable().getCurrentColumnAxisProvider().getAxis();

		for (IAxis currentAxis : rowIAxisList) {
			BooleanValueStyle mergeRowBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
			BooleanValueStyle mergeColumnBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
			if (mergeRowBoolean != null && mergeRowBoolean.isBooleanValue() && !getTable().isInvertAxis()) {
				SetRequest mergeRowBooleanRequest = new SetRequest(tableDomain, mergeRowBoolean, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
				SetValueCommand mergeRowBooleanCommand = new SetValueCommand(mergeRowBooleanRequest);
				mergeCommand.add(mergeRowBooleanCommand);
			}
			if (mergeColumnBoolean != null && mergeColumnBoolean.isBooleanValue() && getTable().isInvertAxis()) {
				SetRequest mergeColumnBooleanRequest = new SetRequest(tableDomain, mergeColumnBoolean, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
				SetValueCommand mergeColumnBooleanCommand = new SetValueCommand(mergeColumnBooleanRequest);
				mergeCommand.add(mergeColumnBooleanCommand);
			}
		}
		for (IAxis currentAxis : columnIAxisList) {
			BooleanValueStyle mergeColumnBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
			BooleanValueStyle mergeRowBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
			if (mergeColumnBoolean != null && mergeColumnBoolean.isBooleanValue() && !getTable().isInvertAxis()) {
				SetRequest mergeColumnBooleanRequest = new SetRequest(tableDomain, mergeColumnBoolean, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
				SetValueCommand mergeColumnBooleanCommand = new SetValueCommand(mergeColumnBooleanRequest);
				mergeCommand.add(mergeColumnBooleanCommand);
			}
			if (mergeRowBoolean != null && mergeRowBoolean.isBooleanValue() && getTable().isInvertAxis()) {
				SetRequest mergeRowBooleanRequest = new SetRequest(tableDomain, mergeRowBoolean, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
				SetValueCommand mergeRowBooleanCommand = new SetValueCommand(mergeRowBooleanRequest);
				mergeCommand.add(mergeRowBooleanCommand);
			}
		}
	}

}
