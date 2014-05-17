/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
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
package org.eclipse.papyrus.sysml.diagram.blockdefinition.tests.creation.link.association;

import org.eclipse.papyrus.sysml.diagram.blockdefinition.tests.creation.link.AbstractLinkCreationFromElementTest;
import org.junit.BeforeClass;

/**
 * JUnit tests for Association creation test (via palette tools).
 */
public class TestLinkCreationAssociationCompositeDirectedFromBlock extends AbstractLinkCreationFromElementTest {
	
	@BeforeClass
	public static void initSource() throws Exception {
		sourceView = blockSourceView;
	}	
	
	@BeforeClass
	public static void initToolID() throws Exception {
		toolID = "blockdefinition.tool.association_composite_directed";
	}	
	
	@BeforeClass
	public static void initExpectedResults() throws Exception {
		
		// Initialize source creation results
		isCreationAllowed.put(actorTargetView, true);
		isCreationAllowed.put(actorPartTargetView, false);
		isCreationAllowed.put(blockTargetView, true);
		isCreationAllowed.put(constraintBlockTargetView, true);
		isCreationAllowed.put(dataTypeTargetView, true);
		isCreationAllowed.put(dimensionTargetView, false);
		isCreationAllowed.put(enumerationTargetView, true);
		isCreationAllowed.put(flowSpecificationTargetView, true);
		isCreationAllowed.put(interfaceTargetView, true);
		isCreationAllowed.put(primitiveTypeTargetView, true);
		isCreationAllowed.put(signalTargetView, true);
		isCreationAllowed.put(unitTargetView, false);
		isCreationAllowed.put(valueTypeTargetView, true);
		
		isCreationAllowed.put(commentTargetView, false);
		isCreationAllowed.put(commentCNTargetView, false);
		isCreationAllowed.put(constraintTargetView, false);
		isCreationAllowed.put(constraintCNTargetView, false);
		isCreationAllowed.put(instanceSpecTargetView, false);
		isCreationAllowed.put(instanceSpecCNTargetView, false);
		isCreationAllowed.put(modelTargetView, false);
		isCreationAllowed.put(modelCNTargetView, false);
		isCreationAllowed.put(packageTargetView, false);
		isCreationAllowed.put(packageCNTargetView, false);
		
		isCreationAllowed.put(slotTargetView, false);
		
		isCreationAllowed.put(propertyTargetView, false);
		isCreationAllowed.put(portTargetView, false);
		isCreationAllowed.put(flowportTargetView, false);
		isCreationAllowed.put(partTargetView, false);
		isCreationAllowed.put(referenceTargetView, false);
		isCreationAllowed.put(valueTargetView, false);
		isCreationAllowed.put(operationTargetView, false);
		isCreationAllowed.put(receptionTargetView, false);
		isCreationAllowed.put(constraintCLNTargetView, false);
		isCreationAllowed.put(constraintPropertyTargetView, false);
		isCreationAllowed.put(flowPropertyTargetView, false);
		isCreationAllowed.put(enumerationLiteralTargetView, false);		

		isCreationAllowed.put(associationTargetView, false);
	}
}
