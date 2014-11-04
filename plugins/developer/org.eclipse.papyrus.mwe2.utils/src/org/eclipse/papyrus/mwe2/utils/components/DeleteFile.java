/*******************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Cadavid <juan.cadavid@cea.fr> implementation
 ******************************************************************************/
package org.eclipse.papyrus.mwe2.utils.components;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.papyrus.mwe2.utils.messages.Messages;

/**
 * MWE Component to delete a file located at the "uri" slot.
 * 
 */
public class DeleteFile extends AbstractWorkflowComponent {

	private ArrayList<String> uris = new ArrayList<String>();

	private Log log = LogFactory.getLog(getClass());

	/**
	 * @see java.util.ArrayList#add(java.lang.Object)
	 *
	 * @param uri
	 * @return
	 */
	public boolean addUri(String uri) {
		return uris.add(uri);
	}

	public void checkConfiguration(Issues issues) {
		if (uris == null || uris.isEmpty()) {
			log.error(Messages.DeleteFile_0);
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		for (String uri : uris) {

			File fileToDelete = new File(uri);
			if (!fileToDelete.exists()) {
				log.warn(Messages.DeleteFile_1 + uri + Messages.DeleteFile_2);
				return;
			}
			if (!fileToDelete.canWrite()) {
				log.error(Messages.DeleteFile_3 + uri);
				return;
			}
			if (fileToDelete.isDirectory()) {
				log.warn(uri + Messages.DeleteFile_4);
			}
			boolean delete = fileToDelete.delete();
			if (!delete) {
				log.error(uri + Messages.DeleteFile_5);
			}
		}
	}
}
