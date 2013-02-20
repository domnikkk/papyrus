/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.figure.node;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.preferences.utils.PreferenceConstantHelper;

/**
 * This class is a {@link WrappingLabel}, which default behavior is set
 * differently :
 * 
 * The text is centered and automatically wraps on several lines.
 */
public class CenteredWrappedLabel extends WrappingLabel {

	/**
	 * Construct an empty wrapping label with customized alignment.
	 */
	public CenteredWrappedLabel() {
		super();
		setTextJustification(WrappingLabel.CENTER);
		setAlignment(WrappingLabel.CENTER);
		setTextWrap(true);
		setBorder(new MarginBorder(6));
	}

	//Capping the size of the label to a certain value. 
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension preferredSize = super.getPreferredSize(wHint, hHint);
		int maxWidth = getMaxLabelWidth();
		if(preferredSize.width > maxWidth) {
			return super.getPreferredSize(maxWidth, -1);
		}
		return preferredSize;
	}

	public int getMaxLabelWidth() {
		String nodeWidthConstant = PreferenceConstantHelper.getPapyrusEditorConstant(PreferenceConstantHelper.NODE_LABEL_MAXIMUM_WIDTH);
		IPreferenceStore preferenceStore = org.eclipse.papyrus.preferences.Activator.getDefault().getPreferenceStore();
		int maxLabelWidth = preferenceStore.getInt(nodeWidthConstant);
		return maxLabelWidth;
	}

}
