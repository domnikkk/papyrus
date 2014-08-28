/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.domain;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.papyrus.infra.gmfdiag.common.AbstractPapyrusGmfCreateDiagramCommandHandler;
import org.eclipse.papyrus.uml.diagram.domain.provider.ElementTypes;

// Start of user code custom imports
//  End of user code

public class DomainDiagramCreateCommand extends AbstractPapyrusGmfCreateDiagramCommandHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getDefaultDiagramName() {
		return "NewDiagram"; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getDiagramNotationID() {
		return ElementTypes.DIAGRAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected PreferencesHint getPreferenceHint() {
		return Activator.DIAGRAM_PREFERENCES_HINT;
	}

	// Start of user code Custom creation command

	// End of user code
}
