package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.core.resources.IContainer
import org.eclipse.papyrus.acceleo.GenUtils
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenUtils
import org.eclipse.papyrus.cpp.codegen.utils.CppGenUtils
import org.eclipse.uml2.uml.Package

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
class CppPackageHeaderGenerator extends CppFileGenerator {
	static def generate(IContainer packageContainer, Package pkg) {
		val fileName = "Pkg_" + pkg.name + "." + CppCodeGenUtils.getHeaderSuffix()
		generateFile(packageContainer, fileName, pkg.generateCode, true)
	}

	static def generateCode(Package pkg) {
		val code = '''
		#ifndef PKG_«GenUtils.getFullNameUC(pkg)»
		#define PKG_«GenUtils.getFullNameUC(pkg)»

		/************************************************************
		              Pkg_«pkg.name» package header
		 ************************************************************/

		«CppIncludeUtil.includeDirective(CppClassIncludeClassDeclaration.cppOwnerPackageIncludePath(pkg.nestingPackage))»
		
		#ifndef _IN_
		#define _IN_
		#endif
		#ifndef _OUT_
		#define _OUT_
		#endif
		#ifndef _INOUT_
		#define _INOUT_
		#endif
		
			
		/* Package dependency header include                        */
		«FOR p: GenUtils.getUsedPackages(pkg)»
		«var path = GenUtils.getFullPath(p) + "/Pkg_"+ p.name + "." + CppCodeGenUtils.getHeaderSuffix»
		«CppIncludeUtil.includeDirective(path)»
		«ENDFOR»
		
		«CppIncludeUtil.CppIncludeHeader(pkg)»
		«CppGenUtils.openNS(pkg)»
		
		// Types defined within the package
		«IF pkg.name == "root"»
		«var x = 0»
		«ENDIF»
		«CppClassTypeAndEnum.CppClassTypeAndEnumPackage(pkg)»
		«CppGenUtils.closeNS(pkg)»
		
		/************************************************************
		              End of Pkg_«pkg.name» package header
		 ************************************************************/
		
		#endif'''
		return code
	}
}