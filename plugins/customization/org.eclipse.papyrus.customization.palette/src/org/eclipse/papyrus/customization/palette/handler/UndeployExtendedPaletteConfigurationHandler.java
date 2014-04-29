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
package org.eclipse.papyrus.customization.palette.handler;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.part.PapyrusPalettePreferences;
import org.eclipse.ui.XMLMemento;



/**
 * Handler to undeploy a palette configured by a EMF model. similar implementation to the XML based palette, because visibility has the same implementation in our case.
 */
public class UndeployExtendedPaletteConfigurationHandler extends AbstractUndeployPaletteConfigurationHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IStatus deactivatePalette(String identifier, String editorId) {
		PapyrusPalettePreferences.changePaletteVisibility(identifier, editorId, false);
		return new Status(IStatus.OK, Activator.ID, "The palette configuration "+identifier+" has been successfully deactivated and undeployed");
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected XMLMemento getMemento() {
		return PapyrusPalettePreferences.getExistingWorkspaceExtendedPalettes();
	}
}
