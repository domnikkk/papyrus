/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - support pluggable edit-part conflict detection (CDO)
 *  Céline Janssens (ALL4TEC) - Override getDragTracker with the PapyrusRubberbandDragTracker
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.editpart;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.SelectionRequest;
import org.eclipse.gef.tools.DeselectAllTracker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.XYLayoutWithConstrainedResizedEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.selection.PapyrusRubberbandDragTracker;

public class PapyrusDiagramEditPart extends DiagramEditPart {

	private IConflictingEditPartFilter conflictFilter = IConflictingEditPartFilter.DEFAULT;

	/**
	 * Id of the right clic button
	 */
	public final static int RIGHT_MOUSE_BUTTON = 3;

	public PapyrusDiagramEditPart(View diagramView) {
		super(diagramView);
	}

	@Override
	protected void removeChild(EditPart child) {
		if(!getConflictingEditPartFilter().isConflicting(child)) {
			super.removeChild(child);
		}
	}

	public IConflictingEditPartFilter getConflictingEditPartFilter() {
		return conflictFilter;
	}

	public void setConflictingEditPartFilter(IConflictingEditPartFilter filter) {
		this.conflictFilter = (filter == null) ? IConflictingEditPartFilter.DEFAULT : filter;
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart#createDefaultEditPolicies()
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutWithConstrainedResizedEditPolicy());
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart#getDragTracker(org.eclipse.gef.Request)
	 *
	 * @param req
	 * @return a New DragTracker
	 */
	@Override
	public DragTracker getDragTracker(Request req) {

		// In case of new selection and right-click deselect previous trackers
		if(req instanceof SelectionRequest && ((SelectionRequest)req).getLastButtonPressed() == RIGHT_MOUSE_BUTTON) {
			return new DeselectAllTracker(this);
		}

		// This new tracker includes connections, Labels, nodes and different Behaviors
		return new PapyrusRubberbandDragTracker();

	}
}
