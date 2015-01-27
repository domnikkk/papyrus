/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC)  gabriel.pascual@all4tec.net -  bug 382954
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.InstanceSpecification;

/**
 * The base class of InstanceSpecification link edge parser
 * 
 */
public class RoleInstanceSpecificationLinkParser implements IParser {

	protected static final String UNSPECIFIED_LABEL = "<UNSPECIFIED>"; //$NON-NLS-1$

	public RoleInstanceSpecificationLinkParser() {
	}

	@Override
	public String getEditString(IAdaptable element, int flags) {
		return "";
	}

	@Override
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		return null;
	}

	@Override
	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		return null;
	}

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		return getPrintString(element);
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		return false;
	}

	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	private String getPrintString(IAdaptable element) {
		String namedNodeType = getNamedNodeType(element);
		return (namedNodeType == null || namedNodeType.isEmpty()) ? UNSPECIFIED_LABEL : namedNodeType;
	}

	private String getNamedNodeType(IAdaptable element) {
		InstanceSpecification instanceSpecification = ((InstanceSpecification) ((EObjectAdapter) element).getRealObject());
		return instanceSpecification.getName();
	}
}
