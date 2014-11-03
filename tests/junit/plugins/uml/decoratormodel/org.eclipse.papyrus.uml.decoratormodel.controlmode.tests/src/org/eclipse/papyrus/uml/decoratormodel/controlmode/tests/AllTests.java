/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.decoratormodel.controlmode.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Main tests suite for this plugin
 */
@RunWith(Suite.class)
@SuiteClasses({
		ControlModeWithDecoratorModelsTest.class, AdditionalModelStructuresTest.class
})
public class AllTests {
	// Test suite
}
