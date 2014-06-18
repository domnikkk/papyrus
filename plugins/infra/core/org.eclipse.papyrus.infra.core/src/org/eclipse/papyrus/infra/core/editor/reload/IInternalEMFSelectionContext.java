/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.core.editor.reload;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;


/**
 * An internal interface provided (usually as an {@linkplain IAdaptable#getAdapter(Class) adapter}) by EMF-based {@linkplain SelectionContext
 * selection contexts}.
 */
interface IInternalEMFSelectionContext {

	void setResourceSetSupplier(Supplier<? extends ResourceSet> resourceSetSupplier);

	URI getToken(Object object);

	Object resolveToken(URI token);

	class Default implements IInternalEMFSelectionContext {

		Supplier<? extends ResourceSet> resourceSetSupplier;

		Default() {
			super();
		}

		public void setResourceSetSupplier(Supplier<? extends ResourceSet> resourceSetSupplier) {
			this.resourceSetSupplier = Suppliers.memoize(resourceSetSupplier);
		}

		public URI getToken(Object object) {
			return (object instanceof EObject) ? EcoreUtil.getURI((EObject)object) : null;
		}

		public Object resolveToken(URI token) {
			ResourceSet rset = (resourceSetSupplier == null) ? null : resourceSetSupplier.get();
			return (rset == null) ? null : rset.getEObject(token, true);
		}

	}

	class Composite extends Default {

		private final CompositeReloadContext composite;

		Composite(CompositeReloadContext composite) {
			super();

			this.composite = composite;
		}

		@Override
		public void setResourceSetSupplier(Supplier<? extends ResourceSet> resourceSetSupplier) {
			super.setResourceSetSupplier(resourceSetSupplier);

			for(Object next : composite.getReloadContexts()) {
				IInternalEMFSelectionContext emfContext = AdapterUtils.adapt(next, IInternalEMFSelectionContext.class, null);
				if(emfContext != null) {
					// Pass along the memoizer so that we can all share it
					emfContext.setResourceSetSupplier(this.resourceSetSupplier);
				}
			}
		}
	}

	class Delegating extends Default {

		private final DelegatingReloadContext delegating;

		Delegating(DelegatingReloadContext delegating) {
			super();

			this.delegating = delegating;
		}

		@Override
		public void setResourceSetSupplier(Supplier<? extends ResourceSet> resourceSetSupplier) {
			super.setResourceSetSupplier(resourceSetSupplier);

			IInternalEMFSelectionContext emfContext = AdapterUtils.adapt(delegating.getDelegate(), IInternalEMFSelectionContext.class, null);
			if(emfContext != null) {
				// Pass along the memoizer so that we can all share it
				emfContext.setResourceSetSupplier(this.resourceSetSupplier);
			}
		}
	}
}
