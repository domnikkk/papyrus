/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.tree.command.TreeCollapseAllCommand;
import org.eclipse.nebula.widgets.nattable.tree.command.TreeExpandAllCommand;
import org.eclipse.nebula.widgets.nattable.tree.command.TreeExpandCollapseCommand;
import org.eclipse.papyrus.infra.nattable.manager.table.ITableAxisElementProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.provider.TableStructuredSelection;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;
import org.eclipse.papyrus.infra.tools.util.SelectionHelper;

/**
 * This class is not in API.
 */
public class CollapseExpandActionHelper {

	/**
	 *
	 * Constructor.
	 *
	 */
	private CollapseExpandActionHelper() {
		// to prevent instanciation
	}

	/**
	 * This method is not in the API.
	 *
	 * @param actionId
	 *            the id of the action to do
	 * @param axisProvider
	 *            the table axis provider
	 * @param natTable
	 *            the natTable widget
	 */
	public static final void doCollapseExpandAction(CollapseAndExpandActionsEnum actionId, List<ITreeItemAxis> selectedAxis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		switch (actionId) {
		case EXPAND_ALL:
			natTable.doCommand(new TreeExpandAllCommand());
			return;
		case COLLAPSE_ALL:
			natTable.doCommand(new TreeCollapseAllCommand());
			return;
		default:
			break;
		}

		if (selectedAxis == null) {
			doCollapseExpandActionOnSelection(actionId, axisProvider, natTable);
		} else {
			doCollapseExpandActionOnChoosenRows(actionId, selectedAxis, axisProvider, natTable);
		}


	}

	/**
	 *
	 * This method does the wanted action according to the current selection of the table
	 *
	 * @param actionId
	 *            the id of the action to do
	 * @param axisProvider
	 *            the table axis provider
	 * @param natTable
	 *            the natTable widget
	 */
	private static final void doCollapseExpandActionOnSelection(CollapseAndExpandActionsEnum actionId, ITableAxisElementProvider axisProvider, NatTable natTable) {
		switch (actionId) {
		case COLLAPSE_ALL_FROM_SELECTION:
			collapseAllFromSelectedRows(axisProvider, natTable);
			return;
		case COLLAPSE_ONE_LEVEL:
			collapseSelectedRows(axisProvider, natTable);
			return;
		case EXPAND_TWO_LEVEL:
			expandOn2LevelsSelectedRows(axisProvider, natTable);
			return;
		case EXPAND_ALL_FROM_SELECTION:
			expandAllFromSelectedRows(axisProvider, natTable);
			return;
		case EXPAND_ONE_LEVEL:
			expandFromSelectedRows(axisProvider, natTable);
			return;
		case EXPAND_TO_NODE:
			// nothing to do
			return;
		default:
			return;
		}
	}

	/**
	 *
	 * This method does the wanted action according to the @param selectedRows
	 *
	 * @param actionId
	 *            the id of the action to do
	 * @param selectedRows
	 *            the rows on which the action must be done
	 * @param axisProvider
	 *            the table axis provider
	 * @param natTable
	 *            the natTable widget
	 */
	private static final void doCollapseExpandActionOnChoosenRows(CollapseAndExpandActionsEnum actionId, List<ITreeItemAxis> selectedRows, ITableAxisElementProvider axisProvider, NatTable natTable) {
		switch (actionId) {
		case COLLAPSE_ALL_FROM_SELECTION:
			collapseAllRows(selectedRows, axisProvider, natTable);
			break;
		case COLLAPSE_ONE_LEVEL:
			collapseRows(selectedRows, axisProvider, natTable);
			break;
		case EXPAND_ALL_FROM_SELECTION:
			expandAllRows(selectedRows, axisProvider, natTable);
			break;
		case EXPAND_ONE_LEVEL:
			expandRows(selectedRows, axisProvider, natTable);
			break;
		case EXPAND_TO_NODE:
			expandToRows(selectedRows, axisProvider, natTable);
			break;
		case EXPAND_TWO_LEVEL:
			expandOn2LevelsRows(selectedRows, axisProvider, natTable);
			break;
		default:
			break;
		}
	}

