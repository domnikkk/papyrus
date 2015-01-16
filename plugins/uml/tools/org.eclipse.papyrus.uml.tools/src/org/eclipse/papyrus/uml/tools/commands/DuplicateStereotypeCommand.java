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
package org.eclipse.papyrus.uml.tools.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * A Command to apply a Stereotype and its data to an UML Element
 * 
 * @author Benoit Maggi
 */
public class DuplicateStereotypeCommand extends RecordingCommand {
	
	protected Element element;

	protected EObject stereotypeApplication;

	protected Stereotype stereotypeInTargetContext;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param element
	 *        The UML Element on which the stereotype will be applied
	 * @param stereotype
	 *        The stereotypes to apply
	 */
	public DuplicateStereotypeCommand(TransactionalEditingDomain domain, Element element, EObject stereotypeApplication) {
		super(domain);
		this.element = element;
		this.stereotypeApplication = stereotypeApplication;
		// reload the stereotype in the new Context-ResourceSet (Required because in org.eclipse.uml2.uml.internal.operations.PackageOperations
		// L960 in getProfileApplication the test is using == instead of equals)
		Stereotype stereotype = UMLUtil.getStereotype(stereotypeApplication);
		Stereotype stereotypeInTargetContext = EMFHelper.reloadIntoContext(stereotype, element);	
		this.stereotypeInTargetContext = stereotypeInTargetContext;
	}

	public Stereotype getStereotypeInTargetContext() {
		return stereotypeInTargetContext;
	}	
	
	@Override
	protected void doExecute() {
		EObject applyStereotype = element.applyStereotype(stereotypeInTargetContext);
		EList<EStructuralFeature> eStructuralFeatures = applyStereotype.eClass().getEStructuralFeatures();
		for(EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			String name = eStructuralFeature.getName();
			if(!name.startsWith(Extension.METACLASS_ROLE_PREFIX) && eStructuralFeature.isChangeable()) {
				applyStereotype.eSet(eStructuralFeature, stereotypeApplication.eGet(eStructuralFeature));
			}
		}
	}
}
