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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.developper.mde.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForHandlers;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * Abstract handler in order to connect to papyrus
 *
 */
public abstract class IDMAbstractHandler extends AbstractHandler {

	protected TransactionalEditingDomain transactionalEditingDomain = null;
	protected PapyrusMultiDiagramEditor papyrusEditor;
	public static HashMap<Element, Element> elt2DocElt = new HashMap<Element, Element>();
	public static HashMap<Package, Package> Toc2DocElt = new HashMap<Package, Package>();
	
	/**
	 * get the root package
	 *
	 * @param elem
	 * @return the root package
	 */
	public Package getToPackage(Element elem) {
		Package tmp = elem.getNearestPackage();
		while (tmp.getOwner() != null && (tmp.getOwner() instanceof Package)) {
			tmp = (Package) tmp.getOwner();
		}
		return tmp;
	}

	// @Override
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			papyrusEditor = (PapyrusMultiDiagramEditor) ServiceUtilsForHandlers.getInstance().getService(IMultiDiagramEditor.class, event);
			transactionalEditingDomain = ServiceUtilsForHandlers.getInstance().getService(org.eclipse.emf.transaction.TransactionalEditingDomain.class, event);
		} catch (Exception e) {
			System.err.println("impossible to get the Transactional Editing Domain " + e); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * getSelected element in the diagram or in hte model explorer
	 *
	 * @return Element or null
	 */
	protected Element getSelection() {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();

		if (selection instanceof IStructuredSelection) {
			Object selectedobject = ((IStructuredSelection) selection).getFirstElement();

			EObject selectedElement = EMFHelper.getEObject(selectedobject);
			if (selectedElement instanceof Element) {
				return (Element) selectedElement;
			}
		}
		return null;
	}

	/**
	 * getSelected element in the diagram or in hte model explorer
	 *
	 * @return Element or null
	 */
	protected ArrayList<Element> getSelectionSet() {
		ArrayList<Element> selectedSet = new ArrayList<Element>();
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();

		// look for papyrus

		if (selection instanceof IStructuredSelection) {
			@SuppressWarnings("rawtypes")
			Iterator selectedobjectIteractor = ((IStructuredSelection) selection).iterator();
			while (selectedobjectIteractor.hasNext()) {
				Object currentSelection = selectedobjectIteractor.next();
				EObject selectedElement = EMFHelper.getEObject(currentSelection);
				if (selectedElement instanceof Element) {
					selectedSet.add((Element) selectedElement);
				}
			}


		}
		return selectedSet;
	}
}
