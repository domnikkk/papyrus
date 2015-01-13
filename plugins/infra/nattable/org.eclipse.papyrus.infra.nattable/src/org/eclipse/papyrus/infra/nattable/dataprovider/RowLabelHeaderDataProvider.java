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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.dataprovider;

import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;

/**
 *
 * @author VL222926
 *         DataProvider for row index header
 */
public class RowLabelHeaderDataProvider extends AbstractLabelHeaderDataProvider {

	/**
	 *
	 * Constructor.
	 *
	 * @param tableModelManager
	 */
	public RowLabelHeaderDataProvider(INattableModelManager tableModelManager) {
		super(tableModelManager);
	}


	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#setDataValue(int, int, java.lang.Object)
	 *
	 * @param columnIndex
	 * @param rowIndex
	 * @param newValue
	 */
	@Override
	public void setDataValue(final int columnIndex, final int rowIndex, final Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractHeaderDataProvider#getAxisConfiguration()
	 *
	 * @return
	 */
	@Override
	protected AbstractHeaderAxisConfiguration getAxisConfiguration() {
		return HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(this.manager.getTable());
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractDataProvider#getColumnCount()
	 *
	 * @return
	 */
	@Override
	public int getColumnCount() {
		if (displayLabel) {
			return 1;
		}
		return 0;
	}


	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractIndexHeaderDataProvider#getDa_itaValue(int, int)
	 *
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	@Override
	public Object getDataValue(int columnIndex, int rowIndex) {
		if (rowIndex >= 0) {
			return this.manager.getRowElement(rowIndex);
		}
		return null;
	}
}
