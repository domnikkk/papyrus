package org.eclipse.papyrus.cpp.codegen.xtend

import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.emf.common.util.EList
import org.eclipse.papyrus.cpp.codegen.Activator
import org.eclipse.papyrus.cpp.codegen.utils.ClassUtils
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.PackageableElement
import org.eclipse.papyrus.cpp.codegen.transformation.CppModelElementsCreator

/**
 * @author Önder GÜRCAN (onder.gurcan@cea.fr)
 */
public class CppCodeGenerator {
	
	/**
	 * Generate code for a passed packageable element and the elements required by it (in the sense of #included statements)
	 * 
	 * @param mec model elements creator 
	 * @param pe the element that should be generated
	 * @param alreadyHandled list of packageable elements for which code has already been generated. 
	 * @param recurse if the passed packageableElement is a package, generate code for its contents (recursively).
	 */
	static def generate(CppModelElementsCreator mec, PackageableElement pe, EList<PackageableElement> alreadyHandled,
		boolean recurse) {
		val srcPkg = mec.getContainer(pe);
		try {
			alreadyHandled.add(pe);
			mec.createPackageableElement(srcPkg, null, pe, false);
		} catch (CoreException coreException) {
			Activator.log.error(coreException);
		} finally {
			// Refresh the container for the newly created files.  This needs to be done even
			// during error because of the possibility for partial results.
			try {
				srcPkg.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch(CoreException e) {
				Activator.log.error(e);
 			}
		}
		
		if (pe instanceof Classifier) {
			var EList<Classifier> requiredClassifiers = ClassUtils.includedClassifiers((pe as Classifier));
			for (Classifier requiredClassifier : requiredClassifiers) {
				if (!alreadyHandled.contains(requiredClassifier)) {
					generate(mec, requiredClassifier, alreadyHandled, false);
				}
			}
		}
		// owning package is required by generated code.
		var Package owningPackage = pe.getNearestPackage();
		if ((owningPackage != null) && (owningPackage != pe)) {
			if (!alreadyHandled.contains(owningPackage)) {
				generate(mec, owningPackage, alreadyHandled, false);
			}
		}
		if ((pe instanceof Package) && recurse) {
			// Continue generation parsing package contents
			for(PackageableElement currentElement : (pe as Package).getPackagedElements()) {
				generate(mec, currentElement, alreadyHandled, recurse);
			}
		}
	}
}
