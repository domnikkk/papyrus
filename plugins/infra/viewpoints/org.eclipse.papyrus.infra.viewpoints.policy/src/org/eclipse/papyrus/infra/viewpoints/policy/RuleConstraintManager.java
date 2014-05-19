/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.policy;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.constraints.ConstraintDescriptor;
import org.eclipse.papyrus.infra.viewpoints.configuration.ModelRule;

/**
 * Manager for the rule constraints
 */
public class RuleConstraintManager {

	/**
	 * The singleton instance
	 */
	private static RuleConstraintManager instance;

	public static synchronized RuleConstraintManager getInstance() {
		if (instance == null) {
			instance = new RuleConstraintManager();
		}
		return instance;
	}

	public boolean matchRule(ModelRule rule, EObject element) {
		// if no rule, return true
		List<ConstraintDescriptor> constraintDescriptors = rule.getConstraints();
		if (constraintDescriptors == null || constraintDescriptors.size() == 0) {
			return true;
		}

		return ModelRuleConstraintEngine.getInstance().matchesRule(rule, element);

	}

}
