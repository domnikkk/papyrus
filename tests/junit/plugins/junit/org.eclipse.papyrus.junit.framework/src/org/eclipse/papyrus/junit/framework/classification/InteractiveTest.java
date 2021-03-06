/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.junit.framework.classification;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a test is interactive, e.g. it opens a user dialog. Such tests cannot be run
 * automatically and should be disabled on Hudson
 *
 * This annotation must be used with the {@link ClassificationRule}
 *
 * @author Camille Letavernier
 *
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface InteractiveTest {

	/**
	 * A specific message explaining why this test is failing
	 *
	 * @return
	 */
	String value() default "";
}
