package com.cea.qompass.architect.optimization.codegen.mwe

import org.eclipse.emf.mwe.utils.Writer
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.papyrus.mwe2.utils.XtendWorkflow
import org.eclipse.papyrus.mwe2.utils.components.QvtoTransformationWorkflowComponent
import com.cea.qompass.architect.optimization.codegen.m2t.CodeGeneratorComponent

class GenerateOptimizationTargetWorkflow extends XtendWorkflow {

	var String optURI

	
	public def setOptimizationTargetUri(String optURI) {
		this.optURI = optURI
	}
	
	override run(IWorkflowContext context) {
		
		/*
		 * 
		beans += new StandaloneSetup => [
			platformUri = '../../../../../..'
			addUriMap(
				new Mapping => [
					from = 'pathmap://UML_METAMODELS/UML.metamodel.uml'
					to = 'platform:/resource/org.eclipse.papyrus.tests.framework/model/UML.metamodel.uml'
				])
			addUriMap(
				new Mapping => [
					from = 'platform:/plugin/org.eclipse.uml2.uml/model/UML.genmodel'
					to = 'platform:/resource/org.eclipse.papyrus.tests.framework/model/UML.genmodel'
				])
			addUriMap(
				new Mapping => [
					from = 'platform:/plugin/org.eclipse.gmf.codegen/models/gmfgen.ecore'
					to = 'platform:/resource/org.eclipse.gmf.codegen/models/gmfgen.ecore'
				])
			scanClassPath = true
			addRegisterGeneratedEPackage('org.eclipse.uml2.uml.UMLPackage')
			addRegisterGeneratedEPackage('org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage')
			addRegisterGeneratedEPackage('org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage')
		]
		 */

		//1. Transform OptimizationProblem Model element to Intermediate Model

		/*
		components += new Reader => [
			uri = 'platform:/resource/com.cea.qompass.architect.optimization.profile/model/model.profile.uml'
			modelSlot = 'optimizationprofile'
			useSingleGlobalResourceSet = true
		]
		components += new RegisterUmlProfile => [
			profileSlot = 'optimizationprofile'
		]
		 */

		//we specify the input and output models to lunch the qvto transformation
		components += new QvtoTransformationWorkflowComponent => [
			addInputSlots('selectedOptimizationProblem')
			
			transformationURI = 'platform:/plugin/com.cea.qompass.architect.optimization.codegen/src/com/cea/qompass/architect/optimization/codegen/m2m/Qompass2OptIM.qvto'
			outputSlot = 'optIntermediateModel'
		]
		components += new Writer => [
			modelSlot = 'optIntermediateModel'
			uri = optURI + '/optIntermediateModel.uml'
			//useSingleGlobalResourceSet = true
		]

		//2. Transform IM to target optimization platform: Generate Optimization code
		/*
	 	components += org.eclipse.emf.mwe.utils.Reader {
			
		}
		 
		
		 
		 */
		components += new CodeGeneratorComponent => [
			tempSrcPath = 'C:/Dev/eclipse-modeling-kepler-R-win32-x86_64/runtime-New_configuration/TestFunAlloc/MILP-generated-files'
			modelSlot = 'optIntermediateModel'
		]
		  
		 super.run(context)
	}


		

}
