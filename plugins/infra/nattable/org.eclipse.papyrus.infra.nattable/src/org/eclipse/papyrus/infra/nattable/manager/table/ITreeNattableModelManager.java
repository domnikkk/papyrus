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

package org.eclipse.papyrus.infra.nattable.manager.table;



import java.util.List;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;
import org.eclipse.papyrus.infra.nattable.tree.DatumTreeFormat;

/**
 * This interface provides methods for Tree Table table manager
 *
 * @author VL222926
 *
 */
public interface ITreeNattableModelManager {

	/**
	 *
	 * @return
	 *         the tree format used for the table
	 */
	public DatumTreeFormat getTreeFormat();


	/**
	 * @param axis
	 *            an axis
	 * @return
	 *         the depth of a ITreeItemAxis, that is to says, the number of {@link ITreeItemAxis} to cross to get the root {@link ITreeItemAxis}, included itself
	 */
	public int getTreeItemDepth(ITreeItemAxis axis);

	/**
	 *
	 * @param axis
	 *            an axis
	 * @return
	 *         the semantic depth, that is to say the number of semantic element before to cross to get the root {@link ITreeItemAxis}, included itself.
	 *         if the {@link ITreeItemAxis} represents a {@link TreeFillingConfiguration}, we return the depth of the configruation
	 */
	public int getSemanticDepth(ITreeItemAxis axis);

	/**
	 * This method allows to show/hide categories in the row header. It calls {@link #hideShowCategories(List, List)} and {@link #hideShowColumnCategoriesInRowHeader(List, List)}.
	 *
	 * @param depthToHide
	 *            the list of the depth for which we want to hide the categories
	 * @param depthToShow
	 *            the list of the depth for which we want to show the categories
	 */
	public void hideShowCategories(List<Integer> depthToHide, List<Integer> depthToShow);

	/**
	 * This methods allows to hide the rows representing categories (TreeFillingConfiguration)
	 *
	 * @param depthToHide
	 *            the depth to hide
	 * @param depthToShow
	 *            the depth to show
	 */
	public void hideShowRowCategories(List<Integer> depthToHide, List<Integer> depthToShow);


	/**
	 * This methods allows to hide the column, in the row header representing categories (TreeFillingConfiguration)
	 *
	 * @param depthToHide
	 *            the depth to hide
	 * @param depthToShow
	 *            the depth to show
	 */
	public void hideShowColumnCategoriesInRowHeader(List<Integer> depthToHide, List<Integer> depthToShow);


	/**
	 * The action to use to expand or collapse node in the table.
	 * See {@link CollapseAndExpandActionsEnum}
	 *
	 * @param actionId
	 *            the id of the action to do
	 * @param selectedAxis
	 *            the list of axis to manage
	 *            <ul>
	 *            <li>this argument must be <code>null</code> for {@link CollapseAndExpandActionsEnum#COLLAPSE_ALL} and {@link CollapseAndExpandActionsEnum#EXPAND_ALL}</li>
	 *            <li>for others values of {@link CollapseAndExpandActionsEnum}, if selectedAxis
	 *            <ul>
	 *            <li>is <code>null</code> we use the current selection of the table (fully selected rows)</li>
	 *            <li>is not <code>null</code>, empty or with valid values, we use these axis instead of the current selection of the table</li>
	 *            </ul>
	 *            </ul>
	 */
	public void doCollapseExpandAction(CollapseAndExpandActionsEnum actionId, List<ITreeItemAxis> selectedAxis);
}