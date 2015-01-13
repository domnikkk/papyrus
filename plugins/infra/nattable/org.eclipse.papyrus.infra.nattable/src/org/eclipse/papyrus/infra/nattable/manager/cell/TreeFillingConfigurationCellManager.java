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
package org.eclipse.papyrus.infra.nattable.manager.cell;

import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;

/**
 * This cell manager allows to display empty string in body cells when the row element is {@link TreeFillingConfiguration}
 *
 * @author VL222926
 *
 */
public class TreeFillingConfigurationCellManager extends AbstractCellManager implements ICellManager {


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.cell.AbstractCellManager#handles(java.lang.Object, java.lang.Object)
	 *
	 * @param columnElement
	 * @param rowElement
	 * @return
	 */
	@Override
	public boolean handles(Object columnElement, Object rowElement) {
		return rowElement instanceof ITreeItemAxis && ((ITreeItemAxis) rowElement).getElement() instanceof TreeFillingConfiguration;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.cell.AbstractCellManager#isCellEditable(java.lang.Object, java.lang.Object)
	 *
	 * @param columnElement
	 * @param rowElement
	 * @return
	 */
	@Override
	public boolean isCellEditable(Object columnElement, Object rowElement) {
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.cell.AbstractCellManager#doGetValue(java.lang.Object, java.lang.Object, org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager)
	 *
	 * @param columnElement
	 * @param rowElement
	 * @param tableManager
	 * @return
	 */
	@Override
	protected Object doGetValue(Object columnElement, Object rowElement, INattableModelManager tableManager) {
		return EMPTY_STRING;
	}
}
