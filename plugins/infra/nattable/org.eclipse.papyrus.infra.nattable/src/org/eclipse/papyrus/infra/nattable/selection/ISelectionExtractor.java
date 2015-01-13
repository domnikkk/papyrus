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

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * @author VL222926
 *         This interface is used to obtain real object provided by a structured selection.
 *         It allows to remove emf dependencies during the manipulation of the contents of the table
 */
public interface ISelectionExtractor {

	/**
	 *
	 * @param structuredSelection
	 *            a structured selection
	 * @return
	 *         a collection representing the object encapsulated in the selection
	 */
	public Collection<?> extractSelectedObjects(IStructuredSelection structuredSelection);

}
