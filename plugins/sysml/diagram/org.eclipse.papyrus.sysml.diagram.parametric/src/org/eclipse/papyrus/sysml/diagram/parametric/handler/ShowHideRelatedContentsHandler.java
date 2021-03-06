/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		R�gis CHEVREL: chevrel.regis <at> gmail.com
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.parametric.handler;

import org.eclipse.papyrus.uml.diagram.common.actions.handlers.AbstractShowHideHandler;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideRelatedContentsEditPolicy;

/**
 * Handler for the {@link ShowHideRelatedContentsAction}
 */
public class ShowHideRelatedContentsHandler extends AbstractShowHideHandler {

	/** Constructor. */
	public ShowHideRelatedContentsHandler() {
		super(new ShowHideRelatedContentsAction(), ShowHideRelatedContentsEditPolicy.SHOW_HIDE_RELATED_CONTENTS_POLICY);
	}
}
