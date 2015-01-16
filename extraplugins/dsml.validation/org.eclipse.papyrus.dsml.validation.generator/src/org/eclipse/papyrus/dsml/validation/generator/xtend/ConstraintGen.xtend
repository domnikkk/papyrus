package org.eclipse.papyrus.dsml.validation.generator.xtend;

import org.eclipse.uml2.uml.Constraint
import org.eclipse.papyrus.dsml.validation.model.profilenames.Utils
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.papyrus.codegen.base.IPFileSystemAccess

/**
 * A generator for Java based constraints
 */
class ConstraintGen {

	static def generateConstraint(Constraint constraint) '''
		/**
		 * Created by the Papyrus DSML plugin generator
		 */
		
		package «Utils.getTopPkg()».constraints;
		
		import org.eclipse.core.runtime.IStatus;
		import org.eclipse.emf.validation.AbstractModelConstraint;
		import org.eclipse.emf.validation.IValidationContext;
		import org.eclipse.uml2.uml.Element;
		import org.eclipse.uml2.uml.Stereotype;
		
		public class «constraint.name»Constraint extends AbstractModelConstraint {
		
			public IStatus validate(IValidationContext ctx) {
				if (ctx.getTarget() instanceof Element) {
					Element element = (Element) ctx.getTarget();
		
					«IF Utils.isConstraintForStereotype(constraint)»
						Stereotype appliedStereotype = element.getAppliedStereotype("«Utils.getConstraintForStereotype(constraint)»"); //$NON-NLS-1$
						if (appliedStereotype != null) {
							if (evaluateConstraint(element, appliedStereotype)) {
								return ctx.createSuccessStatus();
							}
							else {
								return ctx.createFailureStatus("Constraint not validated"); //$NON-NLS-1$
							}
						}
					«ELSE»
						if (evaluateConstraint(element)) {
							return ctx.createSuccessStatus();
						}
						else {
							return ctx.createFailureStatus("Constraint not validated");
						}
					«ENDIF»
				}
				return ctx.createSuccessStatus();
			}
		
			«IF Utils.isConstraintForStereotype(constraint)»
				private boolean evaluateConstraint(Element self, Stereotype appliedStereotype) {
					«IF Utils.getJavaConstraintBody(constraint.specification) != null»
						«Utils.getJavaConstraintBody(constraint.specification)»
					«ELSE»
						return true;
					«ENDIF»
				}
			«ENDIF»	
		
			«IF !Utils.isConstraintForStereotype(constraint)»
				private boolean evaluateConstraint(Element self) {
					«IF Utils.getJavaConstraintBody(constraint.specification) != null»
						«Utils.getJavaConstraintBody(constraint.specification)»
					«ELSE»
						return true;
					«ENDIF»
				}
			«ENDIF»
		}
	'''

	/**
	 * @see org.eclipse.xtext.generator.IGenerator#doGenerate(org.eclipse.emf.ecore.resource.Resource, org.eclipse.xtext.generator.IFileSystemAccess)
	 *
	 * @param input
	 * @param fsa
	 */
	static def generate(Resource input, IPFileSystemAccess fsa) {
		val contentIterator = input.allContents.filter(typeof(Constraint))
		while (contentIterator.hasNext) {
			val constraint = contentIterator.next
			if (Utils.hasSpecificationForJava(constraint)) {
				val fileName = Utils.getTopPkg().replaceAll('\\.', '/') + '/constraints/' + constraint.getName() +
					'Constraint.java';
				fsa.generateFile(fileName, constraint.generateConstraint.toString)
			}
		}
	}
}
