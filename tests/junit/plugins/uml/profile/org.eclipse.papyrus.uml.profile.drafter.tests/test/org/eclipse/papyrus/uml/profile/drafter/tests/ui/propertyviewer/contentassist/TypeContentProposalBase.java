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

import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.Type;


/**
 * Field assist {@link IContentProposal} .
 * Base class for TypeContentProposal.
 * 
 * 
 * @author cedric dumoulin
 *
 */
public abstract class TypeContentProposalBase implements IContentProposal, Comparable<IContentProposal> {
	
	/**
	 * The type that is render.
	 */
	protected Type type;
	
	
	/**
	 * Constructor.
	 *
	 * @param stereotype
	 */
	public TypeContentProposalBase(Type type) {
		this.type = type;
	}

	/**
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getDescription()
	 *
	 * @return
	 */
	public String getDescription() {
		
		return type.getName();
	}

	public int compareTo(IContentProposal o) {
		return this.getLabel().compareTo(o.getLabel());
	}

	
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

}
