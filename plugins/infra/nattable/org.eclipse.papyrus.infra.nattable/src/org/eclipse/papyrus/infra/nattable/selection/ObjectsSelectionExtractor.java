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

package org.eclipse.papyrus.infra.nattable.selection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * @author VL222926
 *         This class has been created to avoid dependencies on EMF manipulating eobject referenced by the table
 */
public class ObjectsSelectionExtractor implements ISelectionExtractor {


	/**
	 *
	 * @param structuredSelection
	 *            a structured selection
	 * @return
	 *         the object owned by the selected
	 */
	@Override
	public final Collection<?> extractSelectedObjects(IStructuredSelection structuredSelection) {
		List<Object> result = new ArrayList<Object>(structuredSelection.size());

		for (Iterator<?> iter = structuredSelection.iterator(); iter.hasNext();) {
			Object realObject = getRealObject(iter.next());
			if (realObject != null) {
				result.add(realObject);
			}
		}

		return result;
	}

	/**
	 *
	 * @param object
	 *            an object
	 * @return
	 *         the real object
	 */
	protected Object getRealObject(final Object object) {
		return object;
	}
}
