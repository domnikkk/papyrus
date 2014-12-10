package org.eclipse.papyrus.cpp.codegen.xtend

/*******************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     CEA LIST - initial API and implementation
 *******************************************************************************/
 
 import org.eclipse.papyrus.C_Cpp.CppRoot
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Classifier
import org.eclipse.emf.common.util.EList
import org.eclipse.papyrus.C_Cpp.NoCodeGen
import org.eclipse.papyrus.C_Cpp.External
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.PrimitiveType
import java.util.List
import java.util.ArrayList
import org.eclipse.papyrus.cpp.codegen.utils.ClassUtils
import org.eclipse.papyrus.codegen.base.GenUtils

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassIncludeClassDeclaration {
 	
 	static def cppOwnerPackageIncludePath(Package pkg) {
		if ((pkg != null) && (!GenUtils.hasStereotype(pkg, CppRoot))) {
			return GenUtils.getFullPath(pkg) + '/Pkg_' + pkg.name + '.h'
		} else {
			return null
		}
	}
	
	static def CppClassAllIncludesDeclarationBody(Classifier classifier) { 
		cppClassAllIncludes(classifier, GenUtils.getTypesViaDependencies(classifier))
	}
	
	static def cppClassAllIncludes(Classifier classifier, EList<Classifier> list) {
		var List<String> newList = new ArrayList<String>()
		for (cl : list) {
			//var String str = null
			if ((cl != classifier) && (!GenUtils.hasStereotype(cl, NoCodeGen)) || (GenUtils.hasStereotype(cl, External))) {
				if ((cl instanceof Enumeration) || (cl instanceof PrimitiveType)) {
					if ((cl.owner != null) && (cl.owner instanceof Package)) {
						var includePath = (cl.owner as Package).cppOwnerPackageIncludePath
						if (!newList.contains(includePath)) newList.add(includePath)
					} else {
						//str = null
					}
				} else {
					newList.addAll(CppClassIncludeDeclaration.cppClassIncludes(cl))
				}
			} else {
				//str = null
			}
		}
		return newList.filter[str | str != null]
	}
	
	static def CppClassAllIncludes(Classifier clazz) {
		cppClassAllIncludes(clazz, ClassUtils.includedClassifiers(clazz))
	}
}