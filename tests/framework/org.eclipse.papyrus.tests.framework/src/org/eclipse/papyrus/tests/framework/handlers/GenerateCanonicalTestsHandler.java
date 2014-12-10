package org.eclipse.papyrus.tests.framework.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateCanonicalTestsHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;

			Object selectedElement = strucSelection.getFirstElement();
			if (!(selectedElement instanceof IFile)) {
				MessageDialog.openError(HandlerUtil.getActiveShell(event),
						"Oops", "The selected element is not an IFile!");
			} else {
				IFile iFile = (IFile) selectedElement;
				URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toOSString(), true);
				
				//GenerateTestsWorkflow workflow = new GenerateTestsWorkflow(uri.toString());
				//workflow.run(new WorkflowContextImpl());
//				Resource resource = new ResourceSetImpl().getResource(
//						uri, true);
//				EObject eObject = resource.getContents().get(0);
//				MessageDialog.openInformation(
//						HandlerUtil.getActiveShell(event),
//						"PapyrusTesting Model", eObject.toString());

			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
