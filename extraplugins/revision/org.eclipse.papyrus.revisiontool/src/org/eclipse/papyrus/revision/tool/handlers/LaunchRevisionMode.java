package org.eclipse.papyrus.revision.tool.handlers;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class LaunchRevisionMode extends RevisionAbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Command command = event.getCommand();
		boolean oldValue = HandlerUtil.toggleCommandState(command);
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
		if( part instanceof ReviewsEditor){
			if(oldValue==false){
				//now the revison mode is activated

				((ReviewsEditor)part).getReviewResourceManager().startModeRevision();
			}
			else{
				((ReviewsEditor)part).getReviewResourceManager().stopModelRevision();
			}
		}
		return null;
	}

}
