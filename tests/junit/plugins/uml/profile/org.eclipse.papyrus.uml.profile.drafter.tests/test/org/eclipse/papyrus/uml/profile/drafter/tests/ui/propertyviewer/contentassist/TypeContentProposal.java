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

package org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.contentassist;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.Type;


/**
 * Field assist {@link IContentProposal} .
 * This implementation is used to render one proposal of a {@link Stereotype} as a short name:
 * shortName (profil)
 * 
 * @author cedric dumoulin
 *
 */
public class TypeContentProposal extends TypeContentProposalBase implements IContentProposal, Comparable<IContentProposal> {
	
	/**
	 * Constructor.
	 *
	 * @param stereotype
	 */
	public TypeContentProposal(Type type) {
		super( type );
	}

	/**
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getContent()
	 *
	 * @return
	 */
	public String getContent() {
		return type.getName() ;
	}

	/**
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getCursorPosition()
	 *
	 * @return
	 */
	public int getCursorPosition() {
		return getContent().length();
	}

	/**
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getLabel()
	 *
	 * @return
	 */
	public String getLabel() {
		
		return type.getName();		
	}


}
