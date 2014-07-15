package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import java.io.File
import java.io.FileWriter
import org.eclipse.papyrus.tests.framework.m2t.xtend.templates.AllCanonicalTestsTemplate
import org.eclipse.papyrus.tests.framework.m2t.xtend.templates.TemplateQueries
import org.eclipse.papyrus.tests.framework.m2t.xtend.templates.TestLinkTemplate
import org.eclipse.papyrus.tests.framework.m2t.xtend.templates.TestTopNodeTemplate
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model

class PapyrusDiagramCanonicalTests {

	static def generate(Model model, String tempSrcPath) {
		var packagePath = TemplateQueries.computePackagePath(model)
		var tempSrcFolder = new File(tempSrcPath + packagePath)
		if(!tempSrcFolder.exists) tempSrcFolder.mkdirs

		val allTestClasses = model.packagedElements.filter(typeof(Class))
		for (Class clazz : allTestClasses) {
			val fileName = clazz.name + ".java"
			var file = new File(tempSrcPath + packagePath + fileName)
			if(!file.exists) file.createNewFile
			val fileWriter = new FileWriter(file)

			//Invoke the proper template for the class
			val superClass = clazz.generals.head as Class
			val genCode = switch superClass.name {
				case "CreateNodeFromPaletteTest": TestTopNodeTemplate::generate(clazz)
				//case "TestChildNode": TestTopNodeTemplate::generate(clazz)
				case "CreateLinkFromPaletteTest": TestLinkTemplate::generate(clazz)
				case "CreateLinkOwnedBySourceFromPaletteTest": TestLinkTemplate::generate(clazz)
				default: throw new RuntimeException("Type of test not recognized: " + superClass.name)
			}

			fileWriter.write(genCode)
			fileWriter.flush
			fileWriter.close
		}

		generateAllCanonicalTestsClass(tempSrcPath, packagePath, allTestClasses)
	}
	
	def static generateAllCanonicalTestsClass(String tempSrcPath, String packagePath, Iterable<Class> allTestClasses) {
		val fileName = "AllCanonicalTestsGen.java"
		var file = new File(tempSrcPath + packagePath + fileName)
		if(!file.exists) file.createNewFile
		val fileWriter = new FileWriter(file)
		val genCode = AllCanonicalTestsTemplate::generate(allTestClasses.toList);
		fileWriter.write(genCode)
		fileWriter.flush
		fileWriter.close
	}

}
