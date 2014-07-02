/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * (CEA LIST) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.diagram.tests.appearance;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase;
import org.eclipse.swt.widgets.Display;


public abstract class AppearanceElementTest {
	
	/**
	 * Call {@link AbstractPapyrusTestCase#execute(Command) execute} on the UI
	 * thread.
	 */
	protected void executeOnUIThread(final Command command) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				execute(command);
			}
		});
	}
	
	
	
	/** Execute the given command in the diagram editor. */
	protected void execute(final Command command) {
		getCommandStack().execute(new GEFtoEMFCommandWrapper(command));
	}



	abstract CommandStack getCommandStack(); 
	abstract void testAppearance(IElementType type);
	abstract GraphicalEditPart getContainerEditPart();

}
