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
package org.eclipse.papyrus.infra.extendedtypes.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Test;



/**
 * Test class for extended edit helper advice
 */
public class ExtendedEditHelperAdviceTests extends AbstractElementTypeTests implements ITestConstants {

	
	@Test
	public void testPACKAGE_WITH_COMPONENTSType() {
		List<IElementType> elementTypes = Arrays.asList(ElementTypeRegistry.getInstance().getAllTypesMatching(packageWithComponents, papyrusContext));
		Assert.assertNotNull("list should not be null", elementTypes);
		Assert.assertTrue("list should not be empty", elementTypes.size() > 0);
		Assert.assertTrue(PACKAGE_WITH_COMPONENTS + " should be a Package With components only type", elementTypes.contains(ElementTypeRegistry.getInstance().getType(PACKAGE_WITH_COMPONENTS_TYPE_ID)));
	}

	@Test
	public void testPACKAGE_WITH_ALL_ELEMENTSType() {
		List<IElementType> elementTypes = Arrays.asList(ElementTypeRegistry.getInstance().getAllTypesMatching(packageWithAllElements, papyrusContext));
		Assert.assertNotNull("list should not be null", elementTypes);
		Assert.assertTrue("list should not be empty", elementTypes.size() > 0);
		Assert.assertTrue(PACKAGE_WITH_ALL_ELEMENTS + " should not be a Package With components only type", !elementTypes.contains(ElementTypeRegistry.getInstance().getType(PACKAGE_WITH_COMPONENTS_TYPE_ID)));
	}

	@Test
	public void testSemanticCreateComponentInGoodPackage() throws ExecutionException {
		testCreateComponent(packageWithComponents, true);
	}
	
