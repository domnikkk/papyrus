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
import org.eclipse.papyrus.C_Cpp.CppInit;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppDocumentation;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppEnumerations {
  public static CharSequence CppEnumerationDefinition(final Enumeration enume) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppElementDoc = CppDocumentation.CppElementDoc(enume);
    _builder.append(_CppElementDoc, "");
    _builder.newLineIfNotEmpty();
    _builder.append("enum ");
    String _name = enume.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<EnumerationLiteral> _ownedLiterals = enume.getOwnedLiterals();
      for(final EnumerationLiteral ownedLiteral : _ownedLiterals) {
        _builder.append("\t");
        CharSequence _CppElementDoc_1 = CppDocumentation.CppElementDoc(ownedLiteral);
        _builder.append(_CppElementDoc_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_1 = ownedLiteral.getName();
        _builder.append(_name_1, "\t");
        {
          boolean _hasStereotype = GenUtils.hasStereotype(ownedLiteral, CppInit.class);
          if (_hasStereotype) {
            CppInit _stereotypeApplication = UMLUtil.<CppInit>getStereotypeApplication(ownedLiteral, CppInit.class);
            int _value = _stereotypeApplication.getValue();
            _builder.append(_value, "\t");
          }
        }
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
}
