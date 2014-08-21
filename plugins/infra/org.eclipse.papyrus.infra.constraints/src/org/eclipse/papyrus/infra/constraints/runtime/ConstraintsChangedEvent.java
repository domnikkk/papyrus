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
package org.eclipse.papyrus.infra.constraints.runtime;

import java.util.EventObject;


/**
 * Notification object for the {@linkplain ConstraintEngineListener#constraintsChanged(ConstraintsChangedEvent) constraints-changed event}.
 */
public class ConstraintsChangedEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	/**
	 * Initializes me with my originating constraint engine.
	 *
	 * @param source
	 *            my source
	 */
	public ConstraintsChangedEvent(ConstraintEngine<?> source) {
		super(source);
	}

	/**
	 * Queries the constraint engine that generated this event.
	 *
	 * @return the source constraint engine
	 */
	public ConstraintEngine<?> getConstraintEngine() {
		return (ConstraintEngine<?>) getSource();
	}
}
