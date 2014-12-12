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
	
	
	/**
	 * write the beginning of the table (header, style)
	 * 
	 * @param out
	 * @param tableCaption
	 */
	public abstract void writeTable(StringBuffer out, String tableCaption);
	
	/**
	 * write line in the table
	 * 
	 * @param out
	 * @param uri 
	 * 			represents the uri of the referent element
	 * @param referenceName
	 * 			name of the referent element
	 * @param text
	 * 			represents content of the line
	 */
	public abstract void writeLine(StringBuffer out, String uri, String referenceName, String text);
	
	
	/**
	 * 
	 * write the beginning of a line
	 * 
	 * @param out
	 */
	public abstract void writeBeginTRTag(StringBuffer out);
	
	/**
	 * write the ending of a line
	 * 
	 * @param out
	 */
	public abstract void writeEndTRTag(StringBuffer out);
	
	/**
	 * finalize the table
	 * 
	 * @param out
	 */
	public abstract void writeEndingTable(StringBuffer out);
	
	/**
	 * write the beginning of a column
	 * 
	 * @param out
	 */
	public abstract void writeBeginTDTag(StringBuffer out);
	
	/**
	 * write the ending of a column
	 * 
	 * @param out
	 */
	public abstract void writeEndTDTag(StringBuffer out);
	
	public abstract void writeBeginTOC(StringBuffer out);
	
	public abstract void writeEndTOC(StringBuffer out);
	
	
	/**
	 * write the requirements which aren't covered
	 * 
	 * @param out
	 * @param uri
	 * 		represents the uri of the Requirements Doc Element
	 * @param requirementName
	 * 		the requirement name
	 * @param reqID
	 * 		id of the requirement
	 */
	public abstract void writeRefContent(StringBuffer out, String uri, String requirementName, String reqID);
	
	/**
	 * write beginning of a paragraph
	 * 
	 * @param out
	 */
	public abstract void writeBeginParagraph(StringBuffer out);
	
	/**
	 * write ending of a paragraph
	 * 
	 * @param out
	 */
	public abstract void writeEndingParagraph(StringBuffer out);
	
	/**
	 * write section in table of contents
	 * 
	 * @param out
	 * @param chapterName
	 * 		represents the name of the section
	 * @param uri
	 * 		represents the uri of the Section Doc Element
	 */
	
	public abstract void writeTOCSection(StringBuffer out, String chapterName, String uri);
	
	/**
	 * 
	 * @param out
	 * @param subSectionName
	 * 		represents the name of the sub section
	 * @param uri
	 * 		represents the uri of the sub section doc element
	 */
	public abstract void writeTOCSubSection(StringBuffer out, String subSectionName, String uri);
	
	/**
	 * 
	 * @param out
	 */
	public abstract void writeNewLine(StringBuffer out);
	

	
}
