/*****************************************************************************
 * Copyright (c) 2011, 2014 Atos Origin, CEA LIST and etc.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 436947 
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.controlmode.profile;

import org.eclipse.osgi.util.NLS;

/**
 * This class handles messages internationalization.
 *
 * @author vhemery
 */
public class Messages extends NLS {

	/** The Constant BUNDLE_NAME. */
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.uml.controlmode.profile.messages"; //$NON-NLS-1$

	/** Message for switching the loading strategy when controlled package is not loaded. */
	public static String switch_loading_strategy;

	/** Error message when controlled package is read-only. */
	public static String error_readonly;

	/** Error message when an error occurs during validation. */
	public static String error_during_validation;

	/** Message for control mode dialog. */
	public static String UMLProfileControlParticipant_controlmode_dialog_message;

	/** Title for control mode dialog. */
	public static String UMLProfileControlParticipant_controlmode_dialog_title;

	public static String UMLProfileControlParticipant_Post_Control_Command_Label;

	public static String UMLProfileControlParticipant_Post_Uncontrol_Command_Label;

	public static String UMLProfileControlParticipant_Pre_Uncontrol_Command_Label;

	/** Error message when trying to delete a duplicated profile application. */
	public static String warning_cannot_delete_duplicated;

	/** Error message when trying to delete a duplicated profile application. */
	public static String warning_cannot_delete_duplicated_alt;

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
