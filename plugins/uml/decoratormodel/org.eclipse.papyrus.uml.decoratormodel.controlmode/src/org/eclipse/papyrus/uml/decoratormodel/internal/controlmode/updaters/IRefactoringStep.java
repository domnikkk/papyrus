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

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;



/**
 * Protocol of a step in a sequence of decorator-model resource refactoring steps.
 */
public interface IRefactoringStep {

	boolean refactor(Resource resource, IProgressMonitor monitor) throws ExecutionException;

	boolean unrefactor(Resource resource, IProgressMonitor monitor) throws ExecutionException;

}