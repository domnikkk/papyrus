/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
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
package org.eclipse.papyrus.diagram.clazz.custom.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest.ConnectionViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.util.INotationType;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.clazz.custom.command.AssociationClassViewCreateCommand;
import org.eclipse.papyrus.diagram.clazz.custom.command.SemanticAdapter;
import org.eclipse.papyrus.diagram.clazz.custom.providers.CustomDeferredCreateConnectionViewCommand;
import org.eclipse.papyrus.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.diagram.common.helper.ElementHelper;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Property;

/**
 * The Class AssociationClassHelper has in charge to create command to display or to drop an
 * associationclass
 */
public class AssociationClassHelper extends ElementHelper {

	/**
	 * Instantiates a new association class helper.
	 * 
	 * @param editDomain
	 *            the edit domain
	 */
	public AssociationClassHelper(TransactionalEditingDomain editDomain) {
		this.editDomain = editDomain;
	}

	/**
	 * Drop association class.
	 * 
	 * @param associationClass
	 *            the association class the semantic element
	 * @param viewer
	 *            the viewer
	 * @param diagramPreferencesHint
	 *            the diagram preferences hint
	 * @param location
	 *            the location of the drop
	 * @param containerView
	 *            the container view that will contain the associationClass views
	 * 
	 * @return the command
	 */
	public Command dropAssociationClass(AssociationClass associationClass, EditPartViewer viewer,
			PreferencesHint diagramPreferencesHint, Point location, View containerView) {
		CompositeCommand cc = new CompositeCommand("drop");
		// 0. Obtain list of property to display
		ArrayList<Property> endToDisplay = new ArrayList(associationClass.getMemberEnds());
		GraphicalEditPart[] endEditPart = new GraphicalEditPart[associationClass.getMemberEnds().size()];

		// 2. for each element create a graphical representation of the type and
		// finally the branch
		Iterator<Property> iteratorProp = endToDisplay.iterator();
		int index = 0;
		while (iteratorProp.hasNext()) {

			// source editPart
			EditPart sourceEditPart = null;
			// end of the association end
			Property currentEnd = iteratorProp.next();

			// look for if an editpart exist for this element
			Collection<EditPart> editPartSet = viewer.getEditPartRegistry().values();
			Iterator<EditPart> editPartIterator = editPartSet.iterator();

			while (editPartIterator.hasNext() && sourceEditPart == null) {

				EditPart currentEditPart = editPartIterator.next();

				if ((!(currentEditPart instanceof CompartmentEditPart)) && currentEditPart instanceof GraphicalEditPart
						&& currentEnd.getType().equals(((GraphicalEditPart) currentEditPart).resolveSemanticElement())) {
					endEditPart[index] = (GraphicalEditPart) currentEditPart;
				}

			}
			index += 1;
		}
		// descriptor for the branch
		ConnectionViewDescriptor viewBranchDescriptor = new ConnectionViewDescriptor(UMLElementTypes.Association_4019,
				((IHintedType) UMLElementTypes.Association_4019).getSemanticHint(), diagramPreferencesHint);

		// 2. creation of the associationClass Node without semantic element
		// creation of the node
		IAdaptable elementAdapter = new EObjectAdapter(associationClass);
		ViewDescriptor descriptor = new ViewDescriptor(elementAdapter, Node.class, null, ViewUtil.APPEND, false,
				diagramPreferencesHint);

		CreateCommand associationClassNodeCreationCommand = new CreateCommand(getEditingDomain(), descriptor,
				containerView);
		cc.compose(associationClassNodeCreationCommand);
		SetBoundsCommand setBoundsCommand = new SetBoundsCommand(getEditingDomain(), "move",
				(IAdaptable) associationClassNodeCreationCommand.getCommandResult().getReturnValue(), new Point(
						location.x, location.y - 100));
		cc.compose(setBoundsCommand);

		IAdaptable sourceAdapter = null;
		IAdaptable targetAdapter = null;
		// 3. creation of the dashed line between the associationClass link
		// and associationClass Node
		// target
		if (endEditPart[0] == null) {
			// creation of the node
			ViewDescriptor _descriptor = new ViewDescriptor(new EObjectAdapter(endToDisplay.get(0)), Node.class, null,
					ViewUtil.APPEND, false, diagramPreferencesHint);

			// get the command and execute it.
			CreateCommand endNodeCreationCommand = new CreateCommand(getEditingDomain(), _descriptor, containerView);
			cc.compose(endNodeCreationCommand);
			setBoundsCommand = new SetBoundsCommand(getEditingDomain(), "move", (IAdaptable) endNodeCreationCommand
					.getCommandResult().getReturnValue(), new Point(location.x, location.y + 100));
			cc.compose(setBoundsCommand);

			sourceAdapter = (IAdaptable) endNodeCreationCommand.getCommandResult().getReturnValue();
		} else {
			sourceAdapter = new SemanticAdapter(null, endEditPart[0].getModel());
		}

		if (endEditPart[1] == null) {
			// creation of the node
			ViewDescriptor _descriptor = new ViewDescriptor(new EObjectAdapter(endToDisplay.get(2)), Node.class, null,
					ViewUtil.APPEND, false, diagramPreferencesHint);

			// get the command and execute it.
			CreateCommand endNodeCreationCommand = new CreateCommand(getEditingDomain(), _descriptor, containerView);
			cc.compose(endNodeCreationCommand);
			setBoundsCommand = new SetBoundsCommand(getEditingDomain(), "move", (IAdaptable) endNodeCreationCommand
					.getCommandResult().getReturnValue(), new Point(location.x, location.y - 100));
			cc.compose(setBoundsCommand);
			targetAdapter = (IAdaptable) endNodeCreationCommand.getCommandResult().getReturnValue();

		} else {
			targetAdapter = new SemanticAdapter(null, endEditPart[1].getModel());
		}

		// create association link
		ConnectionViewDescriptor viewDescriptor = new ConnectionViewDescriptor(UMLElementTypes.AssociationClass_4017,
				((IHintedType) UMLElementTypes.AssociationClass_4017).getSemanticHint(), diagramPreferencesHint);
		// Creation of the associationLink
		CustomDeferredCreateConnectionViewCommand associationcClassLinkCommand = new CustomDeferredCreateConnectionViewCommand(
				getEditingDomain(), ((IHintedType) UMLElementTypes.AssociationClass_4017).getSemanticHint(),
				sourceAdapter, targetAdapter, viewer, diagramPreferencesHint, viewDescriptor, null);
		associationcClassLinkCommand.setElement(associationClass);
		cc.compose(associationcClassLinkCommand);

		// creation of the dashedLine

		ConnectionViewDescriptor dashedLineViewDescriptor = new ConnectionViewDescriptor(UMLElementTypes.Link_4016,
				((IHintedType) UMLElementTypes.Link_4016).getSemanticHint(), diagramPreferencesHint);
		CustomDeferredCreateConnectionViewCommand dashedLineCmd = new CustomDeferredCreateConnectionViewCommand(
				getEditingDomain(), ((IHintedType) UMLElementTypes.Link_4016).getSemanticHint(),
				((IAdaptable) associationcClassLinkCommand.getCommandResult().getReturnValue()),
				((IAdaptable) associationClassNodeCreationCommand.getCommandResult().getReturnValue()), viewer,
				diagramPreferencesHint, dashedLineViewDescriptor, null);
		dashedLineCmd.setElement(associationClass);
		cc.compose(dashedLineCmd);

		return new ICommandProxy(cc);
	}

