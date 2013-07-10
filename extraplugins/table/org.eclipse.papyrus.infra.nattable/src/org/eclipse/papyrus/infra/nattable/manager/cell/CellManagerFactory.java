/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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
package org.eclipse.papyrus.infra.nattable.manager.cell;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;

/**
 * The cell manager factory
 * 
 * @author vl222926
 * 
 */
public final class CellManagerFactory {


	private static final String CLASS_MANAGER = "manager"; //$NON-NLS-1$

	private static final String ORDER = "order"; //$NON-NLS-1$

	private static final String EXTENSION_ID = "org.eclipse.papyrus.infra.nattable.cellmanager"; //$NON-NLS-1$

	/**
	 * Error message when the cell manager has not been found
	 */
	public static final String CELL_MANAGER_NOT_FOUND = Messages.CellManagerFactory_CellManagerNotFound;

	/**
	 * the map of the cell manager sorted by priority
	 */
	private final Map<Integer, ICellManager> managersMap;

	/**
	 * The cell manager factory
	 */
	public static final CellManagerFactory INSTANCE = new CellManagerFactory();

	/**
	 * 
	 * Constructor.
	 * Initialize the field of the class
	 */
	private CellManagerFactory() {
		this.managersMap = new TreeMap<Integer, ICellManager>();
		final IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);

		for(final IConfigurationElement iConfigurationElement : configElements) {
			//id is not used
			//final String id = iConfigurationElement.getAttribute(SOLVER_ID);

			final Integer order = new Integer(iConfigurationElement.getAttribute(ORDER));
			try {
				final ICellManager solver = (ICellManager)iConfigurationElement.createExecutableExtension(CLASS_MANAGER);
				this.managersMap.put(order, solver);
			} catch (final CoreException e) {
				Activator.log.error(e);
			}
		}
	}

	/**
	 * 
	 * @param columnElement
	 *        the column element as described in the model (you must ignore the invert axis)
	 * 
	 * @param rowElement
	 *        the row element as described in the model (you must ignore the invert axis)
	 * @return
	 *         the value to display in the cell
	 */
	public Object getCrossValue(final Object columnElement, final Object rowElement, final INattableModelManager tableManager) {
		final ICellManager cellManager = getCellManager(columnElement, rowElement);
		if(cellManager != null) {
			return cellManager.getValue(columnElement, rowElement, tableManager);
		} else {
			return CELL_MANAGER_NOT_FOUND;
		}
	}

	/**
	 * 
	 * @param columnElement
	 *        the column element as described in the model (you must ignore the invert axis)
	 * 
	 * @param rowElement
	 *        the row element as described in the model (you must ignore the invert axis)
	 * 
	 * @return
	 *         the cell manager
	 */
	private ICellManager getCellManager(final Object columnElement, final Object rowElement) {
		for(final Integer integer : this.managersMap.keySet()) {
			ICellManager current = this.managersMap.get(integer);
			if(current.handles(columnElement, rowElement)) {
				return current;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param columnElement
	 *        the column element as described in the model (you must ignore the invert axis)
	 * @param rowElement
	 *        the row element as described in the model (you must ignore the invert axis)
	 * 
	 * @return
	 *         <code>true</code> if the cell is editable
	 */
	public boolean isCellEditable(final Object columnElement, final Object rowElement) {
		final ICellManager cellManager = getCellManager(columnElement, rowElement);
		if(cellManager != null) {
			return cellManager.isCellEditable(columnElement, rowElement);
		}
		return false;

	}

	/**
	 * 
	 * @param domain
	 *        the editing domain
	 * 
	 * @param columnElement
	 *        the column element as described in the model (you must ignore the invert axis)
	 * @param rowElement
	 *        the row element as described in the model (you must ignore the invert axis)
	 * @param newValue
	 *        the new value
	 * @param tableManager
	 *        the table manager
	 */
	public void setCellValue(final TransactionalEditingDomain domain, final Object columnElement, final Object rowElement, final Object newValue, final INattableModelManager tableManager) {
		final ICellManager cellManager = getCellManager(columnElement, rowElement);
		if(cellManager != null) {
			cellManager.setValue(domain, columnElement, rowElement, newValue, tableManager);
		} else {
			throw new UnsupportedOperationException(CELL_MANAGER_NOT_FOUND);
		}
	}
}
