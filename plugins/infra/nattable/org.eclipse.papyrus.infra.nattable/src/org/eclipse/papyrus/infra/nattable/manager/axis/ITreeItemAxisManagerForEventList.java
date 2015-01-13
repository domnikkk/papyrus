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

package org.eclipse.papyrus.infra.nattable.manager.axis;

import java.util.Comparator;
import java.util.List;

import org.eclipse.nebula.widgets.nattable.sort.ISortModel;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;

/**
 * @author VL222926
 *
 */
public interface ITreeItemAxisManagerForEventList extends IAxisManagerForEventList {

	/**
	 *
	 * @param objectToTest
	 *            an object
	 * @param semanticParent
	 *            the semantic parent of the object to test
	 * @param conf
	 *            the configuration which provides the object to test
	 * @param depth
	 *            the depth on which we want to apply this object
	 * @return
	 *         <code>true</code> if the object is accepted and false if not
	 */
	public boolean isAllowedContents(Object objectToTest, Object semanticParent, TreeFillingConfiguration conf, int depth);

	/**
	 *
	 * @param sortModel
	 *            the sort model to use
	 * @param depth
	 *            the depth for which we want sort the elements
	 * @param axis1
	 *            the first axis
	 * @param axis2
	 *            the second axis
	 * @return
	 * @see Comparator#compare(Object, Object)
	 */
	public int compare(final ISortModel sortModel, final int depth, final ITreeItemAxis axis1, final ITreeItemAxis axis2);

	/**
	 * @param element
	 *            the expanded/collapsed element
	 * @param path
	 *            the path of the element
	 * @param expanded
	 *            if <code>true</code> the axis is expanded, if <code>false</code> the axis is collapsed
	 */
	public void setExpanded(ITreeItemAxis element, List<ITreeItemAxis> path, boolean expanded);

	/**
	 * This method must fill the event list with
	 * <ul>
	 * <li>root element</li>
	 * <li>child of the roots elements</li>
	 * <li>child of child of the roots elements, for expanded roots</li>
	 * </ul>
	 *
	 * the others child of child of ... will be added by {@link #fillListWithChildren(ITreeItemAxis)}
	 */
	public void fillListWithRoots();

	/**
	 *
	 * This method fill the list with the children of the axis
	 *
	 * @param axis
	 *            a tree item axis
	 */
	public void fillListWithChildren(final ITreeItemAxis axis);

	/**
	 *
	 * @param toHide
	 *            the list of the depths for which we want hide the categories, can be <code>null</code>
	 * @param toShow
	 *            the list of the depths for which we want display the categories, can be <code>null</code>
	 */
	public void managedHideShowCategoriesForDepth(List<Integer> toHide, List<Integer> toShow);

}
