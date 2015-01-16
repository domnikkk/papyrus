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
package org.eclipse.papyrus.revision.tool.handlers;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This handler is used to launch the revision mode
 *
 */
public class LaunchRevisionMode extends RevisionAbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Command command = event.getCommand();
		boolean oldValue = HandlerUtil.toggleCommandState(command);
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
		if( part instanceof ReviewsEditor){
			if(oldValue==false){
				//now the revison mode is activated

				((ReviewsEditor)part).startModeRevision();
			}
			else{
				((ReviewsEditor)part).stopModelRevision();
			}
		}
		return null;
	}
	@Override
	public boolean isEnabled() {
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
		if( part ==null){
			return false;
		}
		return true;
	}

}
