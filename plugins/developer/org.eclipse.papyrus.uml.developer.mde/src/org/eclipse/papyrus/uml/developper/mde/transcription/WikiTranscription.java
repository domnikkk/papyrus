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

import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.papyrus.uml.developper.mde.I_DocumentStereotype;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * this class is a specialization to generate mediawiki files.
 *
 */
public class WikiTranscription implements ITranscription {

	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndingDocument(java.lang.StringBuffer)
	 *
	 * @param out
	 */

	@Override
	public void writeEndingDocument(StringBuffer out) {
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginningDocument(java.lang.StringBuffer)
	 *
	 * @param out
	 * @return the string buffer after adding the prefix for the document
	 */

	@Override
	public StringBuffer writeBeginningDocument(StringBuffer out) {
		out.append("\n__TOC__"); //$NON-NLS-1$
		return out;
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeDocumentTitle(java.lang.StringBuffer, org.eclipse.uml2.uml.Model)
	 *
	 * @param out
	 * @param documentModel
	 */

	@Override
	public void writeDocumentTitle(StringBuffer out, Model documentModel) {
		out.append("\n= " + documentModel.getName() + " ="); //$NON-NLS-1$ //$NON-NLS-2$
	}




	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writesectionTitle(java.lang.StringBuffer, int, org.eclipse.uml2.uml.Element)
	 *
	 * @param out
	 * @param level
	 * @param packageableElement
	 */

	@Override
	public void writesectionTitle(StringBuffer out, int level, Element packageableElement) {
		if (level == 2) {
			out.append("\n==<span" + getId(packageableElement) +  ">" + ((Package) packageableElement).getName() + "</span>==");} //$NON-NLS-1$ //$NON-NLS-2$
		if (level == 3) {
			out.append("\n===<span" + getId(packageableElement) + ">" + ((Package) packageableElement).getName() + "</span>===");} //$NON-NLS-1$ //$NON-NLS-2$
		if (level == 4) {
			out.append("\n====<span" + getId(packageableElement) + ">" + ((Package) packageableElement).getName() + "</span>====");} //$NON-NLS-1$ //$NON-NLS-2$

	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeImageRef(java.lang.StringBuffer, org.eclipse.uml2.uml.Element, org.eclipse.uml2.uml.Stereotype)
	 *
	 * @param out
	 * @param packageableElement
	 * @param imgRefStereotype
	 */

	@Override
	public void writeImageRef(StringBuffer out, Element packageableElement, Stereotype imgRefStereotype) {
		out.append("\n[[Image:" + packageableElement.getValue(imgRefStereotype, I_DocumentStereotype.IMAGEREF_REF_ATT) + "|" + ((Comment) packageableElement).getBody() + "]]<br>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeParagraph(java.lang.StringBuffer, org.eclipse.uml2.uml.Element)
	 *
	 * @param out
	 * @param packageableElement
	 */

	@Override
	public void writeParagraph(StringBuffer out, Element packageableElement) {
		out.append("\n<span" + getId(packageableElement)+ ">" + ((Comment) packageableElement).getBody() + "</span>"); //$NON-NLS-1$
	}


	@Override
	public String getNameFile() {

		return "DeveloperDoc.mediawiki"; //$NON-NLS-1$
	}
	
	/**
	 * @return
	 */
	public String getId(Element packageableElement) {
		String packageableElementtFragment = ((XMIResource)packageableElement.eResource()).getID(packageableElement);
		String id = " id=\"" + packageableElementtFragment + "\"";
		return id;
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeTable(java.lang.StringBuffer, java.lang.String)
	 *
	 * @param out
	 * @param tableCaption
	 */
	@Override
	public void writeTable(StringBuffer out, String tableCaption) {
		out.append("\n{| border=\"1\" cellpadding=\"20\" cellspacing=\"0\"\n");
		out.append("!ID\n");
		out.append("!Satisfy by\n");
		out.append("!Verify by");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeLine(java.lang.StringBuffer, java.lang.String, java.lang.String)
	 *
	 * @param out
	 * @param uri
	 * @param text
	 */
	@Override
	public void writeLine(StringBuffer out, String uri, String requirementName, String text) {
		if (uri.equals("")) {
			out.append(text);		
		} else {
			out.append("[[#" + uri + "|" + text + "]]");	
		}	
		
	}
	
	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeNewLine(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeNewLine(StringBuffer out) {
		out.append("\n");
		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginTRTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeBeginTRTag(StringBuffer out) {
		out.append("\n|-\n");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndTRTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndTRTag(StringBuffer out) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndingTable(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndingTable(StringBuffer out) {
		out.append("\n|}");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginTDTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeBeginTDTag(StringBuffer out) {
		out.append("|");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndTDTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndTDTag(StringBuffer out) {
		out.append("\n");
		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeUncoveredRequirement(java.lang.StringBuffer, java.lang.String, java.lang.String)
	 *
	 * @param out
	 * @param uri
	 * @param reqID
	 */
	@Override
	public void writeRefContent(StringBuffer out, String uri, String requirementName, String reqID) {
		if (uri.equals("")) {
			out.append(reqID);	
		} else {
			out.append("[[#" + uri + "|" + reqID + "]]");	
		}	
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginParagraph(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeBeginParagraph(StringBuffer out) {
		out.append("\n<span>");
		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndingParagraph(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndingParagraph(StringBuffer out) {
		out.append("</span>\n");
		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeTOCSection(java.lang.StringBuffer, java.lang.String, java.lang.String, int)
	 *
	 * @param out
	 * @param chapterName
	 * @param uri
	 * @param chapterNb
	 */
	@Override
	public void writeTOCSection(StringBuffer out, String chapterName, String uri) {
		out.append("\n:[[#" + uri + "|" + chapterName + "]]");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeTOCSubSection(java.lang.StringBuffer, java.lang.String, java.lang.String, int, int)
	 *
	 * @param out
	 * @param subSectionName
	 * @param uri
	 * @param chapterNb
	 * @param subSectionNb
	 */
	@Override
	public void writeTOCSubSection(StringBuffer out, String subSectionName, String uri) {
		out.append("\n::[[#" + uri + "|" + subSectionName + "]]");	
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginTOC(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeBeginTOC(StringBuffer out) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndTOC(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndTOC(StringBuffer out) {
		// TODO Auto-generated method stub
		
	}


}
