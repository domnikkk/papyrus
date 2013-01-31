/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.widgets.selectors;

import java.util.ArrayList;
import java.util.List;

/**
 * A Selector for Integer values
 * 
 * @author Camille Letavernier
 * 
 */
public class IntegerSelector extends StringSelector {

	/**
	 * Constructs a Selector for Integer values
	 */
	public IntegerSelector() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer[] getSelectedElements() {
		Integer[] result;
		try {
			String values = text.getText();
			String[] split = values.split(LINE_SEPARATOR);
			List<Integer> resultAsList = new ArrayList<Integer>();
			for(int i = 0; i < split.length; i++) {
				resultAsList.add(Integer.parseInt(split[i]));
			}
			result = resultAsList.toArray(new Integer[resultAsList.size()]);
			//			text.setText(""); //$NON-NLS-1$
		} catch (NumberFormatException ex) {
			result = new Integer[0];
		}
		return result;
	}
}
