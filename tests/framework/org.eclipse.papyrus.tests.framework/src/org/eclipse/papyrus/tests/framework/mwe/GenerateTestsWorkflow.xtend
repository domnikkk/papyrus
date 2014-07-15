package org.eclipse.papyrus.tests.framework.mwe

import org.eclipse.emf.mwe.utils.FileCopy
import org.eclipse.emf.mwe.utils.Mapping
import org.eclipse.emf.mwe.utils.Reader
import org.eclipse.emf.mwe.utils.StandaloneSetup
import org.eclipse.emf.mwe.utils.Writer
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.papyrus.mwe2.utils.XtendWorkflow
import org.eclipse.papyrus.mwe2.utils.components.DeleteFile
import org.eclipse.papyrus.mwe2.utils.components.QvtoTransformationWorkflowComponent
import org.eclipse.papyrus.mwe2.utils.components.RegisterUmlProfile
import org.eclipse.papyrus.tests.framework.m2t.xtend.CodeGeneratorComponent

class GenerateTestsWorkflow extends XtendWorkflow {

	var String uriPrefix = "";
	var String gmfgenUri
	var String testSrcGenLocation
	var String qvtoScriptUri
	var String testModelUri 

	public def setGmfgenUri(String gmfgenUri){
		this.gmfgenUri = gmfgenUri
	}
	
	public def setTestSrcGenLocation(String testSrcGenLocation){
		this.testSrcGenLocation = testSrcGenLocation
	}
	
	public def setQvtoScriptUri(String qvtoScriptUri){
		this.qvtoScriptUri = qvtoScriptUri
	}
	
	public def setTestModelUri(String testModelUri){
		this.testModelUri = testModelUri
	}

	public def setUriPrefix(String uriPrefix){
		this.uriPrefix = uriPrefix
	}
	
	public def getUriPrefix(){
		return uriPrefix
	}
	
	override run(IWorkflowContext context) {
		beans += new StandaloneSetup => [
			platformUri = '../../../../../..'
			addUriMap(
				new Mapping => [
					from = 'pathmap://UML_METAMODELS/UML.metamodel.uml'
					to = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/UML.metamodel.uml'
				])
			addUriMap(
				new Mapping => [
					from = 'platform:/plugin/org.eclipse.uml2.uml/model/UML.genmodel'
					to = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/UML.genmodel'
				])
			addUriMap(
				new Mapping => [
					from = 'platform:/plugin/org.eclipse.gmf.codegen/models/gmfgen.ecore'
					to = uriPrefix + '/org.eclipse.gmf.codegen/models/gmfgen.ecore'
				])
			scanClassPath = true
			addRegisterGeneratedEPackage('org.eclipse.uml2.uml.UMLPackage')
			addRegisterGeneratedEPackage('org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage')
			addRegisterGeneratedEPackage('org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage')
		]

		//1. Transform GMFGen file to UML
		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/UML.genmodel'
			modelSlot = 'genmodelUml'
			useSingleGlobalResourceSet = true
		]

		components += new Reader => [
			uri = gmfgenUri
			modelSlot = 'inputGmfgen'
			firstElementOnly = true
			useSingleGlobalResourceSet = true
		]

		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/ecore.profile.uml'
			modelSlot = 'ecoreprofile'
			useSingleGlobalResourceSet = true
		]

		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/ecore.uml'
			modelSlot = 'genmodeluml'
			useSingleGlobalResourceSet = true
		]


		components += new RegisterUmlProfile => [
			profileSlot = 'ecoreprofile'
		]

		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/genmodel.uml'
			modelSlot = 'genmodeluml'
			useSingleGlobalResourceSet = true
		]

		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/gmfgen.uml'
			modelSlot = 'gmfgenUmlMetamodel'
			useSingleGlobalResourceSet = true
		]

		components += new QvtoTransformationWorkflowComponent => [
			addInputSlots('inputGmfgen')
			addInputSlots('gmfgenUmlMetamodel')
			transformationURI = uriPrefix + '/org.eclipse.papyrus.tests.framework/qvto/gmfgen2uml-instances.qvto'
			outputSlot = 'inputGmfgenUml'
		]
		components += new Writer => [
			modelSlot = 'inputGmfgenUml'
			uri = gmfgenUri + '.uml'
			useSingleGlobalResourceSet = true
		]

		//2. Generate Test specification model from QVTO script
		/*
	components += org.eclipse.emf.mwe.utils.Reader {
		uri = gmfgenUri + '.uml'
		modelSlot = 'inputGmfgenUml'
	}
	 */
		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.tests.framework/model/testingFrameworkBase.uml'
			modelSlot = 'frameworkBase'
			useSingleGlobalResourceSet = true
		]

		components += new Reader => [
			uri = uriPrefix + '/org.eclipse.papyrus.utp/model/utp_1-2.profile.uml'
			modelSlot = 'utp'
			useSingleGlobalResourceSet = true
		]
		components += new RegisterUmlProfile => [
			profileSlot = 'utp'
		]
		components += new FileCopy => [
			sourceFile = '../../../../../framework/org.eclipse.papyrus.tests.framework/qvto/canonicalTests.qvto'
			targetFile = 'qvto/canonicalTests.qvto'
		]
		components += new QvtoTransformationWorkflowComponent => [
			addInputSlots('inputGmfgenUml')
			addInputSlots('gmfgenUmlMetamodel')
			addInputSlots('frameworkBase')
			addInputSlots('utp')
			transformationURI = qvtoScriptUri
			outputSlot = 'papyrusTestModel'
		]

		
		components += new DeleteFile => [
			uri = 'qvto/canonicalTests.qvto'
		]
	 
		components += new Writer => [
			modelSlot = 'papyrusTestModel'
			uri = testModelUri
			useSingleGlobalResourceSet = true
		]

		//3. Generate Test code
		/*
 	components += org.eclipse.emf.mwe.utils.Reader {
		uri = testModelUri
		modelSlot = 'papyrusTestModel'
	}
	 */
		components += new CodeGeneratorComponent => [
			tempSrcPath = testSrcGenLocation
			modelSlot = 'papyrusTestModel'
		]
		super.run(context)
	}

	def setURIs(String gmfgenUri) {
		this.gmfgenUri = gmfgenUri
		this.qvtoScriptUri = gmfgenUri + ".qvto"
		this.testModelUri = gmfgenUri + "test.uml"
	}

		

}
