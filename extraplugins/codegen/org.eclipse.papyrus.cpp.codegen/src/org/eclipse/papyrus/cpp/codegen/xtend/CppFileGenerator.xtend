package org.eclipse.papyrus.cpp.codegen.xtend

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.OutputStream
import org.eclipse.core.filesystem.EFS
import org.eclipse.core.filesystem.IFileStore
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.eclipse.cdt.core.CCorePlugin
import org.eclipse.cdt.core.formatter.CodeFormatter
import org.eclipse.cdt.core.ToolFactory
import org.eclipse.jface.text.IDocument
import org.eclipse.jface.text.Document
import org.eclipse.text.edits.TextEdit
import org.eclipse.papyrus.cpp.codegen.Activator
import org.eclipse.papyrus.cpp.codegen.Messages
import org.eclipse.text.edits.MalformedTreeException
import org.eclipse.jface.text.BadLocationException

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
abstract class CppFileGenerator {
	
	static def generateFile(IContainer owner, String filename, String content, boolean force) {
		var IFile file = null;
		if (owner instanceof IProject) {
			file = (owner as IProject).getFile(filename)
		} else if(owner instanceof IFolder) {
			file = (owner as IFolder).getFile(filename)
		} else {
			// undefined
		}
		
		if(file != null) {
			createFile(file, format(content), force);
		}
	}
	
	static def void createFile(IFile file, String content, boolean force) throws CoreException {
		if (file.exists() && force) {
			// file.delete(true,true,null);
			// YT - deleting files produce inconsistency in SVN working copies
			var locationURI = file.getLocationURI();
			if(locationURI != null) {
				var IFileStore store = EFS.getStore(locationURI);
				var OutputStream os = store.openOutputStream(0, null);
				try {
					os.write(content.getBytes());
				} catch (IOException e) {
					throw new RuntimeException ("C++ code generation: " + e.getMessage()); //$NON-NLS-1$
				}
			}
			// file.setContents(new ByteArrayInputStream(content.getBytes()),
			// true, true, null);
		} else if(file.exists() && !(force)) {
			// the file is not updated
		} else {
			// the file does not exists
			file.create(new ByteArrayInputStream(content.getBytes()), true, null);
		}
	}	
	
	/**
	 * Apply the user's currently selected formatting options to the input content.  Return the
	 * input String in case of error.
	 */
	static def String format(String content) {

		// do nothing if the CDT plugin is not loaded
		if (Platform.getBundle(CCorePlugin.PLUGIN_ID) == null)
			return content;

		var CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(null);
		var IDocument doc = new Document(content);

		var TextEdit edit = codeFormatter.format(CodeFormatter.K_TRANSLATION_UNIT, doc.get(), 0, doc.get().length(), 0, null);

		if (edit == null) {
			Activator.log.debug(Messages.CppModelElementsCreator_CannotFormatContent);
			return content;
		}

		try {
			edit.apply(doc);
			return doc.get();
		} catch (MalformedTreeException e) {
			Activator.log.error(e);
		} catch (BadLocationException e) {
			Activator.log.error(e);
		}

		return content;
	}
}