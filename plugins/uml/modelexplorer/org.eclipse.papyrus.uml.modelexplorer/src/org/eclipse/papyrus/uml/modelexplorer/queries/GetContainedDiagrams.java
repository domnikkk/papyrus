/**
 *  Copyright (c) 2011 Atos.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Atos - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.uml.modelexplorer.queries;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.facet.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.emf.facet.infra.query.core.java.IJavaModelQuery;
import org.eclipse.emf.facet.infra.query.core.java.ParameterValueList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.views.modelexplorer.queries.AbstractEditorContainerQuery;
import org.eclipse.uml2.uml.Element;

/** Get the collection of all contained diagrams */
public class GetContainedDiagrams extends AbstractEditorContainerQuery implements IJavaModelQuery<Element, Collection<org.eclipse.gmf.runtime.notation.Diagram>> {

	public Collection<org.eclipse.gmf.runtime.notation.Diagram> evaluate(final Element context, final ParameterValueList parameterValues) throws ModelQueryExecutionException {
		Collection<Diagram> diagrams = new ArrayList<Diagram>();

		try {
			for(Object page : getPageMngr().allPages()) {
				if(!(page instanceof Diagram)) {
					continue;
				}
				// We have a GMF Diagram
				Diagram diagram = (Diagram)page;
				if(context.equals(diagram.getElement())) {
					diagrams.add(diagram);
				}

			}
		} catch (ServiceException e) {
			//When the customization is not loaded in a Papyrus context, it simply evaluates to false
			//nothing to do
		}
		return diagrams;
	}
}
