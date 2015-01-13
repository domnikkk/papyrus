/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.providers;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;

/**
 * A label provider that delegates to some other label provider with the
 * possibility of overriding certain labels.
 */
public class DelegatingLabelProvider
		extends LabelProvider {

	private final ILabelProvider delegate;
	private ILabelProviderListener forwardingListener;

	public DelegatingLabelProvider(ILabelProvider delegate) {
		super();

		this.delegate = delegate;

		delegate.addListener(getForwardingListener());
	}

	@Override
	public Image getImage(Object element) {
		Image result = customGetImage(element);
		if (result == null) {
			result = delegatedGetImage(element);
		}
		return result;
	}

	/**
	 * Overridden in subclasses to provide custom images for certain {@code element}s.
	 *
	 * @param element
	 *            an element
	 * @return the custom image, or {@code null} to delegate
	 */
	protected Image customGetImage(Object element) {
		return null;
	}

	protected Image delegatedGetImage(Object element) {
		return delegate.getImage(element);
	}

	@Override
	public String getText(Object element) {
		String result = customGetText(element);
		if (result == null) {
			result = delegatedGetText(element);
		}
		return result;
	}

	/**
	 * Overridden in subclasses to provide custom text for certain {@code element}s.
	 *
	 * @param element
	 *            an element
	 * @return the custom text, or {@code null} to delegate
	 */
	protected String customGetText(Object element) {
		return null;
	}

	protected String delegatedGetText(Object element) {
		return delegate.getText(element);
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return delegate.isLabelProperty(element, property);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		delegate.addListener(listener);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		delegate.removeListener(listener);
	}

	/**
	 * Disposes my delegate.
	 */
	@Override
	public void dispose() {
		delegate.removeListener(getForwardingListener());
		delegate.dispose();
	}

	private ILabelProviderListener getForwardingListener() {
		if (forwardingListener == null) {
			forwardingListener = new ILabelProviderListener() {

				@Override
				public void labelProviderChanged(LabelProviderChangedEvent event) {
					fireLabelProviderChanged(new LabelProviderChangedEvent(DelegatingLabelProvider.this, event.getElements()));
				}
			};
		}

		return forwardingListener;
	}
}
