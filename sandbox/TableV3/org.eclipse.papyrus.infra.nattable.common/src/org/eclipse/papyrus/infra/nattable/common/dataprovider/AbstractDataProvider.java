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
package org.eclipse.papyrus.infra.nattable.common.dataprovider;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager;


public abstract class AbstractDataProvider implements IDataProvider {

	/**
	 * the manager used to manage the table
	 */
	protected final INattableModelManager manager;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param tableModelManager
	 *        the manager of the table
	 */
	public AbstractDataProvider(final INattableModelManager tableModelManager) {
		this.manager = tableModelManager;
	}

	/**
	 * 
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#getColumnCount()
	 * 
	 * @return
	 */
	public int getColumnCount() {
		return this.manager.getColumnCount();
	}

	/**
	 * 
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#getRowCount()
	 * 
	 * @return
	 */
	public int getRowCount() {
		return this.manager.getRowCount();
	}

}
