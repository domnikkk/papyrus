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

import java.util.Collections;
import java.util.List;

import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * @author VL222926
 *
 */
public class StyleUtils {

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         a list with the hidden depth in the table. The returned values in never <code>null</code>;
	 */
	public static final List<Integer> getHiddenDepths(final Table table) {
		IntListValueStyle style = getHiddenDepthsValueStyle(table);
		if (style == null) {
			return Collections.emptyList();
		}
		return Collections.unmodifiableList(style.getIntListValue());
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         a list with the hidden depth in the table. The returned values in never <code>null</code>;
	 */
	public static final List<Integer> getHiddenDepths(final INattableModelManager manager) {
		return getHiddenDepths(manager.getTable());
	}

	/**
	 *
	 * @param manager
	 *            the table
	 * @return
	 *         the style referencing the hidden category
	 */

	public static final IntListValueStyle getHiddenDepthsValueStyle(final Table table) {
		return (IntListValueStyle) table.getNamedStyle(NattablestylePackage.eINSTANCE.getIntListValueStyle(), NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
	}

	/**
	 *
	 * @param manager
	 *            the table manager
	 * @return
	 *         the style referencing the hidden category
	 */
	public static final IntListValueStyle getHiddenDepthsValueStyle(final INattableModelManager manager) {
		return getHiddenDepthsValueStyle(manager.getTable());
	}

	/**
	 *
	 * @param manager
	 *            a table manager
	 * @param depth
	 *            a depth
	 * @return
	 *         <code>true</code> if the category must be hidden
	 */
	public static final boolean isHiddenDepth(final INattableModelManager manager, final int depth) {
		return isHiddenDepth(manager.getTable(), depth);
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @param depth
	 *            a depth
	 * @return
	 *         <code>true</code> if the category must be hidden
	 */
	public static final boolean isHiddenDepth(final Table table, final int depth) {
		List<Integer> hidden = getHiddenDepths(table);
		if (hidden.contains(depth)) {
			return true;
		}
		return false;
	}
}
