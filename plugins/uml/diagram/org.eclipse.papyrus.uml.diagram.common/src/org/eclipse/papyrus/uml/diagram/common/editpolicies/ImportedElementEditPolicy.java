/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.editpolicies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.ExternalReferenceEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.SemanticElementHelper;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * UML-specific implementation of the {@link ExternalReferenceEditPolicy}
 *
 * It displays a decorator for elements which are located in another Package, and
 * for inherited properties (displayed in a Classifier Representation which is not
 * the defining classifier)
 *
 * @author Camille Letavernier
 */
public class ImportedElementEditPolicy extends ExternalReferenceEditPolicy {

	@Override
	protected boolean isExternalRef(View diagramElement) {
		if(!super.isExternalRef(diagramElement)) {
			return false;
		}

		if(diagramElement == null) {
			return false;
		}

		View primaryView = SemanticElementHelper.findTopView(diagramElement);
		if(primaryView == null) {
			return false;
		}

		EObject semanticElement = primaryView.getElement();

		if(!(semanticElement instanceof Element)) {
			return false;
		}

		//Special case for properties
		if(semanticElement instanceof Property) {
			return isInheritedProperty(diagramElement);
		}

		//Don't display decorators on Constraints and Comments. Their graphical containment is not meant
		//to match their semantic containment (The relationship is often represented with a link)
		if(semanticElement instanceof Constraint || semanticElement instanceof Comment) {
			return false;
		}

		EObject parentView = primaryView.eContainer();
		if(!(parentView instanceof View)) {
			return false;
		}

		EObject parentSemanticElement = ((View)parentView).getElement();
		if(!(parentSemanticElement instanceof Element)) {
			return false;
		}


		//Generic case: graphical containment doesn't match the semantic containment (We only check Package containment)
		Element semanticUMLElement = (Element)semanticElement;
		Element parentUMLElement = (Element)parentSemanticElement;

		if(parentUMLElement instanceof Package) {
			return semanticUMLElement.getNearestPackage() != parentUMLElement;
		}

		return semanticUMLElement.getNearestPackage() != parentUMLElement.getNearestPackage();
	}

	//Display a decorator on inherited properties, when they are displayed in a Classifier
	//Don't display a decorator for properties displayed as white box parts/references (Part with port, Part with structure, ...)
	protected boolean isInheritedProperty(View diagramElement) {
		View primaryView = SemanticElementHelper.findTopView(diagramElement);
		if(primaryView == null) {
			return false;
		}

		View parentView = (View)primaryView.eContainer();
		if(parentView == null) {
			return false;
		}

		EObject semanticElement = SemanticElementHelper.findSemanticElement(diagramElement);
		if(!(semanticElement instanceof Property)) {
			return false;
		}

		Property property = (Property)semanticElement;

		EObject semanticParent = SemanticElementHelper.findSemanticElement(parentView);

		if(semanticParent instanceof Property) { //For parts/ref/ports, never display the decorator
			//semanticParent = ((Property)semanticParent).getType(); //Check the inheritance from the type
			return false;
		}

		if(semanticParent instanceof Classifier) {
			return property.eContainer() != semanticParent;
		} else {
			return true;
		}
	}

}
