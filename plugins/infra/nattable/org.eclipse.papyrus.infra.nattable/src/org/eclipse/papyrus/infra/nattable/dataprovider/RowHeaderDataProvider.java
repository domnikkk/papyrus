/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.papyrus.infra.nattable.dataprovider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;

/**
 *
 * this manager allows to manage the rows of the table. It provides
 * a row header with 0,1 or 2 columns
 *
 */
@Deprecated
public class RowHeaderDataProvider extends AbstractHeaderDataProvider {

	private int axisCount;

	/**
	 *
	 * Constructor.
	 *
	 * @param manager
	 *            the table manager
	 */
	public RowHeaderDataProvider(final INattableModelManager manager) {
		super(manager);
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#getColumnCount()
	 *
	 * @return
	 *
	 */
	@Override
	public int getColumnCount() {
		TableConfiguration conf = this.manager.getTable().getTableConfiguration();
		int nbHierarchicalColumn = 0;
		for (AxisManagerRepresentation current : conf.getRowHeaderAxisConfiguration().getAxisManagers()) {
			for (TreeFillingConfiguration curr : getHierarchicalFillingConfigurations(current)) {
				if (curr.getDepth() > nbHierarchicalColumn) {
					nbHierarchicalColumn = curr.getDepth();
				}
			}
		}
		nbHierarchicalColumn++;
		return this.axisCount + nbHierarchicalColumn;
	}

	// FIXME : move me in common method
	protected Collection<TreeFillingConfiguration> getHierarchicalFillingConfigurations(final AxisManagerRepresentation axisManagerRepresentation) {// FIXME : local configuration not yet managed
		final Collection<TreeFillingConfiguration> configs = new ArrayList<TreeFillingConfiguration>();
		for (final IAxisConfiguration current : axisManagerRepresentation.getSpecificAxisConfigurations()) {
			if (current instanceof TreeFillingConfiguration) {
				// if(((HierarchicalEStructuralFeatureFillingConfiguration)current).getHierarchicalLevel() == this.level) {
				configs.add((TreeFillingConfiguration) current);
				// }
			}
		}
		return configs;
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#getDataValue(int, int)
	 *
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	@Override
	public Object getDataValue(final int columnIndex, final int rowIndex) {
		switch (this.axisCount) {
		case 0:
			return null;
		case 1:
			if (this.displayFilter) {
				return null;// TODO not tested
			} else if (this.displayIndex) {
				return getAxisIndex(rowIndex);
			} else if (this.displayLabel) {
				return this.manager.getRowElement(rowIndex);
			}
		case 2:
			if (!this.displayFilter) {
				if (columnIndex == 0) {
					return getAxisIndex(rowIndex);
				}
				if (columnIndex >= 1) {
					// AbstractAxisManager axisManager = (AbstractAxisManager)this.manager.getRowAxisManager();
					// IAxisManager man = ((CompositeAxisManager)axisManager).getAxisManager();
					Object curr = this.manager.getRowElement(rowIndex);

					int depth = 0;

					if (curr instanceof ITreeItemAxis) {
						ITreeItemAxis parent = ((ITreeItemAxis) curr).getParent();
						while (parent != null) {
							depth++;
							parent = parent.getParent();
						}

					}



					if ((columnIndex - 1) == depth) {
						return this.manager.getRowElement(rowIndex);
					}

					return "";
					// return this.manager.getRowElement(rowIndex);
				}
			} else {
				// TODO not tested
			}
			break;
		case 3:
			if (!this.displayFilter) {
				if (columnIndex == 0) {
					return getAxisIndex(rowIndex);
				}
				if (columnIndex == 1) {
					return this.manager.getRowElement(rowIndex);
				}
				if (columnIndex == 2) {
					// TODO not tested
				}
			}
			break;
		}
		return columnIndex;
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
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractHeaderDataProvider#updateAxisCount()
	 *
	 */
	@Override
	protected void updateAxisCount() {
		int newAxisCOunt = 0;
		if (this.displayFilter) {
			// newAxisCOunt++; //we ignore this value for rows headers
		}
		if (this.displayIndex) {
			newAxisCOunt++;
		}
		if (this.displayLabel) {
			newAxisCOunt++;
		}
		this.axisCount = newAxisCOunt;
	}
}