	@Test
	public void testSemanticCreateComponentInWrongPackage() throws ExecutionException {
		testCreateComponent(packageWithAllElements, false);
	}

	
	protected void testCreateComponent(Package container, boolean canCreate) throws ExecutionException {
		IProgressMonitor monitor = new NullProgressMonitor();
		// should be possible
		CreateElementRequest request = new CreateElementRequest(transactionalEditingDomain, container, ElementTypeRegistry.getInstance().getType(SPECIFICCOMPONENT_TYPE_ID));
		IElementEditService service = ElementEditServiceUtils.getCommandProvider(container);
		ICommand command = service.getEditCommand(request);

		// get children before modification
		List<EObject> originalChildren = new ArrayList<EObject>(container.getPackagedElements());

		if(canCreate) {
			Assert.assertTrue("Command should be executable", command.canExecute());
			IStatus status = command.execute(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			// get result
			List<EObject> afterCreationChildren = new ArrayList<EObject>(container.getPackagedElements());
			List<EObject> delta = new ArrayList<EObject>(afterCreationChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have only one more element", 1, delta.size());

			// check it does not impact undo
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			List<EObject> afterUndoChildren = new ArrayList<EObject>(container.getPackagedElements());
			delta = new ArrayList<EObject>(afterUndoChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have no element", 0, delta.size());

			// should be redoable
			Assert.assertTrue("Command should be redoable", command.canRedo());
			status = command.redo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());
			
			List<EObject> afterRedoChildren = new ArrayList<EObject>(container.getPackagedElements());
			delta = new ArrayList<EObject>(afterRedoChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have one more element", 1, delta.size());

			// undo to revert state
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());
		} else {
			Assert.assertTrue("Command should not be executable", command == null || !(command.canExecute()));
		}
	}

	@Test
	public void testSemanticMoveComponentFromGoodPackageToGoodPackage() throws ExecutionException {
		// should be possible (target = good package)
		testMoveComponent(otherPackageWithComponents, component1_packageWithComponents, true);
	}

	@Test
	public void testSemanticMoveComponentFromGoodPackageToWrongPackage() throws ExecutionException {
		// should be impossible (target = wrong package)
		testMoveComponent(packageWithAllElements, component1_packageWithComponents, false);
	}

	@Test
	public void testSemanticMoveComponentFromWrongPackageToGoodPackage() throws ExecutionException {
		// should be possible (target = good package)
		testMoveComponent(packageWithComponents, component1_packageWithAllElements, true);
	}

	@Test
	public void testSemanticMoveComponentFromWrongPackageToWrongPackage() throws ExecutionException {
		// should be impossible (target = wrong package)
		testMoveComponent(packageWithAllElements, component1_packageWithAllElements, false);
	}
	
	protected void testMoveComponent(Package targetContainer, Component sourceComponent, boolean canMove) throws ExecutionException {
		IProgressMonitor monitor = new NullProgressMonitor();
		// should be possible
		MoveRequest request = new MoveRequest(transactionalEditingDomain, targetContainer, sourceComponent);
		IElementEditService service = ElementEditServiceUtils.getCommandProvider(targetContainer);
		ICommand command = service.getEditCommand(request);

		// get children before modification
		List<EObject> originalChildren = new ArrayList<EObject>(targetContainer.getPackagedElements());

		if(canMove) {
			Assert.assertTrue("Command should be executable", command.canExecute());
			IStatus status = command.execute(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			// get result
			List<EObject> afterCreationChildren = new ArrayList<EObject>(targetContainer.getPackagedElements());
			List<EObject> delta = new ArrayList<EObject>(afterCreationChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have only one more element", 1, delta.size());

			// check it does not impact undo
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			List<EObject> afterUndoChildren = new ArrayList<EObject>(targetContainer.getPackagedElements());
			delta = new ArrayList<EObject>(afterUndoChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have no element", 0, delta.size());

			// should be redoable
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			List<EObject> afterRedoChildren = new ArrayList<EObject>(targetContainer.getPackagedElements());
			delta = new ArrayList<EObject>(afterRedoChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have one more element", 1, delta.size());

			// undo to revert state
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());
		} else {
			Assert.assertTrue("Command should not be executable", command == null ||  !command.canExecute());
		}
		
	}

	@Test
	public void testDeleteComponentFromWrongPackage() throws ExecutionException {
		// should be possible. no influence on deletion is expected
		testDeleteComponent(component1_packageWithAllElements, true);
	}
	
	@Test
	public void testDeleteComponentFromGoodPackage() throws ExecutionException {
		// should be possible. no influence on deletion is expected
		testDeleteComponent(component1_packageWithComponents, true);
	}

	protected void testDeleteComponent(EObject objectToDelete, boolean canDelete) throws ExecutionException {
		IProgressMonitor monitor = new NullProgressMonitor();
		// should be possible
		DestroyElementRequest request = new DestroyElementRequest(transactionalEditingDomain, objectToDelete, false);
		IElementEditService service = ElementEditServiceUtils.getCommandProvider(objectToDelete);
		ICommand command = service.getEditCommand(request);

		// get children before modification
		List<EObject> originalChildren = new ArrayList<EObject>((List<EObject>)objectToDelete.eContainer().eGet(objectToDelete.eContainingFeature(),true));
		EObject container= objectToDelete.eContainer();
		EStructuralFeature containingFeature = objectToDelete.eContainingFeature();

		if(canDelete) {
			Assert.assertTrue("Command should be executable", command.canExecute());
			IStatus status = command.execute(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			// get result
			List<EObject> afterDeletionChildren = new ArrayList<EObject>((List<EObject>)container.eGet(containingFeature,true));
			List<EObject> delta = new ArrayList<EObject>(originalChildren);
			delta.removeAll(afterDeletionChildren);
			Assert.assertEquals("List should have one element only", 1, delta.size());
			Assert.assertEquals("deleted element should be the specified one", objectToDelete, delta.get(0));

			// check it does not impact undo
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			List<EObject> afterUndoChildren = new ArrayList<EObject>((List<EObject>)container.eGet(containingFeature,true));
			delta = new ArrayList<EObject>(afterUndoChildren);
			delta.removeAll(originalChildren);
			Assert.assertEquals("List should have no element", 0, delta.size());

			// should be redoable
			Assert.assertTrue("Command should be redoable", command.canRedo());
			status = command.redo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());

			List<EObject> afterRedoChildren = new ArrayList<EObject>((List<EObject>)container.eGet(containingFeature,true));
			delta = new ArrayList<EObject>(originalChildren);
			delta.removeAll(afterRedoChildren);
			Assert.assertEquals("List should have one more element", 1, delta.size());

			// undo to revert state
			Assert.assertTrue("Command should be undoable", command.canUndo());
			status = command.undo(monitor, null);
			Assert.assertTrue("Status should be OK", status.isOK());
		} else {
			Assert.assertTrue("Command should not be executable", command == null ||  !command.canExecute());
		}
		
	}

}
