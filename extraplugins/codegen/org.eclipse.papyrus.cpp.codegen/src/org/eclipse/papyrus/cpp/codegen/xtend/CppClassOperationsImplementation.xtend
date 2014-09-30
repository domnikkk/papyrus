package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.uml2.uml.Classifier
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.C_Cpp.NoCodeGen
import org.eclipse.uml2.uml.OpaqueBehavior
import org.eclipse.papyrus.C_Cpp.Inline

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassOperationsImplementation {
	
	// implementations of a classifier, parameter controls whether only inline (or only not inline) operations
	//are produced
	static def CppClassOperationsImplementation(Classifier clazz, boolean inline) '''
		«FOR ownedOperation : CppOperations.getOwnedOperations(clazz).filter[(!(GenUtils.hasStereotype(it, NoCodeGen) || it.isAbstract)) && (GenUtils.hasStereotype(it, org.eclipse.papyrus.C_Cpp.Inline) == inline)] SEPARATOR "\n"»
			«CppOperations.CppOperationImplementation(ownedOperation)»
		«ENDFOR»
		
		«FOR b : clazz.eAllContents.toIterable.filter[(it instanceof OpaqueBehavior) && GenUtils.hasStereotype((it as OpaqueBehavior), Inline)==inline]»
			«IF (b as OpaqueBehavior).specification == null»
				// opaque behavior without specification (typically from state machine)
				«CppOperations.CppBehaviorImplementation(b as OpaqueBehavior)»
			«ENDIF»
		«ENDFOR»
	'''
	
}