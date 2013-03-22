/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.controlmode.interfaces;

import org.eclipse.papyrus.controlmode.request.ControlModeRequest;

/**
 * This interface will hold all specific parameter used to {@link ControlModeRequest}
 * 
 * @author adaussy
 * 
 */
public interface ControlModeRequestParameters {

	/**
	 * Parameter used to indicated that the action has been launch from UI
	 */
	public static String IS_UI_ACTION = "org.eclipse.papyrus.controlmode.request.ControlModeRequest.ControlCommandRequestParameter.IsUIAction";////$NON-NLS-0$

	/**
	 * Base key for referencing a target resource into the request
	 */
	public static String TARGET_RESOURCE = "org.eclipse.papyrus.controlmode.request.ControlModeRequest.ControlCommandRequestParameter.TargetResource";////$NON-NLS-0$

	/**
	 * Base key for referencing a source resource into the request
	 */
	public static String SOURCE_RESOURCE = "org.eclipse.papyrus.controlmode.request.ControlModeRequest.ControlCommandRequestParameter.SourceResource";////$NON-NLS-0$

	/**
	 * Key used to store moved diagrams into the request
	 */
	public static String MOVED_DIAGRAM = "org.eclipse.papyrus.controlmode.request.ControlModeRequest.ControlCommandRequestParameter.MOVED_DIAGRAM";////$NON-NLS-0$

	/**
	 * Key used to store moved tab into the request
	 */
	public static String MOVED_TAB = "org.eclipse.papyrus.controlmode.request.ControlModeRequest.ControlCommandRequestParameter.MOVED_TAB";////$NON-NLS-0$

}
