/**
 * <copyright>
 *
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Radek Dvorak (Borland) - Bugzilla 165458
 *
 * </copyright>
 *
 * $Id: OCLConstraintParser.java,v 1.5 2007/06/06 22:28:11 cdamus Exp $
 */

package org.eclipse.papyrus.dsml.validation.oclpivot;

import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IParameterizedConstraintDescriptor;
import org.eclipse.emf.validation.service.IParameterizedConstraintParser;

/**
 * <p>
 * Simple constraint parser for creation of OCL-language constraints from the XML.
 * </p>
 * <p>
 * This class is not intended to be used by clients of the validation framework.
 * </p>
 * 
 * @author Christian W. Damus (cdamus)
 */
public class OCLConstraintParser implements IParameterizedConstraintParser {

	/**
	 * Initializes me.
	 */
	public OCLConstraintParser() {
		super();
	}

	// implements the inherited method
	public IModelConstraint parseConstraint(
			IParameterizedConstraintDescriptor desc) {
		return new EcoreOCLConstraint(desc);
	}

	/**
	 * A concrete implementation of OCL constraints for the Ecore metamodel.
	 *
	 * @author Christian W. Damus (cdamus)
	 */
	private static class EcoreOCLConstraint extends AbstractOCLModelConstraint {

		EcoreOCLConstraint(IConstraintDescriptor descriptor) {
			super(descriptor);
		}
	}
}
