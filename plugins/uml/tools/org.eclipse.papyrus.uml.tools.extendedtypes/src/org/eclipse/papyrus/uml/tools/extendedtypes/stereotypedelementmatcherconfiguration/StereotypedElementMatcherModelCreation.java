/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.extendedtypes.stereotypedelementmatcherconfiguration;

import org.eclipse.papyrus.infra.extendedtypes.IElementMatcherConfigurationModelCreation;


/**
 * Factory in charge of the creation of a new element matcher
 */
public class StereotypedElementMatcherModelCreation implements IElementMatcherConfigurationModelCreation<StereotypedElementMatcherConfiguration> {

	/**
	 * {@inheritDoc}
	 */
	public StereotypedElementMatcherConfiguration createConfigurationModel() {
		return StereotypedElementMatcherConfigurationFactory.eINSTANCE.createStereotypedElementMatcherConfiguration();
	}
}
