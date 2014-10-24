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
package org.eclipse.papyrus.req.reqif.queries;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.req.reqif.I_SysMLStereotype;
import org.eclipse.papyrus.uml.tools.providers.DelegatingItemLabelProvider;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/** get the name + the list of applied stereotypes */
public class GetComplexName implements IJavaQuery2<NamedElement, String> {

	/**
	 * test if the stereotype is a SysML Requirement Stereotype
	 * @param stereotype a given stereotype
	 * @return return true if this is a SysML stereotype or inherits directly or indirectly from requirement
	 */
	protected boolean isRequirementStereotype(Stereotype stereotype) {
		if( I_SysMLStereotype.REQUIREMENT_STEREOTYPE.equals(stereotype.getQualifiedName())){
			return true;
		}
		for(org.eclipse.uml2.uml.Class superStereotype : stereotype.getSuperClasses()) {
			if( superStereotype instanceof Stereotype){
				if(isRequirementStereotype((Stereotype)superStereotype)){
					return true;
				}
			}
		}
		return false;
	}

	private static final IItemLabelProvider labelProvider = new DelegatingItemLabelProvider();

	public String evaluate(NamedElement source, IParameterValueList2 parameterValues, IFacetManager facetManager) throws DerivedTypedElementException {
		ParameterValue parameterValue = parameterValues.getParameterValueByName("eObject"); //$NON-NLS-1$
		if (parameterValue.getValue() instanceof EStructuralFeature) {
			return ((EStructuralFeature) parameterValue.getValue()).getName();
		}
		Stereotype stereotypeReq=source.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
		Stereotype appStereotype=null;
		if(source.getAppliedStereotypes().size()>0){
			appStereotype=source.getAppliedStereotypes().get(0);
		}
		if(stereotypeReq!=null){
			return ""+source.getValue(stereotypeReq, I_SysMLStereotype.REQUIREMENT_ID_ATT)+": "+source.getValue(stereotypeReq, I_SysMLStereotype.REQUIREMENT_TEXT_ATT);
		}
		if((source instanceof org.eclipse.uml2.uml.Class) &&(appStereotype!=null) && (isRequirementStereotype(appStereotype))){
			return ""+source.getValue(appStereotype, I_SysMLStereotype.REQUIREMENT_ID_ATT)+": "+source.getValue(appStereotype, I_SysMLStereotype.REQUIREMENT_TEXT_ATT);
		}
		// Delegate to UML2 Edit providers to get localized and inferred names where applicable
		return labelProvider.getText(source);
	}
}
