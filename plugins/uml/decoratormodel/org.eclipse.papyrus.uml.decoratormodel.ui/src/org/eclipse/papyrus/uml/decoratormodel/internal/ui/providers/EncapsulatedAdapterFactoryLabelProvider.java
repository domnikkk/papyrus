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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * @author damus
 *
 */
public class EncapsulatedAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider {
	public EncapsulatedAdapterFactoryLabelProvider() {
		super(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
	}

	@Override
	public void dispose() {
		try {
			super.dispose();
		} finally {
			((ComposedAdapterFactory) getAdapterFactory()).dispose();
		}
	}

	@Override
	public String getText(Object element) {
		return super.getText(unwrap(element));
	}

	@Override
	public Image getImage(Object element) {
		return super.getImage(unwrap(element));
	}

	Object unwrap(Object element) {
		return element;
	}

	public static ILabelProvider appliedProfiles() {
		return new EncapsulatedAdapterFactoryLabelProvider() {
			@Override
			Object unwrap(Object element) {
				if (element instanceof ProfileApplication) {
					element = ((ProfileApplication) element).getAppliedProfile();
				}
				return element;
			}
		};
	}
}
