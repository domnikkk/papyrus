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

import org.eclipse.papyrus.C_Cpp.Typedef;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppDocumentation;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppPrimitiveTypes {
  /**
   * Support two different kinds of primitive types
   * (1) those that are native types of the programming language such as long
   *     For these, no additional definition has to be done and they should be referenced
   *     with their name only
   * (2) those that correspond to a typedef (e.g. typedef long ErrorType). These require
   *     a typedef definition within the package and need to be referenced with their
   *     fully qualified name (e.g. MyPackage::ErrorType)
   * (3) Sometimes the name of the type defined by a typedef does not appear at the end, e.g.
   *     when defining functionPointers such as "typedef int (*HandlerFct) (void*);"
   * 	   (a function with a void* argument returning int)
   *     Support this case via a specific 'typeName' constant that gets replaced by the name of the
   *     type
   */
  public static CharSequence CppPrimitiveTypeDefinition(final PrimitiveType primitiveType) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppElementDoc = CppDocumentation.CppElementDoc(primitiveType);
    _builder.append(_CppElementDoc, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _hasStereotype = GenUtils.hasStereotype(primitiveType, Typedef.class);
      if (_hasStereotype) {
        _builder.append("typedef ");
        Typedef _stereotypeApplication = UMLUtil.<Typedef>getStereotypeApplication(primitiveType, Typedef.class);
        String _definition = _stereotypeApplication.getDefinition();
        String _name = primitiveType.getName();
        String _replaceAll = _definition.replaceAll("typeName", _name);
        _builder.append(_replaceAll, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          Typedef _stereotypeApplication_1 = UMLUtil.<Typedef>getStereotypeApplication(primitiveType, Typedef.class);
          String _definition_1 = _stereotypeApplication_1.getDefinition();
          boolean _contains = _definition_1.contains("typeName");
          boolean _not = (!_contains);
          if (_not) {
            String _name_1 = primitiveType.getName();
            _builder.append(_name_1, "\t");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      } else {
        String _stdtypes = CppGenUtils.getStdtypes(primitiveType);
        _builder.append(_stdtypes, "");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
