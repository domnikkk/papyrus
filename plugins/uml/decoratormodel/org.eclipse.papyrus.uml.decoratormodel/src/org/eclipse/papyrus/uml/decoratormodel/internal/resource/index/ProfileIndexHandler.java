/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.resource.index;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

/**
 * SAX parsing handler for indexing a profile-application resource. It produces two outputs:
 * <ul>
 * <li>{@link #getReferencedModelURIs()}: the set of model resource URIs for which the resource profiles profile applications (without fragments)</li>
 * <li>{@link #getAppliedProfileURIs()}: a mapping of applying package to applied profile, as object URIs (with fragments)</li>
 * </ul>
 */
public class ProfileIndexHandler extends DefaultHandler {
	private final URI fileURI;
	private final Set<URI> referencedModelURIs = Sets.newHashSet();
	private final Map<URI, Map<URI, URI>> packageToProfileApplications = Maps.newHashMap();
	private String externalizationName;

	private String umlNamespace;
	private String umlPrefix;
	private String xmiType;
	private String xmiID;
	private Set<String> packageTypes;
	private String dependencyType;
	private String client;
	private String profileApplication;
	private String appliedProfile;
	private String eAnnotations;
	private String references;

	private UMLElement top;
	private int ignore;

	private UMLElement currentPackage;

	private Map<String, URI> packageClients = Maps.newHashMap();
	private URIPair currentProfileApplication;
	private Multimap<String, URIPair> packageProfileApplications = ArrayListMultimap.create();

	private Await await = new Await();

	/**
	 * Initializes me.
	 *
	 * @param fileURI
	 *            the URI of the profile-application file that I am parsing
	 */
	public ProfileIndexHandler(final URI fileURI) {
		this.fileURI = fileURI;
	}

	public URI getFileURI() {
		return fileURI;
	}

	public Set<URI> getReferencedModelURIs() {
		return referencedModelURIs;
	}

	public Map<URI, Map<URI, URI>> getPackageToProfileApplications() {
		return packageToProfileApplications;
	}

