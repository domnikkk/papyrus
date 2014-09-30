package org.eclipse.papyrus.cpp.codegen.xtend

import java.util.ArrayList
import java.util.List
import org.eclipse.papyrus.C_Cpp.ExternLibrary
import org.eclipse.papyrus.C_Cpp.External
import org.eclipse.papyrus.C_Cpp.Template
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenUtils
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.util.UMLUtil

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassIncludeDeclaration {
	
	static def cppClassIncludes(NamedElement ne) {
		var List<String> result = new ArrayList<String>()
		if (GenUtils.hasStereotypeTree(ne, ExternLibrary)) {
			result = GenUtils.getApplicationTree(ne, ExternLibrary).includes
		} else {
			result.add(includeName(ne))
		}
		return result
	}
	
	static def includeName(NamedElement ne) {
		if (GenUtils.hasStereotypeTree(ne, Template)) {
			return UMLUtil.getStereotypeApplication(ne, Template).declaration
		} else {
			if (GenUtils.hasStereotypeTree(ne, External)) {
				return UMLUtil.getStereotypeApplication(ne, External).name
			} else {
				// standard case (no stereotypes are applied)
				return GenUtils.getFullPath(ne.nearestPackage) + '/' + ne.name + '.' + CppCodeGenUtils.getHeaderSuffix()
			}
		}
	}
}