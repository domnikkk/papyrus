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
package org.eclipse.papyrus.tabbedproperties.uml.components;

// Start of user code for imports

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.tabbedproperties.uml.parts.Interface_PropertiesEditionPart;
import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class InterfaceBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$

	private String[] parts = { BASE_PART };

	/**
	 * The EObject to edit
	 */
	private Interface interface_;

	/**
	 * The Base part
	 */
	private Interface_PropertiesEditionPart basePart;

	/**
	 * Default constructor
	 */
	public InterfaceBasePropertiesEditionComponent(EObject interface_, String editing_mode) {
		if (interface_ instanceof Interface) {
			this.interface_ = (Interface) interface_;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.interface_.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 */
			public void notifyChanged(Notification msg) {
				if (basePart == null)
					InterfaceBasePropertiesEditionComponent.this.dispose();
				else {
					if (UMLPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null)
						basePart.setName((String) msg.getNewValue());

					if (UMLPackage.eINSTANCE.getNamedElement_Visibility().equals(msg.getFeature()) && basePart != null)
						basePart.setVisibility((Enumerator) msg.getNewValue());

					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getNamespace_ElementImport() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getElementImport())) {
						basePart.updateElementImport(interface_);
					}
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getNamespace_PackageImport() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getPackageImport())) {
						basePart.updatePackageImport(interface_);
					}
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getNamespace_OwnedRule() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getConstraint())) {
						basePart.updateOwnedRule(interface_);
					}
					if (UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().equals(msg.getFeature())
							&& basePart != null)
						basePart.setIsLeaf((Boolean) msg.getNewValue());

					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getTemplateableElement_TemplateBinding() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getTemplateBinding())) {
						basePart.updateTemplateBinding(interface_);
					}
					if (UMLPackage.eINSTANCE.getClassifier_IsAbstract().equals(msg.getFeature()) && basePart != null)
						basePart.setIsAbstract((Boolean) msg.getNewValue());

					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getClassifier_Generalization() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getGeneralization())) {
						basePart.updateGeneralization(interface_);
					}
					if (UMLPackage.eINSTANCE.getClassifier_PowertypeExtent().equals(msg.getFeature()))
						basePart.updatePowertypeExtent(interface_);
					if (UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier().equals(msg.getFeature()))
						basePart.updateRedefinedClassifier(interface_);
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getClassifier_Substitution() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getSubstitution())) {
						basePart.updateSubstitution(interface_);
					}
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getClassifier_CollaborationUse() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getCollaborationUse())) {
						basePart.updateCollaborationUse(interface_);
					}
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getClassifier_OwnedUseCase() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getUseCase())) {
						basePart.updateOwnedUseCase(interface_);
					}
					if (UMLPackage.eINSTANCE.getClassifier_UseCase().equals(msg.getFeature()))
						basePart.updateUseCase(interface_);
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getInterface_OwnedAttribute() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getProperty())) {
						basePart.updateOwnedAttribute(interface_);
					}
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getInterface_OwnedOperation() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getOperation())) {
						basePart.updateOwnedOperation(interface_);
					}
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getInterface_NestedClassifier() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getClassifier())) {
						basePart.updateNestedClassifier(interface_);
					}
					if (UMLPackage.eINSTANCE.getInterface_RedefinedInterface().equals(msg.getFeature()))
						basePart.updateRedefinedInterface(interface_);
					if (msg.getFeature() != null
							&& (((EStructuralFeature) msg.getFeature()) == UMLPackage.eINSTANCE
									.getInterface_OwnedReception() || ((EStructuralFeature) msg.getFeature())
									.getEContainingClass() == UMLPackage.eINSTANCE.getReception())) {
						basePart.updateOwnedReception(interface_);
					}

				}
			}

		};
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return UMLViewsRepository.Interface_.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *      (java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (interface_ != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance()
						.getProvider(UMLViewsRepository.class);
				if (provider != null) {
					basePart = (Interface_PropertiesEditionPart) provider.getPropertiesEditionPart(
							UMLViewsRepository.Interface_.class, kind, this);
					addListener((IPropertiesEditionListener) basePart);
				}
			}
			return (IPropertiesEditionPart) basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == UMLViewsRepository.Interface_.class)
			this.basePart = (Interface_PropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class,
	 *      int, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		if (basePart != null && key == UMLViewsRepository.Interface_.class) {
			((IPropertiesEditionPart) basePart).setContext(elt, allResource);
			Interface interface_ = (Interface) elt;
			// init values
			if (interface_.getName() != null)
				basePart.setName(interface_.getName());

			basePart.initVisibility((EEnum) UMLPackage.eINSTANCE.getNamedElement_Visibility().getEType(), interface_
					.getVisibility());
			basePart.initElementImport(interface_, null, UMLPackage.eINSTANCE.getNamespace_ElementImport());
			basePart.initPackageImport(interface_, null, UMLPackage.eINSTANCE.getNamespace_PackageImport());
			basePart.initOwnedRule(interface_, null, UMLPackage.eINSTANCE.getNamespace_OwnedRule());
			basePart.setIsLeaf(interface_.isLeaf());

			basePart.initTemplateBinding(interface_, null, UMLPackage.eINSTANCE
					.getTemplateableElement_TemplateBinding());
			basePart.setIsAbstract(interface_.isAbstract());

			basePart.initGeneralization(interface_, null, UMLPackage.eINSTANCE.getClassifier_Generalization());
			basePart.initPowertypeExtent(interface_, null, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent());
			basePart
					.initRedefinedClassifier(interface_, null, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier());
			basePart.initSubstitution(interface_, null, UMLPackage.eINSTANCE.getClassifier_Substitution());
			basePart.initCollaborationUse(interface_, null, UMLPackage.eINSTANCE.getClassifier_CollaborationUse());
			basePart.initOwnedUseCase(interface_, null, UMLPackage.eINSTANCE.getClassifier_OwnedUseCase());
			basePart.initUseCase(interface_, null, UMLPackage.eINSTANCE.getClassifier_UseCase());
			basePart.initOwnedAttribute(interface_, null, UMLPackage.eINSTANCE.getInterface_OwnedAttribute());
			basePart.initOwnedOperation(interface_, null, UMLPackage.eINSTANCE.getInterface_OwnedOperation());
			basePart.initNestedClassifier(interface_, null, UMLPackage.eINSTANCE.getInterface_NestedClassifier());
			basePart.initRedefinedInterface(interface_, null, UMLPackage.eINSTANCE.getInterface_RedefinedInterface());
			basePart.initOwnedReception(interface_, null, UMLPackage.eINSTANCE.getInterface_OwnedReception());

			// init filters

			basePart.addFilterToElementImport(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof ElementImport); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for elementImport

			// End of user code
			basePart.addFilterToPackageImport(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof PackageImport); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for packageImport

			// End of user code
			basePart.addFilterToOwnedRule(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Constraint); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for ownedRule

			// End of user code

			basePart.addFilterToTemplateBinding(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof TemplateBinding); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for templateBinding

			// End of user code

			basePart.addFilterToGeneralization(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Generalization); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for generalization

			// End of user code
			basePart.addFilterToPowertypeExtent(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.getPowertypeExtentTable().contains(element));
					return false;
				}

			});
			basePart.addFilterToPowertypeExtent(new EObjectFilter(UMLPackage.eINSTANCE.getGeneralizationSet()));
			// Start of user code for additional businessfilters for powertypeExtent

			// End of user code
			basePart.addFilterToRedefinedClassifier(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.getRedefinedClassifierTable().contains(element));
					return false;
				}

			});
			basePart.addFilterToRedefinedClassifier(new EObjectFilter(UMLPackage.eINSTANCE.getClassifier()));
			// Start of user code for additional businessfilters for redefinedClassifier

			// End of user code
			basePart.addFilterToSubstitution(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Substitution); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for substitution

			// End of user code
			basePart.addFilterToCollaborationUse(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof CollaborationUse); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for collaborationUse

			// End of user code
			basePart.addFilterToOwnedUseCase(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof UseCase); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for ownedUseCase

			// End of user code
			basePart.addFilterToUseCase(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.getUseCaseTable().contains(element));
					return false;
				}

			});
			basePart.addFilterToUseCase(new EObjectFilter(UMLPackage.eINSTANCE.getUseCase()));
			// Start of user code for additional businessfilters for useCase

			// End of user code
			basePart.addFilterToOwnedAttribute(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Property); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for ownedAttribute

			// End of user code
			basePart.addFilterToOwnedOperation(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Operation); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for ownedOperation

			// End of user code
			basePart.addFilterToNestedClassifier(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Classifier); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for nestedClassifier

			// End of user code
			basePart.addFilterToRedefinedInterface(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.getRedefinedInterfaceTable().contains(element));
					return false;
				}

			});
			basePart.addFilterToRedefinedInterface(new EObjectFilter(UMLPackage.eINSTANCE.getInterface()));
			// Start of user code for additional businessfilters for redefinedInterface

			// End of user code
			basePart.addFilterToOwnedReception(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 * java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Reception); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for ownedReception

			// End of user code
		}
		// init values for referenced views

		// init filters for referenced views

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *      (org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if (interface_ != null) {
			cc.append(SetCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getNamedElement_Name(),
					basePart.getName()));

			cc.append(SetCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getNamedElement_Visibility(),
					basePart.getVisibility()));

			List elementImportToAddFromElementImport = basePart.getElementImportToAdd();
			for (Iterator iter = elementImportToAddFromElementImport.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getNamespace_ElementImport(), iter.next()));
			Map elementImportToRefreshFromElementImport = basePart.getElementImportToEdit();
			for (Iterator iter = elementImportToRefreshFromElementImport.keySet().iterator(); iter.hasNext();) {

				// Start of user code for elementImport reference refreshment from elementImport

				ElementImport nextElement = (ElementImport) iter.next();
				ElementImport elementImport = (ElementImport) elementImportToRefreshFromElementImport.get(nextElement);

				// End of user code

			}
			List elementImportToRemoveFromElementImport = basePart.getElementImportToRemove();
			for (Iterator iter = elementImportToRemoveFromElementImport.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List elementImportToMoveFromElementImport = basePart.getElementImportToMove();
			for (Iterator iter = elementImportToMoveFromElementImport.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getElementImport(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List packageImportToAddFromPackageImport = basePart.getPackageImportToAdd();
			for (Iterator iter = packageImportToAddFromPackageImport.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getNamespace_PackageImport(), iter.next()));
			Map packageImportToRefreshFromPackageImport = basePart.getPackageImportToEdit();
			for (Iterator iter = packageImportToRefreshFromPackageImport.keySet().iterator(); iter.hasNext();) {

				// Start of user code for packageImport reference refreshment from packageImport

				PackageImport nextElement = (PackageImport) iter.next();
				PackageImport packageImport = (PackageImport) packageImportToRefreshFromPackageImport.get(nextElement);

				// End of user code

			}
			List packageImportToRemoveFromPackageImport = basePart.getPackageImportToRemove();
			for (Iterator iter = packageImportToRemoveFromPackageImport.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List packageImportToMoveFromPackageImport = basePart.getPackageImportToMove();
			for (Iterator iter = packageImportToMoveFromPackageImport.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getPackageImport(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedRuleToAddFromOwnedRule = basePart.getOwnedRuleToAdd();
			for (Iterator iter = ownedRuleToAddFromOwnedRule.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getNamespace_OwnedRule(),
						iter.next()));
			Map ownedRuleToRefreshFromOwnedRule = basePart.getOwnedRuleToEdit();
			for (Iterator iter = ownedRuleToRefreshFromOwnedRule.keySet().iterator(); iter.hasNext();) {

				// Start of user code for ownedRule reference refreshment from ownedRule

				Constraint nextElement = (Constraint) iter.next();
				Constraint ownedRule = (Constraint) ownedRuleToRefreshFromOwnedRule.get(nextElement);

				// End of user code

			}
			List ownedRuleToRemoveFromOwnedRule = basePart.getOwnedRuleToRemove();
			for (Iterator iter = ownedRuleToRemoveFromOwnedRule.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedRuleToMoveFromOwnedRule = basePart.getOwnedRuleToMove();
			for (Iterator iter = ownedRuleToMoveFromOwnedRule.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getConstraint(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf(),
					basePart.getIsLeaf()));

			List templateBindingToAddFromTemplateBinding = basePart.getTemplateBindingToAdd();
			for (Iterator iter = templateBindingToAddFromTemplateBinding.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getTemplateableElement_TemplateBinding(), iter.next()));
			Map templateBindingToRefreshFromTemplateBinding = basePart.getTemplateBindingToEdit();
			for (Iterator iter = templateBindingToRefreshFromTemplateBinding.keySet().iterator(); iter.hasNext();) {

				// Start of user code for templateBinding reference refreshment from templateBinding

				TemplateBinding nextElement = (TemplateBinding) iter.next();
				TemplateBinding templateBinding = (TemplateBinding) templateBindingToRefreshFromTemplateBinding
						.get(nextElement);

				// End of user code

			}
			List templateBindingToRemoveFromTemplateBinding = basePart.getTemplateBindingToRemove();
			for (Iterator iter = templateBindingToRemoveFromTemplateBinding.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List templateBindingToMoveFromTemplateBinding = basePart.getTemplateBindingToMove();
			for (Iterator iter = templateBindingToMoveFromTemplateBinding.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getTemplateBinding(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getClassifier_IsAbstract(),
					basePart.getIsAbstract()));

			List generalizationToAddFromGeneralization = basePart.getGeneralizationToAdd();
			for (Iterator iter = generalizationToAddFromGeneralization.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_Generalization(), iter.next()));
			Map generalizationToRefreshFromGeneralization = basePart.getGeneralizationToEdit();
			for (Iterator iter = generalizationToRefreshFromGeneralization.keySet().iterator(); iter.hasNext();) {

				// Start of user code for generalization reference refreshment from generalization

				Generalization nextElement = (Generalization) iter.next();
				Generalization generalization = (Generalization) generalizationToRefreshFromGeneralization
						.get(nextElement);

				// End of user code

			}
			List generalizationToRemoveFromGeneralization = basePart.getGeneralizationToRemove();
			for (Iterator iter = generalizationToRemoveFromGeneralization.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List generalizationToMoveFromGeneralization = basePart.getGeneralizationToMove();
			for (Iterator iter = generalizationToMoveFromGeneralization.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getGeneralization(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List powertypeExtentToAddFromPowertypeExtent = basePart.getPowertypeExtentToAdd();
			for (Iterator iter = powertypeExtentToAddFromPowertypeExtent.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_PowertypeExtent(), iter.next()));
			List powertypeExtentToRemoveFromPowertypeExtent = basePart.getPowertypeExtentToRemove();
			for (Iterator iter = powertypeExtentToRemoveFromPowertypeExtent.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_PowertypeExtent(), iter.next()));
			// List powertypeExtentToMoveFromPowertypeExtent = basePart.getPowertypeExtentToMove();
			// for (Iterator iter = powertypeExtentToMoveFromPowertypeExtent.iterator();
			// iter.hasNext();){
			// org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement =
			// (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			// cc.append(MoveCommand.create(editingDomain, interface_,
			// UMLPackage.eINSTANCE.getGeneralizationSet(), moveElement.getElement(),
			// moveElement.getIndex()));
			// }
			List redefinedClassifierToAddFromRedefinedClassifier = basePart.getRedefinedClassifierToAdd();
			for (Iterator iter = redefinedClassifierToAddFromRedefinedClassifier.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_RedefinedClassifier(), iter.next()));
			List redefinedClassifierToRemoveFromRedefinedClassifier = basePart.getRedefinedClassifierToRemove();
			for (Iterator iter = redefinedClassifierToRemoveFromRedefinedClassifier.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_RedefinedClassifier(), iter.next()));
			// List redefinedClassifierToMoveFromRedefinedClassifier =
			// basePart.getRedefinedClassifierToMove();
			// for (Iterator iter = redefinedClassifierToMoveFromRedefinedClassifier.iterator();
			// iter.hasNext();){
			// org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement =
			// (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			// cc.append(MoveCommand.create(editingDomain, interface_,
			// UMLPackage.eINSTANCE.getClassifier(), moveElement.getElement(),
			// moveElement.getIndex()));
			// }
			List substitutionToAddFromSubstitution = basePart.getSubstitutionToAdd();
			for (Iterator iter = substitutionToAddFromSubstitution.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_Substitution(), iter.next()));
			Map substitutionToRefreshFromSubstitution = basePart.getSubstitutionToEdit();
			for (Iterator iter = substitutionToRefreshFromSubstitution.keySet().iterator(); iter.hasNext();) {

				// Start of user code for substitution reference refreshment from substitution

				Substitution nextElement = (Substitution) iter.next();
				Substitution substitution = (Substitution) substitutionToRefreshFromSubstitution.get(nextElement);

				// End of user code

			}
			List substitutionToRemoveFromSubstitution = basePart.getSubstitutionToRemove();
			for (Iterator iter = substitutionToRemoveFromSubstitution.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List substitutionToMoveFromSubstitution = basePart.getSubstitutionToMove();
			for (Iterator iter = substitutionToMoveFromSubstitution.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getSubstitution(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List collaborationUseToAddFromCollaborationUse = basePart.getCollaborationUseToAdd();
			for (Iterator iter = collaborationUseToAddFromCollaborationUse.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_CollaborationUse(), iter.next()));
			Map collaborationUseToRefreshFromCollaborationUse = basePart.getCollaborationUseToEdit();
			for (Iterator iter = collaborationUseToRefreshFromCollaborationUse.keySet().iterator(); iter.hasNext();) {

				// Start of user code for collaborationUse reference refreshment from
				// collaborationUse

				CollaborationUse nextElement = (CollaborationUse) iter.next();
				CollaborationUse collaborationUse = (CollaborationUse) collaborationUseToRefreshFromCollaborationUse
						.get(nextElement);

				// End of user code

			}
			List collaborationUseToRemoveFromCollaborationUse = basePart.getCollaborationUseToRemove();
			for (Iterator iter = collaborationUseToRemoveFromCollaborationUse.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List collaborationUseToMoveFromCollaborationUse = basePart.getCollaborationUseToMove();
			for (Iterator iter = collaborationUseToMoveFromCollaborationUse.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getCollaborationUse(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedUseCaseToAddFromOwnedUseCase = basePart.getOwnedUseCaseToAdd();
			for (Iterator iter = ownedUseCaseToAddFromOwnedUseCase.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_OwnedUseCase(), iter.next()));
			Map ownedUseCaseToRefreshFromOwnedUseCase = basePart.getOwnedUseCaseToEdit();
			for (Iterator iter = ownedUseCaseToRefreshFromOwnedUseCase.keySet().iterator(); iter.hasNext();) {

				// Start of user code for ownedUseCase reference refreshment from ownedUseCase

				UseCase nextElement = (UseCase) iter.next();
				UseCase ownedUseCase = (UseCase) ownedUseCaseToRefreshFromOwnedUseCase.get(nextElement);

				// End of user code

			}
			List ownedUseCaseToRemoveFromOwnedUseCase = basePart.getOwnedUseCaseToRemove();
			for (Iterator iter = ownedUseCaseToRemoveFromOwnedUseCase.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedUseCaseToMoveFromOwnedUseCase = basePart.getOwnedUseCaseToMove();
			for (Iterator iter = ownedUseCaseToMoveFromOwnedUseCase.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getUseCase(), moveElement
						.getElement(), moveElement.getIndex()));
			}
			List useCaseToAddFromUseCase = basePart.getUseCaseToAdd();
			for (Iterator iter = useCaseToAddFromUseCase.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getClassifier_UseCase(),
						iter.next()));
			List useCaseToRemoveFromUseCase = basePart.getUseCaseToRemove();
			for (Iterator iter = useCaseToRemoveFromUseCase.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getClassifier_UseCase(),
						iter.next()));
			// List useCaseToMoveFromUseCase = basePart.getUseCaseToMove();
			// for (Iterator iter = useCaseToMoveFromUseCase.iterator(); iter.hasNext();){
			// org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement =
			// (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			// cc.append(MoveCommand.create(editingDomain, interface_,
			// UMLPackage.eINSTANCE.getUseCase(), moveElement.getElement(),
			// moveElement.getIndex()));
			// }
			List ownedAttributeToAddFromOwnedAttribute = basePart.getOwnedAttributeToAdd();
			for (Iterator iter = ownedAttributeToAddFromOwnedAttribute.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getInterface_OwnedAttribute(), iter.next()));
			Map ownedAttributeToRefreshFromOwnedAttribute = basePart.getOwnedAttributeToEdit();
			for (Iterator iter = ownedAttributeToRefreshFromOwnedAttribute.keySet().iterator(); iter.hasNext();) {

				// Start of user code for ownedAttribute reference refreshment from ownedAttribute

				Property nextElement = (Property) iter.next();
				Property ownedAttribute = (Property) ownedAttributeToRefreshFromOwnedAttribute.get(nextElement);

				// End of user code

			}
			List ownedAttributeToRemoveFromOwnedAttribute = basePart.getOwnedAttributeToRemove();
			for (Iterator iter = ownedAttributeToRemoveFromOwnedAttribute.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedAttributeToMoveFromOwnedAttribute = basePart.getOwnedAttributeToMove();
			for (Iterator iter = ownedAttributeToMoveFromOwnedAttribute.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getProperty(), moveElement
						.getElement(), moveElement.getIndex()));
			}
			List ownedOperationToAddFromOwnedOperation = basePart.getOwnedOperationToAdd();
			for (Iterator iter = ownedOperationToAddFromOwnedOperation.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getInterface_OwnedOperation(), iter.next()));
			Map ownedOperationToRefreshFromOwnedOperation = basePart.getOwnedOperationToEdit();
			for (Iterator iter = ownedOperationToRefreshFromOwnedOperation.keySet().iterator(); iter.hasNext();) {

				// Start of user code for ownedOperation reference refreshment from ownedOperation

				Operation nextElement = (Operation) iter.next();
				Operation ownedOperation = (Operation) ownedOperationToRefreshFromOwnedOperation.get(nextElement);

				// End of user code

			}
			List ownedOperationToRemoveFromOwnedOperation = basePart.getOwnedOperationToRemove();
			for (Iterator iter = ownedOperationToRemoveFromOwnedOperation.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedOperationToMoveFromOwnedOperation = basePart.getOwnedOperationToMove();
			for (Iterator iter = ownedOperationToMoveFromOwnedOperation.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getOperation(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List nestedClassifierToAddFromNestedClassifier = basePart.getNestedClassifierToAdd();
			for (Iterator iter = nestedClassifierToAddFromNestedClassifier.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getInterface_NestedClassifier(), iter.next()));
			Map nestedClassifierToRefreshFromNestedClassifier = basePart.getNestedClassifierToEdit();
			for (Iterator iter = nestedClassifierToRefreshFromNestedClassifier.keySet().iterator(); iter.hasNext();) {

				// Start of user code for nestedClassifier reference refreshment from
				// nestedClassifier

				Classifier nextElement = (Classifier) iter.next();
				Classifier nestedClassifier = (Classifier) nestedClassifierToRefreshFromNestedClassifier
						.get(nextElement);

				// End of user code

			}
			List nestedClassifierToRemoveFromNestedClassifier = basePart.getNestedClassifierToRemove();
			for (Iterator iter = nestedClassifierToRemoveFromNestedClassifier.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List nestedClassifierToMoveFromNestedClassifier = basePart.getNestedClassifierToMove();
			for (Iterator iter = nestedClassifierToMoveFromNestedClassifier.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getClassifier(),
						moveElement.getElement(), moveElement.getIndex()));
			}
			List redefinedInterfaceToAddFromRedefinedInterface = basePart.getRedefinedInterfaceToAdd();
			for (Iterator iter = redefinedInterfaceToAddFromRedefinedInterface.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getInterface_RedefinedInterface(), iter.next()));
			List redefinedInterfaceToRemoveFromRedefinedInterface = basePart.getRedefinedInterfaceToRemove();
			for (Iterator iter = redefinedInterfaceToRemoveFromRedefinedInterface.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getInterface_RedefinedInterface(), iter.next()));
			// List redefinedInterfaceToMoveFromRedefinedInterface =
			// basePart.getRedefinedInterfaceToMove();
			// for (Iterator iter = redefinedInterfaceToMoveFromRedefinedInterface.iterator();
			// iter.hasNext();){
			// org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement =
			// (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			// cc.append(MoveCommand.create(editingDomain, interface_,
			// UMLPackage.eINSTANCE.getInterface(), moveElement.getElement(),
			// moveElement.getIndex()));
			// }
			List ownedReceptionToAddFromOwnedReception = basePart.getOwnedReceptionToAdd();
			for (Iterator iter = ownedReceptionToAddFromOwnedReception.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE
						.getInterface_OwnedReception(), iter.next()));
			Map ownedReceptionToRefreshFromOwnedReception = basePart.getOwnedReceptionToEdit();
			for (Iterator iter = ownedReceptionToRefreshFromOwnedReception.keySet().iterator(); iter.hasNext();) {

				// Start of user code for ownedReception reference refreshment from ownedReception

				Reception nextElement = (Reception) iter.next();
				Reception ownedReception = (Reception) ownedReceptionToRefreshFromOwnedReception.get(nextElement);

				// End of user code

			}
			List ownedReceptionToRemoveFromOwnedReception = basePart.getOwnedReceptionToRemove();
			for (Iterator iter = ownedReceptionToRemoveFromOwnedReception.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedReceptionToMoveFromOwnedReception = basePart.getOwnedReceptionToMove();
			for (Iterator iter = ownedReceptionToMoveFromOwnedReception.iterator(); iter.hasNext();) {
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement) iter
						.next();
				cc.append(MoveCommand.create(editingDomain, interface_, UMLPackage.eINSTANCE.getReception(),
						moveElement.getElement(), moveElement.getIndex()));
			}

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof Interface) {
			Interface interface_ToUpdate = (Interface) source;
			interface_ToUpdate.setName(basePart.getName());

			interface_ToUpdate.setVisibility((VisibilityKind) basePart.getVisibility());

			interface_ToUpdate.getElementImports().addAll(basePart.getElementImportToAdd());
			interface_ToUpdate.getPackageImports().addAll(basePart.getPackageImportToAdd());
			interface_ToUpdate.getOwnedRules().addAll(basePart.getOwnedRuleToAdd());
			interface_ToUpdate.setIsLeaf(new Boolean(basePart.getIsLeaf()).booleanValue());

			interface_ToUpdate.getTemplateBindings().addAll(basePart.getTemplateBindingToAdd());
			interface_ToUpdate.setIsAbstract(new Boolean(basePart.getIsAbstract()).booleanValue());

			interface_ToUpdate.getGeneralizations().addAll(basePart.getGeneralizationToAdd());
			interface_ToUpdate.getPowertypeExtents().addAll(basePart.getPowertypeExtentToAdd());
			interface_ToUpdate.getRedefinedClassifiers().addAll(basePart.getRedefinedClassifierToAdd());
			interface_ToUpdate.getSubstitutions().addAll(basePart.getSubstitutionToAdd());
			interface_ToUpdate.getCollaborationUses().addAll(basePart.getCollaborationUseToAdd());
			interface_ToUpdate.getOwnedUseCases().addAll(basePart.getOwnedUseCaseToAdd());
			interface_ToUpdate.getUseCases().addAll(basePart.getUseCaseToAdd());
			interface_ToUpdate.getOwnedAttributes().addAll(basePart.getOwnedAttributeToAdd());
			interface_ToUpdate.getOwnedOperations().addAll(basePart.getOwnedOperationToAdd());
			interface_ToUpdate.getNestedClassifiers().addAll(basePart.getNestedClassifierToAdd());
			interface_ToUpdate.getRedefinedInterfaces().addAll(basePart.getRedefinedInterfaceToAdd());
			interface_ToUpdate.getOwnedReceptions().addAll(basePart.getOwnedReceptionToAdd());

			return interface_ToUpdate;
		} else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		super.firePropertiesChanged(event);
		if (PropertiesEditionEvent.COMMIT == event.getState()
				&& IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
			CompoundCommand command = new CompoundCommand();
			if (UMLViewsRepository.Interface_.name == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
						.getNamedElement_Name(), event.getNewValue()));

			if (UMLViewsRepository.Interface_.visibility == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
						.getNamedElement_Visibility(), event.getNewValue()));

			if (UMLViewsRepository.Interface_.elementImport == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					ElementImport oldValue = (ElementImport) event.getOldValue();
					ElementImport newValue = (ElementImport) event.getNewValue();

					// Start of user code for elementImport live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getNamespace_ElementImport(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getElementImport(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.packageImport == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					PackageImport oldValue = (PackageImport) event.getOldValue();
					PackageImport newValue = (PackageImport) event.getNewValue();

					// Start of user code for packageImport live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getNamespace_PackageImport(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getPackageImport(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.ownedRule == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Constraint oldValue = (Constraint) event.getOldValue();
					Constraint newValue = (Constraint) event.getNewValue();

					// Start of user code for ownedRule live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getNamespace_OwnedRule(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getConstraint(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.isLeaf == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
						.getRedefinableElement_IsLeaf(), event.getNewValue()));

			if (UMLViewsRepository.Interface_.templateBinding == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					TemplateBinding oldValue = (TemplateBinding) event.getOldValue();
					TemplateBinding newValue = (TemplateBinding) event.getNewValue();

					// Start of user code for templateBinding live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getTemplateableElement_TemplateBinding(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getTemplateBinding(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.isAbstract == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
						.getClassifier_IsAbstract(), event.getNewValue()));

			if (UMLViewsRepository.Interface_.generalization == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Generalization oldValue = (Generalization) event.getOldValue();
					Generalization newValue = (Generalization) event.getNewValue();

					// Start of user code for generalization live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_Generalization(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getGeneralization(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.powertypeExtent == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_PowertypeExtent(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_PowertypeExtent(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_PowertypeExtent(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.redefinedClassifier == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_RedefinedClassifier(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_RedefinedClassifier(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_RedefinedClassifier(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.substitution == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Substitution oldValue = (Substitution) event.getOldValue();
					Substitution newValue = (Substitution) event.getNewValue();

					// Start of user code for substitution live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_Substitution(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getSubstitution(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.collaborationUse == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					CollaborationUse oldValue = (CollaborationUse) event.getOldValue();
					CollaborationUse newValue = (CollaborationUse) event.getNewValue();

					// Start of user code for collaborationUse live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_CollaborationUse(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getCollaborationUse(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.ownedUseCase == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					UseCase oldValue = (UseCase) event.getOldValue();
					UseCase newValue = (UseCase) event.getNewValue();

					// Start of user code for ownedUseCase live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_OwnedUseCase(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE.getUseCase(),
							event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.useCase == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_UseCase(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_UseCase(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier_UseCase(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.ownedAttribute == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Property oldValue = (Property) event.getOldValue();
					Property newValue = (Property) event.getNewValue();

					// Start of user code for ownedAttribute live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_OwnedAttribute(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_,
							UMLPackage.eINSTANCE.getProperty(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.ownedOperation == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Operation oldValue = (Operation) event.getOldValue();
					Operation newValue = (Operation) event.getNewValue();

					// Start of user code for ownedOperation live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_OwnedOperation(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getOperation(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.nestedClassifier == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Classifier oldValue = (Classifier) event.getOldValue();
					Classifier newValue = (Classifier) event.getNewValue();

					// Start of user code for nestedClassifier live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_NestedClassifier(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getClassifier(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.redefinedInterface == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_RedefinedInterface(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_RedefinedInterface(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_RedefinedInterface(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interface_.ownedReception == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Reception oldValue = (Reception) event.getOldValue();
					Reception newValue = (Reception) event.getNewValue();

					// Start of user code for ownedReception live update command
					// TODO: Complete the interface_ update command
					// End of user code

				} else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getInterface_OwnedReception(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interface_, UMLPackage.eINSTANCE
							.getReception(), event.getNewValue(), event.getNewIndex()));
			}

			liveEditingDomain.getCommandStack().execute(command);
		} else if (PropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				if (UMLViewsRepository.Interface_.name == event.getAffectedEditor())
					basePart.setMessageForName(diag.getMessage(), IMessageProvider.ERROR);

			} else {
				if (UMLViewsRepository.Interface_.name == event.getAffectedEditor())
					basePart.unsetMessageForName();

			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String,
	 *      int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == UMLViewsRepository.Interface_.isLeaf || key == UMLViewsRepository.Interface_.isAbstract;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String,
	 *      int)
	 */
	public String getHelpContent(String key, int kind) {
		if (key == UMLViewsRepository.Interface_.name)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.visibility)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.elementImport)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.packageImport)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.ownedRule)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.isLeaf)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.templateBinding)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.isAbstract)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.generalization)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.powertypeExtent)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.redefinedClassifier)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.substitution)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.collaborationUse)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.ownedUseCase)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.useCase)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.ownedAttribute)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.ownedOperation)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.nestedClassifier)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.redefinedInterface)
			return null; //$NON-NLS-1$
		if (key == UMLViewsRepository.Interface_.ownedReception)
			return null; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.common.notify.Notification)
	 */
	public Diagnostic validateValue(PropertiesEditionEvent event) {
		String newStringValue = event.getNewValue().toString();
		Diagnostic ret = null;
		try {
			if (UMLViewsRepository.Interface_.name == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Name()
						.getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(),
						newValue);
			}
			if (UMLViewsRepository.Interface_.visibility == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Visibility()
						.getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Visibility()
						.getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interface_.isLeaf == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf()
						.getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf()
						.getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interface_.isAbstract == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getClassifier_IsAbstract()
						.getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getClassifier_IsAbstract()
						.getEAttributeType(), newValue);
			}

		} catch (IllegalArgumentException iae) {
			ret = BasicDiagnostic.toDiagnostic(iae);
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 */
	public Diagnostic validate() {
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(PropertiesContextService.getInstance().entryPointElement());
			copy = PropertiesContextService.getInstance().entryPointComponent().getPropertiesEditionObject(copy);
			return Diagnostician.INSTANCE.validate(copy);
		} else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			return Diagnostician.INSTANCE.validate(interface_);
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 */
	public void dispose() {
		if (semanticAdapter != null)
			interface_.eAdapters().remove(semanticAdapter);
	}

}
