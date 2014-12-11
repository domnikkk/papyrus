/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.dsml.validation.generator.xtend;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.codegen.base.ProjectBasedFileAccess;

/**
 * Entry point of the 'Generate' generation module.
 */
public class Generate {

	/**
	 * 
	 */
	private static final String SRC = "src"; //$NON-NLS-1$

	/**
	 * This method is used to launch the generation from a standalone application.
	 * The standalone invocation has not been tested (and is currently disabled).
	 *
	 * @param args
	 *            Arguments of the generation.
	 */
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Arguments not valid : {model, folder}."); //$NON-NLS-1$
		}
		else {
			URI modelURI = URI.createFileURI(args[0]);
			// the following variables are unused, since the code below is in comments as the class JavaIoFileSystemAccess
			// is based on Java 1.7 code and has therefore only available in Papyrus 1.1 or higher.
			
			@SuppressWarnings("unused")
			File folder = new File(args[1]);

			ResourceSet resourceSet = new ResourceSetImpl();
			@SuppressWarnings("unused")
			Resource resource = resourceSet.createResource(modelURI);

			/*
			JavaIoFileSystemAccess fsa =
					new JavaIoFileSystemAccess();
			fsa.setOutputPath(folder);
			ClientSelectorGen.generate(resource, fsa);
			ConstraintGen.generate(resource, fsa);
			*/
		}
	}

	/**
	 * Launches the generation described by this instance.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             This will be thrown if any of the output files cannot be saved to disk.
	 */
	public static void generateClientSelector(Resource input, IProject targetProject, IProgressMonitor monitor) throws IOException {
		ProjectBasedFileAccess fsa = new ProjectBasedFileAccess(targetProject, SRC);
		ClientSelectorGen.generate(input, fsa);
	}

	/**
	 * Launches the generation described by this instance.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             This will be thrown if any of the output files cannot be saved to disk.
	 */
	public static void generateConstraints(Resource input, IProject targetProject, IProgressMonitor monitor) throws IOException {
		ProjectBasedFileAccess fsa = new ProjectBasedFileAccess(targetProject, SRC);
		ConstraintGen.generate(input, fsa);
	}
}
