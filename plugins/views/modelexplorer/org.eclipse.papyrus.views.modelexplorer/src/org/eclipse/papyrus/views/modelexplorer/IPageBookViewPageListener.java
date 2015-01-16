/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.views.modelexplorer;

import org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.MultiViewPageBookView;
import org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.ViewPartPage;

/**
 * A protocol for notification of page selection change and closing in the Model Explorer view.
 */
interface IPageBookViewPageListener {
	void pageActivated(MultiViewPageBookView pageBookView, ViewPartPage page);

	void pageClosing(MultiViewPageBookView pageBookView, ViewPartPage page);
}
