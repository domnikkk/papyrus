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

import org.eclipse.papyrus.sysml.diagram.blockdefinition.tests.creation.link.AbstractLinkCreationForSourcesTest;
import org.junit.BeforeClass;

/**
 * JUnit tests for Association creation test (via palette tools).
 */
public class TestLinkCreationAssociationCompositeForSources extends AbstractLinkCreationForSourcesTest {
	
	@BeforeClass
	public static void initToolID() throws Exception {
		toolID = "blockdefinition.tool.association_composite";
	}	
	
	@BeforeClass
	public static void initExpectedResults() throws Exception {
		
		// Initialize source creation results
		isCreationAllowed.put(actorSourceView, false);
		isCreationAllowed.put(actorPartSourceView, false);
		isCreationAllowed.put(blockSourceView, true);
		isCreationAllowed.put(constraintBlockSourceView, true);
		isCreationAllowed.put(dataTypeSourceView, true);
		isCreationAllowed.put(dimensionSourceView, false);
		isCreationAllowed.put(enumerationSourceView, true);
		isCreationAllowed.put(flowSpecificationSourceView, true);
		isCreationAllowed.put(interfaceSourceView, true);
		isCreationAllowed.put(primitiveTypeSourceView, true);
		isCreationAllowed.put(signalSourceView, true);
		isCreationAllowed.put(unitSourceView, false);
		isCreationAllowed.put(valueTypeSourceView, true);
		
		isCreationAllowed.put(commentSourceView, false);
		isCreationAllowed.put(commentCNSourceView, false);
		isCreationAllowed.put(constraintSourceView, false);
		isCreationAllowed.put(constraintCNSourceView, false);
		isCreationAllowed.put(instanceSpecSourceView, false);
		isCreationAllowed.put(instanceSpecCNSourceView, false);
		isCreationAllowed.put(modelSourceView, false);
		isCreationAllowed.put(modelCNSourceView, false);
		isCreationAllowed.put(packageSourceView, false);
		isCreationAllowed.put(packageCNSourceView, false);
		
		isCreationAllowed.put(slotSourceView, false);
		
		isCreationAllowed.put(propertySourceView, false);
		isCreationAllowed.put(portSourceView, false);
		isCreationAllowed.put(flowportSourceView, false);
		isCreationAllowed.put(partSourceView, false);
		isCreationAllowed.put(referenceSourceView, false);
		isCreationAllowed.put(valueSourceView, false);
		isCreationAllowed.put(operationSourceView, false);
		isCreationAllowed.put(receptionSourceView, false);
		isCreationAllowed.put(constraintCLNSourceView, false);
		isCreationAllowed.put(constraintPropertySourceView, false);
		isCreationAllowed.put(flowPropertySourceView, false);
		isCreationAllowed.put(enumerationLiteralSourceView, false);		

		isCreationAllowed.put(associationSourceView, false);

	}

}
