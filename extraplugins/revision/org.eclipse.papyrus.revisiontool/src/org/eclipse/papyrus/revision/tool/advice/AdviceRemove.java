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

import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.IdentityCommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.revision.tool.command.CreateDifferenceCommand;
import org.eclipse.papyrus.revision.tool.command.CreateReviewCommand;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
/**
 * The purpose of this advice is to prevent remove during the running of the revision mode
 */
public class AdviceRemove extends AbstractEditHelperAdvice {

	protected static final String REMOVE = "Remove ";

	@Override
	protected ICommand getBeforeDestroyElementCommand(
			DestroyElementRequest request) {
		final IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
		if( part instanceof ReviewsEditor){
			ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
			if( !(reviewResourceManager.modeRevisionRunning())){
				return IdentityCommand.INSTANCE;
			}
			final EObject eObject=request.getElementToDestroy();
			Display.getCurrent().asyncExec(new Runnable() {

				public void run() {
					String text="";
					if(eObject instanceof NamedElement ){
						text=((NamedElement)eObject).getName();
					}
					ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
					CreateReviewCommand createReviewCommand= new CreateReviewCommand(
							reviewResourceManager.getDomain(), 
							reviewResourceManager.getCurrentAuthor(), 
							reviewResourceManager.getCurrentReviewModel(),
							REMOVE+text);
					((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(createReviewCommand);
					ReferenceChange difference= CompareFactory.eINSTANCE.createReferenceChange();
					difference.setSource(DifferenceSource.LEFT);
					difference.setKind(DifferenceKind.DELETE);
					difference.setReference(UMLPackage.eINSTANCE.getPackage_PackagedElement());
					difference.setValue(eObject);
					CreateDifferenceCommand createDifferenceCommand= new CreateDifferenceCommand(
							reviewResourceManager.getDomain(),
							reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), difference);
					reviewResourceManager.getDomain().getCommandStack().execute(createDifferenceCommand);

				}
			});
		}
		return UnexecutableCommand.INSTANCE;
	}
}
