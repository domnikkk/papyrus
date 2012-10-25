/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Devernay (Atos) laurent.devernay@atos.net
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.resourceloading.editor;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.core.resourceloading.editor.messages"; //$NON-NLS-1$

	public static String UnloadResourcesEditorModel_0;

	public static String UnloadResourcesEditorModel_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
