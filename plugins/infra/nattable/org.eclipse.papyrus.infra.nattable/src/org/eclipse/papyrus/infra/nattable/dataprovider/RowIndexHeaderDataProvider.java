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
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisIndexStyle;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;

/**
 *
 * @author VL222926
 *         DataProvider for row index header
 */
public class RowIndexHeaderDataProvider extends AbstractIndexHeaderDataProvider {

	/**
	 *
	 * Constructor.
	 *
	 * @param tableModelManager
	 */
	public RowIndexHeaderDataProvider(final INattableModelManager tableModelManager) {
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
		if (this.displayIndex) {
			return 1;
		}
		return 0;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractIndexHeaderDataProvider#getDataValue(int, int)
	 *
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	@Override
	public Object getDataValue(int columnIndex, int rowIndex) {
		if (this.style == AxisIndexStyle.NUMERIC && displayIndexWithDepth() && TableHelper.isTreeTable(manager)) {
			return getTreeRowIndex(rowIndex);
		}
		return getAxisIndex(rowIndex);
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if the index must be displayed as depth
	 */
	protected boolean displayIndexWithDepth() {
		return false;
	}

	/**
	 *
	 * @param rowIndex
	 *            a row index
	 * @return
	 *         a tree row index (1.0.0.1) ...
	 */
	private Object getTreeRowIndex(int rowIndex) {
		// not finished just here for try
		ITreeItemAxis axis = (ITreeItemAxis) manager.getRowElementsList().get(rowIndex);
		StringBuilder builder = new StringBuilder();
		ITreeItemAxis parent = axis;
		while (parent != null) {
			ITreeItemAxis p = parent.getParent();
			if (p != null) {
				int index = p.getChildren().indexOf(parent);
				builder.append(index);
				builder.append(".");//$NON-NLS-1$
			} else {
				builder.append("1");//$//$NON-NLS-1$
			}

			parent = p;

		}
		return builder.reverse().toString();
	}
}
