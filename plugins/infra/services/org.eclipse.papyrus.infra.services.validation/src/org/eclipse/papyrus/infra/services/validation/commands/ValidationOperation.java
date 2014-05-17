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
package org.eclipse.papyrus.infra.services.validation.commands;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.operation.ModalContext;


/**
 * A disposable validation operation. The purpose of disposing it is to ensure that this validation operation, if it runs in a
 * {@linkplain ModalContext modal context thread} and that thread is the one that first Guice-injects state into Xtext's {code CompositeEValidator} in
 * the static {@link EValidator.Registry} instance, that it will not end up leaking whatever was the (potentially very large) UML model that it
 * validated.
 */
class ValidationOperation implements IRunnableWithProgress, IDisposable {

	private AbstractValidateCommand validateCommand;

	private EObject elementToValidate;

	private Diagnostic diagnostics = Diagnostic.OK_INSTANCE;

	ValidationOperation(EObject elementToValidate, AbstractValidateCommand validateCommand) {
		this.validateCommand = validateCommand;
		this.elementToValidate = elementToValidate;
	}

	public void dispose() {
		diagnostics = null;
		validateCommand = null;
		elementToValidate = null;
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor);

		try {
			diagnostics = validateCommand.validate(subMonitor, elementToValidate);
		} finally {
			subMonitor.done();
		}
	}

	Diagnostic getDiagnostics() {
		return diagnostics;
	}
}
