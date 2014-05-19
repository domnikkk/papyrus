/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.common.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;


public class TableUtil {

	/**
	 * Gets the tables associated to element.
	 * 
	 * @param element
	 * @param resourceSet
	 *        can be null, it will then try to retrieve it from the element.
	 * @return the list of diagrams associated with the given element
	 */
	public static List<Table> getAssociatedTables(EObject element, ResourceSet resourceSet) {
		if(resourceSet == null) {
			if(element != null && element.eResource() != null) {
				resourceSet = element.eResource().getResourceSet();
			}
		}

		if(resourceSet instanceof ModelSet) {
			Resource notationResource = NotationUtils.getNotationResource((ModelSet)resourceSet);
			return getAssociatedTablesFromNotationResource(element, notationResource);
		}

		return Collections.emptyList();
	}

	/**
	 * Gets the diagrams associated to element.
	 * 
	 * @param element
	 * @param notationResource
	 *        the notation resource where to look for diagrams
	 * @return the list of diagrams associated with the given element
	 */
	public static List<Table> getAssociatedTablesFromNotationResource(EObject element, Resource notationResource) {
		if(notationResource != null) {
			LinkedList<Table> tables = new LinkedList<Table>();
			for(EObject eObj : notationResource.getContents()) {
				if(eObj instanceof Table) {
					Table table = (Table)eObj;
					if(element.equals(table.getOwner())) {
						tables.add(table);
					}
				}
			}
			return tables;
		}
		return Collections.emptyList();
	}
}
