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
 * The handler used for the merge of all the cells inside each selected rows
 *
 * @author QL238289
 *
 */
public class MergeSelectedRowsHandler extends AbstractMergeHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// the command to contain all the merge updates
		final CompositeCommand mergeCommand = new CompositeCommand("Merge/UnMerge the cells in each selected rows"); //$NON-NLS-1$
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
		// the array of selected rows
		int[] selectedRows = bodyLayerStack.getSelectionLayer().getFullySelectedRowPositions();
		// the list of selected rows' indexes
		List<Integer> selectedRs = ArrayUtil.asIntegerList(selectedRows);
		// the list of previously merged rows' indexes
		int idex = 0;
		List<Integer> mergedRows = new ArrayList<Integer>();
		// for(IAxis currentAxis : manager.getTable().getCurrentRowAxisProvider().getAxis()) {
		// the currentAxisProvider lists the axis independently of the invertedAxis boolean,
		// therefore if the table is inverted it wont see the merge boolean of the axis as it will only see the boolean of the other axis
		for (Object currentObject : manager.getRowElementsList()) {
			if (currentObject instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
				if (axisToMerge != null && axisToMerge.isBooleanValue()) {
					mergedRows.add(idex);
				}
				idex++;
			}
		}
		// if (mergedRows.size() > 0)
		// isMerged = true;


		// looks inside the axis and updates or creates the merge boolean of the selected axis
		if (!isMerged || (isMerged && !selectedRs.equals(mergedRows))) {
			List<IAxis> selectedRowAxis = new ArrayList<IAxis>();
			for (int index : selectedRows) {
				Object currentRowObject = getCurrentNattableModelManager().getRowElement(index);
				if (currentRowObject instanceof IAxis) {
					IAxis currentRowIAxis = (IAxis) currentRowObject;
					if (currentRowIAxis.eContainer() != null) {
						selectedRowAxis.add(currentRowIAxis);
						BooleanValueStyle isSelected = (BooleanValueStyle) currentRowIAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
						if (isSelected != null) {
							SetRequest mergeRowRequest = new SetRequest(tableDomain, isSelected, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), true);
							SetValueCommand mergeRowCommand = new SetValueCommand(mergeRowRequest);
							mergeCommand.add(mergeRowCommand);

						} else {
							isSelected = NattablestyleFactory.eINSTANCE.createBooleanValueStyle();
							isSelected.setBooleanValue(true);
							isSelected.setName(NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
							SetRequest initRowMergeRequest = new SetRequest(tableDomain, currentRowIAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), isSelected);
							SetValueCommand mergeRowCommand = new SetValueCommand(initRowMergeRequest);
							mergeCommand.add(mergeRowCommand);
						}
					}
				}
			}

			// if the user wants to merge another selection instead of the previous one then the merge booleans must be updated
			if (!selectedRs.equals(mergedRows)) {
				for (int sel : mergedRows) {
					// if an axis were previously selected but not anymore
					if (!selectedRs.contains(sel)) {
						if (manager.getRowElement(sel) instanceof IAxis) {
							IAxis toUnMerge = (IAxis) manager.getRowElement(sel);
							BooleanValueStyle isSelected = (BooleanValueStyle) toUnMerge.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
							// test to be sure but this element should already have the style and have its value to true
							if (isSelected != null) {
								SetRequest mergeRowRequest = new SetRequest(tableDomain, isSelected, NattablestylePackage.eINSTANCE.getBooleanValueStyle_BooleanValue(), false);
								SetValueCommand mergeRowCommand = new SetValueCommand(mergeRowRequest);
								mergeCommand.add(mergeRowCommand);
							}
						}
					}
				}
				// resets the merge booleans if the user has not selected at least one full row
				if (selectedRs.size() == 0) {
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
