/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.developper.mde.transcription;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;


/**
 * This class is used to generated very swiftly a document from the document model
 *
 */
public interface ITranscription {

	/**
	 * finalize the document
	 *
	 * @param out
	 */
	public abstract void writeEndingDocument(StringBuffer out);

	/**
	 * init the document
	 *
	 * @param out
	 * @return the string buffer after adding the prefix for the document
	 */
	public abstract StringBuffer writeBeginningDocument(StringBuffer out);

	/**
	 * write the document title
	 *
	 * @param out
	 * @param documentModel
	 *            the package
	 */
	public abstract void writeDocumentTitle(StringBuffer out, Model documentModel);

	/**
	 * withe the section title from a package
	 *
	 * @param out
	 * @param level
	 *            the heap of the package
	 * @param packageableElement
	 *            the package
	 */
	public abstract void writesectionTitle(StringBuffer out, int level, Element packageableElement);

	/**
	 * write a image
	 *
	 * @param out
	 * @param packageableElement
	 *            form a comment that contains the ref to the
	 * @param imgRefStereotype
	 *            the stereotype in charge to reference the image
	 */
	public abstract void writeImageRef(StringBuffer out, Element packageableElement, Stereotype imgRefStereotype);

	/**
	 * write a paragraph
	 *
	 * @param out
	 * @param packageableElement
	 *            from a comment
	 */

	public abstract void writeParagraph(StringBuffer out, Element packageableElement);

	/**
	 *
	 * @return the name of the document to generate
	 */
	public abstract String getNameFile();

}
