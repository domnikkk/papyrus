/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Tatiana Fesenko (CEA LIST) - Initial API and implementation
 *	Saadia Dhouib (CEA LIST) - Implementation of loading diagrams from template files  (.uml, .di , .notation)
 *  Christian W. Damus (CEA) - bug 422257
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.wizards.template;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModelUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.uml.diagram.wizards.utils.WizardsHelper;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;


/**
 * The Class InitFromTemplateCommand.
 */
public class InitFromTemplateCommand extends RecordingCommand {

	/** The model-set in which to create the new resources. */
	private ModelSet modelSet;

	/** The my model resource. */
	private final Resource myModelUMLResource;

	/** The my model di resource. */
	private final Resource myModelDiResource;

	/** The my model notation resource. */
	private final Resource myModelNotationResource;

	/** The my template path. */
	private final String myUmlTemplatePath;

	/** The my di template path. */
	private final String myDiTemplatePath;

	/** The my notation template path. */
	private final String myNotationTemplatePath;

	/** The my plugin id. */
	private final String myPluginId;

	/**
	 * Instantiates a new inits the from template command.
	 *
	 * @param editingDomain
	 *            the editing domain
	 * @param diResouceSet
	 *            the di resouce set
	 * @param pluginId
	 *            the plugin id
	 * @param umlTemplatePath
	 *            the uml template path
	 * @param notationTemplatePath
	 *            the notation template path
	 * @param diTemplatePath
	 *            the di template path
	 */
	public InitFromTemplateCommand(TransactionalEditingDomain editingDomain, ModelSet modelSet, String pluginId, String umlTemplatePath, String notationTemplatePath, String diTemplatePath) {
		super(editingDomain);

		this.modelSet = modelSet;
		myModelUMLResource = UmlUtils.getUmlResource(modelSet);
		myModelDiResource = DiModelUtils.getDiResource(modelSet);
		myModelNotationResource = NotationUtils.getNotationResource(modelSet);
		myPluginId = pluginId;
		myUmlTemplatePath = umlTemplatePath;
		myDiTemplatePath = diTemplatePath;
		myNotationTemplatePath = notationTemplatePath;

	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		try {
			initializeFromTemplate();
			// verify if .di file and .notation file were filled in the org.eclipse.papyrus.uml.diagram.wizards.templates extension

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	/**
	 * Initialize from template.
	 *
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private void initializeFromTemplate() throws IOException {
		Resource templateDiResource = null;
		Resource templateNotationResource = null;
		Resource templateUmlResource = null;


		try {
			// 0. initalization of the UML object
			templateUmlResource = loadTemplateResource(myUmlTemplatePath);
			EcoreUtil.resolveAll(templateUmlResource);

			// 1. test if di and notation exist
			// verify if .di file and .notation file were filled in the org.eclipse.papyrus.uml.diagram.wizards.templates extension
			if ((myDiTemplatePath != null) && (myNotationTemplatePath != null)) {
				// 2.1 verify if the .di , .notation and .uml files have the same name
				String diFileName = WizardsHelper.getFileNameWithoutExtension(myDiTemplatePath);
				String umlFileName = WizardsHelper.getFileNameWithoutExtension(myUmlTemplatePath);
				String notationFileName = WizardsHelper.getFileNameWithoutExtension(myNotationTemplatePath);

				if (diFileName.contentEquals(umlFileName) && diFileName.contentEquals(notationFileName)) {

					// 1.2 load di resource
					if (myDiTemplatePath != null) {
						templateDiResource = loadTemplateResource(myDiTemplatePath);
						EcoreUtil.resolveAll(templateDiResource);
					}

					// 1.3 load notation resource
					if (myNotationTemplatePath != null) {
						templateNotationResource = loadTemplateResource(myNotationTemplatePath);
						EcoreUtil.resolveAll(templateNotationResource);
					}

				}
			}

			// 2. copy all elements
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			Collection<EObject> umlObjects = copier.copyAll(templateUmlResource.getContents());
			Collection<EObject> diObjects = (templateDiResource == null) ? null : copier.copyAll(templateDiResource.getContents());
			Collection<EObject> notationObjects = (templateNotationResource == null) ? null : copier.copyAll(templateNotationResource.getContents());
			copier.copyReferences();


			// 3. set copied elements in goods resources
			myModelUMLResource.getContents().addAll(umlObjects);
			if (diObjects != null) {
				myModelDiResource.getContents().addAll(diObjects);
			}
			if (notationObjects != null) {
				myModelNotationResource.getContents().addAll(notationObjects);
			}
		} finally {
			if (templateUmlResource != null) {
				unload(templateUmlResource);
			}
			if (templateNotationResource != null) {
				unload(templateNotationResource);
			}
			if (templateDiResource != null) {
				unload(templateDiResource);
			}
		}
	}



	/**
	 * Load template resource.
	 *
	 * @param path
	 *            the path
	 * @return the resource
	 */
	private Resource loadTemplateResource(String path) {
		java.net.URL templateURL = Platform.getBundle(myPluginId).getResource(path);
		String fullUri = templateURL.getPath();
		URI uri = URI.createPlatformPluginURI(myPluginId + fullUri, true);
		Resource resource = modelSet.getResource(uri, true);
		if (resource.isLoaded()) {
			return resource;
		}
		return null;
	}


	private void unload(Resource resource) {
		resource.unload();
		resource.eAdapters().clear();
		modelSet.getResources().remove(resource);
	}


}