	/**
	 * This method is used to produce a set of commands in charge of the creation of
	 * AssociationClass.
	 * 
	 * @param createConnectionViewAndElementRequest
	 *            the create connection view and element request
	 * @param command
	 *            the command that is used to create the link associationClass
	 * 
	 * @return the set of command to create an association Class
	 */
	public Command getAssociationClassElementCommand(
			CreateConnectionViewAndElementRequest createConnectionViewAndElementRequest, Command command) {
		if (command instanceof ICommandProxy) {
			GraphicalEditPart sourceEditPart = (GraphicalEditPart) createConnectionViewAndElementRequest
					.getSourceEditPart();

			// 1. calculus of the position of the associationClass node
			Point p = sourceEditPart.getFigure().getBounds().getTopRight().getCopy();
			sourceEditPart.getFigure().translateToAbsolute(p);
			int edgeCount = sourceEditPart.getNotationView().getSourceEdges().size();
			int offset = (edgeCount * 50) - 100;
			p = p.translate(100, offset);

			// 2. creation of the associationClass Node without semantic element
			GraphicalEditPart parent = (GraphicalEditPart) sourceEditPart.getParent();
			AssociationClassViewCreateCommand assCommand = new AssociationClassViewCreateCommand(
					createConnectionViewAndElementRequest, getEditingDomain(), (View) parent.getModel(),
					(EditPartViewer) sourceEditPart.getViewer(), sourceEditPart.getDiagramPreferencesHint(), p);
			command = command.chain(new ICommandProxy(assCommand));

			// 3. creation of the dashed line between the associationClass link
			// and associationClass Node
			// target
			IAdaptable associationClassLinkViewAdapter = (IAdaptable) (createConnectionViewAndElementRequest
					.getNewObject());

			ConnectionViewDescriptor viewDescriptor = new ConnectionViewDescriptor(UMLElementTypes.Link_4016,
					((INotationType) UMLElementTypes.Link_4016).getSemanticHint(), sourceEditPart
							.getDiagramPreferencesHint());
			ICommand dashedLineCmd = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(),
					((IHintedType) UMLElementTypes.Link_4016).getSemanticHint(), associationClassLinkViewAdapter, null,
					sourceEditPart.getViewer(), sourceEditPart.getDiagramPreferencesHint(), viewDescriptor, assCommand);

			command = command.chain(new ICommandProxy(dashedLineCmd));
			return command;
		}
		return null;
	}
}
