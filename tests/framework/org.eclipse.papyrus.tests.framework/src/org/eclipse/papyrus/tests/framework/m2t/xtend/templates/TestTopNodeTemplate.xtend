package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import java.util.Calendar
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.Behavior
import org.eclipse.uml2.uml.CallOperationAction
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.ValuePin

class TestTopNodeTemplate {
	
	def static generate(Class clazz) {
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
			package «TemplateQueries.packageRootName(clazz)».test.canonical;
			
			import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
			import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
			import org.eclipse.papyrus.commands.ICreationCommand;
			
			import «TemplateQueries.packageRootName(clazz)».test.I«TemplateQueries.getDiagramName(clazz)»TestsConstants;
			import org.eclipse.papyrus.diagram.tests.canonical.«clazz.generalizations.head.general.name»;
			import «TemplateQueries.packageRootName(clazz)».Create«TemplateQueries.getDiagramName(clazz)»Command;
			import «TemplateQueries.packageRootName(clazz)».providers.UMLElementTypes;
			«FOR topLevelNode : clazz.ownedAttributes.filter[getAppliedStereotype("utp::SUT") != null].map[
				defaultValue as InstanceValue].map[instance]»
				import «TemplateQueries.packageRootName(clazz)».edit.parts.«Queries.getStringSlotValue(topLevelNode, 'editPartClassName')»;
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
					public void «testCaseOperation.name»() {
						«testToManageNode(testCaseOperation.methods.head as Activity, clazz)»
					}
				«ENDFOR»
				
				/**
				 * {@inheritDoc}
				 */
				@Override 
				protected CreateViewRequest createViewRequestShapeContainer() {
					return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(«Queries.getStringSlotValue(Queries.getDefaultValueInstanceSpecification(clazz, 'containerEditPart'), 'editPartClassName')».VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
				}
				
			}	
		'''
		return template;
	
	}
	
	static def String testToManageNode(Activity method, Class clazz) {
		val action = method.ownedNodes.head as CallOperationAction
		val valuePin = action.arguments.head as ValuePin
		val pinValue = valuePin.value as InstanceValue
		var node = pinValue.instance as InstanceSpecification
		if (node.eIsProxy)
			node = EcoreUtil.resolve(node, clazz.eResource) as InstanceSpecification
		val editPartClassName = Queries.getStringSlotValue(node, 'editPartClassName')
		val elementType = TemplateQueries.UMLPackageElementType(node)
		val template = '''
			testToManageNode(UMLElementTypes.getElementType(«editPartClassName».VISUAL_ID), «
			elementType», UMLElementTypes.getElementType(«Queries.getStringSlotValue(
				Queries.getDefaultValueInstanceSpecification(clazz, 'containerEditPart'), 'editPartClassName')».VISUAL_ID), true);
		'''
		return template
	}
	
}