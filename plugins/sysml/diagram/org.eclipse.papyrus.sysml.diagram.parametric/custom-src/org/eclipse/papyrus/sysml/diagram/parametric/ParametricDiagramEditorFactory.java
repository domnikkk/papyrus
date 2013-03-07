/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.parametric;

import org.eclipse.papyrus.infra.gmfdiag.common.GmfEditorFactory;
import org.eclipse.papyrus.sysml.diagram.parametric.edit.parts.ParametricEditPart;

public class ParametricDiagramEditorFactory extends GmfEditorFactory {

	/**
	 * Instantiates a new use case diagram editor factory.
	 */
	public ParametricDiagramEditorFactory() {
		super(ParametricDiagramForMultiEditor.class, ParametricEditPart.MODEL_ID);
	}
}