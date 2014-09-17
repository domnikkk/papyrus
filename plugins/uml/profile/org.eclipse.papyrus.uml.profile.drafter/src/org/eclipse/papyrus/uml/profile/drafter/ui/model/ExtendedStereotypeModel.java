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

package org.eclipse.papyrus.uml.profile.drafter.ui.model;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;


/**
 * Model that represent one {@link StereoptypeModel}'s extended sterotype.
 * @author cedric dumoulin
 *
 */
public class ExtendedStereotypeModel {

	/**
	 * The status of the model. ModelStatusKind.created mean that the model is created by the user.
	 */
	protected MemberKind memberKind = MemberKind.owned;
	
	/**
	 * state of this model.
	 */
	protected StateKind stateKind = StateKind.loaded;
	
	/**
	 * Life status of this model. Value is deleted if the user request deletion of this model.
	 */
	protected LifeStatusKind lifeStatusKind = LifeStatusKind.running;
	

	/**
	 * The {@link Stereotype} that the Stereotype extends. This is the stereotype represented by this model.
	 */
	protected Class extendedStereotype;
	
	/**
	 * The name proposed by the user for this Property.
	 */
	protected String proposedName;
	
	/**
	 * Constructor.
	 *
	 * @param memberKind
	 */
	public ExtendedStereotypeModel(MemberKind memberKind) {
		this.memberKind = memberKind;
	}




	public ExtendedStereotypeModel(MemberKind memberKind, Class superClass) {
		this.memberKind = memberKind;
		this.stateKind = StateKind.loaded;
		this.extendedStereotype = superClass;
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param created
	 * @param string
	 */
	public ExtendedStereotypeModel(MemberKind memberKind, String proposedName) {
		this.memberKind = memberKind;
		this.stateKind = StateKind.created;
		this.proposedName = proposedName;
	}


	/**
	 * Visitor entry to visit this Model and its nested classes.
	 * @param visitor
	 */
	public void accept(IModelVisitor visitor) {
		visitor.visit(this);
	}
	


	/**
	 * 
	 * @return
	 */
	public MemberKind getMemberKind() {
		return memberKind;
	}

	/**
	 * @return the stateKind
	 */
	public StateKind getStateKind() {
		return stateKind;
	}

	/**
	 * @return the lifeStatusKind
	 */
	public LifeStatusKind getLifeStatusKind() {
		return lifeStatusKind;
	}

	/**
	 * Apply a model changed event on this model. This change the {@link #lifeStatusKind}.
	 */
	public void modelChangedEvent() {
		
		switch(stateKind) {
		case loaded:
			stateKind = StateKind.modified;
			break;

		default:
			// No change
			break;
		}
	}
	/**
	 * A delete is applied to the model. If the model is alive, it is marked deleted.
	 * If it is deleted, it is marked alive.
	 */
	public void deleteModelEvent() {
		
		switch(lifeStatusKind) {
		case running:
			lifeStatusKind = LifeStatusKind.deleted;
			break;
		case deleted:
			lifeStatusKind = LifeStatusKind.running;
			break;

		default:
			// No change
			break;
		}
	}

}
