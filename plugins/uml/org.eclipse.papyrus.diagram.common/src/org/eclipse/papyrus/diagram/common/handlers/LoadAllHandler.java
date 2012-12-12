/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Matthieu Boivineau (Atos) - Initial API and implementation 
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.papyrus.core.resourceloading.util.LoadingUtils;
import org.eclipse.papyrus.diagram.common.load.IEObjectLoadingProxy;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.swt.widgets.Display;

public class LoadAllHandler extends GraphicalCommandHandler {

	@Override
	protected Command getCommand() throws ExecutionException {
		TransactionalEditingDomain editingDomain = getEditingDomain();
		final List<IGraphicalEditPart> selection = getSelectedElements();
		if(editingDomain != null && editingDomain.getResourceSet() instanceof ModelSet && !selection.isEmpty()) {
			final ModelSet modelSet = (ModelSet)editingDomain.getResourceSet();
			return new Command() {

				@Override
				public void redo() {
					List<URI> handledURI = new ArrayList<URI>();
					for(IGraphicalEditPart selPart : selection) {
						View view = (View)((IAdaptable)selPart).getAdapter(View.class);
						if(view != null) {
							ProgressMonitorDialog dialog = new ProgressMonitorDialog(Display.getCurrent().getActiveShell());
							dialog.open();
							IProgressMonitor monitor = dialog.getProgressMonitor();

							exploreViewContents(modelSet, view.getDiagram(), handledURI, monitor);

							monitor.done();
							dialog.close();
						}

						refreshAll(selPart);
					}
				}

				@Override
				public void execute() {
					redo();
				}

				@Override
				public boolean canExecute() {
					return true;
				}
			};
		}
		return UnexecutableCommand.INSTANCE;
	}

	@SuppressWarnings("unchecked")
	public <T> T getAdapter(Object o, Class<? extends T> aClass) {
		T result = null;
		if(o != null) {
			if(aClass.isInstance(o)) {
				result = (T)o;
			}
			if(result == null) {
				result = (T)Platform.getAdapterManager().getAdapter(o, aClass);
			}
			if(result == null) {
				if(o instanceof IAdaptable) {
					IAdaptable iadaptable = (IAdaptable)o;
					result = (T)iadaptable.getAdapter(aClass);
				}
			}
		}
		return result;
	}

	protected void exploreViewContents(final ModelSet modelSet, Diagram diag, List<URI> handledURI, IProgressMonitor monitor) {
		if(diag != null) {
			Set<EObject> elems = new HashSet<EObject>();
			TreeIterator<EObject> allContents = diag.eAllContents();
			while(allContents.hasNext()) {
				EObject eObjectView = allContents.next();
				if(eObjectView instanceof View) {
					View v = (View)eObjectView;
					EObject elem = v.getElement();
					processElement(elem, elems, modelSet, handledURI, monitor);
				}
			}
		}
	}

	protected void processElement(EObject elem, Set<EObject> elems, final ModelSet modelSet, List<URI> handledURI, IProgressMonitor monitor) {
		if(elem != null && !elems.contains(elem)) {
			if(elem.eIsProxy()) {
				InternalEObject internal = (InternalEObject)elem;
				final URI proxyURI = internal.eProxyURI().trimFragment();
				final URI trimmedURI = proxyURI.trimFileExtension();
				if(!handledURI.contains(trimmedURI)) {
					handledURI.add(trimmedURI);
					LoadingUtils.loadWithAssociatedResources(proxyURI, modelSet, true, monitor);
				}
			}

			IEObjectLoadingProxy adapter = getAdapter(elem, IEObjectLoadingProxy.class);
			if(adapter != null && !elems.contains(elem)) {
				List<EObject> listElem = adapter.getProxyEObjects(elem);
				for(EObject childElem : listElem) {
					processElement(childElem, elems, modelSet, handledURI, monitor);
				}
			}
		}
	}

	/**
	 * Find the diagram edit part and refreshes all its descendants.
	 * 
	 * @param part
	 */
	private void refreshAll(IGraphicalEditPart part) {
		View view = (View)((IAdaptable)part).getAdapter(View.class);

		Map<?, ?> editPartRegistry = part.getViewer().getEditPartRegistry();
		if(editPartRegistry != null) {
			Object diagramEditPart = editPartRegistry.get(view.getDiagram());
			if(diagramEditPart instanceof DiagramEditPart) {
				((DiagramEditPart)diagramEditPart).refresh();
				Object model = ((DiagramEditPart)diagramEditPart).getModel();
				if(model instanceof View) {
					TreeIterator<EObject> eAllContents = ((View)model).eAllContents();
					while(eAllContents.hasNext()) {
						EObject current = eAllContents.next();
						Object editPart = editPartRegistry.get(current);
						if(editPart instanceof IGraphicalEditPart) {
							((IGraphicalEditPart)editPart).refresh();
						}
					}
				}
			}
		}
	}

}
