package org.eclipse.papyrus.qompass.designer.core.templates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.qompass.designer.core.StUtils;
import org.eclipse.papyrus.qompass.designer.core.transformations.Copy;
import org.eclipse.papyrus.qompass.designer.core.transformations.TransformationContext;
import org.eclipse.papyrus.qompass.designer.core.transformations.TransformationException;
import org.eclipse.papyrus.qompass.designer.core.transformations.filters.FilterSignatures;
import org.eclipse.papyrus.qompass.designer.core.transformations.filters.FilterTemplate;
import org.eclipse.papyrus.qompass.designer.core.transformations.filters.FixTemplateSync;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

import FCM.Template;
import FCM.TemplateKind;

/**
 * This class encapsulated functions around template instantiation.
 * 
 * With respect to composite structures, we need to consider two different
 * cases: (1) the type of a property is a template class itself (2) the type of
 * a property is a sub-class (nesting) of the template class. We consider that
 * such a class inherits the template signature of its owner, i.e. it can access
 * formal parameters of the owning template class. (3) the type of a property is
 * a normal class
 */

public class TemplateInstantiation {

	public TemplateInstantiation(Copy copy, TemplateBinding binding) throws TransformationException {
		this(copy, binding, null);
	}

	public TemplateInstantiation(final Copy copy_, final TemplateBinding binding, Object args[]) throws TransformationException {
		if(binding == null) {
			// user should never see this exception
			throw new TransformationException("Passed binding is null");
		}
		signature = binding.getSignature();
		if(signature == null) {
			throw new TransformationException("Passed template binding does not have a signature");
		}
		packageTemplate = (Package)signature.getOwner();
		/*
		 * copy = (Copy)copy_.clone();
		 * // make copy of copy listeners (clone alone does not duplicate contained lists)
		 * copy.preCopyListeners = new BasicEList<CopyListener>();
		 * copy.preCopyListeners.addAll(copy_.preCopyListeners);
		 * copy.postCopyListeners = new BasicEList<CopyListener>();
		 * copy.postCopyListeners.addAll(copy_.postCopyListeners);
		 */
		copy = copy_;

		Package boundPackage = (Package)binding.getBoundElement();
		// set template instantiation parameter. Used by acceleo templates to get relation between
		// formal and actual parameters
		TransformationContext.setTemplateInstantiation(this);

		copy.setPackageTemplate(packageTemplate, boundPackage);
		// some parameters of the package template may not be owned. Thus, an additional package
		// template is involved in the instantiation
		for(TemplateParameter parameter : signature.getParameters()) {
			//
			if(parameter.getSignature() != signature) {
				Package addedPkgTemplate = parameter.getSignature().getNearestPackage();
				copy.setPackageTemplate(addedPkgTemplate, boundPackage);
			}
		}
		this.binding = binding;
		this.args = args;

		// register a combination of formal/actual in the hashmap
		// => copy will replace actual with formal
		for(TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {
			ParameterableElement formal = substitution.getFormal().getParameteredElement();
			ParameterableElement actual = substitution.getActual();
			copy.put(formal, actual);
		}

		// add copy listeners ---
		// remove template signature
		if(!copy.preCopyListeners.contains(FilterSignatures.getInstance())) {
			copy.preCopyListeners.add(FilterSignatures.getInstance());
		}

		// 2. special treatment for elements stereotyped with template parameter
		if(!copy.preCopyListeners.contains(TemplateInstantiationListener.getInstance())) {
			copy.preCopyListeners.add(TemplateInstantiationListener.getInstance());
		}
		TemplateInstantiationListener.getInstance().init(copy, binding, args);
		InstantiateCppInclude.getInstance().init(binding, args);

		if(!copy.postCopyListeners.contains(FixTemplateSync.getInstance())) {
			copy.postCopyListeners.add(FixTemplateSync.getInstance());
		}
		if(!copy.postCopyListeners.contains(InstantiateCppInclude.getInstance())) {
			copy.postCopyListeners.add(InstantiateCppInclude.getInstance());
		}
	}


	Package packageTemplate;

	public TemplateBinding binding;

	public Copy copy;

	TemplateSignature signature;

	Object[] args;

	/**
	 * Bind a named element. Besides of binding the passed element, this
	 * operation will bind all elements that are referenced (required) by the
	 * passed element.
	 * 
	 * In consequence, typically only a small part of a package template is
	 * actually created within the bound package. We call this mechanism lazy
	 * instantiation/binding
	 * 
	 * @param copy
	 *        Source and target model
	 * @param namedElement
	 *        A member within the package template which should be bound,
	 *        i.e. for which template instantiation should be performed.
	 * @param binding
	 *        The binding between the bound package and the package template
	 * @param args
	 *        Acceleo arguments
	 */
	@SuppressWarnings("unchecked")
	public <T extends NamedElement> T bindNamedElement(T namedElement) throws TransformationException {
		if(namedElement == null) {
			// user should never see this exception
			throw new TransformationException("Passed template element is null");
		}

		Package boundPackage = (Package)binding.getBoundElement();
		EList<Namespace> path = TemplateUtils.relativePathWithMerge(namedElement, packageTemplate);
		Template template = StUtils.getApplication(namedElement, Template.class);
		TemplateKind templateKind = (template != null) ?
			templateKind = template.getKind() :
			TemplateKind.PASS_FORMAL;

		if((templateKind == TemplateKind.ACCUMULATE) || (templateKind == TemplateKind.LATE_EVALUATION)) {
			// TODO: not very clean yet
			path = TemplateUtils.relativePathWithMerge(namedElement, copy.source);
			if(path == null) {
				// element is imported
				path = namedElement.allNamespaces();
			}
			boundPackage = copy.target; // CreationUtils.getAndCreate
										// (sat.target, "accumulate");
		}

		if(path != null) {
			// register owning package template (template can be defined in
			// multiple packages)
			Element owner = TemplateUtils.getTemplateOwner(namedElement, signature);
			if(owner != null) {
				// note that we might overwrite an existing value
				copy.put(owner, boundPackage);
			}
		}
		else {
			// element is not part of the package template referenced by the
			// binding
			if(namedElement instanceof TemplateableElement) {
				// check whether the referenced element is part of another
				// package template,
				// (for which we allow for implicit binding with the first
				// template parameter)
				TemplateSignature signatureOfNE = TemplateUtils.getSignature((TemplateableElement)namedElement);
				if((signatureOfNE != null) && (signature != signatureOfNE)) {
					TemplateBinding subBinding = TemplateUtils.getSubBinding(copy.target, (TemplateableElement)namedElement, binding);
					TemplateInstantiation ti = new TemplateInstantiation(copy, subBinding, args);
					NamedElement ret = ti.bindNamedElement(namedElement);
					return (T)ret;
				}
			}

			// => nothing to do with respect to template instantiation, but
			// since the template is potentially instantiated in another model,
			// the referenced element might need to be copied.

			return copy.getCopy(namedElement);
		}
		// element is contained in the template package, examine whether it
		// already exists in the
		// bound package.

		NamedElement existingMember = (NamedElement)copy.get(namedElement);
		if((existingMember != null) && (templateKind != TemplateKind.ACCUMULATE)) {
			// element is already existing (and thus bound), nothing to do
			// additional check, whether the ACCUMULATE information is unset)
			// however: if the element is a package, existence is not sufficient
			// since it might have been created via getAndCreate above
			/*
			 * if(namedElement instanceof Package) {
			 * bindPackage((Package)namedElement);
			 * }
			 */
			return (T)existingMember;
		}

		if(existingMember == null) {
			FilterTemplate.getInstance().setActive(false);
			T copiedElement = copy.getCopy(namedElement);
			FilterTemplate.getInstance().setActive(true);
			copy.setPackageTemplate(null, null);
			return copiedElement;
		}
		return (T)existingMember;
	}

}