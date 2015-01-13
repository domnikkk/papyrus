/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
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
package org.eclipse.papyrus.infra.nattable.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;


/**
 *
 * @author VL222926
 *
 */
public class TreeRowShowAllCategoriesHandler extends AbstractTreeRowHideShowCategoryHandler {

	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IntListValueStyle values = (IntListValueStyle) getTable().getNamedStyle(NattablestylePackage.eINSTANCE.getIntListValueStyle(), NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
		if (values != null) {
			Command c = RemoveCommand.create(getTableEditingDomain(), getTable(), NattablestylePackage.eINSTANCE.getStyledElement_Styles(), values);
			getContextEditingDomain().getCommandStack().execute(c);
		}
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
		if (isEnabled()) {
			if (allCategoriesAreCurrentlyVisible()) {
				setBaseEnabled(false);
			}
		}
	}
}
