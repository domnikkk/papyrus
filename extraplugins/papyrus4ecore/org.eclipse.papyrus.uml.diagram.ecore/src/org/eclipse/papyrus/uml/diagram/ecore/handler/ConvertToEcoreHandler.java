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
 *  Benoit Maggi benoit.maggi@cea.fr  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.ecore.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.diagram.ecore.dialog.PapyrusUML2EcoreConverterOptionsDialog;
import org.eclipse.papyrus.uml.diagram.ecore.util.ConvertToEcoreUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * handler for the transformation from uml to ecore 
 * @author Benoit Maggi
 */
public class ConvertToEcoreHandler extends AbstractHandler {

	private List<?> selection = Collections.emptyList();

	protected List<?> getSelection() {
		return selection;
	}	

	/**
	 * Set the selection
	 * @param event
	 */
	protected void setSelection(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		this.selection = (selection instanceof IStructuredSelection) ? ((IStructuredSelection)selection).toList() : Collections.emptyList();
	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get selection from handler event
		setSelection(event);
		Package package_ = getSelectedPackage();
		if (package_ != null){
			final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			final Map<String, String> options = new HashMap<String, String>();
			final String label = "Convert Uml to Ecore";
			final String message = "Convert Uml to Ecore";
			MessageDialog optionsDialog = new PapyrusUML2EcoreConverterOptionsDialog(shell, label,message , options); 
			if(optionsDialog.open() == Window.OK) {
				ConvertToEcoreUtil.convertToEcore(package_, options);
			}			
		}
		return null;
	}



	/**
	 * Return the selected package for the uml to ecore transformation
	 * @return
	 */
	protected Package getSelectedPackage() {
		List<EObject> selectedElements = getSelectedElements();
		if (selectedElements != null && selectedElements.size() > 0){
			EObject eObject = selectedElements.get(0);
			if(eObject instanceof Element) {
				return ((Element)eObject).getNearestPackage();
			}
		}
		return null;
	}

	/**
	 * <pre>
	 * Parse current selection and extract the list of {@link EObject} from
	 * this selection.
	 * 
	 * This also tries to adapt selected element into {@link EObject}
	 * (for example to get the {@link EObject} from a selection in the ModelExplorer).
	 * 
	 * @return a list of currently selected {@link EObject}
	 * </pre>
	 *
	 */
	protected List<EObject> getSelectedElements() {
		List<EObject> selectedEObjects = new ArrayList<EObject>();
		// Get current selection
		Collection<?> selection = getSelection();
		// Treat non-null selected object (try to adapt and return EObject)
		if(!selection.isEmpty()) {
			// Parse current selection
			for(Object current : selection) {
				// Adapt current selection to EObject
				EObject selectedEObject = EMFHelper.getEObject(current);
				if(selectedEObject != null) {
					// we avoid to add null element in the list!
					selectedEObjects.add(selectedEObject);
				}
			}
		}
		return selectedEObjects;
	}
}
