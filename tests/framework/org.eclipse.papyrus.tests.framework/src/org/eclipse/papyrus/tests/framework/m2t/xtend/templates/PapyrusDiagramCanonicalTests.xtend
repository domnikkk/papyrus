package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import java.io.File
import java.io.FileWriter
import java.util.ArrayList
import java.util.List
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package

class PapyrusDiagramCanonicalTests {

	
	static def generate(Model model, String tempSrcPath) {
		var List<String> suiteClasses = new ArrayList<String>
		for (Package subpackage : model.ownedElements.filter(Package)){
			var packagePath = TemplateQueries.computePackagePath(subpackage)
			var tempSrcFolder = new File(tempSrcPath + packagePath)
			if(!tempSrcFolder.exists) tempSrcFolder.mkdirs
	
			val allTestClasses = subpackage.allOwnedElements
				.filter[appliedStereotypes.exists[qualifiedName == "utp::TestContext"]]
				.map[e | e as Class]
				.filter[!ownedAttributes.empty]
			for (Class clazz : allTestClasses) {
								
				val fileName = clazz.name + ".java"
				var file = new File(tempSrcPath + packagePath + fileName)
				if(!file.exists) file.createNewFile
				val fileWriter = new FileWriter(file)
	
				//Invoke the proper template for the class
				val superClass = clazz.generals.head as Class
				val genCode = switch superClass.name {
					case "CreateNodeFromPaletteTest": TestNodeTemplate::generate(clazz)
					//case "TestChildNode": TestTopNodeTemplate::generate(clazz)
					case "CreateLinkFromPaletteTest": TestLinkTemplate::generate(clazz)
					case "CreateLinkOwnedBySourceFromPaletteTest": TestLinkTemplate::generate(clazz)
					case "AppearanceNodeTest" : AppearanceTestTemplate::generate(clazz)
					case "AbstractDropNodeTest" : DropTestTemplate::generate(clazz)
					default: throw new RuntimeException("Type of test not recognized: " + superClass.name)
				}
	
				fileWriter.write(genCode)
				fileWriter.flush
				fileWriter.close
			}
			var className = generatePackageTestSuiteClass(tempSrcPath, packagePath, allTestClasses)
			suiteClasses.add(className);
		}
		generateAllTestSuiteClass(tempSrcPath, model, suiteClasses)
	}
	
	def static generateAllTestSuiteClass(String tempSrcPath, Package model, List<String> testSuiteNames) {
		var path = tempSrcPath + TemplateQueries.computePackagePath(model) 
		var folderFile = new File(path)
		if(!folderFile.exists) folderFile.mkdirs
		val className = "AllGenTests"
		val fileName = className + ".java"
		var file = new File(path + fileName)
		if(!file.exists) file.createNewFile
		val fileWriter = new FileWriter(file)
		val genCode = AllPackageTestsTemplate::generate(className, model.name, testSuiteNames);
		fileWriter.write(genCode)
		fileWriter.flush
		fileWriter.close
		return className
	}
	
	def static generatePackageTestSuiteClass(String tempSrcPath, String packagePath, Iterable<Class> allTestClasses) {
		val className = "All" + allTestClasses.head.generals.head.name + "Gen"
		val fileName = className + ".java"
		var file = new File(tempSrcPath + packagePath + fileName)
		if(!file.exists) file.createNewFile
		val fileWriter = new FileWriter(file)
		var packageName = allTestClasses.toList.head.package.name;
		val genCode = AllPackageTestsTemplate::generate(className, packageName, allTestClasses.toList.map[name]);
		fileWriter.write(genCode)
		fileWriter.flush
		fileWriter.close
		return className
	}

}
