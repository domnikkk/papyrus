/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.extendedtypes.invariantsemantictypeconfiguration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.papyrus.infra.extendedtypes.ComposedElementMatcher;

/**
 * Container Descriptor for {@link AndRule}
 */
public class AndRuleContainerDescriptor implements IInvariantContainerDescriptor<AndRule> {

	protected IElementMatcher elementMatcher = null; 
	
	/**
	 * {@inheritDoc}
	 */
	public IElementMatcher getMatcher() {
		return elementMatcher;
	}

	/**
	 * {@inheritDoc}
	 */
	public EReference[] getContainmentFeatures() {
		// TODO to manage containment features (should all defined features match?)
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public void init(AndRule ruleConfiguration) {
		List<IElementMatcher> matchers = new ArrayList<IElementMatcher>();
		for (InvariantRuleConfiguration composedRule : ruleConfiguration.getComposedRules()) {
			IInvariantContainerDescriptor<InvariantRuleConfiguration> containerDescriptor = RuleConfigurationFactoryRegistry.getInstance().createContainerDescriptor(composedRule);
			if (containerDescriptor!= null) {
				IElementMatcher containerMatcher =  containerDescriptor.getMatcher();
				if(containerMatcher !=null) {
					matchers.add(containerMatcher);
				}
			}
		}
		
		if(!matchers.isEmpty()) {
			elementMatcher = new ComposedElementMatcher(matchers);
		}
	}

}
