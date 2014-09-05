package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.uml2.uml.Element
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.Behavior
import org.eclipse.uml2.uml.ParameterDirectionKind

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppDocumentation {
	static def CppElementDoc(Element argument) '''
		/**
		 * «GenUtils.getComments(argument).replaceAll('\n', '\n * ')»
		 */
	'''
	
	static def CppOperationDoc(Operation operation) '''
		/**
		 * «GenUtils.getComments(operation).replaceAll('\n', '\n * ')»
		 «FOR op: operation.ownedParameters.filter[it.direction != ParameterDirectionKind.RETURN_LITERAL]»«CppParamDoc(op)»«ENDFOR»
		 */
	'''
	
	static def CppParamDoc(Parameter parameter) '''
		* @param «parameter.name» «GenUtils.getComments(parameter).replaceAll('\n', '\n *    ')»
	'''
	
	static def CppBehaviorDoc(Behavior behavior) '''
		/**
		 * «GenUtils.getComments(behavior).replaceAll('\n', '\n * ')»
		 * «FOR op : behavior.ownedParameters»«CppParamDoc(op)»«ENDFOR»
		 */
	'''
}
