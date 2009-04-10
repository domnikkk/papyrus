/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.tabbedproperties.uml.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.uml2.uml.TimeEvent;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class TimeEventPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * Parameterized constructor
	 * 
	 * @param timeEvent
	 *            the EObject to edit
	 */
	public TimeEventPropertiesEditionComponent(EObject timeEvent, String mode) {
		super(mode);
		if (timeEvent instanceof TimeEvent) {
			addSubComponent(new TimeEventBasePropertiesEditionComponent(timeEvent, mode));
			addSubComponent(new ElementPropertiesEditionComponent(timeEvent, mode));
		}
	}
}

