/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.properties.util;

import java.util.Collection;
import java.util.Set;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.constraints.runtime.ConstraintEngine;
import org.eclipse.papyrus.views.properties.contexts.View;
import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;
import org.eclipse.papyrus.views.properties.runtime.DisplayEngine;
import org.eclipse.papyrus.views.properties.runtime.EmbeddedDisplayEngine;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * Helper class for displaying an embedded Properties View for
 * a selection in a specific composite
 *
 *
 * @author Camille Letavernier
 *
 */
public class PropertiesDisplayHelper {

	/**
	 * Displays the properties view associated to the selection in the given Composite
	 *
	 * @param selection
	 * @param parent
	 *
	 * @return The display engine used to build the view. Must be disposed by caller
	 */
	public static DisplayEngine display(Object selection, Composite parent) {
		return display(getDefaultConstraintEngine(), buildSelection(selection), parent);
	}

	/**
	 * Displays the properties view associated to the selection in the given Composite
	 *
	 * @param selection
	 * @param parent
	 *
	 * @return The display engine used to build the view. Must be disposed by caller
	 */
	public static DisplayEngine display(Collection<?> selection, Composite parent) {
		return display(getDefaultConstraintEngine(), buildSelection(selection), parent);
	}

	/**
	 * Displays the properties view associated to the selection in the given Composite
	 *
	 * The views are computed based on the given ConstraintEngine
	 *
	 * @param selection
	 * @param parent
	 * @param constraints
	 *
	 * @return The display engine used to build the view. Must be disposed by caller
	 */
	public static DisplayEngine display(ConstraintEngine<? extends View> constraints, Object selection, Composite parent) {
		return display(constraints, buildSelection(selection), parent);
	}

	/**
	 * Displays the properties view associated to the selection in the given Composite
	 *
	 * The views are computed based on the given ConstraintEngine
	 *
	 * @param selection
	 * @param parent
	 * @param constraints
	 *
	 * @return The display engine used to build the view. Must be disposed by caller
	 */
	public static DisplayEngine display(ConstraintEngine<? extends View> constraints, Collection<?> selection, Composite parent) {
		return display(constraints, buildSelection(selection), parent);
	}

	/**
	 * Displays the properties view associated to the selection in the given Composite
	 *
	 * The views are computed based on the given ConstraintEngine
	 *
	 * @param selection
	 * @param parent
	 * @param constraints
	 *
	 * @return The display engine used to build the view. Must be disposed by caller
	 */
	public static DisplayEngine display(ConstraintEngine<? extends View> constraints, ISelection selection, Composite parent) {
		EmbeddedDisplayEngine display = new EmbeddedDisplayEngine();

		Set<? extends View> views = constraints.getDisplayUnits(selection);

		// Composite self = new Composite(parent, SWT.BORDER);
		// self.setLayout(new GridLayout(1, false));

		display.display(views, parent, selection, SWT.NONE);

		return display;
	}

	/**
	 * Returns the default Properties View Constraint Engine
	 * Equivalent to ConfigurationManager.getInstance().getConstraintEngine()
	 *
	 * @return
	 *
	 * @see {@link ConfigurationManager#getConstraintEngine()}
	 */
	public static ConstraintEngine<? extends View> getDefaultConstraintEngine() {
		return ConfigurationManager.getInstance().getConstraintEngine();
	}

	private static IStructuredSelection buildSelection(Collection<?> elements) {
		return new StructuredSelection(elements);
	}

	private static IStructuredSelection buildSelection(Object element) {
		return new StructuredSelection(element);
	}

}
