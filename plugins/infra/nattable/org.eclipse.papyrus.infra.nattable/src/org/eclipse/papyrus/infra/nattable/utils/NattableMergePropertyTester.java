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

package org.eclipse.papyrus.infra.nattable.utils;

import java.util.HashMap;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * The property tester used to enable or disable the merge options in the merge menu of the table
 *
 * @author QL238289
 *
 */
public class NattableMergePropertyTester extends PropertyTester {

	@Override
	public boolean test(final Object receiver, final String property, final Object[] args, final Object expectedValue) {
		// the map used to quickly identify the merge states of the table
		HashMap<String, Boolean> mergeMap = new HashMap<String, Boolean>();
		// the manager of the table
		INattableModelManager manager = getNattableModelManager();
		// the row Headers where the merge booleans concerning the allRows and allColumns merges and their values
		AbstractHeaderAxisConfiguration rowHeader = HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(manager.getTable());
		AbstractHeaderAxisConfiguration columnHeader = HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(manager.getTable());
		BooleanValueStyle rowsMerge = (BooleanValueStyle) rowHeader.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_ROWS);
		BooleanValueStyle columnsMerge = (BooleanValueStyle) columnHeader.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_COLUMNS);
		// the booleans concerning the merge of selected rows or columns
		boolean selectedRowsMerge = getToMergeRowBoolean();
		boolean selectedColumnsMerge = getToMergeColumnBoolean();
		// BooleanValueStyle tableMerge = (BooleanValueStyle)manager.getTable().getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGETABLE);


		// fills out the map in order to avoid having to check for the existence/value of the merge boolean
		if (rowsMerge != null) {
			mergeMap.put(NamedStyleConstants.MERGE_ROWS, rowsMerge.isBooleanValue());
		} else {
			mergeMap.put(NamedStyleConstants.MERGE_ROWS, false);
		}
		if (columnsMerge != null) {
			mergeMap.put(NamedStyleConstants.MERGE_COLUMNS, columnsMerge.isBooleanValue());
		} else {
			mergeMap.put(NamedStyleConstants.MERGE_COLUMNS, false);
		}
		if (selectedRowsMerge) {
			mergeMap.put(NamedStyleConstants.MERGE_SELECTED_ROWS, selectedRowsMerge);
		} else {
			mergeMap.put(NamedStyleConstants.MERGE_SELECTED_ROWS, false);
		}
		if (selectedColumnsMerge) {
			mergeMap.put(NamedStyleConstants.MERGE_SELECTED_COLUMNS, selectedColumnsMerge);
		} else {
			mergeMap.put(NamedStyleConstants.MERGE_SELECTED_COLUMNS, false);
		}
		// if(tableMerge != null) {
		// mergeMap.put(NamedStyleConstants.MERGE_TABLE, tableMerge.isBooleanValue());
		// } else {
		// mergeMap.put(NamedStyleConstants.MERGE_TABLE, false);
		// }

		// verify the availability of each merge option in order to allow the activation of its associated handler
		if (getNattableModelManager() != null && expectedValue instanceof Boolean) {
			if (NamedStyleConstants.MERGE_ROWS.equals(property)) {
				if (!tableMerged(mergeMap)) {
					return true;
				} else {
					return mergeMap.get(NamedStyleConstants.MERGE_ROWS);
				}
			} else if (NamedStyleConstants.MERGE_COLUMNS.equals(property)) {
				if (!tableMerged(mergeMap)) {
					return true;
				} else {
					return mergeMap.get(NamedStyleConstants.MERGE_COLUMNS);
				}
			} else if (NamedStyleConstants.MERGE_SELECTED_ROWS.equals(property)) {
				if (!tableMerged(mergeMap)) {
					return true;
				} else {
					return mergeMap.get(NamedStyleConstants.MERGE_SELECTED_ROWS);
				}
			} else if (NamedStyleConstants.MERGE_SELECTED_COLUMNS.equals(property)) {
				if (!tableMerged(mergeMap)) {
					return true;
				} else {
					return mergeMap.get(NamedStyleConstants.MERGE_SELECTED_COLUMNS);
				}
				// } else if(NamedStyleConstants.MERGE_TABLE.equals(property)) {
				// if(!tableMerged(mergeMap)) {
				// return true;
				// } else {
				// return mergeMap.get(NamedStyleConstants.MERGE_TABLE);
				// }
			}
		}
		return false;
	}

	/**
	 *
	 * @return
	 *         the current nattable model manager or <code>null</code> if not found
	 */
	protected INattableModelManager getNattableModelManager() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPart current = null;
		if (workbench != null) {
			final IWorkbenchWindow activeWorkbench = workbench.getActiveWorkbenchWindow();
			if (activeWorkbench != null) {
				final IWorkbenchPage activePage = activeWorkbench.getActivePage();
				if (activePage != null) {
					current = activePage.getActivePart();
				}
			}
		}

		if (current != null) {
			return (INattableModelManager) current.getAdapter(INattableModelManager.class);
		}
		return null;
	}

	/**
	 *
	 * Identifies if the table is already merged or not
	 *
	 */
	protected boolean tableMerged(HashMap<String, Boolean> mergeMap) {
		// verify if none of the merge options are active, all must then be available (restrictions to false)
		// if(!mergeMap.get(NamedStyleConstants.MERGE_ROWS) && !mergeMap.get(NamedStyleConstants.MERGE_COLUMNS) && !mergeMap.get(NamedStyleConstants.MERGE_SELECTED_ROWS)
		// && !mergeMap.get(NamedStyleConstants.MERGE_SELECTED_COLUMNS) && !mergeMap.get(NamedStyleConstants.MERGE_TABLE)) {
		if (!mergeMap.get(NamedStyleConstants.MERGE_ROWS) && !mergeMap.get(NamedStyleConstants.MERGE_COLUMNS) && !mergeMap.get(NamedStyleConstants.MERGE_SELECTED_ROWS) && !mergeMap.get(NamedStyleConstants.MERGE_SELECTED_COLUMNS)) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 *
	 * @return
	 *         the boolean indicating that some row axis are to be merged in the selection
	 */
	protected boolean getToMergeRowBoolean() {
		// for(IAxis currentAxis : getNattableModelManager().getTable().getCurrentRowAxisProvider().getAxis()) {
		for (Object currentObject : getNattableModelManager().getRowElementsList()) {
			if (currentObject instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
				if (axisToMerge != null && axisToMerge.isBooleanValue()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * @return
	 *         the boolean indicating that some column axis are to be merged in the selection
	 */
	protected boolean getToMergeColumnBoolean() {
		// for(IAxis currentAxis : getNattableModelManager().getTable().getCurrentColumnAxisProvider().getAxis()) {
		for (Object currentObject : getNattableModelManager().getColumnElementsList()) {
			if (currentObject instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
				if (axisToMerge != null && axisToMerge.isBooleanValue()) {
					return true;
				}
			}
		}
		return false;
	}

}
