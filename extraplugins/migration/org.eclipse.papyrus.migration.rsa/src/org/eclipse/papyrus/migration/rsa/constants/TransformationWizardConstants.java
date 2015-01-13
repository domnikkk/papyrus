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
package org.eclipse.papyrus.migration.rsa.constants;

import org.eclipse.papyrus.migration.rsa.Activator;

/**
 * Constants used in the wizard
 */
public interface TransformationWizardConstants {

	/**
	 * The extensions used in the default filters
	 */
	public static final String[] EXTENSIONS = { "*", "*.emx", "*.epx", "*.epx;*.emx" }; //$NON-NLS-1$  //$NON-NLS-2$  //$NON-NLS-3$

	public static final String[] EXTENSIONS_NAMES = { "All", "*.emx", "*.epx", "*.epx and *.emx" }; //$NON-NLS-1$  //$NON-NLS-2$  //$NON-NLS-3$

	/**
	 * The name used for the settings file
	 */
	public static final String TRANSFORMATION_WIZARD_SETTINGS = Activator.PLUGIN_ID + "Wizard.lastUnselection"; //$NON-NLS-1$

	/**
	 * The key to retrieve the selection preferences from the settings file
	 */
	public static final String SELECTION_KEY = "selectionPeferences"; //$NON-NLS-1$

}
