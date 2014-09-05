package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.OpaqueBehavior
import org.eclipse.uml2.uml.VisibilityKind

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassOperationsDeclaration {
	
	static def CppClassOperationsDeclaration(Classifier clazz, VisibilityKind visibilityFilter) '''
		«FOR op : CppOperations.getOwnedOperations(clazz).filter[it.visibility == visibilityFilter]»
		
		«CppOperations.CppOperationDeclaration(op)»
		«ENDFOR»
		«FOR b : clazz.eAllContents.toList.filter(OpaqueBehavior).filter[it.visibility == visibilityFilter]»
			«IF b.specification == null»
			
			// opaque behavior without specification (typically from state machine)
			«CppOperations.CppBehaviorDeclaration(b)»
			«ENDIF»
		«ENDFOR»
	'''
}