/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.adl4eclipsetool.table.tester;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.adl4eclipse.org.IADL4ECLIPSE_Stereotype;
import org.eclipse.papyrus.adl4eclipsetool.table.Activator;
import org.eclipse.papyrus.adl4eclipsetool.table.Messages;
import org.eclipse.papyrus.infra.nattable.tester.ITableTester;
import org.eclipse.papyrus.osgi.profile.IOSGIStereotype;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

public class TableArchitectureCreationTester implements ITableTester {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IStatus isAllowed(Object context) {
		if (context instanceof Package) {
			Package package_= (Package)context;
			// check OSGI and eclipse profile
			IStatus ADL4EclipseStatus = checkProfileApplied(package_, IADL4ECLIPSE_Stereotype.ADL4ECLIPSE);
			IStatus oSGIStatus = checkProfileApplied(package_, IOSGIStereotype.OSGI);
			IStatus oSGIModuleLayerStatus = checkProfileApplied(package_, IOSGIStereotype.OSGI_MODULE_LAYER);
			if(!ADL4EclipseStatus.isOK() || !oSGIStatus.isOK() || !oSGIModuleLayerStatus.isOK()) {
				return new MultiStatus(Activator.PLUGIN_ID, IStatus.OK, new IStatus[] {ADL4EclipseStatus, oSGIStatus, oSGIModuleLayerStatus}, Messages.TableArchitectureCreationTester_MissingRequiredProfiles, null);
			}
			return Status.OK_STATUS;
			
		}
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.TableArchitectureCreationTester_NotAPackage);
	}


	protected IStatus checkProfileApplied(Package package_, String profileQualifiedName) {
		Profile profile = package_.getAppliedProfile(profileQualifiedName, true);
		if(profile==null) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, NLS.bind(Messages.TableArchitectureCreationTester_MissingNamedProfile, profileQualifiedName));
		}
		return Status.OK_STATUS;
	}
}
