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
 * this class is a specialization to generate html files.
 *
 * @author PT202707
 *
 */
public class HTMLTranscription implements ITranscription {

	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndingDocument(java.lang.StringBuffer)
	 *
	 * @param out
	 */

	@Override
	public void writeEndingDocument(StringBuffer out) {
		out.append("</html>"); //$NON-NLS-1$
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginningDocument(java.lang.StringBuffer)
	 *
	 * @param out
	 * @return the string buffer after adding the prefix for the document
	 */

	@Override
	public StringBuffer writeBeginningDocument(StringBuffer out) {
		out.append("<html>"); //$NON-NLS-1$
		out.append("<link rel=\"stylesheet\" href=\"default.css\" type=\"text/css\">"); //$NON-NLS-1$
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
		out.append("<H1>" + documentModel.getName() + "</H1>"); //$NON-NLS-1$ //$NON-NLS-2$
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
		out.append("<H" + level + getId(packageableElement) +  ">" + ((Package) packageableElement).getName() + "</H" + level + ">"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
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
		out.append("<P align=\"middle\"><img src=" + packageableElement.getValue(imgRefStereotype, I_DocumentStereotype.IMAGEREF_REF_ATT) + " alt=" + ((Comment) packageableElement).getBody() + " ></P>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		out.append("<P align=\"middle\">" + ((Comment) packageableElement).getBody() + "</P>"); //$NON-NLS-1$ //$NON-NLS-2$
		out.append("</BR>"); //$NON-NLS-1$
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeParagraph(java.lang.StringBuffer, org.eclipse.uml2.uml.Element)
	 *
	 * @param out
	 * @param packageableElement
	 */

	@Override
	public void writeParagraph(StringBuffer out, Element packageableElement) {
		out.append("<pre" + getId(packageableElement)+  ">" + ((Comment) packageableElement).getBody().replaceAll("\n", "<BR/>") + "</pre>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	/**
	 * @return
	 */
	public String getId(Element packageableElement) {
		String packageableElementtFragment = ((XMIResource)packageableElement.eResource()).getID(packageableElement);
		String id = " id =\"" + packageableElementtFragment + "\"";
		return id;
	}

	@Override
	public String getNameFile() {
		return "DeveloperDoc.html"; //$NON-NLS-1$

	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeTable(java.lang.StringBuffer, org.eclipse.uml2.uml.Element)
	 *
	 * @param out
	 * @param packElement
	 */
	@Override
	public void writeTable(StringBuffer out, String tableCaption) {
		out.append("<table style=\"border-collapse: collapse;\">");
		out.append("<caption style=\"caption-side: bottom;\">" + tableCaption + "</caption>");
		writeBeginTRTag(out);
		out.append("<th style=\"border: 1px solid black\">Id</th>");
		out.append("<th style=\"border: 1px solid black\">Satisfy by</th>");
		out.append("<th style=\"border: 1px solid black\">Verify by</th>");
		writeEndTRTag(out);
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeLine(java.lang.StringBuffer, java.lang.String, java.lang.String, java.lang.String)
	 *
	 * @param out
	 * @param uri
	 * @param referenceName
	 * @param text
	 */
	public void writeLine(StringBuffer out, String uri, String referenceName, String text) {
		if (uri.equals("")) {
			out.append(text);		
		} else {
			out.append("<a href=\"#" + uri + "\" title=\"" + referenceName + "\">" + text + "</a>");	
		}	
	}
	
	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeNewLine(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeNewLine(StringBuffer out) {
		out.append("</BR>");
		
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginTDTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	public void writeBeginTDTag(StringBuffer out) {
		out.append("<td style=\"border : 1px solid black\">");
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndTDTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	public void writeEndTDTag(StringBuffer out) {
		out.append("</td>");
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginTRTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	public void writeBeginTRTag(StringBuffer out) {
		out.append("<tr>");
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndTRTag(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	public void writeEndTRTag(StringBuffer out) {
		out.append("</tr>");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndingTable(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndingTable(StringBuffer out) {
		out.append("</table>");
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginParagraph(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	public void writeBeginParagraph(StringBuffer out) {
		out.append("<pre>");
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndingParagraph(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	public void writeEndingParagraph(StringBuffer out) {
		out.append("</pre>");
	}
	
	
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeRefContent(java.lang.StringBuffer, java.lang.String, java.lang.String, java.lang.String)
	 *
	 * @param out
	 * @param uri
	 * @param requirementName
	 * @param reqID
	 */
	public void writeRefContent(StringBuffer out, String uri, String requirementName, String reqID) {
		if (uri.equals("")) {
			out.append(reqID);		
		} else {
			out.append("<a href=\"#" + uri + "\" title=\"" + requirementName + "\">" + reqID + "</a>");	
		}	
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
		out.append("<a href=\"#" + uri + "\">" + chapterName + "</a>" );
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
		out.append("<li><a href=\"#" + uri + "\"> " + subSectionName + "</a></li>");		
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeBeginTOC(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeBeginTOC(StringBuffer out) {
		out.append("<ul>");
	}


	/**
	 * @see org.eclipse.papyrus.uml.developper.mde.transcription.ITranscription#writeEndTOC(java.lang.StringBuffer)
	 *
	 * @param out
	 */
	@Override
	public void writeEndTOC(StringBuffer out) {
		out.append("</ul>");
	}

}
