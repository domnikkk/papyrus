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
import org.w3c.dom.NodeList;


public class OomphSetupUpdater extends DependencyUpdater {

	public static final String ANNOTATION_SOURCE = "http://www.eclipse.org/Papyrus/2014/releng/dependencytools";//$NON-NLS-1$

	public static final String UPDATE_KEY = "updateFrom";//$NON-NLS-1$

	private final Pattern annotationPattern = Pattern.compile("updateFrom:([^:]+):(\\d+)"); //$NON-NLS-1$

	private final Pattern indexPattern = Pattern.compile(":\\d+$"); //$NON-NLS-1$

	public OomphSetupUpdater(final IFile mapFile, final EList<Contribution> contributions) {
		super(mapFile, contributions);
	}

	@Override
	protected Pattern getCommentPattern() {
		return annotationPattern;
	}

	@Override
	protected String getCommentContent(Node comment) {
		StringBuilder result = new StringBuilder("updateFrom:"); //$NON-NLS-1$

		Element annotation = (Element) comment;
		NodeList details = annotation.getElementsByTagName("detail"); //$NON-NLS-1$
		for (int i = 0; i < details.getLength(); i++) {
			Element next = (Element) details.item(i);
			if (UPDATE_KEY.equals(next.getAttribute("key"))) { //$NON-NLS-1$ //$NON-NLS-2$
				String repoSpec = null;
				if (next.hasAttribute("value")) { //$NON-NLS-1$
					repoSpec = next.getAttribute("value"); //$NON-NLS-1$
				} else {
					NodeList values = next.getElementsByTagName("value"); //$NON-NLS-1$
					if (values.getLength() > 0) {
						repoSpec = values.item(0).getTextContent().trim();
					}
				}
				if (repoSpec != null) {
					result.append(repoSpec);
					if (!indexPattern.matcher(repoSpec).find()) {
						// default index
						result.append(":0"); //$NON-NLS-1$
						break;
					}
				}
			}
		}

		return result.toString();
	}

	@Override
	protected String getCommentSyntax() {
		return String.format("Annotation with source %s and detail 'updateFrom=<contributionName>[:<index>]?'", ANNOTATION_SOURCE); //$NON-NLS-1$
	}

	@Override
	protected Node getPrecedingComment(Node node) {
		Element result = null;

		for (Node next = node.getFirstChild(); next != null; next = next.getNextSibling()) {
			if (next.getNodeType() == Node.ELEMENT_NODE) {
				if ("annotation".equals(next.getNodeName())) { //$NON-NLS-1$
					Element annotation = (Element) next;
					if (ANNOTATION_SOURCE.equals(annotation.getAttribute("source"))) { //$NON-NLS-1$
						result = annotation;
						break;
					}
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
