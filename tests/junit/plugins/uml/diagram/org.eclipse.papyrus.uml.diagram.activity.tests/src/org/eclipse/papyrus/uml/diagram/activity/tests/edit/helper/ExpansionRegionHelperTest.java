package org.eclipse.papyrus.uml.diagram.activity.tests.edit.helper;

import static org.junit.Assert.assertNotEquals;

import java.rmi.UnexpectedException;
import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.service.types.command.CreateEditBasedElementCommand;
import org.eclipse.papyrus.uml.service.types.helper.ExpansionNodeHelper;
import org.eclipse.papyrus.uml.service.types.helper.ExpansionRegionHelper;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;


public class ExpansionRegionHelperTest extends TestCase {

	public final static String TEST_UML_MODEL = "platform:/plugin/org.eclipse.papyrus.uml.diagram.activity.tests/content/UMLActivityTestModel.uml";

	private MockExpansionRegionHelper myHelperInstance;

	private UMLEditor myUMLEditor;

	private TransactionalEditingDomain myEditingDomain;

	public ExpansionRegionHelperTest(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		myHelperInstance = new MockExpansionRegionHelper();
		myUMLEditor = new UMLEditor();
		myEditingDomain = new TransactionalEditingDomainImpl(myUMLEditor.getAdapterFactory()) {

			@Override
			public boolean isReadOnly(Resource resource) {
				return false;
			}
		};
	}

	public void testExpansionNodeCreateCommand() throws Exception {
		CreateElementRequest expansionNodeCreateRequest = initCreateElementRequest(UMLElementTypes.ExpansionNode_3074, UMLPackage.eINSTANCE.getExpansionRegion_InputElement());
		ICommand command = myHelperInstance.getCreateCommand(expansionNodeCreateRequest);
		commonExpansionRegionCreateChildTest(command);
		CreateEditBasedElementCommand createCommand = (CreateEditBasedElementCommand)command;
		assertNotEquals(expansionNodeCreateRequest, createCommand.getCreateRequest());
		CreateElementRequest changedRequest = createCommand.getCreateRequest();
		assertEquals(changedRequest.getContainer(), expansionNodeCreateRequest.getContainer());
		assertEquals(changedRequest.getContainmentFeature(), UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
		assertEquals(changedRequest.getParameter(ExpansionNodeHelper.IN_EXPANSION_REGION), changedRequest.getContainer());
		assertEquals(changedRequest.getParameter(ExpansionNodeHelper.EXPANSION_REGION_FEATURE), UMLPackage.eINSTANCE.getExpansionRegion_InputElement());
	}

	public void testExpansionRegionContainmentChildCreateCommand() throws Exception {
		CreateElementRequest expansionRegionContainmentCreateRequest = initCreateElementRequest(UMLElementTypes.StructuredActivityNode_3065, UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
		ICommand command = myHelperInstance.getCreateCommand(expansionRegionContainmentCreateRequest);
		commonExpansionRegionCreateChildTest(command);
		CreateEditBasedElementCommand createCommand = (CreateEditBasedElementCommand)command;
		assertEquals(expansionRegionContainmentCreateRequest, createCommand.getCreateRequest());
	}

	public void testExpansionRegionBadCreateCommand() throws Exception {
		CreateElementRequest badCreateCommandRequest = initCreateElementRequest(UMLElementTypes.ExpansionNode_3074, UMLPackage.eINSTANCE.getStructuredActivityNode_Edge());
		ICommand command = myHelperInstance.getCreateCommand(badCreateCommandRequest);
		assertFalse(command.canExecute());
	}

	private void commonExpansionRegionCreateChildTest(ICommand command) throws Exception {
		assertNotNull(command);
		assertTrue(command.canExecute());
		assertEquals(CreateEditBasedElementCommand.class, command.getClass());
	}

	private CreateElementRequest initCreateElementRequest(IElementType childType, EReference feature) throws UnexpectedException {
		CreateElementRequest req = new CreateElementRequest(childType);
		req.setContainer(loadExpansionRegion());
		req.setContainmentFeature(feature);
		req.setEditingDomain(myEditingDomain);
		return req;
	}

	private ExpansionRegion loadExpansionRegion() throws UnexpectedException {
		ResourceSet resourceSet = myUMLEditor.getEditingDomain().getResourceSet();
		Resource resource = resourceSet.getResource(URI.createURI(TEST_UML_MODEL), true);
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext();) {
			EObject content = i.next();
			if(content instanceof ExpansionRegion) {
				return (ExpansionRegion)content;
			}
		}
		throw new UnexpectedException("ExpansionRegion element was not fount in " + TEST_UML_MODEL);
	}

	@Override
	protected void tearDown() throws Exception {
		myEditingDomain = null;
		myUMLEditor = null;
		myHelperInstance = null;
		super.tearDown();
	}

	private static class MockExpansionRegionHelper extends ExpansionRegionHelper {

		@Override
		public ICommand getCreateCommand(CreateElementRequest req) {
			return super.getCreateCommand(req);
		}

	}
}
