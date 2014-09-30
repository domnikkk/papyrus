package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.ToolFactory;
import org.eclipse.cdt.core.formatter.CodeFormatter;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.papyrus.cpp.codegen.Activator;
import org.eclipse.papyrus.cpp.codegen.Messages;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.framework.Bundle;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public abstract class CppFileGenerator {
  public static void generateFile(final IContainer owner, final String filename, final String content, final boolean force) {
    try {
      IFile file = null;
      if ((owner instanceof IProject)) {
        IFile _file = ((IProject) owner).getFile(filename);
        file = _file;
      } else {
        if ((owner instanceof IFolder)) {
          IFile _file_1 = ((IFolder) owner).getFile(filename);
          file = _file_1;
        } else {
        }
      }
      boolean _notEquals = (!Objects.equal(file, null));
      if (_notEquals) {
        String _format = CppFileGenerator.format(content);
        CppFileGenerator.createFile(file, _format, force);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void createFile(final IFile file, final String content, final boolean force) throws CoreException {
    boolean _and = false;
    boolean _exists = file.exists();
    if (!_exists) {
      _and = false;
    } else {
      _and = force;
    }
    if (_and) {
      URI locationURI = file.getLocationURI();
      boolean _notEquals = (!Objects.equal(locationURI, null));
      if (_notEquals) {
        IFileStore store = EFS.getStore(locationURI);
        OutputStream os = store.openOutputStream(0, null);
        try {
          byte[] _bytes = content.getBytes();
          os.write(_bytes);
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            String _message = e.getMessage();
            String _plus = ("C++ code generation: " + _message);
            throw new RuntimeException(_plus);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } else {
      boolean _and_1 = false;
      boolean _exists_1 = file.exists();
      if (!_exists_1) {
        _and_1 = false;
      } else {
        _and_1 = (!force);
      }
      if (_and_1) {
      } else {
        byte[] _bytes_1 = content.getBytes();
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes_1);
        file.create(_byteArrayInputStream, true, null);
      }
    }
  }
  
  /**
   * Apply the user's currently selected formatting options to the input content.  Return the
   * input String in case of error.
   */
  public static String format(final String content) {
    Bundle _bundle = Platform.getBundle(CCorePlugin.PLUGIN_ID);
    boolean _equals = Objects.equal(_bundle, null);
    if (_equals) {
      return content;
    }
    CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(null);
    IDocument doc = new Document(content);
    String _get = doc.get();
    String _get_1 = doc.get();
    int _length = _get_1.length();
    TextEdit edit = codeFormatter.format(CodeFormatter.K_TRANSLATION_UNIT, _get, 0, _length, 0, null);
    boolean _equals_1 = Objects.equal(edit, null);
    if (_equals_1) {
      Activator.log.debug(Messages.CppModelElementsCreator_CannotFormatContent);
      return content;
    }
    try {
      edit.apply(doc);
      return doc.get();
    } catch (final Throwable _t) {
      if (_t instanceof MalformedTreeException) {
        final MalformedTreeException e = (MalformedTreeException)_t;
        Activator.log.error(e);
      } else if (_t instanceof BadLocationException) {
        final BadLocationException e_1 = (BadLocationException)_t;
        Activator.log.error(e_1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return content;
  }
}
