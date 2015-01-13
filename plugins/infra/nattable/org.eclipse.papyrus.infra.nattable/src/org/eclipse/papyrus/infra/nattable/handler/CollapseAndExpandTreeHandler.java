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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;

/**
 * @author VL222926
 *
 */
public class CollapseAndExpandTreeHandler extends AbstractParametricTreeTableHandler {

	/** the name of the parameter used by this handler */
	public static final String COLLAPSED_DEPTH_ARG_NAME = "treeAction"; //$NON-NLS-1$

	private CollapseAndExpandActionsEnum actionId;

	/**
	 * Constructor.
	 *
	 * @param parameterId
	 */
	public CollapseAndExpandTreeHandler() {
		super(COLLAPSED_DEPTH_ARG_NAME);
	}


	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param arg0
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		getTreeNattableModelManager().doCollapseExpandAction(this.actionId, null);
		return null;
	}



	/**
	 * @see org.eclipse.papyrus.infra.nattable.handler.AbstractTableHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		if (isEnabled() && this.actionId == null) {
			setBaseEnabled(false);
			return;
		}
		if (isEnabled()) {
			switch (this.actionId) {
			case COLLAPSE_ALL_FROM_SELECTION:
			case COLLAPSE_ONE_LEVEL:
			case EXPAND_ALL_FROM_SELECTION:
			case EXPAND_ONE_LEVEL:
				if (getFullSelectedRowsIndex(evaluationContext).isEmpty()) {
					setBaseEnabled(false);
				}
				break;

			default:
				// nothing to do
				break;
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.handler.AbstractParametricTreeTableHandler#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 *
	 * @param config
	 * @param propertyName
	 * @param data
	 * @throws CoreException
	 */
	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		super.setInitializationData(config, propertyName, data);
		this.actionId = CollapseAndExpandActionsEnum.valueOf(getParameterValue());
	}
}
