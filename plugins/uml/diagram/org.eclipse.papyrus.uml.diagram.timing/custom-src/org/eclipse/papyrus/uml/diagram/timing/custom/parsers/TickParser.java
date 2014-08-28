/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.timing.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

/** Dummy parser; only present because the gmfgen generation fails otherwise. */
public class TickParser implements IParser {

	@Override
	public String getEditString(final IAdaptable element, final int flags) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IParserEditStatus isValidEditString(final IAdaptable element, final String editString) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ICommand getParseCommand(final IAdaptable element, final String newString, final int flags) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getPrintString(final IAdaptable element, final int flags) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isAffectingEvent(final Object event, final int flags) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IContentAssistProcessor getCompletionProcessor(final IAdaptable element) {
		throw new UnsupportedOperationException();
	}
}
