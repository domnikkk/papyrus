/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 425270
 *  
 /*****************************************************************************/
package org.eclipse.papyrus.uml.modelexplorer.queries;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.uml.tools.providers.DelegatingItemLabelProvider;
import org.eclipse.uml2.uml.NamedElement;

/** get the name + the list of applied stereotypes */
public class GetComplexName implements IJavaQuery2<NamedElement, String> {

	/**
	 * Left Stereotype delimiters ('Guillemets francais').
	 * 
	 * @deprecated No longer used.
	 */
	@Deprecated
	public static String ST_LEFT = "\u00AB"; //$NON-NLS-1$

	/**
	 * Right Stereotype delimiters ('Guillemets francais').
	 * 
	 * @deprecated No longer used.
	 */
	@Deprecated
	public static String ST_RIGHT = "\u00BB"; //$NON-NLS-1$

	private static final IItemLabelProvider labelProvider = new DelegatingItemLabelProvider();

	public String evaluate(NamedElement source, IParameterValueList2 parameterValues, IFacetManager facetManager) throws DerivedTypedElementException {
		ParameterValue parameterValue = (ParameterValue)parameterValues.getParameterValueByName("eObject"); //$NON-NLS-1$
		if(parameterValue.getValue() instanceof EStructuralFeature) {
			return ((EStructuralFeature)parameterValue.getValue()).getName();
		}

		// Delegate to UML2 Edit providers to get localized and inferred names where applicable
		return labelProvider.getText(source);
	}
}
