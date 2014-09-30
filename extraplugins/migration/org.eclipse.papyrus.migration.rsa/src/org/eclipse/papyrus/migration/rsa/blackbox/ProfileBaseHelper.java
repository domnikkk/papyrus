/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.blackbox;


import java.util.Properties;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint;


public class ProfileBaseHelper {

	/** Key of the ConfigProperty containing the java.util.Properties for ProfileBase#messageKey mappings */
	public static final String PROFILE_BASE_PROPERTIES = "profilebase.properties";

	/**
	 * Reads the constraint's message from the ProfileBase properties file
	 * If the message is not found, the messageKey is returned
	 *
	 * @param context
	 * @param constraint
	 *        The ProfileConstraint element (From ProfileBase profile)
	 * @return
	 *         The ProfileConstraint's message (From the properties file), or the ProfileConstraint's messageKey if the message is not defined
	 */
	@Operation(contextual = true, kind = Kind.QUERY, withExecutionContext = true)
	public String getConstraintMessage(IContext context, ProfileConstraint constraint) {
		String key = constraint.getMessageKey();

		if(key == null) {
			return null;
		}

		Object propertiesObject = context.getConfigProperty(PROFILE_BASE_PROPERTIES);
		if(propertiesObject instanceof Properties) {
			Properties properties = (Properties)propertiesObject;
			return properties.getProperty(key, key);
		}

		return key;
	}

}
