package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.Model

class TemplateQueries {
		static def UMLPackageElementType(InstanceSpecification node) {
		var componentName = getComponentName(node) as String
		if (componentName == 'Class')
			componentName = componentName + '_'
		var template = '''
			UMLPackage.eINSTANCE.get«componentName»()
		'''
		return template
	}

	static def getComponentName(InstanceSpecification node) {
		Queries.getStringSlotValue(Queries.getInstanceSlotValue(node, 'modelFacet'), 'metaClass')
	}

	static def getDiagramName(Class clazz) {
		Queries.getStringSlotValue(Queries.getDefaultValueInstanceSpecification(clazz, 'generator'), 'modelID').replace(
			'PapyrusUML', '')
	}

	static def packageRootName(Class clazz) {
		Queries.getStringSlotValue(Queries.getDefaultValueInstanceSpecification(clazz, 'generator'), 'packageNamePrefix')
	}
	
	def static computePackagePath(Model model) {
		model.name.replace(".", "/") + System.getProperty("file.separator") + "canonical" +
			System.getProperty("file.separator")
	}
}