package org.eclipse.papyrus.cpp.codegen.xtend;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassIncludeClassDeclaration;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassTypeAndEnum;
import org.eclipse.papyrus.cpp.codegen.xtend.CppIncludeUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppPackageHeaderGenerator {
  public static CharSequence generateCode(final org.eclipse.uml2.uml.Package pkg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef PKG_");
    String _fullNameUC = GenUtils.getFullNameUC(pkg);
    _builder.append(_fullNameUC, "");
    _builder.newLineIfNotEmpty();
    _builder.append("#define PKG_");
    String _fullNameUC_1 = GenUtils.getFullNameUC(pkg);
    _builder.append(_fullNameUC_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("Pkg_");
    String _name = pkg.getName();
    _builder.append(_name, "              ");
    _builder.append(" package header");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    org.eclipse.uml2.uml.Package _nestingPackage = pkg.getNestingPackage();
    String _cppOwnerPackageIncludePath = CppClassIncludeClassDeclaration.cppOwnerPackageIncludePath(_nestingPackage);
    String _includeDirective = CppIncludeUtil.includeDirective(_cppOwnerPackageIncludePath);
    _builder.append(_includeDirective, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#ifndef _IN_");
    _builder.newLine();
    _builder.append("#define _IN_");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("#ifndef _OUT_");
    _builder.newLine();
    _builder.append("#define _OUT_");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("#ifndef _INOUT_");
    _builder.newLine();
    _builder.append("#define _INOUT_");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("/* Package dependency header include                        */");
    _builder.newLine();
    {
      EList<org.eclipse.uml2.uml.Package> _usedPackages = GenUtils.getUsedPackages(pkg);
      for(final org.eclipse.uml2.uml.Package p : _usedPackages) {
        String _fullPath = GenUtils.getFullPath(p);
        String _plus = (_fullPath + "/Pkg_");
        String _name_1 = p.getName();
        String _plus_1 = (_plus + _name_1);
        String _plus_2 = (_plus_1 + ".");
        String _headerSuffix = CppCodeGenUtils.getHeaderSuffix();
        String path = (_plus_2 + _headerSuffix);
        _builder.newLineIfNotEmpty();
        String _includeDirective_1 = CppIncludeUtil.includeDirective(path);
        _builder.append(_includeDirective_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _CppIncludeHeader = CppIncludeUtil.CppIncludeHeader(pkg);
    _builder.append(_CppIncludeHeader, "");
    _builder.newLineIfNotEmpty();
    String _openNS = CppGenUtils.openNS(pkg);
    _builder.append(_openNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// Types defined within the package");
    _builder.newLine();
    CharSequence _CppClassTypeAndEnumPackage = CppClassTypeAndEnum.CppClassTypeAndEnumPackage(pkg);
    _builder.append(_CppClassTypeAndEnumPackage, "");
    _builder.newLineIfNotEmpty();
    String _closeNS = CppGenUtils.closeNS(pkg);
    _builder.append(_closeNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("End of Pkg_");
    String _name_2 = pkg.getName();
    _builder.append(_name_2, "              ");
    _builder.append(" package header");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    return _builder;
  }
}
