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

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.Iterables;

/**
 * @author damus
 *
 */
abstract class AbstractDecoratorModelUpdaterDelegate implements IDecoratorModelUpdaterDelegate {

	private final Package package_;

	public AbstractDecoratorModelUpdaterDelegate(Package package_) {
		super();

		this.package_ = package_;
	}

	protected final Package getControlledPackage() {
		return package_;
	}

	@Override
	public Package getDecoratorPackage(Resource resource) {
		Package result = null;

		URI packageURI = EcoreUtil.getURI(package_);
		for (ApplyProfiles next : Iterables.filter(resource.getContents(), ApplyProfiles.class)) {
			Dependency dep = next.getBase_Dependency();
			if ((dep != null) && !dep.getClients().isEmpty()) {
				if (EcoreUtil.getURI(dep.getClients().get(0)).equals(packageURI)) {
					// that's the one
					result = Iterables.getFirst(Iterables.filter(dep.getSuppliers(), Package.class), null);
					if (result != null) {
						break;
					}
				}
			}
		}

		return result;
	}

	@Override
	public Package createDecoratorPackage(Resource resource) {
		Package result = null;

		Package root = DecoratorModelUtils.getDecoratorModel(resource);
		if (root != null) {
			result = DecoratorModelUtils.getDecoratorPackage(root, package_, true);
		}

		return result;
	}

	@Override
	public ProfileApplication getProfileApplication(Package package_, URI appliedProfileURI) {
		ProfileApplication result = null;

		for (ProfileApplication next : package_.getProfileApplications()) {
			Profile profile = next.getAppliedProfile();
			if ((profile != null) && EcoreUtil.getURI(profile).equals(appliedProfileURI)) {
				result = next;
				break;
			}
		}

		return result;
	}

}
