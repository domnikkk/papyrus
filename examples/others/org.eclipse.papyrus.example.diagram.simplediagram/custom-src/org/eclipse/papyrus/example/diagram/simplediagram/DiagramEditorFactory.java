/*****************************************************************************
 * Copyright (c) 2014 CEA LIST & other.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Bug 445097
 *****************************************************************************/
package org.eclipse.papyrus.example.diagram.simplediagram;

import org.eclipse.papyrus.example.diagram.simplediagram.edit.parts.ModelEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.GmfEditorFactory;

public class DiagramEditorFactory extends GmfEditorFactory {

	/**
	 * @param diagramClass
	 * @param expectedType
	 */
	public DiagramEditorFactory() {
		super(UmlDiagramForMultiEditor.class, ModelEditPart.MODEL_ID);
	}
	

}
