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

package org.eclipse.papyrus.infra.tools.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author VL222926
 *
 */
public class TypeUtils {

	/**
	 * Constructor.
	 *
	 */
	private TypeUtils() {
		// to prevent instanciation
	}

	/**
	 * 
	 * @param str
	 *            a string representing a boolean
	 * @return
	 *         <code>true</code> if the string represents a valid boolean
	 */
	public static final boolean isBooleanValue(String str) {
		return "true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * 
	 * @param str
	 *            a string representing a boolean
	 * @return
	 *         <code>true</code> if the string represents a valid boolean
	 */
	public static final boolean isIntegerValue(String str) {
		/** the pattern that checks visual ids are valid integers */
		Pattern digit = Pattern.compile("\\d+");
		boolean result = false;
		Matcher matcher = digit.matcher(str);
		if (matcher != null) {
			result = matcher.matches();
		}
		return result;
	}
}
