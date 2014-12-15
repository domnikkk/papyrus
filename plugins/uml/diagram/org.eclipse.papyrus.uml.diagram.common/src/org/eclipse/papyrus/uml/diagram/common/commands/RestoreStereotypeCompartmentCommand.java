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
package org.eclipse.papyrus.uml.diagram.common.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * A Command to restore a stereotype compartment with the good stereotype application
 * 
 * @author Benoit Maggi
 */
public class RestoreStereotypeCompartmentCommand extends RecordingCommand {

	protected BasicCompartment basicCompartment;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param element
	 *            The UML Element on which the stereotype will be applied
	 * @param stereotype
	 *            The stereotypes to apply
	 */
	public RestoreStereotypeCompartmentCommand(TransactionalEditingDomain domain, BasicCompartment basicCompartment) {
		super(domain);
		this.basicCompartment = basicCompartment;
	}

	@Override
	protected void doExecute() {
		EObject element = basicCompartment.getElement();
		Element baseElement = UMLUtil.getBaseElement(element);
		if (baseElement != null) {
			EObject eContainer = basicCompartment.eContainer();
			if (eContainer instanceof View) {
				View containerView = (View) eContainer;
				EObject containerEObject = containerView.getElement();
				if (containerEObject instanceof Element){
					Element containerElement = (Element) containerEObject;
					if (!baseElement.equals(containerEObject)) {
						Stereotype stereotype = UMLUtil.getStereotype(element);
						EObject containerStereotypeApplication = containerElement.getStereotypeApplication(stereotype);
						basicCompartment.setElement(containerStereotypeApplication);
					}
				}

			}
		}

	}
}
