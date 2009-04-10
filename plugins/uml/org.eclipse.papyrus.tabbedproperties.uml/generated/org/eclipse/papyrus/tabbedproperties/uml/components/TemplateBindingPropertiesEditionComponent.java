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
import org.eclipse.uml2.uml.TemplateBinding;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class TemplateBindingPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * Parameterized constructor
	 * 
	 * @param templateBinding
	 *            the EObject to edit
	 */
	public TemplateBindingPropertiesEditionComponent(EObject templateBinding, String mode) {
		super(mode);
		if (templateBinding instanceof TemplateBinding) {
			addSubComponent(new TemplateBindingBasePropertiesEditionComponent(templateBinding, mode));
			addSubComponent(new ElementPropertiesEditionComponent(templateBinding, mode));
		}
	}
}

