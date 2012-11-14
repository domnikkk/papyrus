package org.eclipse.papyrus.modelexplorer.resourceloading.handler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.core.utils.BusinessModelResolver;
import org.eclipse.papyrus.modelexplorer.handler.AbstractCommandHandler;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;


public abstract class AbstractResourceHandler extends AbstractCommandHandler {

	protected EObject getSelectedElement() {
		EObject eObject = null;

		// Get current selection
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		Object selection = (activeWorkbenchWindow != null) ? activeWorkbenchWindow.getSelectionService().getSelection() : null;

		// Treat non-null selected object (try to adapt and return EObject)
		if(selection != null) {

			// Get first element if the selection is an IStructuredSelection
			if(selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection)selection;
				selection = structuredSelection.getFirstElement();
			}

			if(selection instanceof IAdaptable) {
				Object res = ((IAdaptable)selection).getAdapter(EObject.class);
				
				if (res != null) {
					selection = res;
				} else {
					Setting setting = (Setting)((IAdaptable)selection).getAdapter(Setting.class);
					if (setting != null) {
						selection = setting.get(false);
					}
				}
			}

			Object businessObject = BusinessModelResolver.getInstance().getBusinessModel(selection);
			if(businessObject instanceof EObject) {
				eObject = (EObject)businessObject;
			}
		}

		return eObject;
	}
	
	protected List<EObject> getSelectedElements() {

		List<EObject> selectedEObjects = new ArrayList<EObject>();

		// Get current selection
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		Object selection = (activeWorkbenchWindow != null) ? activeWorkbenchWindow.getSelectionService().getSelection() : null;

		// Treat non-null selected object (try to adapt and return EObject)
		if(selection != null) {

			// Parse current selection
			if(selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection)selection;
				for(Object current : structuredSelection.toArray()) {
					// Adapt current selection to EObject
					if(current instanceof IAdaptable) {
						EObject selectedElement = (EObject)((IAdaptable)current).getAdapter(EObject.class);
						
						if (selectedElement == null) {
							Setting setting = (Setting)((IAdaptable)current).getAdapter(Setting.class);
							if (setting != null) {
								selectedElement = (EObject)setting.get(false);
							}
						}
						if(selectedElement != null) {//we avoid to add null element in the list!
							selectedEObjects.add(selectedElement);
						}
					}
				}
			} else { // Not a IStructuredSelection
						// Adapt current selection to EObject
				EObject selectedElement = null;
				if(selection instanceof IAdaptable) {
					selectedElement = (EObject)((IAdaptable)selection).getAdapter(EObject.class);
				}
				if(selectedElement == null) {
					selectedElement = (EObject)Platform.getAdapterManager().getAdapter(selection, EObject.class);
				}
				if(selectedElement != null) { //we avoid to add null element in the list!
					selectedEObjects.add(selectedElement);
				}
			}
		}

		return selectedEObjects;
	}

	@Override
	protected Command getCommand() {
		TransactionalEditingDomain editingDomain = getEditingDomain();
		List<EObject> selection = getSelectedElements();
		if(editingDomain != null && editingDomain.getResourceSet() instanceof ModelSet && !selection.isEmpty()) {
			ModelSet modelSet = (ModelSet)editingDomain.getResourceSet();

			CompoundCommand cc = new CompoundCommand();
			Set<URI> handledURI = new HashSet<URI>();
			
			for(EObject sel : selection) {
				handleEObject(sel, modelSet, cc, handledURI);
			}

			return cc;
		}

		return UnexecutableCommand.INSTANCE;
	}
	
	protected abstract void handleEObject(EObject eObj, ModelSet modelSet, CompoundCommand cc, Set<URI> handledURI);
}
