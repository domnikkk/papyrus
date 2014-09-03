/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Céline Janssens (ALL4TEC) celine.janssens@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.common.figure;

import org.eclipse.draw2d.IFigure;

/**
 * @author Céline JANSSENS
 * Bug 440230
 * This interface is dedicated to PapyrusWrappingLabel abstract methods. 
 * 
 */
public interface IPapyrusWrappingLabel extends IFigure {
	
	/**
	 * Set the margin of the Label in the horizontal direction and vertical Direction
	 * @param xMargin Horizontal Margin
	 * @param yMargin Vertical Margin
	 * 
	 */
	void setMarginLabel(int xMargin , int yMargin);

}
