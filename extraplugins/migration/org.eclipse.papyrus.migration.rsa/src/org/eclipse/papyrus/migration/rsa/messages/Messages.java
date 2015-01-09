/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.messages;

import org.eclipse.osgi.util.NLS;

/**
 * UI text to externalize
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.migration.rsa.messages.messages"; //$NON-NLS-1$
	public static String TransformationWizard_Title;
	public static String TransformationSelectionPage_Name;
	public static String TransformationSelectionPage_Title;
	public static String TransformationSelectionPage_Description;
	public static String TransformationConfigPage_Name;
	public static String TransformationConfigPage_Title;
	public static String TransformationConfigPage_Description;
	public static String Button_SelectAll;
	public static String Button_DeselectAll;
	public static String MultipleStringFileEditor_2;
	public static String WrongFileType;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
