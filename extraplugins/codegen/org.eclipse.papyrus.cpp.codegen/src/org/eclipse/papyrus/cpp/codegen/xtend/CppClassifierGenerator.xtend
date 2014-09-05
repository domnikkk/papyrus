package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.core.resources.IContainer
import org.eclipse.papyrus.C_Cpp.ExternLibrary
import org.eclipse.papyrus.C_Cpp.External
import org.eclipse.papyrus.C_Cpp.Include
import org.eclipse.papyrus.C_Cpp.ManualGeneration
import org.eclipse.papyrus.C_Cpp.NoCodeGen
import org.eclipse.papyrus.C_Cpp.Template
import org.eclipse.papyrus.C_Cpp.Union
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenUtils
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.VisibilityKind
import org.eclipse.uml2.uml.profile.standard.Create
import org.eclipse.uml2.uml.util.UMLUtil
import org.eclipse.papyrus.acceleo.AcceleoDriver
import org.eclipse.papyrus.cpp.codegen.transformation.CppModelElementsCreator

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppClassifierGenerator extends CppFileGenerator {

	static def generate(IContainer container, Classifier classifier, String commentHeader) {

		// treat case of manual code generation
		if (GenUtils.hasStereotype(classifier, ManualGeneration)) {
			var ManualGeneration mg = UMLUtil.getStereotypeApplication(classifier, ManualGeneration);
			var Include cppInclude = UMLUtil.getStereotypeApplication(classifier, Include);
			var fileContentH = commentHeader +
					AcceleoDriver.evaluate(cppInclude.getHeader(), classifier, null);

			// generate header code
			val fileNameH = classifier.getName() + CppModelElementsCreator.DOT + CppCodeGenUtils.getHeaderSuffix()
			generateFile(container, fileNameH, fileContentH, true);

			// generate body code
			val fileContentB = commentHeader +
				AcceleoDriver.evaluate(cppInclude.getPreBody(), classifier, null) + GenUtils.NL +
				AcceleoDriver.evaluate(cppInclude.getBody(), classifier, null) + GenUtils.NL;
			var ext = GenUtils.maskNull(mg.getExtensionBody());
			if (ext.length() == 0) {
				ext = CppCodeGenUtils.getBodySuffix();
			}
			val fileNameB = classifier.getName() + CppModelElementsCreator.DOT + ext;
			generateFile(container, fileNameB, fileContentB, true);
		}

		// Only generate when no CppNoCodeGen stereotype is applied to the class
		else if ((!classifier.noCodeGen) && (!GenUtils.hasStereotype(classifier, Template)) &&
			(!(classifier instanceof Association))) {

			// Template Bound Class
			if (GenUtils.isTemplateBoundElement(classifier)) {
				val bindHeaderFileName = classifier.getName() + "." + CppCodeGenUtils.getHeaderSuffix()
				generateFile(container, bindHeaderFileName, classifier.generateBindHeaderCode, true);

				var bindBodyFileName = classifier.getName() + "." + CppCodeGenUtils.getBodySuffix()
				generateFile(container, bindBodyFileName, classifier.generateBindBodyCode, true);
			} else {

				// Class Header file generation
				val classHeaderFileName = classifier.getName() + "." + CppCodeGenUtils.getHeaderSuffix()
				generateFile(container, classHeaderFileName, classifier.generateClassHeaderCode, true);

				// Class Body file generation
				if (classifier instanceof Class) {
					var classBodyFileName = classifier.getName() + "." + CppCodeGenUtils.getBodySuffix()
					generateFile(container, classBodyFileName, classifier.generateClassBodyCode, true);
				}
			}
		}
	}

	static def noCodeGen(Element element) {
		return GenUtils.hasStereotype(element, NoCodeGen) || GenUtils.hasStereotype(element, External) ||
			GenUtils.hasStereotypeTree(element, ExternLibrary);
	}

	static def generateHeaderCode(Classifier classifier, String commentHeader) {
		var code = ''' 
			«commentHeader»
			AcceleoDriver.evaluate(cppInclude.getHeader(), classifier, null);
		'''
		return code
	}

	static def generateBindHeaderCode(Classifier classifier) {
		var code = ''' 
		#ifndef «GenUtils.getFullNameUC(classifier)»_H
		#define «GenUtils.getFullNameUC(classifier)»_H
		
		/************************************************************
		              «classifier.name» template binding header
		 ************************************************************/
		
		«FOR path : getSortedIncludePathList(classifier)» 
			«CppIncludeUtil.includeDirective(path)»
		«ENDFOR»
		
		«CppIncludeUtil.CppIncludeHeader(classifier)»
		
		«var tb = classifier.templateBindings»
		«var templateElement = tb.get(0)»
		«CppIncludeUtil.includeDirective(
			GenUtils.getFullPath(classifier.package) + '/' + (templateElement.owner as NamedElement).name + '.' +
				CppCodeGenUtils.getHeaderSuffix())»
		
		«CppGenUtils.openNS(classifier)»
		/************************************************************/
		typedef «(templateElement.owner as NamedElement).name»«FOR ps : templateElement.parameterSubstitutions»«CppTemplates.
			CppTemplateBindingParameter(ps)»«ENDFOR» «classifier.name»;
		
		«CppGenUtils.closeNS(classifier)»
		
		/************************************************************
		              End of «classifier.name» template binding header
		 ************************************************************/
		
		#endif'''
		return code
	}

	static def getSortedIncludePathList(Classifier classifier) {
		var includePathList = CppClassIncludeClassDeclaration.CppClassAllIncludes(classifier)
		var includePath = CppClassIncludeClassDeclaration.cppOwnerPackageIncludePath(classifier.package)
		var theList = includePathList.toList
		theList.add(includePath)
		theList.sort
		return theList
	}

	static def generateBindBodyCode(Classifier classifier) {
		var code = '''
		#define «GenUtils.getFullNameUC(classifier)»_BODY
		
		/************************************************************
		              «classifier.name» template binding body
		 ************************************************************/
		
		«CppIncludeUtil.CppIncludePreBody(classifier)»
		
		// include associated header file
		«CppIncludeUtil.includeDirective(
			GenUtils.getFullPath(classifier.package) + '/' + classifier.name + '.' + CppCodeGenUtils.getHeaderSuffix())»
		
		«CppIncludeUtil.CppIncludeBody(classifier)»
		
		«CppGenUtils.openNS(classifier)»
		
		// Derived includes directives
		«FOR path : CppClassIncludeClassDeclaration.CppClassAllIncludes(classifier).sort» 
			«CppIncludeUtil.includeDirective(path)»
		«ENDFOR»
		
		/************************************************************/
		«var tb = GenUtils.getTemplateBindings(classifier as Class)»
		«var templateElement = tb.targets.get(0)»
		template class «(templateElement.owner as NamedElement).name»<«FOR ps : tb.parameterSubstitutions»«CppTemplates.
			CppTemplateBindingParameter(ps)»«ENDFOR»;
		
		«CppGenUtils.closeNS(classifier)»
		
		/************************************************************
		              End of «classifier.name» template binding body
		 ************************************************************/'''
		return code
	}

	static def generateClassHeaderCode(Classifier classifier) {
		var code = '''
		#ifndef «GenUtils.getFullNameUC(classifier)»_H
		#define «GenUtils.getFullNameUC(classifier)»_H
		
		/************************************************************
		              «classifier.name» class header
		 ************************************************************/
		
		«FOR path : getSortedIncludePathList(classifier)» 
			«CppIncludeUtil.includeDirective(path)»
		«ENDFOR»
		
		«CppIncludeUtil.CppIncludeHeader(classifier)»
		
		«CppGenUtils.openNS(classifier)»
		
		/************************************************************/
		«CppDocumentation.CppElementDoc(classifier)»
		«CppTemplates.templateSignature(classifier)»«classUnionOrStruct(classifier)» «classifier.name»«CppClassInheritedDeclarations.
			CppClassInheritedDeclarations(classifier)» {
		«CppClassFriendDeclaration.CppClassIncludeFriendDeclaration(classifier)»«CppClassTypeAndEnum.
			CppClassTypeAndEnum(classifier)»
			«var publicVisibility = VisibilityKind.PUBLIC_LITERAL»
			   «CppGenUtils.getSection(publicVisibility, defaultInitializer(classifier))»
			   «CppGenUtils.getSection(publicVisibility,
			CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, publicVisibility).toString)»
			   «CppGenUtils.getSection(publicVisibility,
			CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, publicVisibility).toString)»
		
			«var protectedVisibility = VisibilityKind.PROTECTED_LITERAL»
			   «CppGenUtils.getSection(protectedVisibility,
			CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, protectedVisibility).toString)»
			   «CppGenUtils.getSection(protectedVisibility,
			CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, protectedVisibility).toString)»
		
			«var privateVisibility = VisibilityKind.PRIVATE_LITERAL»
			   «CppGenUtils.getSection(privateVisibility,
			CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, privateVisibility).toString)»
			   «CppGenUtils.getSection(privateVisibility,
			CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, privateVisibility).toString)»
		};
		/************************************************************/
		/* External declarations (package visibility)               */
		«var packageVisibility = VisibilityKind.PACKAGE_LITERAL»
		«CppClassAttributesDeclaration.CppClassAttributesDeclaration(classifier, packageVisibility)»
		«CppClassOperationsDeclaration.CppClassOperationsDeclaration(classifier, packageVisibility)»
		/************************************************************/
		
		«IF CppTemplates.isTemplate(classifier)»
			/************************************************************/
			/* Template functions                                       */
			«CppClassOperationsImplementation.CppClassOperationsImplementation(classifier, false)»
		«ENDIF»
		
		/* Inline functions                                         */
		«CppClassOperationsImplementation.CppClassOperationsImplementation(classifier, true)»
		«CppGenUtils.closeNS(classifier)»
		
		/************************************************************
		              End of «classifier.name» class header
		 ************************************************************/
		
		#endif'''
		return code
	}

	static def classUnionOrStruct(Classifier classifier) {
		if (GenUtils.hasStereotype(classifier, Union)) {
			return 'union'
		} else {
			if (classifier instanceof DataType) {
				CppGenUtils.resetVisibility(VisibilityKind.PUBLIC_LITERAL)
				return 'struct'
			} else {
				CppGenUtils.resetVisibility(VisibilityKind.PRIVATE_LITERAL)
				return 'class'
			}
		}
	}

	/**
	 * default initializer for non-static attributes with a default value TODO: should be disabled by default, since non-static members can be initialized directly in C++ 011
	 */
	static def defaultInitializer(Classifier classifier) {

		/*	Bug 422373: The default initializer should not be generated if there are any user-defined
		constructors.  In plain C++ code, the existence of a constructor with parameters
		means that the compiler will not synthesize a default one.
		
		E.g., this would be invalid in plain C++ code:
		class T1 { };
		class T2 { public: T(int); };
		T1 * t1 = new T1;     // OK, sythesized default constructor used
		T2 * t2a = new T2(5); // OK, user-defined constructor used
		T2 * t2b = new T2; // ERROR, default constructor was not synthesized
		
		Also, if the user has provided a default constructor in the code, we don't need
		to generate a second copy here.  A default constructor should only be generated
		here if the compiler would have synthesized one anyhow.  Otherwise the default
		property values should be set in the constructors that are generated by
		CppClassOperationsDeclaration.
		*/
		var code = '''
		«IF CppOperations.getOwnedOperations(classifier).filter[GenUtils.hasStereotype(it, Create)] == null»
			«var attributeList = classifier.attributes.filter[
			(it.isStatic == false) && (it.defaultValue != null) && (it.defaultValue.stringValue != null)]»
			«IF !attributeList.empty»
				«classifier.name» : «FOR a : attributeList SEPARATOR ', '»«a.name»(«a.defaultValue.stringValue»)«ENDFOR» {}
			«ENDIF»
		«ENDIF»'''
		return code.trim
	}

	static def generateClassBodyCode(Classifier classifier) {
		var code = '''
		#define «GenUtils.getFullName(classifier)»_BODY
		
		/************************************************************
		              «classifier.name» class body
		 ************************************************************/
		
		«CppIncludeUtil.CppIncludePreBody(classifier)»
		
		// include associated header file
		«CppIncludeUtil.includeDirective(
			GenUtils.getFullPath(classifier.nearestPackage) + '/' + classifier.name + '.' +
				CppCodeGenUtils.getHeaderSuffix())»
		
		// Derived includes directives
		«FOR path : CppClassIncludeClassDeclaration.CppClassAllIncludesDeclarationBody(classifier).sort» 
			«CppIncludeUtil.includeDirective(path)»
		«ENDFOR»
		
		«CppIncludeUtil.CppIncludeBody(classifier)»
		
		«CppGenUtils.openNS(classifier)»
		
		«CppAttribute.CppStaticAttributes(classifier)»
		
		«IF !classifier.isTemplate»
			«CppClassOperationsImplementation.CppClassOperationsImplementation(classifier, false)»
		«ENDIF»
		
		«CppGenUtils.closeNS(classifier)»
		
		/************************************************************
		              End of «classifier.name» class body
		 ************************************************************/'''
		return code
	}

}
