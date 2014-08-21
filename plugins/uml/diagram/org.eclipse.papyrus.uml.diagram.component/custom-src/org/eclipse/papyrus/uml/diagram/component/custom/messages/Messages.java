/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Amine EL KOUHEN (CEA LIST/INRIA DaRT) amine.el_kouhen@inria.fr
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.custom.messages;

import org.eclipse.osgi.util.NLS;

// TODO: Auto-generated Javadoc
/**
 * The Class Messages.
 */
public class Messages extends NLS {

	/** The Constant BUNDLE_NAME. */
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.uml.diagram.component.custom.messages.messages"; //$NON-NLS-1$

	/** The Show hide related contents action_ message. */
	public static String ShowHideRelatedContentsAction_Message;

	/** The Show hide related contents action_ title. */
	public static String ShowHideRelatedContentsAction_Title;


	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * Instantiates a new messages.
	 */
	private Messages() {
	}
}
