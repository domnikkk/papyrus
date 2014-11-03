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

package org.eclipse.papyrus.infra.emf.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.common.base.Strings;

/**
 * A XML content type handler that matches a namespace pattern against any of the namespaces declared in the document's root element.
 * It therefore does not support the {@link RootXMLContentHandlerImpl#ELEMENT_NAMES} and {@link RootXMLContentHandlerImpl#KIND} configuration attributes.
 */
public class AnyRootNamespaceContentHandler extends RootXMLContentHandlerImpl {

	public AnyRootNamespaceContentHandler(Map<String, String> parameters) {
		super(parameters);
	}

	public AnyRootNamespaceContentHandler(String contentTypeID, String[] extensions, String namespace) {
		super(contentTypeID, extensions, null, namespace, null);
	}

	public AnyRootNamespaceContentHandler(String contentTypeID, String[] extensions, Pattern namespacePattern) {
		super(contentTypeID, extensions, null, namespacePattern, null);
	}

	@Override
	public Map<String, Object> contentDescription(URI uri, InputStream inputStream, Map<?, ?> options, Map<Object, Object> context) throws IOException {
		Map<String, Object> result;
		String contentType = contentTypeID;

		try {
			result = super.contentDescription(uri, inputStream, options, context);

			XMLResource xmlResource = load(uri, inputStream, options, context);
			EList<EObject> contents = xmlResource.getContents();
			if (!contents.isEmpty()) {
				EObject eObject = contents.get(0);
				if (eObject instanceof XMLTypeDocumentRoot) {
					String matchedNamespace = null;
					XMLTypeDocumentRoot documentRoot = (XMLTypeDocumentRoot) eObject;
					for (String next : documentRoot.getXMLNSPrefixMap().values()) {
						if (isMatchingNamespace(next)) {
							matchedNamespace = next;
							break;
						}
					}

					if (matchedNamespace != null) {
						result.put(VALIDITY_PROPERTY, ContentHandler.Validity.VALID);
					} else {
						// If none of the root namespaces matched, then we can be assured
						// that the resource is not of this content type
						result.put(VALIDITY_PROPERTY, ContentHandler.Validity.INVALID);
					}

					if (contentType == null) {
						contentType = matchedNamespace;
					}
				}
			}
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw new IOException("Uncaught exception in describing resource content.", e); //$NON-NLS-1$
		}

		result.put(CONTENT_TYPE_PROPERTY, Strings.nullToEmpty(contentType));
		return result;
	}

	//
	// Nested types
	//

	public static class Describer extends RootXMLContentHandlerImpl.Describer {
		@Override
		protected ContentHandler createContentHandler(Map<String, String> parameters) {
			return new AnyRootNamespaceContentHandler(parameters);
		}
	}
}
