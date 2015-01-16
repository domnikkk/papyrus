/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ansgar Radermacher (CEA LIST) ansgar.radermacher@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.umlrt.properties.modelelement;

import java.util.Hashtable;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.uml.properties.modelelement.UMLModelElement;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Realization;

/**
 * A UMLRTModelElement provider. In particular, it will take care of UMLRT protocols which reference provided, required and prov/required interfaces.
 * These can not be specified by means of a property path, since they depend on implemented or used interfaces which are not directly provided.
 * The idea of this class is to delegate to UMLModelElement belonging to these interfaces
 */
public class UMLRTExtModelElement extends UMLModelElement {

	private Hashtable<Element, UMLModelElement> delegationModelElements;

	private final String ownedOp = "ownedOperation"; //$NON-NLS-1$

	public UMLRTExtModelElement(EObject source) {
		super(source);
		delegationModelElements = new Hashtable<Element, UMLModelElement>();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Get the delegating model element
	 * @param element
	 * @return
	 */
	public UMLModelElement getDelegationModelElement(Element element) {
		UMLModelElement delegationModelElement = delegationModelElements.get(element);
		if (delegationModelElement == null) {
			delegationModelElement = new UMLModelElement(element);
			delegationModelElements.put(element, delegationModelElement);
		}
		return delegationModelElement;
	}

	@Override
	public IStaticContentProvider getContentProvider(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).getContentProvider(ownedOp);
		}
		return super.getContentProvider(propertyPath);
	}

	@Override
	public boolean isOrdered(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).isOrdered(ownedOp);
		}
		return super.isOrdered(propertyPath);
	}

	@Override
	public boolean isMandatory(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).isMandatory(ownedOp);
		}
		return super.isMandatory(propertyPath);
	}

	@Override
	public ILabelProvider getLabelProvider(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).getLabelProvider(ownedOp);
		}
		return super.getLabelProvider(propertyPath);
	}

	@Override
	public EStructuralFeature getFeature(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).getFeature(ownedOp);
		}
		return super.getFeature(propertyPath);
	}

	@Override
	public FeaturePath getFeaturePath(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).getFeaturePath(ownedOp);
		}
		return super.getFeaturePath(propertyPath);
	}

	@Override
	public IObservable doGetObservable(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).doGetObservable(ownedOp);
		}
		return super.doGetObservable(propertyPath);
	}

	@Override
	public ReferenceValueFactory getValueFactory(String propertyPath) {
		Interface intf = getProvidedOrRequiredInterface(propertyPath);
		if (intf != null) {
			return getDelegationModelElement(intf).getValueFactory(ownedOp);
		}
		return super.getValueFactory(propertyPath);
	}

	/**
	 * return the interface that is required or provides, depending on propertyPath
	 * @param propertyPath
	 * @return provided or required interface
	 */
	protected Interface getProvidedOrRequiredInterface(String propertyPath) {
		if (source instanceof Collaboration) {
			if (propertyPath.endsWith("provides")) { //$NON-NLS-1$
				for (Interface intf : getProvideds()) {
					// interface is only in provided list
					if (!getRequireds().contains(intf)) {
						return intf;
					}
				}
			}
			else if (propertyPath.endsWith("required")) { //$NON-NLS-1$
				for (Interface intf : getRequireds()) {
					// interface is only in required list
					if (!getProvideds().contains(intf)) {
						return intf;
					}
				}
			}
			else if (propertyPath.endsWith("provreq")) { //$NON-NLS-1$
				for (Interface intf : getRequireds()) {
					// interface must be in both lists
					if (getProvideds().contains(intf)) {
						return intf;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get the list of required interfaces. Don't use getImplementedInterfaces, since it only captures
	 * the interface realization and not the realization relationship.
	 * @return list of required interfaces
	 */
	protected EList<Interface> getProvideds() {
		EList<Interface> provideds = new BasicEList<Interface>();
		for (DirectedRelationship directedRelation : ((Collaboration) source).getSourceDirectedRelationships()) {
			if (directedRelation instanceof Realization) {
				EList<NamedElement> suppliers = ((Realization) directedRelation).getSuppliers();
				if (suppliers.size() > 0) {
					NamedElement supplier = suppliers.get(0);
					if (supplier instanceof Interface) {
						provideds.add((Interface) supplier);
					}
				}
			}
		}
		return provideds;
	}
	
	protected EList<Interface> getRequireds() {
		return ((Collaboration) source).getUsedInterfaces();
	}
}
