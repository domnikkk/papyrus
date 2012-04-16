/*****************************************************************************
 * Copyright (c) 2011 ATOS.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		Olivier Mélois (ATOS) olivier.melois@atos.net - Bug 376703 
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.listeners;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.core.adaptor.gmf.DestroyElementPapyrusCommand;
import org.eclipse.papyrus.core.utils.PapyrusEcoreUtils;
import org.eclipse.papyrus.diagram.common.editparts.PapyrusStereotypeListener;
import org.eclipse.papyrus.diagram.common.listeners.AbstractPapyrusModifcationTriggerListener;
import org.eclipse.papyrus.gmf.diagram.common.commands.CreateViewCommand;
import org.eclipse.papyrus.sysml.diagram.blockdefinition.compartment.descriptors.IPropertyCompartmentDescriptor;
import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class BlockPropertiesStereotypeChangeListener extends AbstractPapyrusModifcationTriggerListener {

	@Override
	public NotificationFilter getFilter() {
		NotificationFilter applyStereotypeFilter = NotificationFilter.createEventTypeFilter(PapyrusStereotypeListener.APPLIED_STEREOTYPE);
		NotificationFilter unapplyStereotypeFilter = NotificationFilter.createEventTypeFilter(PapyrusStereotypeListener.UNAPPLIED_STEREOTYPE);
		NotificationFilter typeFilter = NotificationFilter.createNotifierTypeFilter(Property.class);
		return typeFilter.and(applyStereotypeFilter.or(unapplyStereotypeFilter));
	}

	@Override
	protected CompositeCommand getModificationCommand(Notification notif) {
		Object notifier = notif.getNotifier();
		CompositeCommand cc = new CompositeCommand("Move properties to their right compartments"); //$NON-NLS-1$
		if(notifier instanceof EObject) {
			EObject eObject = (EObject) notifier;
			/*
			 * Iterating on all the nodes referring to the notifier (which is a model element)
			 */
			Iterable<Node> nodes = getNodes(eObject);
			for (Node node : nodes){
				if (!checkNodeContainment(node)){
					/*
					 * The command to remove the badly place node.
					 */
					ICommand removeBadlyPlacedNodeCommand = getRemoveNodeCommand(node);
					/*
					 * The command to make a copy of that node into the right compartment.
					 */
					ICommand copyNodeInsideRelevantContainerCommand = getCopyNodeInsideRelevantContainerCommand(node);
					/*
					 * Composing the result command with both these commands.
					 */
					cc.compose(removeBadlyPlacedNodeCommand);
					cc.compose(copyNodeInsideRelevantContainerCommand);
				}
			}
		}
		return cc;
	}

	/**
	 * Gets all the nodes pointing to a model object.
	 */
	protected Iterable<Node> getNodes(EObject eObject){
		Collection<Setting> usages = PapyrusEcoreUtils.getUsages(eObject);
		Predicate<Setting> filterNodes = new Predicate<Setting>(){
			public boolean apply(Setting setting) {
				return setting.getEObject() instanceof Node;
			}
		};
		Iterable<Setting> filteredSettings = Iterables.filter(usages, filterNodes);
		Iterable<Node> nodes = Iterables.transform(filteredSettings, new Function<Setting,Node>(){
			public Node apply(Setting setting) {
				return (Node) setting.getEObject();
			}});
		return nodes;
	}
	
	/**
	 * Gets the command to destroy a node. 
	 */
	protected ICommand getRemoveNodeCommand(Node node){
		DestroyElementRequest destroyNodeRequest = new DestroyElementRequest(node, false);
		DestroyElementPapyrusCommand destroyNode = new DestroyElementPapyrusCommand(destroyNodeRequest);
		return destroyNode;
	}
	
	/**
	 * 
	 */
	protected ICommand getCopyNodeInsideRelevantContainerCommand(Node node){
		/*
		 * Getting the most relevant container the node should be copied into
		 */
		View containerView = this.getFirstRelevantCompartmentView(node);
		if (containerView != null){
			/*
			 * eAdapter for the element referenced by the node.
			 */
			EObject eObject = node.getElement();
			IAdaptable adapter =  new EObjectAdapter(eObject);
			
			
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(containerView);
			ViewDescriptor viewDescriptor = new ViewDescriptor(adapter, Node.class, node.getType(), org.eclipse.papyrus.diagram.clazz.part.UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			return new CreateViewCommand(editingDomain, viewDescriptor, containerView);
		}
		return null;
	}
	

	/**
	 * Checks whether a node is placed in the right compartment, according to the 
	 * stereotype applications its model element has. 
	 */
	protected boolean checkNodeContainment(Node node){
		boolean result = true;
		EObject modelEObject = node.getElement();
		if (modelEObject instanceof Property && !(modelEObject instanceof Port)){
			Property property = (Property) modelEObject;
			View containingView = (View) node.eContainer();
			/*
			 * First of all, checking that the node is indeed in a block. 
			 */
			if (containingView != null){
				View containerOfContainingView = (View) containingView.eContainer();
				result &= containerOfContainingView.getType().equals(SysMLGraphicalTypes.SHAPE_SYSML_BLOCK_AS_CLASSIFIER_ID);
				result &= propertyCompatibleWithContainer(property, containingView);
			} else {
				result = false;
			}
		}
		return result;
	}
	
	/**
	 * Gets the first compartment compatible with the node stereotype applications.
	 */
	protected View getFirstRelevantCompartmentView(Node node){
		EObject modelEObject = node.getElement();
		if (modelEObject instanceof Property){
			Property property = (Property) modelEObject;
			if (node.eContainer() != null){
				/*
				 * The view of the block containing the property.
				 */
				View blockView = (View)node.eContainer().eContainer();
				EList<View> compartments = blockView.getChildren();
				for (View compartment : compartments){
					if (propertyCompatibleWithContainer(property, compartment)){
						return compartment;
					}
				}
			}
		}
		return null;
	}
	
	
	/**
	 *  Checks whether a property is compatible with a container (thus 
	 *  can be put inside that container). 
	 */
	protected boolean propertyCompatibleWithContainer(Property property, View containingView){
		String containerType = containingView.getType();
		/*
		 * Checking each compartment using an extension point.
		 */
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = reg.getExtensionPoint("org.eclipse.papyrus.sysml.diagram.blockdefinition.propertyCompartmentDescription"); //$NON-NLS-1$
		/*
		 * Boolean describing if a descriptor compatible with the property was found.
		 */
		boolean propertyIsCompatibleWithOneCompartment = false;
		for (IExtension extension : extensionPoint.getExtensions()){
			for (IConfigurationElement extensionDescriptor : extension.getConfigurationElements()){
				try {
					IPropertyCompartmentDescriptor descriptor = (IPropertyCompartmentDescriptor) extensionDescriptor.createExecutableExtension("PropertyCompartmentDescriptor"); //$NON-NLS-1$					if (containerType.)
					boolean currentDescriptorCompatibleWithProperty = descriptor.isCompatibleWithProperty(property);
					/*
					 * Keeping a score for a possible later use.
					 */
					propertyIsCompatibleWithOneCompartment |= currentDescriptorCompatibleWithProperty;
					if (containerType.equals(descriptor.getType()) && currentDescriptorCompatibleWithProperty){
						return true;
					}
				} catch (CoreException e) {
					e.printStackTrace();
				} 
			}
		}
		
		/*
		 * If no compartment was compatible with the property, therefore the property can only
		 * belong the "property" compartment.
		 */
		if (!propertyIsCompatibleWithOneCompartment){
			return containerType.equals(SysMLGraphicalTypes.COMPARTMENT_SYSML_PROPERTY_AS_LIST_ID);
		}
		/*
		 * Every other case. 
		 */
		return false;
	}
	
}
