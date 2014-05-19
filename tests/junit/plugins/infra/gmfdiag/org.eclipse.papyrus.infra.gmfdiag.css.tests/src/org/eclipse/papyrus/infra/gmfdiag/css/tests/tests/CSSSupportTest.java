/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 422257
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.tests.tests;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.helper.CSSHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSDiagram;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.ForceValueHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.tests.Activator;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test the installation of CSS Support on a standard ResourceSet
 *
 * @author Camille Letavernier
 *
 */
public class CSSSupportTest extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	/**
	 * Installs the CSS support on a resource set and check the results
	 *
	 * @throws Exception
	 */
	@Test
	public void testCSSSupport() throws Exception {
		//Resource set with CSS Support installed
		ResourceSet resourceSetWithCSSSupport = houseKeeper.createResourceSet();
		CSSHelper.installCSSSupport(resourceSetWithCSSSupport);

		URI uri = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/stylesheetTest/model.notation", true);

		Diagram diagram = (Diagram)EMFHelper.loadEMFModel(resourceSetWithCSSSupport, uri);

		//The diagram should be a CSSDiagram
		Assert.assertTrue(diagram instanceof CSSDiagram);

		CSSDiagram cssDiagram = (CSSDiagram)diagram;

		//The CSSDiagram should have a CSSEngine
		Assert.assertNotNull(cssDiagram.getEngine());

		//Dispose the CSS Engine
		resourceSetWithCSSSupport.getResources().remove(diagram.eResource());
	}

	/**
	 * Tests a standard resource set (without CSS support) and check the results.
	 *
	 * @throws Exception
	 */
	@Test
	@SuppressWarnings("unchecked")
	//GMF Notation model
	public void testWithoutCSSSupport() throws Exception {
		//Standard resource set (Without CSS Support installed)
		ResourceSet resourceSetWithoutCSSSupport = houseKeeper.createResourceSet();

		URI uri = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/stylesheetTest/model.notation", true);

		Diagram diagram = (Diagram)EMFHelper.loadEMFModel(resourceSetWithoutCSSSupport, uri);

		//The diagram should be a CSSDiagram, even if the CSS Support is not installed (The NotationFactory is a Singleton)
		Assert.assertTrue(diagram instanceof CSSDiagram);

		Assert.assertFalse(CSSHelper.isCSSSupported(resourceSetWithoutCSSSupport));

		for(View childNode : (List<View>)diagram.getChildren()) {
			if(childNode instanceof Shape) {
				Shape child = (Shape)childNode;
				for(EStructuralFeature feature : child.eClass().getEAllStructuralFeatures()) {
					if(NotationPackage.eINSTANCE.getStyle().isSuperTypeOf(feature.getEContainingClass())) {
						//For non-CSS models, this method should always return true (i.e. the value is never computed)
						Assert.assertTrue(ForceValueHelper.isSet(child, feature, null));
						System.out.println("Test");
					}
				}
			}
		}

		resourceSetWithoutCSSSupport.getResources().remove(diagram.eResource());
	}
}
