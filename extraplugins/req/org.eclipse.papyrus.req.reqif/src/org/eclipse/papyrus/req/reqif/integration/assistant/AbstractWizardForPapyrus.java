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
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.req.reqif.integration.assistant;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
/**
 * Abstract wizard that contains method to get the selection, the model Set...
 *
 */
public abstract class AbstractWizardForPapyrus extends Wizard {

	protected TransactionalEditingDomain transactionalEditingDomain = null;
	protected PapyrusMultiDiagramEditor papyrusEditor;
	protected ModelSet modelSet;
	protected ResourceSet resourceSet;

	/**
	 * 
	 * Constructor.
	 *
	 */
	public AbstractWizardForPapyrus() {
		super();
	}

	/**
	 * this method is used in order to initialize  service registry domain and model set: indispensable element in order to execute command
	 * @param workbench the eclipse workbench
	 * @param selection the current Selection
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

		//get the service registry of papyrus from the selection
		ServicesRegistry registry=null;
		try {
			registry = ServiceUtilsForSelection.getInstance().getServiceRegistry(selection);
		} catch (ServiceException e1) {
			e1.printStackTrace();
		}
		try {
			modelSet = registry.getService(ModelSet.class);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return the service registry of Papyrus, maybe null 
	 * 
	 */
	public ServicesRegistry getServiceRegistry() {

		IEditorPart editor;
		try {
			editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			ServicesRegistry serviceRegistry = (ServicesRegistry)editor.getAdapter(ServicesRegistry.class);
			if(serviceRegistry != null) {
				return serviceRegistry;
			}
		} catch (NullPointerException e) {
			// Can't get the active editor
			System.err.println("Can't get the current Eclipse Active Editor. No ServiceRegistry found.");
		}

		// Not found
		System.err.println("Can't get the ServiceRegistry from current Eclipse Active Editor");
		return null;
	}

	/**
	 * 
	 * @return the current modelSet of papyrus
	 * @throws ServiceException
	 */
	protected ModelSet getModelSet() throws ServiceException {
		return getServiceRegistry().getService(ModelSet.class);
	}

	/**
	 * getSelected element in the diagram or in the model explorer
	 * @return Element or null
	 */
	protected ArrayList<Element> getSelectionSet() {
		ArrayList<Element> selectedSet =new ArrayList<Element>();
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();


		if(selection instanceof IStructuredSelection) {
			@SuppressWarnings("rawtypes")
			Iterator selectedobjectIteractor = ((IStructuredSelection)selection).iterator();
			while (selectedobjectIteractor.hasNext()) {
				Object currentSelection = selectedobjectIteractor.next();

				EObject selectedEObject = EMFHelper.getEObject(currentSelection);
				if (selectedEObject instanceof org.eclipse.uml2.uml.Package){
					selectedSet.add((Element)selectedEObject);
				}
			}
		}

		return selectedSet;
	}
}
