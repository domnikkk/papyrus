/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 417409
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.policy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.constraints.Activator;
import org.eclipse.papyrus.infra.constraints.ConstraintDescriptor;
import org.eclipse.papyrus.infra.constraints.constraints.Constraint;
import org.eclipse.papyrus.infra.constraints.runtime.ConstraintEngine;
import org.eclipse.papyrus.infra.constraints.runtime.ConstraintFactory;
import org.eclipse.papyrus.infra.constraints.runtime.DefaultConstraintEngine;
import org.eclipse.papyrus.infra.viewpoints.configuration.ModelRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.Rule;

/**
 * {@link ConstraintEngine} for viewpoint {@link Rule}
 */
public class ModelRuleConstraintEngine extends DefaultConstraintEngine<ModelRule> {

	protected final Map<ModelRule, List<Constraint>> modelRule2Constraints = new HashMap<ModelRule, List<Constraint>>();

	/** singleton instance */
	private static ModelRuleConstraintEngine instance;

	/**
	 * {@inheritDoc}
	 */
	public void refresh() {
		modelRule2Constraints.clear();
		fireConstraintsChanged();
	}

	public boolean matchesRule(ModelRule rule, EObject element) {
		IStructuredSelection selection = new StructuredSelection(element);
		List<Constraint> constraints = getConstraintsFor(rule);
		if(constraints == null || constraints.size() == 0) {
			return true;
		}
		for (Constraint c : constraints) {
 			try {
				if (!(c.match(selection))) {
					return false;
				}
			} catch (Throwable ex) {
				Activator.log.error(ex);
			}
		}
		return true;
	}

	/**
	 * Initialize and return the list of constraints for a given rule
	 * 
	 * @param rule
	 *            the rule to check
	 * @return the list of constraints for the specified rule or an empty list if no rule is registered for the rule
	 */
	protected List<Constraint> getConstraintsFor(ModelRule rule) {
		if (!modelRule2Constraints.containsKey(rule)) {
			List<Constraint> constraints = initializeConstraints(rule);
			modelRule2Constraints.put(rule, constraints);
		}
		return modelRule2Constraints.get(rule);
	}

	/**
	 * Initialize constraints for a given rule
	 * 
	 * @param rule
	 *            the rule that contains the constraints
	 * @return the list of constraints for the given rule or an empty list if no constraints were found for the given rule
	 */
	protected List<Constraint> initializeConstraints(ModelRule rule) {
		List<ConstraintDescriptor> descriptors = rule.getConstraints();
		if (descriptors == null || descriptors.size() == 0) {
			return Collections.emptyList();
		}

		List<Constraint> constraints = new ArrayList<Constraint>();
		for (ConstraintDescriptor descriptor : descriptors) {
			try {
				Constraint constraint = ConstraintFactory.getInstance().createFromModel(descriptor);
				if (constraint != null) {
					constraints.add(constraint);
				}
			} catch (Throwable e) {
				Activator.log.error(e);
			}

		}
		return constraints;
	}

	public static synchronized ModelRuleConstraintEngine getInstance() {
		if (instance == null) {
			instance = new ModelRuleConstraintEngine();
		}
		return instance;
	}

}
