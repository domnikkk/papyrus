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
 * A Selector for Boolean values
 * 
 * @author Olivier Mélois
 * 
 */
public class BooleanSelector extends StringSelector {

	/**
	 * Constructs a Selector for Integer values
	 */
	public BooleanSelector() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean[] getSelectedElements() {
		Boolean[] result;
		try {
			String values = text.getText();
			String[] split = values.split(LINE_SEPARATOR);
			List<Boolean> resultAsList = new ArrayList<Boolean>();
			for (int i = 0; i<split.length; i++){
				resultAsList.add(Boolean.parseBoolean(split[i]));
			}
			result = resultAsList.toArray(new Boolean[resultAsList.size()]);
		} catch (NumberFormatException ex) {
			result = new Boolean[0];
		}
		return result;
	}
}
