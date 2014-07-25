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
package org.eclipse.papyrus.junit.matchers;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;


/**
 * Hamcrest matchers for assertions on GMF diagrams.
 */
public class DiagramMatchers {

	private DiagramMatchers() {
		super();
	}

	/**
	 * Match an edit part that is selected in its viewer.
	 */
	public static Matcher<EditPart> editPartSelected() {
		return EditPartSelected.INSTANCE;
	}

	/**
	 * Match a drawer that is expanded in the specified {@code viewer}.
	 */
	public static Matcher<PaletteDrawer> expandedIn(PaletteViewer viewer) {
		return new DrawerExpansion(viewer, true);
	}

	/**
	 * Match a drawer that is collapsed (closed) in the specified {@code viewer}.
	 */
	public static Matcher<PaletteDrawer> collapsedIn(PaletteViewer viewer) {
		return new DrawerExpansion(viewer, false);
	}

	//
	// Nested types
	//

	static class EditPartSelected extends BaseMatcher<EditPart> {

		private static final EditPartSelected INSTANCE = new EditPartSelected();

		private EditPartSelected() {
			super();
		}

		public void describeTo(Description description) {
			description.appendText("edit-part is selected");
		}

		public boolean matches(Object item) {
			return (item instanceof EditPart) && isSelected((EditPart)item);
		}

		boolean isSelected(EditPart editPart) {
			EditPartViewer viewer = editPart.getViewer();
			return (viewer != null) && viewer.getSelectedEditParts().contains(editPart);
		}
	}

	static class DrawerExpansion extends BaseMatcher<PaletteDrawer> {

		private final PaletteViewer viewer;

		private final boolean expanded;

		DrawerExpansion(PaletteViewer viewer, boolean expanded) {
			this.viewer = viewer;
			this.expanded = expanded;
		}

		public void describeTo(Description description) {
			description.appendText("drawer is ");
			description.appendText(expanded ? "expanded" : "collapsed");
		}

		public boolean matches(Object item) {
			return (item instanceof PaletteDrawer) && (isExpanded((PaletteDrawer)item) == expanded);
		}

		boolean isExpanded(PaletteDrawer drawer) {
			return viewer.isExpanded(drawer);
		}
	}
}
