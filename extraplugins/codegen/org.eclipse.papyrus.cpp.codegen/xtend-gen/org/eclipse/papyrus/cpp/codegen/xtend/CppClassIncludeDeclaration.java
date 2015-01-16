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

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.C_Cpp.ExternLibrary;
import org.eclipse.papyrus.C_Cpp.External;
import org.eclipse.papyrus.C_Cpp.Template;
import org.eclipse.papyrus.codegen.base.GenUtils;
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
@SuppressWarnings("all")
public class CppClassIncludeDeclaration {
  public static List<String> cppClassIncludes(final NamedElement ne) {
    List<String> result = new ArrayList<String>();
    boolean _hasStereotypeTree = GenUtils.hasStereotypeTree(ne, ExternLibrary.class);
    if (_hasStereotypeTree) {
      ExternLibrary _applicationTree = GenUtils.<ExternLibrary>getApplicationTree(ne, ExternLibrary.class);
      EList<String> _includes = _applicationTree.getIncludes();
      result = _includes;
    } else {
      String _includeName = CppClassIncludeDeclaration.includeName(ne);
      result.add(_includeName);
    }
    return result;
  }
  
  public static String includeName(final NamedElement ne) {
    boolean _hasStereotypeTree = GenUtils.hasStereotypeTree(ne, Template.class);
    if (_hasStereotypeTree) {
      Template _stereotypeApplication = UMLUtil.<Template>getStereotypeApplication(ne, Template.class);
      return _stereotypeApplication.getDeclaration();
    } else {
      boolean _hasStereotypeTree_1 = GenUtils.hasStereotypeTree(ne, External.class);
      if (_hasStereotypeTree_1) {
        External _stereotypeApplication_1 = UMLUtil.<External>getStereotypeApplication(ne, External.class);
        return _stereotypeApplication_1.getName();
      } else {
        org.eclipse.uml2.uml.Package _nearestPackage = ne.getNearestPackage();
        String _fullPath = GenUtils.getFullPath(_nearestPackage);
        String _plus = (_fullPath + "/");
        String _name = ne.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + ".");
        String _headerSuffix = CppCodeGenUtils.getHeaderSuffix();
        return (_plus_2 + _headerSuffix);
      }
    }
  }
}
