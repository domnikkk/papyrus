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
package org.eclipse.papyrus.sysml.diagram.internalblock.tests.creation.link.dependency;

import org.eclipse.papyrus.sysml.diagram.internalblock.tests.creation.link.AbstractLinkCreationFromElementTest;
import org.junit.BeforeClass;

/**
 * JUnit tests for Dependency link creation test (via palette tools).
 */
public class TestLinkCreationDependencyFromConstraint extends AbstractLinkCreationFromElementTest {
	
	@BeforeClass
	public static void initSource() throws Exception {
		sourceView = constraintSourceView;
	}	
	
	@BeforeClass
	public static void initToolID() throws Exception {
		toolID = "internalblock.tool.dependency";
	}	
	
	@BeforeClass
	public static void initExpectedResults() throws Exception {
		
		// Initialize source creation results

		isCreationAllowed.put(blockTargetView, true);

		isCreationAllowed.put(actorPartTargetView, true);
		isCreationAllowed.put(nestedActorPartTargetView, true);
		
		isCreationAllowed.put(portOnBlockTargetView, true);
		isCreationAllowed.put(portOnPartTargetView, true);
		isCreationAllowed.put(portOnNestedPartTargetView, true);
		
		isCreationAllowed.put(flowportOnBlockTargetView, true);
		isCreationAllowed.put(flowportOnPartTargetView, true);
		isCreationAllowed.put(flowportOnNestedPartTargetView, true);
		
		isCreationAllowed.put(partTargetView, true);
		isCreationAllowed.put(nestedPartTargetView, true);
		
		isCreationAllowed.put(propertyTargetView, true);
		isCreationAllowed.put(nestedPropertyTargetView, true);
		
		isCreationAllowed.put(referenceTargetView, true);
		isCreationAllowed.put(nestedReferenceTargetView, true);
		
		isCreationAllowed.put(valueTargetView, true);
		isCreationAllowed.put(nestedValueTargetView, true);
		
		isCreationAllowed.put(commentTargetView, false);
		isCreationAllowed.put(commentCNTargetView, false);
		isCreationAllowed.put(constraintTargetView, true);
		isCreationAllowed.put(constraintCNTargetView, true);
	}

}
