/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - Add support for updating Oomph setup models
 *  Christian W. Damus - Add support for updating multiple development streams in a setup model
 *  
 *****************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.handler;

import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

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
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.releng.tools.internal.Activator;
import org.eclipse.papyrus.releng.tools.internal.Messages;
import org.eclipse.papyrus.releng.tools.internal.popup.actions.OomphSetupUpdater;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class UpdateOomphSetupHandler extends AbstractDependencyHandler {

	@Override
	protected void updateFile(IFile setupFile, IFile aggregationBuildFile, Shell activeShell) throws CoreException {

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

		if (resource.getContents().size() == 0) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The b3aggr resource is empty")); //$NON-NLS-1$
		}

		EObject root = resource.getContents().get(0);
		if (root instanceof Aggregation) {
			Aggregation aggregation = (Aggregation) root;
			EList<Contribution> allContributions = aggregation.getAllContributions(true);

			String streamName = promptForStreamName(activeShell, setupFile);
			if (streamName == null) {
				// Cancel
				return;
			}

			OomphSetupUpdater setupUpdater = new OomphSetupUpdater(setupFile, allContributions, streamName);
			setupUpdater.updateDocument();
		}

		MessageDialog.openInformation(activeShell, Messages.UpdateRMapAction_mapWasUpdatedTitle, NLS.bind(Messages.UpdateRMapAction_mapWasUpdated, setupFile.getFullPath().toString(), aggregationBuildFile.getFullPath().toString()));
	}

	protected String promptForStreamName(Shell parentShell, IFile setupFile) throws CoreException {
		final Set<String> repositoryLists = new LinkedHashSet<String>();

		try (InputStream input = setupFile.getContents()) {
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			parser.parse(input, new DefaultHandler() {
				int inTarglet;
				String repositoryListName;
				boolean foundAnnotation;

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
					if ("targlet".equals(qName)) { //$NON-NLS-1$
						if ((inTarglet > 0) || "${eclipse.target.platform}".equals(attributes.getValue("activeRepositoryList"))) { //$NON-NLS-1$ //$NON-NLS-2$
							// This is a stream-switching targlet. Get its repository names
							inTarglet++;
						}
					} else if ((inTarglet > 0) && "repositoryList".equals(qName)) {
						String listName = attributes.getValue("name"); //$NON-NLS-1$
						if (listName != null && !listName.isEmpty()) {
							repositoryListName = listName;
							foundAnnotation = false;
						}
					} else if ("annotation".equals(qName) && OomphSetupUpdater.ANNOTATION_SOURCE.equals(attributes.getValue("source"))) { //$NON-NLS-1$ //$NON-NLS-2$
						foundAnnotation = true;
					}
				}

				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
					if ("targlet".equals(qName)) { //$NON-NLS-1$
						inTarglet = Math.max(inTarglet - 1, 0);
					} else if ("repositoryList".equals(qName) && (repositoryListName != null)) { //$NON-NLS-1$
						if (foundAnnotation) {
							repositoryLists.add(repositoryListName);
						}
						repositoryListName = null;
						foundAnnotation = false;
					}
				}
			});
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to scan setup model for available streams.", e));
		}

		if (repositoryLists.isEmpty()) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No streams are defined in the selected setup model."));
		}

		String first = repositoryLists.iterator().next();
		if (repositoryLists.size() == 1) {
			return first;
		}

		ILabelProvider labels = new LabelProvider();
		ListDialog dlg = new ListDialog(parentShell);
		dlg.setContentProvider(ArrayContentProvider.getInstance());
		dlg.setLabelProvider(labels);
		dlg.setInput(repositoryLists);
		dlg.setInitialSelections(new Object[] { repositoryLists.iterator().next() });
		dlg.setTitle("Select Stream");
		dlg.setMessage("Select the development stream to update.");
		labels.dispose();

		dlg.open();
		Object[] result = dlg.getResult();
		return ((result == null) || (result.length == 0)) ? null : (String) result[0];
	}
}
