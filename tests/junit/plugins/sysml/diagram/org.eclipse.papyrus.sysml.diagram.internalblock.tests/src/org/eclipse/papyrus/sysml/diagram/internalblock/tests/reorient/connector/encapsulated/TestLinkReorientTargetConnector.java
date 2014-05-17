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
package org.eclipse.papyrus.sysml.diagram.internalblock.tests.reorient.connector.encapsulated;

import static org.eclipse.papyrus.sysml.diagram.internalblock.tests.utils.EditorUtils.getDiagramView;
import static org.eclipse.papyrus.sysml.diagram.internalblock.tests.utils.TestPrepareUtils.createGraphicalNode;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.papyrus.sysml.diagram.internalblock.tests.utils.EditorUtils;
import org.eclipse.papyrus.sysml.diagram.internalblock.tests.utils.TestPrepareUtils;
import org.eclipse.papyrus.sysml.service.types.element.SysMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.utils.UMLGraphicalTypes;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.uml2.uml.Property;
import org.junit.BeforeClass;

/**
 * JUnit tests for Connector re-orient.
 */
public class TestLinkReorientTargetConnector extends AbstractLinkReorientTargetConnectorTest {
	
	@BeforeClass
	public static void initRelationship() throws Exception {
		
		// Prepare source and target
		View container = ViewUtil.getChildBySemanticHint(getDiagramView(), SysMLGraphicalTypes.SHAPE_SYSML_BLOCK_AS_COMPOSITE_ID);
		View blockStructureView = ViewUtil.getChildBySemanticHint(container, SysMLGraphicalTypes.COMPARTMENT_SYSML_STRUCTURE_ID);
		View actorPartSourceView = createGraphicalNode(SysMLElementTypes.ACTOR_PART_PROPERTY, SysMLGraphicalTypes.SHAPE_SYSML_BLOCKPROPERTY_AS_COMPOSITE_ID, blockStructureView);
		View actorPartTargetView = createGraphicalNode(SysMLElementTypes.ACTOR_PART_PROPERTY, SysMLGraphicalTypes.SHAPE_SYSML_BLOCKPROPERTY_AS_COMPOSITE_ID, blockStructureView);

		// Prepare relationship
		relationshipView = TestPrepareUtils.createGraphicalLink(
			UMLElementTypes.CONNECTOR, 
			UMLGraphicalTypes.LINK_UML_CONNECTOR_ID, 
			container, 
			EditorUtils.getEditPart(actorPartSourceView), 
			EditorUtils.getEditPart(actorPartTargetView));
	}	
	
	@BeforeClass
	public static void initExpectedResults() throws Exception {
		
		// Initialize source creation results

		isReorientAllowed.put(getDiagramView(), false);

		isReorientAllowed.put(blockTargetView, false);
		
		isReorientAllowed.put(actorPartTargetView, true);
		isReorientAllowed.put(nestedActorPartTargetView, false);
		
		isReorientAllowed.put(portOnBlockTargetView, true);
		isReorientAllowed.put(portOnPartTargetView, true);
		isReorientAllowed.put(portOnNestedPartTargetView, false);
		
		isReorientAllowed.put(flowportOnBlockTargetView, true);
		isReorientAllowed.put(flowportOnPartTargetView, true);
		isReorientAllowed.put(flowportOnNestedPartTargetView, false);
		
		isReorientAllowed.put(partTargetView, true);
		isReorientAllowed.put(nestedPartTargetView, false);
		
		isReorientAllowed.put(propertyTargetView, true);
		isReorientAllowed.put(nestedPropertyTargetView, false);
		
		isReorientAllowed.put(referenceTargetView, true);
		isReorientAllowed.put(nestedReferenceTargetView, false);
		
		isReorientAllowed.put(valueTargetView, true);
		isReorientAllowed.put(nestedValueTargetView, false);
		
		isReorientAllowed.put(commentTargetView, false);
		isReorientAllowed.put(commentCNTargetView, false);
		isReorientAllowed.put(constraintTargetView, false);
		isReorientAllowed.put(constraintCNTargetView, false);
		
		// Initialize nested property path for tests
		List<Property> emptyPath = Collections.emptyList();
		for (View view : isReorientAllowed.keySet()) {
			expectedNestedPath.put(view, emptyPath);
		}
	}

}
