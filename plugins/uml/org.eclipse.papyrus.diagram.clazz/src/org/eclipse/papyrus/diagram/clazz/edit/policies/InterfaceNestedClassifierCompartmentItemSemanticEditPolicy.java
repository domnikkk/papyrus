/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.diagram.clazz.edit.policies;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.papyrus.diagram.clazz.edit.commands.NestedClassForInterfaceCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.NestedInterfaceForInterfaceCreateCommand;
import org.eclipse.papyrus.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InterfaceNestedClassifierCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterfaceNestedClassifierCompartmentItemSemanticEditPolicy() {
		super(UMLElementTypes.Interface_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if(UMLElementTypes.Class_3008 == req.getElementType()) {
			return getGEFWrapper(new NestedClassForInterfaceCreateCommand(req));
		}
		if(UMLElementTypes.Interface_3038 == req.getElementType()) {
			return getGEFWrapper(new NestedInterfaceForInterfaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static Set<EReference> compartmentReferences;

	/**
	 * @generated
	 */
	protected Iterable<EReference> getCompartmentReferences() {
		if(compartmentReferences == null) {
			compartmentReferences = new HashSet();
			compartmentReferences.add(UMLPackage.eINSTANCE.getInterface_NestedClassifier());
			compartmentReferences.add(UMLPackage.eINSTANCE.getInterface_NestedClassifier());
		}
		return compartmentReferences;
	}

	protected boolean isMovedIntoCorrectCompartment(MoveRequest req) {
		for(Object entry : req.getElementsToMove().entrySet()) {
			if(entry instanceof Map.Entry<?, ?>) {
				Map.Entry<?, ?> mapEntry = (Map.Entry<?, ?>)entry;
				Object key = mapEntry.getKey();
				if(key instanceof EObject) {
					EObject dropppedObject = (EObject)key;
					EObject semanticHost = ((IGraphicalEditPart)getHost()).resolveSemanticElement();
					boolean foundERefrences = false;
					if(semanticHost != null) {
						for(EReference ref : getCompartmentReferences()) {
							if(ref.isContainment()) {
								foundERefrences |= PackageUtil.canContain(semanticHost.eClass(), ref, dropppedObject.eClass(), false);
							} else {
								foundERefrences |= PackageUtil.canReference(semanticHost.eClass(), ref, dropppedObject.eClass());
							}
						}
						if(!foundERefrences) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	@Override
	protected Command getMoveCommand(MoveRequest req) {
		if(isMovedIntoCorrectCompartment(req)) {
			return super.getMoveCommand(req);
		} else {
			return UnexecutableCommand.INSTANCE;
		}
	}
}
