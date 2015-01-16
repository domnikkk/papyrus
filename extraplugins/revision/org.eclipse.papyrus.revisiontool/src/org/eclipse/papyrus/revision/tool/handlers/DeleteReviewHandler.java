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

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;

/**
 * This handler is used to remove a review from the review editor.
 */
public class DeleteReviewHandler extends RevisionAbstractHandler {
	/**
	 * The constructor.
	 */
	public DeleteReviewHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ArrayList<Element> elements=getSelectionSet();
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if( part instanceof ReviewsEditor){
			if( elements.size()!=0){
				
				RecordingCommand cmd= new RecordingCommand(((ReviewsEditor)part).getReviewResourceManager().getDomain(), "Delete currentReview") {
					@Override
					protected void doExecute() {
						for (Element element : elements) {
							((Element)element.eContainer()).getOwnedComments().remove(element);
						}
						
					}
				};
				((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(cmd);
			}
		}
		return null;
	}
	
}
