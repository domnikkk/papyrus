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
package org.eclipse.papyrus.uml.diagram.common.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;
import org.eclipse.papyrus.uml.diagram.common.part.IPaletteDescription;
import org.eclipse.papyrus.uml.diagram.paletteconfiguration.Activator;
import org.eclipse.papyrus.uml.diagram.paletteconfiguration.PaletteConfiguration;
import org.eclipse.papyrus.uml.diagram.paletteconfiguration.PaletteconfigurationPackage;

/**
 * Palette provider to be used for palettes defined by models, when they are located in the workspace (deployment at runtime)
 */
public class WorkspaceExtendedPaletteProvider extends ExtendedPluginPaletteProvider implements IPaletteProvider {

	protected boolean loadResourceExceptionLogged = false;

	/**
	 * locally defines palette
	 * 
	 * @param description
	 *        the description of the palette to build
	 */
	public void setContributions(IPaletteDescription description) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Object paletteContributions = description.getContributions();
		contributions = Collections.emptyList();
		if(!(paletteContributions instanceof String)) {
			return;
		}
		Resource resource = loadResourceFromWorkspace((String)paletteContributions, resourceSet);
		if(resource != null) {
			try {
				resource.load(Collections.emptyMap());
				if(resource.getContents().size() > 0) {
					contributions = new ArrayList<PaletteConfiguration>(EcoreUtil.<PaletteConfiguration> getObjectsByType(resource.getContents(), PaletteconfigurationPackage.eINSTANCE.getPaletteConfiguration()));
				}
			} catch (IOException e) {
				if(!loadResourceExceptionLogged) {
					Activator.log.debug("Impossible to load the resource for palette: " + description);
					loadResourceExceptionLogged = true;
				}
				contributions = Collections.emptyList();
			}
		}
	}
}
