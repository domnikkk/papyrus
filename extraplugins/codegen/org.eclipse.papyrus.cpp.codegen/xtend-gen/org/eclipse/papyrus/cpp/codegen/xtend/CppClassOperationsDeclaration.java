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
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.cpp.codegen.xtend.CppOperations;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassOperationsDeclaration {
  public static CharSequence CppClassOperationsDeclaration(final Classifier clazz, final VisibilityKind visibilityFilter) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Collection<Operation> _ownedOperations = CppOperations.getOwnedOperations(clazz);
      final Function1<Operation, Boolean> _function = new Function1<Operation, Boolean>() {
        public Boolean apply(final Operation it) {
          VisibilityKind _visibility = it.getVisibility();
          return Boolean.valueOf(Objects.equal(_visibility, visibilityFilter));
        }
      };
      Iterable<Operation> _filter = IterableExtensions.<Operation>filter(_ownedOperations, _function);
      for(final Operation op : _filter) {
        _builder.newLine();
        CharSequence _CppOperationDeclaration = CppOperations.CppOperationDeclaration(op);
        _builder.append(_CppOperationDeclaration, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      TreeIterator<EObject> _eAllContents = clazz.eAllContents();
      List<EObject> _list = IteratorExtensions.<EObject>toList(_eAllContents);
      Iterable<OpaqueBehavior> _filter_1 = Iterables.<OpaqueBehavior>filter(_list, OpaqueBehavior.class);
      final Function1<OpaqueBehavior, Boolean> _function_1 = new Function1<OpaqueBehavior, Boolean>() {
        public Boolean apply(final OpaqueBehavior it) {
          VisibilityKind _visibility = it.getVisibility();
          return Boolean.valueOf(Objects.equal(_visibility, visibilityFilter));
        }
      };
      Iterable<OpaqueBehavior> _filter_2 = IterableExtensions.<OpaqueBehavior>filter(_filter_1, _function_1);
      for(final OpaqueBehavior b : _filter_2) {
        {
          BehavioralFeature _specification = b.getSpecification();
          boolean _equals = Objects.equal(_specification, null);
          if (_equals) {
            _builder.newLine();
            _builder.append("// opaque behavior without specification (typically from state machine)");
            _builder.newLine();
            CharSequence _CppBehaviorDeclaration = CppOperations.CppBehaviorDeclaration(b);
            _builder.append(_CppBehaviorDeclaration, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
