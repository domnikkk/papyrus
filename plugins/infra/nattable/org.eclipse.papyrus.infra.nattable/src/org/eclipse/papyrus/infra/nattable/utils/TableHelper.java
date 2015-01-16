/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattableFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;

/**
 *
 * @author Vincent Lorenzo
 *
 */
public class TableHelper {

	private TableHelper() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param configuration
	 *            the configuration used to create the table
	 * @return
	 *         the table created from this configuration
	 */
	public static final Table createTable(final TableConfiguration configuration) {
		return createTable(configuration, null);
	}

	/**
	 *
	 * @param configuration
	 *            the configuration used to create the table
	 * @param context
	 *            the context of the table
	 * @return
	 *         the table created from these parameters
	 */
	public static final Table createTable(final TableConfiguration configuration, final EObject context) {
		return createTable(configuration, null, null);
	}

	/**
	 *
	 * @param configuration
	 *            the configuration used to create the table
	 * @param context
	 *            the context of the table
	 * @param name
	 *            the name for the table
	 * @return
	 *         the table created from these parameters
	 */
	public static final Table createTable(final TableConfiguration configuration, final EObject context, final String name) {
		return createTable(configuration, null, null, null);
	}

	/**
	 *
	 * @param configuration
	 *            the configuration used to create the table
	 * @param context
	 *            the context of the table
	 * @param name
	 *            the name for the table
	 * @param description
	 *            the description for the table
	 * @return
	 *         the table created from these parameters
	 */
	public static final Table createTable(final TableConfiguration configuration, final EObject context, final String name, final String description) {
		assert configuration != null;

		Table table = NattableFactory.eINSTANCE.createTable();
		table.setTableConfiguration(configuration);
		table.setDescription(description);
		table.setName(name);
		table.setContext(context);

		// the configuration always provides axis provider
		AbstractAxisProvider rowProvider = configuration.getDefaultRowAxisProvider();
		rowProvider = EcoreUtil.copy(rowProvider);

		AbstractAxisProvider columnProvider = configuration.getDefaultColumnAxisProvider();
		columnProvider = EcoreUtil.copy(columnProvider);

		table.setCurrentRowAxisProvider(rowProvider);
		table.setCurrentColumnAxisProvider(columnProvider);
		table.getRowAxisProvidersHistory().add(rowProvider);
		table.getColumnAxisProvidersHistory().add(columnProvider);

		IntListValueStyle style = (IntListValueStyle) configuration.getNamedStyle(NattablestylePackage.eINSTANCE.getIntListValueStyle(), NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
		// we copy this style, because the solution to override it in the table required to have a style to store displayed depth and another one to store hidden depth.
		if (style != null) {
			IntListValueStyle copy = EcoreUtil.copy(style);
			table.getStyles().add(copy);
		}
		return table;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         the display style to use for the table, the return value is never <code>null</code>
	 */
	public static final DisplayStyle getTableDisplayStyle(final Table table) {
		TableDisplayStyle displayStyle = (TableDisplayStyle) table.getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		if (displayStyle == null) {
			displayStyle = (TableDisplayStyle) table.getTableConfiguration().getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		}
		if (displayStyle != null) {
			return displayStyle.getDisplayStyle();
		}
		return DisplayStyle.NORMAL;
	}


	/**
	 *
	 * @param table
	 *            a table manager
	 * @return
	 *         the display style to use for the managed table, the return value is never <code>null</code>
	 */
	public static final DisplayStyle getTableDisplayStyle(final INattableModelManager tableManager) {
		return getTableDisplayStyle(tableManager.getTable());
	}

	/**
	 *
	 * @param tableManager
	 *            a table manager
	 * @return
	 *         <code>true</code> if the managed table is a tree table
	 */
	public static final boolean isTreeTable(final INattableModelManager tableManager) {
		return isTreeTable(tableManager.getTable());
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> if the table is a tree table
	 */
	public static final boolean isTreeTable(final Table table) {
		TableDisplayStyle style = (TableDisplayStyle) table.getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		if (style == null) {
			style = (TableDisplayStyle) table.getTableConfiguration().getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		}
		if (style != null) {
			final DisplayStyle displayStyle = style.getDisplayStyle();
			return DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN.equals(displayStyle) || DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN.equals(displayStyle);
		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> if the table is a tree table displayed on single column
	 */
	public static final boolean isSingleColumnTreeTable(final Table table) {
		TableDisplayStyle style = (TableDisplayStyle) table.getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		if (style == null) {
			style = (TableDisplayStyle) table.getTableConfiguration().getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		}
		if (style != null) {
			final DisplayStyle displayStyle = style.getDisplayStyle();
			return DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN.equals(displayStyle);
		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> if the tableManager manages a tree table displayed on single column
	 */
	public static final boolean isSingleColumnTreeTable(final INattableModelManager tableManager) {
		return isSingleColumnTreeTable(tableManager.getTable());
	}


	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> if the table is a tree table displayed on multi column
	 */
	public static final boolean isMultiColumnTreeTable(Table table) {
		TableDisplayStyle style = (TableDisplayStyle) table.getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		if (style == null) {
			style = (TableDisplayStyle) table.getTableConfiguration().getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		}
		if (style != null) {
			final DisplayStyle displayStyle = style.getDisplayStyle();
			return DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN.equals(displayStyle);
		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> if the tableManager manages a tree table displayed on multi column
	 */
	public static final boolean isMultiColumnTreeTable(final INattableModelManager tableManager) {
		return isMultiColumnTreeTable(tableManager.getTable());
	}

	/**
	 *
	 * @param anEObject
	 * @return
	 * @throws Exception
	 */
	public static final Table findTable(final EObject anEObject) throws Exception { // TODO : move me
		if (EcoreUtil.getRootContainer(anEObject.eClass()) != NattablePackage.eINSTANCE) {
			throw new Exception("The eobject is not an element of the Papyrus table metamodel"); //$NON-NLS-1$
		}
		EObject container = anEObject;
		while (container != null && !(container instanceof Table)) {
			container = container.eContainer();
		}
		if (container == null) {
			return null;
			//			throw new Exception("Table not found, this method should be completed"); //$NON-NLS-1$
		}

		return (Table) container;
	}



}
