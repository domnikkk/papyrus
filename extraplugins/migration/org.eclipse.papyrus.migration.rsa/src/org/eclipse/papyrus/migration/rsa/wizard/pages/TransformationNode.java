/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.wizard.pages;

import java.util.Collection;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardNode;
import org.eclipse.papyrus.migration.rsa.wizard.TransformationConfigWizard;
import org.eclipse.swt.graphics.Point;

public class TransformationNode implements IWizardNode {

	Collection<Object> selectedFiles;

	IWizard currentNode;


	public TransformationNode(Collection<Object> selectedFiles) {
		this.selectedFiles = selectedFiles;
	}

	public void setSelectedFiles(Collection<Object> selectedFiles) {
		this.selectedFiles = selectedFiles;
	}

	/**
	 * Returns the extent of the wizard for this node.
	 * 
	 * If the content has not yet been created, calling this method does not
	 * trigger the creation of the wizard. This allows this node to suggest
	 * an extent in advance of actually creating the wizard.
	 */
	@Override
	public Point getExtent() {
		return new Point(-1, -1);
	}

	/**
	 * Returns the wizard this node stands for.
	 * 
	 * If the content has not been created beforehand, calling this method
	 * triggers the creation of the wizard and caches it so that the
	 * identical wizard object is returned on subsequent calls.
	 */
	@Override
	public IWizard getWizard() {
		if (currentNode == null) {
			currentNode = new TransformationConfigWizard(selectedFiles);
		}

		return currentNode;
	}

	/**
	 * Returns whether a wizard has been created for this node.
	 */
	@Override
	public boolean isContentCreated() {
		return currentNode != null;
	}

	/**
	 * Disposes the wizard managed by this node. Does nothing if the wizard
	 * has not been created.
	 * 
	 * This is the last message that should ever be sent to this node.
	 */
	@Override
	public void dispose() {

	}

}
