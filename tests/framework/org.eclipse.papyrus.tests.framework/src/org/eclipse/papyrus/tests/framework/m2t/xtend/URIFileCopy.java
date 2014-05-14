package org.eclipse.papyrus.tests.framework.m2t.xtend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Copies one file in the file system to another location. Performs low-level read/write operations using NIO.
 * 
 * @author Achim Demelt
 */
public class URIFileCopy extends AbstractWorkflowComponent {
	private String sourceFile = null;
	private String targetFile = null;

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	public void setTargetFile(String targetFile) {
		this.targetFile = targetFile;
	}

	public void checkConfiguration(Issues issues) {
		if (sourceFile == null) {
			issues.addError("No sourceFile set.");
		}
		if (targetFile == null) {
			issues.addError("No targetFile set.");
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		issues.addInfo("Copying file " + sourceFile  + "...");
		ClassLoader classLoader = this.getClass().getClassLoader();
	    File classpathRoot = new File(classLoader.getResource("").getPath());

	    String workingPath = classpathRoot.getPath();
	    
		try {
			File source = new File(URI.createURI(sourceFile).toFileString());
			File target = new File(URI.createURI(targetFile).toFileString());

			if (!source.exists()) {
				issues.addWarning(this, "Source file " + sourceFile + " does not exist. Skipping.");
				return;
			}
			if (!target.exists()) {
				target.createNewFile();
			}

			FileChannel sourceChannel = null;
			FileChannel destinationChannel = null;
			try {
				sourceChannel = new FileInputStream(source).getChannel();
				destinationChannel = new FileOutputStream(target).getChannel();
				destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			}
			finally {
				if (sourceChannel != null) {
					sourceChannel.close();
				}
				if (destinationChannel != null) {
					destinationChannel.close();
				}
			}
		}
		catch (IOException x) {
			issues.addError(this, "Cannot perform I/O.", x);
		}
	}
}
