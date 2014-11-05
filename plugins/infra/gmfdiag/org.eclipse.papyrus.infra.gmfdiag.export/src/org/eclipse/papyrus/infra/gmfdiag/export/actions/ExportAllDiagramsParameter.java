/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.export.actions;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.papyrus.infra.core.resource.ModelSet;

/**
 * Class to wrap all parameters to export all diagrams.
 *
 * @author Gabriel Pascual
 */
public class ExportAllDiagramsParameter {


	/** The export format. */
	private ImageFileFormat exportFormat = ImageFileFormat.getDefaultImageFormat();

	/** The output directory. */
	private IResource outputDirectory = null;

	/** The di file uri. */
	private URI diFileUri = null;

	/** The qualified name. */
	private boolean qualifiedName = false;

	/** The model set. */
	private ModelSet modelSet = null;

	/**
	 * Constructor.
	 *
	 * @param diFileUri
	 *            the di file uri
	 * @param outputDirectory
	 *            the output directory
	 * @param exportFormat
	 *            the export format
	 * @param qualifiedName
	 *            the qualified name
	 */
	public ExportAllDiagramsParameter(URI diFileUri) {
		super();
		setDiFileUri(diFileUri);

	}

	public ExportAllDiagramsParameter(ModelSet modelSet) {
		super();
		setModelSet(modelSet);

	}

	/**
	 * Gets the export format.
	 *
	 * @return the exportFormat
	 */
	public ImageFileFormat getExportFormat() {
		return exportFormat;
	}

	/**
	 * Sets the export format.
	 *
	 * @param exportFormat
	 *            the exportFormat to set
	 */
	public void setExportFormat(String exportFormat) {
		this.exportFormat = ImageFileFormat.resolveImageFormat(exportFormat);
	}

	/**
	 * Gets the output directory.
	 *
	 * @return the output Directory path
	 */
	public String getOutputDirectoryPath() {
		IPath location = outputDirectory.getLocation();
		if (location == null) {
			location = outputDirectory.getFullPath();
		}
		return location.toString();
	}

	/**
	 * Sets the output directory.
	 *
	 * @param outputDirectory
	 *            the outputDirectory to set
	 */
	public void setOutputDirectory(IResource outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	/**
	 * Gets the di file uri.
	 *
	 * @return the diFileUri
	 */
	public URI getDiFileUri() {
		return diFileUri;
	}

	/**
	 * Sets the di file uri.
	 *
	 * @param diFileUri
	 *            the diFileUri to set
	 */
	private void setDiFileUri(URI diFileUri) {
		this.diFileUri = diFileUri;
	}

	/**
	 * Checks if is qualified name.
	 *
	 * @return the qualifiedName
	 */
	public boolean isQualifiedName() {
		return qualifiedName;
	}

	/**
	 * Sets the qualified name.
	 *
	 * @param qualifiedName
	 *            the qualifiedName to set
	 */
	public void setQualifiedName(boolean qualifiedName) {
		this.qualifiedName = qualifiedName;
	}

	/**
	 * Gets the model set.
	 *
	 * @return the modelSet
	 */
	public ModelSet getModelSet() {
		return modelSet;
	}

	/**
	 * Sets the model set.
	 *
	 * @param modelSet
	 *            the modelSet to set
	 */
	private void setModelSet(ModelSet modelSet) {
		this.modelSet = modelSet;
	}



}