	/**
	 * This method allows to expand the selected rows on 2 levels
	 *
	 * @param natTable
	 *
	 */
	private static final void expandOn2LevelsRows(List<ITreeItemAxis> axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		List<ITreeItemAxis> toExpand = new ArrayList<ITreeItemAxis>();
		for (ITreeItemAxis current : axis) {

			toExpand.add(current);
			if (!current.isExpanded() && current.getChildren().size() > 0) {
				int index = axisProvider.getRowElementsList().indexOf(current);
				if (index != -1) {
					natTable.doCommand(new TreeExpandCollapseCommand(index));
				}
			}
		}
		for (ITreeItemAxis current : toExpand) {
			for (ITreeItemAxis child : current.getChildren()) {
				if (!child.isExpanded() && child.getChildren().size() > 0) {
					int index = axisProvider.getRowElementsList().indexOf(child);
					if (index != -1) {
						natTable.doCommand(new TreeExpandCollapseCommand(index));
					}
				}
			}
		}
	}

	/**
	 *
	 * @param axis
	 * @param axisProvider
	 * @param natTable
	 */
	private static final void expandRows(List<ITreeItemAxis> axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (ITreeItemAxis current : axis) {
			if (!current.isExpanded()) {
				int index = axisProvider.getRowElementsList().indexOf(current);
				if (index != -1) {
					natTable.doCommand(new TreeExpandCollapseCommand(index));
				}
			}
		}
	}

	/**
	 *
	 * @param axis
	 * @param axisProvider
	 * @param natTable
	 */
	private static final void expandAllRows(List<ITreeItemAxis> axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (ITreeItemAxis current : axis) {
			expandFullBranch(current, axisProvider, natTable);
		}
	}

	/**
	 *
	 * @param axis
	 * @param axisProvider
	 * @param natTable
	 */
	private static final void collapseAllRows(List<ITreeItemAxis> axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (ITreeItemAxis current : axis) {
			if (current.isExpanded()) {
				collapseFullBranch((ITreeItemAxis) axis, axisProvider, natTable);
			}
		}
	}

	/**
	 * @param axis
	 *            the list of axis to collapse
	 * @param natTable
	 *
	 */
	private static final void collapseRows(List<ITreeItemAxis> axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (ITreeItemAxis current : axis) {
			int index = axisProvider.getRowElementsList().indexOf(axis);
			if (index != -1 && current.isExpanded()) {
				natTable.doCommand(new TreeExpandCollapseCommand(index));
			}
		}
	}

	/**
	 *
	 * This method expands parents of nodes to display these nodes in the table
	 *
	 * @param axis
	 *            a list of axis to show in the table
	 * @param axisProvider
	 *            an axis provider
	 * @param natTable
	 *            the natTable widget
	 */
	private static final void expandToRows(List<ITreeItemAxis> axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (ITreeItemAxis current : axis) {
			expandToNode(current, axisProvider, natTable);
		}
	}

	/**
	 * This action expands the parents axis of the axis, in order to display it
	 *
	 * @param axis
	 *            an axis
	 * @param axisProvider
	 *            the axis provider of the table
	 * @param natTable
	 *            the natTable widget
	 */
	private static final void expandToNode(ITreeItemAxis axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		List<ITreeItemAxis> axisToExpand = new ArrayList<ITreeItemAxis>();
		ITreeItemAxis parent = axis.getParent();
		while (parent != null) {
			if (!parent.isExpanded()) {
				axisToExpand.add(parent);
			}
			parent = parent.getParent();
		}
		for (ITreeItemAxis current : axisToExpand) {
			int index = axisProvider.getRowElementsList().indexOf(current);
			natTable.doCommand(new TreeExpandCollapseCommand(index));
		}
	}

	/**
	 * this method allows to collapse the selection
	 *
	 * @param natTable
	 *
	 */
	private static final void collapseSelectedRows(ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (Entry<Integer, Object> current : getFullySelectedRows().entrySet()) {
			Object value = current.getValue();
			if (value instanceof ITreeItemAxis) {
				ITreeItemAxis axis = (ITreeItemAxis) value;
				if (axis.isExpanded()) {
					natTable.doCommand(new TreeExpandCollapseCommand(current.getKey()));
				}
			}
		}
	}

