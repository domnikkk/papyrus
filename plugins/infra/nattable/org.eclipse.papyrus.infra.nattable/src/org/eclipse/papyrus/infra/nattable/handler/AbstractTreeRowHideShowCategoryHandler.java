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

import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;


/**
 * @author VL222926
 *
 */
public abstract class AbstractTreeRowHideShowCategoryHandler extends AbstractTreeTableHandler {

	/**
	 *
	 * @return
	 *         <code>true</code> if all categories are currently hidden
	 */
	protected boolean allCategoriesAreCurrentlyHidden() {
		Table table = getTable();
		IntListValueStyle values = (IntListValueStyle) table.getNamedStyle(NattablestylePackage.eINSTANCE.getIntListValueStyle(), NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
		if (values == null) {
			return false;
		}
		int maxDepth = FillingConfigurationUtils.getMaxDepthForTree(getTable());
		return values.getIntListValue().size() == (maxDepth + 1);
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if all categories are currently visible
	 */
	protected boolean allCategoriesAreCurrentlyVisible() {
		Table table = getTable();
		IntListValueStyle values = (IntListValueStyle) table.getNamedStyle(NattablestylePackage.eINSTANCE.getIntListValueStyle(), NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
		return values == null || values.getIntListValue().isEmpty();
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
			if (FillingConfigurationUtils.getAllTreeFillingConfiguration(getTable()).size() == 0) {
				setBaseEnabled(false);
			}
		}
	}
}
