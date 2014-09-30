package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.cpp.codegen.Activator;
import org.eclipse.papyrus.cpp.codegen.transformation.CppModelElementsCreator;
import org.eclipse.papyrus.cpp.codegen.utils.ClassUtils;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppCodeGenerator {
  /**
   * Generate code for a passed packageable element and the elements required by it (in the sense of #included statements)
   * 
   * @param mec model elements creator
   * @param pe the element that should be generated
   * @param alreadyHandled list of packageable elements for which code has already been generated.
   * @param recurse if the passed packageableElement is a package, generate code for its contents (recursively).
   */
  public static Object generate(final CppModelElementsCreator mec, final PackageableElement pe, final EList<PackageableElement> alreadyHandled, final boolean recurse) {
    final IContainer srcPkg = mec.getContainer(pe);
    try {
      alreadyHandled.add(pe);
      mec.createPackageableElement(srcPkg, null, pe, false);
    } catch (final Throwable _t) {
      if (_t instanceof CoreException) {
        final CoreException coreException = (CoreException)_t;
        Activator.log.error(coreException);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    } finally {
      try {
        srcPkg.refreshLocal(IResource.DEPTH_INFINITE, null);
      } catch (final Throwable _t_1) {
        if (_t_1 instanceof CoreException) {
          final CoreException e = (CoreException)_t_1;
          Activator.log.error(e);
        } else {
          throw Exceptions.sneakyThrow(_t_1);
        }
      }
    }
    if ((pe instanceof Classifier)) {
      EList<Classifier> requiredClassifiers = ClassUtils.includedClassifiers(((Classifier) pe));
      for (final Classifier requiredClassifier : requiredClassifiers) {
        boolean _contains = alreadyHandled.contains(requiredClassifier);
        boolean _not = (!_contains);
        if (_not) {
          CppCodeGenerator.generate(mec, requiredClassifier, alreadyHandled, false);
        }
      }
    }
    org.eclipse.uml2.uml.Package owningPackage = pe.getNearestPackage();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(owningPackage, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(owningPackage, pe));
      _and = _notEquals_1;
    }
    if (_and) {
      boolean _contains_1 = alreadyHandled.contains(owningPackage);
      boolean _not_1 = (!_contains_1);
      if (_not_1) {
        CppCodeGenerator.generate(mec, owningPackage, alreadyHandled, false);
      }
    }
    boolean _and_1 = false;
    if (!(pe instanceof org.eclipse.uml2.uml.Package)) {
      _and_1 = false;
    } else {
      _and_1 = recurse;
    }
    if (_and_1) {
      EList<PackageableElement> _packagedElements = ((org.eclipse.uml2.uml.Package) pe).getPackagedElements();
      for (final PackageableElement currentElement : _packagedElements) {
        CppCodeGenerator.generate(mec, currentElement, alreadyHandled, recurse);
      }
    }
    return null;
  }
}
