/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Devernay (Atos) laurent.devernay@atos.net
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.resourceloading.preferences;

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.papyrus.core.resourceloading.AuthorizedResourceLoadingStrategyExtension;
import org.eclipse.papyrus.preferences.ui.AbstractGroup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class AuthorizedResourceGroup extends AbstractGroup {

	public AuthorizedResourceGroup(Composite parent, String key, DialogPage dialogPage) {
		super(parent, key, dialogPage);
		createContent(parent);
	}

	public void createContent(Composite parent) {
		Group group = new Group(parent, SWT.SCROLL_PAGE);
		group.setLayout(new GridLayout());
		group.setText(Messages.AuthorizedResourceGroup_0);

		ResourcePreferencePathEditor pathEditor = new ResourcePreferencePathEditor(AuthorizedResourceLoadingStrategyExtension.AUTHORIZED_RESOURCES_PREF_ID, Messages.AuthorizedResourceGroup_1, group);

		addFieldEditor(pathEditor);
	}
}
