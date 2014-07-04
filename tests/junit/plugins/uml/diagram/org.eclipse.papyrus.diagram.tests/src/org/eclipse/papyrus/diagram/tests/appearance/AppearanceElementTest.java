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

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase;


public abstract class AppearanceElementTest  extends AbstractPapyrusTestCase{
	
	
	public abstract void testAppearance(IElementType type);
	public abstract GraphicalEditPart getContainerEditPart();
	
	

}
