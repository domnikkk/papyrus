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
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

public class RoleInstanceSpecificationLinkParser implements IParser {

	@Override
	public String getEditString(IAdaptable element, int flags) {
		return "";
	}

	@Override
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		return "<UNSPECIFIED>";
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		// TODO Auto-generated method stub
		return null;
	}
}
