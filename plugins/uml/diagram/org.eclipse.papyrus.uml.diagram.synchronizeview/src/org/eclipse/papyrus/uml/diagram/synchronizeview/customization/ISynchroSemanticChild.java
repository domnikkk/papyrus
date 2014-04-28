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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * this interface allows developer to specialize "semantic element" to display in the content of a given editPart
 *
 */
public interface ISynchroSemanticChild {

	/**
	 * return the list of semantic elements that play graphical children foe a given element and a given editpart
	 * 
	 * @param semanticFromEditPart
	 * @return list of semantic elements
	 */
	public List<EObject> getSynchroSemanticChild(EObject semanticFromEditPart);

	/** EObject to listen **/
	public EObject getSemanticEObjectToListen(EObject semanticFromEditPart);

}
