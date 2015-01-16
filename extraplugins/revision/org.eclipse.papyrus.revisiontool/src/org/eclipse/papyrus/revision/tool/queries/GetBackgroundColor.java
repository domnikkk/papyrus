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

/** This class is query that returns the color of the element by taking account information about Compare model. */
public class GetBackgroundColor implements  IJavaQuery2<EObject, IColor> {
	protected Color blue=new Color(0,0,250);
	protected Color red=new Color(250,0,0);
	protected Color green=new Color(0,250,0);
	protected Color black=new Color(0,0,0);
	
	public IColor evaluate(final EObject context, final IParameterValueList2 parameterValues, final IFacetManager facetManager){
		if( context instanceof Element){
			Element element= (Element)context;
			IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
			if( part instanceof ReviewsEditor){
				ReviewResourceManager reviewResourceManager=((ReviewsEditor)part).getReviewResourceManager();
				if(reviewResourceManager.getCurrentReviewModelWithoutLoading()!=null){
				Comparison comparison=reviewResourceManager.getDiffModel();
				if(comparison.getMatch(element)!=null){
					return blue;
				}
				
				if(comparison.getDifferences(element).size()>0){
					if(comparison.getDifferences(element).get(0).getKind().equals(DifferenceKind.DELETE)&& isChangeAboutContaiment(comparison, element)){
								return red;
					}
					if(comparison.getDifferences(element).get(0).getKind().equals(DifferenceKind.ADD)&& isChangeAboutContaiment(comparison, element)){
								return green;
					}
					if(comparison.getDifferences(element).get(0).getKind().equals(DifferenceKind.CHANGE)){
						return blue;
					}
					else{return black;}
					
				}
				else{return black;}
			}
			}
		}
		return black;
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
