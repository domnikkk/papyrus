/**
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dsml.validation.generator.xtend;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.codegen.base.IPFileSystemAccess;
import org.eclipse.papyrus.dsml.validation.model.profilenames.Utils;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Generator for producing client selector files: Java files that filter the stereotype
 * for validation
 */
@SuppressWarnings("all")
public class ClientSelectorGen {
  public static CharSequence generateValidationContext(final Stereotype stereotype) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Created by the Papyrus DSML plugin generator");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    String _topPkg = Utils.getTopPkg();
    _builder.append(_topPkg, "");
    _builder.append(".selectors;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.validation.model.IClientSelector;");
    _builder.newLine();
    _builder.append("import org.eclipse.papyrus.uml.service.validation.StereotypeUtil;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This class filters (selects) passed stereotype applications. It returns true, if the");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* associated stereotype (or one of its super-stereotypes) has the name \'[stereotype.name/]\'.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _name = stereotype.getName();
    _builder.append(_name, "");
    _builder.append("ClientSelector implements IClientSelector {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean selects(Object stereoApplicationObj) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return StereotypeUtil.checkStereoApplication(stereoApplicationObj, \"");
    String _name_1 = stereotype.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\"); //$NON-NLS-1$");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * @see org.eclipse.xtext.generator.IGenerator#doGenerate(org.eclipse.emf.ecore.resource.Resource, org.eclipse.xtext.generator.IFileSystemAccess)
   * 
   * @param input
   * @param fsa
   */
  public static void generate(final Resource input, final IPFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    final Iterator<Stereotype> contentIterator = Iterators.<Stereotype>filter(_allContents, Stereotype.class);
    while (contentIterator.hasNext()) {
      {
        final Stereotype stereotype = contentIterator.next();
        String _topPkg = Utils.getTopPkg();
        String _replaceAll = _topPkg.replaceAll("\\.", "/");
        String _plus = (_replaceAll + "/selectors/");
        String _name = stereotype.getName();
        String _plus_1 = (_plus + _name);
        final String fileName = (_plus_1 + "ClientSelector.java");
        CharSequence _generateValidationContext = ClientSelectorGen.generateValidationContext(stereotype);
        String _string = _generateValidationContext.toString();
        fsa.generateFile(fileName, _string);
      }
    }
  }
}
