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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.nebula.widgets.nattable.util.ArrayUtil;
import org.eclipse.papyrus.infra.nattable.layerstack.BodyLayerStack;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * The handler used for the merge of all the cells inside each selected columns
 *
 * @author QL238289
 *
 */
public class MergeSelectedColumnsHandler extends AbstractMergeHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// the command to contain all the merge updates
		final CompositeCommand mergeCommand = new CompositeCommand("Merge/UnMerge the cells in each selected columns"); //$NON-NLS-1$
		// the domain of the currently used table
		TransactionalEditingDomain tableDomain = getTableEditingDomain();
		// the layer of the table used to identify the selected rows
		BodyLayerStack bodyLayerStack = getCurrentNattableModelManager().getBodyLayerStack();
		// necessary to identify which merge option should be activated
		final String commandId = event.getCommand().getId();
		// this boolean indicates if the currently chosen merge option is to be a merge or an unMerge
		boolean isMerged = HandlerUtil.toggleCommandState(event.getCommand());
		// get the table's manager in order to browse through the axis
		INattableModelManager manager = getCurrentNattableModelManager();
		// the array of selected columns
		int[] selectedColumns = bodyLayerStack.getSelectionLayer().getFullySelectedColumnPositions();
		// the list of selected columns' indexes
		List<Integer> selectedCs = ArrayUtil.asIntegerList(bodyLayerStack.getSelectionLayer().getFullySelectedColumnPositions());
		// the list of previously merged columns' indexes
		int idex = 0;
		List<Integer> mergedColumns = new ArrayList<Integer>();
		// for(IAxis currentAxis : manager.getTable().getCurrentColumnAxisProvider().getAxis()) {
		// the currentAxisProvider lists the axis independently of the invertedAxis boolean,
		// therefore if the table is inverted it wont see the merge boolean of the axis as it will only see the boolean of the other axis
		for (Object currentObject : manager.getColumnElementsList()) {
			if (currentObject instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
				if (axisToMerge != null && axisToMerge.isBooleanValue()) {
					mergedColumns.add(idex);
				}
				idex++;
			}
		}
		// if (mergedColumns.size() > 0)
		// isMerged = true;


		// looks inside the axis and updates or creates the merge boolean of the selected axis
		if (!isMerged || (isMerged && !selectedCs.equals(mergedColumns))) {
			List<IAxis> selectedColumnAxis = new ArrayList<IAxis>();
			for (int index : selectedColumns) {
				Object currentColumnObject = getCurrentNattableModelManager().getColumnElement(index);
				if (currentColumnObject instanceof IAxis) {
					IAxis currentColumnIAxis = (IAxis) currentColumnObject;
					if (currentColumnIAxis.eContainer() != null) {
						selectedColumnAxis.add(currentColumnIAxis);
						BooleanValueStyle isSelected = (BooleanValueStyle) currentColumnIAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
						if (isSelected != null) {
							SetRequest mergeColumnRequest = new SetRequest(tableDomain, isSelected, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), true);
							SetValueCommand mergeColumnCommand = new SetValueCommand(mergeColumnRequest);
							mergeCommand.add(mergeColumnCommand);

						} else {
							isSelected = NattablestyleFactory.eINSTANCE.createBooleanValueStyle();
							isSelected.setBooleanValue(true);
							isSelected.setName(NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
							SetRequest initColumnMergeRequest = new SetRequest(tableDomain, currentColumnIAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), isSelected);
							SetValueCommand mergeColumnCommand = new SetValueCommand(initColumnMergeRequest);
							mergeCommand.add(mergeColumnCommand);
						}
					}
				}
			}

			// if the user wants to merge another selection instead of the previous one then the merge booleans must be updated
			if (!selectedCs.equals(mergedColumns)) {
				for (int sel : mergedColumns) {
					// if an axis were previously selected but not anymore
					if (!selectedCs.contains(sel)) {
						if (manager.getColumnElement(sel) instanceof IAxis) {
							IAxis toUnMerge = (IAxis) manager.getColumnElement(sel);
							BooleanValueStyle isSelected = (BooleanValueStyle) toUnMerge.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
							// test to be sure but this element should already have the style and have its value to true
							if (isSelected != null) {
								SetRequest mergeColumnRequest = new SetRequest(tableDomain, isSelected, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
								SetValueCommand mergeColumnCommand = new SetValueCommand(mergeColumnRequest);
								mergeCommand.add(mergeColumnCommand);
							}
						}
					}
				}
				// resets the merge booleans if the user has not selected at least one full column
				if (selectedCs.size() == 0) {
					updateAxisSpanBooleans(commandId, mergeCommand);
				}
			}

		} else {
			// resets the axis merge booleans
			updateAxisSpanBooleans(commandId, mergeCommand);
		}

		// apply the changes to the model
		executeMergeCommands(mergeCommand, tableDomain);

		return null;
	}

}
