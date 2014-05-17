/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.helper;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.EditorUtils;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.Activator;
import org.eclipse.ui.IEditorPart;


public class DiagramHelper {

	public static void refresh(EditPart editPart, boolean recursive) {
		editPart.refresh();
		if(recursive) {
			for(EditPart childEditPart : (List<EditPart>)editPart.getChildren()) {
				refresh(childEditPart, true);
			}
		}
	}

	public static void refresh(DiagramEditPart diagramEditPart, boolean recursive) {
		diagramEditPart.refresh();
		if(recursive) {
			List<EditPart> childrenToRefresh = new LinkedList<EditPart>(diagramEditPart.getChildren());
			for(EditPart childEditPart : childrenToRefresh) {
				refresh(childEditPart, true);
			}
			List<EditPart> connectionsToRefresh = new LinkedList<EditPart>(diagramEditPart.getConnections());
			for(EditPart childEditPart : connectionsToRefresh) {
				refresh(childEditPart, true);
			}
		}
	}

	/**
	 * Refreshes all diagrams in this IEditorPart (Including nested editors when necessary)
	 * 
	 * @param editorPart
	 */
	public static void refresh(IEditorPart editorPart) {
		List<IEditorPart> visibleEditorParts = null;
		if(editorPart instanceof IMultiDiagramEditor) {
			ServicesRegistry servicesRegistry = (ServicesRegistry)editorPart.getAdapter(ServicesRegistry.class);
			if(servicesRegistry != null) {
				try {
					ISashWindowsContainer container = ServiceUtils.getInstance().getISashWindowsContainer(servicesRegistry);
					visibleEditorParts = container.getVisibleIEditorParts();
				} catch (ServiceException e) {
					Activator.log.error(e);
				}
			}
		} else {
			visibleEditorParts = Collections.singletonList(editorPart);
		}

		if(visibleEditorParts != null) {
			for(IEditorPart visiblePart : visibleEditorParts) {
				if(visiblePart instanceof DiagramEditor) {
					DiagramEditor diagramEditor = (DiagramEditor)visiblePart;
					DiagramEditPart topEditPart = diagramEditor.getDiagramEditPart();
					if(topEditPart != null) {
						DiagramHelper.refresh(topEditPart, true);
					}
				}
			}
		}
	}

	private static boolean needsRefresh = false;

	/**
	 * Refreshes all opened diagrams
	 */
	public static void refreshDiagrams() {
		synchronized(DiagramHelper.class) {
			if(!needsRefresh) {
				return;
			}
			needsRefresh = false;
		}

		IMultiDiagramEditor[] editors = EditorUtils.getMultiDiagramEditors();
		if(editors == null || editors.length < 1) {
			return;
		}
		for(IMultiDiagramEditor activeMultiEditor : editors) {
			refresh(activeMultiEditor);
		}
	}

	public synchronized static void setNeedsRefresh() {
		needsRefresh = true;
	}
}
