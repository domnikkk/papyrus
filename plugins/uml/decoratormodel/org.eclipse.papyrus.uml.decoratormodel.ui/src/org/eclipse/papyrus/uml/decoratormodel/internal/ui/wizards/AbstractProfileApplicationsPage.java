/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers.EncapsulatedAdapterFactoryLabelProvider;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * @author damus
 *
 */
abstract class AbstractProfileApplicationsPage extends AbstractProfileApplicationSelectionPage<Package, ProfileApplication> {

	public AbstractProfileApplicationsPage(String name, String title, ImageDescriptor icon) {
		super(name, title, icon, ProfileApplication.class);
	}

	@Override
	protected IBaseLabelProvider createProfilesLabelProvider() {
		return EncapsulatedAdapterFactoryLabelProvider.appliedProfiles();
	}
}
