/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.tabbedproperties.uml.parts.impl;

// Start of user code for imports

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.papyrus.tabbedproperties.uml.providers.UMLMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import java.util.Map;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;

import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.jface.viewers.StructuredSelection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFModelViewerDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class StructuredActivityNodePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements
		ISWTPropertiesEditionPart, StructuredActivityNodePropertiesEditionPart {

	protected EMFListEditUtil ownedCommentEditUtil;

	protected ReferencesTable<?> ownedComment;

	protected List<ViewerFilter> ownedCommentBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> ownedCommentFilters = new ArrayList<ViewerFilter>();

	protected Text name;

	protected EMFComboViewer visibility;

	protected EMFListEditUtil clientDependencyEditUtil;

	protected ReferencesTable<?> clientDependency;

	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();

	protected Button isLeaf;

	protected EMFListEditUtil outgoingEditUtil;

	protected ReferencesTable<?> outgoing;

	protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil incomingEditUtil;

	protected ReferencesTable<?> incoming;

	protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil inPartitionEditUtil;

	protected ReferencesTable<?> inPartition;

	protected List<ViewerFilter> inPartitionBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> inPartitionFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil inInterruptibleRegionEditUtil;

	protected ReferencesTable<?> inInterruptibleRegion;

	protected List<ViewerFilter> inInterruptibleRegionBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> inInterruptibleRegionFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil redefinedNodeEditUtil;

	protected ReferencesTable<?> redefinedNode;

	protected List<ViewerFilter> redefinedNodeBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> redefinedNodeFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil handlerEditUtil;

	protected ReferencesTable<?> handler;

	protected List<ViewerFilter> handlerBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> handlerFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil localPreconditionEditUtil;

	protected ReferencesTable<?> localPrecondition;

	protected List<ViewerFilter> localPreconditionBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> localPreconditionFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil localPostconditionEditUtil;

	protected ReferencesTable<?> localPostcondition;

	protected List<ViewerFilter> localPostconditionBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> localPostconditionFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil elementImportEditUtil;

	protected ReferencesTable<?> elementImport;

	protected List<ViewerFilter> elementImportBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> elementImportFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil packageImportEditUtil;

	protected ReferencesTable<?> packageImport;

	protected List<ViewerFilter> packageImportBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> packageImportFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil ownedRuleEditUtil;

	protected ReferencesTable<?> ownedRule;

	protected List<ViewerFilter> ownedRuleBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> ownedRuleFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil variableEditUtil;

	protected ReferencesTable<?> variable;

	protected List<ViewerFilter> variableBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> variableFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil edgeEditUtil;

	protected ReferencesTable<?> edge;

	protected List<ViewerFilter> edgeBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> edgeFilters = new ArrayList<ViewerFilter>();

	protected Button mustIsolate;

	protected EMFListEditUtil nodeEditUtil;

	protected ReferencesTable<?> node;

	protected List<ViewerFilter> nodeBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> nodeFilters = new ArrayList<ViewerFilter>();

	public StructuredActivityNodePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);

		createControls(view);
		return view;
	}

	public void createControls(Composite view) {
		createPropertiesGroup(view);

		// Start of user code for additional ui definition

		// End of user code

	}

	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(UMLMessages.StructuredActivityNodePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createOwnedCommentAdvancedTableComposition(propertiesGroup);
		createNameText(propertiesGroup);
		createVisibilityEMFComboViewer(propertiesGroup);
		createClientDependencyAdvancedReferencesTable(propertiesGroup);
		createIsLeafCheckbox(propertiesGroup);
		createOutgoingAdvancedReferencesTable(propertiesGroup);
		createIncomingAdvancedReferencesTable(propertiesGroup);
		createInPartitionAdvancedReferencesTable(propertiesGroup);
		createInInterruptibleRegionAdvancedReferencesTable(propertiesGroup);
		createRedefinedNodeAdvancedReferencesTable(propertiesGroup);
		createHandlerAdvancedTableComposition(propertiesGroup);
		createLocalPreconditionAdvancedTableComposition(propertiesGroup);
		createLocalPostconditionAdvancedTableComposition(propertiesGroup);
		createElementImportAdvancedTableComposition(propertiesGroup);
		createPackageImportAdvancedTableComposition(propertiesGroup);
		createOwnedRuleAdvancedTableComposition(propertiesGroup);
		createVariableAdvancedTableComposition(propertiesGroup);
		createEdgeAdvancedTableComposition(propertiesGroup);
		createMustIsolateCheckbox(propertiesGroup);
		createNodeAdvancedTableComposition(propertiesGroup);
	}

	/**
	 * @param container
	 */
	protected void createOwnedCommentAdvancedTableComposition(Composite parent) {
		this.ownedComment = new ReferencesTable<Comment>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_OwnedCommentLabel,
				new ReferencesTableListener<Comment>() {

					public void handleAdd() {
						addToOwnedComment();
					}

					public void handleEdit(Comment element) {
						editOwnedComment(element);
					}

					public void handleMove(Comment element, int oldIndex, int newIndex) {
						moveOwnedComment(element, oldIndex, newIndex);
					}

					public void handleRemove(Comment element) {
						removeFromOwnedComment(element);
					}

					public void navigateTo(Comment element) {
					}
				});
		this.ownedComment.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.ownedComment, UMLViewsRepository.SWT_KIND));
		this.ownedComment.createControls(parent);
		GridData ownedCommentData = new GridData(GridData.FILL_HORIZONTAL);
		ownedCommentData.horizontalSpan = 3;
		this.ownedComment.setLayoutData(ownedCommentData);
	}

	/**
	 * 
	 */
	private void moveOwnedComment(Comment element, int oldIndex, int newIndex) {

		EObject editedElement = ownedCommentEditUtil.foundCorrespondingEObject(element);
		ownedCommentEditUtil.moveElement(element, oldIndex, newIndex);
		ownedComment.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.ownedComment, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToOwnedComment() {

		// Start of user code addToOwnedComment() method body

		Comment eObject = UMLFactory.eINSTANCE.createComment();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				ownedCommentEditUtil.addElement(propertiesEditionObject);
				ownedComment.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.ownedComment, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromOwnedComment(Comment element) {

		// Start of user code removeFromOwnedComment() method body

		EObject editedElement = ownedCommentEditUtil.foundCorrespondingEObject(element);
		ownedCommentEditUtil.removeElement(element);
		ownedComment.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.ownedComment, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editOwnedComment(Comment element) {

		// Start of user code editOwnedComment() method body

		EObject editedElement = ownedCommentEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				ownedCommentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				ownedComment.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.ownedComment, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, UMLMessages.StructuredActivityNodePropertiesEditionPart_NameLabel,
				propertiesEditionComponent.isRequired(UMLViewsRepository.StructuredActivityNode.name,
						UMLViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addModifyListener(new ModifyListener() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							StructuredActivityNodePropertiesEditionPartImpl.this,
							UMLViewsRepository.StructuredActivityNode.name, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SET, null, name.getText()));
			}

		});

		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.name, UMLViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	protected void createVisibilityEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UMLMessages.StructuredActivityNodePropertiesEditionPart_VisibilityLabel,
				propertiesEditionComponent.isRequired(UMLViewsRepository.StructuredActivityNode.visibility,
						UMLViewsRepository.SWT_KIND));
		visibility = new EMFComboViewer(parent);
		visibility.setContentProvider(new ArrayContentProvider());
		visibility.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
		visibility.getCombo().setLayoutData(visibilityData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.visibility, UMLViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	protected void createClientDependencyAdvancedReferencesTable(Composite parent) {
		this.clientDependency = new ReferencesTable<Dependency>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_ClientDependencyLabel,
				new ReferencesTableListener<Dependency>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<Dependency> dialog = new TabElementTreeSelectionDialog<Dependency>(
								resourceSet, clientDependencyFilters, clientDependencyBusinessFilters, "Dependency",
								UMLPackage.eINSTANCE.getDependency()) {

							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!clientDependencyEditUtil.getVirtualList().contains(elem))
										clientDependencyEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											StructuredActivityNodePropertiesEditionPartImpl.this,
											UMLViewsRepository.StructuredActivityNode.clientDependency,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								clientDependency.refresh();
							}

						};
						dialog.open();
					}

					public void handleEdit(Dependency element) {
						editClientDependency(element);
					}

					public void handleMove(Dependency element, int oldIndex, int newIndex) {
						moveClientDependency(element, oldIndex, newIndex);
					}

					public void handleRemove(Dependency element) {
						removeFromClientDependency(element);
					}

					public void navigateTo(Dependency element) {
					}
				});
		this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.clientDependency, UMLViewsRepository.SWT_KIND));
		this.clientDependency.createControls(parent);
		GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
		clientDependencyData.horizontalSpan = 3;
		this.clientDependency.setLayoutData(clientDependencyData);
		this.clientDependency.disableMove();
	}

	/**
	 * 
	 */
	private void moveClientDependency(Dependency element, int oldIndex, int newIndex) {
		EObject editedElement = clientDependencyEditUtil.foundCorrespondingEObject(element);
		clientDependencyEditUtil.moveElement(element, oldIndex, newIndex);
		clientDependency.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.clientDependency, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	private void removeFromClientDependency(Dependency element) {

		// Start of user code removeFromClientDependency() method body

		EObject editedElement = clientDependencyEditUtil.foundCorrespondingEObject(element);
		clientDependencyEditUtil.removeElement(element);
		clientDependency.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.clientDependency, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editClientDependency(Dependency element) {

		// Start of user code editClientDependency() method body

		EObject editedElement = clientDependencyEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				clientDependencyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				clientDependency.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.clientDependency, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createIsLeafCheckbox(Composite parent) {
		isLeaf = new Button(parent, SWT.CHECK);
		isLeaf.setText(UMLMessages.StructuredActivityNodePropertiesEditionPart_IsLeafLabel);
		GridData isLeafData = new GridData(GridData.FILL_HORIZONTAL);
		isLeafData.horizontalSpan = 2;
		isLeaf.setLayoutData(isLeafData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.isLeaf, UMLViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	protected void createOutgoingAdvancedReferencesTable(Composite parent) {
		this.outgoing = new ReferencesTable<ActivityEdge>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_OutgoingLabel,
				new ReferencesTableListener<ActivityEdge>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<ActivityEdge> dialog = new TabElementTreeSelectionDialog<ActivityEdge>(
								resourceSet, outgoingFilters, outgoingBusinessFilters, "ActivityEdge",
								UMLPackage.eINSTANCE.getActivityEdge()) {

							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!outgoingEditUtil.getVirtualList().contains(elem))
										outgoingEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											StructuredActivityNodePropertiesEditionPartImpl.this,
											UMLViewsRepository.StructuredActivityNode.outgoing,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								outgoing.refresh();
							}

						};
						dialog.open();
					}

					public void handleEdit(ActivityEdge element) {
						editOutgoing(element);
					}

					public void handleMove(ActivityEdge element, int oldIndex, int newIndex) {
						moveOutgoing(element, oldIndex, newIndex);
					}

					public void handleRemove(ActivityEdge element) {
						removeFromOutgoing(element);
					}

					public void navigateTo(ActivityEdge element) {
					}
				});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.outgoing, UMLViewsRepository.SWT_KIND));
		this.outgoing.createControls(parent);
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
	}

	/**
	 * 
	 */
	private void moveOutgoing(ActivityEdge element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	private void removeFromOutgoing(ActivityEdge element) {

		// Start of user code removeFromOutgoing() method body

		EObject editedElement = outgoingEditUtil.foundCorrespondingEObject(element);
		outgoingEditUtil.removeElement(element);
		outgoing.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.outgoing, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editOutgoing(ActivityEdge element) {

		// Start of user code editOutgoing() method body

		EObject editedElement = outgoingEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				outgoingEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				outgoing.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.outgoing, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createIncomingAdvancedReferencesTable(Composite parent) {
		this.incoming = new ReferencesTable<ActivityEdge>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_IncomingLabel,
				new ReferencesTableListener<ActivityEdge>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<ActivityEdge> dialog = new TabElementTreeSelectionDialog<ActivityEdge>(
								resourceSet, incomingFilters, incomingBusinessFilters, "ActivityEdge",
								UMLPackage.eINSTANCE.getActivityEdge()) {

							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!incomingEditUtil.getVirtualList().contains(elem))
										incomingEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											StructuredActivityNodePropertiesEditionPartImpl.this,
											UMLViewsRepository.StructuredActivityNode.incoming,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								incoming.refresh();
							}

						};
						dialog.open();
					}

					public void handleEdit(ActivityEdge element) {
						editIncoming(element);
					}

					public void handleMove(ActivityEdge element, int oldIndex, int newIndex) {
						moveIncoming(element, oldIndex, newIndex);
					}

					public void handleRemove(ActivityEdge element) {
						removeFromIncoming(element);
					}

					public void navigateTo(ActivityEdge element) {
					}
				});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.incoming, UMLViewsRepository.SWT_KIND));
		this.incoming.createControls(parent);
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
	}

	/**
	 * 
	 */
	private void moveIncoming(ActivityEdge element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	private void removeFromIncoming(ActivityEdge element) {

		// Start of user code removeFromIncoming() method body

		EObject editedElement = incomingEditUtil.foundCorrespondingEObject(element);
		incomingEditUtil.removeElement(element);
		incoming.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.incoming, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editIncoming(ActivityEdge element) {

		// Start of user code editIncoming() method body

		EObject editedElement = incomingEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				incomingEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				incoming.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.incoming, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createInPartitionAdvancedReferencesTable(Composite parent) {
		this.inPartition = new ReferencesTable<ActivityPartition>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_InPartitionLabel,
				new ReferencesTableListener<ActivityPartition>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<ActivityPartition> dialog = new TabElementTreeSelectionDialog<ActivityPartition>(
								resourceSet, inPartitionFilters, inPartitionBusinessFilters, "ActivityPartition",
								UMLPackage.eINSTANCE.getActivityPartition()) {

							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!inPartitionEditUtil.getVirtualList().contains(elem))
										inPartitionEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											StructuredActivityNodePropertiesEditionPartImpl.this,
											UMLViewsRepository.StructuredActivityNode.inPartition,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								inPartition.refresh();
							}

						};
						dialog.open();
					}

					public void handleEdit(ActivityPartition element) {
						editInPartition(element);
					}

					public void handleMove(ActivityPartition element, int oldIndex, int newIndex) {
						moveInPartition(element, oldIndex, newIndex);
					}

					public void handleRemove(ActivityPartition element) {
						removeFromInPartition(element);
					}

					public void navigateTo(ActivityPartition element) {
					}
				});
		this.inPartition.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.inPartition, UMLViewsRepository.SWT_KIND));
		this.inPartition.createControls(parent);
		GridData inPartitionData = new GridData(GridData.FILL_HORIZONTAL);
		inPartitionData.horizontalSpan = 3;
		this.inPartition.setLayoutData(inPartitionData);
		this.inPartition.disableMove();
	}

	/**
	 * 
	 */
	private void moveInPartition(ActivityPartition element, int oldIndex, int newIndex) {
		EObject editedElement = inPartitionEditUtil.foundCorrespondingEObject(element);
		inPartitionEditUtil.moveElement(element, oldIndex, newIndex);
		inPartition.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.inPartition, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	private void removeFromInPartition(ActivityPartition element) {

		// Start of user code removeFromInPartition() method body

		EObject editedElement = inPartitionEditUtil.foundCorrespondingEObject(element);
		inPartitionEditUtil.removeElement(element);
		inPartition.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.inPartition, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editInPartition(ActivityPartition element) {

		// Start of user code editInPartition() method body

		EObject editedElement = inPartitionEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				inPartitionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				inPartition.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.inPartition, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createInInterruptibleRegionAdvancedReferencesTable(Composite parent) {
		this.inInterruptibleRegion = new ReferencesTable<InterruptibleActivityRegion>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_InInterruptibleRegionLabel,
				new ReferencesTableListener<InterruptibleActivityRegion>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<InterruptibleActivityRegion> dialog = new TabElementTreeSelectionDialog<InterruptibleActivityRegion>(
								resourceSet, inInterruptibleRegionFilters, inInterruptibleRegionBusinessFilters,
								"InterruptibleActivityRegion", UMLPackage.eINSTANCE.getInterruptibleActivityRegion()) {

							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!inInterruptibleRegionEditUtil.getVirtualList().contains(elem))
										inInterruptibleRegionEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											StructuredActivityNodePropertiesEditionPartImpl.this,
											UMLViewsRepository.StructuredActivityNode.inInterruptibleRegion,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								inInterruptibleRegion.refresh();
							}

						};
						dialog.open();
					}

					public void handleEdit(InterruptibleActivityRegion element) {
						editInInterruptibleRegion(element);
					}

					public void handleMove(InterruptibleActivityRegion element, int oldIndex, int newIndex) {
						moveInInterruptibleRegion(element, oldIndex, newIndex);
					}

					public void handleRemove(InterruptibleActivityRegion element) {
						removeFromInInterruptibleRegion(element);
					}

					public void navigateTo(InterruptibleActivityRegion element) {
					}
				});
		this.inInterruptibleRegion.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.inInterruptibleRegion, UMLViewsRepository.SWT_KIND));
		this.inInterruptibleRegion.createControls(parent);
		GridData inInterruptibleRegionData = new GridData(GridData.FILL_HORIZONTAL);
		inInterruptibleRegionData.horizontalSpan = 3;
		this.inInterruptibleRegion.setLayoutData(inInterruptibleRegionData);
		this.inInterruptibleRegion.disableMove();
	}

	/**
	 * 
	 */
	private void moveInInterruptibleRegion(InterruptibleActivityRegion element, int oldIndex, int newIndex) {
		EObject editedElement = inInterruptibleRegionEditUtil.foundCorrespondingEObject(element);
		inInterruptibleRegionEditUtil.moveElement(element, oldIndex, newIndex);
		inInterruptibleRegion.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.inInterruptibleRegion, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	private void removeFromInInterruptibleRegion(InterruptibleActivityRegion element) {

		// Start of user code removeFromInInterruptibleRegion() method body

		EObject editedElement = inInterruptibleRegionEditUtil.foundCorrespondingEObject(element);
		inInterruptibleRegionEditUtil.removeElement(element);
		inInterruptibleRegion.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.inInterruptibleRegion, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editInInterruptibleRegion(InterruptibleActivityRegion element) {

		// Start of user code editInInterruptibleRegion() method body

		EObject editedElement = inInterruptibleRegionEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				inInterruptibleRegionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				inInterruptibleRegion.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.inInterruptibleRegion, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createRedefinedNodeAdvancedReferencesTable(Composite parent) {
		this.redefinedNode = new ReferencesTable<ActivityNode>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_RedefinedNodeLabel,
				new ReferencesTableListener<ActivityNode>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<ActivityNode> dialog = new TabElementTreeSelectionDialog<ActivityNode>(
								resourceSet, redefinedNodeFilters, redefinedNodeBusinessFilters, "ActivityNode",
								UMLPackage.eINSTANCE.getActivityNode()) {

							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!redefinedNodeEditUtil.getVirtualList().contains(elem))
										redefinedNodeEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											StructuredActivityNodePropertiesEditionPartImpl.this,
											UMLViewsRepository.StructuredActivityNode.redefinedNode,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								redefinedNode.refresh();
							}

						};
						dialog.open();
					}

					public void handleEdit(ActivityNode element) {
						editRedefinedNode(element);
					}

					public void handleMove(ActivityNode element, int oldIndex, int newIndex) {
						moveRedefinedNode(element, oldIndex, newIndex);
					}

					public void handleRemove(ActivityNode element) {
						removeFromRedefinedNode(element);
					}

					public void navigateTo(ActivityNode element) {
					}
				});
		this.redefinedNode.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.redefinedNode, UMLViewsRepository.SWT_KIND));
		this.redefinedNode.createControls(parent);
		GridData redefinedNodeData = new GridData(GridData.FILL_HORIZONTAL);
		redefinedNodeData.horizontalSpan = 3;
		this.redefinedNode.setLayoutData(redefinedNodeData);
		this.redefinedNode.disableMove();
	}

	/**
	 * 
	 */
	private void moveRedefinedNode(ActivityNode element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	private void removeFromRedefinedNode(ActivityNode element) {

		// Start of user code removeFromRedefinedNode() method body

		EObject editedElement = redefinedNodeEditUtil.foundCorrespondingEObject(element);
		redefinedNodeEditUtil.removeElement(element);
		redefinedNode.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.redefinedNode, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editRedefinedNode(ActivityNode element) {

		// Start of user code editRedefinedNode() method body

		EObject editedElement = redefinedNodeEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				redefinedNodeEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				redefinedNode.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.redefinedNode, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createHandlerAdvancedTableComposition(Composite parent) {
		this.handler = new ReferencesTable<ExceptionHandler>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_HandlerLabel,
				new ReferencesTableListener<ExceptionHandler>() {

					public void handleAdd() {
						addToHandler();
					}

					public void handleEdit(ExceptionHandler element) {
						editHandler(element);
					}

					public void handleMove(ExceptionHandler element, int oldIndex, int newIndex) {
						moveHandler(element, oldIndex, newIndex);
					}

					public void handleRemove(ExceptionHandler element) {
						removeFromHandler(element);
					}

					public void navigateTo(ExceptionHandler element) {
					}
				});
		this.handler.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.handler, UMLViewsRepository.SWT_KIND));
		this.handler.createControls(parent);
		GridData handlerData = new GridData(GridData.FILL_HORIZONTAL);
		handlerData.horizontalSpan = 3;
		this.handler.setLayoutData(handlerData);
	}

	/**
	 * 
	 */
	private void moveHandler(ExceptionHandler element, int oldIndex, int newIndex) {

		EObject editedElement = handlerEditUtil.foundCorrespondingEObject(element);
		handlerEditUtil.moveElement(element, oldIndex, newIndex);
		handler.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.handler, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToHandler() {

		// Start of user code addToHandler() method body

		ExceptionHandler eObject = UMLFactory.eINSTANCE.createExceptionHandler();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				handlerEditUtil.addElement(propertiesEditionObject);
				handler.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.handler, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromHandler(ExceptionHandler element) {

		// Start of user code removeFromHandler() method body

		EObject editedElement = handlerEditUtil.foundCorrespondingEObject(element);
		handlerEditUtil.removeElement(element);
		handler.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.handler, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editHandler(ExceptionHandler element) {

		// Start of user code editHandler() method body

		EObject editedElement = handlerEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				handlerEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				handler.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.handler, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createLocalPreconditionAdvancedTableComposition(Composite parent) {
		this.localPrecondition = new ReferencesTable<Constraint>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_LocalPreconditionLabel,
				new ReferencesTableListener<Constraint>() {

					public void handleAdd() {
						addToLocalPrecondition();
					}

					public void handleEdit(Constraint element) {
						editLocalPrecondition(element);
					}

					public void handleMove(Constraint element, int oldIndex, int newIndex) {
						moveLocalPrecondition(element, oldIndex, newIndex);
					}

					public void handleRemove(Constraint element) {
						removeFromLocalPrecondition(element);
					}

					public void navigateTo(Constraint element) {
					}
				});
		this.localPrecondition.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.localPrecondition, UMLViewsRepository.SWT_KIND));
		this.localPrecondition.createControls(parent);
		GridData localPreconditionData = new GridData(GridData.FILL_HORIZONTAL);
		localPreconditionData.horizontalSpan = 3;
		this.localPrecondition.setLayoutData(localPreconditionData);
	}

	/**
	 * 
	 */
	private void moveLocalPrecondition(Constraint element, int oldIndex, int newIndex) {

		EObject editedElement = localPreconditionEditUtil.foundCorrespondingEObject(element);
		localPreconditionEditUtil.moveElement(element, oldIndex, newIndex);
		localPrecondition.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.localPrecondition, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToLocalPrecondition() {

		// Start of user code addToLocalPrecondition() method body

		Constraint eObject = UMLFactory.eINSTANCE.createConstraint();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				localPreconditionEditUtil.addElement(propertiesEditionObject);
				localPrecondition.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.localPrecondition, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromLocalPrecondition(Constraint element) {

		// Start of user code removeFromLocalPrecondition() method body

		EObject editedElement = localPreconditionEditUtil.foundCorrespondingEObject(element);
		localPreconditionEditUtil.removeElement(element);
		localPrecondition.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.localPrecondition, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editLocalPrecondition(Constraint element) {

		// Start of user code editLocalPrecondition() method body

		EObject editedElement = localPreconditionEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				localPreconditionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				localPrecondition.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.localPrecondition, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createLocalPostconditionAdvancedTableComposition(Composite parent) {
		this.localPostcondition = new ReferencesTable<Constraint>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_LocalPostconditionLabel,
				new ReferencesTableListener<Constraint>() {

					public void handleAdd() {
						addToLocalPostcondition();
					}

					public void handleEdit(Constraint element) {
						editLocalPostcondition(element);
					}

					public void handleMove(Constraint element, int oldIndex, int newIndex) {
						moveLocalPostcondition(element, oldIndex, newIndex);
					}

					public void handleRemove(Constraint element) {
						removeFromLocalPostcondition(element);
					}

					public void navigateTo(Constraint element) {
					}
				});
		this.localPostcondition.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.localPostcondition, UMLViewsRepository.SWT_KIND));
		this.localPostcondition.createControls(parent);
		GridData localPostconditionData = new GridData(GridData.FILL_HORIZONTAL);
		localPostconditionData.horizontalSpan = 3;
		this.localPostcondition.setLayoutData(localPostconditionData);
	}

	/**
	 * 
	 */
	private void moveLocalPostcondition(Constraint element, int oldIndex, int newIndex) {

		EObject editedElement = localPostconditionEditUtil.foundCorrespondingEObject(element);
		localPostconditionEditUtil.moveElement(element, oldIndex, newIndex);
		localPostcondition.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.localPostcondition, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToLocalPostcondition() {

		// Start of user code addToLocalPostcondition() method body

		Constraint eObject = UMLFactory.eINSTANCE.createConstraint();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				localPostconditionEditUtil.addElement(propertiesEditionObject);
				localPostcondition.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.localPostcondition, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromLocalPostcondition(Constraint element) {

		// Start of user code removeFromLocalPostcondition() method body

		EObject editedElement = localPostconditionEditUtil.foundCorrespondingEObject(element);
		localPostconditionEditUtil.removeElement(element);
		localPostcondition.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.localPostcondition, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editLocalPostcondition(Constraint element) {

		// Start of user code editLocalPostcondition() method body

		EObject editedElement = localPostconditionEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				localPostconditionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				localPostcondition.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.localPostcondition, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createElementImportAdvancedTableComposition(Composite parent) {
		this.elementImport = new ReferencesTable<ElementImport>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_ElementImportLabel,
				new ReferencesTableListener<ElementImport>() {

					public void handleAdd() {
						addToElementImport();
					}

					public void handleEdit(ElementImport element) {
						editElementImport(element);
					}

					public void handleMove(ElementImport element, int oldIndex, int newIndex) {
						moveElementImport(element, oldIndex, newIndex);
					}

					public void handleRemove(ElementImport element) {
						removeFromElementImport(element);
					}

					public void navigateTo(ElementImport element) {
					}
				});
		this.elementImport.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.elementImport, UMLViewsRepository.SWT_KIND));
		this.elementImport.createControls(parent);
		GridData elementImportData = new GridData(GridData.FILL_HORIZONTAL);
		elementImportData.horizontalSpan = 3;
		this.elementImport.setLayoutData(elementImportData);
	}

	/**
	 * 
	 */
	private void moveElementImport(ElementImport element, int oldIndex, int newIndex) {

		EObject editedElement = elementImportEditUtil.foundCorrespondingEObject(element);
		elementImportEditUtil.moveElement(element, oldIndex, newIndex);
		elementImport.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.elementImport, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToElementImport() {

		// Start of user code addToElementImport() method body

		ElementImport eObject = UMLFactory.eINSTANCE.createElementImport();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				elementImportEditUtil.addElement(propertiesEditionObject);
				elementImport.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.elementImport, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromElementImport(ElementImport element) {

		// Start of user code removeFromElementImport() method body

		EObject editedElement = elementImportEditUtil.foundCorrespondingEObject(element);
		elementImportEditUtil.removeElement(element);
		elementImport.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.elementImport, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editElementImport(ElementImport element) {

		// Start of user code editElementImport() method body

		EObject editedElement = elementImportEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				elementImportEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				elementImport.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.elementImport, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createPackageImportAdvancedTableComposition(Composite parent) {
		this.packageImport = new ReferencesTable<PackageImport>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_PackageImportLabel,
				new ReferencesTableListener<PackageImport>() {

					public void handleAdd() {
						addToPackageImport();
					}

					public void handleEdit(PackageImport element) {
						editPackageImport(element);
					}

					public void handleMove(PackageImport element, int oldIndex, int newIndex) {
						movePackageImport(element, oldIndex, newIndex);
					}

					public void handleRemove(PackageImport element) {
						removeFromPackageImport(element);
					}

					public void navigateTo(PackageImport element) {
					}
				});
		this.packageImport.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.packageImport, UMLViewsRepository.SWT_KIND));
		this.packageImport.createControls(parent);
		GridData packageImportData = new GridData(GridData.FILL_HORIZONTAL);
		packageImportData.horizontalSpan = 3;
		this.packageImport.setLayoutData(packageImportData);
	}

	/**
	 * 
	 */
	private void movePackageImport(PackageImport element, int oldIndex, int newIndex) {

		EObject editedElement = packageImportEditUtil.foundCorrespondingEObject(element);
		packageImportEditUtil.moveElement(element, oldIndex, newIndex);
		packageImport.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.packageImport, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToPackageImport() {

		// Start of user code addToPackageImport() method body

		PackageImport eObject = UMLFactory.eINSTANCE.createPackageImport();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				packageImportEditUtil.addElement(propertiesEditionObject);
				packageImport.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.packageImport, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromPackageImport(PackageImport element) {

		// Start of user code removeFromPackageImport() method body

		EObject editedElement = packageImportEditUtil.foundCorrespondingEObject(element);
		packageImportEditUtil.removeElement(element);
		packageImport.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.packageImport, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editPackageImport(PackageImport element) {

		// Start of user code editPackageImport() method body

		EObject editedElement = packageImportEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				packageImportEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				packageImport.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.packageImport, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createOwnedRuleAdvancedTableComposition(Composite parent) {
		this.ownedRule = new ReferencesTable<Constraint>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_OwnedRuleLabel,
				new ReferencesTableListener<Constraint>() {

					public void handleAdd() {
						addToOwnedRule();
					}

					public void handleEdit(Constraint element) {
						editOwnedRule(element);
					}

					public void handleMove(Constraint element, int oldIndex, int newIndex) {
						moveOwnedRule(element, oldIndex, newIndex);
					}

					public void handleRemove(Constraint element) {
						removeFromOwnedRule(element);
					}

					public void navigateTo(Constraint element) {
					}
				});
		this.ownedRule.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.ownedRule, UMLViewsRepository.SWT_KIND));
		this.ownedRule.createControls(parent);
		GridData ownedRuleData = new GridData(GridData.FILL_HORIZONTAL);
		ownedRuleData.horizontalSpan = 3;
		this.ownedRule.setLayoutData(ownedRuleData);
	}

	/**
	 * 
	 */
	private void moveOwnedRule(Constraint element, int oldIndex, int newIndex) {

		EObject editedElement = ownedRuleEditUtil.foundCorrespondingEObject(element);
		ownedRuleEditUtil.moveElement(element, oldIndex, newIndex);
		ownedRule.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.ownedRule, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToOwnedRule() {

		// Start of user code addToOwnedRule() method body

		Constraint eObject = UMLFactory.eINSTANCE.createConstraint();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				ownedRuleEditUtil.addElement(propertiesEditionObject);
				ownedRule.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.ownedRule, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromOwnedRule(Constraint element) {

		// Start of user code removeFromOwnedRule() method body

		EObject editedElement = ownedRuleEditUtil.foundCorrespondingEObject(element);
		ownedRuleEditUtil.removeElement(element);
		ownedRule.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.ownedRule, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editOwnedRule(Constraint element) {

		// Start of user code editOwnedRule() method body

		EObject editedElement = ownedRuleEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				ownedRuleEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				ownedRule.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.ownedRule, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createVariableAdvancedTableComposition(Composite parent) {
		this.variable = new ReferencesTable<Variable>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_VariableLabel,
				new ReferencesTableListener<Variable>() {

					public void handleAdd() {
						addToVariable();
					}

					public void handleEdit(Variable element) {
						editVariable(element);
					}

					public void handleMove(Variable element, int oldIndex, int newIndex) {
						moveVariable(element, oldIndex, newIndex);
					}

					public void handleRemove(Variable element) {
						removeFromVariable(element);
					}

					public void navigateTo(Variable element) {
					}
				});
		this.variable.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.variable, UMLViewsRepository.SWT_KIND));
		this.variable.createControls(parent);
		GridData variableData = new GridData(GridData.FILL_HORIZONTAL);
		variableData.horizontalSpan = 3;
		this.variable.setLayoutData(variableData);
	}

	/**
	 * 
	 */
	private void moveVariable(Variable element, int oldIndex, int newIndex) {

		EObject editedElement = variableEditUtil.foundCorrespondingEObject(element);
		variableEditUtil.moveElement(element, oldIndex, newIndex);
		variable.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.variable, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToVariable() {

		// Start of user code addToVariable() method body

		Variable eObject = UMLFactory.eINSTANCE.createVariable();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				variableEditUtil.addElement(propertiesEditionObject);
				variable.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.variable, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromVariable(Variable element) {

		// Start of user code removeFromVariable() method body

		EObject editedElement = variableEditUtil.foundCorrespondingEObject(element);
		variableEditUtil.removeElement(element);
		variable.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this,
				UMLViewsRepository.StructuredActivityNode.variable, PropertiesEditionEvent.CHANGE,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editVariable(Variable element) {

		// Start of user code editVariable() method body

		EObject editedElement = variableEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				variableEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				variable.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.variable, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createEdgeAdvancedTableComposition(Composite parent) {
		this.edge = new ReferencesTable<ActivityEdge>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_EdgeLabel,
				new ReferencesTableListener<ActivityEdge>() {

					public void handleAdd() {
						addToEdge();
					}

					public void handleEdit(ActivityEdge element) {
						editEdge(element);
					}

					public void handleMove(ActivityEdge element, int oldIndex, int newIndex) {
						moveEdge(element, oldIndex, newIndex);
					}

					public void handleRemove(ActivityEdge element) {
						removeFromEdge(element);
					}

					public void navigateTo(ActivityEdge element) {
					}
				});
		this.edge.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.StructuredActivityNode.edge,
				UMLViewsRepository.SWT_KIND));
		this.edge.createControls(parent);
		GridData edgeData = new GridData(GridData.FILL_HORIZONTAL);
		edgeData.horizontalSpan = 3;
		this.edge.setLayoutData(edgeData);
	}

	/**
	 * 
	 */
	private void moveEdge(ActivityEdge element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void addToEdge() {

		// Start of user code addToEdge() method body

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromEdge(ActivityEdge element) {

		// Start of user code removeFromEdge() method body

		EObject editedElement = edgeEditUtil.foundCorrespondingEObject(element);
		edgeEditUtil.removeElement(element);
		edge.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this, UMLViewsRepository.StructuredActivityNode.edge,
				PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editEdge(ActivityEdge element) {

		// Start of user code editEdge() method body

		EObject editedElement = edgeEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				edgeEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				edge.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.edge, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createMustIsolateCheckbox(Composite parent) {
		mustIsolate = new Button(parent, SWT.CHECK);
		mustIsolate.setText(UMLMessages.StructuredActivityNodePropertiesEditionPart_MustIsolateLabel);
		GridData mustIsolateData = new GridData(GridData.FILL_HORIZONTAL);
		mustIsolateData.horizontalSpan = 2;
		mustIsolate.setLayoutData(mustIsolateData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.StructuredActivityNode.mustIsolate, UMLViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 */
	protected void createNodeAdvancedTableComposition(Composite parent) {
		this.node = new ReferencesTable<ActivityNode>(
				UMLMessages.StructuredActivityNodePropertiesEditionPart_NodeLabel,
				new ReferencesTableListener<ActivityNode>() {

					public void handleAdd() {
						addToNode();
					}

					public void handleEdit(ActivityNode element) {
						editNode(element);
					}

					public void handleMove(ActivityNode element, int oldIndex, int newIndex) {
						moveNode(element, oldIndex, newIndex);
					}

					public void handleRemove(ActivityNode element) {
						removeFromNode(element);
					}

					public void navigateTo(ActivityNode element) {
					}
				});
		this.node.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.StructuredActivityNode.node,
				UMLViewsRepository.SWT_KIND));
		this.node.createControls(parent);
		GridData nodeData = new GridData(GridData.FILL_HORIZONTAL);
		nodeData.horizontalSpan = 3;
		this.node.setLayoutData(nodeData);
	}

	/**
	 * 
	 */
	private void moveNode(ActivityNode element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void addToNode() {

		// Start of user code addToNode() method body

		// End of user code

	}

	/**
	 * 
	 */
	private void removeFromNode(ActivityNode element) {

		// Start of user code removeFromNode() method body

		EObject editedElement = nodeEditUtil.foundCorrespondingEObject(element);
		nodeEditUtil.removeElement(element);
		node.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				StructuredActivityNodePropertiesEditionPartImpl.this, UMLViewsRepository.StructuredActivityNode.node,
				PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	private void editNode(ActivityNode element) {

		// Start of user code editNode() method body

		EObject editedElement = nodeEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				nodeEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				node.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						StructuredActivityNodePropertiesEditionPartImpl.this,
						UMLViewsRepository.StructuredActivityNode.node, PropertiesEditionEvent.CHANGE,
						PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code

	}

	public void firePropertiesChanged(PropertiesEditionEvent event) {
		// Start of user code for tab synchronization

		// End of user code

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedCommentToAdd()
	 */
	public List getOwnedCommentToAdd() {
		return ownedCommentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedCommentToRemove()
	 */
	public List getOwnedCommentToRemove() {
		return ownedCommentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedCommentToEdit()
	 */
	public Map getOwnedCommentToEdit() {
		return ownedCommentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedCommentToMove()
	 */
	public List getOwnedCommentToMove() {
		return ownedCommentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedCommentTable()
	 */
	public List getOwnedCommentTable() {
		return ownedCommentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initOwnedComment(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedComment(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			ownedCommentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			ownedCommentEditUtil = new EMFListEditUtil(current, feature);
		this.ownedComment.setInput(ownedCommentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateOwnedComment(EObject
	 *      newValue)
	 */
	public void updateOwnedComment(EObject newValue) {
		if (ownedCommentEditUtil != null) {
			ownedCommentEditUtil.reinit(newValue);
			ownedComment.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterOwnedComment(ViewerFilter
	 *      filter)
	 */
	public void addFilterToOwnedComment(ViewerFilter filter) {
		ownedCommentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterOwnedComment(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToOwnedComment(ViewerFilter filter) {
		ownedCommentBusinessFilters.add(filter);
	}

	public void setMessageForOwnedComment(String msg, int msgLevel) {

	}

	public void unsetMessageForOwnedComment() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getName()
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#setName(String
	 *      newValue)
	 */
	public void setName(String newValue) {
		name.setText(newValue);
	}

	public void setMessageForName(String msg, int msgLevel) {

	}

	public void unsetMessageForName() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getVisibility()
	 */
	public Enumerator getVisibility() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initVisibility(EEnum
	 *      eenum, Enumerator current)
	 */
	public void initVisibility(EEnum eenum, Enumerator current) {
		visibility.setInput(eenum.getELiterals());
		visibility.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#setVisibility(Enumerator
	 *      newValue)
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
	}

	public void setMessageForVisibility(String msg, int msgLevel) {

	}

	public void unsetMessageForVisibility() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getClientDependencyToAdd()
	 */
	public List getClientDependencyToAdd() {
		return clientDependencyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getClientDependencyToRemove()
	 */
	public List getClientDependencyToRemove() {
		return clientDependencyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getClientDependencyTable()
	 */
	public List getClientDependencyTable() {
		return clientDependencyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initClientDependency(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initClientDependency(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			clientDependencyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			clientDependencyEditUtil = new EMFListEditUtil(current, feature);
		this.clientDependency.setInput(clientDependencyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateClientDependency(EObject
	 *      newValue)
	 */
	public void updateClientDependency(EObject newValue) {
		if (clientDependencyEditUtil != null) {
			clientDependencyEditUtil.reinit(newValue);
			clientDependency.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterClientDependency(ViewerFilter
	 *      filter)
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
		clientDependencyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
		clientDependencyBusinessFilters.add(filter);
	}

	public void setMessageForClientDependency(String msg, int msgLevel) {

	}

	public void unsetMessageForClientDependency() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getIsLeaf()
	 */
	public Boolean getIsLeaf() {
		return Boolean.valueOf(isLeaf.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#setIsLeaf(Boolean
	 *      newValue)
	 */
	public void setIsLeaf(Boolean newValue) {
		if (newValue != null) {
			isLeaf.setSelection(newValue.booleanValue());
		} else {
			isLeaf.setSelection(false);
		}
	}

	public void setMessageForIsLeaf(String msg, int msgLevel) {

	}

	public void unsetMessageForIsLeaf() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOutgoingToAdd()
	 */
	public List getOutgoingToAdd() {
		return outgoingEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOutgoingToRemove()
	 */
	public List getOutgoingToRemove() {
		return outgoingEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOutgoingTable()
	 */
	public List getOutgoingTable() {
		return outgoingEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initOutgoing(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOutgoing(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			outgoingEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			outgoingEditUtil = new EMFListEditUtil(current, feature);
		this.outgoing.setInput(outgoingEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateOutgoing(EObject
	 *      newValue)
	 */
	public void updateOutgoing(EObject newValue) {
		if (outgoingEditUtil != null) {
			outgoingEditUtil.reinit(newValue);
			outgoing.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterOutgoing(ViewerFilter
	 *      filter)
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	public void setMessageForOutgoing(String msg, int msgLevel) {

	}

	public void unsetMessageForOutgoing() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getIncomingToAdd()
	 */
	public List getIncomingToAdd() {
		return incomingEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getIncomingToRemove()
	 */
	public List getIncomingToRemove() {
		return incomingEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getIncomingTable()
	 */
	public List getIncomingTable() {
		return incomingEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initIncoming(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initIncoming(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			incomingEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			incomingEditUtil = new EMFListEditUtil(current, feature);
		this.incoming.setInput(incomingEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateIncoming(EObject
	 *      newValue)
	 */
	public void updateIncoming(EObject newValue) {
		if (incomingEditUtil != null) {
			incomingEditUtil.reinit(newValue);
			incoming.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterIncoming(ViewerFilter
	 *      filter)
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	public void setMessageForIncoming(String msg, int msgLevel) {

	}

	public void unsetMessageForIncoming() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getInPartitionToAdd()
	 */
	public List getInPartitionToAdd() {
		return inPartitionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getInPartitionToRemove()
	 */
	public List getInPartitionToRemove() {
		return inPartitionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getInPartitionTable()
	 */
	public List getInPartitionTable() {
		return inPartitionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initInPartition(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initInPartition(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			inPartitionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			inPartitionEditUtil = new EMFListEditUtil(current, feature);
		this.inPartition.setInput(inPartitionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateInPartition(EObject
	 *      newValue)
	 */
	public void updateInPartition(EObject newValue) {
		if (inPartitionEditUtil != null) {
			inPartitionEditUtil.reinit(newValue);
			inPartition.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterInPartition(ViewerFilter
	 *      filter)
	 */
	public void addFilterToInPartition(ViewerFilter filter) {
		inPartitionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterInPartition(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToInPartition(ViewerFilter filter) {
		inPartitionBusinessFilters.add(filter);
	}

	public void setMessageForInPartition(String msg, int msgLevel) {

	}

	public void unsetMessageForInPartition() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getInInterruptibleRegionToAdd()
	 */
	public List getInInterruptibleRegionToAdd() {
		return inInterruptibleRegionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getInInterruptibleRegionToRemove()
	 */
	public List getInInterruptibleRegionToRemove() {
		return inInterruptibleRegionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getInInterruptibleRegionTable()
	 */
	public List getInInterruptibleRegionTable() {
		return inInterruptibleRegionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initInInterruptibleRegion(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initInInterruptibleRegion(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			inInterruptibleRegionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			inInterruptibleRegionEditUtil = new EMFListEditUtil(current, feature);
		this.inInterruptibleRegion.setInput(inInterruptibleRegionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateInInterruptibleRegion(EObject
	 *      newValue)
	 */
	public void updateInInterruptibleRegion(EObject newValue) {
		if (inInterruptibleRegionEditUtil != null) {
			inInterruptibleRegionEditUtil.reinit(newValue);
			inInterruptibleRegion.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterInInterruptibleRegion(ViewerFilter
	 *      filter)
	 */
	public void addFilterToInInterruptibleRegion(ViewerFilter filter) {
		inInterruptibleRegionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterInInterruptibleRegion(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToInInterruptibleRegion(ViewerFilter filter) {
		inInterruptibleRegionBusinessFilters.add(filter);
	}

	public void setMessageForInInterruptibleRegion(String msg, int msgLevel) {

	}

	public void unsetMessageForInInterruptibleRegion() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getRedefinedNodeToAdd()
	 */
	public List getRedefinedNodeToAdd() {
		return redefinedNodeEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getRedefinedNodeToRemove()
	 */
	public List getRedefinedNodeToRemove() {
		return redefinedNodeEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getRedefinedNodeTable()
	 */
	public List getRedefinedNodeTable() {
		return redefinedNodeEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initRedefinedNode(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initRedefinedNode(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			redefinedNodeEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			redefinedNodeEditUtil = new EMFListEditUtil(current, feature);
		this.redefinedNode.setInput(redefinedNodeEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateRedefinedNode(EObject
	 *      newValue)
	 */
	public void updateRedefinedNode(EObject newValue) {
		if (redefinedNodeEditUtil != null) {
			redefinedNodeEditUtil.reinit(newValue);
			redefinedNode.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterRedefinedNode(ViewerFilter
	 *      filter)
	 */
	public void addFilterToRedefinedNode(ViewerFilter filter) {
		redefinedNodeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterRedefinedNode(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToRedefinedNode(ViewerFilter filter) {
		redefinedNodeBusinessFilters.add(filter);
	}

	public void setMessageForRedefinedNode(String msg, int msgLevel) {

	}

	public void unsetMessageForRedefinedNode() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getHandlerToAdd()
	 */
	public List getHandlerToAdd() {
		return handlerEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getHandlerToRemove()
	 */
	public List getHandlerToRemove() {
		return handlerEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getHandlerToEdit()
	 */
	public Map getHandlerToEdit() {
		return handlerEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getHandlerToMove()
	 */
	public List getHandlerToMove() {
		return handlerEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getHandlerTable()
	 */
	public List getHandlerTable() {
		return handlerEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initHandler(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initHandler(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			handlerEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			handlerEditUtil = new EMFListEditUtil(current, feature);
		this.handler.setInput(handlerEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateHandler(EObject
	 *      newValue)
	 */
	public void updateHandler(EObject newValue) {
		if (handlerEditUtil != null) {
			handlerEditUtil.reinit(newValue);
			handler.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterHandler(ViewerFilter
	 *      filter)
	 */
	public void addFilterToHandler(ViewerFilter filter) {
		handlerFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterHandler(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToHandler(ViewerFilter filter) {
		handlerBusinessFilters.add(filter);
	}

	public void setMessageForHandler(String msg, int msgLevel) {

	}

	public void unsetMessageForHandler() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPreconditionToAdd()
	 */
	public List getLocalPreconditionToAdd() {
		return localPreconditionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPreconditionToRemove()
	 */
	public List getLocalPreconditionToRemove() {
		return localPreconditionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPreconditionToEdit()
	 */
	public Map getLocalPreconditionToEdit() {
		return localPreconditionEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPreconditionToMove()
	 */
	public List getLocalPreconditionToMove() {
		return localPreconditionEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPreconditionTable()
	 */
	public List getLocalPreconditionTable() {
		return localPreconditionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initLocalPrecondition(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initLocalPrecondition(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			localPreconditionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			localPreconditionEditUtil = new EMFListEditUtil(current, feature);
		this.localPrecondition.setInput(localPreconditionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateLocalPrecondition(EObject
	 *      newValue)
	 */
	public void updateLocalPrecondition(EObject newValue) {
		if (localPreconditionEditUtil != null) {
			localPreconditionEditUtil.reinit(newValue);
			localPrecondition.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterLocalPrecondition(ViewerFilter
	 *      filter)
	 */
	public void addFilterToLocalPrecondition(ViewerFilter filter) {
		localPreconditionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterLocalPrecondition(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToLocalPrecondition(ViewerFilter filter) {
		localPreconditionBusinessFilters.add(filter);
	}

	public void setMessageForLocalPrecondition(String msg, int msgLevel) {

	}

	public void unsetMessageForLocalPrecondition() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPostconditionToAdd()
	 */
	public List getLocalPostconditionToAdd() {
		return localPostconditionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPostconditionToRemove()
	 */
	public List getLocalPostconditionToRemove() {
		return localPostconditionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPostconditionToEdit()
	 */
	public Map getLocalPostconditionToEdit() {
		return localPostconditionEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPostconditionToMove()
	 */
	public List getLocalPostconditionToMove() {
		return localPostconditionEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getLocalPostconditionTable()
	 */
	public List getLocalPostconditionTable() {
		return localPostconditionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initLocalPostcondition(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initLocalPostcondition(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			localPostconditionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			localPostconditionEditUtil = new EMFListEditUtil(current, feature);
		this.localPostcondition.setInput(localPostconditionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateLocalPostcondition(EObject
	 *      newValue)
	 */
	public void updateLocalPostcondition(EObject newValue) {
		if (localPostconditionEditUtil != null) {
			localPostconditionEditUtil.reinit(newValue);
			localPostcondition.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterLocalPostcondition(ViewerFilter
	 *      filter)
	 */
	public void addFilterToLocalPostcondition(ViewerFilter filter) {
		localPostconditionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterLocalPostcondition(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToLocalPostcondition(ViewerFilter filter) {
		localPostconditionBusinessFilters.add(filter);
	}

	public void setMessageForLocalPostcondition(String msg, int msgLevel) {

	}

	public void unsetMessageForLocalPostcondition() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getElementImportToAdd()
	 */
	public List getElementImportToAdd() {
		return elementImportEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getElementImportToRemove()
	 */
	public List getElementImportToRemove() {
		return elementImportEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getElementImportToEdit()
	 */
	public Map getElementImportToEdit() {
		return elementImportEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getElementImportToMove()
	 */
	public List getElementImportToMove() {
		return elementImportEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getElementImportTable()
	 */
	public List getElementImportTable() {
		return elementImportEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initElementImport(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initElementImport(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			elementImportEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			elementImportEditUtil = new EMFListEditUtil(current, feature);
		this.elementImport.setInput(elementImportEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateElementImport(EObject
	 *      newValue)
	 */
	public void updateElementImport(EObject newValue) {
		if (elementImportEditUtil != null) {
			elementImportEditUtil.reinit(newValue);
			elementImport.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterElementImport(ViewerFilter
	 *      filter)
	 */
	public void addFilterToElementImport(ViewerFilter filter) {
		elementImportFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterElementImport(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToElementImport(ViewerFilter filter) {
		elementImportBusinessFilters.add(filter);
	}

	public void setMessageForElementImport(String msg, int msgLevel) {

	}

	public void unsetMessageForElementImport() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getPackageImportToAdd()
	 */
	public List getPackageImportToAdd() {
		return packageImportEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getPackageImportToRemove()
	 */
	public List getPackageImportToRemove() {
		return packageImportEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getPackageImportToEdit()
	 */
	public Map getPackageImportToEdit() {
		return packageImportEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getPackageImportToMove()
	 */
	public List getPackageImportToMove() {
		return packageImportEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getPackageImportTable()
	 */
	public List getPackageImportTable() {
		return packageImportEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initPackageImport(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initPackageImport(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			packageImportEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			packageImportEditUtil = new EMFListEditUtil(current, feature);
		this.packageImport.setInput(packageImportEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updatePackageImport(EObject
	 *      newValue)
	 */
	public void updatePackageImport(EObject newValue) {
		if (packageImportEditUtil != null) {
			packageImportEditUtil.reinit(newValue);
			packageImport.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterPackageImport(ViewerFilter
	 *      filter)
	 */
	public void addFilterToPackageImport(ViewerFilter filter) {
		packageImportFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterPackageImport(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToPackageImport(ViewerFilter filter) {
		packageImportBusinessFilters.add(filter);
	}

	public void setMessageForPackageImport(String msg, int msgLevel) {

	}

	public void unsetMessageForPackageImport() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedRuleToAdd()
	 */
	public List getOwnedRuleToAdd() {
		return ownedRuleEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedRuleToRemove()
	 */
	public List getOwnedRuleToRemove() {
		return ownedRuleEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedRuleToEdit()
	 */
	public Map getOwnedRuleToEdit() {
		return ownedRuleEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedRuleToMove()
	 */
	public List getOwnedRuleToMove() {
		return ownedRuleEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getOwnedRuleTable()
	 */
	public List getOwnedRuleTable() {
		return ownedRuleEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initOwnedRule(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedRule(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			ownedRuleEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			ownedRuleEditUtil = new EMFListEditUtil(current, feature);
		this.ownedRule.setInput(ownedRuleEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateOwnedRule(EObject
	 *      newValue)
	 */
	public void updateOwnedRule(EObject newValue) {
		if (ownedRuleEditUtil != null) {
			ownedRuleEditUtil.reinit(newValue);
			ownedRule.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterOwnedRule(ViewerFilter
	 *      filter)
	 */
	public void addFilterToOwnedRule(ViewerFilter filter) {
		ownedRuleFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterOwnedRule(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToOwnedRule(ViewerFilter filter) {
		ownedRuleBusinessFilters.add(filter);
	}

	public void setMessageForOwnedRule(String msg, int msgLevel) {

	}

	public void unsetMessageForOwnedRule() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getVariableToAdd()
	 */
	public List getVariableToAdd() {
		return variableEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getVariableToRemove()
	 */
	public List getVariableToRemove() {
		return variableEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getVariableToEdit()
	 */
	public Map getVariableToEdit() {
		return variableEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getVariableToMove()
	 */
	public List getVariableToMove() {
		return variableEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getVariableTable()
	 */
	public List getVariableTable() {
		return variableEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initVariable(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initVariable(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			variableEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			variableEditUtil = new EMFListEditUtil(current, feature);
		this.variable.setInput(variableEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateVariable(EObject
	 *      newValue)
	 */
	public void updateVariable(EObject newValue) {
		if (variableEditUtil != null) {
			variableEditUtil.reinit(newValue);
			variable.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterVariable(ViewerFilter
	 *      filter)
	 */
	public void addFilterToVariable(ViewerFilter filter) {
		variableFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterVariable(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToVariable(ViewerFilter filter) {
		variableBusinessFilters.add(filter);
	}

	public void setMessageForVariable(String msg, int msgLevel) {

	}

	public void unsetMessageForVariable() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getEdgeToAdd()
	 */
	public List getEdgeToAdd() {
		return edgeEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getEdgeToRemove()
	 */
	public List getEdgeToRemove() {
		return edgeEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getEdgeToEdit()
	 */
	public Map getEdgeToEdit() {
		return edgeEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getEdgeToMove()
	 */
	public List getEdgeToMove() {
		return edgeEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getEdgeTable()
	 */
	public List getEdgeTable() {
		return edgeEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initEdge(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initEdge(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			edgeEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			edgeEditUtil = new EMFListEditUtil(current, feature);
		this.edge.setInput(edgeEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateEdge(EObject
	 *      newValue)
	 */
	public void updateEdge(EObject newValue) {
		if (edgeEditUtil != null) {
			edgeEditUtil.reinit(newValue);
			edge.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterEdge(ViewerFilter
	 *      filter)
	 */
	public void addFilterToEdge(ViewerFilter filter) {
		edgeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterEdge(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToEdge(ViewerFilter filter) {
		edgeBusinessFilters.add(filter);
	}

	public void setMessageForEdge(String msg, int msgLevel) {

	}

	public void unsetMessageForEdge() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getMustIsolate()
	 */
	public Boolean getMustIsolate() {
		return Boolean.valueOf(mustIsolate.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#setMustIsolate(Boolean
	 *      newValue)
	 */
	public void setMustIsolate(Boolean newValue) {
		if (newValue != null) {
			mustIsolate.setSelection(newValue.booleanValue());
		} else {
			mustIsolate.setSelection(false);
		}
	}

	public void setMessageForMustIsolate(String msg, int msgLevel) {

	}

	public void unsetMessageForMustIsolate() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getNodeToAdd()
	 */
	public List getNodeToAdd() {
		return nodeEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getNodeToRemove()
	 */
	public List getNodeToRemove() {
		return nodeEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getNodeToEdit()
	 */
	public Map getNodeToEdit() {
		return nodeEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getNodeToMove()
	 */
	public List getNodeToMove() {
		return nodeEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#getNodeTable()
	 */
	public List getNodeTable() {
		return nodeEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#initNode(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initNode(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			nodeEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			nodeEditUtil = new EMFListEditUtil(current, feature);
		this.node.setInput(nodeEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#updateNode(EObject
	 *      newValue)
	 */
	public void updateNode(EObject newValue) {
		if (nodeEditUtil != null) {
			nodeEditUtil.reinit(newValue);
			node.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addFilterNode(ViewerFilter
	 *      filter)
	 */
	public void addFilterToNode(ViewerFilter filter) {
		nodeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.StructuredActivityNodePropertiesEditionPart#addBusinessFilterNode(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToNode(ViewerFilter filter) {
		nodeBusinessFilters.add(filter);
	}

	public void setMessageForNode(String msg, int msgLevel) {

	}

	public void unsetMessageForNode() {

	}

	// Start of user code additional methods

	// End of user code

}
