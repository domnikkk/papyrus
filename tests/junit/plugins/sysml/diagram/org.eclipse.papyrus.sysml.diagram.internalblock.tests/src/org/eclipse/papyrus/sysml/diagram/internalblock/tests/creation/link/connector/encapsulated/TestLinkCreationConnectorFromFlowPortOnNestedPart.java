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
package org.eclipse.papyrus.sysml.diagram.internalblock.tests.creation.link.connector.encapsulated;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Property;
import org.junit.BeforeClass;

/**
 * JUnit tests for Connector link creation test (via palette tools).
 */
public class TestLinkCreationConnectorFromFlowPortOnNestedPart extends AbstractLinkCreationFromElementTest {

	@BeforeClass
	public static void initSource() throws Exception {
		sourceView = flowportOnNestedPartSourceView;
	}

	@BeforeClass
	public static void initToolID() throws Exception {
		toolID = "internalblock.tool.connector";
	}

	@BeforeClass
	public static void initExpectedResults() throws Exception {

		// Initialize source creation results

		isCreationAllowed.put(blockTargetView, false);

		isCreationAllowed.put(actorPartTargetView, false);
		isCreationAllowed.put(nestedActorPartTargetView, true);

		isCreationAllowed.put(portOnBlockTargetView, false);
		isCreationAllowed.put(portOnPartTargetView, false);
		isCreationAllowed.put(portOnNestedPartTargetView, true);

		isCreationAllowed.put(flowportOnBlockTargetView, false);
		isCreationAllowed.put(flowportOnPartTargetView, false);
		isCreationAllowed.put(flowportOnNestedPartTargetView, true);

		isCreationAllowed.put(partTargetView, false);
		isCreationAllowed.put(nestedPartTargetView, true);
		isCreationAllowed.put(subNestedPartContainer1_1_1TargetView, true);
		isCreationAllowed.put(subNestedPartContainer1_2_1TargetView, false);
		isCreationAllowed.put(subNestedPartContainer1_1_2TargetView, false);

		isCreationAllowed.put(propertyTargetView, false);
		isCreationAllowed.put(nestedPropertyTargetView, true);

		isCreationAllowed.put(referenceTargetView, false);
		isCreationAllowed.put(nestedReferenceTargetView, true);

		isCreationAllowed.put(valueTargetView, false);
		isCreationAllowed.put(nestedValueTargetView, true);

		isCreationAllowed.put(commentTargetView, false);
		isCreationAllowed.put(commentCNTargetView, false);
		isCreationAllowed.put(constraintTargetView, false);
		isCreationAllowed.put(constraintCNTargetView, false);

		// Initialize nested property path for tests
		List<Property> emptyPath = Collections.emptyList();


		for(View view : isCreationAllowed.keySet()) {
			expectedSourceNestedPath.put(view, emptyPath);
			expectedTargetNestedPath.put(view, emptyPath);
		}
	}

}
