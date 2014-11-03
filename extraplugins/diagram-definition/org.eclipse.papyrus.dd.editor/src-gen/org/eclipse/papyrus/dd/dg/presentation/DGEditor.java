/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.papyrus.dd.dg.RootCanvas;
import org.eclipse.papyrus.dd.presentation.DDEditor;
import org.eclipse.papyrus.dd.presentation.DDEditorPlugin;
import org.eclipse.papyrus.dd.presentation.DDModelPage;
import org.eclipse.papyrus.dd.presentation.DDSourcePage;
import org.eclipse.ui.PartInitException;

/**
 * This is an example of a DG model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class DGEditor extends DDEditor {

	/**
	 * The editor id
	 */
	public static final String ID = DGEditor.class.getName();

	/**
	 * The model page
	 */
	private DDModelPage modelPage;

	@Override
	protected void addPages() {
		try {
			addPage(modelPage = new DDModelPage(this), getEditorInput());
			addPage(new DDSourcePage(this), getEditorInput());
			addPage(new DGSVGSourcePage(this), getEditorInput());
			addPage(new DGSVGCanvasPage(this), getEditorInput());
		} catch (PartInitException e) {
			DDEditorPlugin.INSTANCE.log(e);
		}
	}

	@Override
	public EObject getSelectedEObject() {
		if(modelPage == null)
			return null;
		TreeSelection selection = (TreeSelection)modelPage.getViewer().getSelection();
		if(selection.isEmpty()) {
			Resource resource = getEditingDomain().getResourceSet().getResources().get(0);
			return resource.getContents().get(0);
		} else if(selection.getFirstElement() instanceof Resource) {
			Resource resource = (Resource)selection.getFirstElement();
			return resource.getContents().get(0);
		} else {
			EObject obj = (EObject)selection.getFirstElement();
			while(!(obj instanceof RootCanvas))
				obj = obj.eContainer();
			return obj;
		}
	}
}
