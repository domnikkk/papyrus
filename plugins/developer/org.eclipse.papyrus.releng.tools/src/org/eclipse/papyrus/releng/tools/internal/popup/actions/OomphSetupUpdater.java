/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - Add support for updating Oomph setup models
 *  Christian W. Damus - Add support for updating multiple development streams in a setup model
 *  
 *****************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.popup.actions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class OomphSetupUpdater extends DependencyUpdater {

	public static final String ANNOTATION_SOURCE = "http://www.eclipse.org/Papyrus/2014/releng/dependencytools";//$NON-NLS-1$

	public static final String UPDATE_KEY = "updateFrom";//$NON-NLS-1$

	private final Pattern annotationPattern = Pattern.compile("updateFrom:([^:]+):(\\d+)"); //$NON-NLS-1$

	private final Pattern indexPattern = Pattern.compile(":\\d+$"); //$NON-NLS-1$

	private final String streamName;

	public OomphSetupUpdater(final IFile mapFile, final EList<Contribution> contributions, final String streamName) {
		super(mapFile, contributions);

		this.streamName = streamName;
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
		return String.format("//setupTask[@type='setup.targlets:TargletTask']/targlet/repositoryList[@name='%s']/repository", streamName);
	}

	@Override
	protected void updateUri(Node uri, String location) {
		uri.getAttributes().getNamedItem("url").setTextContent(location); //$NON-NLS-1$
	}

	@Override
	protected void save(Document document, File destination) throws Exception {
		// Use EMF resource serialization to format the file in the EMF style
		ResourceSet rset = new ResourceSetImpl();
		Resource resource = rset.createResource(URI.createFileURI(destination.getAbsolutePath()));
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
		options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		((XMLResource) resource).load(document, options);

		options.clear();
		options.put(XMLResource.OPTION_FORMATTED, true);
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
		resource.save(options);
	}
}
