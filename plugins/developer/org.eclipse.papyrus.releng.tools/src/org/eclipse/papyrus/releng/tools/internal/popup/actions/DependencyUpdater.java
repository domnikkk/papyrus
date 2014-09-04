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

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.releng.tools.internal.Activator;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public abstract class DependencyUpdater {

	protected final IFile fMapFile;

	protected final EList<Contribution> contributions;

	public DependencyUpdater(final IFile mapFile, final EList<Contribution> contributions) {
		this.fMapFile = mapFile;
		this.contributions = contributions;
	}

	protected static final String PREFIX = "http://download.eclipse.org/"; //$NON-NLS-1$

	public void updateDocument() throws CoreException {
		try {
			File mapFile = this.fMapFile.getLocation().toFile();

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(mapFile);
			doc.normalize();
			Element documentElement = doc.getDocumentElement();

			XPath xpath = XPathFactory.newInstance().newXPath();
			NodeList uris = (NodeList)xpath.evaluate(getXpath(), documentElement, XPathConstants.NODESET);

			for(int i = 0; i < uris.getLength(); i++) {
				Node uri = uris.item(i);
				Comment precedingComment = getPrecedingComment(uri);
				if(precedingComment != null) {
					String comment = precedingComment.getTextContent();
					Pattern pattern = Pattern.compile("updateFrom\\s*\\(\\s*\"(.*?)\"\\s*,\\s*(\\d+)\\s*\\)"); //$NON-NLS-1$
					Matcher matcher = pattern.matcher(comment);
					if(matcher.find()) {
						String contributionName = matcher.group(1);
						int repositoryIndex = Integer.parseInt(matcher.group(2));
						updateWithContribution(uri, contributionName, repositoryIndex);
					} else if(comment.contains("updateFrom")) { //$NON-NLS-1$
						throw new Exception("Wrong syntax for 'updateFrom' : should be updateFrom(\"<contributionName>\",<index>)"); //$NON-NLS-1$
					}
				}
			}

			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$

			StreamResult result = new StreamResult(mapFile);
			DOMSource source = new DOMSource(doc);
			transformer.transform(source, result);

			this.fMapFile.refreshLocal(IResource.DEPTH_ZERO, new NullProgressMonitor());

		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error updating map: " + e.getLocalizedMessage(), e)); //$NON-NLS-1$
		}
	}

	protected void updateWithContribution(final Node uri, final String contributionName, final int repositoryIndex) {
		Contribution contribution = findContribution(contributionName);
		if(contribution == null) {
			throw new RuntimeException("'updateFrom' failed: cannot find contribution with label \"" + contributionName + "\""); //$NON-NLS-1$ //$NON-NLS-2$
		}
		EList<MappedRepository> repositories = contribution.getRepositories();
		if(repositoryIndex >= repositories.size()) {
			throw new RuntimeException("wrong index in updateFrom(\"" + contributionName + "\"" + repositoryIndex //$NON-NLS-1$ //$NON-NLS-2$
				+ ") : there are " + repositories.size() + " contributions"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		String location = repositories.get(repositoryIndex).getLocation();

		updateUri(uri, location);
	}

	protected abstract void updateUri(Node uri, String location);

	protected Contribution findContribution(final String contributionName) {
		Contribution matchingContribution = null;
		for(Contribution contribution : this.contributions) {
			if(contributionName.equalsIgnoreCase(contribution.getLabel())) {
				matchingContribution = contribution;
			}
		}
		return matchingContribution;
	}

	protected Comment getPrecedingComment(final Node node) {
		Comment comment = null;
		Node previous = node.getPreviousSibling();
		while(previous != null) {
			if(previous.getNodeType() == Node.COMMENT_NODE) {
				comment = (Comment)previous;
				break;
			} else if(previous.getNodeType() != Node.TEXT_NODE) {
				break;
			}
			previous = previous.getPreviousSibling();
		}
		return comment;
	}

	protected abstract String getXpath();

}
