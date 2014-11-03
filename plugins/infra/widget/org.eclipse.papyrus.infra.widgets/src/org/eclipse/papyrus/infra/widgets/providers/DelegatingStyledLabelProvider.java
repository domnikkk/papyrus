/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.widgets.providers;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;

/**
 * A styled label provider that delegates to another styled label provider with the option to override certain labels.
 */
public class DelegatingStyledLabelProvider extends DelegatingLabelProvider implements IStyledLabelProvider {

	private final IStyledLabelProvider delegate;

	public DelegatingStyledLabelProvider(ILabelProvider delegate) {
		super(delegate);

		if (!(delegate instanceof IStyledLabelProvider)) {
			throw new IllegalArgumentException("delegate is not a styled label provider"); //$NON-NLS-1$
		}

		this.delegate = (IStyledLabelProvider) delegate;
	}

	@Override
	public StyledString getStyledText(Object element) {
		StyledString result = customGetStyledText(element);
		if (result == null) {
			result = delegatedGetStyledText(element);
		}
		return result;
	}

	/**
	 * Override in subclasses to return custom styled text to override the delegate.
	 * The default implementation simply returns {@code null}.
	 * 
	 * @param element
	 *            an element for which to provide styled text
	 * @return the custom styled text, or {@code null} to delegate
	 */
	protected StyledString customGetStyledText(Object element) {
		return null;
	}

	protected final StyledString delegatedGetStyledText(Object element) {
		return delegate.getStyledText(element);
	}
}
