/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
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
package org.eclipse.papyrus.customization.palette.handler;

import java.util.Set;

import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.common.core.service.ProviderPriority;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.part.PapyrusPalettePreferences;
import org.eclipse.ui.XMLMemento;


/**
 * Handler to deploy new configuration of palette based on a XML file
 */
public class DeployExtendedPaletteConfigurationHandler extends AbstractDeployPaletteConfigurationHandler implements IHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IStatus deployPalette(String fileName, String paletteName, String path, ProviderPriority priority, String editorID, Set<String> requiredProfiles) {
		// just add the palette
		PapyrusPalettePreferences.addWorkspaceExtendedPalette(fileName, paletteName, path, priority, editorID, requiredProfiles);
		return new Status(IStatus.OK, Activator.ID, "The palette configuration has been successfully deployed and activated"); 
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IStatus activatePalette(String fileName, String paletteName, String path, ProviderPriority priority, String editorID, Set<String> requiredProfiles) {
		PapyrusPalettePreferences.addWorkspaceExtendedPalette(fileName, paletteName, path, priority, editorID, requiredProfiles);
		PapyrusPalettePreferences.changePaletteVisibility(fileName, editorID, true);
		return new Status(IStatus.OK, Activator.ID, "The palette configuration was already deployed, it has just been activated");
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected XMLMemento getMemento() {
		return PapyrusPalettePreferences.getExistingWorkspaceExtendedPalettes();
	}
}