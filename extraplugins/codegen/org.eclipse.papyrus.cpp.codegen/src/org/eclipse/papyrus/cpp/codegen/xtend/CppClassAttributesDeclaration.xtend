package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.VisibilityKind

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassAttributesDeclaration {
	static def CppClassAttributesDeclaration(Classifier clazz, VisibilityKind visibilityFilter) '''
		«FOR oa : CppAttribute.getOwnedAttributes(clazz).filter[it.visibility == visibilityFilter]»
			«CppAttribute.CppAttributeDeclaration(oa)»
		«ENDFOR»
	'''
}