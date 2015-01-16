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

package org.eclipse.papyrus.infra.nattable.handler;

import org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;

/**
 * @author VL222926
 *
 */
public abstract class AbstractTreeTableHandler extends AbstractTableHandler {

	/**
	 * @see org.eclipse.papyrus.infra.nattable.handler.AbstractTableHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		if (isEnabled()) {
			if ((!TableHelper.isTreeTable(getCurrentNattableModelManager())) || getTreeNattableModelManager() == null) {
				setBaseEnabled(false);
			}
		}
	}

	/**
	 *
	 * @return
	 *         the current tree nattable model manager
	 */
	public ITreeNattableModelManager getTreeNattableModelManager() {
		if (getCurrentNattableModelManager() instanceof ITreeNattableModelManager) {
			return (ITreeNattableModelManager) getCurrentNattableModelManager();
		}
		return null;
	}

}
