package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.C_Cpp.ConstInit;
import org.eclipse.papyrus.C_Cpp.Inline;
import org.eclipse.papyrus.C_Cpp.Virtual;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.Constants;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.Modifier;
import org.eclipse.papyrus.cpp.codegen.xtend.CppDocumentation;
import org.eclipse.papyrus.cpp.codegen.xtend.CppParameter;
import org.eclipse.papyrus.cpp.codegen.xtend.CppTemplates;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.profile.standard.Create;
import org.eclipse.uml2.uml.profile.standard.Destroy;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class CppOperations {
  public static CharSequence CppOperationImplementation(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppOperationDoc = CppDocumentation.CppOperationDoc(operation);
    _builder.append(_CppOperationDoc, "");
    _builder.newLineIfNotEmpty();
    {
      String _name = operation.getName();
      boolean _equals = Objects.equal(_name, "main");
      if (_equals) {
        String _CppReturnSpec = CppOperations.CppReturnSpec(operation);
        _builder.append(_CppReturnSpec, "");
        String _name_1 = operation.getName();
        _builder.append(_name_1, "");
        _builder.append("(");
        CharSequence _CppOperationParameters = CppParameter.CppOperationParameters(operation, false);
        _builder.append(_CppOperationParameters, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _body = GenUtils.getBody(operation, Constants.supportedLanguages);
        _builder.append(_body, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("} ");
        _builder.newLine();
      } else {
        CharSequence _templateSignature = CppTemplates.templateSignature(operation);
        _builder.append(_templateSignature, "");
        String _InlineTxt = CppOperations.InlineTxt(operation);
        _builder.append(_InlineTxt, "");
        String _CppReturnSpec_1 = CppOperations.CppReturnSpec(operation);
        _builder.append(_CppReturnSpec_1, "");
        EList<Classifier> _featuringClassifiers = operation.getFeaturingClassifiers();
        Classifier _get = _featuringClassifiers.get(0);
        String _name_2 = _get.getName();
        _builder.append(_name_2, "");
        CharSequence _templateShortSignature = CppTemplates.templateShortSignature(operation);
        _builder.append(_templateShortSignature, "");
        _builder.append("::");
        String _destructor = CppOperations.destructor(operation);
        _builder.append(_destructor, "");
        String _name_3 = operation.getName();
        _builder.append(_name_3, "");
        _builder.append("(");
        CharSequence _CppOperationParameters_1 = CppParameter.CppOperationParameters(operation, false);
        _builder.append(_CppOperationParameters_1, "");
        _builder.append(")");
        CharSequence _throwss = CppOperations.throwss(operation);
        _builder.append(_throwss, "");
        String _modCVQualifier = Modifier.modCVQualifier(operation);
        _builder.append(_modCVQualifier, "");
        String _CppConstInit = CppOperations.CppConstInit(operation);
        _builder.append(_CppConstInit, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _body_1 = GenUtils.getBody(operation, Constants.supportedLanguages);
        _builder.append(_body_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static String CppReturnSpec(final Operation operation) {
    String _xifexpression = null;
    boolean _or = false;
    Type _type = operation.getType();
    boolean _equals = Objects.equal(_type, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _isConsOrDestructor = CppOperations.isConsOrDestructor(operation);
      _or = _isConsOrDestructor;
    }
    if (_or) {
      _xifexpression = CppOperations.ConsDestructorOrVoid(operation);
    } else {
      Parameter _returnResult = operation.getReturnResult();
      String _modCVQualifier = Modifier.modCVQualifier(_returnResult);
      String _plus = (_modCVQualifier + " ");
      Type _type_1 = operation.getType();
      String _cppQualifiedName = CppGenUtils.cppQualifiedName(_type_1);
      String _plus_1 = (_plus + _cppQualifiedName);
      Parameter _returnResult_1 = operation.getReturnResult();
      String _modPtr = Modifier.modPtr(_returnResult_1);
      String _plus_2 = (_plus_1 + _modPtr);
      Parameter _returnResult_2 = operation.getReturnResult();
      String _modRef = Modifier.modRef(_returnResult_2);
      String _plus_3 = (_plus_2 + _modRef);
      _xifexpression = (_plus_3 + " ");
    }
    return _xifexpression;
  }
  
  public static CharSequence CppReturnSpec(final Behavior behavior) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Parameter _returnResult = GenUtils.returnResult(behavior);
      boolean _equals = Objects.equal(_returnResult, null);
      if (_equals) {
        _builder.append("void ");
      } else {
        Parameter _returnResult_1 = GenUtils.returnResult(behavior);
        String _modCVQualifier = Modifier.modCVQualifier(_returnResult_1);
        _builder.append(_modCVQualifier, "");
        _builder.append(" ");
        Parameter _returnResult_2 = GenUtils.returnResult(behavior);
        Type _type = _returnResult_2.getType();
        String _cppQualifiedName = CppGenUtils.cppQualifiedName(_type);
        _builder.append(_cppQualifiedName, "");
        Parameter _returnResult_3 = GenUtils.returnResult(behavior);
        String _modPtr = Modifier.modPtr(_returnResult_3);
        _builder.append(_modPtr, "");
        Parameter _returnResult_4 = GenUtils.returnResult(behavior);
        String _modRef = Modifier.modRef(_returnResult_4);
        _builder.append(_modRef, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence throwss(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Type> _raisedExceptions = operation.getRaisedExceptions();
      int _length = ((Object[])Conversions.unwrapArray(_raisedExceptions, Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("throws ");
        {
          EList<Type> _raisedExceptions_1 = operation.getRaisedExceptions();
          boolean _hasElements = false;
          for(final Type re : _raisedExceptions_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name = re.getName();
            _builder.append(_name, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static String ConsDestructorOrVoid(final Operation operation) {
    String _xifexpression = null;
    boolean _isConsOrDestructor = CppOperations.isConsOrDestructor(operation);
    if (_isConsOrDestructor) {
      _xifexpression = null;
    } else {
      _xifexpression = "void ";
    }
    return _xifexpression;
  }
  
  public static boolean isConsOrDestructor(final Operation operation) {
    boolean _or = false;
    boolean _hasStereotype = GenUtils.hasStereotype(operation, Create.class);
    if (_hasStereotype) {
      _or = true;
    } else {
      boolean _hasStereotype_1 = GenUtils.hasStereotype(operation, Destroy.class);
      _or = _hasStereotype_1;
    }
    return _or;
  }
  
  public static String CppConstInit(final Operation operation) {
    String _xifexpression = null;
    boolean _and = false;
    boolean _hasStereotype = GenUtils.hasStereotype(operation, ConstInit.class);
    if (!_hasStereotype) {
      _and = false;
    } else {
      boolean _hasStereotype_1 = GenUtils.hasStereotype(operation, Create.class);
      _and = _hasStereotype_1;
    }
    if (_and) {
      ConstInit _stereotypeApplication = UMLUtil.<ConstInit>getStereotypeApplication(operation, ConstInit.class);
      _xifexpression = ((ConstInit) _stereotypeApplication).getInitialisation();
    }
    return _xifexpression;
  }
  
  public static Collection<Operation> getOwnedOperations(final Classifier cl) {
    Collection<Operation> _xblockexpression = null;
    {
      final EList<Operation> operations = CppOperations.getOwnedOperationsWNull(cl);
      Collection<Operation> _xifexpression = null;
      boolean _equals = Objects.equal(operations, null);
      if (_equals) {
        _xifexpression = CollectionLiterals.<Operation>emptySet();
      } else {
        _xifexpression = operations;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static EList<Operation> getOwnedOperationsWNull(final Classifier cl) {
    EList<Operation> _xifexpression = null;
    if ((cl instanceof org.eclipse.uml2.uml.Class)) {
      _xifexpression = ((org.eclipse.uml2.uml.Class) cl).getOwnedOperations();
    } else {
      EList<Operation> _xifexpression_1 = null;
      if ((cl instanceof DataType)) {
        _xifexpression_1 = ((DataType) cl).getOwnedOperations();
      } else {
        EList<Operation> _xifexpression_2 = null;
        if ((cl instanceof Interface)) {
          _xifexpression_2 = ((Interface) cl).getOwnedOperations();
        } else {
          _xifexpression_2 = null;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence CppBehaviorImplementation(final OpaqueBehavior behavior) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppBehaviorDoc = CppDocumentation.CppBehaviorDoc(behavior);
    _builder.append(_CppBehaviorDoc, "");
    _builder.newLineIfNotEmpty();
    CharSequence _CppReturnSpec = CppOperations.CppReturnSpec(behavior);
    _builder.append(_CppReturnSpec, "");
    BehavioredClassifier _context = behavior.getContext();
    String _name = _context.getName();
    _builder.append(_name, "");
    _builder.append("::");
    String _name_1 = behavior.getName();
    _builder.append(_name_1, "");
    _builder.append("(");
    CharSequence _CppBehaviorParameters = CppParameter.CppBehaviorParameters(behavior, false);
    _builder.append(_CppBehaviorParameters, "");
    _builder.append(")");
    String _modCVQualifier = Modifier.modCVQualifier(behavior);
    _builder.append(_modCVQualifier, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _bodyFromOB = GenUtils.getBodyFromOB(behavior, Constants.supportedLanguages);
    _builder.append(_bodyFromOB, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence CppOperationDeclaration(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppOperationDoc = CppDocumentation.CppOperationDoc(operation);
    _builder.append(_CppOperationDoc, "");
    _builder.newLineIfNotEmpty();
    String _InlineTxt = CppOperations.InlineTxt(operation);
    _builder.append(_InlineTxt, "");
    String _virtualTxt = CppOperations.virtualTxt(operation);
    _builder.append(_virtualTxt, "");
    String _staticTxt = CppOperations.staticTxt(operation);
    _builder.append(_staticTxt, "");
    String _CppReturnSpec = CppOperations.CppReturnSpec(operation);
    _builder.append(_CppReturnSpec, "");
    String _destructor = CppOperations.destructor(operation);
    _builder.append(_destructor, "");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append("(");
    CharSequence _CppOperationParameters = CppParameter.CppOperationParameters(operation, true);
    _builder.append(_CppOperationParameters, "");
    _builder.append(")");
    String _modCVQualifier = Modifier.modCVQualifier(operation);
    _builder.append(_modCVQualifier, "");
    String _virtualSuffix = CppOperations.virtualSuffix(operation);
    _builder.append(_virtualSuffix, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static String InlineTxt(final Element element) {
    String _xifexpression = null;
    boolean _hasStereotype = GenUtils.hasStereotype(element, Inline.class);
    if (_hasStereotype) {
      _xifexpression = "inline ";
    }
    return _xifexpression;
  }
  
  public static String virtualTxt(final Operation operation) {
    String _xifexpression = null;
    boolean _or = false;
    boolean _or_1 = false;
    Interface _interface = operation.getInterface();
    boolean _notEquals = (!Objects.equal(_interface, null));
    if (_notEquals) {
      _or_1 = true;
    } else {
      boolean _isAbstract = operation.isAbstract();
      _or_1 = _isAbstract;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _hasStereotype = GenUtils.hasStereotype(operation, Virtual.class);
      _or = _hasStereotype;
    }
    if (_or) {
      _xifexpression = "virtual ";
    }
    return _xifexpression;
  }
  
  public static String staticTxt(final Operation operation) {
    String _xifexpression = null;
    boolean _isStatic = operation.isStatic();
    if (_isStatic) {
      _xifexpression = "static ";
    }
    return _xifexpression;
  }
  
  public static String destructor(final Operation operation) {
    String _xifexpression = null;
    boolean _and = false;
    boolean _hasStereotype = GenUtils.hasStereotype(operation, Destroy.class);
    if (!_hasStereotype) {
      _and = false;
    } else {
      String _name = operation.getName();
      boolean _startsWith = _name.startsWith("~");
      boolean _not = (!_startsWith);
      _and = _not;
    }
    if (_and) {
      _xifexpression = "~";
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public static String virtualSuffix(final Operation operation) {
    String _xifexpression = null;
    boolean _or = false;
    Interface _interface = operation.getInterface();
    boolean _notEquals = (!Objects.equal(_interface, null));
    if (_notEquals) {
      _or = true;
    } else {
      boolean _isAbstract = operation.isAbstract();
      _or = _isAbstract;
    }
    if (_or) {
      _xifexpression = " = 0";
    }
    return _xifexpression;
  }
  
  public static CharSequence CppBehaviorDeclaration(final Behavior behavior) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppBehaviorDoc = CppDocumentation.CppBehaviorDoc(behavior);
    _builder.append(_CppBehaviorDoc, "");
    _builder.newLineIfNotEmpty();
    String _InlineTxt = CppOperations.InlineTxt(behavior);
    _builder.append(_InlineTxt, "");
    CharSequence _CppReturnSpec = CppOperations.CppReturnSpec(behavior);
    _builder.append(_CppReturnSpec, "");
    String _name = behavior.getName();
    _builder.append(_name, "");
    _builder.append("(");
    CharSequence _CppBehaviorParameters = CppParameter.CppBehaviorParameters(behavior, true);
    _builder.append(_CppBehaviorParameters, "");
    _builder.append(")");
    String _modCVQualifier = Modifier.modCVQualifier(behavior);
    _builder.append(_modCVQualifier, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
