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
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * @author damus
 *
 */
public interface IDecoratorModelUpdaterDelegate {

	Package getDecoratorPackage(Resource resource);

	Package createDecoratorPackage(Resource resource);

	ProfileApplication getProfileApplication(Package package_, URI appliedProfileURI);

	ProfileApplication addProfileApplication(Package package_, URI profileURI, URI appliedDefinitionURI);

}
