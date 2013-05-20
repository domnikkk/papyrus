/*****************************************************************************
 * Copyright (c) 2011 Atos.
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
package org.eclipse.papyrus.sysml.diagram.common.edit.policy;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.editpolicies.ArrangeAffixedNodeEditPolicy;
import org.eclipse.papyrus.diagram.common.requests.ArrangeAffixedNodeRequest;
import org.eclipse.papyrus.diagram.common.util.AffixedNodeDispatcher;
import org.eclipse.papyrus.sysml.diagram.common.util.PortViewDispatcher;
import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.papyrus.uml.diagram.common.utils.UMLGraphicalTypes;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Implementation of {@link ArrangeAffixedNodeEditPolicy} in order to arrange contained {@link Port} and {@link FlowPort}
 */
public class ArrangePortEditPolicy extends ArrangeAffixedNodeEditPolicy {

	/**
	 * {@inheritDoc ArrangeAffixedNodeEditPolicy}
	 * 
	 * @return
	 */
	@Override
	protected AffixedNodeDispatcher getDispatcher() {
		return PortViewDispatcher.getDispatcher();
	}

	/**
	 * Predicate to filter view of the port
	 */
	private Predicate<View> portFilterPredicate = null;

	protected Predicate<View> getPortFilterPredicate() {
		if(portFilterPredicate == null) {
			IGraphicalEditPart host = (IGraphicalEditPart)getHost();
			EObject semanticElement = host.resolveSemanticElement();
			if(semanticElement instanceof Element) {
				portFilterPredicate = new PortFilterPredicate();
			}
		}
		return portFilterPredicate;
	}

	protected EObject getOwner() {
		return ((IGraphicalEditPart)getHost()).resolveSemanticElement();
	}

	protected class PortFilterPredicate implements Predicate<View> {


		public boolean apply(View input) {
			if(input != null) {
				EObject owner = getOwner();
				EObject element = input.getElement();
				if(owner instanceof Property) {
					Type type = ((Property)owner).getType();
					if(type.getOwnedElements().contains(element)) {
						return SysMLGraphicalTypes.SHAPE_SYSML_FLOWPORT_AS_AFFIXED_ID.equals(input.getType()) || UMLGraphicalTypes.SHAPE_UML_PORT_AS_AFFIXED_ID.equals(input.getType());
					}
				} else if(owner instanceof Element) {
					if(((Element)owner).getOwnedElements().contains(element)) {
						return SysMLGraphicalTypes.SHAPE_SYSML_FLOWPORT_AS_AFFIXED_ID.equals(input.getType()) || UMLGraphicalTypes.SHAPE_UML_PORT_AS_AFFIXED_ID.equals(input.getType());
					}
				}
			}
			return false;
		}
	}

	@Override
	protected List<View> getViewToArrange(ArrangeAffixedNodeRequest request) {
		View hostView = ((IGraphicalEditPart)getHost()).getNotationView();
		if(hostView != null) {
			return Lists.newArrayList(Iterables.filter(Lists.newArrayList(hostView.getChildren()), getPortFilterPredicate()));
		}
		return Collections.emptyList();
	}
}
