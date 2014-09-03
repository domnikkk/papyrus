/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *   Arthur Daussy - Bug 354622 - [ActivityDiagram] Object Flows selection prevent selecting other close elements.
 *   Céline Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 440230 - Margin Label
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.figure.node;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.IPapyrusWrappingLabel;

/**
 * This correct the bug where invisible label can be selected
 *
 * @author arthur daussy
 */
public class PapyrusWrappingLabel extends WrappingLabel implements IPapyrusWrappingLabel{

	/**
	 * Bug 354622 - [ActivityDiagram] Object Flows selection prevent selecting other close elements.
	 * On this bug bug come from that invisible label return true containsPoint(int, int) even if there invisible
	 *
	 * This is a temporary fix until the real issue described in Bug 363362
	 * (https://bugs.eclipse.org/bugs/show_bug.cgi?id=363362) is fixed by GMF.
	 *
	 * @see org.eclipse.draw2d.Figure#containsPoint(int, int)
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	@Override
	public boolean containsPoint(int x, int y) {
		if (isVisible()) {
			return super.containsPoint(x, y);
		}
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.figure.IPapyrusWrappingLabel#setMarginLabel(int, int)
	 *
	 * @param xMargin Horizontal margin
	 * @param yMargin Vertical margin
	 */
	@Override
	public void setMarginLabel(int xMargin, int yMargin) {

		MarginBorder mb = new MarginBorder(xMargin, yMargin, xMargin, yMargin);
		this.setBorder(mb);
		
		
		
		
	}


}
