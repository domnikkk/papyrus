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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;

/**
 * @author VL222926
 *
 */
public class TreeRowHideShowCategoryHandler extends AbstractTreeRowHideShowCategoryHandler {

	/**
	 * Boolean parameter : <code>true</code> to hide and <code>false</code> to show
	 */
	public static final String HIDE_CATEGORY_PARAMETER_KEY = "hideCategory"; //$NON-NLS-1$

	/**
	 * the depth on which we are working
	 */
	public static final String DEPTH_PARAMETER_KEY = "depth"; //$NON-NLS-1$

	/**
	 * the id of the command managed by this handler
	 */
	public static final String COMMAND_ID = "org.eclipse.papyrus.infra.nattable.row.show.hide.category.command"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param arg0
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		Boolean hide = (Boolean) arg0.getParameters().get(HIDE_CATEGORY_PARAMETER_KEY);
		Integer depth = (Integer) arg0.getParameters().get(DEPTH_PARAMETER_KEY);
		if (hide) {
			hideCategory(depth);
		} else {
			showCategory(depth);
		}
		return null;
	}

	/**
	 *
	 * @param depth
	 *            the depth to hide
	 */
	protected void hideCategory(Integer depth) {
		IntListValueStyle style = StyleUtils.getHiddenDepthsValueStyle(getTable());
		if (style != null && style.getIntListValue().contains(depth)) {
			return;
		}
		if (depth == 0 && !FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), 0)) {
			return;
		}


		if (style == null) {
			style = NattablestyleFactory.eINSTANCE.createIntListValueStyle();
			style.setName(NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
			style.eSet(NattablestylePackage.eINSTANCE.getIntListValueStyle_IntListValue(), Collections.singleton(depth));
			Command cmd = AddCommand.create(getTableEditingDomain(), getTable(), NattablestylePackage.eINSTANCE.getStyledElement_Styles(), Collections.singleton(style));
			getTableEditingDomain().getCommandStack().execute(cmd);
			return;
		}

		List<Integer> allValues = new ArrayList<Integer>();
		if (style != null) {
			allValues.addAll(style.getIntListValue());
		}

		if (allValues.contains(depth)) {
			// nothing to do
			return;
		}
		allValues.add(depth);
		Collections.sort(allValues);
		int index = allValues.indexOf(depth);
		Command cmd = AddCommand.create(getTableEditingDomain(), style, NattablestylePackage.eINSTANCE.getIntListValueStyle_IntListValue(), depth, index);
		getTableEditingDomain().getCommandStack().execute(cmd);


	}

	/**
	 *
	 * @param depth
	 *            the depth to show
	 */
	protected void showCategory(Integer depth) {
		IntListValueStyle style = StyleUtils.getHiddenDepthsValueStyle(getTable());
		if (style == null) {
			return;
		}
		List<Integer> newValues = new ArrayList<Integer>(new HashSet<Integer>(style.getIntListValue()));
		newValues.remove(depth);
		Command cmd;
		if (newValues.isEmpty()) {
			cmd = RemoveCommand.create(getTableEditingDomain(), getTable(), NattablestylePackage.eINSTANCE.getStyledElement_Styles(), style);
		} else {
			cmd = RemoveCommand.create(getTableEditingDomain(), style, NattablestylePackage.eINSTANCE.getIntListValueStyle_IntListValue(), depth);
		}
		getTableEditingDomain().getCommandStack().execute(cmd);
	}


}
