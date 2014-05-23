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
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.synchronizeview.customization.ISynchroSemanticChild;
import org.eclipse.uml2.uml.Property;

/**
 * This class is used to precise semantic element that could be displayed in compartment of parts
 */
public class SynchroSemanticForPopertyPartCompartment implements ISynchroSemanticChild {

	public SynchroSemanticForPopertyPartCompartment() {
	}

	@Override
	public List<EObject> getSynchroSemanticChild(EObject semanticFromEditPart) {
		ArrayList<EObject> result = new ArrayList<EObject>();
		if(semanticFromEditPart instanceof Property) {
			if(((Property)semanticFromEditPart).getType() != null) {
				result.addAll(((Property)semanticFromEditPart).getType().getOwnedElements());
			}
		}
		return result;
	}

	@Override
	public EObject getSemanticEObjectToListen(EObject semanticFromEditPart) {
		if(semanticFromEditPart instanceof Property) {
			if(((Property)semanticFromEditPart).getType() != null) {
				return ((Property)semanticFromEditPart).getType();
			}
		}
		return null;
	}
}
