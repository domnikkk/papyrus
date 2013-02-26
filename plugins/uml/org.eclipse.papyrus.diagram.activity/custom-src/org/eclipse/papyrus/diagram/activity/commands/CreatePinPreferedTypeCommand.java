/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Arthur Daussy (Atos) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.activity.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.diagram.activity.helper.IPinToParameterLinkCommand;
import org.eclipse.papyrus.umlutils.ui.command.CreateEAnnotationCommand;

/**
 * Create a eannotation to store the Pin Prefered EClass for for pin creation matching this model element
 * 
 * @author adaussy
 * 
 */
public class CreatePinPreferedTypeCommand extends CreateEAnnotationCommand {

	private EAnnotation eAnnotation;

	private EModelElement modelOwner;

	private Object preferedType;

	public CreatePinPreferedTypeCommand(TransactionalEditingDomain domain, EModelElement object, EClass preferedType) {
		super(domain, object, IPinToParameterLinkCommand.PREFERED_PIN_TYPE);
		this.modelOwner = object;
		this.preferedType = preferedType;
	}

	public CreatePinPreferedTypeCommand(TransactionalEditingDomain domain, EModelElement object, IElementType preferedType) {
		super(domain, object, IPinToParameterLinkCommand.PREFERED_PIN_TYPE);
		this.modelOwner = object;
		this.preferedType = preferedType;
	}

	@Override
	protected EAnnotation createEAnnotation() {
		eAnnotation = super.createEAnnotation();
		return eAnnotation;
	}

	@Override
	protected void doExecute() {
		//try to get an old EAnnotation
		eAnnotation = modelOwner.getEAnnotation(IPinToParameterLinkCommand.PREFERED_PIN_TYPE);
		if(eAnnotation == null) {
			super.doExecute();
		}
		EList<EObject> references = eAnnotation.getReferences();
		if(!references.isEmpty()) {
			references.clear();
		}
		if(preferedType instanceof EObject) {
			references.add((EObject)preferedType);
		} else if(preferedType instanceof IElementType) {
			eAnnotation.getDetails().put(IElementType.class.getCanonicalName(), ((IElementType)preferedType).getId());
		}
	}

	/**
	 * Retrieve the object representing the Pin Preferred type
	 * 
	 * @param object
	 * @return
	 */
	public static Object getPreferedType(EModelElement object) {
		EAnnotation eAnnotationLocal = object.getEAnnotation(IPinToParameterLinkCommand.PREFERED_PIN_TYPE);
		if(eAnnotationLocal == null) {
			return null;
		}
		if(!eAnnotationLocal.getReferences().isEmpty()) {
			return eAnnotationLocal.getReferences().get(0);
		}
		EMap<String, String> details = eAnnotationLocal.getDetails();
		String elementTypeId = details.get(IElementType.class.getCanonicalName());
		if(elementTypeId != null) {
			return ElementTypeRegistry.getInstance().getType(elementTypeId);
		}
		return null;
	}
}
