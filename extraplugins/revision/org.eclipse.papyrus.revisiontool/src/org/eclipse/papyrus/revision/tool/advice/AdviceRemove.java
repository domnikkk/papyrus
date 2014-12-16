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
package org.eclipse.papyrus.revision.tool.advice;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.IdentityCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.revision.tool.command.PreventRemoveCommand;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
/**
 * The purpose of this advice is to prevent remove during the running of the revision mode
 * When the remove is done during the activation of the revision model, a diff and a review are created in the review model
 */
public class AdviceRemove extends AbstractEditHelperAdvice {



	@Override
	protected ICommand getAfterDestroyElementCommand(DestroyElementRequest request) {
		final IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
		if( part instanceof ReviewsEditor){
			PreventRemoveCommand prc=new PreventRemoveCommand(request.getEditingDomain(), request.getElementToDestroy());
			CompositeCommand compositeCommand= new CompositeCommand("remove");
			compositeCommand.add( new EMFtoGMFCommandWrapper(prc));
			//compositeCommand.add(UnexecutableCommand.INSTANCE);
			return compositeCommand;
		}
		return IdentityCommand.INSTANCE;
	}
	
}
