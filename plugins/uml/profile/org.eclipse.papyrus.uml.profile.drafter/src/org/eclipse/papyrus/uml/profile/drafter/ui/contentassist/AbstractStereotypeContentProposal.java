/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.ui.contentassist;

import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Stereotype;


/**
 * Field assist {@link IContentProposal} .
 * This implementation is used to render one proposal of a {@link Stereotype} as a short name:
 * shortName (profil)
 * 
 * @author cedric dumoulin
 *
 */
public abstract class AbstractStereotypeContentProposal implements IContentProposal, Comparable<IContentProposal> {
	
	/**
	 * The stereotype that is render.
	 */
	protected Stereotype stereotype;
	
	
	/**
	 * Constructor.
	 *
	 * @param stereotype
	 */
	public AbstractStereotypeContentProposal(Stereotype stereotype) {
		this.stereotype = stereotype;
	}

	/**
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getDescription()
	 *
	 * @return
	 */
	public String getDescription() {
		// Try to return the first associated comment
		List<Comment> comments =  stereotype.getOwnedComments();
		if( !comments.isEmpty()) {
			Comment comment = comments.get(0);
			return comment.toString();
		}
		
		return stereotype.getLabel();
	}

	public int compareTo(IContentProposal o) {
		return this.getLabel().compareTo(o.getLabel());
	}

}
