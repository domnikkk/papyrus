/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Ansgar Radermacher (CEA LIST) - ansgar.radermacher@cea.fr
 *	Camille Letavernier (CEA LIST) - camille.letavernier@cea.fr - Bug 439031
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.decoration.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.infra.services.decoration.Activator;
import org.eclipse.papyrus.infra.services.decoration.IDecorationSpecificFunctions;



/**
 * Return access to the extensions of interface IDecorationSpecificFunctions
 *
 * @author ansgar
 *
 */
public class DecorationSpecificFunctions {

	public static final String DECORATION_SPECIFIC_FUNCTIONS_ID = Activator.PLUGIN_ID + ".decorationSpecificFunctions";

	public static final String DECORATION_TYPE_ID = "decorationType";

	public static Map<String, IDecorationSpecificFunctions> decorationFunctions;

	public static IDecorationSpecificFunctions getDecorationInterface(String decorationType) {
		if (decorationFunctions == null) {
			parseDecorationFunctions();
		}

		return decorationFunctions.get(decorationType);
	}

	private static void parseDecorationFunctions() {
		decorationFunctions = new HashMap<String, IDecorationSpecificFunctions>();

		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] configElements = reg.getConfigurationElementsFor(DECORATION_SPECIFIC_FUNCTIONS_ID);
		for (IConfigurationElement configElement : configElements) {
			try {
				final String iConfiguratorIDext = configElement.getAttribute(DECORATION_TYPE_ID);
				if (iConfiguratorIDext != null) {
					final Object obj = configElement.createExecutableExtension("class");
					if (obj instanceof IDecorationSpecificFunctions) {
						decorationFunctions.put(iConfiguratorIDext, (IDecorationSpecificFunctions) obj);
					} else {
						Activator.log.warn(String.format("The plug-in %s contributed an invalid class to the %s extension point. Contributions should extend %s", //$NON-NLS-1$
								configElement.getContributor(), DECORATION_SPECIFIC_FUNCTIONS_ID, IDecorationSpecificFunctions.class.getSimpleName()));
					}
				}
			} catch (CoreException exception) {
				Activator.log.error(exception);
			}
		}
	}
}
