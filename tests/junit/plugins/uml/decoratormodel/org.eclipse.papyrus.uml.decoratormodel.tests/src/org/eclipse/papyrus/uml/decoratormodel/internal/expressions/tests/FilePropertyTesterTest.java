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

package org.eclipse.papyrus.uml.decoratormodel.internal.expressions.tests;

import static org.eclipse.papyrus.uml.decoratormodel.internal.expressions.FilePropertyTester.PROPERTY_IS_DECORATOR_MODEL;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.decoratormodel.internal.expressions.FilePropertyTester;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test suite for the {@link FilePropertyTester} class.
 */
@SuppressWarnings("restriction")
@PluginResource("/resources/testmodel.di")
public class FilePropertyTesterTest extends AbstractPapyrusTest {

	private static final Object[] ZERO_ARGS = {};

	@Rule
	public final ModelSetFixture modelSet = new ModelSetFixture();

	private IFile uml;
	private IFile decoratorUML;
	private IFile decoratorNotation;

	private final FilePropertyTester fixture = new FilePropertyTester();

	public FilePropertyTesterTest() {
		super();
	}

	@Test
	public void isDecoratorModel_userModelUML() {
		assertThat(fixture.test(uml, PROPERTY_IS_DECORATOR_MODEL, ZERO_ARGS, false), is(true));
	}

	@Test
	public void isDecoratorModel_decoratorModelUML() {
		assertThat(fixture.test(decoratorUML, PROPERTY_IS_DECORATOR_MODEL, ZERO_ARGS, null), is(true));
	}

	@Test
	public void isDecoratorModel_decoratorModelNotation() {
		assertThat(fixture.test(decoratorNotation, PROPERTY_IS_DECORATOR_MODEL, ZERO_ARGS, false), is(true));
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() {
		uml = modelSet.getProject().getFile(modelSet.getModelResourceURI());

		URI decoratorURI = modelSet.getModelResourceURI().trimSegments(1).appendSegment("package2.decorator.uml");
		decoratorUML = modelSet.getProject().getFile(decoratorURI);
		decoratorNotation = modelSet.getProject().getFile(decoratorURI.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION));
	}
}
