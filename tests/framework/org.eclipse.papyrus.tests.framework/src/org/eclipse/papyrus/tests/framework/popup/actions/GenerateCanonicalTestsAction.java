package org.eclipse.papyrus.tests.framework.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GenerateCanonicalTestsAction implements IObjectActionDelegate {

	private Shell shell;
	private IStructuredSelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateCanonicalTestsAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		Object selectedElement = selection.getFirstElement();
		if(!(selectedElement instanceof IFile)){
			MessageDialog.openError(shell, "Oops", "The selected element is not an IFile!");
		}else{
			IFile iFile = (IFile) selectedElement;
			Resource resource = new ResourceSetImpl().getResource(URI.createURI(iFile.getFullPath().toOSString()), true);
			EObject eObject = resource.getContents().get(0);
			MessageDialog.openInformation(
					shell,
					"PapyrusTesting Model",
					eObject.toString());
			
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
