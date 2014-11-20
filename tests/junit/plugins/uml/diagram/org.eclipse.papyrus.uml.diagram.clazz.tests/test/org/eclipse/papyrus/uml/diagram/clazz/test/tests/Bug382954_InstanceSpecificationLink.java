/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.clazz.test.tests;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.NamedElement;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test case for Bug 382954.
 * 
 * @author Gabriel Pascual
 *
 */
public class Bug382954_InstanceSpecificationLink extends AbstractPapyrusTest {

	/** The model set fixture. */
	@Rule
	public final ModelSetFixture modelSetFixture = new ModelSetFixture();



	/**
	 * Test of the link creation between two specification instances a:A and c:C. The link is the specification instance of relation between both types A and B.
	 * The type C inherits of B.
	 */
	@Test
	@PluginResource("model/testInstanceSpecificationLink/model.di")
	public void testLinkCreation() {

		// Get two Specification instances to link
		NamedElement sourceLink = modelSetFixture.getModel().getMember("a");
		NamedElement targetLink = modelSetFixture.getModel().getMember("c");

		// Create the command with the creation request and service edit
		CreateRelationshipRequest relationshipRequest = new CreateRelationshipRequest(modelSetFixture.getModel(), sourceLink, targetLink, UMLElementTypes.InstanceSpecification_4021);
		IElementEditService editService = ElementEditServiceUtils.getCommandProvider(modelSetFixture.getModel());
		ICommand editCommand = editService.getEditCommand(relationshipRequest);

		// Verify if the command can be executed
		Assert.assertTrue(editCommand.canExecute());

	}


}
