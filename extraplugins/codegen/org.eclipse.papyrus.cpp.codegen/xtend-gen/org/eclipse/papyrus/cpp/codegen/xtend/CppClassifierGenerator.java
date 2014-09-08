package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.C_Cpp.ExternLibrary;
import org.eclipse.papyrus.C_Cpp.External;
import org.eclipse.papyrus.C_Cpp.Include;
import org.eclipse.papyrus.C_Cpp.ManualGeneration;
import org.eclipse.papyrus.C_Cpp.NoCodeGen;
import org.eclipse.papyrus.C_Cpp.Template;
import org.eclipse.papyrus.C_Cpp.Union;
import org.eclipse.papyrus.acceleo.AcceleoDriver;
import org.eclipse.papyrus.acceleo.GenUtils;
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenUtils;
import org.eclipse.papyrus.cpp.codegen.transformation.CppModelElementsCreator;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppAttribute;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassAttributesDeclaration;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassFriendDeclaration;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassIncludeClassDeclaration;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassInheritedDeclarations;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassOperationsDeclaration;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassOperationsImplementation;
import org.eclipse.papyrus.cpp.codegen.xtend.CppClassTypeAndEnum;
import org.eclipse.papyrus.cpp.codegen.xtend.CppDocumentation;
import org.eclipse.papyrus.cpp.codegen.xtend.CppFileGenerator;
import org.eclipse.papyrus.cpp.codegen.xtend.CppIncludeUtil;
import org.eclipse.papyrus.cpp.codegen.xtend.CppOperations;
import org.eclipse.papyrus.cpp.codegen.xtend.CppTemplates;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.profile.standard.Create;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassifierGenerator extends CppFileGenerator {
  public static void generate(final IContainer container, final Classifier classifier, final String commentHeader) {
    try {
      boolean _hasStereotype = GenUtils.hasStereotype(classifier, ManualGeneration.class);
      if (_hasStereotype) {
        ManualGeneration mg = UMLUtil.<ManualGeneration>getStereotypeApplication(classifier, ManualGeneration.class);
        Include cppInclude = UMLUtil.<Include>getStereotypeApplication(classifier, Include.class);
        String _header = cppInclude.getHeader();
        String _evaluate = AcceleoDriver.evaluate(_header, classifier, null);
        String fileContentH = (commentHeader + _evaluate);
        String _name = classifier.getName();
        String _plus = (_name + CppModelElementsCreator.DOT);
        String _headerSuffix = CppCodeGenUtils.getHeaderSuffix();
        final String fileNameH = (_plus + _headerSuffix);
        CppFileGenerator.generateFile(container, fileNameH, fileContentH, true);
        String _preBody = cppInclude.getPreBody();
        String _evaluate_1 = AcceleoDriver.evaluate(_preBody, classifier, null);
        String _plus_1 = (commentHeader + _evaluate_1);
        String _plus_2 = (_plus_1 + GenUtils.NL);
        String _body = cppInclude.getBody();
        String _evaluate_2 = AcceleoDriver.evaluate(_body, classifier, null);
        String _plus_3 = (_plus_2 + _evaluate_2);
        final String fileContentB = (_plus_3 + GenUtils.NL);
        String _extensionBody = mg.getExtensionBody();
        String ext = GenUtils.maskNull(_extensionBody);
        int _length = ext.length();
        boolean _equals = (_length == 0);
        if (_equals) {
          String _bodySuffix = CppCodeGenUtils.getBodySuffix();
          ext = _bodySuffix;
        }
        String _name_1 = classifier.getName();
        String _plus_4 = (_name_1 + CppModelElementsCreator.DOT);
        final String fileNameB = (_plus_4 + ext);
        CppFileGenerator.generateFile(container, fileNameB, fileContentB, true);
      } else {
        boolean _and = false;
        boolean _and_1 = false;
        boolean _noCodeGen = CppClassifierGenerator.noCodeGen(classifier);
        boolean _not = (!_noCodeGen);
        if (!_not) {
          _and_1 = false;
        } else {
          boolean _hasStereotype_1 = GenUtils.hasStereotype(classifier, Template.class);
          boolean _not_1 = (!_hasStereotype_1);
          _and_1 = _not_1;
        }
        if (!_and_1) {
          _and = false;
        } else {
          _and = (!(classifier instanceof Association));
        }
        if (_and) {
          boolean _isTemplateBoundElement = GenUtils.isTemplateBoundElement(classifier);
          if (_isTemplateBoundElement) {
            String _name_2 = classifier.getName();
            String _plus_5 = (_name_2 + ".");
            String _headerSuffix_1 = CppCodeGenUtils.getHeaderSuffix();
            final String bindHeaderFileName = (_plus_5 + _headerSuffix_1);
            String _generateBindHeaderCode = CppClassifierGenerator.generateBindHeaderCode(classifier);
            String _plus_6 = (commentHeader + _generateBindHeaderCode);
            CppFileGenerator.generateFile(container, bindHeaderFileName, _plus_6, true);
            String _name_3 = classifier.getName();
            String _plus_7 = (_name_3 + ".");
            String _bodySuffix_1 = CppCodeGenUtils.getBodySuffix();
            String bindBodyFileName = (_plus_7 + _bodySuffix_1);
            String _generateBindBodyCode = CppClassifierGenerator.generateBindBodyCode(classifier);
            String _plus_8 = (commentHeader + _generateBindBodyCode);
            CppFileGenerator.generateFile(container, bindBodyFileName, _plus_8, true);
          } else {
            String _name_4 = classifier.getName();
            String _plus_9 = (_name_4 + ".");
            String _headerSuffix_2 = CppCodeGenUtils.getHeaderSuffix();
            final String classHeaderFileName = (_plus_9 + _headerSuffix_2);
            String _generateClassHeaderCode = CppClassifierGenerator.generateClassHeaderCode(classifier);
            String _plus_10 = (commentHeader + _generateClassHeaderCode);
            CppFileGenerator.generateFile(container, classHeaderFileName, _plus_10, true);
            if ((classifier instanceof org.eclipse.uml2.uml.Class)) {
              String _name_5 = ((org.eclipse.uml2.uml.Class)classifier).getName();
              String _plus_11 = (_name_5 + ".");
              String _bodySuffix_2 = CppCodeGenUtils.getBodySuffix();
              String classBodyFileName = (_plus_11 + _bodySuffix_2);
              String _generateClassBodyCode = CppClassifierGenerator.generateClassBodyCode(classifier);
              String _plus_12 = (commentHeader + _generateClassBodyCode);
              CppFileGenerator.generateFile(container, classBodyFileName, _plus_12, true);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static boolean noCodeGen(final Element element) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _hasStereotype = GenUtils.hasStereotype(element, NoCodeGen.class);
    if (_hasStereotype) {
      _or_1 = true;
    } else {
      boolean _hasStereotype_1 = GenUtils.hasStereotype(element, External.class);
      _or_1 = _hasStereotype_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _hasStereotypeTree = GenUtils.hasStereotypeTree(element, ExternLibrary.class);
      _or = _hasStereotypeTree;
    }
    return _or;
  }
  
  public static String generateHeaderCode(final Classifier classifier, final String commentHeader) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(commentHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("AcceleoDriver.evaluate(cppInclude.getHeader(), classifier, null);");
    _builder.newLine();
    String code = _builder.toString();
    return code;
  }
  
  public static String generateBindHeaderCode(final Classifier classifier) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _fullNameUC = GenUtils.getFullNameUC(classifier);
    _builder.append(_fullNameUC, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _fullNameUC_1 = GenUtils.getFullNameUC(classifier);
    _builder.append(_fullNameUC_1, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    String _name = classifier.getName();
    _builder.append(_name, "              ");
    _builder.append(" template binding header");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    org.eclipse.uml2.uml.Package _package = classifier.getPackage();
    String _cppOwnerPackageIncludePath = CppClassIncludeClassDeclaration.cppOwnerPackageIncludePath(_package);
    String _includeDirective = CppIncludeUtil.includeDirective(_cppOwnerPackageIncludePath);
    _builder.append(_includeDirective, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<String> _sortedIncludePathList = CppClassifierGenerator.getSortedIncludePathList(classifier);
      for(final String path : _sortedIncludePathList) {
        String _includeDirective_1 = CppIncludeUtil.includeDirective(path);
        _builder.append(_includeDirective_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _CppIncludeHeader = CppIncludeUtil.CppIncludeHeader(classifier);
    _builder.append(_CppIncludeHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    EList<TemplateBinding> tb = classifier.getTemplateBindings();
    _builder.newLineIfNotEmpty();
    TemplateBinding templateElement = tb.get(0);
    _builder.newLineIfNotEmpty();
    org.eclipse.uml2.uml.Package _package_1 = classifier.getPackage();
    String _fullPath = GenUtils.getFullPath(_package_1);
    String _plus = (_fullPath + "/");
    Element _owner = templateElement.getOwner();
    String _name_1 = ((NamedElement) _owner).getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ".");
    String _headerSuffix = CppCodeGenUtils.getHeaderSuffix();
    String _plus_3 = (_plus_2 + _headerSuffix);
    String _includeDirective_2 = CppIncludeUtil.includeDirective(_plus_3);
    _builder.append(_includeDirective_2, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _openNS = CppGenUtils.openNS(classifier);
    _builder.append(_openNS, "");
    _builder.newLineIfNotEmpty();
    _builder.append("/************************************************************/");
    _builder.newLine();
    _builder.append("typedef ");
    Element _owner_1 = templateElement.getOwner();
    String _name_2 = ((NamedElement) _owner_1).getName();
    _builder.append(_name_2, "");
    {
      EList<TemplateParameterSubstitution> _parameterSubstitutions = templateElement.getParameterSubstitutions();
      for(final TemplateParameterSubstitution ps : _parameterSubstitutions) {
        Object _CppTemplateBindingParameter = CppTemplates.CppTemplateBindingParameter(ps);
        _builder.append(_CppTemplateBindingParameter, "");
      }
    }
    _builder.append(" ");
    String _name_3 = classifier.getName();
    _builder.append(_name_3, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _closeNS = CppGenUtils.closeNS(classifier);
    _builder.append(_closeNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("End of ");
    String _name_4 = classifier.getName();
    _builder.append(_name_4, "              ");
    _builder.append(" template binding header");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif");
    String code = _builder.toString();
    return code;
  }
  
  public static List<String> getSortedIncludePathList(final Classifier classifier) {
    Iterable<String> _CppClassAllIncludes = CppClassIncludeClassDeclaration.CppClassAllIncludes(classifier);
    List<String> includePathList = IterableExtensions.<String>sort(_CppClassAllIncludes);
    return includePathList;
  }
  
  public static String generateBindBodyCode(final Classifier classifier) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#define ");
    String _fullNameUC = GenUtils.getFullNameUC(classifier);
    _builder.append(_fullNameUC, "");
    _builder.append("_BODY");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    String _name = classifier.getName();
    _builder.append(_name, "              ");
    _builder.append(" template binding body");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    String _CppIncludePreBody = CppIncludeUtil.CppIncludePreBody(classifier);
    _builder.append(_CppIncludePreBody, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// include associated header file");
    _builder.newLine();
    org.eclipse.uml2.uml.Package _package = classifier.getPackage();
    String _fullPath = GenUtils.getFullPath(_package);
    String _plus = (_fullPath + "/");
    String _name_1 = classifier.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ".");
    String _headerSuffix = CppCodeGenUtils.getHeaderSuffix();
    String _plus_3 = (_plus_2 + _headerSuffix);
    String _includeDirective = CppIncludeUtil.includeDirective(_plus_3);
    _builder.append(_includeDirective, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _CppIncludeBody = CppIncludeUtil.CppIncludeBody(classifier);
    _builder.append(_CppIncludeBody, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _openNS = CppGenUtils.openNS(classifier);
    _builder.append(_openNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// Derived includes directives");
    _builder.newLine();
    {
      Iterable<String> _CppClassAllIncludes = CppClassIncludeClassDeclaration.CppClassAllIncludes(classifier);
      List<String> _sort = IterableExtensions.<String>sort(_CppClassAllIncludes);
      for(final String path : _sort) {
        String _includeDirective_1 = CppIncludeUtil.includeDirective(path);
        _builder.append(_includeDirective_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("/************************************************************/");
    _builder.newLine();
    TemplateBinding tb = GenUtils.getTemplateBindings(((org.eclipse.uml2.uml.Class) classifier));
    _builder.newLineIfNotEmpty();
    EList<Element> _targets = tb.getTargets();
    Element templateElement = _targets.get(0);
    _builder.newLineIfNotEmpty();
    _builder.append("template class ");
    Element _owner = templateElement.getOwner();
    String _name_2 = ((NamedElement) _owner).getName();
    _builder.append(_name_2, "");
    _builder.append("<");
    {
      EList<TemplateParameterSubstitution> _parameterSubstitutions = tb.getParameterSubstitutions();
      for(final TemplateParameterSubstitution ps : _parameterSubstitutions) {
        Object _CppTemplateBindingParameter = CppTemplates.CppTemplateBindingParameter(ps);
        _builder.append(_CppTemplateBindingParameter, "");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _closeNS = CppGenUtils.closeNS(classifier);
    _builder.append(_closeNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("End of ");
    String _name_3 = classifier.getName();
    _builder.append(_name_3, "              ");
    _builder.append(" template binding body");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    String code = _builder.toString();
    return code;
  }
  
  public static String generateClassHeaderCode(final Classifier classifier) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _fullNameUC = GenUtils.getFullNameUC(classifier);
    _builder.append(_fullNameUC, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _fullNameUC_1 = GenUtils.getFullNameUC(classifier);
    _builder.append(_fullNameUC_1, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    String _name = classifier.getName();
    _builder.append(_name, "              ");
    _builder.append(" class header");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    org.eclipse.uml2.uml.Package _package = classifier.getPackage();
    String _cppOwnerPackageIncludePath = CppClassIncludeClassDeclaration.cppOwnerPackageIncludePath(_package);
    String _includeDirective = CppIncludeUtil.includeDirective(_cppOwnerPackageIncludePath);
    _builder.append(_includeDirective, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<String> _sortedIncludePathList = CppClassifierGenerator.getSortedIncludePathList(classifier);
      for(final String path : _sortedIncludePathList) {
        String _includeDirective_1 = CppIncludeUtil.includeDirective(path);
        _builder.append(_includeDirective_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _CppIncludeHeader = CppIncludeUtil.CppIncludeHeader(classifier);
    _builder.append(_CppIncludeHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _openNS = CppGenUtils.openNS(classifier);
    _builder.append(_openNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************/");
    _builder.newLine();
    CharSequence _CppElementDoc = CppDocumentation.CppElementDoc(classifier);
    _builder.append(_CppElementDoc, "");
    _builder.newLineIfNotEmpty();
    CharSequence _templateSignature = CppTemplates.templateSignature(classifier);
    _builder.append(_templateSignature, "");
    String _classUnionOrStruct = CppClassifierGenerator.classUnionOrStruct(classifier);
    _builder.append(_classUnionOrStruct, "");
    _builder.append(" ");
    String _name_1 = classifier.getName();
    _builder.append(_name_1, "");
    CharSequence _CppClassInheritedDeclarations = CppClassInheritedDeclarations.CppClassInheritedDeclarations(classifier);
    _builder.append(_CppClassInheritedDeclarations, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    CppClassFriendDeclaration.CppClassIncludeFriendDeclaration(classifier);
    CharSequence _CppClassTypeAndEnum = CppClassTypeAndEnum.CppClassTypeAndEnum(classifier);
    _builder.append(_CppClassTypeAndEnum, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    VisibilityKind publicVisibility = VisibilityKind.PUBLIC_LITERAL;
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    String _defaultInitializer = CppClassifierGenerator.defaultInitializer(classifier);
    String _section = CppGenUtils.getSection(publicVisibility, _defaultInitializer);
    _builder.append(_section, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    CharSequence _CppClassAttributesDeclaration = CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, publicVisibility);
    String _string = _CppClassAttributesDeclaration.toString();
    String _section_1 = CppGenUtils.getSection(publicVisibility, _string);
    _builder.append(_section_1, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    CharSequence _CppClassOperationsDeclaration = CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, publicVisibility);
    String _string_1 = _CppClassOperationsDeclaration.toString();
    String _section_2 = CppGenUtils.getSection(publicVisibility, _string_1);
    _builder.append(_section_2, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    VisibilityKind protectedVisibility = VisibilityKind.PROTECTED_LITERAL;
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    CharSequence _CppClassAttributesDeclaration_1 = CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, protectedVisibility);
    String _string_2 = _CppClassAttributesDeclaration_1.toString();
    String _section_3 = CppGenUtils.getSection(protectedVisibility, _string_2);
    _builder.append(_section_3, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    CharSequence _CppClassOperationsDeclaration_1 = CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, protectedVisibility);
    String _string_3 = _CppClassOperationsDeclaration_1.toString();
    String _section_4 = CppGenUtils.getSection(protectedVisibility, _string_3);
    _builder.append(_section_4, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    VisibilityKind privateVisibility = VisibilityKind.PRIVATE_LITERAL;
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    CharSequence _CppClassAttributesDeclaration_2 = CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, privateVisibility);
    String _string_4 = _CppClassAttributesDeclaration_2.toString();
    String _section_5 = CppGenUtils.getSection(privateVisibility, _string_4);
    _builder.append(_section_5, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    CharSequence _CppClassOperationsDeclaration_2 = CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, privateVisibility);
    String _string_5 = _CppClassOperationsDeclaration_2.toString();
    String _section_6 = CppGenUtils.getSection(privateVisibility, _string_5);
    _builder.append(_section_6, "\t   ");
    _builder.newLineIfNotEmpty();
    _builder.append("};");
    _builder.newLine();
    _builder.append("/************************************************************/");
    _builder.newLine();
    _builder.append("/* External declarations (package visibility)               */");
    _builder.newLine();
    VisibilityKind packageVisibility = VisibilityKind.PACKAGE_LITERAL;
    _builder.newLineIfNotEmpty();
    CharSequence _CppClassAttributesDeclaration_3 = CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, packageVisibility);
    _builder.append(_CppClassAttributesDeclaration_3, "");
    _builder.newLineIfNotEmpty();
    CharSequence _CppClassOperationsDeclaration_3 = CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, packageVisibility);
    _builder.append(_CppClassOperationsDeclaration_3, "");
    _builder.newLineIfNotEmpty();
    _builder.append("/************************************************************/");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isTemplate = CppTemplates.isTemplate(classifier);
      if (_isTemplate) {
        _builder.append("/************************************************************/");
        _builder.newLine();
        _builder.append("/* Template functions                                       */");
        _builder.newLine();
        CharSequence _CppClassOperationsImplementation = CppClassOperationsImplementation.CppClassOperationsImplementation(classifier, false);
        _builder.append(_CppClassOperationsImplementation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("/* Inline functions                                         */");
    _builder.newLine();
    CharSequence _CppClassOperationsImplementation_1 = CppClassOperationsImplementation.CppClassOperationsImplementation(classifier, true);
    _builder.append(_CppClassOperationsImplementation_1, "");
    _builder.newLineIfNotEmpty();
    String _closeNS = CppGenUtils.closeNS(classifier);
    _builder.append(_closeNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("End of ");
    String _name_2 = classifier.getName();
    _builder.append(_name_2, "              ");
    _builder.append(" class header");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif");
    String code = _builder.toString();
    return code;
  }
  
  public static String classUnionOrStruct(final Classifier classifier) {
    boolean _hasStereotype = GenUtils.hasStereotype(classifier, Union.class);
    if (_hasStereotype) {
      return "union";
    } else {
      if ((classifier instanceof DataType)) {
        CppGenUtils.resetVisibility(VisibilityKind.PUBLIC_LITERAL);
        return "struct";
      } else {
        CppGenUtils.resetVisibility(VisibilityKind.PRIVATE_LITERAL);
        return "class";
      }
    }
  }
  
  /**
   * default initializer for non-static attributes with a default value TODO: should be disabled by default, since non-static members can be initialized directly in C++ 011
   */
  public static String defaultInitializer(final Classifier classifier) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Operation> _ownedOperations = CppOperations.getOwnedOperations(classifier);
      final Function1<Operation, Boolean> _function = new Function1<Operation, Boolean>() {
        public Boolean apply(final Operation it) {
          return Boolean.valueOf(GenUtils.hasStereotype(it, Create.class));
        }
      };
      Iterable<Operation> _filter = IterableExtensions.<Operation>filter(_ownedOperations, _function);
      int _size = IterableExtensions.size(_filter);
      boolean _equals = (_size == 0);
      if (_equals) {
        EList<Property> _attributes = classifier.getAttributes();
        final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
          public Boolean apply(final Property it) {
            boolean _and = false;
            boolean _and_1 = false;
            boolean _isStatic = it.isStatic();
            boolean _equals = (_isStatic == false);
            if (!_equals) {
              _and_1 = false;
            } else {
              ValueSpecification _defaultValue = it.getDefaultValue();
              boolean _notEquals = (!Objects.equal(_defaultValue, null));
              _and_1 = _notEquals;
            }
            if (!_and_1) {
              _and = false;
            } else {
              ValueSpecification _defaultValue_1 = it.getDefaultValue();
              String _stringValue = _defaultValue_1.stringValue();
              boolean _notEquals_1 = (!Objects.equal(_stringValue, null));
              _and = _notEquals_1;
            }
            return Boolean.valueOf(_and);
          }
        };
        Iterable<Property> attributeList = IterableExtensions.<Property>filter(_attributes, _function_1);
        _builder.newLineIfNotEmpty();
        {
          boolean _isEmpty = IterableExtensions.isEmpty(attributeList);
          boolean _not = (!_isEmpty);
          if (_not) {
            String _name = classifier.getName();
            _builder.append(_name, "");
            _builder.append("() : ");
            {
              boolean _hasElements = false;
              for(final Property a : attributeList) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "");
                }
                String _name_1 = a.getName();
                _builder.append(_name_1, "");
                _builder.append("(");
                ValueSpecification _defaultValue = a.getDefaultValue();
                String _stringValue = _defaultValue.stringValue();
                _builder.append(_stringValue, "");
                _builder.append(")");
              }
            }
            _builder.append(" {}");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
      }
    }
    String code = _builder.toString();
    return code.trim();
  }
  
  public static String generateClassBodyCode(final Classifier classifier) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#define ");
    String _fullName = GenUtils.getFullName(classifier);
    _builder.append(_fullName, "");
    _builder.append("_BODY");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    String _name = classifier.getName();
    _builder.append(_name, "              ");
    _builder.append(" class body");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    _builder.newLine();
    _builder.newLine();
    String _CppIncludePreBody = CppIncludeUtil.CppIncludePreBody(classifier);
    _builder.append(_CppIncludePreBody, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// include associated header file");
    _builder.newLine();
    org.eclipse.uml2.uml.Package _nearestPackage = classifier.getNearestPackage();
    String _fullPath = GenUtils.getFullPath(_nearestPackage);
    String _plus = (_fullPath + "/");
    String _name_1 = classifier.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ".");
    String _headerSuffix = CppCodeGenUtils.getHeaderSuffix();
    String _plus_3 = (_plus_2 + _headerSuffix);
    String _includeDirective = CppIncludeUtil.includeDirective(_plus_3);
    _builder.append(_includeDirective, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// Derived includes directives");
    _builder.newLine();
    {
      Iterable<String> _CppClassAllIncludesDeclarationBody = CppClassIncludeClassDeclaration.CppClassAllIncludesDeclarationBody(classifier);
      List<String> _sort = IterableExtensions.<String>sort(_CppClassAllIncludesDeclarationBody);
      for(final String path : _sort) {
        String _includeDirective_1 = CppIncludeUtil.includeDirective(path);
        _builder.append(_includeDirective_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _CppIncludeBody = CppIncludeUtil.CppIncludeBody(classifier);
    _builder.append(_CppIncludeBody, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _openNS = CppGenUtils.openNS(classifier);
    _builder.append(_openNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _CppStaticAttributes = CppAttribute.CppStaticAttributes(classifier);
    _builder.append(_CppStaticAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isTemplate = classifier.isTemplate();
      boolean _not = (!_isTemplate);
      if (_not) {
        CharSequence _CppClassOperationsImplementation = CppClassOperationsImplementation.CppClassOperationsImplementation(classifier, false);
        _builder.append(_CppClassOperationsImplementation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _closeNS = CppGenUtils.closeNS(classifier);
    _builder.append(_closeNS, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("End of ");
    String _name_2 = classifier.getName();
    _builder.append(_name_2, "              ");
    _builder.append(" class body");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("************************************************************/");
    String code = _builder.toString();
    return code;
  }
}
