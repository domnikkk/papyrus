/*******************************************************************************
 * Copyright (c) 2012, 2014 Mia-Software, CEA, Christian W. Damus, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 385292 - [CustomizedTreeContentProvider] StackOverFlow when refreshing a TreeViewer with ICustomizedTreeContentProvider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 *    Christian W. Damus (CEA) - bug 430700
 *    Christian W. Damus (CEA) - bug 440795
 *    Christian W. Damus (CEA) - bug 441857
 *    Sebastien Gabel (Esterel Technologies) - Bug 438931 - Non deterministic order of the facet references defined in custom file
 *    Christian W. Damus - bug 451683
 *
 *******************************************************************************/
package org.eclipse.papyrus.emf.facet.custom.ui.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.papyrus.emf.facet.custom.core.exception.CustomizationException;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyFactory;
import org.eclipse.papyrus.emf.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.papyrus.emf.facet.custom.ui.IContentPropertiesHandlerFactory;
import org.eclipse.papyrus.emf.facet.custom.ui.ICustomizedContentProvider;
import org.eclipse.papyrus.emf.facet.custom.ui.ICustomizedTreeContentProvider;
import org.eclipse.papyrus.emf.facet.efacet.core.FacetUtils;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.papyrus.emf.facet.util.core.Logger;

@SuppressWarnings("deprecation")
// @SuppressWarnings("deprecation") : Bug 380229 - [deprecated] ICustomizedContentProvider
public class CustomizedTreeContentProvider implements ICustomizedTreeContentProvider, ICustomizedContentProvider {

	private final ICustomizationManager customManager;
	private final IContentPropertiesHandler contentHandler;
	private Object[] rootElements;

	private final Map<EObjectCacheElement, TreeElement> cache;

	private class EObjectCacheElement {

		// Not null
		private final EObject element;

		// May be null
		private final TreeElement parent;

		public EObjectCacheElement(EObject element, TreeElement parent) {
			this.element = element;
			this.parent = parent;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((element == null) ? 0 : element.hashCode());
			result = prime * result + ((parent == null) ? 0 : parent.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof EObjectCacheElement)) {
				return false;
			}
			EObjectCacheElement other = (EObjectCacheElement) obj;
			if (!getOuterType().equals(other.getOuterType())) {
				return false;
			}
			if (element == null) {
				if (other.element != null) {
					return false;
				}
			} else if (!element.equals(other.element)) {
				return false;
			}
			if (parent == null) {
				if (other.parent != null) {
					return false;
				}
			} else if (!parent.equals(other.parent)) {
				return false;
			}
			return true;
		}

