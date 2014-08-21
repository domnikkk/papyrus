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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.synchronizeview.customization;

import org.eclipse.gef.EditPart;

/**
 * this class is the obejct that references the editpart and the an instance of ISynchroSemanticChild
 *
 */
public class SemanticChild {

	protected Class<? extends EditPart> editPart = null;

	protected ISynchroSemanticChild synchroSemanticChild = null;

	protected int priority = 0;


	/**
	 *
	 * @return the referenced edipart, cannot but null.
	 */
	public Class<? extends EditPart> getEditPart() {
		return editPart;
	}

	/**
	 *
	 * @return an instance of ISynchroSemanticChild, cannot be null
	 */
	public ISynchroSemanticChild getSynchroSemanticChild() {
		return synchroSemanticChild;
	}

	/**
	 * get the priority for this mapping
	 *
	 * @return
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param editPart
	 *            the editpart
	 * @param synchroSemanticChild
	 *            the class that explain the list of semantic element that play graphical childreen.
	 * @param priority
	 *            the priority of this mapping
	 */
	public SemanticChild(Class<? extends EditPart> editPart, ISynchroSemanticChild synchroSemanticChild, int priority) {
		super();
		this.editPart = editPart;
		this.synchroSemanticChild = synchroSemanticChild;
		this.priority = priority;
	}



}
