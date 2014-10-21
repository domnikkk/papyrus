/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.operation;

import org.eclipse.core.commands.operations.IUndoContext;

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
		return (delegate == null) ? "" : delegate.getLabel();
	}

	@Override
	public boolean matches(IUndoContext context) {
		return (delegate == null) ? false : delegate.matches(context);
	}

	public void setDelegate(IUndoContext delegate) {
		this.delegate = delegate;
	}

	public IUndoContext getDelegate() {
		return delegate;
	}
}