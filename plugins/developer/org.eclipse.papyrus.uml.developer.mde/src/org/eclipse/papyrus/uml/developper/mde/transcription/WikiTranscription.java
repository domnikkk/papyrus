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
			out.append("\n==" + ((Package) packageableElement).getName() + "==");} //$NON-NLS-1$ //$NON-NLS-2$
		if (level == 3) {
			out.append("\n===" + ((Package) packageableElement).getName() + "===");} //$NON-NLS-1$ //$NON-NLS-2$
		if (level == 4) {
			out.append("\n====" + ((Package) packageableElement).getName() + "====");} //$NON-NLS-1$ //$NON-NLS-2$

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
		out.append("\n" + ((Comment) packageableElement).getBody()); //$NON-NLS-1$
	}


	@Override
	public String getNameFile() {

		return "DeveloperDoc.mediawiki"; //$NON-NLS-1$
	}


}
