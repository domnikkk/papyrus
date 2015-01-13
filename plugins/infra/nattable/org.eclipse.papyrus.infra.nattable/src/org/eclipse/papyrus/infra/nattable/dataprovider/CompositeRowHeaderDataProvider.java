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

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;

/**
 *
 * @author VL222926
 *         a composite header data provider
 *
 */
public class CompositeRowHeaderDataProvider extends AbstractCompositeDataProvider {

	/**
	 *
	 * Constructor.
	 *
	 * @param manager
	 *            the nattable model manager
	 */
	public CompositeRowHeaderDataProvider(final INattableModelManager manager) {
		super(manager);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractCompositeDataProvider#getColumnCount()
	 *
	 * @return
	 */
	@Override
	public int getColumnCount() {
		int i = 0;
		for (IDataProvider current : providers) {
			i += current.getColumnCount();
		}
		return i;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.dataprovider.AbstractCompositeDataProvider#getRowCount()
	 *
	 * @return
	 */
	@Override
	public int getRowCount() {
		return this.manager.getRowElementsList().size();
	}

}
