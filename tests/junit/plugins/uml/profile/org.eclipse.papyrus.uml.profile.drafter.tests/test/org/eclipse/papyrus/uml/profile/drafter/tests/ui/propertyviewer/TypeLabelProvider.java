/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer;

import org.eclipse.jface.viewers.LabelProvider;


/**
 * @author cedric dumoulin
 *
 */
public class TypeLabelProvider extends LabelProvider {

	
	@Override
	public String getText(Object element) {
		if(element instanceof Type) {
			return ((Type)element).getName();
		}
		
		return super.getText(element);
	}
}
