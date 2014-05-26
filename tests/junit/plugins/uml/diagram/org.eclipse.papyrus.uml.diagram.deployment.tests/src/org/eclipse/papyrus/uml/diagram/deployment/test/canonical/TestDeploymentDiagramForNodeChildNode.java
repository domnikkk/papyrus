/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.deployment.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestChildNode;
import org.eclipse.papyrus.junit.utils.classification.InvalidTest;
import org.eclipse.papyrus.uml.diagram.deployment.CreateDeploymentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.deployment.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.deployment.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.deployment.test.IDeploymentDiagramTestsConstants;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestDepoloymentDiagramChildNode.
 */

public class TestDeploymentDiagramForNodeChildNode extends TestChildNode {

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateDeploymentDiagramCommand();
	}

	@Override
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.Node_2008, getDiagramEditPart().getDiagramPreferencesHint());
	}

	@Override
	protected String getProjectName() {
		return IDeploymentDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IDeploymentDiagramTestsConstants.FILE_NAME;
	}
	
	/**
	* Test to manage Device.
	*/
	@Test
	
	public void testToDevice() {
		testToManageNode(UMLElementTypes.Device_16, UMLPackage.eINSTANCE.getDevice(), UMLElementTypes.Node_23, false);
	}
	/**
	* Test to manage ExecutionEnvironment.
	*/
	@Test
	public void testToExecutionEnvironment() {
		testToManageNode(UMLElementTypes.ExecutionEnvironment_21, UMLPackage.eINSTANCE.getExecutionEnvironment(),  UMLElementTypes.Node_23, false);
	}
	/**
	* Test to manage Node.
	*/
	@Test
	public void testToNode() {
		testToManageNode(UMLElementTypes.Node_23, UMLPackage.eINSTANCE.getNode(),UMLElementTypes.Node_23, false);
	}
	/**
	* Test to manage Artifact.
	*/
	@Test
	public void testToArtifact() {
		testToManageNode(UMLElementTypes.Artifact_25, UMLPackage.eINSTANCE.getArtifact(),UMLElementTypes.Node_23, false);
	}
}
