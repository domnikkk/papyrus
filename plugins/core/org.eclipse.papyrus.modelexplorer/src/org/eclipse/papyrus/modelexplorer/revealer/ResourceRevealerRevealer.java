/*****************************************************************************
 * Copyright (c) 2013 Atos
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.modelexplorer.matching.ReferencableMatchingItem;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.additional.AdditionalResourcesModel;

/**
 * Participant that will be able to create a chain for top level element (elements contains directly into a resource)
 * @author adaussy
 *
 */
public class ResourceRevealerRevealer implements IModelExplorerRevealerParticipant {

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.modelexplorer.revealer.IModelExplorerRevealerParticipant#getRevealerChain(org.eclipse.emf.ecore.EObject)
	 */
	public ChainLink getRevealerChain(EObject targetObject) {
		//Only handle top level object directly contained into resoures
		if(!(targetObject != null && targetObject.eContainer() == null && targetObject.eResource() != null)) {
			return null;
		}
		Resource r = targetObject.eResource();
		ResourceSet rs = r.getResourceSet();
		if(rs instanceof ModelSet && AdditionalResourcesModel.isAdditionalResource((ModelSet)rs, r.getURI())) {
			ChainLink chainLink = new ChainLink();
			chainLink.setNexObject(null);
			chainLink.getMatchingObjects().add(new ReferencableMatchingItem(r));
			chainLink.getMatchingObjects().add(new ReferencableMatchingItem(rs));
			return chainLink;
		}
		return null;
	}

	public EObject getItemMatchingToSelect(EObject targetEObject) {
		return null;
	}

}
