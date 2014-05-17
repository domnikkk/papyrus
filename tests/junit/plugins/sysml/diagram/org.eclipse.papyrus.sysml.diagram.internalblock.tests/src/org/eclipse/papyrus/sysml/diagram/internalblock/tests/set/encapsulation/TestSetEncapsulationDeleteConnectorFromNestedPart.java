/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *  CEA LIST - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434993
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.internalblock.tests.set.encapsulation;

import org.eclipse.gmf.runtime.notation.View;
import org.junit.BeforeClass;

/**
 * JUnit tests for Connector link removal during Block#setIsEncapsulated() test (via palette tools).
 */
public class TestSetEncapsulationDeleteConnectorFromNestedPart extends AbstractSetEncapsulationDeleteConnectorTest {

	@BeforeClass
	public static void init() throws Exception {
		sourceView = nestedPartSourceView;
	}

	@BeforeClass
	public static void initExpectedResults() throws Exception {

		// Initialize source creation results

		isConnectorDestroyed.put(actorPartTargetView, true);
		isConnectorDestroyed.put(nestedActorPartTargetView, false);
		isConnectorDestroyed.put(subNestedActorPartContainer1_1_1TargetView, false);
		isConnectorDestroyed.put(subNestedActorPartContainer1_2_1TargetView, false);
		isConnectorDestroyed.put(subNestedActorPartContainer1_1_2TargetView, true); // goes outside, to partContainer2

		isConnectorDestroyed.put(portOnBlockTargetView, true);
		isConnectorDestroyed.put(portOnPartTargetView, true);
		isConnectorDestroyed.put(portOnNestedPartTargetView, false);

		isConnectorDestroyed.put(flowportOnBlockTargetView, true);
		isConnectorDestroyed.put(flowportOnPartTargetView, true);
		isConnectorDestroyed.put(flowportOnNestedPartTargetView, false);

		isConnectorDestroyed.put(partTargetView, true);
		isConnectorDestroyed.put(nestedPartTargetView, false);
		isConnectorDestroyed.put(subNestedPartContainer1_1_1TargetView, false);
		isConnectorDestroyed.put(subNestedPartContainer1_2_1TargetView, false);
		isConnectorDestroyed.put(subNestedPartContainer1_1_2TargetView, true); // goes outside, to partContainer2

		isConnectorDestroyed.put(propertyTargetView, true);
		isConnectorDestroyed.put(nestedPropertyTargetView, false);
		isConnectorDestroyed.put(subNestedPropertyContainer1_1_1TargetView, false);
		isConnectorDestroyed.put(subNestedPropertyContainer1_2_1TargetView, false);
		isConnectorDestroyed.put(subNestedPropertyContainer1_1_2TargetView, true); // goes outside, to partContainer2

		isConnectorDestroyed.put(referenceTargetView, true);
		isConnectorDestroyed.put(nestedReferenceTargetView, false);
		isConnectorDestroyed.put(subNestedReferenceContainer1_1_1TargetView, false);
		isConnectorDestroyed.put(subNestedReferenceContainer1_2_1TargetView, false);
		isConnectorDestroyed.put(subNestedReferenceContainer1_1_2TargetView, true); // goes outside, to partContainer2

		isConnectorDestroyed.put(valueTargetView, true);
		isConnectorDestroyed.put(nestedValueTargetView, false);
		isConnectorDestroyed.put(subNestedValueContainer1_1_1TargetView, false);
		isConnectorDestroyed.put(subNestedValueContainer1_2_1TargetView, false);
		isConnectorDestroyed.put(subNestedValueContainer1_1_2TargetView, true); // goes outside, to partContainer2
		
		// Initialize connector creation possibility
		for(View view : isConnectorDestroyed.keySet()) {
			isCreationAllowed.put(view, true);
		}

	}

}
