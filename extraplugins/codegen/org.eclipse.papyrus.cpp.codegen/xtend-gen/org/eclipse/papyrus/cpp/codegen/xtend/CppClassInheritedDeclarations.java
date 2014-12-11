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
import org.eclipse.papyrus.C_Cpp.Visibility;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassInheritedDeclarations {
  public static CharSequence CppClassInheritedDeclarations(final Classifier clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<DirectedRelationship> _filteredRelationships = CppClassInheritedDeclarations.filteredRelationships(clazz);
      int _length = ((Object[])Conversions.unwrapArray(_filteredRelationships, Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append(" : ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Iterable<DirectedRelationship> _filteredRelationships_1 = CppClassInheritedDeclarations.filteredRelationships(clazz);
      boolean _hasElements = false;
      for(final DirectedRelationship fr : _filteredRelationships_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", \n", "");
        }
        String _cppVisibility = CppClassInheritedDeclarations.getCppVisibility(fr);
        _builder.append(_cppVisibility, "");
        _builder.append(" ");
        EList<Element> _targets = fr.getTargets();
        Element _get = _targets.get(0);
        String _cppQualifiedName = CppGenUtils.cppQualifiedName(((Classifier) _get));
        _builder.append(_cppQualifiedName, "");
      }
    }
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static Iterable<DirectedRelationship> filteredRelationships(final Classifier clazz) {
    EList<DirectedRelationship> _sourceDirectedRelationships = clazz.getSourceDirectedRelationships();
    final Function1<DirectedRelationship, Boolean> _function = new Function1<DirectedRelationship, Boolean>() {
      public Boolean apply(final DirectedRelationship it) {
        boolean _and = false;
        if (!((it instanceof Generalization) || (it instanceof InterfaceRealization))) {
          _and = false;
        } else {
          EList<Element> _targets = it.getTargets();
          Element _get = _targets.get(0);
          boolean _hasStereotype = GenUtils.hasStereotype(_get, NoCodeGen.class);
          boolean _not = (!_hasStereotype);
          _and = _not;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<DirectedRelationship>filter(_sourceDirectedRelationships, _function);
  }
  
  public static String getCppVisibility(final Relationship relationship) {
    String _xifexpression = null;
    boolean _hasStereotype = GenUtils.hasStereotype(relationship, Visibility.class);
    if (_hasStereotype) {
      Visibility _stereotypeApplication = UMLUtil.<Visibility>getStereotypeApplication(relationship, Visibility.class);
      _xifexpression = ((Visibility) _stereotypeApplication).getValue();
    } else {
      _xifexpression = "public";
    }
    return _xifexpression;
  }
}
