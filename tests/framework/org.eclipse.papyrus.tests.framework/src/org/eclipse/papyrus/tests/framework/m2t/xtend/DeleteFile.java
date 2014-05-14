package org.eclipse.papyrus.tests.framework.m2t.xtend;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Copies one file in the file system to another location. Performs low-level read/write operations using NIO.
 * 
 * @author Achim Demelt
 */
public class DeleteFile extends AbstractWorkflowComponent {
	private String uri = null;
	private Log log = LogFactory.getLog(getClass());

	public void setUri(String sourceFile) {
		this.uri = sourceFile;
	}

	public void checkConfiguration(Issues issues) {
		if (uri == null) {
			log.error("No sourceFile set.");
		}

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		File fileToDelete = new File(uri);
		if (!fileToDelete.exists()) {
			log.warn("Source file " + uri + " does not exist. Skipping.");
			return;
		}
		boolean delete = fileToDelete.delete();
		if(!delete){
			log.error(uri + " was not deleted!");
		}
	}
}
