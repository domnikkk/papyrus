package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.papyrus.C_Cpp.Inline
import org.eclipse.papyrus.C_Cpp.Virtual
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils
import org.eclipse.papyrus.cpp.codegen.utils.Modifier
import org.eclipse.uml2.uml.Behavior
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.OpaqueBehavior
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.profile.standard.Create
import org.eclipse.uml2.uml.profile.standard.Destroy
import org.eclipse.papyrus.C_Cpp.ConstInit
import org.eclipse.uml2.uml.util.UMLUtil

class CppOperations {
	static def CppOperationImplementation(Operation operation) '''
		«CppDocumentation.CppOperationDoc(operation)»
		«IF (operation.name == 'main')»
			«CppReturnSpec(operation)»«operation.name»(«CppParameter.CppOperationParameters(operation,false)») {
				«GenUtils.getBody(operation, 'C/C++')»
			} 
		«ELSE»
			«CppTemplates.templateSignature(operation)»«InlineTxt(operation)»«CppReturnSpec(operation)»«operation.featuringClassifiers.get(0).name»«CppTemplates.templateShortSignature(operation)»::«destructor(operation)»«operation.name»(«CppParameter.CppOperationParameters(operation, false)»)«throwss(operation)»«Modifier.modCVQualifier(operation)»«CppConstInit(operation)» {
				«GenUtils.getBody(operation, 'C/C++')»
			}
		«ENDIF»
	'''	
	
	static def CppReturnSpec(Operation operation) {
		if ((operation.type == null) || isConsOrDestructor(operation)) {
			ConsDestructorOrVoid(operation)
		} else {
			Modifier.modCVQualifier(operation.getReturnResult())+' '+CppGenUtils.cppQualifiedName(operation.type)+Modifier.modPtr(operation.getReturnResult())+Modifier.modRef(operation.getReturnResult())+' ' 
		}
	}
	
	static def CppReturnSpec(Behavior behavior) '''
		«IF (GenUtils.returnResult(behavior) == null)»void «ELSE»«Modifier.modCVQualifier(GenUtils.returnResult(behavior))» «CppGenUtils.cppQualifiedName(GenUtils.returnResult(behavior).type)»«Modifier.modPtr(GenUtils.returnResult(behavior))»«Modifier.modRef(GenUtils.returnResult(behavior))» «ENDIF»
	'''
	
	static def throwss(Operation operation) '''
		«IF operation.raisedExceptions.length > 0»
		throws «FOR re : operation.raisedExceptions SEPARATOR ','»«re.name»«ENDFOR»
		«ENDIF»
	'''
	
	static def ConsDestructorOrVoid(Operation operation) {
		if (isConsOrDestructor(operation)) {
		
		} else {
			'void ' 
		}
	}
	
	static def isConsOrDestructor(Operation operation) {
		GenUtils.hasStereotype(operation, Create) || GenUtils.hasStereotype(operation, Destroy)
	}
	
	static def CppConstInit(Operation operation) {
		if (GenUtils.hasStereotype(operation, ConstInit) && GenUtils.hasStereotype(operation, Create)) {
			(UMLUtil.getStereotypeApplication(operation, ConstInit) as ConstInit).initialisation
		}
	}
	
	// return a list of owned operations, since this is not supported directly on a classifier/]
	static def getOwnedOperations(Classifier cl) {
		if (cl instanceof Class) {
			(cl as Class).ownedOperations
		} else {
			if (cl instanceof DataType) {
				(cl as DataType).ownedOperations
			} else {
				if (cl instanceof Interface) {
					(cl as Interface).ownedOperations
				} else {
					// Sequence{}
				}
			}
		}
	}
	
	static def CppBehaviorImplementation(OpaqueBehavior behavior) '''
		«CppDocumentation.CppBehaviorDoc(behavior)»
		«CppReturnSpec(behavior)»«behavior.context.name»::«behavior.name»(«CppParameter.CppBehaviorParameters(behavior, false)»)«Modifier.modCVQualifier(behavior)» {
			«GenUtils.getBodyFromOB(behavior, 'C/C++')»
		}
	'''
	
	static def CppOperationDeclaration(Operation operation) '''
		«CppDocumentation.CppOperationDoc(operation)»
		«InlineTxt(operation)»«virtualTxt(operation)»«staticTxt(operation)»«CppReturnSpec(operation)»«destructor(operation)»«operation.name»(«CppParameter.CppOperationParameters(operation,true)»)«Modifier.modCVQualifier(operation)»«virtualSuffix(operation)»;
	'''
	
	static def InlineTxt(Element element) {
		if (GenUtils.hasStereotype(element, Inline)) 'inline '
	}
	
	static def virtualTxt(Operation operation) {
		if ((operation.interface != null) || (operation.isAbstract) || (GenUtils.hasStereotype(operation, Virtual))) 'virtual '
	}
	
	static def staticTxt(Operation operation) {
		if (operation.isStatic) 'static '
	}
	
	static def destructor(Operation operation) {
		if (GenUtils.hasStereotype(operation, Destroy) && (!operation.name.startsWith('~'))) {
			'~'
		} else { 
			''
		}
	}
		
	static def public virtualSuffix(Operation operation) {
		if ((operation.interface != null) || (operation.isAbstract)) ' = 0'
	}
	
	static def CppBehaviorDeclaration(Behavior behavior) '''
		«CppDocumentation.CppBehaviorDoc(behavior)»
		«InlineTxt(behavior)»«CppReturnSpec(behavior)»«behavior.name»(«CppParameter.CppBehaviorParameters(behavior, true)»)«Modifier.modCVQualifier(behavior)»;
	'''
}