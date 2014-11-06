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

package org.eclipse.papyrus.notation.export.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.notation.export.wizards.messages"; //$NON-NLS-1$

	public static String ExportAllWizard_Title;

	public static String ExportDiagramsPage_Title;

	public static String ExportDiagramsPage_Desc;

	public static String ExportDiagramsPage_InputModelFile;

	public static String ExportDiagramsPage_InvalidFile;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
