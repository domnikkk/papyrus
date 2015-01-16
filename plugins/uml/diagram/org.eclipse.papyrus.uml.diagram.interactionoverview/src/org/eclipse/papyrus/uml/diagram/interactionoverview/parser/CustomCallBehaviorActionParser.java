/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.interactionoverview.parser;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.CallBehaviorActionParser;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.UMLPackage;

public class CustomCallBehaviorActionParser extends CallBehaviorActionParser {
	
	public static final String DEFAULT_VALUE = "";
	
	public CustomCallBehaviorActionParser() {
		super(new EAttribute[] {});
	}
	
	@Override
	public String getPrintString(final IAdaptable element, final int flags) {
		final Object obj = EMFHelper.getEObject(element);
		if (obj instanceof CallBehaviorAction) {
			final CallBehaviorAction action = (CallBehaviorAction) obj;
			String actionName = action.getName();
			if (hasContent(actionName)) {
				return actionName;
			}
			
			String behaviorName = null;
			if (action.getBehavior() != null) {
				behaviorName = action.getBehavior().getName();
			}
			
			if (hasContent(behaviorName)) {
				return behaviorName;
			}
		}
		return DEFAULT_VALUE;
	}
	
	@Override
	public String getEditString(final IAdaptable element, final int flags) {
		final Object obj = EMFHelper.getEObject(element);
		if (obj instanceof CallBehaviorAction) {
			final CallBehaviorAction action = (CallBehaviorAction) obj;
			String actionName = action.getName();
			if (hasContent(actionName)) {
				return actionName;
			}
		}
		return DEFAULT_VALUE;
	}

	/**
	 * @return false if str == null or str is empty
	 */
	private boolean hasContent(String str) {
		return str != null && str.length() != 0;
	}
	
	@Override
	public ICommand getParseCommand(final IAdaptable adapter, final String newString, final int flags) {
		if (newString == null) {
			return UnexecutableCommand.INSTANCE;
		}
		final EObject element = EMFHelper.getEObject(adapter);
		final TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(element);
		if (editingDomain == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (element instanceof CallBehaviorAction) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getModificationCommand(element, UMLPackage.eINSTANCE.getNamedElement_Name(), newString);
	}
}
