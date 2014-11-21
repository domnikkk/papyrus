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
package org.eclipse.papyrus.revision.tool.core;

import java.util.ArrayList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.papyrus.revision.tool.command.CreateDifferenceCommand;
import org.eclipse.papyrus.revision.tool.command.CreateReviewCommand;
import org.eclipse.papyrus.revision.tool.ui.RevisonDiagLayer;
import org.eclipse.uml2.uml.NamedElement;

/**
 * this listener is used to add diff about add and set in the diff model during the launch of the 
 * revision mode
 *
 */
public class AddingDiffListener implements ResourceSetListener {
	protected ReviewResourceManager reviewResourceManager;
	protected RevisonDiagLayer diagLayer=new RevisonDiagLayer();

	/**
	 * constructor
	 * @param reviewResourceManager
	 */
	public AddingDiffListener(ReviewResourceManager reviewResourceManager) {
		this.reviewResourceManager=reviewResourceManager;
	}

	@Override
	public NotificationFilter getFilter() {
		return null;
	}


	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event)
			throws RollbackException {
		ArrayList<Command> commands = new ArrayList<Command>();



		for (Notification notif : event.getNotifications()) {
			if( notif.getEventType()==Notification.ADD&&notif.getNotifier() instanceof EObject){
				EObject notifier = (EObject) notif.getNotifier();
				if( reviewResourceManager.getWorkingModel().eResource().equals(notifier.eResource())){
					String subjectToWrite=""+notif.getNewValue().getClass().getSimpleName();
					if(notif.getNewValue() instanceof NamedElement&&((NamedElement)notif.getNewValue()).getName()!=null){
						subjectToWrite=((NamedElement)notif.getNewValue()).getName();
					}

					CreateReviewCommand createReviewCommand= new CreateReviewCommand(
							reviewResourceManager.getDomain(), 
							reviewResourceManager.getCurrentAuthor(), 
							reviewResourceManager.getCurrentReviewModel(),
							"Add "+subjectToWrite );
					commands.add(createReviewCommand);
					final ReferenceChange difference= CompareFactory.eINSTANCE.createReferenceChange();
					difference.setSource(DifferenceSource.LEFT);
					difference.setKind(DifferenceKind.ADD);
					difference.setReference((EReference)notif.getFeature());
					difference.setValue((EObject)notif.getNewValue());
					CreateDifferenceCommand createDifferenceCommand= new CreateDifferenceCommand(
							reviewResourceManager.getDomain(), reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), difference);
					commands.add(createDifferenceCommand);
				} 
			}
		}
		return commands.isEmpty()? null : new CompoundCommand(commands);
	}



	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		diagLayer.run(reviewResourceManager);

	}


	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}


	@Override
	public boolean isPrecommitOnly() {
		return false;
	}


	@Override
	public boolean isPostcommitOnly() {
		return false;
	}

}
