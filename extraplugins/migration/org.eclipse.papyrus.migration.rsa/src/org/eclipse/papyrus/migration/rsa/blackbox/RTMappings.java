/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.blackbox;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Implements the Blackbox mappings for RSARTToPapyrusRT
 *
 * @author Camille Letavernier
 *
 */
public class RTMappings {

	@Operation(contextual = true, kind = Kind.MAPPING, withExecutionContext = true)
	public static org.eclipse.uml2.uml.Class toClass(IContext context, Collaboration collaboration) {
		return refactorType(context, collaboration, UMLPackage.eINSTANCE.getClass_(), org.eclipse.uml2.uml.Class.class);
	}

	@Operation(contextual = true, kind = Kind.MAPPING, withExecutionContext = true)
	public static SignalEvent toSignalEvent(IContext context, CallEvent callEvent) {
		return refactorType(context, callEvent, UMLPackage.eINSTANCE.getSignalEvent(), SignalEvent.class);
	}

	@Operation(contextual = true, kind = Kind.MAPPING, withExecutionContext = false)
	public static LiteralString toLiteralString(OpaqueExpression expression) {
		return refactorType(null, expression, UMLPackage.eINSTANCE.getLiteralString(), LiteralString.class);
	}

	//Not public to avoid confusing QVTo (Public methods are part of the Blackbox unit API)
	private static <T extends Element> T refactorType(IContext context, EObject sourceElement, EClass targetEClass, java.lang.Class<T> resultType) {
		//Retrieve the resource at the beginning, because the source element will be removed from its container at some point
		//		Resource resource = sourceElement.eResource();

		//Create a Class and maintain the features (Attributes and References)
		T result = resultType.cast(UMLFactory.eINSTANCE.create(targetEClass));
		for(EStructuralFeature sourceFeature : sourceElement.eClass().getEAllStructuralFeatures()) {
			EStructuralFeature targetFeature = result.eClass().getEStructuralFeature(sourceFeature.getName());
			if(targetFeature != null && targetFeature.isChangeable()) {
				result.eSet(targetFeature, sourceElement.eGet(sourceFeature));
			}
		}

		//Fix incoming references
		Collection<EStructuralFeature.Setting> incomingReferences = CacheAdapter.getInstance().getInverseReferences(sourceElement);
		for(EStructuralFeature.Setting setting : incomingReferences) {
			EStructuralFeature feature = setting.getEStructuralFeature();
			if(feature.isChangeable() && feature.getEType().isInstance(result)) {
				if(feature.isMany()) {
					Object value = setting.get(true);
					if(value instanceof Collection<?>) {
						List<Object> copy = new LinkedList<Object>((Collection<?>)value);

						while(true) {
							int index = copy.indexOf(sourceElement);
							if(index < 0) {
								break;
							}

							copy.remove(index);
							copy.add(index, result);
						}

						setting.set(copy);
					}
				} else {
					setting.set(result);
				}
			}
		}

		//TODO: Keep the same XMI ID
		//This algorithm doesn't work here, because the object has been added to a temporary resource (ModelExtent), which doesn't support IDs mapping
		//We need to track the mapping somewhere else

		//		if(resource instanceof XMLResource) {
		//			XMLResource xmlResource = (XMLResource)resource;
		//			xmlResource.setID(result, xmlResource.getID(sourceElement));
		//		}
		return result;
	}
}