	public String getExternalizationName() {
		return externalizationName;
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		if (uri.startsWith(XMIResource.XMI_NAMESPACE_PREFIX) || uri.startsWith(XMIResource.XMI_2_4_NAMESPACE_PREFIX)) {
			xmiType = qname(prefix, "type"); //$NON-NLS-1$
			xmiID = qname(prefix, "id"); //$NON-NLS-1$
		} else if (EPackage.Registry.INSTANCE.getEPackage(uri) == UMLPackage.eINSTANCE) {
			umlNamespace = uri;
			umlPrefix = prefix;

			packageTypes = ImmutableSet.of(umlElement("Package"), umlElement("Model"), umlElement("Profile")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			dependencyType = umlElement("Dependency"); //$NON-NLS-1$
			client = "client"; //$NON-NLS-1$

			profileApplication = "profileApplication"; //$NON-NLS-1$
			appliedProfile = "appliedProfile"; //$NON-NLS-1$

			eAnnotations = "eAnnotations"; //$NON-NLS-1$
			references = "references"; //$NON-NLS-1$
		}
	}

	protected final String umlElement(String name) {
		return qname(umlPrefix, name);
	}

	protected final String qname(String prefix, String name) {
		StringBuilder buf = new StringBuilder(prefix.length() + name.length() + 1);
		return buf.append(prefix).append(':').append(name).toString();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (umlNamespace.equals(uri) || (top != null)) {
			// skip over annotations
			if (!ignore(qName, attributes)) {
				push(qName, attributes);
				handleUMLElement(top, attributes);
			}
		}
	}

	boolean ignore(String qName, Attributes attributes) {
		boolean result = false;

		if (attributes != null) { // Starting an element
			result = (ignore > 0) || (eAnnotations.equals(qName) && !UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI.equals(attributes.getValue("source"))); //$NON-NLS-1$
			if (result) {
				ignore++;
			}
		} else { // Ending an element
			result = (ignore > 0);
			if (result) {
				ignore--;
			}
		}

		return result;
	}

	protected final void push(String qName, Attributes attributes) {
		top = new UMLElement(qName, attributes);
	}

	protected final UMLElement pop() {
		UMLElement result = top;
		if (top != null) {
			top = top.parent;
		}
		return result;
	}

	protected void handleUMLElement(UMLElement element, Attributes attributes) throws SAXException {
		if (element.isPackage() && (element.getHREF() == null)) {
			// An href is a reference to a package, not a package in our element hierarchy
			currentPackage = element;

			// if it's the top package, get its name
			if (currentPackage.parent == null) {
				externalizationName = attributes.getValue("name"); //$NON-NLS-1$
			}
		}

		if (element.isA(dependencyType)) {
			// It's a dependency. We want its client
			await.push(client);
		} else if (element.isRole(profileApplication)) {
			currentProfileApplication = new URIPair();
			packageProfileApplications.put(currentPackage.id, currentProfileApplication);
			await.push(appliedProfile);
		} else if (element.isA(UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI)) {
			// It's the applied profile definition annotation
			await.push(references);
		} else if (await.isAwaiting(element)) {
			if (element.isRole(client) && element.isPackage()) {
				// Got a package dependency client
				handleDependencyClient(element);
			} else if (element.isRole(appliedProfile)) {
				handleAppliedProfile(element);
			} else if (element.isRole(references)) {
				handleReferences(element);
			}

			await.pop();
		}
	}

	protected void handleDependencyClient(UMLElement client) {
		URI href = client.getHREF();
		if (href != null) {
			referencedModelURIs.add(href.trimFragment());
			packageClients.put(currentPackage.id, href);
		}
	}

	protected void handleReferences(UMLElement references) {
		URI href = references.getHREF();
		if (href != null) {
			currentProfileApplication.second = href;
		}
	}

	protected void handleAppliedProfile(UMLElement appliedProfile) {
		URI href = appliedProfile.getHREF();
		if (href != null) {
			currentProfileApplication.first = href;
		}
	}

	protected void summarize() {
		for (String packageID : packageProfileApplications.keySet()) {
			URI applyingPackageURI = packageClients.get(packageID);
			if (applyingPackageURI != null) {
				Collection<URIPair> profileApplications = packageProfileApplications.get(packageID);
				if (!profileApplications.isEmpty()) {
					Map<URI, URI> map = packageToProfileApplications.get(applyingPackageURI);
					if (map == null) {
						map = Maps.newHashMap();
						packageToProfileApplications.put(applyingPackageURI, map);
					}
					for (URIPair profileApplication : profileApplications) {
						map.put(profileApplication.first, profileApplication.second);
					}
				}
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (!ignore(qName, null)) {
			if (await.stopAt(pop())) {
				await.pop();
			}

			if (top != null) {
				currentPackage = top.nearestPackage();
			}

			if (top == null) {
				// We're done with UML content
				summarize();
				throw new OperationCanceledException();
			}
		}
	}

	//
	// Nested types
	//

	class UMLElement {
		final UMLElement parent;

		final String role;
		final String type;
		final String id;
		final String href;

		UMLElement(String qName, Attributes attributes) {
			parent = top;

			String type;
			if (qName.equals(eAnnotations)) {
				// "type" of an annotation is its source
				type = attributes.getValue("source"); //$NON-NLS-1$
			} else {
				type = attributes.getValue(xmiType);
				if (Strings.isNullOrEmpty(type)) {
					type = qName;
				}
			}

			this.role = qName;
			this.type = type;
			this.id = attributes.getValue(xmiID);
			this.href = attributes.getValue("href"); //$NON-NLS-1$
		}

		boolean isPackage() {
			return packageTypes.contains(type);
		}

		boolean isRole(String roleName) {
			return roleName.equals(role);
		}

		boolean isA(String xmiType) {
			return xmiType.equals(type);
		}

		URI getHREF() {
			return Strings.isNullOrEmpty(href) ? null : URI.createURI(href).resolve(fileURI);
		}

		UMLElement nearestPackage() {
			for (UMLElement next = this; next != null; next = next.parent) {
				if (next.isPackage()) {
					return next;
				}
			}
			return null;
		}
	}

	class Await {
		final Await parent = await;

		final String awaiting;
		final UMLElement limit;

		Await() {
			this(null);
		}

		private Await(String awaiting) {
			this.awaiting = awaiting;
			this.limit = top;
		}

		boolean isRoot() {
			return parent == null;
		}

		boolean isAwaiting(UMLElement element) {
			return !isRoot() && element.isRole(awaiting);
		}

		boolean stopAt(UMLElement element) {
			return !isRoot() && (limit == element);
		}

		Await push(String elementName) {
			Await result = new Await(elementName);
			await = result;
			return result;
		}

		void pop() {
			if (!isRoot()) {
				await = parent;
			}
		}
	}

	private static final class URIPair {
		URI first;
		URI second;
	}
}
