/**
 *  Copyright (c) 2012 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning 
 */
package org.eclipse.emf.facet.efacet.core;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.efacet.core.internal.FacetCatalogManagerFactory;

/**
 * @since 0.2
 */
public interface IFacetSetCatalogManagerFactory {
	
	IFacetSetCatalogManagerFactory DEFAULT = new FacetCatalogManagerFactory();
	
	IFacetSetCatalogManager getOrCreateFacetSetCatalogManager(ResourceSet resourceSet);
}
