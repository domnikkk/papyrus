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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.C_Cpp.Inline;
import org.eclipse.papyrus.C_Cpp.NoCodeGen;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.xtend.CppOperations;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassOperationsImplementation {
  public static CharSequence CppClassOperationsImplementation(final Classifier clazz, final boolean inline) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Collection<Operation> _ownedOperations = CppOperations.getOwnedOperations(clazz);
      final Function1<Operation, Boolean> _function = new Function1<Operation, Boolean>() {
        public Boolean apply(final Operation it) {
          boolean _and = false;
          boolean _or = false;
          boolean _hasStereotype = GenUtils.hasStereotype(it, NoCodeGen.class);
          if (_hasStereotype) {
            _or = true;
          } else {
            boolean _isAbstract = it.isAbstract();
            _or = _isAbstract;
          }
          boolean _not = (!_or);
          if (!_not) {
            _and = false;
          } else {
            boolean _hasStereotype_1 = GenUtils.hasStereotype(it, Inline.class);
            boolean _equals = (_hasStereotype_1 == inline);
            _and = _equals;
          }
          return Boolean.valueOf(_and);
        }
      };
      Iterable<Operation> _filter = IterableExtensions.<Operation>filter(_ownedOperations, _function);
      boolean _hasElements = false;
      for(final Operation ownedOperation : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        CharSequence _CppOperationImplementation = CppOperations.CppOperationImplementation(ownedOperation);
        _builder.append(_CppOperationImplementation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      TreeIterator<EObject> _eAllContents = clazz.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      final Function1<EObject, Boolean> _function_1 = new Function1<EObject, Boolean>() {
        public Boolean apply(final EObject it) {
          boolean _and = false;
          if (!(it instanceof OpaqueBehavior)) {
            _and = false;
          } else {
            boolean _hasStereotype = GenUtils.hasStereotype(((OpaqueBehavior) it), Inline.class);
            boolean _equals = (_hasStereotype == inline);
            _and = _equals;
          }
          return Boolean.valueOf(_and);
        }
      };
      Iterable<EObject> _filter_1 = IterableExtensions.<EObject>filter(_iterable, _function_1);
      for(final EObject b : _filter_1) {
        {
          BehavioralFeature _specification = ((OpaqueBehavior) b).getSpecification();
          boolean _equals = Objects.equal(_specification, null);
          if (_equals) {
            _builder.append("// opaque behavior without specification (typically from state machine)");
            _builder.newLine();
            CharSequence _CppBehaviorImplementation = CppOperations.CppBehaviorImplementation(((OpaqueBehavior) b));
            _builder.append(_CppBehaviorImplementation, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
