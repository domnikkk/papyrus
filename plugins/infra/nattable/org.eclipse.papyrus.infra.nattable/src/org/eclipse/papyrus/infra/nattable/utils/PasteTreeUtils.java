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

import java.util.List;

import org.eclipse.core.runtime.Assert;

/**
 *
 *
 */
public class PasteTreeUtils {

	/**
	 * Constructor.
	 *
	 */
	private PasteTreeUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param nbReadCell
	 *            the number of read cells (>0)
	 * @param maxDepth
	 *            the max depth of the table, this value start to 0
	 * @param hiddenDepth
	 *            the list of the hidden depth
	 * @param hasConfigurationOnDepth0
	 *            <code>true</code> if the table has a configuration on depth==0
	 * @return
	 *         the depth for the read cell
	 */
	public static final int getDepth(int nbReadCell, int maxDepth, List<Integer> hiddenDepth, boolean hasConfigurationOnDepth0) {
		int nbColumn = (maxDepth + 1) * 2;// depth start to 0
		int readColumn = 0;
		int depth = -1;
		for (int i = 0; i < nbColumn; i++) {
			// we cross the column table and we check if the column is visible
			if (i % 2 == 0) {// it is the index of the category columns
				depth++;
				if (!hiddenDepth.contains(Integer.valueOf(i / 2))) {
					readColumn++;
				}
			} else {
				readColumn++;
			}

			if (readColumn == nbReadCell) {
				if (!hasConfigurationOnDepth0) {
					readColumn--;
					hasConfigurationOnDepth0 = true;
					continue;
				}
				return depth;
			}
		}
		throw new UnsupportedOperationException("There is an error in this method", null); //$NON-NLS-1$
	}

	/**
	 *
	 * @param nbReadCell
	 *            the number of read cells (>0)
	 * @param maxDepth
	 *            the max depth of the table, this value start to 0
	 * @param hiddenDepth
	 *            the list of the hidden depth
	 * @param hasConfigurationOnDepth0
	 *            <code>true</code> if the table has a configuration on depth==0
	 * @return
	 *         <code>true</code> if the read cell represents a category
	 */
	public static final boolean isCategory(int nbReadCell, int maxDepth, List<Integer> hiddenDepth, boolean hasConfigurationOnDepth0) {
		Assert.isTrue(nbReadCell > 0);
		int nbColumn = (maxDepth + 1) * 2;// depth start to 0
		boolean isCategory;
		int readColumn = 0;
		for (int i = 0; i < nbColumn; i++) {
			// we cross the column table and we check if the column is visible
			if (i % 2 == 0) {// it is the index of the category columns
				if (!hiddenDepth.contains(Integer.valueOf(i / 2))) {
					isCategory = true;
					readColumn++;
				} else {
					isCategory = false;
				}
			} else {
				readColumn++;
				isCategory = false;
			}

			if (readColumn == nbReadCell) {
				if (!hasConfigurationOnDepth0) {
					readColumn--;
					hasConfigurationOnDepth0 = true;
					continue;
				}
				return isCategory;
			}
		}
		throw new UnsupportedOperationException("There is an error in this method", null); //$NON-NLS-1$
	}


}
