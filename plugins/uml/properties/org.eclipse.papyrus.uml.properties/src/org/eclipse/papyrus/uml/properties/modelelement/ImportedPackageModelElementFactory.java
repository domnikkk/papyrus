/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.uml.properties.modelelement;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.papyrus.views.properties.Activator;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.EMFModelElementFactory;
import org.eclipse.uml2.uml.Element;


/**
 * A factory for creating ImportedPackageModelElement objects.
 *
 * @author Gabriel Pascual
 */
public class ImportedPackageModelElementFactory extends EMFModelElementFactory {


	/** The Constant RESOLUTION_WARNING_MESSAGE. */
	private static final String RESOLUTION_WARNING_MESSAGE = "Unable to resolve the selected element to a UML Element";

	/**
	 * Do create from source.
	 *
	 * @param source
	 *            the source
	 * @param context
	 *            the context
	 * @return the imported package model element
	 * @see org.eclipse.papyrus.views.properties.modelelement.EMFModelElementFactory#doCreateFromSource(java.lang.Object, org.eclipse.papyrus.views.properties.contexts.DataContextElement)
	 */
	@Override
	protected ImportedPackageModelElement doCreateFromSource(Object source, DataContextElement context) {
		Element umlSource = UMLUtil.resolveUMLElement(source);
		if (umlSource == null) {
			Activator.log.warn(RESOLUTION_WARNING_MESSAGE);
			return null;
		}

		EditingDomain domain = EMFHelper.resolveEditingDomain(umlSource);
		return new ImportedPackageModelElement(umlSource, domain);
	}

}
