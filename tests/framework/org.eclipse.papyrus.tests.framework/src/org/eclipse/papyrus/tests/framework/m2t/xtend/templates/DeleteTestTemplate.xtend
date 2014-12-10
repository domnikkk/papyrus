package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import java.util.Calendar
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.CallOperationAction
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.StringExpression
import org.eclipse.uml2.uml.ValuePin

class DeleteTestTemplate {
	
	def static generate(Class clazz) {
		var diagramUpdater = (clazz.ownedAttributes.findFirst[name == "diagramUpdater"].defaultValue as StringExpression).symbol
		val template = '''
			/*****************************************************************************
			 * Copyright (c) «Calendar.getInstance().get(Calendar.YEAR)» CEA LIST.
			 *
			 *    
			 * All rights reserved. This program and the accompanying materials
			 * are made available under the terms of the Eclipse Public License v1.0
			 * which accompanies this distribution, and is available at
			 * http://www.eclipse.org/legal/epl-v10.html
			 *
			 * This file has been generated automatically in the Papyrus Test Framework.
			 *
			 *****************************************************************************/
			package «clazz.package.name»;
			
			import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
			import org.eclipse.papyrus.commands.ICreationCommand;
			import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
			import «TemplateQueries.packageRootName(clazz)».Create«TemplateQueries.getDiagramName(clazz)»Command;
			import «TemplateQueries.packageRootName(clazz)».providers.UMLElementTypes;
			import «TemplateQueries.packageRootName(clazz)».test.I«TemplateQueries.getDiagramName(clazz)»TestsConstants;
			«IF diagramUpdater.startsWith("Custom")»
			import «TemplateQueries.packageRootName(clazz)».custom.edit.part.CustomUMLDiagramUpdater;
			«ELSE»
			import «TemplateQueries.packageRootName(clazz)».part.UMLDiagramUpdater;
			«ENDIF»
			import org.eclipse.papyrus.uml.diagram.tests.delete.«clazz.generalizations.head.general.name»;
			import org.junit.Test;
			«FOR elementImport : clazz.elementImports.map[alias]»
			import «TemplateQueries.packageRootName(clazz)».edit.parts.«elementImport»;
			«ENDFOR»
			
			/**
			 * The Class «clazz.name».
			 */
			public class «clazz.name» extends «clazz.generalizations.head.
				general.name» {
			
				@Override
				public GraphicalEditPart getContainerEditPart() {
					return getDiagramEditPart();
				}
				
				@Override
				protected ICreationCommand getDiagramCommandCreation() {
					return new Create«TemplateQueries.getDiagramName(clazz)»Command();
				}
				
				@Override
				protected String getProjectName() {
					return I«TemplateQueries.getDiagramName(clazz)»TestsConstants.PROJECT_NAME;
				}
			
				@Override
				protected String getFileName() {
					return I«TemplateQueries.getDiagramName(clazz)»TestsConstants.FILE_NAME;
				}
			
				«FOR Operation testCaseOperation : clazz.ownedOperations.filter[getAppliedStereotype("utp::TestCase") != null]»
					«var instanceSpec = (testCaseOperation.ownedParameters.head.defaultValue as InstanceValue).instance»
					/**
					 * Test to delete element «TemplateQueries.getComponentName(instanceSpec)».
					 */
					@Test
					@GeneratedTest
					public void «testCaseOperation.name»() {
						«testDeleteNode(testCaseOperation.methods.head as Activity, clazz)»
					}
				«ENDFOR»
				
				@Override
				public DiagramUpdater getDiagramUpdater() {
					return «diagramUpdater».INSTANCE;
				}
			}
		'''
		return template;
	}

	static def String testDeleteNode(Activity method, Class clazz) {
		val action = method.ownedNodes.head as CallOperationAction
		val valuePin = action.arguments.head as ValuePin
		val pinValue = valuePin.value as InstanceValue
		var node = pinValue.instance as InstanceSpecification
		if (node.eIsProxy)
			node = EcoreUtil.resolve(node, clazz.eResource) as InstanceSpecification
		val editPartClassName = Queries.getStringSlotValue(node, 'editPartClassName')
		val template = '''
			«action.operation.name»(UMLElementTypes.getElementType(«editPartClassName».VISUAL_ID));
		'''
		return template
	}
}
