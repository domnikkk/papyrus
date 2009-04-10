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
import org.eclipse.uml2.uml.Manifestation;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class ManifestationPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * Parameterized constructor
	 * 
	 * @param manifestation
	 *            the EObject to edit
	 */
	public ManifestationPropertiesEditionComponent(EObject manifestation, String mode) {
		super(mode);
		if (manifestation instanceof Manifestation) {
			addSubComponent(new ManifestationBasePropertiesEditionComponent(manifestation, mode));
			addSubComponent(new ElementPropertiesEditionComponent(manifestation, mode));
		}
	}
}

