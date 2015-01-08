/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus - bug 454536
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.operation;

import org.eclipse.core.commands.operations.IUndoContext;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/**
 * An undo context that dynamically delegates to another.
 * Use this with caution: it is important that the semantics of an undo context
 * not change in incompatible ways over time.
 */
public class DelegatingUndoContext implements IUndoContext {

	private IUndoContext delegate;

	/**
	 * Initializes me.
	 */
	public DelegatingUndoContext() {
		super();
	}

	@Override
	public String getLabel() {
		IUndoContext delegate = getDelegate();
		return (delegate == null) ? "" : delegate.getLabel();
	}

	@Override
	public boolean matches(IUndoContext context) {
		IUndoContext delegate = getDelegate();
		return (delegate == null) ? false : delegate.matches(context);
	}

	public void setDelegate(IUndoContext delegate) {
		this.delegate = delegate;
	}

	public IUndoContext getDelegate() {
		return delegate;
	}

	//
	// Nested types
	//

	/**
	 * A specialized delegating undo context that dynamically computes its delegate.
	 */
	public static class Dynamic extends DelegatingUndoContext {
		private Supplier<IUndoContext> delegateSupplier;

		/**
		 * Initializes me with a supplier that dynamically determines my undo-context delegate.
		 *
		 * @param delegateSupplier
		 *            my dynamic delegate supplier
		 */
		public Dynamic(Supplier<IUndoContext> delegateSupplier) {
			super();

			this.delegateSupplier = delegateSupplier;
		}

		@Override
		public IUndoContext getDelegate() {
			return delegateSupplier.get();
		}

		@Override
		public void setDelegate(IUndoContext delegate) {
			delegateSupplier = Suppliers.ofInstance(delegate);
		}
	}
}