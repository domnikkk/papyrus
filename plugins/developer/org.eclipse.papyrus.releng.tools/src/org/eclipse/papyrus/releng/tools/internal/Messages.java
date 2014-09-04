/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366567 - [Releng] Tool to update rmaps
 *******************************************************************************/
package org.eclipse.papyrus.releng.tools.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.releng.tools.internal.messages"; //$NON-NLS-1$
	public static String UpdateRMapAction_mapWasUpdatedTitle;
	public static String UpdateRMapAction_chooseBuildModel;
	public static String UpdateRMapAction_chooseBuildModelLong;
	public static String UpdateRMapAction_error;
	public static String UpdateRMapAction_mapWasUpdated;
	public static String UpdateRMapAction_noBuildModelFound;
	public static String UpdateRMapAction_noBuildModelFoundLong;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
