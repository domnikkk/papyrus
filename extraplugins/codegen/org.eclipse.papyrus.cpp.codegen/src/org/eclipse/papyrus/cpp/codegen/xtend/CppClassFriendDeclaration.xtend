package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.uml2.uml.Classifier
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.C_Cpp.Friend
import org.eclipse.papyrus.C_Cpp.NoCodeGen

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassFriendDeclaration {
	static def CppClassFriendDeclaration(Classifier friend) '''
		friend class «CppGenUtils.cppQualifiedName(friend)»
	'''

	static def CppClassIncludeFriendDeclaration(Classifier clazz) {
		for (uc : GenUtils.getUsedClassifiers(clazz)) {
			if (GenUtils.hasStereotype(uc, Friend) && (!GenUtils.hasStereotype(uc, NoCodeGen))) {
				CppClassFriendDeclaration(uc)
			}
		}
	}
}