package org.eclipse.papyrus.uml.diagram.activity.tests.edit.part;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomExpansionRegionStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeCreationTool;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeCreationTool.CreateAspectUnspecifiedTypeRequest;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Test;

public class ExpansionRegionCompartmentEPTest extends TestCase {

	private MockExpansionRegionEditPart myParentEP;

	private MockCustomExpansionRegionCompartmentEditPart myCompartmentEP;

	public ExpansionRegionCompartmentEPTest(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		myParentEP = createParentEditPart();
		myCompartmentEP = createCompartmentEP(myParentEP);
		myParentEP.createDefaultEditPolicies();
		myCompartmentEP.createDefaultEditPolicies();
	}

	private MockExpansionRegionEditPart createParentEditPart() {
		EObject expansionRegionView = UMLFactory.eINSTANCE.createExpansionRegion();
		View nodeView = NotationFactory.eINSTANCE.createShape();
		nodeView.setElement(expansionRegionView);
		nodeView.setType("" + ExpansionRegionEditPart.VISUAL_ID);
		return new MockExpansionRegionEditPart(nodeView);
	}

	private MockCustomExpansionRegionCompartmentEditPart createCompartmentEP(ExpansionRegionEditPart parentEP) {
		View decoratorView = NotationFactory.eINSTANCE.createDecorationNode();
		decoratorView.setType("" + ExpansionRegionStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID);
		parentEP.getNotationView().insertChild(decoratorView);
		MockCustomExpansionRegionCompartmentEditPart compartment = new MockCustomExpansionRegionCompartmentEditPart(decoratorView);
		compartment.setParent(parentEP);
		return compartment;
	}

	@Test
	public void testExpansionNodeCreationRequest() {
		assertEquals(myParentEP, getTestTargetEditPart(UMLElementTypes.ExpansionNode_3074, UMLElementTypes.ExpansionNode_3075));
	}

	@Test
	public void testMixedElementTypesCreationRequest() {
		assertNotNull(getTestTargetEditPart(UMLElementTypes.ExpansionNode_3074, UMLElementTypes.LoopNode_3071));
	}

	@Test
	public void testAlienCreationRequest() {
		assertEquals(myCompartmentEP, getTestTargetEditPart(UMLElementTypes.StructuredActivityNode_3065));
	}

	private EditPart getTestTargetEditPart(IElementType... types) {
		List<IElementType> typesList = Arrays.asList(types);
		CreateAspectUnspecifiedTypeRequest req = new AspectUnspecifiedTypeCreationTool(typesList).new CreateAspectUnspecifiedTypeRequest(typesList, PreferencesHint.USE_DEFAULTS);
		return myCompartmentEP.getTargetEditPart(req);
	}

	@Override
	protected void tearDown() throws Exception {
		myCompartmentEP = null;
		myParentEP = null;
		super.tearDown();
	}

	private static class MockCustomExpansionRegionCompartmentEditPart extends CustomExpansionRegionStructuredActivityNodeContentCompartmentEditPart {

		public MockCustomExpansionRegionCompartmentEditPart(View view) {
			super(view);
		}

		@Override
		public void createDefaultEditPolicies() {
			super.createDefaultEditPolicies();
		}
	}

	private static class MockExpansionRegionEditPart extends ExpansionRegionEditPart {

		public MockExpansionRegionEditPart(View view) {
			super(view);
		}

		@Override
		public void createDefaultEditPolicies() {
			super.createDefaultEditPolicies();
		}
	}
}
