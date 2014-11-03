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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui;

import org.eclipse.ui.IStartup;

/**
 * Early start-up hook for the externalized profile applications subsystem.
 */
public class Startup implements IStartup {

	public Startup() {
		super();
	}

	@Override
	public void earlyStartup() {
		// Kick the index
		Activator.getDefault();
	}
}
