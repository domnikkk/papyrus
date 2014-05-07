/*******************************************************************************
 * Copyright (c) 2013 CEA LIST
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Ansgar Radermacher - Initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.cpp.codegen.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.acceleo.AcceleoDriver;
import org.eclipse.papyrus.acceleo.ui.handlers.CmdHandler;
import org.eclipse.papyrus.cpp.codegen.transformation.CppModelElementsCreator;
import org.eclipse.papyrus.cpp.codegen.ui.Activator;
import org.eclipse.papyrus.cpp.codegen.utils.ClassUtils;
import org.eclipse.papyrus.cpp.codegen.utils.LocateCppProject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * Handler for C++ code generation
 */
public class GenerateCodeHandler extends CmdHandler {

	// ------------------------------------------------------------------------
	// Execution
	// ------------------------------------------------------------------------

	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		
		if (selectedEObject instanceof Package || selectedEObject instanceof Classifier) {
			URI uri = selectedEObject.eResource().getURI();

			// URIConverter uriConverter = resource.getResourceSet().getURIConverter();
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			if(uri.segmentCount() < 2) {
				return false;
			}
			IProject modelProject = root.getProject(uri.segment(1));
			return modelProject.exists();
		}

		return false;
	}

	/**
	 * Generate code for a passed packageable element and the elements required by it (in the sense of #included statements)
	 * 
	 * @param mec model elements creator 
	 * @param pe the element that should be generated
	 * @param alreadyHandled list of packageable elements for which code has already been generated. 
	 * @param recurse if the passed packageableElement is a package, generate code for its contents (recursively).
	 */
	public void generate(CppModelElementsCreator mec, PackageableElement pe, EList<PackageableElement> alreadyHandled, boolean recurse) {
		IContainer srcPkg = mec.getContainer(pe);
		try {
			alreadyHandled.add(pe);
			mec.createPackageableElement(srcPkg, null, pe, false);
		}
		catch (CoreException coreException) {
			Activator.log.error(coreException);
		}
		finally {
			// Refresh the container for the newly created files.  This needs to be done even
				// during error because of the possibility for partial results.
			try {
				srcPkg.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch(CoreException e) {
				Activator.log.error(e);
 			}
		}
		
		if (pe instanceof Classifier) {
			EList<Classifier> requiredClassifiers = ClassUtils.includedClassifiers((Classifier) pe);
			for (Classifier requiredClassifier : requiredClassifiers) {
				if (!alreadyHandled.contains(requiredClassifier)) {
					generate(mec, requiredClassifier, alreadyHandled, false);
				}
			}
		}
		// owning package is required by generated code.
		Package owningPackage = pe.getNearestPackage();
		if ((owningPackage != null) && (owningPackage != pe)) {
			if (!alreadyHandled.contains(owningPackage)) {
				generate(mec, owningPackage, alreadyHandled, false);
			}
		}
		if ((pe instanceof Package) && recurse) {
			// Continue generation parsing package contents
			for(PackageableElement currentElement : ((Package) pe).getPackagedElements()) {
				generate(mec, currentElement, alreadyHandled, recurse);
			}
		}
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {

		if(selectedEObject instanceof PackageableElement) {
			PackageableElement pe = (PackageableElement)selectedEObject;

			IProject modelProject = LocateCppProject.getTargetProject(pe, true);
			if(modelProject == null) {
				return null;
			}
			
			// get the container for the current element
			AcceleoDriver.clearErrors();
			CppModelElementsCreator mec = new CppModelElementsCreator(modelProject);
			generate(mec, pe, new BasicEList<PackageableElement>(), true);
			
			if (AcceleoDriver.hasErrors()) {
				MessageDialog.openInformation(new Shell(), "Errors during code generation", //$NON-NLS-1$
						"Errors occured during code generation. Please check the error log"); //$NON-NLS-1$
			}	
		}
		return null;
	}
}
