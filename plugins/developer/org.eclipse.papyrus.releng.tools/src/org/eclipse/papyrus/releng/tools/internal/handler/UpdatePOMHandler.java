/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.handler;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.transformer.TransformationManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.releng.tools.internal.Activator;
import org.eclipse.papyrus.releng.tools.internal.Messages;
import org.eclipse.papyrus.releng.tools.internal.popup.actions.PomUpdater;
import org.eclipse.swt.widgets.Shell;


public class UpdatePOMHandler extends AbstractDependencyHandler {

	@Override
	protected void updateFile(IFile pomFile, IFile aggregationBuildFile, Shell activeShell) throws CoreException {

		// make sure the EPackage is initialized
		AggregatorPackage.eINSTANCE.getEFactoryInstance();
		URI uri = URI.createPlatformResourceURI(aggregationBuildFile.getFullPath().toString(), true);

		final ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;
		try {
			// with the latest version of the metamodel
			resource = resourceSet.getResource(uri, true);
			resource.load(null);
		} catch (Exception e) {
			// with an older version of the metamodel
			try {
				TransformationManager transformationManager = new TransformationManager(uri);
				resource = transformationManager.transformResource(true);
			} catch (Exception e1) {
				throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error loading b3aggr. Make sure you have the latest version of B3 installed. : " + e.getLocalizedMessage(), e1)); //$NON-NLS-1$
			}
		}

		if(resource.getContents().size() == 0) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The b3aggr resource is empty")); //$NON-NLS-1$
		}

		EObject root = resource.getContents().get(0);
		if(root instanceof Aggregation) {
			Aggregation aggregation = (Aggregation)root;
			EList<Contribution> allContributions = aggregation.getAllContributions(true);
			PomUpdater pomUpdater = new PomUpdater(pomFile, allContributions);
			pomUpdater.updateDocument();
		}

		MessageDialog.openInformation(activeShell, Messages.UpdateRMapAction_mapWasUpdatedTitle, NLS.bind(Messages.UpdateRMapAction_mapWasUpdated, pomFile.getFullPath().toString(), aggregationBuildFile.getFullPath().toString()));
	}

}
