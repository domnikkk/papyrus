/**
 * Copyright (c) 2014 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     CEA LIST - initial API and implementation
 */
package org.eclipse.papyrus.cpp.codegen.xtend;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.Modifier;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppParameter {
  public static CharSequence CppOperationParameters(final Operation operation, final boolean showDefault) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Parameter> _ownedParameters = operation.getOwnedParameters();
      final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
        public Boolean apply(final Parameter it) {
          ParameterDirectionKind _direction = it.getDirection();
          return Boolean.valueOf((!Objects.equal(_direction, ParameterDirectionKind.RETURN_LITERAL)));
        }
      };
      Iterable<Parameter> _filter = IterableExtensions.<Parameter>filter(_ownedParameters, _function);
      boolean _hasElements = false;
      for(final Parameter ownedParameter : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _CppParameter = CppParameter.CppParameter(ownedParameter, showDefault);
        _builder.append(_CppParameter, "");
      }
    }
    return _builder;
  }
  
  /**
   * comment signature for a given behavior (e.g. effect within state machine)
   */
  public static CharSequence CppBehaviorParameters(final Behavior behavior, final boolean showDefault) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Parameter> _ownedParameters = behavior.getOwnedParameters();
      final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
        public Boolean apply(final Parameter it) {
          ParameterDirectionKind _direction = it.getDirection();
          return Boolean.valueOf((!Objects.equal(_direction, ParameterDirectionKind.RETURN_LITERAL)));
        }
      };
      Iterable<Parameter> _filter = IterableExtensions.<Parameter>filter(_ownedParameters, _function);
      boolean _hasElements = false;
      for(final Parameter ownedParameter : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _CppParameter = CppParameter.CppParameter(ownedParameter, showDefault);
        _builder.append(_CppParameter, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * C++ parameter. Default values are added, if parameter showDefault is true (implementation signature
   */
  public static String CppParameter(final Parameter parameter, final boolean showDefault) {
    String _modCVQualifier = Modifier.modCVQualifier(parameter);
    Type _type = parameter.getType();
    String _cppQualifiedName = CppGenUtils.cppQualifiedName(_type);
    String _plus = (_modCVQualifier + _cppQualifiedName);
    String _modPtr = Modifier.modPtr(parameter);
    String _plus_1 = (_plus + _modPtr);
    String _modRef = Modifier.modRef(parameter);
    String _plus_2 = (_plus_1 + _modRef);
    String _plus_3 = (_plus_2 + " ");
    String _name = parameter.getName();
    String _plus_4 = (_plus_3 + _name);
    String _modArray = Modifier.modArray(parameter);
    String _plus_5 = (_plus_4 + _modArray);
    String _xifexpression = null;
    if (showDefault) {
      _xifexpression = CppParameter.defaultValue(parameter);
    } else {
      _xifexpression = "";
    }
    return (_plus_5 + _xifexpression);
  }
  
  public static String defaultValue(final Parameter parameter) {
    String _xifexpression = null;
    ValueSpecification _defaultValue = parameter.getDefaultValue();
    boolean _notEquals = (!Objects.equal(_defaultValue, null));
    if (_notEquals) {
      ValueSpecification _defaultValue_1 = parameter.getDefaultValue();
      String _stringValue = _defaultValue_1.stringValue();
      _xifexpression = (" = " + _stringValue);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
}
