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
import java.util.List;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.profile.tree.objects.AppliedStereotypePropertyTreeObject;
import org.eclipse.papyrus.profile.ui.compositeforview.AppliedStereotypeCompositeWithView;
import org.eclipse.papyrus.properties.providers.ContainerContentProvider;
import org.eclipse.papyrus.properties.providers.EMFObjectLabelProvider;
import org.eclipse.papyrus.properties.providers.EcoreEnumeratorContentProvider;
import org.eclipse.papyrus.properties.providers.FeatureContentProvider;
import org.eclipse.papyrus.properties.uml.creation.UMLPropertyEditorFactory;
import org.eclipse.papyrus.properties.uml.databinding.PapyrusObservableList;
import org.eclipse.papyrus.properties.uml.databinding.PapyrusObservableValue;
import org.eclipse.papyrus.properties.uml.providers.UMLLabelProvider;
import org.eclipse.papyrus.uml.modelexplorer.widgets.ServiceEditFilteredUMLContentProvider;
import org.eclipse.papyrus.umlutils.PackageUtil;
import org.eclipse.papyrus.widgets.editors.AbstractValueEditor;
import org.eclipse.papyrus.widgets.editors.BooleanCombo;
import org.eclipse.papyrus.widgets.editors.DoubleEditor;
import org.eclipse.papyrus.widgets.editors.EnumCombo;
import org.eclipse.papyrus.widgets.editors.FloatEditor;
import org.eclipse.papyrus.widgets.editors.IntegerEditor;
import org.eclipse.papyrus.widgets.editors.MultipleIntegerEditor;
import org.eclipse.papyrus.widgets.editors.MultipleReferenceEditor;
import org.eclipse.papyrus.widgets.editors.MultipleStringEditor;
import org.eclipse.papyrus.widgets.editors.MultipleValueEditor;
import org.eclipse.papyrus.widgets.editors.ReferenceDialog;
import org.eclipse.papyrus.widgets.editors.StringEditor;
import org.eclipse.papyrus.widgets.providers.IStaticContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.PageBook;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

public class StereotypePropertyEditor implements ISelectionChangedListener, IValueChangeListener, IListChangeListener {

	protected PageBook pageBook;

	protected Composite emptyPage;

	protected Composite currentPage;

	protected AppliedStereotypeCompositeWithView stereotypeComposite;

	protected int style = 0;

