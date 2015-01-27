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
 *  Patrick Tessier (CEA LIST) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.uml.modelexplorer.queries;


import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.emf.facet.custom.metamodel.custompt.IImage;
import org.eclipse.papyrus.emf.facet.custom.ui.ImageUtils;
import org.eclipse.papyrus.emf.facet.custom.ui.internal.query.ImageQuery;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.uml2.uml.Element;

/** Create a basic label based on element name */
public class GetImageQuery implements IJavaQuery2<Element, IImage> {

	private static final UMLLabelProvider UML_LABEL_PROVIDER= new UMLLabelProvider();
	

	// @Override
	public IImage evaluate(Element source, IParameterValueList2 parameterValues, IFacetManager facetManager) throws DerivedTypedElementException {
		
		ParameterValue parameterValue = parameterValues.getParameterValueByName("eObject");
		if (parameterValue.getValue() instanceof EStructuralFeature) {
			return ImageQuery.getEObjectImage((EStructuralFeature) parameterValue.getValue());
		}
		return ImageUtils.wrap(UML_LABEL_PROVIDER.getImage(source));
	}
}
