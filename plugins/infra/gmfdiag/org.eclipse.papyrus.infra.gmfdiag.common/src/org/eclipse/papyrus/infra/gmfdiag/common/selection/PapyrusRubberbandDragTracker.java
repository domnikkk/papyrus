/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Céline Janssens (ALL4TEC) celine.janssens@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.selection;

import org.eclipse.gef.DragTracker;


/**
 * This DragTracker extends the PapyrusRubberbandSelectionTool.
 * This class is called by the method getDragTracker() in the PapyrusDiagramEditPart.
 * 
 * @author cjanssens
 */
public class PapyrusRubberbandDragTracker extends PapyrusRubberbandSelectionTool implements DragTracker {


	/**
	 * Constructor.
	 */
	public PapyrusRubberbandDragTracker() {
		super();
		setMarqueeBehavior(BEHAVIOR_OBJECT_INCLUDED);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.tools.AbstractTool#handleFinished()
	 */
	protected void handleFinished() {
		//nothing goes here

	}

}
