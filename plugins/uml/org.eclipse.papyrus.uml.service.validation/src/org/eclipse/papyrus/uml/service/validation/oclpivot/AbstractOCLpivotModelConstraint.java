/**
 * <copyright>
 *
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Radek Dvorak (Borland) - Bugzilla 165458
 *   Ansgar Radermacher (CEA) - created variant for evaluation with OCL pivot element
 *
 * </copyright>
 */

package org.eclipse.papyrus.uml.service.validation.oclpivot;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.helper.OCLHelper;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This class is based on the AbstractOCLModelConstraint in org.eclipse.emf.validation.ocl. The main difference is that it enforces
 * the validation with the pivot OCL variant, see bug 436296 - [Validation] DSML plugin generation is broken
 *
 * @link org.eclipse.emf.validation.ocl.AbstractOCLModelConstraint
 *
 * @author Ansgar Radermacher
 */
public abstract class AbstractOCLpivotModelConstraint implements IModelConstraint {

	private final IConstraintDescriptor descriptor;

	/**
	 * A separate query is maintained for each EClass of model object that this
	 * constraint handles. Maintain the values in weak references also, because
	 * the queries reference the EClasses that are the keys!
	 */
	private final java.util.Map<Stereotype, Reference<?>> queries = new java.util.WeakHashMap<Stereotype, Reference<?>>();

	private QueryManager queryManager;

	protected static OCL oclInstance = null;

	/**
	 * Initializes me with the <code>descriptor</code> which contains my OCL
	 * body.
	 * 
	 * @param descriptor
	 *            the descriptor, which must contain an OCL expression in its
	 *            body
	 */
	public AbstractOCLpivotModelConstraint(IConstraintDescriptor descriptor) {
		this.descriptor = descriptor;
	}

	/**
	 * Obtains the cached OCL query/constraint that implements me for the
	 * specified element's metaclass.
	 * 
	 * @param target
	 *            a model element
	 * @return the corresponding OCL query
	 */
	public ExpressionInOCL getConstraintCondition(EObject target) {
		ExpressionInOCL result = null;

		Stereotype umlStereotype = UMLUtil.getStereotype(target);

		if (umlStereotype == null) {
			return null;
		}

		@SuppressWarnings("unchecked")
		Reference<ExpressionInOCL> reference = (Reference<ExpressionInOCL>) queries.get(umlStereotype);
		if (reference != null) {
			result = reference.get();
		}

		if (result == null) {
			// lazily initialize the condition.
			if (oclInstance == null) {
				OCL.initialize(null);
				PivotEnvironmentFactory pef = new PivotEnvironmentFactory(null,
						new MetaModelManager());
				oclInstance = OCL.newInstance(pef);
			}

			OCLHelper oclHelper = oclInstance.createOCLHelper();

			try {
				NamedElement context =
						oclInstance.getMetaModelManager().getPivotOf(NamedElement.class, umlStereotype);

				oclHelper.setContext((Type) context);

				String expression = getDescriptor().getBody();
				result = oclHelper.createQuery(expression);
			} catch (ParserException parserException) {
				throw new WrappedException(parserException);
			}

			queries.put(umlStereotype, new WeakReference<ExpressionInOCL>(
					result));
		}

		return result;
	}

	// implements the inherited method
	public IStatus validate(IValidationContext ctx) {
		EObject target = ctx.getTarget();

		try {
			if (getQueryManager().check(target)) {
				return ctx.createSuccessStatus();
			} else {
				// OCL constraints only support the target object as an extraction
				// variable and result locus, as OCL has no way to provide
				// additional extractions. Also, there is no way for the OCL
				// to access the context object
				return ctx.createFailureStatus(target);
			}

		} catch (Exception e) {
			// do not raise an exception, but create a failure status. This is consistent with
			// the behavior of the "in-profile" OCL pivot validation.
			String message = String.format("The '%s' constraint is invalid - %s", getDescriptor().getName(), e.getMessage());
			return new ConstraintStatus(this, target, IStatus.ERROR, -1,
					message, null);
		}
	}

	private QueryManager getQueryManager() {
		if (queryManager == null) {
			queryManager = new QueryManager();
		}

		return queryManager;
	}

	/*
	 * (non-Javadoc) Implements the interface method.
	 */
	public IConstraintDescriptor getDescriptor() {
		return descriptor;
	}

	/**
	 * An object that knows how to obtain and evaluate the query implementation
	 * appropriate to the constraint's environment factory, accounting for
	 * whether it is using the OCL 1.0 or later API.
	 *
	 * @author Christian W. Damus (cdamus)
	 */
	private final class QueryManager {

		QueryManager() {
		}

		/**
		 * Obtains and checks the appropriate parsed constraint for the
		 * specified target element.
		 * 
		 * @param target
		 *            an element to be validated
		 * @return whether it passed the constraint
		 */
		boolean check(EObject target) {
			ExpressionInOCL query = getConstraintCondition(target);
			return (Boolean) oclInstance.evaluate(target, query);
		}
	}
}
