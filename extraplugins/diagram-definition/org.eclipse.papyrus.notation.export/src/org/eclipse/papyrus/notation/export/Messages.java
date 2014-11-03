/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.notation.export;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.notation.export.messages"; //$NON-NLS-1$

	public static String ExportAllDiagrams_0;

	public static String ExportAllDiagrams_1;

	public static String ExportAllDiagrams_2;

	public static String ExportAllDiagrams_3;

	public static String ExportAllDiagrams_4;

	public static String ExportAllDiagrams_5;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
