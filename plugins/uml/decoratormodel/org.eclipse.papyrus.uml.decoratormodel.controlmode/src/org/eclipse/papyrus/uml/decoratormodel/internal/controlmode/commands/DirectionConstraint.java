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

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.commands;

/**
 * An enumeration of constraints on the direction in which a command will run.
 * This allows a pair of commands to run, on in the pre position and one in post,
 * that share refactoring steps such that one runs the forward refactoring in the
 * post position and the other the reverse refactoring in the pre position.
 */
public enum DirectionConstraint {
	ALL, REFACTOR_ONLY, UNREFACTOR_ONLY;

	public boolean canRefactor() {
		return this != UNREFACTOR_ONLY;
	}

	public boolean canUnrefactor() {
		return this != REFACTOR_ONLY;
	}
}
