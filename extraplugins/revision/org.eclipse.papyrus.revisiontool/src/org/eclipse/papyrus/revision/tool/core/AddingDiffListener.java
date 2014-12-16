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
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.papyrus.revision.tool.command.CreateDifferenceCommand;
import org.eclipse.papyrus.revision.tool.command.CreateMatchCommand;
import org.eclipse.papyrus.revision.tool.command.CreateToDoReviewCommand;
import org.eclipse.uml2.uml.NamedElement;

/**
 *  This listener is used to register ADD ant SET about in the diff model during the launch of the  revision mode. It also create  review element in the review model.
 * See package commands for specification of review creation commands.
 *
 */
public class AddingDiffListener implements ResourceSetListener {
	protected ReviewResourceManager reviewResourceManager;

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

		boolean noADD= true;


		for (Notification notif : event.getNotifications()) {
			if( notif.getEventType()==Notification.ADD&&notif.getNotifier() instanceof EObject){
				EObject notifier = (EObject) notif.getNotifier();
				if( reviewResourceManager.getWorkingModel().eResource().equals(notifier.eResource())){
					String subjectToWrite=""+notif.getNewValue().getClass().getSimpleName();
					
					if(notif.getNewValue() instanceof NamedElement&&((NamedElement)notif.getNewValue()).getName()!=null){
						subjectToWrite=((NamedElement)notif.getNewValue()).getName();
					}
					if(((EReference)notif.getFeature()).isContainment()){
						
						noADD=false;

						
						final ReferenceChange difference= CompareFactory.eINSTANCE.createReferenceChange();
						difference.setSource(DifferenceSource.LEFT);
						difference.setKind(DifferenceKind.ADD);
						difference.setReference((EReference)notif.getFeature());
						difference.setValue((EObject)notif.getNewValue());
						CreateDifferenceCommand createDifferenceCommand= new CreateDifferenceCommand(
								reviewResourceManager.getDomain(), reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), difference);
						commands.add(createDifferenceCommand);
						
						CreateToDoReviewCommand createToDoReviewCommand= new CreateToDoReviewCommand(
								reviewResourceManager.getDomain(), 
								reviewResourceManager.getCurrentAuthor(), 
								reviewResourceManager.getCurrentReviewModel(),
								"Add "+subjectToWrite, difference );
						commands.add(createToDoReviewCommand);
					}
					else{
						


						Match match= CompareFactory.eINSTANCE.createMatch();
						match.setLeft((EObject)notif.getNotifier());
						final ReferenceChange difference= CompareFactory.eINSTANCE.createReferenceChange();
						difference.setSource(DifferenceSource.LEFT);
						difference.setKind(DifferenceKind.ADD);
						difference.setReference((EReference)notif.getFeature());
						difference.setValue((EObject)notif.getNewValue());
						match.getDifferences().add(difference);
						CreateMatchCommand createDifferenceCommand= new CreateMatchCommand(
								reviewResourceManager.getDomain(), reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), match);
						commands.add(createDifferenceCommand);
						CreateToDoReviewCommand createToDoReviewCommand= new CreateToDoReviewCommand(
								reviewResourceManager.getDomain(), 
								reviewResourceManager.getCurrentAuthor(), 
								reviewResourceManager.getCurrentReviewModel(),
								"Set "+((EReference)notif.getFeature()).getName()+" "+subjectToWrite,
								match);
						commands.add(createToDoReviewCommand);
					}
				} 
			}
			if( notif.getEventType()==Notification.REMOVE&&notif.getNotifier() instanceof EObject){
				String subjectToWrite=""+notif.getOldValue().getClass().getSimpleName();
				if(notif.getNewValue() instanceof NamedElement&&((NamedElement)notif.getOldValue()).getName()!=null){
					subjectToWrite=((NamedElement)notif.getOldValue()).getName();
				}
				EObject notifier = (EObject) notif.getNotifier();
				if( reviewResourceManager.getWorkingModel().eResource().equals(notifier.eResource())){

					


					Match match= CompareFactory.eINSTANCE.createMatch();
					match.setLeft((EObject)notif.getNotifier());
					final ReferenceChange difference= CompareFactory.eINSTANCE.createReferenceChange();
					difference.setSource(DifferenceSource.LEFT);
					difference.setKind(DifferenceKind.DELETE);
					difference.setReference((EReference)notif.getFeature());
					difference.setValue((EObject)notif.getOldValue());
					match.getDifferences().add(difference);
					CreateMatchCommand createDifferenceCommand= new CreateMatchCommand(
							reviewResourceManager.getDomain(), reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), match);
					commands.add(createDifferenceCommand);
					CreateToDoReviewCommand createToDoReviewCommand= new CreateToDoReviewCommand(
							reviewResourceManager.getDomain(), 
							reviewResourceManager.getCurrentAuthor(), 
							reviewResourceManager.getCurrentReviewModel(),
							"Remove "+((EReference)notif.getFeature()).getName()+" "+subjectToWrite,
							match);
					commands.add(createToDoReviewCommand);
				}
			} 
		}
		if(noADD){
			for (Notification notif : event.getNotifications()) {
				if( notif.getEventType()==Notification.SET&&notif.getNotifier() instanceof EObject){
					EObject notifier = (EObject) notif.getNotifier();
					if( reviewResourceManager.getWorkingModel().eResource().equals(notifier.eResource())){

						noADD=false;
						if( notif.getFeature() instanceof EAttribute){
							


							Match match= CompareFactory.eINSTANCE.createMatch();
							match.setLeft((EObject)notif.getNotifier());
							final AttributeChange difference= CompareFactory.eINSTANCE.createAttributeChange();
							difference.setSource(DifferenceSource.LEFT);
							difference.setKind(DifferenceKind.CHANGE);
							difference.setAttribute((EAttribute)notif.getFeature());
							difference.setValue(notif.getOldValue());
							match.getDifferences().add(difference);
							CreateMatchCommand createDifferenceCommand= new CreateMatchCommand(
									reviewResourceManager.getDomain(), reviewResourceManager.getDiffModel().getMatch(reviewResourceManager.getWorkingModel()), match);
							commands.add(createDifferenceCommand);
							CreateToDoReviewCommand createToDoReviewCommand= new CreateToDoReviewCommand(
									reviewResourceManager.getDomain(), 
									reviewResourceManager.getCurrentAuthor(), 
									reviewResourceManager.getCurrentReviewModel(),
									"Set "+((EAttribute)notif.getFeature()).getName()+" "+notif.getNewValue(),
									match);
							commands.add(createToDoReviewCommand);
						}
					} 
				}
			}
		}
		return commands.isEmpty()? null : new CompoundCommand(commands);
	}



	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {

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
