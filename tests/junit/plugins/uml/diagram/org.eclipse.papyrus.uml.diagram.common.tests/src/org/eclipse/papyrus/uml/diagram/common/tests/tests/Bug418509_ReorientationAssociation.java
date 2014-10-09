/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.tests.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.diagram.clazz.custom.command.CAssociationReorientCommand;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Rule;
import org.junit.Test;

/**
 * The test class to verify that there is no regression in relation to Bug 418509.
 *
 * @author Gabriel Pascual
 */
public class Bug418509_ReorientationAssociation {

	/** The model set fixture. */
	@Rule
	public final ModelSetFixture modelSetFixture = new ModelSetFixture();


	/**
	 * Case of an association between A and B, end a is owned by Class B and end b is owned by the association. End a is navigable but not End b. Test changes A to C.
	 */
	@Test
	@PluginResource("/resources/418509/model.di")
	public void testCase1() {

		// Get data test
		Association association = (Association) modelSetFixture.getModel().getMember("Association");
		NamedElement target = modelSetFixture.getModel().getMember("C");
		NamedElement source = modelSetFixture.getModel().getMember("A");
		StructuredClassifier sourceAssiociation = (StructuredClassifier) modelSetFixture.getModel().getMember("B");


		// Build a request and execute it
		ReorientRelationshipRequest request = new ReorientRelationshipRequest(association, target, source, ReorientRequest.REORIENT_TARGET);
		ICommand command = new CAssociationReorientCommand(request);
		modelSetFixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(command));

		assertNotNull(association.getMemberEnd(target.getName().toLowerCase(), (Type) target));
		assertNotNull(sourceAssiociation.getOwnedAttribute(target.getName().toLowerCase(), (Type) target));
		assertNotNull(association.getOwnedEnd(sourceAssiociation.getName().toLowerCase(), sourceAssiociation));


	}

	/**
	 * Case of an association between A and B, end a is owned by Class B and end b is owned by the association. End a is navigable but not End b. Test changes B to D.
	 */
	@Test
	@PluginResource("/resources/418509/model.di")
	public void testCase2() {

		// Get data test
		Association association = (Association) modelSetFixture.getModel().getMember("Association");
		StructuredClassifier target = (StructuredClassifier) modelSetFixture.getModel().getMember("D");
		NamedElement source = modelSetFixture.getModel().getMember("B");
		StructuredClassifier targetAssiociation = (StructuredClassifier) modelSetFixture.getModel().getMember("A");


		// Build a request and execute it
		ReorientRelationshipRequest request = new ReorientRelationshipRequest(association, target, source, ReorientRequest.REORIENT_SOURCE);
		ICommand command = new CAssociationReorientCommand(request);
		modelSetFixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(command));

		assertNotNull(association.getMemberEnd(target.getName().toLowerCase(), target));
		assertNotNull(target.getOwnedAttribute(targetAssiociation.getName().toLowerCase(), targetAssiociation));
		assertNotNull(association.getOwnedEnd(target.getName().toLowerCase(), target));


	}

	/**
	 * Case of an association between A and B, end a is owned by Class B and end b is owned by Class A. Both ends are navigable. Test changes B to D.
	 */
	@Test
	@PluginResource("/resources/418509/model.di")
	public void testCase3() {

		// Get data test
		Association association = (Association) modelSetFixture.getModel().getMember("Association");
		StructuredClassifier target = (StructuredClassifier) modelSetFixture.getModel().getMember("D");
		StructuredClassifier source = (StructuredClassifier) modelSetFixture.getModel().getMember("B");
		StructuredClassifier targetAssiociation = (StructuredClassifier) modelSetFixture.getModel().getMember("A");

		// Set End a to Class B
		SetValueCommand setCommand = new SetValueCommand(new SetRequest(targetAssiociation, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), association.getMemberEnd(source.getName().toLowerCase(), source)));
		modelSetFixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(setCommand));

		assertTrue(association.getOwnedEnds().isEmpty());

		// Build a request and execute it
		ReorientRelationshipRequest request = new ReorientRelationshipRequest(association, target, source, ReorientRequest.REORIENT_SOURCE);
		ICommand command = new CAssociationReorientCommand(request);
		modelSetFixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(command));

		assertTrue(association.getOwnedEnds().isEmpty());
		assertNotNull(association.getMemberEnd(target.getName().toLowerCase(), target));
		assertNotNull(target.getOwnedAttribute(targetAssiociation.getName().toLowerCase(), targetAssiociation));
		assertNull(source.getOwnedAttribute(targetAssiociation.getName().toLowerCase(), targetAssiociation));


	}

	/**
	 * Case of an association between A and B, Both ends are not navigable and contained by the association. Test changes B to D.
	 */
	@Test
	@PluginResource("/resources/418509/model.di")
	public void testCase4() {

		// Get data test
		Association association = (Association) modelSetFixture.getModel().getMember("Association");
		StructuredClassifier target = (StructuredClassifier) modelSetFixture.getModel().getMember("D");
		StructuredClassifier source = (StructuredClassifier) modelSetFixture.getModel().getMember("B");
		StructuredClassifier targetAssiociation = (StructuredClassifier) modelSetFixture.getModel().getMember("A");

		// Set End a to association
		SetValueCommand setCommand = new SetValueCommand(new SetRequest(association, UMLPackage.eINSTANCE.getAssociation_OwnedEnd(), association.getMemberEnd(targetAssiociation.getName().toLowerCase(), targetAssiociation)));
		modelSetFixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(setCommand));

		assertEquals(2, association.getOwnedEnds().size());

		// Build a request and execute it
		ReorientRelationshipRequest request = new ReorientRelationshipRequest(association, target, source, ReorientRequest.REORIENT_SOURCE);
		ICommand command = new CAssociationReorientCommand(request);
		modelSetFixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(command));

		assertEquals(2, association.getOwnedEnds().size());
		assertNotNull(association.getOwnedEnd(target.getName().toLowerCase(), target));
		assertNotNull(association.getOwnedEnd(targetAssiociation.getName().toLowerCase(), targetAssiociation));
		assertFalse(target.eIsSet(UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute()));
		assertFalse(targetAssiociation.eIsSet(UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute()));

	}
}
