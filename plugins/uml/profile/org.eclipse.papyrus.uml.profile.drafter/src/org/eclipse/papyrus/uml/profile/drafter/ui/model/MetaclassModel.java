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


/**
 * Model that represent one {@link StereoptypeModel}'s extended metaclasses.

 * @author cedric dumoulin
 *
 */
public class MetaclassModel {

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
	 * The Metaclass that the Stereotype extends. This is the metaclass represented by this model.
	 */
	private Class extendedMetaClass;
	/**
	 * The name proposed by the user for this Property.
	 */
	protected String proposedName;
	
	
	
	/**
	 * Constructor.
	 *
	 * @param memberKind
	 */
	public MetaclassModel(MemberKind memberKind) {
		this.memberKind = memberKind;
	}


	/**
	 * 
	 * Constructor.
	 *
	 * Create a {@link StateKind#loaded} model.
	 * 
	 * @param memberKind
	 * @param extendedMetaClass
	 */
	public MetaclassModel(MemberKind memberKind, Class extendedMetaClass) {
		this.memberKind = memberKind;
		this.stateKind = StateKind.loaded;
		this.extendedMetaClass = extendedMetaClass;
	}

	/**
	 * 
	 * Constructor.
	 * Create a {@link StateKind#created} model.
	 *
	 * @param memberKind
	 * @param proposedName
	 */
	public MetaclassModel(MemberKind memberKind, String proposedName) {
		this.memberKind = memberKind;
		this.proposedName = proposedName;
		this.stateKind = StateKind.created;
	}


	
	/**
	 * @return the extendedMetaClass
	 */
	protected Class getExtendedMetaClass() {
		return extendedMetaClass;
	}

	/**
	 * Visitor entry to visit this Model and its nested classes.
	 * @param visitor
	 */
	public void accept(IModelVisitor visitor) {
		visitor.visit(this);
	}
	

	
	/**
	 * @return the lifeStatusKind
	 */
	public LifeStatusKind getLifeStatusKind() {
		return lifeStatusKind;
	}


	
	/**
	 * @param lifeStatusKind the lifeStatusKind to set
	 */
	public void setLifeStatusKind(LifeStatusKind lifeStatusKind) {
		this.lifeStatusKind = lifeStatusKind;
	}


	
	/**
	 * @return the memberKind
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
