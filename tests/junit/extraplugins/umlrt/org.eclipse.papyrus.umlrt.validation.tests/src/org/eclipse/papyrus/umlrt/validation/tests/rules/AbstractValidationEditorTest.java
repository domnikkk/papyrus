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
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.umlrt.validation.tests.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;


/**
 *Abstract test for validation rules
 */
public abstract class AbstractValidationEditorTest extends AbstractEditorTest {

	public static final String VALIDATE_COMMAND_ID = "org.eclipse.papyrus.validation.ValidateModelCommand"; //$NON-NLS-1$	
	
	
	/**
	 *  find diagnostic by source 
	 *  (Should be unique per element if the source is correctly defined)
	 */
	public List<Diagnostic> findDiagnosticBySource(Diagnostic diagnostic, String source) {
		List<Diagnostic> foundDiagnostic = new ArrayList<Diagnostic>();
		List<Diagnostic> children = diagnostic.getChildren();
		if (source.equals(diagnostic.getSource())){
			foundDiagnostic.add(diagnostic);
		}
		if (children != null && !children.isEmpty()){
			for(Diagnostic diagnostic2 : children) {
				foundDiagnostic.addAll(findDiagnosticBySource(diagnostic2, source));
			}
		}
		return foundDiagnostic;
	}
	
}
