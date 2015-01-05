/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.moka.dummyexample;

import org.eclipse.papyrus.moka.debug.MokaDebugTarget;
import org.eclipse.papyrus.moka.debug.MokaStackFrame;

public class PresentationUtils {

	public static MokaStackFrame getMokaStackFrame(DummyVisitor visitor) {
		MokaStackFrame stackFrame = new MokaStackFrame((MokaDebugTarget)visitor.thread.getDebugTarget()) ;
		stackFrame.setModelElement(visitor.currentlyVisited) ;
		stackFrame.setThread(visitor.thread) ;
		stackFrame.setName(visitor.currentlyVisited.getName()) ;
		return stackFrame;
	}
	
}
