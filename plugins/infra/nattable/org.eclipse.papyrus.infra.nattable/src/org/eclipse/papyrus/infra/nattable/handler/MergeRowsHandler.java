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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * The handler used for the merge of all the cells inside each row
 *
 * @author QL238289
 *
 */
public class MergeRowsHandler extends AbstractMergeHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// the command to contain all the merge updates
		final CompositeCommand mergeCommand = new CompositeCommand("Merge/UnMerge the cells in all the rows"); //$NON-NLS-1$
		//		final CompositeCommand createLocalHeaderCommand = new CompositeCommand("Creates the local header if none previously exists"); //$NON-NLS-1$
		// the domain of the currently used table
		TransactionalEditingDomain tableDomain = getTableEditingDomain();
		// necessary to identify which merge option should be activated
		final String commandId = event.getCommand().getId();
		// this boolean indicates if the currently chosen merge option is to be a merge or an unMerge
		boolean isMerged = HandlerUtil.toggleCommandState(event.getCommand());
		// the header currently used in the table
		AbstractHeaderAxisConfiguration rowHeaderUsedInTable = HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(getTable());
		// the necessary merge boolean value
		BooleanValueStyle mergeRows = (BooleanValueStyle) rowHeaderUsedInTable.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_ROWS);


		// identify if the merge boolean was already created and updates it, if not creates it and set its value
		if (mergeRows != null) {
			if (mergeRows.isBooleanValue()) {
				SetRequest mergeRowRequest = new SetRequest(tableDomain, mergeRows, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
				SetValueCommand mergeRowCommand = new SetValueCommand(mergeRowRequest);
				mergeCommand.add(mergeRowCommand);
			} else {
				SetRequest mergeRowRequest = new SetRequest(tableDomain, mergeRows, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), true);
				SetValueCommand mergeRowCommand = new SetValueCommand(mergeRowRequest);
				mergeCommand.add(mergeRowCommand);
			}
		} else {
			// check if the header used is a local or the default, i.e. the TableHeaderAxisConfiguration, and if so create it
			if (rowHeaderUsedInTable instanceof TableHeaderAxisConfiguration) {
				// Creates the local row header if none already exists in the table
				rowHeaderUsedInTable = HeaderAxisConfigurationManagementUtils.transformToLocalHeaderConfiguration((TableHeaderAxisConfiguration) rowHeaderUsedInTable);
				EStructuralFeature localHeaderFeature = NattablePackage.eINSTANCE.getTable_LocalRowHeaderAxisConfiguration();

				IEditCommandRequest initLocalRowHeaderAxis = new SetRequest(tableDomain, getTable(), localHeaderFeature, rowHeaderUsedInTable);
				IElementEditService localRowHeaderAxisProvider = ElementEditServiceUtils.getCommandProvider(getTable());
				mergeCommand.add(localRowHeaderAxisProvider.getEditCommand(initLocalRowHeaderAxis));
			}

			mergeRows = NattablestyleFactory.eINSTANCE.createBooleanValueStyle();
			mergeRows.setBooleanValue(true);
			mergeRows.setName(NamedStyleConstants.MERGE_ROWS);
			SetRequest mergeRowRequest = new SetRequest(tableDomain, rowHeaderUsedInTable, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), mergeRows);
			SetValueCommand mergeRowCommand = new SetValueCommand(mergeRowRequest);
			mergeCommand.add(mergeRowCommand);
		}

		// checks if the mergeColumns option was already selected and, if so, switch its boolean to false as mergeRows is activated to true
		if (!isMerged) {
			// resets the table merge booleans if any were to conflict with the current choice
			updateTableSpanBooleans(commandId, mergeCommand);
		}

		// apply the changes to the model
		executeMergeCommands(mergeCommand, tableDomain);

		return null;
	}

}
