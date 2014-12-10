/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.tests.generation;

import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.activity.tests.generation.ActivityDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.clazz.tests.generation.ClassDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.component.test.generation.ComponentDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.composite.test.generation.CompositeDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.deployment.test.generation.DeploymentDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.profile.tests.generation.ProfileDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.sequence.tests.generation.SequenceDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.statemachine.tests.generation.StateMachineDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.timing.tests.generation.TimingDiagramGenerateTestsWorkflow;
import org.eclipse.papyrus.uml.diagram.usecase.tests.generation.UseCaseDiagramGenerateTestsWorkflow;


/**
 * @author jc236769
 *
 */
public class GenAllTests {
	public static void main(String[] args) {
		GenerateTestsWorkflow workflow = new GenerateTestsWorkflow();
		workflow.setUriPrefix("platform:/resource");
		workflow.setGitRoot("../../../../../");
		ActivityDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		ClassDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		ComponentDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		CompositeDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		DeploymentDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		ProfileDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		SequenceDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		StateMachineDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		TimingDiagramGenerateTestsWorkflow.runWorkflow(workflow);
		UseCaseDiagramGenerateTestsWorkflow.runWorkflow(workflow);
	}
}
