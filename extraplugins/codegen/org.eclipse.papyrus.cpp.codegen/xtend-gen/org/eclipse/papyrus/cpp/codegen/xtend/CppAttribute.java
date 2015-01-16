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
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.C_Cpp.Const;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.Modifier;
import org.eclipse.papyrus.cpp.codegen.xtend.CppDocumentation;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppAttribute {
  public static String CppStaticAttributes(final Classifier classifier) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// static attributes (if any)");
    _builder.newLine();
    {
      Collection<Property> _ownedAttributes = CppAttribute.getOwnedAttributes(classifier);
      for(final Property ownedAttribute : _ownedAttributes) {
        {
          boolean _and = false;
          boolean _isStatic = ownedAttribute.isStatic();
          if (!_isStatic) {
            _and = false;
          } else {
            boolean _hasStereotype = GenUtils.hasStereotype(ownedAttribute, Const.class);
            boolean _not = (!_hasStereotype);
            _and = _not;
          }
          if (_and) {
            CharSequence _CppStaticAttributeImplementation = CppAttribute.CppStaticAttributeImplementation(ownedAttribute);
            _builder.append(_CppStaticAttributeImplementation, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    String code = _builder.toString();
    return code;
  }
  
  public static Collection<Property> getOwnedAttributes(final Classifier cl) {
    Collection<Property> _xblockexpression = null;
    {
      final EList<Property> attributes = CppAttribute.getOwnedAttributesWNull(cl);
      Collection<Property> _xifexpression = null;
      boolean _equals = Objects.equal(attributes, null);
      if (_equals) {
        _xifexpression = CollectionLiterals.<Property>emptySet();
      } else {
        _xifexpression = attributes;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static EList<Property> getOwnedAttributesWNull(final Classifier cl) {
    EList<Property> _xifexpression = null;
    if ((cl instanceof org.eclipse.uml2.uml.Class)) {
      _xifexpression = ((org.eclipse.uml2.uml.Class) cl).getOwnedAttributes();
    } else {
      EList<Property> _xifexpression_1 = null;
      if ((cl instanceof DataType)) {
        _xifexpression_1 = ((DataType) cl).getOwnedAttributes();
      } else {
        EList<Property> _xifexpression_2 = null;
        if ((cl instanceof Interface)) {
          _xifexpression_2 = ((Interface) cl).getOwnedAttributes();
        } else {
          EList<Property> _xifexpression_3 = null;
          if ((cl instanceof Signal)) {
            _xifexpression_3 = ((Signal) cl).getOwnedAttributes();
          } else {
            _xifexpression_3 = null;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence CppStaticAttributeImplementation(final Property attribute) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppElementDoc = CppDocumentation.CppElementDoc(attribute);
    _builder.append(_CppElementDoc, "");
    _builder.newLineIfNotEmpty();
    Type _type = attribute.getType();
    String _cppQualifiedName = CppGenUtils.cppQualifiedName(_type);
    _builder.append(_cppQualifiedName, "");
    String _modPtr = Modifier.modPtr(attribute);
    _builder.append(_modPtr, "");
    String _modRef = Modifier.modRef(attribute);
    _builder.append(_modRef, "");
    _builder.append("  ");
    org.eclipse.uml2.uml.Class _class_ = attribute.getClass_();
    String _name = _class_.getName();
    _builder.append(_name, "");
    _builder.append("::");
    String _name_1 = attribute.getName();
    _builder.append(_name_1, "");
    String _modArray = Modifier.modArray(attribute);
    _builder.append(_modArray, "");
    String _defaultValue = CppAttribute.defaultValue(attribute);
    _builder.append(_defaultValue, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static String defaultValue(final Property attribute) {
    String _xifexpression = null;
    boolean _and = false;
    ValueSpecification _defaultValue = attribute.getDefaultValue();
    boolean _notEquals = (!Objects.equal(_defaultValue, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isStatic = attribute.isStatic();
      _and = _isStatic;
    }
    if (_and) {
      ValueSpecification _defaultValue_1 = attribute.getDefaultValue();
      String _stringValue = _defaultValue_1.stringValue();
      _xifexpression = ("=" + _stringValue);
    }
    return _xifexpression;
  }
  
  public static CharSequence CppAttributeDeclaration(final Property attribute) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _CppElementDoc = CppDocumentation.CppElementDoc(attribute);
    _builder.append(_CppElementDoc, "");
    _builder.newLineIfNotEmpty();
    String _staticValue = CppAttribute.staticValue(attribute);
    _builder.append(_staticValue, "");
    _builder.append(" ");
    String _modCVQualifier = Modifier.modCVQualifier(attribute);
    _builder.append(_modCVQualifier, "");
    Type _type = attribute.getType();
    String _cppQualifiedName = CppGenUtils.cppQualifiedName(_type);
    _builder.append(_cppQualifiedName, "");
    String _modPtr = Modifier.modPtr(attribute);
    _builder.append(_modPtr, "");
    String _modRef = Modifier.modRef(attribute);
    _builder.append(_modRef, "");
    _builder.append(" ");
    String _name = attribute.getName();
    _builder.append(_name, "");
    String _modArray = Modifier.modArray(attribute);
    _builder.append(_modArray, "");
    {
      boolean _hasStereotype = GenUtils.hasStereotype(attribute, Const.class);
      if (_hasStereotype) {
        String _defaultValue = CppAttribute.defaultValue(attribute);
        _builder.append(_defaultValue, "");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static String staticValue(final Property attribute) {
    String _xifexpression = null;
    boolean _isStatic = attribute.isStatic();
    if (_isStatic) {
      _xifexpression = "static";
    }
    return _xifexpression;
  }
}
