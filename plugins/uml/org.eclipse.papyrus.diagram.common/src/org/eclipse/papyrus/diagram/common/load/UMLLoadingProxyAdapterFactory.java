/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Matthieu Boivineau (Atos) - Initial API and implementation 
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.load;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.SendOperationEvent;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class UMLLoadingProxyAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if(adapterType.equals(IEObjectLoadingProxy.class)) {
			UMLSwitch<IEObjectLoadingProxy> aSwitch = new UMLSwitch<IEObjectLoadingProxy>() {

				@Override
				public IEObjectLoadingProxy caseCallEvent(CallEvent object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(((CallEvent)obj).getOperation());
							return list;
						}
					};
				}

				@Override
				public IEObjectLoadingProxy caseLifeline(Lifeline object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(((Lifeline)obj).getRepresents());
							return list;
						}
					};
				}

				@Override
				public IEObjectLoadingProxy caseOccurrenceSpecification(OccurrenceSpecification object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(((OccurrenceSpecification)obj).getEvent());
							return list;
						}
					};
				}

				@Override
				public IEObjectLoadingProxy caseMessage(Message object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(((Message)obj).getReceiveEvent());
							list.add(((Message)obj).getSendEvent());
							return list;
						}
					};
				}

				@Override
				public IEObjectLoadingProxy caseSendOperationEvent(SendOperationEvent object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(((SendOperationEvent)obj).getOperation());
							return list;
						}
					};
				}

				@Override
				public IEObjectLoadingProxy caseTypedElement(TypedElement object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(((TypedElement)obj).getType());
							return list;
						}
					};
				}

				@Override
				public IEObjectLoadingProxy caseBehavioralFeature(BehavioralFeature object) {
					return new IEObjectLoadingProxy() {

						public List<EObject> getProxyEObjects(EObject obj) {
							List<EObject> list = new ArrayList<EObject>();
							list.addAll(((BehavioralFeature)obj).getOwnedParameters());
							return list;
						}
					};
				}

			};
			return aSwitch.doSwitch((EObject)adaptableObject);
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[]{ IEObjectLoadingProxy.class };
	}

}
