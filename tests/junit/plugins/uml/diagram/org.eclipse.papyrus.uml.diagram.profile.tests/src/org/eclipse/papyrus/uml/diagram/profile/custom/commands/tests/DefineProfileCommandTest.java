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

package org.eclipse.papyrus.uml.diagram.profile.custom.commands.tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.diagram.profile.custom.commands.DefineProfileCommand;
import org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation;
import org.eclipse.papyrus.uml.tools.profile.definition.Version;
import org.eclipse.uml2.uml.Profile;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test suite for the {@code DefineProfileCommand} class.
 */
public class DefineProfileCommandTest extends AbstractPapyrusTest {

	@Rule
	public final ModelSetFixture modelSet = new ModelSetFixture();

	/**
	 * Initializes me.
	 */
	public DefineProfileCommandTest() {
		super();
	}

	@Test
	@PluginResource("resource/profile_simple/simple.profile.di")
	public void testDefineSimpleProfile() {
		Profile rootProfile = (Profile) modelSet.getModel();

		executeDefineCommand(rootProfile, "0.0.1");

		EAnnotation annotation = getUMLAnnotation(rootProfile.getDefinition());
		assertThat(annotation, nullValue()); // Don't need the annotation for a simple self-contained profile
	}

	@Test
	@PluginResource("resource/profile_dependencies/datatypes.profile.di")
	public void testDefineNestedProfileWithDependencies() {
		Profile rootProfile = (Profile) modelSet.getModel();

		executeDefineCommand(rootProfile, "0.0.1");

		Profile profile1 = (Profile) rootProfile.getNestedPackage("Profile1");
		Profile profile2 = (Profile) rootProfile.getNestedPackage("Profile2");

		EAnnotation annotation = getUMLAnnotation(profile1.getDefinition());
		assertThat(annotation, notNullValue());
		assertThat(annotation.getReferences(), hasItem(profile2.getDefinition()));
	}

	//
	// Test framework
	//

	void executeDefineCommand(Profile profile, String version) {
		PapyrusDefinitionAnnotation annotation = new PapyrusDefinitionAnnotation(Version.parseVersion(version), "", "", "", "");
		DefineProfileCommand command = new DefineProfileCommand(modelSet.getEditingDomain(), annotation, profile, true);
		modelSet.getEditingDomain().getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(command));
	}

	static EAnnotation getUMLAnnotation(ENamedElement namedElement) {
		EAnnotation result = null;

		for (EAnnotation next : namedElement.getEAnnotations()) {
			String source = next.getSource();
			if ((source != null) && source.startsWith("http://www.eclipse.org/uml2/")) {
				result = next;
				break;
			}
		}

		return result;
	}
}
