package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.papyrus.C_Cpp.CppRoot
import org.eclipse.papyrus.acceleo.GenUtils
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