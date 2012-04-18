/*****************************************************************************
 * Copyright (c) 2012 Atos.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.uml.widgets;

import java.util.Collections;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.papyrus.profile.tree.objects.AppliedStereotypePropertyTreeObject;
import org.eclipse.papyrus.profile.ui.compositeforview.AppliedStereotypeCompositeWithView;
import org.eclipse.papyrus.properties.providers.ContainerContentProvider;
import org.eclipse.papyrus.properties.providers.EMFObjectLabelProvider;
import org.eclipse.papyrus.properties.providers.FeatureContentProvider;
import org.eclipse.papyrus.properties.uml.creation.UMLPropertyEditorFactory;
import org.eclipse.papyrus.properties.uml.providers.UMLLabelProvider;
import org.eclipse.papyrus.uml.modelexplorer.widgets.ServiceEditFilteredUMLContentProvider;
import org.eclipse.papyrus.umlutils.PackageUtil;
import org.eclipse.papyrus.widgets.providers.IStaticContentProvider;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

public class StereotypePropertyEditor implements ISelectionChangedListener, IChangeListener {

	protected EStructuralFeatureEditor eStructuralFeatureEditor;

	protected AppliedStereotypeCompositeWithView stereotypeComposite;

	protected int style = 0;

	public StereotypePropertyEditor(Composite parent, int style, AppliedStereotypeCompositeWithView stereotypeComposite) {
		this.stereotypeComposite = stereotypeComposite;
		eStructuralFeatureEditor = new EStructuralFeatureEditor(parent, style);
		eStructuralFeatureEditor.setChangeListener(this);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		if(event != null) {
			IStructuredSelection structSelection = (IStructuredSelection)event.getSelection();
			Object selection = structSelection.getFirstElement();

			if(selection instanceof AppliedStereotypePropertyTreeObject) {
				AppliedStereotypePropertyTreeObject pTO = (AppliedStereotypePropertyTreeObject)selection;

				EObject stereotypeApplication = pTO.getStereotypeApplication();
				EStructuralFeature feature = pTO.getFeature();
				Element element = pTO.getElement();

				eStructuralFeatureEditor.setProviders(getUMLContentProvider(stereotypeApplication, feature, element), new UMLLabelProvider());
				if (feature instanceof EReference) {
					eStructuralFeatureEditor.setValueFactory(getUMLPropertyEditorFactory((EReference)feature));
				}
				
				eStructuralFeatureEditor.setFeatureToEdit(feature, stereotypeApplication);
			}
		}
	}

	protected ServiceEditFilteredUMLContentProvider getUMLContentProvider(EObject stereotypeApplication, EStructuralFeature feature, Element element) {
		Package root = PackageUtil.getRootPackage(element);
		ServiceEditFilteredUMLContentProvider contentProvider = new ServiceEditFilteredUMLContentProvider(stereotypeApplication, feature, root);

		contentProvider.setMetaClassWanted(feature.getEType());
		contentProvider.setMetaClassNotWanted(Collections.emptyList());
		return contentProvider;
	}

	protected UMLPropertyEditorFactory getUMLPropertyEditorFactory(EReference reference) {
		UMLPropertyEditorFactory factory = new UMLPropertyEditorFactory(reference);
		EClass type = reference.getEReferenceType();

		factory.setContainerLabelProvider(new UMLLabelProvider());
		factory.setReferenceLabelProvider(new EMFObjectLabelProvider());
		IStaticContentProvider contentProvider = new ContainerContentProvider(type);
		factory.setContainerContentProvider(contentProvider);
		factory.setReferenceContentProvider(new FeatureContentProvider(type));

		return factory;
	}

	public void setLayoutData(GridData data) {
		eStructuralFeatureEditor.setLayoutData(data);
	}

	public void handleChange(ChangeEvent event) {
		if (!stereotypeComposite.isDisposed()) {
			stereotypeComposite.refreshTreeViewer();
		}
	}
}
