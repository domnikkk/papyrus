/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.tests.qvt;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Test;

public class ImportModelsTest extends AbstractTransformationTest {


	@Test
	public void testFragments() throws Exception {

		String path = "resources/fragments/";

		String mainFile = path + "Blank Package.emx";

		String[] additionalFiles = new String[] {
				path + "Class3.efx",
				path + "Interface - Fragment.efx",
				path + "Package - Fragment.efx"
		};

		simpleImport(mainFile, additionalFiles);

		openEditor();

		// Fragments should have been moved to the proper resource
		Package fragmentPackage = (Package) rootPackage.getMember("Package - Fragment");
		Assert.assertEquals("Package - Fragment.uml", URI.decode(EcoreUtil.getURI(fragmentPackage).lastSegment()));
		Assert.assertEquals("_0OuW4LZ7EeOu-9meM8ButQ", EcoreUtil.getURI(fragmentPackage).fragment()); // The XMI ID should be unchanged

		Class class3 = (Class) fragmentPackage.getMember("Class3");
		Assert.assertEquals("Class3.uml", EcoreUtil.getURI(class3).lastSegment());
		Assert.assertEquals("_ONlFkLZ8EeOu-9meM8ButQ", EcoreUtil.getURI(class3).fragment()); // The XMI ID should be unchanged

		// Diagrams associated to fragmented elements should have been moved to their own notation resource

		ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());
		String NotationResourcePath = (mainModelFile.getFullPath().removeLastSegments(1).append("Package - Fragment.notation")).toString();
		Resource fragmentPackageNotationResource = modelSet.getResource(URI.createPlatformResourceURI(NotationResourcePath, true), true);
		Assert.assertEquals(2, fragmentPackageNotationResource.getContents().size());

	}
}
