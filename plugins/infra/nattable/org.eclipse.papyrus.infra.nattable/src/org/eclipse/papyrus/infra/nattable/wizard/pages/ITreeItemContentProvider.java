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

package org.eclipse.papyrus.infra.nattable.wizard.pages;

import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;

/**
 * @author VL222926
 *
 */
// TODO : move me?
public class ITreeItemContentProvider implements ITreeContentProvider {
	/**
	 *
	 */
	@Override
	public void dispose() {
		// nothing to do
	}

	/**
	 *
	 * @param arg0
	 * @return
	 */
	@Override
	public boolean hasChildren(Object arg0) {
		if (arg0 instanceof ITreeItemAxis) {
			return !((ITreeItemAxis) arg0).getChildren().isEmpty();
		}
		return false;
	}

	/**
	 *
	 * @param arg0
	 * @return
	 */
	@Override
	public Object getParent(Object arg0) {
		if (arg0 instanceof ITreeItemAxis) {
			return ((ITreeItemAxis) arg0).getParent();
		}
		return null;
	}

	/**
	 *
	 * @param arg0
	 * @return
	 */
	@Override
	public Object[] getElements(Object arg0) {
		if (arg0 instanceof Collection<?>) {
			return ((Collection<?>) arg0).toArray();
		}
		return new Object[] { arg0 };
	}

	/**
	 *
	 * @param arg0
	 * @return
	 */
	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof ITreeItemAxis) {
			return ((ITreeItemAxis) arg0).getChildren().toArray();
		}
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 *
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		// nothing to do
	}
}
