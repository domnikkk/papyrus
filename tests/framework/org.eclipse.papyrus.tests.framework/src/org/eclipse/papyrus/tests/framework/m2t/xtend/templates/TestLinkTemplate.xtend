package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import java.util.Calendar
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.CallOperationAction
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.StringExpression
import org.eclipse.uml2.uml.ValuePin

class TestLinkTemplate {

	def static generate(Class clazz) {
		var diagramUpdater = (clazz.ownedAttributes.findFirst[name == "diagramUpdater"].defaultValue as StringExpression).
			symbol
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
			
			import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
			import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
			import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
			import org.eclipse.papyrus.commands.ICreationCommand;
			import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
			«IF diagramUpdater.startsWith("Custom")»
				import «TemplateQueries.packageRootName(clazz)».custom.edit.part.CustomUMLDiagramUpdater;
			«ELSE»
				import «TemplateQueries.packageRootName(clazz)».part.UMLDiagramUpdater;
			«ENDIF»
			import «clazz.generalizations.head.general.package.name».«clazz.generalizations.head.general.name»;
			import «TemplateQueries.packageRootName(clazz)».Create«TemplateQueries.getDiagramName(clazz)»Command;
			import «TemplateQueries.packageRootName(clazz)».providers.UMLElementTypes;
			import «TemplateQueries.packageRootName(clazz)».test.I«TemplateQueries.getDiagramName(clazz)»TestsConstants;
			«FOR elementImport : clazz.elementImports.map[alias]»
				import «TemplateQueries.packageRootName(clazz)».edit.parts.«elementImport»;
			«ENDFOR»
			import org.eclipse.uml2.uml.UMLPackage;
			import org.junit.Test;
			
			// TODO: Auto-generated Javadoc
			/**
			 * The Class «clazz.name».
			 */
			public class «clazz.name» extends «clazz.generalizations.head.general.name» {
				
				
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
					 * Test to manage component «TemplateQueries.getComponentName(instanceSpec)».
					 */
					@Test
					@GeneratedTest
					public void «testCaseOperation.name»() {
						«testToManageLink(testCaseOperation.methods.head as Activity, clazz)»
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

	static def String testToManageLink(Activity method, Class clazz) {
		val action = method.ownedNodes.head as CallOperationAction
		var source = ((action.arguments.findFirst[name == 'source'] as ValuePin).value as InstanceValue).instance
		var target = ((action.arguments.findFirst[name == 'target'] as ValuePin).value as InstanceValue).instance
		var link = ((action.arguments.findFirst[name == 'link'] as ValuePin).value as InstanceValue).instance
		if (source == null || target == null || link == null) {
			throw new RuntimeException("Test link method not complete: " + method.name)
		}
		val sourceType = Queries.getStringSlotValue(source, 'editPartClassName')
		val targetType = Queries.getStringSlotValue(target, 'editPartClassName')
		val linkType = Queries.getStringSlotValue(link, 'editPartClassName')

		val container = Queries.getStringSlotValue(
			Queries.getDefaultValueInstanceSpecification(clazz, 'containerEditPart'), 'editPartClassName')
		val template = '''
			testCreateLinkFromPalette(UMLElementTypes.getElementType(«sourceType».VISUAL_ID), UMLElementTypes.getElementType(«targetType».VISUAL_ID), UMLElementTypes.getElementType(«linkType».VISUAL_ID), UMLElementTypes.getElementType(«container».VISUAL_ID), true);
		'''
		return template
	}
}
