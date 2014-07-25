/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi2dg;

import java.awt.Color;

import org.eclipse.papyrus.dd.dc.DCFactory;
import org.eclipse.papyrus.dd.dc.DCPackage;

/**
 * A utility library of black-box operations used in the umldi2dg QVTO
 * transformation
 */
public class UtilitiesLibrary {

	public UtilitiesLibrary() {
		super();
	}

	public Color createColor(String colorStr) {
		return (Color) DCFactory.eINSTANCE.createFromString(
				DCPackage.eINSTANCE.getColor(), colorStr);
	}

}
