/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Olivier Mélois (Atos) olivier.melois@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.preferences.ui;

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.papyrus.preferences.Messages;
import org.eclipse.papyrus.preferences.utils.PreferenceConstantHelper;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * The Class NodeNameGroup specialized at the level diagram
 */
public class NodeNameGroup extends AbstractGroup {

	public NodeNameGroup(Composite parent, String key, DialogPage dialogPage) {
		super(parent, key, dialogPage);
		createContent(parent);
	}

	public void createContent(Composite parent) {
		Group group = new Group(parent, 2);
		group.setLayout(new GridLayout());
		group.setText(Messages.NodeNameMaximumLengthGroupName);

		IntegerFieldEditor integerFieldEditor = new IntegerFieldEditor(getPreferenceConstant(PreferenceConstantHelper.NODE_LABEL_MAXIMUM_WIDTH), Messages.NodeNameMaximumLength, group);
		addFieldEditor(integerFieldEditor);
		integerFieldEditor.setPage(dialogPage);
	}

	protected String getPreferenceConstant(int preferenceType) {
		return PreferenceConstantHelper.getPapyrusEditorConstant(preferenceType);
	}
}
