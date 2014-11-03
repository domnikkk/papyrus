/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.tests;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.junit.Test;

/**
 * Tests the internalization of profiles.
 */
@PluginResource("/resources/testmodel.di")
public class InternalizeProfileApplicationTest extends AbstractProfileExternalizationTest {

	public InternalizeProfileApplicationTest() {
		super();
	}

	@Test
	public void internalizeApplication() {
		loadDecoratorModel("package2");

		URI uml = getBean2().getStereotypeApplication(getBeanStereotype()).eResource().getURI();
		URI di = uml.trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION);
		URI notation = uml.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);

		internalize(getPackage2(), getTestProfile());

		// Three stereotypes applied: Bean, Import, and Bean again
		assertInternalApplication(getPackage2(), getTestProfile(), 3);

		assertThat(uml, exists());
		assertThat(di, exists());
		assertThat(notation, exists());

		save();

		// resource was deleted because it is no longer required
		assertThat(uml, not(exists()));

		// also the *.di and *.notation
		assertThat(di, not(exists()));
		assertThat(notation, not(exists()));
	}

	@Test
	public void internalizeApplication_undo() {
		loadDecoratorModel("package2");

		URI uml = getBean2().getStereotypeApplication(getBeanStereotype()).eResource().getURI();
		URI di = uml.trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION);
		URI notation = uml.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);

		internalize(getPackage2(), getTestProfile());

		// Undo the externalization command
		undo();

		save();

		// The resources still exist
		assertThat(uml, exists());
		assertThat(di, exists());
		assertThat(notation, exists());

		// The stereotypes applied: Bean, Import, and Bean again
		assertExternalApplication(getPackage2(), getTestProfile(), "package2", 3);
	}

	@Test
	public void internalizeApplication_undo_redo() {
		loadDecoratorModel("package2");

		URI uml = getBean2().getStereotypeApplication(getBeanStereotype()).eResource().getURI();
		URI di = uml.trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION);
		URI notation = uml.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);

		internalize(getPackage2(), getTestProfile());

		undo();
		redo();

		// Three stereotypes applied: Bean, Import, and Bean again
		assertInternalApplication(getPackage2(), getTestProfile(), 3);

		save();

		// resource was deleted because it is no longer required
		assertThat(uml, not(exists()));

		// also the *.di and *.notation
		assertThat(di, not(exists()));
		assertThat(notation, not(exists()));
	}

}
