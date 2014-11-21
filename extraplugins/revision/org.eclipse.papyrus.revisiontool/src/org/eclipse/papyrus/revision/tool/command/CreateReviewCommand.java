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

import java.text.DateFormat;
import java.util.Date;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.revision.tool.core.I_ReviewStereotype;
import org.eclipse.papyrus.revision.tool.core.I_VersioningStereotype;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * this command is used to create a comment stereotyped review with filled information about author and versioning
 *
 */
public class CreateReviewCommand extends RecordingCommand {
	protected Actor theauthor=null;
	protected Element container=null;
	protected String subject; 
	
	/**
	 * use to create a review
	 * @param domain the transactional editing domain in order to execute the command
	 * @param currentAuthor the current author
	 * @param container the container of the review
	 * @param subject the subject of the review
	 */
	public CreateReviewCommand(TransactionalEditingDomain domain, Actor currentAuthor, Element container, String subject) {
		super(domain, "create Review");
		this.theauthor= currentAuthor;
		this.container= container;
		this.subject= subject;
	}

	@Override
	protected void doExecute() {

		Comment cmt= UMLFactory.eINSTANCE.createComment();
		cmt.setBody("Your review");
		container.getOwnedComments().add(cmt);

		Stereotype review= cmt.getApplicableStereotype(I_ReviewStereotype.REVIEW_STEREOTYPE);
		cmt.applyStereotype(review);
		cmt.setValue(review, I_ReviewStereotype.COMMENT_SUBJECT_ATT, subject);

		Stereotype authorStereotype= theauthor.getApplicableStereotype(I_VersioningStereotype.AUTHOR_STEREOTYPE);
		cmt.setValue(review, I_VersioningStereotype.VERSIONINGELEMENT_AUTHOR_ATT, theauthor.getStereotypeApplication(authorStereotype));

		// add tthe date
		Date today = new Date();
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		cmt.setValue(review, I_VersioningStereotype.VERSIONINGELEMENT_DATE_ATT, shortDateFormat.format(today));

	}

}
