/*******************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Cadavid <juan.cadavid@cea.fr> implementation
 ******************************************************************************/
package org.eclipse.papyrus.infra.services.controlmode.tests;

import org.eclipse.papyrus.infra.services.controlmode.tests.control.ControlModelTest;
import org.eclipse.papyrus.infra.services.controlmode.tests.control.ControlModelWithProfileTest;
import org.eclipse.papyrus.infra.services.controlmode.tests.uncontrol.UncontrolModelTest;
import org.eclipse.papyrus.infra.services.controlmode.tests.uncontrol.UncontrolModelWithProfileTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ControlModelWithProfileTest.class, 
	UncontrolModelTest.class, 
	ControlModelTest.class, 
	UncontrolModelWithProfileTest.class })
public class AllTests {

}
