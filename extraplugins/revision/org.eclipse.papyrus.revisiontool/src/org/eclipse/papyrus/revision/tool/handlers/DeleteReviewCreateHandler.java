package org.eclipse.papyrus.revision.tool.handlers;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.revision.tool.core.I_ReviewStereotype;
import org.eclipse.papyrus.revision.tool.core.I_VersioningStereotype;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class DeleteReviewCreateHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public DeleteReviewCreateHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Element element=getSelection();
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if( part instanceof ReviewsEditor){
			if( element!=null){
				
				RecordingCommand cmd= new RecordingCommand(((ReviewsEditor)part).getReviewResourceManager().getDomain(), "Delete currentReview") {
					@Override
					protected void doExecute() {
						((Element)element.eContainer()).getOwnedComments().remove(element);
					}
				};
				((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(cmd);
			}
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
