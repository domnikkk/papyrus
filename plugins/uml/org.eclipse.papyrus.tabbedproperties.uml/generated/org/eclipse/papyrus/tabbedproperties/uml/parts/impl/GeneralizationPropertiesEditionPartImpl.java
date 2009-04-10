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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PathedPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart;
import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;
import org.eclipse.papyrus.tabbedproperties.uml.providers.UMLMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.UMLPackage;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class GeneralizationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GeneralizationPropertiesEditionPart {

	private Button isSubstitutable;
	private EMFListEditUtil generalizationSetEditUtil;
	private ReferencesTable<?> generalizationSet;




	
	public GeneralizationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		createGeneralGroup(view);
		
		// Start of user code for additional ui definition
		
		// End of user code		
	}

	protected void createGeneralGroup(Composite parent) {
		Group generalGroup = new Group(parent, SWT.NONE);
		generalGroup.setText(UMLMessages.GeneralizationPropertiesEditionPart_GeneralGroupLabel);
		GridData generalGroupData = new GridData(GridData.FILL_HORIZONTAL);
		generalGroupData.horizontalSpan = 3;
		generalGroup.setLayoutData(generalGroupData);
		GridLayout generalGroupLayout = new GridLayout();
		generalGroupLayout.numColumns = 3;
		generalGroup.setLayout(generalGroupLayout);
		createIsSubstitutableCheckbox(generalGroup);
		createGeneralizationSetReferencesTable(generalGroup);
   	}
	protected void createIsSubstitutableCheckbox(Composite parent) {
		isSubstitutable = new Button(parent, SWT.CHECK);
		isSubstitutable.setText(UMLMessages.GeneralizationPropertiesEditionPart_IsSubstitutableLabel);
		GridData isSubstitutableData = new GridData(GridData.FILL_HORIZONTAL);
		isSubstitutableData.horizontalSpan = 2;
		isSubstitutable.setLayoutData(isSubstitutableData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UMLViewsRepository.Generalization.isSubstitutable, UMLViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}
	protected void createGeneralizationSetReferencesTable(Composite parent) {
		this.generalizationSet = new ReferencesTable<GeneralizationSet>(UMLMessages.GeneralizationPropertiesEditionPart_GeneralizationSetLabel, new ReferencesTableListener<GeneralizationSet>() {
			public void handleAdd() {				
				ViewerFilter generalizationSetFilter = new EObjectFilter(UMLPackage.eINSTANCE.getGeneralizationSet());
				ViewerFilter viewerFilter = new ViewerFilter() {					
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!generalizationSetEditUtil.contains((EObject)element));
						return false;					
					}
				};				
				ViewerFilter[] filters = { generalizationSetFilter, viewerFilter };		
				TabElementTreeSelectionDialog<GeneralizationSet> dialog = new TabElementTreeSelectionDialog<GeneralizationSet>(resourceSet, filters,
				"GeneralizationSet", UMLPackage.eINSTANCE.getGeneralizationSet()) {
					@Override
					public void process(IStructuredSelection selection) {						
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!generalizationSetEditUtil.getVirtualList().contains(elem))
								generalizationSetEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PathedPropertiesEditionEvent(GeneralizationPropertiesEditionPartImpl.this, UMLViewsRepository.Generalization.generalizationSet,
								PathedPropertiesEditionEvent.COMMIT, PathedPropertiesEditionEvent.ADD, null, elem));	
						}
						generalizationSet.refresh();											
					}
				};
				dialog.open();
			}
			public void handleEdit(GeneralizationSet element) { editGeneralizationSet(element); }
			public void handleMove(GeneralizationSet element, int oldIndex, int newIndex) { moveGeneralizationSet(element, oldIndex, newIndex); }
			public void handleRemove(GeneralizationSet element) { removeFromGeneralizationSet(element); }
			public void navigateTo(GeneralizationSet element) { System.out.println("---> navigateTo"); }
		});
		this.generalizationSet.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.Generalization.generalizationSet, UMLViewsRepository.SWT_KIND));
		this.generalizationSet.createControls(parent);
		GridData generalizationSetData = new GridData(GridData.FILL_HORIZONTAL);
		generalizationSetData.horizontalSpan = 3;
		this.generalizationSet.setLayoutData(generalizationSetData);
		this.generalizationSet.disableMove();
	}
	
	/**
	 * 
	 */
	private void moveGeneralizationSet(GeneralizationSet element, int oldIndex, int newIndex) {
				
		EObject editedElement = generalizationSetEditUtil.foundCorrespondingEObject(element);
		generalizationSetEditUtil.moveElement(element, oldIndex, newIndex);
		generalizationSet.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PathedPropertiesEditionEvent(GeneralizationPropertiesEditionPartImpl.this, UMLViewsRepository.Generalization.generalizationSet, PathedPropertiesEditionEvent.COMMIT, PathedPropertiesEditionEvent.MOVE, editedElement, newIndex));	
		
	}
	
	/**
	 * 
	 */
	private void removeFromGeneralizationSet(GeneralizationSet element) {

		// Start of user code for the removeFromGeneralizationSet() method body

		EObject editedElement = generalizationSetEditUtil.foundCorrespondingEObject(element);
		generalizationSetEditUtil.removeElement(element);
		generalizationSet.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PathedPropertiesEditionEvent(GeneralizationPropertiesEditionPartImpl.this, UMLViewsRepository.Generalization.generalizationSet, PathedPropertiesEditionEvent.COMMIT, PathedPropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code
	}

	/**
	 * 
	 */
	private void editGeneralizationSet(GeneralizationSet element) {

		// Start of user code editGeneralizationSet() method body
				 
		EObject editedElement = generalizationSetEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
			if (propertiesEditionObject != null) {
				generalizationSetEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				generalizationSet.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PathedPropertiesEditionEvent(GeneralizationPropertiesEditionPartImpl.this, UMLViewsRepository.Generalization.generalizationSet, PathedPropertiesEditionEvent.COMMIT, PathedPropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code
	}

	
	public void firePropertiesChanged(PathedPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code		
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart#getIsSubstitutable()
	 */
	public Boolean getIsSubstitutable() {
		return Boolean.valueOf(isSubstitutable.getSelection());
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart#setIsSubstitutable(Boolean newValue)
	 */
	public void setIsSubstitutable(Boolean newValue) {
		isSubstitutable.setSelection(newValue.booleanValue());
	}
	
	public void setMessageForIsSubstitutable (String msg, int msgLevel) {
	
	}
	
	public void unsetMessageForIsSubstitutable () {
	
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart#getGeneralizationSetToAdd()
	 */
	public List getGeneralizationSetToAdd() {
		return generalizationSetEditUtil.getElementsToAdd();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart#getGeneralizationSetToRemove()
	 */
	public List getGeneralizationSetToRemove() {
		return generalizationSetEditUtil.getElementsToRemove();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart#initGeneralizationSet(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGeneralizationSet(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			generalizationSetEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else	
			generalizationSetEditUtil = new EMFListEditUtil(current, feature);	
		this.generalizationSet.setInput(generalizationSetEditUtil.getVirtualList());
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.GeneralizationPropertiesEditionPart#updateGeneralizationSet(EObject newValue)
	 */
	public void updateGeneralizationSet(EObject newValue) {
		if(generalizationSetEditUtil!=null){
			generalizationSetEditUtil.reinit(newValue);
			generalizationSet.refresh();
		}		
	}
	
	public void setMessageForGeneralizationSet (String msg, int msgLevel) {
	
	}
	
	public void unsetMessageForGeneralizationSet () {
	
	}

	
	

	
	



	// Start of user code additional methods
 	
	// End of user code
}	
