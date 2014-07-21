/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.resources;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.resource.EMFLogicalModel;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;


/**
 * An {@link IModel} implementation for Ecore models that test cases may add to their {@link ModelSet}s for cases where it is expedient to
 * work with models that are not UML.
 */
public class EcoreModel extends EMFLogicalModel {

	public EcoreModel() {
		super();
	}

	@Override
	public String getIdentifier() {
		return "test.ecore";
	}

	@Override
	public String getModelFileExtension() {
		return "ecore";
	}

	public EPackage getRoot() {
		return (EPackage)EcoreUtil.getObjectByType(getResource().getContents(), EcorePackage.Literals.EPACKAGE);
	}

	@Override
	public void createModel(URI uri) {
		resourceURI = uri.appendFileExtension(getModelFileExtension());
		resource = getResourceSet().createResource(resourceURI, EcorePackage.eCONTENT_TYPE);

		final EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("package1");
		ePackage.setNsPrefix("pkg1");
		ePackage.setNsURI("http://www.eclipse.org/papyrus/test/fakemodel/ecore/package1");

		try {
			TransactionHelper.run(getModelManager().getTransactionalEditingDomain(), new Runnable() {

				public void run() {
					resource.getContents().add(ePackage);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			fail("Creation of Ecore model failed: " + e.getLocalizedMessage());
		}
	}
}
