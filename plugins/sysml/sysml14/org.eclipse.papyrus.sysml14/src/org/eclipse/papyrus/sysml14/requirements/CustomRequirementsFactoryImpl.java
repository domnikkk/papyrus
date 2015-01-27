/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml14.requirements;

import org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsFactoryImpl;

/**
 * this class has been added in order to integrated specific implementation of Stereotypes: Requirement.
 * Specific code has been added to calculate derived properties see Requirement Req0010 DerivedProperties
 * 
 *
 */
public class CustomRequirementsFactoryImpl extends RequirementsFactoryImpl implements RequirementsFactory {

	@Override
	public Requirement createRequirement() {
		CustomRequirementImpl customRequirementImpl = new CustomRequirementImpl();
		return customRequirementImpl;
	}

}
