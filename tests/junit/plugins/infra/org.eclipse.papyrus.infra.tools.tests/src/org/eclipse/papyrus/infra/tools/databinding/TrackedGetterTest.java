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
package org.eclipse.papyrus.infra.tools.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.core.databinding.observable.ObservableTracker;


/**
 * Annotates a test as testing a tracked getter, so the {@code RealmRunner} will check that the test's observable fixture
 * (as indicated by the {@link &#x40;ObservableFixture ObservableFixture} annotation) was reported to the {@link ObservableTracker}.
 *
 * @see ObservableFixture
 * @see RealmRunner
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TrackedGetterTest {
	// Empty annotation
}
