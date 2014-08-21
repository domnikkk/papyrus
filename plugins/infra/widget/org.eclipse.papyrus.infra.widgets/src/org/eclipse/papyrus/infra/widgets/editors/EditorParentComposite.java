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
package org.eclipse.papyrus.infra.widgets.editors;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;


/**
 * The top parent composite for the assembly of tabbed property sheet pages based on the XWT properties model.
 * Amongst other possible services, this composite works around problems in focus management on some platforms.
 */
public class EditorParentComposite extends Composite {

	public EditorParentComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public boolean setFocus() {
		Control focusVetoControl = AbstractEditor.FocusVeto.getFocusVetoControl(this);

		if (focusVetoControl != null) {
			// Don't let me or another control within me take focus
			return false;
		}

		return super.setFocus();
	}
}
