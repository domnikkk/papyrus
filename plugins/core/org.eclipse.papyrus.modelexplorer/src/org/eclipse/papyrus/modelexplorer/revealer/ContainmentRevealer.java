/*****************************************************************************
 * Copyright (c) 2012 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer.revealer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.modelexplorer.matching.LinkItemMatchingItem;
import org.eclipse.papyrus.modelexplorer.matching.ModelElementItemMatchingItem;

/**
 * Containment revealer is used to create a reveal chain using containment features of the input {@link EObject}
 * @author adaussy
 *
 */
public class ContainmentRevealer implements IModelExplorerRevealerParticipant {

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.modelexplorer.revealer.IModelExplorerRevealer#getRevealerChain(org.eclipse.emf.ecore.EObject)
	 */
	public IChainLink getRevealerChain(EObject targetObject) {
		//If the element has no container then this participant should not handle this object
		if(!(targetObject != null && targetObject.eContainer() != null && targetObject.eContainingFeature() instanceof EReference)) {
			return null;
		}
		EStructuralFeature eContainingFeature = targetObject.eContainingFeature();
		EObject nextObject = targetObject.eContainer();
		if(nextObject != null && eContainingFeature instanceof EReference) {
			ChainLink chainLink = new ChainLink();
			chainLink.setNexObject(nextObject);
			chainLink.getMatchingObjects().add(new LinkItemMatchingItem(nextObject, (EReference)eContainingFeature));
			chainLink.getMatchingObjects().add(new ModelElementItemMatchingItem(nextObject));
			return chainLink;
		}
		return null;
	}


}
