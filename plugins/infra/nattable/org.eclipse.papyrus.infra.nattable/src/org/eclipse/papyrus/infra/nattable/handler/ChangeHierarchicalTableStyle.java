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

import java.util.Collections;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RadioState;

/**
 * @author VL222926
 *
 */
public class ChangeHierarchicalTableStyle extends AbstractTreeTableHandler {

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (HandlerUtil.matchesRadioState(event)) {
			return null;// we are already in the updated state - do nothing
		}

		String currentState = event.getParameter(RadioState.PARAMETER_ID);
		Table table = getTable();
		TableDisplayStyle style = (TableDisplayStyle) table.getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		Command cmd = null;
		DisplayStyle value = DisplayStyle.get(currentState);
		if (style == null) {
			TableDisplayStyle displayStyle = NattablestyleFactory.eINSTANCE.createTableDisplayStyle();
			displayStyle.setDisplayStyle(value);
			cmd = new AddCommand(getTableEditingDomain(), table, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), Collections.singleton(displayStyle));
		} else {
			cmd = new SetCommand(getTableEditingDomain(), style, NattablestylePackage.eINSTANCE.getTableDisplayStyle_DisplayStyle(), value);
		}
		if (cmd != null && cmd.canExecute()) {
			getTableEditingDomain().getCommandStack().execute(cmd);
			// and finally update the current state
			HandlerUtil.updateRadioState(event.getCommand(), currentState);
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
			final DisplayStyle style = TableHelper.getTableDisplayStyle(getCurrentNattableModelManager());
			setBaseEnabled(DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN.equals(style) || DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN.equals(style));
		}

	}
}
