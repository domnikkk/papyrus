package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.acceleo.GenUtils;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppDocumentation {
  public static CharSequence CppElementDoc(final Element argument) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    String _comments = GenUtils.getComments(argument);
    String _replaceAll = _comments.replaceAll("\n", "\n * ");
    _builder.append(_replaceAll, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence CppOperationDoc(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    String _comments = GenUtils.getComments(operation);
    String _replaceAll = _comments.replaceAll("\n", "\n * ");
    _builder.append(_replaceAll, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    {
      EList<Parameter> _ownedParameters = operation.getOwnedParameters();
      final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
        public Boolean apply(final Parameter it) {
          ParameterDirectionKind _direction = it.getDirection();
          return Boolean.valueOf((!Objects.equal(_direction, ParameterDirectionKind.RETURN_LITERAL)));
        }
      };
      Iterable<Parameter> _filter = IterableExtensions.<Parameter>filter(_ownedParameters, _function);
      for(final Parameter op : _filter) {
        CharSequence _CppParamDoc = CppDocumentation.CppParamDoc(op);
        _builder.append(_CppParamDoc, " ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence CppParamDoc(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* @param ");
    String _name = parameter.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _comments = GenUtils.getComments(parameter);
    String _replaceAll = _comments.replaceAll("\n", "\n *    ");
    _builder.append(_replaceAll, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence CppBehaviorDoc(final Behavior behavior) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    String _comments = GenUtils.getComments(behavior);
    String _replaceAll = _comments.replaceAll("\n", "\n * ");
    _builder.append(_replaceAll, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    {
      EList<Parameter> _ownedParameters = behavior.getOwnedParameters();
      for(final Parameter op : _ownedParameters) {
        CharSequence _CppParamDoc = CppDocumentation.CppParamDoc(op);
        _builder.append(_CppParamDoc, " ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
}
