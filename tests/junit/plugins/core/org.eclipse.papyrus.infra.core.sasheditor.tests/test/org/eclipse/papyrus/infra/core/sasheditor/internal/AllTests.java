/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.sasheditor.internal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * All tests for package org.eclipse.papyrus.infra.core.sasheditor.internal
 */
@RunWith(Suite.class)
@SuiteClasses({ SashContainerEventsProviderTest.class, 
	PageLifeCycleEventsThrownFromContainerTest.class, 
	SashWindowsContainerTest.class ,
	SashWindowsContainerDisposeCalledTest.class,
	SashWindowsContainerMemoryLeakTest.class
	})
public class AllTests {

}
