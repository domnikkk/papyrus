/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.widgets.editors;

import org.eclipse.papyrus.widgets.selectors.BooleanSelector;
import org.eclipse.swt.widgets.Composite;

/**
 * @see MultipleIntegerEditor
 * 
 * @author omelois
 * 
 */
public class MultipleBooleanEditor extends MultipleStringEditor {

	public MultipleBooleanEditor(Composite parent, int style) {
		super(parent, style, new BooleanSelector());
	}

	public MultipleBooleanEditor(Composite parent, int style, String label) {
		super(parent, style, new BooleanSelector(), label);
	}

	public MultipleBooleanEditor(Composite parent, int style, boolean ordered, boolean unique, String label) {
		super(parent, style, new BooleanSelector(), ordered, unique, label);
	}

}
