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

package org.eclipse.papyrus.infra.nattable.manager.axis;

import java.util.List;

/**
 * @author VL222926
 *
 */
public interface ICompositeAxisManagerForEventList extends ICompositeAxisManager, IAxisManagerForEventList {

	/**
	 *
	 * @param subAxisManager
	 *            the managed axis manager
	 */
	public void setSubAxisManagers(final List<IAxisManagerForEventList> subAxisManager);

}
