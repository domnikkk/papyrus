/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved.
 * This code is the property of CEA LIST, this use is subject to specific 
 * agreement with the CEA LIST.
 * Contributors:
 *     CEA LIST. - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.revision.tool.queries;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;

/** This class is query that returns the boolean. It returns true if the element is deleted from the Compare model */
public class GetStrike implements  IJavaQuery2<EObject, Boolean> {
	public Boolean evaluate(final EObject context, final IParameterValueList2 parameterValues, final IFacetManager facetManager){
		if( context instanceof Element){
			Element element= (Element)context;
			IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
			if( part instanceof ReviewsEditor){
				ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
				if(reviewResourceManager.getCurrentReviewModelWithoutLoading()!=null){
					Comparison comparison=reviewResourceManager.getDiffModel();
					if(comparison.getDifferences(element).size()>0){
						if(comparison.getDifferences(element).get(0).getKind().equals(DifferenceKind.DELETE) && isChangeAboutContaiment(comparison, element)){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	protected boolean isChangeAboutContaiment(Comparison comparison, EObject element){
		if(comparison.getDifferences(element).get(0) instanceof ReferenceChange){
			ReferenceChange refChange=(ReferenceChange)comparison.getDifferences(element).get(0);
			if( refChange.getReference().isContainment()){
				return true;
			}
		}
		return false;
	}
}
