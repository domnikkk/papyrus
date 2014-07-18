/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	public static String Notification_Drop_Title;

	public static String Notification_Drop_UMLAssociationWarning;

	static {
		NLS.initializeMessages("messages", Messages.class); //$NON-NLS-1$
	}

	private Messages() {
	}
}
