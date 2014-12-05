/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mickael ADAM (ALL4TEC) - mickael.adam@all4tec.net
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.communication.custom.figures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;

/**
 * The Class InteractionRectangleFigure.
 */
public class InteractionRectangleFigure extends RoundedCompartmentFigure {

	/** The Attribute Compartment. */
	private final static String INTERACTION_CONTENT_PANE_COMPARTMENT = "interactionContentPaneCompartment";

	/** The List of Compartment. */
	private final static List<String> COMPARTMENT = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;

		{
			add(INTERACTION_CONTENT_PANE_COMPARTMENT);
		}
	};

	/**
	 * Default Constructor.
	 */
	public InteractionRectangleFigure() {
		this(null);
	}

	/**
	 * Create a new Classifier figure with the given tag.
	 *
	 * @param tagLabel
	 *            a String that will be displayed at the top of the figure
	 */
	public InteractionRectangleFigure(String tagLabel) {
		super(COMPARTMENT, tagLabel);
	}

	/**
	 * Gets the compartment figure.
	 *
	 * @return the interactionContentPane
	 */
	public RectangleFigure getCompartmentFigure() {
		return getCompartment(INTERACTION_CONTENT_PANE_COMPARTMENT);
	}
}
