/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.custom.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.EObjectValueStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.dialogs.NewElementRepresentation;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PortEditPart;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLViewProvider;

/**
 * this class is used to create the lollipop interface from a port
 *
 */
public class CreateLollipopPortCommand extends RecordingCommand {

	protected List<Object> providedInterface = new ArrayList<Object>();

	protected List<Object> requiredInterface = new ArrayList<Object>();

	protected PortEditPart porteditPart = null;

	/**
	 * 
	 * Constructor.
	 *
	 * @param domain
	 *        the transactional editing domain
	 * @param provided
	 *        a list of provided interface to display
	 * @param required
	 *        a list of required interface to display
	 * @param portEditpart
	 *        the port editpart form which interfaces will be displayed
	 */
	public CreateLollipopPortCommand(TransactionalEditingDomain domain, Collection<Object> provided, Collection<Object> required, PortEditPart portEditpart) {
		super(domain, "Creation of lollipop for ports");
		providedInterface.addAll(provided);
		requiredInterface.addAll(required);
		this.porteditPart = portEditpart;
	}

	@Override
	protected void doExecute() {
		UMLViewProvider umlViewProvider = new UMLViewProvider();
		// get the position of the port around its container...
		IFigure parentFigure = ((GraphicalEditPart)porteditPart.getParent()).getFigure();
		Rectangle bounds = parentFigure.getBounds();
		Rectangle insideRect = bounds.getCopy().shrink(new Insets(30));
		int position = insideRect.getPosition(porteditPart.getLocation());
		// take the great parent of the port
		EditPart componentEditPart = porteditPart.getParent();
		EditPart container = componentEditPart.getParent();
		for(Object currentRequired : requiredInterface) {


			EObject interfaceRequired = null;
			if(currentRequired instanceof NewElementRepresentation) {
				interfaceRequired = ((NewElementRepresentation)currentRequired).getEObject();
			} else {
				interfaceRequired = (EObject)currentRequired;
			}

			Node node = createInterfacenode(umlViewProvider, container, interfaceRequired);
			setPositionNode(node, position);
			String kind = "REQUIRED";
			createEdge(umlViewProvider, node, kind);
		}
		for(Object currentprovided : providedInterface) {


			EObject interfaceProvided = null;
			if(currentprovided instanceof NewElementRepresentation) {
				interfaceProvided = ((NewElementRepresentation)currentprovided).getEObject();
			} else {
				interfaceProvided = (EObject)currentprovided;
			}

			Node node = createInterfacenode(umlViewProvider, container, interfaceProvided);
			setPositionNode(node, position);
			String kind = "PROVIDED";
			createEdge(umlViewProvider, node, kind);
		}
	}

	/**
	 * creation of the edge form the port to the interface
	 * 
	 * @param umlViewProvider
	 * @param node
	 *        the node that represent the interface
	 * @param kind
	 *        kind of the interface REQUIRED or PROVIDED
	 */
	protected void createEdge(UMLViewProvider umlViewProvider, Node node, String kind) {
		Edge edge = umlViewProvider.createLink_4018(((View)porteditPart.getModel()).getDiagram(), -1, true, porteditPart.getDiagramPreferencesHint());
		IdentityAnchor anchor = NotationFactory.eINSTANCE.createIdentityAnchor();
		edge.setSourceAnchor(anchor);
		anchor = NotationFactory.eINSTANCE.createIdentityAnchor();
		edge.setTargetAnchor(anchor);
		edge.setSource((View)porteditPart.getModel());
		edge.setTarget(node);
		edge.setElement(null);
		EObjectValueStyle eObjectValueStyle = (EObjectValueStyle)edge.createStyle(NotationPackage.eINSTANCE.getEObjectValueStyle());
		eObjectValueStyle.setName(kind);
	}

	/**
	 * create the interface node
	 * 
	 * @param umlViewProvider
	 * @param container
	 *        the container of the interface node
	 * @param currentInterface
	 *        the interface
	 * @return the node
	 */
	protected Node createInterfacenode(UMLViewProvider umlViewProvider, EditPart container, EObject currentInterface) {
		Node node = umlViewProvider.createInterface_2003(currentInterface, (View)container.getModel(), -1, true, porteditPart.getDiagramPreferencesHint());
		((Bounds)node.getLayoutConstraint()).setWidth(20);
		((Bounds)node.getLayoutConstraint()).setHeight(20);
		return node;
	}

	/**
	 * use to place the interface node around the component form the port
	 * 
	 * @param node
	 *        the interface node
	 * @param position
	 *        the position where is the port NORTH SOUTH, EAST, WEST
	 */
	protected void setPositionNode(Node node, int position) {
		((Bounds)node.getLayoutConstraint()).setX(porteditPart.getLocation().x);
		((Bounds)node.getLayoutConstraint()).setY(porteditPart.getLocation().y);
		int distance = 60;
		if(position == PositionConstants.SOUTH) {
			((Bounds)node.getLayoutConstraint()).setY(((Bounds)node.getLayoutConstraint()).getY() + distance);
		} else if(position == PositionConstants.NORTH) {
			((Bounds)node.getLayoutConstraint()).setY(((Bounds)node.getLayoutConstraint()).getY() - distance);
		} else if(position == PositionConstants.EAST) {
			((Bounds)node.getLayoutConstraint()).setX(((Bounds)node.getLayoutConstraint()).getX() + distance);
		} else if(position == PositionConstants.WEST) {
			((Bounds)node.getLayoutConstraint()).setX(((Bounds)node.getLayoutConstraint()).getX() - distance);
		}
	}
}
