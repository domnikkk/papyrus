/*******************************************************************************
 * Copyright (c) 2011 - 2014 Mia-Software, CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366567 - [Releng] Tool to update rmaps
 *     Camille Letavernier (CEA LIST) - Generalize to support POMs
 *******************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.popup.actions;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Node;

/**
 * Updates a Buckminster rmap (XML file) from a B3 build model. The rmap is updated using
 * comments in the XML that reference the model elements from which the update sites must be copied.
 * <p>
 * These comments must appear before each "rm:uri" element which must be updated automatically, like this:
 *
 * <pre>
 * 	&lt;!-- updateFrom("Eclipse", 0) --&gt;
 * 	&lt;rm:uri format="http://download.eclipse.org/eclipse/updates/4.2milestones/S-4.2M3-201110281100"/&gt;
 * </pre>
 *
 * The first parameter in updateFrom is the label of a contribution, which you can find in the b3aggrcon files:
 *
 * <pre>
 * &lt;aggregator:Contribution ... label="xxx"&gt;
 * </pre>
 *
 * The second parameter is the index of the "repositories" element that must be used (in case there are several update sites defined on one
 * contribution).
 */
public class MapUpdater extends DependencyUpdater {

	public MapUpdater(final IFile mapFile, final EList<Contribution> contributions) {
		super(mapFile, contributions);
	}

	@Override
	protected String getXpath() {
		return "/rmap/searchPath/provider[@readerType='p2']/uri";
	}

	@Override
	protected void updateUri(Node uri, String location) {
		if(location.startsWith(PREFIX)) {
			location = "{0}/" + location.substring(PREFIX.length()); //$NON-NLS-1$
		}
		uri.getAttributes().getNamedItem("format").setTextContent(location); //$NON-NLS-1$
	}

}
