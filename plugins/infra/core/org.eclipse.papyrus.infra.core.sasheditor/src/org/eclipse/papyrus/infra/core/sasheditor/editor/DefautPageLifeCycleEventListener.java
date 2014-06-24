/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.editor;


/**
 * Default implementation for {@link IPageLifeCycleEventsListener2}. This implementation do nothing.
 * It can be subclassed to overload desired method.
 * 
 * 
 * @author cedric dumoulin
 *
 */
public class DefautPageLifeCycleEventListener implements IPageLifeCycleEventsListener2 {

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener#pageOpened(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param page
	 */
	public void pageOpened(IPage page) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener#pageClosed(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param page
	 */
	public void pageClosed(IPage page) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener#pageActivated(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param page
	 */
	public void pageActivated(IPage page) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener#pageDeactivated(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param page
	 */
	public void pageDeactivated(IPage page) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener#pageAboutToBeOpened(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param page
	 */
	public void pageAboutToBeOpened(IPage page) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener#pageAboutToBeClosed(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param page
	 */
	public void pageAboutToBeClosed(IPage page) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener#pageChanged(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage)
	 *
	 * @param newPage
	 */
	public void pageChanged(IPage newPage) {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener2#pageFirePropertyChange(org.eclipse.papyrus.infra.core.sasheditor.editor.IPage, int)
	 *
	 * @param page
	 * @param propertyId
	 */
	public void pageFirePropertyChange(IPage page, int propertyId) {
	}

}
