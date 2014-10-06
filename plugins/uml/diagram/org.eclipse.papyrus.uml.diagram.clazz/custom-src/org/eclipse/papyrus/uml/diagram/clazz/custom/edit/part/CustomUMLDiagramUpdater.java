/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLLinkDescriptor;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;


public class CustomUMLDiagramUpdater extends UMLDiagramUpdater {

	public static final CustomUMLDiagramUpdater INSTANCE = new CustomUMLDiagramUpdater();

	private CustomUMLDiagramUpdater() {
		// to prevent instantiation
		super();
	}

	@Override
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Association_4001(Package container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List<?> targets = link.getEndTypes();
			Object theTarget = targets.size() >= 2 ? targets.get(1) : null;
			if (false == theTarget instanceof Type) {
				continue;
			}
			Type dst = (Type) theTarget;
			List<?> sources = link.getEndTypes();
			Object theSource = sources.size() >= 2 ? sources.get(0) : null;
			if (false == theSource instanceof Type) {
				continue;
			}
			Type src = (Type) theSource;
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Association_4001, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	@Override
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4001(Type target, CrossReferenceAdapter crossReferencer) {
		return new TypeModelFacetLinksRetriever_Association_4001(target) {

			@Override
			protected boolean check(Type source, Type target) {
				return getRoot() == target;
			}
		}.getTypeModelFacetLinks_Association_4001();
	}

	@Override
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4001(Type source) {
		return new TypeModelFacetLinksRetriever_Association_4001(source) {

			@Override
			protected boolean check(Type source, Type target) {
				return getRoot() == source;
			}
		}.getTypeModelFacetLinks_Association_4001();
	}

	private abstract static class TypeModelFacetLinksRetriever_Association_4001 {
		private final Type myRoot;

		public TypeModelFacetLinksRetriever_Association_4001(Type root) {
			myRoot = root;
		}

		public Collection<UMLLinkDescriptor> getTypeModelFacetLinks_Association_4001() {
			Package container = null;
			// Find container element for the link.
			// Climb up by containment hierarchy starting from the source
			// and return the first element that is instance of the container class.
			for (EObject element = myRoot; element != null && container == null; element = element.eContainer()) {
				if (element instanceof Package) {
					container = (Package) element;
				}
			}
			if (container == null) {
				return Collections.emptyList();
			}
			LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
			for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
				EObject linkObject = (EObject) links.next();
				if (false == linkObject instanceof Association) {
					continue;
				}
				Association link = (Association) linkObject;
				if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
					continue;
				}
				List<?> ends = link.getEndTypes();
				if (ends == null || ends.isEmpty()) {
					continue;
				}
				Object theTarget = ends.size() == 2 ? ends.get(1) : ends.get(0);
				if (false == theTarget instanceof Type) {
					continue;
				}
				Type dst = (Type) theTarget;
				Object theSource = ends.get(0);
				if (false == theSource instanceof Type) {
					continue;
				}
				Type src = (Type) theSource;
				if (!check(src, dst)) {
					continue;
				}
				result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Association_4001, AssociationEditPart.VISUAL_ID));
			}
			return result;
		}

		protected Type getRoot() {
			return myRoot;
		}

		protected abstract boolean check(Type source, Type target);
	}
}
