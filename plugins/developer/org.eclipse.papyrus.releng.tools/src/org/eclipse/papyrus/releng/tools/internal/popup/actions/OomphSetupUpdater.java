/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - Add support for updating Oomph setup models
 *  
 *****************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.popup.actions;

import java.util.regex.Pattern;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class OomphSetupUpdater extends DependencyUpdater {

	private final Pattern annotationPattern = Pattern.compile("updateFrom:([^:]+):(\\d+)"); //$NON-NLS-1$

	public OomphSetupUpdater(final IFile mapFile, final EList<Contribution> contributions) {
		super(mapFile, contributions);
	}

	@Override
	protected Pattern getCommentPattern() {
		return annotationPattern;
	}

	@Override
	protected String getCommentContent(Node comment) {
		return ((Element) comment).getAttribute("source"); //$NON-NLS-1$
	}

	@Override
	protected String getCommentSyntax() {
		return "updateFrom:<contributionName>:<index>"; //$NON-NLS-1$
	}

	@Override
	protected Node getPrecedingComment(Node node) {
		Element result = null;

		for (Node next = node.getFirstChild(); next != null; next = next.getNextSibling()) {
			if (next.getNodeType() == Node.ELEMENT_NODE) {
				if ("annotation".equals(next.getNodeName())) { //$NON-NLS-1$
					result = (Element) next;
					break;
				}
			}
		}

		return result;
	}

	@Override
	protected String getXpath() {
		return "//setupTask[@type='setup.targlets:TargletTask']/targlet/repositoryList/repository";
	}

	@Override
	protected void updateUri(Node uri, String location) {
		uri.getAttributes().getNamedItem("url").setTextContent(location); //$NON-NLS-1$
	}

}
