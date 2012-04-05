/*******************************************************************************
 * Copyright (c) 2008 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.sysml.diagram.internalblock.edit.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.diagram.common.actions.AbstractAction;
import org.eclipse.papyrus.sysml.diagram.internalblock.commands.RestoreRelatedLinksAndPortCommand;
import org.eclipse.papyrus.sysml.diagram.internalblock.provider.ElementTypes;
import org.eclipse.ui.PlatformUI;

/**
 * Restore related links to selected element
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class RestoreRelatedLinksAction extends AbstractAction {

	public static String ID = "papyrus.restoreRelatedLinksAction";

	public RestoreRelatedLinksAction() {
		setId(ID);
		setText("Restore Related Elements");
		setToolTipText("Restore Related Elements");
		// setImageDescriptor(Plugin.getBundledImageDescriptor("icons/*.gif"));
	}

	/**
	 * @return
	 */
	protected String getDiagramNotationID() {
		return ElementTypes.DIAGRAM_ID;
	}

	/**
	 * @see org.eclipse.jface.action.Action#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		Diagram currentDiagram = getCurrentDiagram();
		if(currentDiagram != null) {
			return (!getSelection().isEmpty() && getDiagramNotationID().equals(currentDiagram.getType()));
		}
		return false;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		List<IGraphicalEditPart> selection =getIGraphicalPartSelection();

		if(selection.isEmpty()) {
			return;
		}

		if(false == getHost() instanceof DiagramEditPart) {
			return;
		}
		DiagramEditPart diagramEditPart = (DiagramEditPart)getHost();

		final DiagramCommandStack commandStack = getHost().getDiagramEditDomain().getDiagramCommandStack();
		CompoundCommand cmd = new CompoundCommand("Restore Related Links");
		cmd.add(new ICommandProxy(new RestoreRelatedLinksAndPortCommand(diagramEditPart, selection)));
		commandStack.execute(cmd, new NullProgressMonitor());
	}
	
	
	/**
	 * @return a list of selected objects view
	 */
	protected List<IGraphicalEditPart> getIGraphicalPartSelection() {
		List<IGraphicalEditPart> viewSelected = new ArrayList<IGraphicalEditPart>();
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if(false == selection instanceof IStructuredSelection) {
			return Collections.emptyList();
		}
		for(Object object : ((IStructuredSelection)selection).toList()) {
			if(false == object instanceof IGraphicalEditPart) {
				continue;
			}
			if(object instanceof DiagramEditPart) {
				continue;
			}
			viewSelected.add((IGraphicalEditPart)object);
		}
		return viewSelected;
	}

}
