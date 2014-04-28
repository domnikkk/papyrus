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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.papyrus.uml.developper.mde.I_DocumentStereotype;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;


public class TranscriptionEngine {
	Model model=null;
	IProject project;
	ITranscription transcription=null;
	
	public TranscriptionEngine(Model model, IProject project, ITranscription transcription) {
		super();
		this.model = model;
		this.project = project;
		this.transcription = transcription;
	}

	public void traduce() {
		IFile file = project.getFile(transcription.getNameFile());
		//at this point, no resources have been created
		if (!project.isOpen())
			try {
				project.open(null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (file.exists()) {
			try {
				file.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		if (!file.exists()) {
			StringBuffer buffer=getText(model);
			InputStream source = new ByteArrayInputStream(buffer.toString().getBytes());
			try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public StringBuffer getText(Model model){

		StringBuffer out = new StringBuffer();
		transcription.writeBeginningDocument(out);
		Model documentModel=null;
		for(Iterator<PackageableElement> iterator = model.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = (PackageableElement)iterator.next();
			if((packageableElement.getAppliedStereotype(I_DocumentStereotype.DOCUMENT_STEREOTYPE))!=null){
				documentModel=(Model)packageableElement;
			}
		}
		if(documentModel!=null){
			transcription.writeDocumentTitle(out, documentModel);
			writeContent(out, documentModel,2);
		}

		transcription.writeEndingDocument(out);
		return out;
	}

	public void writeContent(StringBuffer out, Package documentModel, int level) {
		for(Iterator<Element> iteComment = (documentModel).getOwnedElements().iterator(); iteComment.hasNext();) {
			Element packageableElement = (Element)iteComment.next();
			if(((Element)packageableElement).getAppliedStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE)!=null){
				if(((Comment)packageableElement).getBody()!=null){
					transcription.writeParagraph(out, packageableElement);
				}
			}
			if(((Element)packageableElement).getAppliedStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE)!=null){
				Stereotype imgRefStereotype=((Element)packageableElement).getAppliedStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE);
				if(((Comment)packageableElement).getBody()!=null){
					transcription.writeImageRef(out, packageableElement, imgRefStereotype);
				}
			}
			if(((Element)packageableElement).getAppliedStereotype(I_DocumentStereotype.SECTION_STEREOTYPE)!=null){
				transcription.writesectionTitle(out, level, packageableElement);
				writeContent(out, ((Package)packageableElement), level+1);

			}
		}

	}
	
}
