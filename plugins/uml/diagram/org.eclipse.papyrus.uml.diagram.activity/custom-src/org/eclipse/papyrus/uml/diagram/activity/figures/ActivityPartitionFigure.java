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
 *   Atos Origin - Initial API and implementation
 *	 Arthur Daussy - 372745: [ActivityDiagram] Major refactoring group framework
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.figures;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;

/**
 * Figure an activity partition
 */
public class ActivityPartitionFigure extends RoundedCompartmentFigure {

	private static final String ACTIVITY_CONTENT_COMPARTMENT = "ActivityContentCompartment";

	public ActivityPartitionFigure(List<String> compartmentFigure) {
		super(compartmentFigure);
	}

	public ActivityPartitionFigure() {
		super(Collections.singletonList(ACTIVITY_CONTENT_COMPARTMENT));
		getActivityPartitionCompartment().setBorder(new OneLineBorder(1, PositionConstants.TOP));
	}

	public RectangleFigure getActivityPartitionCompartment() {
		return getCompartment(ACTIVITY_CONTENT_COMPARTMENT);
	}

	public WrappingLabel getPartitionLabel() {
		return getNameLabel();
	}
}
