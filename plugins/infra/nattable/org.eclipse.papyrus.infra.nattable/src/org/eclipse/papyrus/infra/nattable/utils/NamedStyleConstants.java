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


public class NamedStyleConstants {

	private NamedStyleConstants() {
		// to prevent instantiation
	}

	/**
	 *
	 * The following constants are used during the initialization and retrieval of the Axis and Header dimensions in the tables
	 */

	public static final String ROW_INDEX_WIDTH = "rowIndexWidth"; //$NON-NLS-1$1

	public static final String ROW_LABEL_WIDTH = "rowLabelWidth"; //$NON-NLS-1$

	public static final String COLUMN_INDEX_HEIGHT = "columnIndexHeight"; //$NON-NLS-1$

	public static final String COLUMN_LABEL_HEIGHT = "columnLabelHeight"; //$NON-NLS-1$

	public static final String AXIS_WIDTH = "axisWidth"; //$NON-NLS-1$

	public static final String AXIS_HEIGHT = "axisHeight"; //$NON-NLS-1$

	/**
	 *
	 * The following constants are used during the initialization and retrieval of the merge options in the tables
	 */

	//	public static final String TABLEMERGE = "tableMerge"; //$NON-NLS-1$

	public static final String MERGE_ROWS = "mergeRows"; //$NON-NLS-1$

	public static final String MERGE_COLUMNS = "mergeColumns"; //$NON-NLS-1$

	public static final String MERGE_SELECTED_ROWS = "mergeSelectedRows"; //$NON-NLS-1$

	public static final String MERGE_SELECTED_COLUMNS = "mergeSelectedColumns"; //$NON-NLS-1$

	public static final String MERGE_IN_SELECTED_ROWS = "mergeInSelectedRows"; //$NON-NLS-1$

	public static final String MERGE_IN_SELECTED_COLUMNS = "mergeInSelectedColumns"; //$NON-NLS-1$

	// the merge of all the elements in the table is not yet supported
	//	public static final String MERGE_TABLE = "mergeTable"; //$NON-NLS-1$


	public static final String HIDDEN_CATEGORY_FOR_DEPTH = "hiddenCategoriesByDepth"; //$NON-NLS-1$


}