	public StereotypePropertyEditor(Composite parent, int style, AppliedStereotypeCompositeWithView stereotypeComposite) {
		this.stereotypeComposite = stereotypeComposite;
		this.style  = style;
		pageBook = new PageBook(parent, style);
		emptyPage = new Composite(pageBook, style);
		currentPage = emptyPage;
		pageBook.showPage(currentPage);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		if(currentPage != emptyPage) {
			currentPage.dispose();
		}

		currentPage = emptyPage;

		if(event != null) {
			IStructuredSelection structSelection = (IStructuredSelection)event.getSelection();
			Object selection = structSelection.getFirstElement();

			if(selection instanceof AppliedStereotypePropertyTreeObject) {
				AppliedStereotypePropertyTreeObject pTO = (AppliedStereotypePropertyTreeObject)selection;

				EObject stereotypeApplication = pTO.getStereotypeApplication();
				EStructuralFeature feature = pTO.getFeature();
				Property property = pTO.getProperty();
				Element element = pTO.getElement();

				if(feature instanceof EReference) {
					if(property.isMultivalued()) {
						MultipleReferenceEditor editor = new MultipleReferenceEditor(pageBook, style);
						setMultipleValueEditorProperties(editor, (List<?>)pTO.getValue(), stereotypeApplication, feature, property);

						editor.setProviders(getUMLContentProvider(stereotypeApplication, feature, element), new UMLLabelProvider());
						editor.setFactory(getUMLPropertyEditorFactory((EReference)feature));
						currentPage = editor;
					} else {
						ReferenceDialog editor = new ReferenceDialog(pageBook, style);
						setValueEditorProperties(editor, stereotypeApplication, feature, property);

						editor.setContentProvider(getUMLContentProvider(stereotypeApplication, feature, element));
						editor.setLabelProvider(new UMLLabelProvider());
						editor.setValueFactory(getUMLPropertyEditorFactory((EReference)feature));

						editor.setDirectCreation(property.isComposite());
						currentPage = editor;
					}
				}

				if(feature instanceof EAttribute) {
					EClassifier type = feature.getEType();
					if(type instanceof EEnum) {
						if(property.isMultivalued()) {
							// TODO widget not available
							currentPage = emptyPage;
						} else {
							EnumCombo editor = new EnumCombo(pageBook, style);
							setValueEditorProperties(editor, stereotypeApplication, feature, property);
							editor.setContentProvider(new EcoreEnumeratorContentProvider(feature));
							currentPage = editor;
						}
					} else if(type instanceof EDataType) {
						String instanceClassName = ((EDataType)type).getInstanceClassName();
						if("java.lang.String".equalsIgnoreCase(instanceClassName) || "string".equalsIgnoreCase(instanceClassName)) {
							if(property.isMultivalued()) {
								MultipleStringEditor editor = new MultipleStringEditor(pageBook, style, true);
								setMultipleValueEditorProperties(editor, (List<?>)pTO.getValue(), stereotypeApplication, feature, property);
								currentPage = editor;
							} else {
								StringEditor editor = new StringEditor(pageBook, style | SWT.MULTI);
								setValueEditorProperties(editor, stereotypeApplication, feature, property);
								currentPage = editor;
							}
						} else if("java.lang.Integer".equalsIgnoreCase(instanceClassName) || "integer".equalsIgnoreCase(instanceClassName)) {
							if(property.isMultivalued()) {
								MultipleIntegerEditor editor = new MultipleIntegerEditor(pageBook, style);
								setMultipleValueEditorProperties(editor, (List<?>)pTO.getValue(), stereotypeApplication, feature, property);
								currentPage = editor;
							} else {
								IntegerEditor editor = new IntegerEditor(pageBook, style);
								setValueEditorProperties(editor, stereotypeApplication, feature, property);
								currentPage = editor;
							}
						} else if("java.lang.Boolean".equals(instanceClassName) || "boolean".equalsIgnoreCase(instanceClassName)) {
							if(property.isMultivalued()) {
								// TODO widget not available
								currentPage = emptyPage;
							} else {
								BooleanCombo editor = new BooleanCombo(pageBook, style);
								setValueEditorProperties(editor, stereotypeApplication, feature, property);
								currentPage = editor;
							}
						} else if("java.lang.Float".equals(instanceClassName) || "float".equalsIgnoreCase(instanceClassName)) {
							if(property.isMultivalued()) {
								// TODO widget not available
								currentPage = emptyPage;
							} else {
								FloatEditor editor = new FloatEditor(pageBook, style);
								setValueEditorProperties(editor, stereotypeApplication, feature, property);
								currentPage = editor;
							}
						} else if("java.lang.Double".equals(instanceClassName) || "double".equalsIgnoreCase(instanceClassName)) {
							if(property.isMultivalued()) {
								// TODO widget not available
								currentPage = emptyPage;
							} else {
								DoubleEditor editor = new DoubleEditor(pageBook, style);
								setValueEditorProperties(editor, stereotypeApplication, feature, property);
								currentPage = editor;
							}
						}
					}
				}
			}
		}

		pageBook.showPage(currentPage);
	}

	protected void setValueEditorProperties(AbstractValueEditor editor, EObject stereotypeApplication, EStructuralFeature feature, Property property) {
		editor.setLabel(property.getName());

		if(property.isDerived() || property.isReadOnly()) {
			editor.setReadOnly(true);
		}

		PapyrusObservableValue observable = new PapyrusObservableValue(stereotypeApplication, feature, EditorUtils.getTransactionalEditingDomain());

		editor.setModelObservable(observable);

		observable.addValueChangeListener(this);
	}

	protected void setMultipleValueEditorProperties(MultipleValueEditor editor, List<?> initialList, EObject stereotypeApplication, EStructuralFeature feature, Property property) {
		editor.setLabel(property.getName());
		editor.setUnique(property.isUnique());
		editor.setOrdered(property.isOrdered());
		editor.setDirectCreation(property.isComposite());

		if(property.isDerived() || property.isReadOnly()) {
			editor.setReadOnly(true);
		}

		PapyrusObservableList observable = new PapyrusObservableList(initialList, EditorUtils.getTransactionalEditingDomain(), stereotypeApplication, feature);

		editor.setModelObservable(observable);
		editor.addCommitListener(observable);

		observable.addListChangeListener(this);
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
		pageBook.setLayoutData(data);
	}

	public void handleValueChange(ValueChangeEvent event) {
		stereotypeComposite.refreshTreeViewer();
	}

	public void handleListChange(ListChangeEvent event) {
		stereotypeComposite.refreshTreeViewer();
	}
}
