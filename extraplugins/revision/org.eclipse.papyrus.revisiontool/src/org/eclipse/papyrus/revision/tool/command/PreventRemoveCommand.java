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
package org.eclipse.papyrus.revision.tool.command;

import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This class is used to register in the review model the proposition of a deletion 
 *
 */
public class PreventRemoveCommand extends RecordingCommand {
	protected static final String REMOVE = "Remove ";
	protected EObject eObjectToRemove=null;

	/**
	 * 
	 * @param domain to execute the command
	 * @param eObject the Eobject that will be removed
	 */
	public PreventRemoveCommand(TransactionalEditingDomain domain, EObject eObject) {
		super(domain);
		eObjectToRemove=eObject;
	}





	@Override
	protected void doExecute() {
		final IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
		if( part instanceof ReviewsEditor){
			ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
			if( (reviewResourceManager.modeRevisionRunning())){
				Display.getCurrent().asyncExec(new Runnable() {

					public void run() {
						ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();

						String text="";
						if(eObjectToRemove instanceof NamedElement ){
							text=((NamedElement)eObjectToRemove).getName();
						}
						//					ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
						
						ReferenceChange difference= CompareFactory.eINSTANCE.createReferenceChange();
						difference.setSource(DifferenceSource.LEFT);
						difference.setKind(DifferenceKind.DELETE);
						difference.setReference(UMLPackage.eINSTANCE.getPackage_PackagedElement());
						difference.setValue(eObjectToRemove);
						CreateDifferenceCommand createDifferenceCommand= new CreateDifferenceCommand(
								reviewResourceManager.getDomain(),
								reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), difference);
						((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(createDifferenceCommand);
						CreateToDoReviewCommand createToDoReviewCommand= new CreateToDoReviewCommand(
								reviewResourceManager.getDomain(), 
								reviewResourceManager.getCurrentAuthor(), 
								reviewResourceManager.getCurrentReviewModel(),
								REMOVE+text,
								difference);
						((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(createToDoReviewCommand);
					}
				});

				throw 	new UnsupportedOperationException("prevent deletion "+eObjectToRemove);
			}
		}
	}
}
