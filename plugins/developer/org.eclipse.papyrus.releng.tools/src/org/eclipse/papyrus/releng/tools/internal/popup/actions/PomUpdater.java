/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.popup.actions;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Node;


public class PomUpdater extends DependencyUpdater {

	public PomUpdater(final IFile mapFile, final EList<Contribution> contributions) {
		super(mapFile, contributions);
	}

	@Override
	protected String getXpath() {
		return "/project/repositories/repository/url";
	}

	@Override
	protected void updateUri(Node uri, String location) {
		uri.setTextContent(location);
	}

}
