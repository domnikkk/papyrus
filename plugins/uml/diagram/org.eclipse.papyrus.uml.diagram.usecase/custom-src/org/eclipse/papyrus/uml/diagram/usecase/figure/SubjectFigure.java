/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.figure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;

/**
 * this figure is the representation of a subject in the usecase diagram
 *
 */
public class SubjectFigure extends RoundedCompartmentFigure {


	private final static String USE_CASES_CONTAINER_COMPARTMENT = "UseCaseContainerCompartment";

	/** The List of Compartment */
	private final static List<String> COMPARTMENT = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;

		{
			add(USE_CASES_CONTAINER_COMPARTMENT);
		}
	};

	/**
	 * Default Constructor
	 */
	public SubjectFigure() {
		this(null);
	}

	/**
	 * Create a new Classifier figure with the given tag
	 *
	 * @param tagLabel
	 *            a String that will be displayed at the top of the figure
	 */
	public SubjectFigure(String tagLabel) {
		super(COMPARTMENT, tagLabel);
	}

	/**
	 * Get the attribute's compartment figure
	 *
	 * @return
	 */
	public IFigure getAttributeCompartmentFigure() {
		return getCompartment(USE_CASES_CONTAINER_COMPARTMENT);
	}

	/**
	 * get the gmf container figure of the package
	 *
	 * @return the gmf container
	 */
	public ShapeCompartmentFigure getGMFExtensionPointContainer() {
		if (getCompartment(USE_CASES_CONTAINER_COMPARTMENT).getChildren().size() > 0) {
			return (ShapeCompartmentFigure) getCompartment(USE_CASES_CONTAINER_COMPARTMENT).getChildren().get(0);
		}
		return null;
	}

	public RectangleFigure getUseCasesContainerFigure() {
		return getCompartment(USE_CASES_CONTAINER_COMPARTMENT);
	}

}
