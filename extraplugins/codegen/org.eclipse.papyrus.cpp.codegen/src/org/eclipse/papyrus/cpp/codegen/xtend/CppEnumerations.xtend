package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.uml2.uml.Enumeration
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.C_Cpp.CppInit
import org.eclipse.uml2.uml.util.UMLUtil

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppEnumerations {
	static def CppEnumerationDefinition(Enumeration enume) '''
		«CppDocumentation.CppElementDoc(enume)»
		enum «enume.name» {
			«FOR ownedLiteral : enume.ownedLiterals»
				«CppDocumentation.CppElementDoc(ownedLiteral)»
				«ownedLiteral.name»«IF GenUtils.hasStereotype(ownedLiteral, CppInit)»«UMLUtil.
				getStereotypeApplication(ownedLiteral, CppInit).value»«ENDIF»,
			«ENDFOR»
		};
	'''
}
