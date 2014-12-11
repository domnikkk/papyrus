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

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.C_Cpp.NoCodeGen;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppEnumerations;
import org.eclipse.papyrus.cpp.codegen.xtend.CppPrimitiveTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassTypeAndEnum {
  public static CharSequence CppClassTypeAndEnum(final Classifier clazz) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _TypesAndEnumsForVisibility = CppClassTypeAndEnum.TypesAndEnumsForVisibility(clazz, VisibilityKind.PUBLIC_LITERAL);
    String publicStr = _TypesAndEnumsForVisibility.toString();
    _builder.newLineIfNotEmpty();
    String _section = CppGenUtils.getSection(VisibilityKind.PUBLIC_LITERAL, publicStr);
    _builder.append(_section, "");
    _builder.newLineIfNotEmpty();
    CharSequence _TypesAndEnumsForVisibility_1 = CppClassTypeAndEnum.TypesAndEnumsForVisibility(clazz, VisibilityKind.PROTECTED_LITERAL);
    String protectedStr = _TypesAndEnumsForVisibility_1.toString();
    _builder.newLineIfNotEmpty();
    String _section_1 = CppGenUtils.getSection(VisibilityKind.PROTECTED_LITERAL, protectedStr);
    _builder.append(_section_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _TypesAndEnumsForVisibility_2 = CppClassTypeAndEnum.TypesAndEnumsForVisibility(clazz, VisibilityKind.PRIVATE_LITERAL);
    String privateStr = _TypesAndEnumsForVisibility_2.toString();
    _builder.newLineIfNotEmpty();
    String _section_2 = CppGenUtils.getSection(VisibilityKind.PRIVATE_LITERAL, privateStr);
    _builder.append(_section_2, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence CppClassTypeAndEnumPackage(final org.eclipse.uml2.uml.Package pkg) {
    CharSequence _xblockexpression = null;
    {
      VisibilityKind _get = VisibilityKind.get(VisibilityKind.PACKAGE);
      CppClassTypeAndEnum.TypesAndEnumsForVisibility(pkg, _get);
      VisibilityKind _get_1 = VisibilityKind.get(VisibilityKind.PUBLIC);
      _xblockexpression = CppClassTypeAndEnum.TypesAndEnumsForVisibility(pkg, _get_1);
    }
    return _xblockexpression;
  }
  
  public static CharSequence TypesAndEnumsForVisibility(final Namespace ne, final VisibilityKind visibilityFilter) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _ownedElements = ne.getOwnedElements();
      for(final Element ownedElement : _ownedElements) {
        CharSequence _TypeAndEnumForVisibility = CppClassTypeAndEnum.TypeAndEnumForVisibility(ownedElement, visibilityFilter);
        _builder.append(_TypeAndEnumForVisibility, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence TypeAndEnumForVisibility(final Element element, final VisibilityKind visibilityFilter) {
    boolean _and = false;
    boolean _hasStereotype = GenUtils.hasStereotype(element, NoCodeGen.class);
    boolean _not = (!_hasStereotype);
    if (!_not) {
      _and = false;
    } else {
      _and = (element instanceof Classifier);
    }
    if (_and) {
      VisibilityKind elementVisibility = ((Classifier) element).getVisibility();
      int value = elementVisibility.getValue();
      int _value = visibilityFilter.getValue();
      boolean _equals = (value == _value);
      if (_equals) {
        if ((element instanceof Enumeration)) {
          return CppEnumerations.CppEnumerationDefinition(((Enumeration) element));
        } else {
          if ((element instanceof PrimitiveType)) {
            return CppPrimitiveTypes.CppPrimitiveTypeDefinition(((PrimitiveType) element));
          }
        }
      }
    }
    return null;
  }
}
