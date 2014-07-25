/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.rules;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.e4.ui.workbench.modeling.EModelService;


/**
 * An annotation on tests using the {@link PapyrusEditorFixture} that need the palette view to be open before initializing the
 * test (which generally entails opening one or more editors).
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ShowView {

	/** The IDs of the views to show before the editor is opened. */
	String[] value();

	/**
	 * The IDs of workbench parts relative to which the views specified by the annotation are to be shown. If unspecified,
	 * the default is the workbench's editor area. If exactly part ID is specified, it is used for all views. Otherwise, a
	 * corresponding value is required for each view ID to be shown.
	 */
	String[] relativeTo() default {};

	/**
	 * The relative locations of the views to show. If unspecified, the default is {@link Location#STACKED} when the {@linkplain #relativeTo()
	 * relative part} is a view, otherwise {@link Location#RIGHT} when the relative part is the editor area.
	 * If exactly one value is specified, it is used for all views. Otherwise, a corresponding value is
	 * required for each view ID.
	 */
	Location[] location() default {};

	/**
	 * Enumeration of locations in which to open a view relative to some other workbench part.
	 */
	enum Location {
		/** Stacked with the relative part. */
		STACKED(-1),
		/** To the left of the relative part. */
		LEFT(EModelService.LEFT_OF),
		/** To the right of the relative part. */
		RIGHT(EModelService.RIGHT_OF),
		/** Above the relative part. */
		ABOVE(EModelService.ABOVE),
		/** Below the relative part. */
		BELOW(EModelService.BELOW);

		private final int modelServiceLocation;

		private Location(int modelServiceLocation) {
			this.modelServiceLocation = modelServiceLocation;
		}

		public int toModelServiceLocation() {
			return modelServiceLocation;
		}
	}
}
