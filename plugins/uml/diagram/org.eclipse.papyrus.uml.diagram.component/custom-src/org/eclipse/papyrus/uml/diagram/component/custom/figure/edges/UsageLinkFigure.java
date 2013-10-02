/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.custom.figure.edges;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.papyrus.uml.diagram.common.figure.edge.DashedEdgeFigure;

/**this class has to option to display it:
* normal with the UML view or as a link to display lollipop 
**/
public class UsageLinkFigure extends DashedEdgeFigure{
	
	
	private final int[] dashes = new int[10];
	
	public void displayAsAlink(){
		setArrow(false);
		this.setLineStyle(Graphics.LINE_SOLID);
		
	}
	
	public void displayAsUMLShape(){
		this.setLineStyle(Graphics.LINE_CUSTOM);
		setArrow(true);
		
	}
}