		private CustomizedTreeContentProvider getOuterType() {
			return CustomizedTreeContentProvider.this;
		}
	}

	public CustomizedTreeContentProvider(final ICustomizationManager customManager) {
		this.customManager = customManager;
		this.contentHandler = IContentPropertiesHandlerFactory.DEFAULT.createIContentPropertiesHandler(customManager);
		this.cache = new HashMap<EObjectCacheElement, TreeElement>();
	}

	protected Object[] getRootElements(final Object inputElement) {
		Object[] result;
		if (inputElement == null) {
			result = new Object[0];
		} else if (inputElement instanceof EObject) {
			result = new EObject[] { (EObject) inputElement };
		} else if (inputElement instanceof Collection<?>) {
			result = ((Collection<?>) inputElement).toArray();
		} else if (inputElement instanceof EObject[]) {
			result = (EObject[]) inputElement;
		} else {
			throw new IllegalArgumentException("Unhandled input element type: " + inputElement.getClass().getSimpleName()); //$NON-NLS-1$
		}
		return result;
	}

	public Object[] getElements(final Object inputElement) {
		// Reconcile the (possibly changed) list of root elements with our tree element proxies

		final Object[] elements = getRootElements(inputElement);
		final List<Object> elementList = new ArrayList<Object>();

		// Index the existing elements
		final Map<Object, Object> index = new IdentityHashMap<Object, Object>(elements.length + 1);
		if (this.rootElements != null) {
			for (Object next : this.rootElements) {
				if (next instanceof EObjectTreeElement) {
					// Maps to its tree-element proxy
					index.put(((EObjectTreeElement) next).getEObject(), next);
				} else {
					// Maps to itself
					index.put(next, next);
				}
			}
		}

		for (final Object element : elements) {
			if (!isVisible(element, null)) {
				continue;
			}

			Object existing = index.get(element);
			if (existing != null) {
				// Just add it
				elementList.add(existing);
			} else if (element instanceof EObject) {
				final EObjectTreeElement eObjectProxy = getEObjectProxy(element, null);
				elementList.add(eObjectProxy);
			} else {
				elementList.add(element);
			}
		}

		this.rootElements = elementList.toArray();
		return this.rootElements;
	}

	protected static EObjectTreeElement createEObjectProxy(final Object element, final TreeElement parent) {
		final EObject eObject = (EObject) element;
		final EObjectTreeElement eObjectProxy = TreeproxyFactory.eINSTANCE.createEObjectTreeElement();
		eObjectProxy.setEObject(eObject);
		eObjectProxy.setParent(parent);
		return eObjectProxy;
	}

	public Object[] getChildren(final Object parentElement) {
		Object[] result;
		if (parentElement == null) {
			result = new Object[0];
		} else if (parentElement instanceof EObjectTreeElement) {
			final EObjectTreeElement eObjectProxy = (EObjectTreeElement) parentElement;
			result = getChildren(eObjectProxy);
		} else if (parentElement instanceof EAttributeTreeElement) {
			final EAttributeTreeElement attributeProxy = (EAttributeTreeElement) parentElement;
			result = getChildren(attributeProxy);
		} else if (parentElement instanceof EReferenceTreeElement) {
			final EReferenceTreeElement referenceProxy = (EReferenceTreeElement) parentElement;
			result = getChildren(referenceProxy);
		} else {
			Logger.logError("Unknown element in tree: " + parentElement.getClass(), Activator.getDefault()); //$NON-NLS-1$
			result = new Object[0];
		}
		return result;
	}

	public Object[] getChildren(final EObjectTreeElement treeElement) {
		Collection<EStructuralFeature> facetFeatures;
		try {
			facetFeatures = FacetUtils.getETypedElements(treeElement.getEObject(), EStructuralFeature.class, customManager.getFacetManager());
		} catch (FacetManagerException e) {
			facetFeatures = Collections.emptyList();
			Logger.logError(e, Activator.getDefault());
		}

		final Collection<Object> children = new ArrayList<Object>();
		createAttributes(treeElement, facetFeatures, children);
		createReferences(treeElement, facetFeatures, children);
		return children.toArray();
	}

	public Object[] getChildren(final EAttributeTreeElement attributeProxy) {
		final List<Object> children = new ArrayList<Object>();
		final EAttribute eAttribute = attributeProxy.getEAttribute();
		if (eAttribute.isMany()) {
			final TreeElement parent = attributeProxy.getParent();
			if (!(parent instanceof EObjectTreeElement)) {
				throw new IllegalStateException("An attribute should appear only under a model element"); //$NON-NLS-1$
			}
			final EObjectTreeElement parentProxy = (EObjectTreeElement) parent;
			final EObject eObject = parentProxy.getEObject();

			try {
				final IFacetManager facetManager = this.customManager.getFacetManager();
				final List<Object> result = facetManager.getOrInvokeMultiValued(eObject, eAttribute, null);
				for (final Object object : result) {
					if (object instanceof EObject) {
						final EObject childEObject = (EObject) object;
						children.add(getEObjectProxy(childEObject, attributeProxy));
					}
					children.add(object);
				}
			} catch (final FacetManagerException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return children.toArray();
	}

	public Object[] getChildren(final EReferenceTreeElement referenceProxy) {
		List<? extends Object> result;
		final EReference eReference = referenceProxy.getEReference();
		final TreeElement parent = referenceProxy.getParent();
		if (!(parent instanceof EObjectTreeElement)) {
			throw new IllegalStateException("A reference should appear only under a model element"); //$NON-NLS-1$
		}
		final EObjectTreeElement parentProxy = (EObjectTreeElement) parent;
		final EObject eObject = parentProxy.getEObject();
		if (eReference.isMany()) {
			result = getMultiValuedReferenceChildren(eReference, eObject, referenceProxy);
		} else {
			final Object child = getSingleValuedReferenceChild(eReference, eObject, referenceProxy);
			if (child == null) {
				result = Collections.emptyList();
			} else {
				result = Collections.singletonList(child);
			}
		}
		return result.toArray();
	}

	private TreeElement getSingleValuedReferenceChild(final EReference eReference,
			final EObject eObject, final EReferenceTreeElement parent) {
		TreeElement child = null;
		if (parent.getReferedEObjectTE() == null || parent.getReferedEObjectTE().size() == 0) {
			try {
				final IFacetManager facetManager = this.customManager
						.getFacetManager();
				final EObject referedEObject = facetManager.getOrInvoke(
						eObject, eReference, EObject.class);
				if (referedEObject != null) {
					child = getEObjectProxy(referedEObject, parent);
				}
			} catch (final FacetManagerException e) {
				Logger.logError(e, Activator.getDefault());
			}
		} else {
			child = parent.getReferedEObjectTE().get(0);
		}
		return child;
	}

	private List<EObjectTreeElement> getMultiValuedReferenceChildren(
			final EReference eReference, final EObject eObject,
			final EReferenceTreeElement parent) {
		List<EObjectTreeElement> children = new ArrayList<EObjectTreeElement>();
		if (parent.getReferedEObjectTE() == null || parent.getReferedEObjectTE().size() == 0) {
			try {
				final IFacetManager facetManager = this.customManager
						.getFacetManager();
				final List<Object> result = facetManager
						.getOrInvokeMultiValued(eObject, eReference, null);
				for (final Object object : result) {
					if (object instanceof EObject) {
						final EObject childEObject = (EObject) object;
						children.add(getEObjectProxy(childEObject, parent));
					}
				}
			} catch (final FacetManagerException e) {
				Logger.logError(e, Activator.getDefault());
			}
		} else {
			children = parent.getReferedEObjectTE();
		}
		return children;
	}

	public Object getParent(final Object element) {
		Object result = null;
		if (element instanceof TreeElement) {
			final TreeElement treeElement = (TreeElement) element;
			result = treeElement.getParent();
		}
		return result;
	}

	public boolean hasChildren(final Object element) {
		return getChildren(element).length > 0;
	}



	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		if (oldInput != newInput) {
			cache.clear();
		}
	}

	public ICustomizationManager getCustomizationManager() {
		return this.customManager;
	}

	public boolean isVisible(final Object object, final ETypedElement eTypedElement) {
		Boolean result = Boolean.TRUE;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			try {
				result = this.customManager.getCustomValueOf(eObject, eTypedElement, this.contentHandler.getIsVisible(), Boolean.class);
			} catch (final CustomizationException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return result.booleanValue();
	}

	private boolean collapseLink(final Object object, final EReference eTypedElement) {
		Boolean result = Boolean.TRUE;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			try {
				result = this.customManager.getCustomValueOf(eObject, eTypedElement, this.contentHandler.getCollapseLink(), Boolean.class);
			} catch (final CustomizationException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return result.booleanValue();
	}



	private void createReferences(final EObjectTreeElement treeElement, Collection<EStructuralFeature> facetFeatures, Collection<Object> children) {
		final EObject eObject = treeElement.getEObject();

		for (EReference next : eObject.eClass().getEAllReferences()) {
			createReference(treeElement, eObject, next, children);
		}
		for (EStructuralFeature next : facetFeatures) {
			if (next instanceof EReference) {
				createReference(treeElement, eObject, (EReference) next, children);
			}
		}
	}

	private void createReference(EObjectTreeElement treeElement, EObject eObject, EReference eReference, Collection<Object> children) {
		if (isVisible(eObject, eReference)) {
			if (collapseLink(eObject, eReference)) {
				if (eReference.getUpperBound() != 1) {
					collectMultiValuedReferenceChildren(eReference, eObject, treeElement, children);
				} else {
					Object child = getSingleValuedReferenceChild(eReference, eObject, treeElement);
					if (child != null) {
						children.add(child);
					}
				}
			} else {
				children.add(getEReferenceProxy(eReference, treeElement));
			}
		}
	}

	private void createAttributes(final EObjectTreeElement treeElement, Collection<EStructuralFeature> facetFeatures, Collection<? super TreeElement> children) {
		final EObject eObject = treeElement.getEObject();

		for (EAttribute next : eObject.eClass().getEAllAttributes()) {
			createAttribute(treeElement, eObject, next, children);
		}
		for (EStructuralFeature next : facetFeatures) {
			if (next instanceof EAttribute) {
				createAttribute(treeElement, eObject, (EAttribute) next, children);
			}
		}
	}

	private void createAttribute(EObjectTreeElement treeElement, EObject eObject, EAttribute eAttribute, Collection<? super TreeElement> children) {
		if (isVisible(eObject, eAttribute)) {
			TreeElement eAttributeTreeElement = getEAttributeProxy(eAttribute, treeElement);
			if (eAttributeTreeElement != null) {
				children.add(eAttributeTreeElement);
			}
		}
	}


	private EReferenceTreeElement createReferenceProxy(final EReference reference, final EObjectTreeElement parent) {
		final EObject eObject = parent.getEObject();
		if (isVisible(eObject, reference)) {
			final EReferenceTreeElement referenceProxy = TreeproxyFactory.eINSTANCE.createEReferenceTreeElement();
			referenceProxy.setEReference(reference);
			referenceProxy.setParent(parent);
			return referenceProxy;
		}
		return null;
	}

	private EAttributeTreeElement createAttributeProxy(final EAttribute attribute, final EObjectTreeElement parent) {
		final EObject eObject = parent.getEObject();
		if (isVisible(eObject, attribute)) {
			final EAttributeTreeElement attributeProxy = TreeproxyFactory.eINSTANCE.createEAttributeTreeElement();
			attributeProxy.setEAttribute(attribute);
			attributeProxy.setParent(parent);
			return attributeProxy;
		}
		return null;
	}

	private Object getSingleValuedReferenceChild(final EReference eReference, final EObject eObject, final TreeElement parent) {
		Object child = null;
		try {
			final IFacetManager facetManager = this.customManager.getFacetManager();
			final Object result = facetManager.getOrInvoke(eObject, eReference, null);
			if (result instanceof EObject) {
				final EObject childEObject = (EObject) result;
				child = getEObjectProxy(childEObject, parent);
			}
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return child;
	}

	private void collectMultiValuedReferenceChildren(final EReference eReference, final EObject eObject, final TreeElement parent, Collection<Object> children) {
		try {
			final IFacetManager facetManager = this.customManager.getFacetManager();
			final List<Object> result = facetManager.getOrInvokeMultiValued(eObject, eReference, null);
			for (final Object object : result) {
				if (object instanceof EObject) {
					final EObject childEObject = (EObject) object;
					children.add(getEObjectProxy(childEObject, parent));
				}
			}
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	protected EObjectTreeElement getEObjectProxy(final Object element, final TreeElement parent) {
		EObjectCacheElement cacheElement = new EObjectCacheElement((EObject) element, parent);
		if (!(cache.containsKey(cacheElement))) {
			cache.put(cacheElement, createEObjectProxy(element, parent));
		}
		return (EObjectTreeElement) cache.get(cacheElement);
	}

	protected EAttributeTreeElement getEAttributeProxy(final Object element, final TreeElement parent) {
		EObjectCacheElement cacheElement = new EObjectCacheElement((EObject) element, parent);
		if (!(cache.containsKey(cacheElement))) {
			cache.put(cacheElement, createAttributeProxy((EAttribute) element, (EObjectTreeElement) parent));
		}
		return (EAttributeTreeElement) cache.get(cacheElement);
	}

	protected EReferenceTreeElement getEReferenceProxy(final Object element, final EObjectTreeElement parent) {
		EObjectCacheElement cacheElement = new EObjectCacheElement((EObject) element, parent);
		if (!(cache.containsKey(cacheElement))) {
			cache.put(cacheElement, createReferenceProxy((EReference) element, parent));
		}
		return (EReferenceTreeElement) cache.get(cacheElement);
	}

	public void dispose() {
		cache.clear();
		rootElements = null;
	}
}