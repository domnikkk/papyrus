/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.resource.index;

import java.util.EventObject;

import org.eclipse.core.resources.IProject;

/**
 * Event object notifying {@link IWorkspaceModelIndexListener}s of changes in the index.
 */
public class WorkspaceModelIndexEvent extends EventObject {

	/** Event type indicating that the index is about to be re-calculated for some project based on changes in that project. */
	public static final int ABOUT_TO_RECALCULATE = 0;

	/** Event type indicating that the index has finished re-calculating for some project based on changes in that project. */
	public static final int RECALCULATED = 1;

	/** Event type indicating that the index is about to be fully calculated for some project. */
	public static final int ABOUT_TO_CALCULATE = 2;

	/** Event type indicating that the index has finished a full calculation for some project. */
	public static final int CALCULATED = 3;

	/** Event type indicating that the index (re-)calculation was interrupted or otherwise failed and the index is now out of sync for some project. */
	public static final int FAILED = 4;


	private static final long serialVersionUID = 1L;

	private final int eventType;

	private final IProject project;

	/**
	 * Initializes me.
	 *
	 * @param source
	 *            the index that has changed
	 * @param eventType
	 *            the kind of change
	 * @param project
	 *            the project for which the index changed
	 */
	public WorkspaceModelIndexEvent(WorkspaceModelIndex<?> source, int eventType, IProject project) {
		super(source);

		this.eventType = eventType;
		this.project = project;
	}

	@Override
	public WorkspaceModelIndex<?> getSource() {
		return (WorkspaceModelIndex<?>) super.getSource();
	}

	public int getEventType() {
		return eventType;
	}

	public IProject getProject() {
		return project;
	}
}
