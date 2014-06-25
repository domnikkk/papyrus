/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package com.cea.qompass.architect.optimization.ui.handler;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.cea.qompass.architect.optimization.codegen.mwe.GenerateOptimizationTargetWorkflow;


// TODO: Auto-generated Javadoc
/**
 * The Class GenerateRTMapsCodeCommand.
 */
public class GenerateMWEOptimizationCodeCommand extends AbstractTransactionalCommand {

	/** The transactional edition domain. */
	private final TransactionalEditingDomain domain;

	/** The selected element. */
	private final EObject selectedElement;

	/** The optimization target folder path. */
	private final String optimizationTargetFolderPath;


	/**
	 * Instantiates a new generate rt maps code command.
	 * 
	 * @param label
	 *        the label
	 * @param domain
	 *        the domain
	 * @param selectedElement
	 *        the selected element
	 * @param optimizationTargetFolderPath
	 *        the rtmaps target folder path
	 */
	public GenerateMWEOptimizationCodeCommand(String label, TransactionalEditingDomain domain, EObject selectedElement, String optimizationTargetFolderPath) {
		super(domain, label, Collections.EMPTY_LIST);
		this.domain = domain;
		this.selectedElement = selectedElement;
		this.optimizationTargetFolderPath = optimizationTargetFolderPath;
	}


	/**
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
	 *      org.eclipse.core.runtime.IAdaptable)
	 * 
	 * @param monitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub
		//We create the MWE context
		WorkflowContextImpl workflowContext = new WorkflowContextImpl();
		workflowContext.put("selectedOptimizationProblem", this.selectedElement);
		
		//We invoke the MWE Workflow
		GenerateOptimizationTargetWorkflow workflow = new GenerateOptimizationTargetWorkflow();
		workflow.setOptimizationTargetUri(this.optimizationTargetFolderPath);
		workflow.run(workflowContext);
		
		//System.err.println("Model Exlorer generation menu RTMaps");

		//Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		//final ProgressMonitorDialog monitordialog = new ProgressMonitorDialog(shell);
		
//		Resource resource = new ResourceSetImpl().getResource(URI.createURI("platform:/plugin/com.cea.qompass.architect.optimization.codegen/demo/optimizationIntermediateModel.uml"), false);
//		Model im = (Model) resource.getContents().get(0);
//		GenerateOptimizationData.generate(im);
//		
		
		//GenerateOptimizationData.generate((Model) selectedElement);
		/*
		 * try {
		 * 
		 * monitordialog.run(true, true, new IRunnableWithProgress() {
		 * 
		 * 
		 * public void run(IProgressMonitor monitor)
		 * throws InvocationTargetException, InterruptedException {
		 * monitor.beginTask("Generating Acceleo files", 100);
		 * AcceleoRTMapsCodeGenerator codeGenerator = new AcceleoRTMapsCodeGenerator();
		 * codeGenerator.runAcceleoTransformation(selectedElement, rtmapsTargetFolderPath);
		 * monitor.done();
		 * }
		 * 
		 * });
		 * 
		 * } catch (InvocationTargetException e) {
		 * // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * } catch (InterruptedException e) {
		 * // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * }
		 */


		return CommandResult.newOKCommandResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {

		return (selectedElement != null && optimizationTargetFolderPath != null && domain != null);
	}
}
