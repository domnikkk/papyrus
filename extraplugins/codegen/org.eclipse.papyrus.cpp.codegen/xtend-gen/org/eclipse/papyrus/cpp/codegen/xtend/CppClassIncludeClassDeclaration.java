package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.C_Cpp.CppRoot;
import org.eclipse.papyrus.C_Cpp.External;
import org.eclipse.papyrus.C_Cpp.NoCodeGen;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.ClassUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassIncludeDeclaration;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassIncludeClassDeclaration {
  public static String cppOwnerPackageIncludePath(final org.eclipse.uml2.uml.Package pkg) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(pkg, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _hasStereotype = GenUtils.hasStereotype(pkg, CppRoot.class);
      boolean _not = (!_hasStereotype);
      _and = _not;
    }
    if (_and) {
      String _fullPath = GenUtils.getFullPath(pkg);
      String _plus = (_fullPath + "/Pkg_");
      String _name = pkg.getName();
      String _plus_1 = (_plus + _name);
      return (_plus_1 + ".h");
    } else {
      return null;
    }
  }
  
  public static Iterable<String> CppClassAllIncludesDeclarationBody(final Classifier classifier) {
    EList<Classifier> _typesViaDependencies = GenUtils.getTypesViaDependencies(classifier);
    return CppClassIncludeClassDeclaration.cppClassAllIncludes(classifier, _typesViaDependencies);
  }
  
  public static Iterable<String> cppClassAllIncludes(final Classifier classifier, final EList<Classifier> list) {
    List<String> newList = new ArrayList<String>();
    for (final Classifier cl : list) {
      boolean _or = false;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(cl, classifier));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _hasStereotype = GenUtils.hasStereotype(cl, NoCodeGen.class);
        boolean _not = (!_hasStereotype);
        _and = _not;
      }
      if (_and) {
        _or = true;
      } else {
        boolean _hasStereotype_1 = GenUtils.hasStereotype(cl, External.class);
        _or = _hasStereotype_1;
      }
      if (_or) {
        boolean _or_1 = false;
        if ((cl instanceof Enumeration)) {
          _or_1 = true;
        } else {
          _or_1 = (cl instanceof PrimitiveType);
        }
        if (_or_1) {
          boolean _and_1 = false;
          Element _owner = cl.getOwner();
          boolean _notEquals_1 = (!Objects.equal(_owner, null));
          if (!_notEquals_1) {
            _and_1 = false;
          } else {
            Element _owner_1 = cl.getOwner();
            _and_1 = (_owner_1 instanceof org.eclipse.uml2.uml.Package);
          }
          if (_and_1) {
            Element _owner_2 = cl.getOwner();
            String includePath = CppClassIncludeClassDeclaration.cppOwnerPackageIncludePath(((org.eclipse.uml2.uml.Package) _owner_2));
            boolean _contains = newList.contains(includePath);
            boolean _not_1 = (!_contains);
            if (_not_1) {
              newList.add(includePath);
            }
          } else {
          }
        } else {
          List<String> _cppClassIncludes = CppClassIncludeDeclaration.cppClassIncludes(cl);
          newList.addAll(_cppClassIncludes);
        }
      } else {
      }
    }
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String str) {
        return Boolean.valueOf((!Objects.equal(str, null)));
      }
    };
    return IterableExtensions.<String>filter(newList, _function);
  }
  
  public static Iterable<String> CppClassAllIncludes(final Classifier clazz) {
    EList<Classifier> _includedClassifiers = ClassUtils.includedClassifiers(clazz);
    return CppClassIncludeClassDeclaration.cppClassAllIncludes(clazz, _includedClassifiers);
  }
}
