/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.m2m.qvto;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.IContext;


public class PropertiesUtil {

	@Operation(withExecutionContext = true, kind = Kind.HELPER)
	public String getStringProperty(IContext context, String property) {
		return (String)context.getConfigProperty(property);
	}

	@Operation(withExecutionContext = true, kind = Kind.HELPER)
	public boolean getBooleanProperty(IContext context, String property) {
		return Boolean.parseBoolean(context.getConfigProperty(property).toString());
	}

	@Operation(withExecutionContext = true, kind = Kind.HELPER)
	public int getIntegerProperty(IContext context, String property) {
		return Integer.parseInt(context.getConfigProperty(property).toString());
	}

	@Operation(withExecutionContext = true, kind = Kind.HELPER)
	public EObject getEObjectProperty(IContext context, String property) {
		Object value = context.getConfigProperties().get(property);
		if(value instanceof EObject) {
			return (EObject)value;
		}
		return null;
	}

}
