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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.custom.providers;

import org.eclipse.papyrus.uml.diagram.usecase.custom.factory.CustomUMLEditPartFactory;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLEditPartProvider;

/**
 * This abstract edit part provider restricts its contribution to view that are owned by
 * a given type of diagram.
 */
public class CustomUMLEditPartProvider extends UMLEditPartProvider {

	public CustomUMLEditPartProvider() {
		setFactory(new CustomUMLEditPartFactory());
	}
}
