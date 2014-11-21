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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.custom.metamodel.custompt.IColor;
import org.eclipse.papyrus.emf.facet.custom.ui.internal.custompt.Color;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;

/** isAVariableElement */
public class GetBackgroundColor implements  IJavaQuery2<EObject, IColor> {
	public IColor evaluate(final EObject context, final IParameterValueList2 parameterValues, final IFacetManager facetManager){
		if( context instanceof Element){
			Element element= (Element)context;
			IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
			if( part instanceof ReviewsEditor){
				ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
				if(reviewResourceManager.getCurrentReviewModelWithoutLoading()!=null){
				Comparison comparison=reviewResourceManager.getDiffModel();
				if(comparison.getDifferences(element).size()>0){
					if(comparison.getDifferences(element).get(0).getKind().equals(DifferenceKind.DELETE)){
						return new Color(250,0,0);
					}
					if(comparison.getDifferences(element).get(0).getKind().equals(DifferenceKind.ADD)){
						return new Color(0,250,0);
					}
					else{return new Color(0,0,250);}
					
				}
				else{return new Color(0,0,0);}
			}
			}
		}
		return new Color(0,0,0);
	}
}
