/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.transformation.ui;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.uml.extensionpoints.IRegisteredItem;
import org.eclipse.swt.graphics.Image;

/**
 * Label Provider for RegisteredItems (Libraries & Profiles)
 *
 * @author Camille Letavernier
 *
 */
public class RegisteredItemLabelProvider extends LabelProvider {
	@Override
	public Image getImage(Object element) {
		if (element instanceof IRegisteredItem) {
			IRegisteredItem library = (IRegisteredItem) element;
			return library.getImage();
		}
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IRegisteredItem) {
			IRegisteredItem library = (IRegisteredItem) element;
			return library.getName();
		}

		return super.getText(element);
	}
}