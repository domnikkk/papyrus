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

import java.util.Collection;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppTemplates {
  public static CharSequence templateSignature(final Operation operation) {
    Element _owner = operation.getOwner();
    return CppTemplates.templateSignature(((Classifier) _owner));
  }
  
  public static CharSequence templateSignature(final Classifier clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isTemplate = CppTemplates.isTemplate(clazz);
      if (_isTemplate) {
        _builder.append("template<");
        {
          Collection<TemplateParameter> _templateParameters = GenUtils.getTemplateParameters(clazz);
          boolean _hasElements = false;
          for(final TemplateParameter templateParam : _templateParameters) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _templateTypeName = CppGenUtils.getTemplateTypeName(templateParam);
            _builder.append(_templateTypeName, "");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence templateShortSignature(final Operation operation) {
    Element _owner = operation.getOwner();
    return CppTemplates.templateShortSignature(((Classifier) _owner));
  }
  
  public static CharSequence templateShortSignature(final Classifier clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isTemplate = CppTemplates.isTemplate(clazz);
      if (_isTemplate) {
        _builder.append("<");
        {
          Collection<TemplateParameter> _templateParameters = GenUtils.getTemplateParameters(clazz);
          boolean _hasElements = false;
          for(final TemplateParameter templateParam : _templateParameters) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _templateName = GenUtils.getTemplateName(templateParam);
            _builder.append(_templateName, "");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static boolean isTemplate(final Classifier clazz) {
    Collection<TemplateParameter> _templateParameters = GenUtils.getTemplateParameters(clazz);
    int _size = _templateParameters.size();
    return (_size > 0);
  }
  
  public static Object CppTemplateBindingParameter(final TemplateParameterSubstitution tps) {
    Object _xifexpression = null;
    ParameterableElement _actual = tps.getActual();
    if ((_actual instanceof LiteralInteger)) {
      ParameterableElement _actual_1 = tps.getActual();
      _xifexpression = Integer.valueOf(((LiteralInteger) _actual_1).getValue());
    } else {
      ParameterableElement _actual_2 = tps.getActual();
      _xifexpression = ((NamedElement) _actual_2).getName();
    }
    return ((Comparable<?>)_xifexpression);
  }
}
