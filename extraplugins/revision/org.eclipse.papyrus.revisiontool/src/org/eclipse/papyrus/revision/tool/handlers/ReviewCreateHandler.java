package org.eclipse.papyrus.revision.tool.handlers;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ReviewCreateHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ReviewCreateHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Element element=getSelection();
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if( part instanceof ReviewsEditor){
			ReviewsEditor reviewsEditor=(ReviewsEditor)part;
			reviewsEditor.addAReview(element);
		}
		return null;
	}
	
	/**
	 * getSelected element in the diagram or in hte model explorer
	 * @return Element or null
	 */
	protected Element getSelection(){
		org.eclipse.uml2.uml.Element selectedElement =null;
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();

		if(selection instanceof IStructuredSelection) {
			Object selectedobject = ((IStructuredSelection)selection).getFirstElement();
				if (selectedobject instanceof org.eclipse.uml2.uml.Element){
					selectedElement=(Element)selectedobject;
				}

			return selectedElement;
		}
		return null;
	}
	/**
	 * getSelected element in the diagram or in hte model explorer
	 * @return Element or null
	 */
	protected ArrayList<Element> getSelectionSet(){
		ArrayList<Element> selectedSet =new ArrayList<Element>();
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();

		//look for papyrus

		if(selection instanceof IStructuredSelection) {
			@SuppressWarnings("rawtypes")
			Iterator selectedobjectIteractor = ((IStructuredSelection)selection).iterator();
			while (selectedobjectIteractor.hasNext()) {
				Object currentSelection = selectedobjectIteractor.next();
					if (currentSelection instanceof org.eclipse.uml2.uml.Element){
						selectedSet.add((Element)currentSelection);
					}
				}


		}
		return selectedSet;
	}
}