	/**
	 * this method allows to expand the selection
	 *
	 * @param natTable
	 *
	 */
	private static final void expandFromSelectedRows(ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (Entry<Integer, Object> current : getFullySelectedRows().entrySet()) {
			Object value = current.getValue();
			if (value instanceof ITreeItemAxis) {
				ITreeItemAxis axis = (ITreeItemAxis) value;
				if (!axis.isExpanded()) {
					natTable.doCommand(new TreeExpandCollapseCommand(current.getKey()));
				}
			}
		}
	}

	/**
	 * this method allows to collapse all nodes for the selection
	 *
	 * @param natTable
	 *
	 */
	private static final void collapseAllFromSelectedRows(ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (Entry<Integer, Object> current : getFullySelectedRows().entrySet()) {
			Object value = current.getValue();
			if (value instanceof ITreeItemAxis) {
				ITreeItemAxis axis = (ITreeItemAxis) value;
				if (axis.isExpanded()) {
					collapseFullBranch(axis, axisProvider, natTable);
				}
			}
		}
	}

	/**
	 *
	 * @param axis
	 *            an axis
	 *            this method collapse all ITreeItemAxis of the branch
	 * @param natTable
	 *
	 */
	private static final void collapseFullBranch(ITreeItemAxis axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		// NatTable nattable = this.eventData.getNatTable();
		if (axis.isExpanded() && axis.getChildren().size() > 0) {
			int index = axisProvider.getRowElementsList().indexOf(axis);
			for (ITreeItemAxis child : axis.getChildren()) {
				collapseFullBranch(child, axisProvider, natTable);
			}
			natTable.doCommand(new TreeExpandCollapseCommand(index));
		}
	}

	/**
	 * This method allows to expand the selected rows on 2 levels
	 *
	 * @param natTable
	 *
	 */
	private static final void expandOn2LevelsSelectedRows(ITableAxisElementProvider axisProvider, NatTable natTable) {
		List<ITreeItemAxis> toExpand = new ArrayList<ITreeItemAxis>();
		for (Entry<Integer, Object> current : getFullySelectedRows().entrySet()) {
			Object value = current.getValue();
			if (value instanceof ITreeItemAxis) {
				ITreeItemAxis axis = (ITreeItemAxis) value;
				toExpand.add(axis);
				if (!axis.isExpanded() && axis.getChildren().size() > 0) {
					natTable.doCommand(new TreeExpandCollapseCommand(current.getKey()));
				}
			}
		}
		for (ITreeItemAxis current : toExpand) {
			for (ITreeItemAxis child : current.getChildren()) {
				if (!child.isExpanded() && child.getChildren().size() > 0) {
					int index = axisProvider.getRowElementsList().indexOf(child);
					natTable.doCommand(new TreeExpandCollapseCommand(index));

				}
			}
		}
	}

	/**
	 * @return
	 *         a map with the selected rows
	 */
	private static Map<Integer, Object> getFullySelectedRows() {
		IStructuredSelection selection = SelectionHelper.getCurrentStructuredSelection();
		if (selection instanceof TableStructuredSelection) {
			TableStructuredSelection tableSelection = (TableStructuredSelection) selection;
			TableSelectionWrapper wrapper = (TableSelectionWrapper) tableSelection.getAdapter(TableSelectionWrapper.class);
			return wrapper.getFullySelectedRows();
		}
		return Collections.emptyMap();
	}

	/**
	 * This method allows to expand all the sub-item of the selected items
	 *
	 * @param natTable
	 *
	 */
	private static final void expandAllFromSelectedRows(ITableAxisElementProvider axisProvider, NatTable natTable) {
		for (Entry<Integer, Object> current : getFullySelectedRows().entrySet()) {
			Object value = current.getValue();
			if (value instanceof ITreeItemAxis) {
				expandFullBranch((ITreeItemAxis) value, axisProvider, natTable);
			}
		}
	}

	/**
	 *
	 * @param axis
	 *            the axis for which we want to expand the whole branch
	 * @param natTable
	 *
	 */
	private static final void expandFullBranch(ITreeItemAxis axis, ITableAxisElementProvider axisProvider, NatTable natTable) {
		if (!axis.isExpanded() && axis.getChildren().size() > 0) {
			int index = axisProvider.getRowElementsList().indexOf(axis);
			natTable.doCommand(new TreeExpandCollapseCommand(index));
			for (ITreeItemAxis child : axis.getChildren()) {
				expandFullBranch(child, axisProvider, natTable);
			}
		}
	}
}
