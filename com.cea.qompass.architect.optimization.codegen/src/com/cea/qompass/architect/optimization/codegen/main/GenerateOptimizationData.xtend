package com.cea.qompass.architect.optimization.codegen.main

import java.io.File
import java.io.FileWriter
import java.util.List
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.LiteralInteger
import org.eclipse.uml2.uml.LiteralString
import org.eclipse.uml2.uml.Model
import org.eclipse.ocl.utilities.UtilitiesPackage.Literals
import java.util.Collection

class GenerateOptimizationData {
	
	static def generate(Model im, String path){
		var file = new File(path + "milp.dat")
		if(!file.exists) 
			file.createNewFile
		val fileWriter = new FileWriter(file)
		val genCode = template(im)
		fileWriter.write(genCode)
			fileWriter.flush
			fileWriter.close
	}
	
	static def template(Model im) {
		val template = '''data;
		'''
		 		+  templateModelData(im.packagedElements.filter[name == "OptimizationModelData"].head as Class)
				//+ templateAdditionalData(im.packagedElements.filter[name == "OptimizationAdditionalData"].head as Class)
				//+ templateOptimizationConstraints(im.packagedElements.filter[name == "ResourceToFunctionConstraints"].head as Package)
				+ templateOptimizationConstraints(im.packagedElements.filter(InstanceSpecification))
		return template;
	
	}
	
	static def templateModelData(Class c){
		val template = '''
		«FOR property : c.attributes»
		param «property.name» := «(property.defaultValue as LiteralInteger).value»;
		«ENDFOR»
		'''
		
		return template;
	}
	
	static def templateAdditionalData(Class c){
		val template = '''
		«FOR property : c.attributes»
		param «property.name» := «(property.defaultValue as LiteralInteger).value»;
		«ENDFOR»
		'''
		return template
	}
	
	/*
	 * 
	static def templateOptimizationConstraints(Package p){
		val template = '''
		«FOR constraint : p.ownedRules»
		set «(constraint.specification as LiteralString).value»
		«ENDFOR»
		'''
		return template
	}
	 */
	 static def templateOptimizationConstraints(Iterable<InstanceSpecification> instSpecs){
		val template = '''
		«FOR instSpec : instSpecs»
		«var functionIndex = instSpec.slots.filter[definingFeature.name == "functionIndex"].head.values.head as LiteralInteger »
		set CPU4FCT[«functionIndex.value»] := 1;
		«ENDFOR»
		'''
		return template
	}
	 
}