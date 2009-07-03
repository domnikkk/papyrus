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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest.ConnectionViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.clazz.custom.command.DependencyDiamonViewCreateCommand;
import org.eclipse.papyrus.diagram.clazz.custom.command.SemanticAdapter;
import org.eclipse.papyrus.diagram.clazz.custom.providers.CustomDeferredCreateConnectionViewCommand;
import org.eclipse.papyrus.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.DependencyBranchEditPart;
import org.eclipse.papyrus.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.diagram.common.helper.ElementHelper;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The Class MultiDependencyHelper to manage adding branches or transformation of binary of n-ary links
 */
public class MultiDependencyHelper extends ElementHelper {

	/**
	 * Instantiates a new multi dependency helper.
	 * 
	 * @param editDomain
	 *            the edit domain
	 */
	public MultiDependencyHelper(TransactionalEditingDomain editDomain) {
		super();
		this.editDomain = editDomain;
	}

	private CompoundCommand constructDependencyEnd(CompoundCommand command, DependencyDiamonViewCreateCommand nodeCreation, Collection<NamedElement> dependencyEnd, Dependency dependency,
			EditPartViewer viewer, PreferencesHint diagramPreferencesHint, Point location, View containerView, boolean constructSource) {
		// 2. for each element create a graphical representation of the type and
		// finally the branch
		Iterator<NamedElement> iteratorProp = dependencyEnd.iterator();
		int index = 0;
		while (iteratorProp.hasNext()) {
			index += 1;
			// source editPart
			EditPart sourceEditPart = null;
			// end of the association end
			NamedElement currentEnd = iteratorProp.next();

			// look for if an editpart exist for this element
			Collection<EditPart> editPartSet = viewer.getEditPartRegistry().values();
			Iterator<EditPart> editPartIterator = editPartSet.iterator();

			while (editPartIterator.hasNext() && sourceEditPart == null) {

				EditPart currentEditPart = editPartIterator.next();

				if ((!(currentEditPart instanceof CompartmentEditPart)) && currentEditPart instanceof GraphicalEditPart
						&& currentEnd.equals(((GraphicalEditPart) currentEditPart).resolveSemanticElement())) {
					sourceEditPart = currentEditPart;
				}
			}
			// descriptor for the branch
			ConnectionViewDescriptor viewBranchDescriptor = new ConnectionViewDescriptor(UMLElementTypes.Dependency_4018, ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(),
					diagramPreferencesHint);

			// the editpart exist -> only creation of the branch
			if (sourceEditPart != null) {

				CustomDeferredCreateConnectionViewCommand aBranchCommand = null;
				if (constructSource) {
					aBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(), new SemanticAdapter(null,
							sourceEditPart.getModel()), (IAdaptable) nodeCreation.getCommandResult().getReturnValue(), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
							.getDiagramPreferencesHint(), viewBranchDescriptor, null);
				} else {
					aBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(), (IAdaptable) nodeCreation
							.getCommandResult().getReturnValue(), new SemanticAdapter(null, sourceEditPart.getModel()), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
							.getDiagramPreferencesHint(), viewBranchDescriptor, null);

				}
				aBranchCommand.setElement(dependency);
				((CompoundCommand) command).add(new ICommandProxy(aBranchCommand));
			} else {// the editpart does not exist

				// creation of the node
				IAdaptable elementAdapter = new EObjectAdapter(currentEnd);
				ViewDescriptor descriptor = new ViewDescriptor(elementAdapter, Node.class, null, ViewUtil.APPEND, false, diagramPreferencesHint);

				// get the command and execute it.
				CreateCommand nodeCreationCommand = new CreateCommand(getEditingDomain(), descriptor, containerView);
				((CompoundCommand) command).add(new ICommandProxy(nodeCreationCommand));
				SetBoundsCommand setBoundsCommand = new SetBoundsCommand(getEditingDomain(), "move", (IAdaptable) nodeCreationCommand.getCommandResult().getReturnValue(), new Point(location.x + 200,
						location.y + index * 100));
				((CompoundCommand) command).add(new ICommandProxy(setBoundsCommand));
				// Creation of the branch
				CustomDeferredCreateConnectionViewCommand aBranchCommand = null;
				if (constructSource) {
					aBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(),
							(IAdaptable) nodeCreationCommand.getCommandResult().getReturnValue(), (IAdaptable) nodeCreation.getCommandResult().getReturnValue(), viewer, diagramPreferencesHint,
							viewBranchDescriptor, null);
				} else {
					aBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(), (IAdaptable) nodeCreation
							.getCommandResult().getReturnValue(), (IAdaptable) nodeCreationCommand.getCommandResult().getReturnValue(), viewer, diagramPreferencesHint, viewBranchDescriptor, null);
				}
				aBranchCommand.setElement(dependency);
				((CompoundCommand) command).add(new ICommandProxy(aBranchCommand));
				// creation of the link
			}

		}
		return command;
	}

	public Command dropMutliDependency(Dependency dependency, EditPartViewer viewer, PreferencesHint diagramPreferencesHint, Point location, View containerView) {
		CompoundCommand command = new CompoundCommand();
		// 0. Obtain list of property to display
		ArrayList<NamedElement> endToDisplaySource = new ArrayList(dependency.getClients());
		ArrayList<NamedElement> endToDisplayTarget = new ArrayList(dependency.getSuppliers());
		// 1. creation of the diamond of the Dependency
		DependencyDiamonViewCreateCommand nodeCreation = new DependencyDiamonViewCreateCommand(getEditingDomain(), containerView, viewer, diagramPreferencesHint, location, new SemanticAdapter(
				dependency, null));
		command.add(new ICommandProxy(nodeCreation));
		// 2. for each element create a graphical representation of the type and
		// finally the branch
		command = constructDependencyEnd(command, nodeCreation, endToDisplaySource, dependency, viewer, diagramPreferencesHint, location, containerView, true);
		command = constructDependencyEnd(command, nodeCreation, endToDisplayTarget, dependency, viewer, diagramPreferencesHint, location, containerView, false);

		return command;
	}

	/**
	 * Gets the branch depencency command.
	 * 
	 * @param createConnectionViewAndElementRequest
	 *            the create connection view and element request
	 * @param command
	 *            the command
	 * 
	 * @return the branch depencency command
	 */
	private Command getBranchDepencencyCommand(CreateConnectionViewAndElementRequest createConnectionViewAndElementRequest, Command command) {
		EditPart sourceEditPart = createConnectionViewAndElementRequest.getSourceEditPart();
		EditPart targetEditPart = createConnectionViewAndElementRequest.getTargetEditPart();
		// 0. add the branh graphically
		ConnectionViewDescriptor viewDescriptor = new ConnectionViewDescriptor(UMLElementTypes.Dependency_4018, ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(),
				((IGraphicalEditPart) sourceEditPart).getDiagramPreferencesHint());

		CustomDeferredCreateConnectionViewCommand aBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(),
				new SemanticAdapter(null, sourceEditPart.getModel()), new SemanticAdapter(null, targetEditPart.getModel()), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
						.getDiagramPreferencesHint(), viewDescriptor, null);
		command = new CompoundCommand();
		((CompoundCommand) command).add(new ICommandProxy(aBranchCommand));

		// 1. add the supplier or client
		EObject newSemanticElement = null;
		EStructuralFeature feature = null;
		Dependency dependency = null;
		if (((View) sourceEditPart.getModel()).getElement() != null && ((View) sourceEditPart.getModel()).getElement() instanceof Dependency) {
			newSemanticElement = (NamedElement) ((View) targetEditPart.getModel()).getElement();
			dependency = (Dependency) ((View) sourceEditPart.getModel()).getElement();
			feature = UMLPackage.eINSTANCE.getDependency_Supplier();
		}

		if (((View) targetEditPart.getModel()).getElement() != null && ((View) targetEditPart.getModel()).getElement() instanceof Dependency) {
			newSemanticElement = (NamedElement) ((View) sourceEditPart.getModel()).getElement();
			dependency = (Dependency) ((View) targetEditPart.getModel()).getElement();
			feature = UMLPackage.eINSTANCE.getDependency_Client();
		}
		// set the new client or the new supplier
		SetRequest setRequest = new SetRequest(dependency, feature, newSemanticElement);
		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
		((CompoundCommand) command).add(new ICommandProxy(setValueCommand));
		return command;
	}

	/**
	 * Gets the command.
	 * 
	 * @param createConnectionViewAndElementRequest
	 *            the create connection view and element request
	 * @param command
	 *            the command
	 * 
	 * @return the command
	 */
	public Command getCommand(CreateConnectionViewAndElementRequest createConnectionViewAndElementRequest, Command command) {
		// 0. get source and target type
		command = new CompoundCommand();
		EditPart sourceEditPart = createConnectionViewAndElementRequest.getSourceEditPart();
		EditPart targetEditPart = createConnectionViewAndElementRequest.getTargetEditPart();

		// if the the source or the target is a node dependency the purpose is
		// to create only one branch
		if ((((View) sourceEditPart.getModel()).getType() == "" + Dependency2EditPart.VISUAL_ID) || (((View) targetEditPart.getModel()).getType() == "" + Dependency2EditPart.VISUAL_ID)) {
			return getBranchDepencencyCommand(createConnectionViewAndElementRequest, command);
		}

		// the source or the target has to be different of a dependency branch
		if ((((View) sourceEditPart.getModel()).getType() == "" + DependencyBranchEditPart.VISUAL_ID) || (((View) targetEditPart.getModel()).getType() == "" + DependencyBranchEditPart.VISUAL_ID)) {
			return UnexecutableCommand.INSTANCE;
		}
		// if not this a transformation of simple dependency to multiDependency
		return getDependencyToMultiDependencyCommand(createConnectionViewAndElementRequest, command);
	}

	/**
	 * this method is used to create a branch of a dependency.
	 * 
	 * @param createConnectionViewAndElementRequest
	 *            the create connection view and element request
	 * @param command
	 *            the command that is used to create the link branch of a dependency
	 * 
	 * @return the set of command to create a branch of a dependency
	 */
	private Command getDependencyToMultiDependencyCommand(CreateConnectionViewAndElementRequest createConnectionViewAndElementRequest, Command command) {

		// 0. creation of variables
		command = new CompoundCommand();
		Point sourceLocation = null;
		Point targetLocation = null;
		Point nodeLocation = null;
		NamedElement newSemanticElement = null;// element that will be added as
		// client ou supplier of the
		// dependecy
		EStructuralFeature feature = null; // role client or supplier
		EditPart sourceEditPart = createConnectionViewAndElementRequest.getSourceEditPart();
		EditPart targetEditPart = createConnectionViewAndElementRequest.getTargetEditPart();
		View dependencyView = null;
		Dependency dependency = null;
		View parentView = null;

		// 1. initialization
		ICommandProxy startcommand = ((ICommandProxy) createConnectionViewAndElementRequest.getStartCommand());
		Iterator<?> ite = ((CompositeCommand) startcommand.getICommand()).iterator();

		while (ite.hasNext()) {
			ICommand currentCommand = (ICommand) ite.next();
			if (currentCommand instanceof SetConnectionBendpointsCommand) {
				sourceLocation = ((SetConnectionBendpointsCommand) currentCommand).getSourceRefPoint();
				targetLocation = ((SetConnectionBendpointsCommand) currentCommand).getTargetRefPoint();
			}
		}

		if (targetEditPart != null) {
			// the source or the target must be a dependency
			// look for the redit part that represnet the editpart
			if (((View) sourceEditPart.getModel()).getElement() != null && ((View) sourceEditPart.getModel()).getElement() instanceof Dependency) {
				dependencyView = ((View) sourceEditPart.getModel());
				dependency = (Dependency) ((View) sourceEditPart.getModel()).getElement();
				nodeLocation = sourceLocation;
				newSemanticElement = (NamedElement) ((View) targetEditPart.getModel()).getElement();
				feature = UMLPackage.eINSTANCE.getDependency_Supplier();
			}

			if (((View) targetEditPart.getModel()).getElement() != null && ((View) targetEditPart.getModel()).getElement() instanceof Dependency) {
				dependencyView = ((View) targetEditPart.getModel());
				dependency = (Dependency) ((View) targetEditPart.getModel()).getElement();
				nodeLocation = targetLocation;
				newSemanticElement = (NamedElement) ((View) sourceEditPart.getModel()).getElement();
				feature = UMLPackage.eINSTANCE.getDependency_Client();
			}

			if (dependencyView == null) {
				return null;
			}
			parentView = (View) dependencyView.eContainer();
			// 2. Remove the view of the dependency
			View dependencyViewSource = ((Edge) dependencyView).getSource();
			View dependencyViewTarget = ((Edge) dependencyView).getTarget();

			((CompoundCommand) command).add(new ICommandProxy(new DeleteCommand(getEditingDomain(), dependencyView)));

			// 3. Node creation at this position
			DependencyDiamonViewCreateCommand nodeCreation = new DependencyDiamonViewCreateCommand(getEditingDomain(), parentView, (EditPartViewer) sourceEditPart.getViewer(),
					((IGraphicalEditPart) sourceEditPart).getDiagramPreferencesHint(), nodeLocation, new SemanticAdapter(dependency, null));
			((CompoundCommand) command).add(new ICommandProxy(nodeCreation));

			// 4. reconstruction of the old link by taking in account the old
			// connection
			ConnectionViewDescriptor viewDescriptor = new ConnectionViewDescriptor(UMLElementTypes.Dependency_4018, ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(),
					((IGraphicalEditPart) sourceEditPart).getDiagramPreferencesHint());

			// 5. reconstruction of the first branch between old source to node
			ICommand firstBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(), new SemanticAdapter(
					null, dependencyViewSource), (IAdaptable) nodeCreation.getCommandResult().getReturnValue(), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
					.getDiagramPreferencesHint(), viewDescriptor, null);
			((CustomDeferredCreateConnectionViewCommand) firstBranchCommand).setElement(dependency);
			((CompoundCommand) command).add(new ICommandProxy(firstBranchCommand));

			// 6. reconstruction of the second branch between node to old target
			ICommand secondBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(),
					(IAdaptable) nodeCreation.getCommandResult().getReturnValue(), new SemanticAdapter(null, dependencyViewTarget), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
							.getDiagramPreferencesHint(), viewDescriptor, null);
			((CustomDeferredCreateConnectionViewCommand) secondBranchCommand).setElement(dependency);
			((CompoundCommand) command).add(new ICommandProxy(secondBranchCommand));

			// 7. Create of the third branch between node and target our source.
			ICommand thirdBranchCommand = null;

			if (dependencyView.equals(((View) sourceEditPart.getModel()))) {
				// third branch node and target
				thirdBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(), (IAdaptable) nodeCreation
						.getCommandResult().getReturnValue(), new SemanticAdapter(null, targetEditPart.getModel()), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
						.getDiagramPreferencesHint(), viewDescriptor, null);
			} else {
				// // third branch source and node
				thirdBranchCommand = new CustomDeferredCreateConnectionViewCommand(getEditingDomain(), ((IHintedType) UMLElementTypes.Dependency_4018).getSemanticHint(), new SemanticAdapter(null,
						sourceEditPart.getModel()), (IAdaptable) nodeCreation.getCommandResult().getReturnValue(), sourceEditPart.getViewer(), ((IGraphicalEditPart) sourceEditPart)
						.getDiagramPreferencesHint(), viewDescriptor, null);
			}
			((CustomDeferredCreateConnectionViewCommand) thirdBranchCommand).setElement(dependency);
			((CompoundCommand) command).add(new ICommandProxy(thirdBranchCommand));

			// 8. set thenew client or the new supplier
			SetRequest setRequest = new SetRequest(dependency, feature, newSemanticElement);
			SetValueCommand setValueCommand = new SetValueCommand(setRequest);
			((CompoundCommand) command).add(new ICommandProxy(setValueCommand));
			return command;
		}
		return null;
	}

}
