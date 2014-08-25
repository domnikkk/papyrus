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
		out.append("<H" + level + ">" + ((Package) packageableElement).getName() + "</H" + level + ">"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
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
		out.append("<pre>" + ((Comment) packageableElement).getBody().replaceAll("\n", "<BR/>") + "</pre>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}


	@Override
	public String getNameFile() {

		return "DeveloperDoc.html"; //$NON-NLS-1$
	}


}
