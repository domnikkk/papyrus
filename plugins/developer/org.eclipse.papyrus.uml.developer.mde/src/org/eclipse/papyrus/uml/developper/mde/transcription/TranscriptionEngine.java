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
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.papyrus.uml.developper.mde.I_DocumentStereotype;
import org.eclipse.papyrus.uml.developper.mde.handler.IDMAbstractHandler;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;

/***
 * This class is an engine to traduce a document model into files
 *
 */
public class TranscriptionEngine {
	protected static final String INTERNAL_DIRECTORY = "doc/"; //$NON-NLS-1$
	Model model = null;
	IProject project;
	ITranscription transcription = null;

	/**
	 *
	 * Constructor.
	 *
	 * @param model
	 *            the root model
	 * @param project
	 *            the project where we want to put the new file
	 * @param transcription
	 *            the object in charge to do the transcription
	 */
	public TranscriptionEngine(Model model, IProject project, ITranscription transcription) {
		super();
		this.model = model;
		this.project = project;
		this.transcription = transcription;
	}

	/**
	 * execute the transcription
	 */
	public void traduce() {
		IFile file = project.getFile(INTERNAL_DIRECTORY + transcription.getNameFile());
		// at this point, no resources have been created
		if (!project.isOpen()) {
			try {
				project.open(null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (file.exists()) {
			try {
				file.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		if (!file.exists()) {
			StringBuffer buffer = getText(model);
			InputStream source = new ByteArrayInputStream(buffer.toString().getBytes());
			try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 *
	 * @param model
	 *            that will be traduced
	 * @return the stringBuffer that will be obtained from the transcription
	 */
	public StringBuffer getText(Model model) {

		StringBuffer out = new StringBuffer();
		transcription.writeBeginningDocument(out);
		Model documentModel = null;
		for (Iterator<PackageableElement> iterator = model.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = iterator.next();
			if ((packageableElement.getAppliedStereotype(I_DocumentStereotype.DOCUMENT_STEREOTYPE)) != null) {
				documentModel = (Model) packageableElement;
			}
		}
		if (documentModel != null) {
			transcription.writeDocumentTitle(out, documentModel);
			writeContent(out, documentModel, 2);
		}

		transcription.writeEndingDocument(out);
		return out;
	}

	/**
	 * create a content from a package
	 *
	 * @param out
	 *            the result
	 * @param documentModel
	 *            the package where its content will be translated
	 * @param level
	 *            the depth of the current package
	 */
	public void writeContent(StringBuffer out, Package documentModel, int level) {
		for (Iterator<Element> iteComment = (documentModel).getOwnedElements().iterator(); iteComment.hasNext();) {
			Element packageableElement = iteComment.next();
			if (packageableElement.getAppliedStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE) != null) {
				if (((Comment) packageableElement).getBody() != null) {
					transcription.writeParagraph(out, packageableElement);
					if (packageableElement.getOwnedComments() != null) {
						writeRefContent(out, (Comment)packageableElement);
					}
				}
			}
			if (packageableElement.getAppliedStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE) != null) {
				Stereotype imgRefStereotype = packageableElement.getAppliedStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE);
				if (((Comment) packageableElement).getBody() != null) {
					transcription.writeImageRef(out, packageableElement, imgRefStereotype);
				}
			}
			if (packageableElement.getAppliedStereotype(I_DocumentStereotype.SECTION_STEREOTYPE) != null) {
				transcription.writesectionTitle(out, level, packageableElement);
					writeContent(out, ((Package) packageableElement), level + 1);
			}
			if (packageableElement.getAppliedStereotype(I_DocumentStereotype.TABLE_STEREOTYPE) != null) {
				writeTable(out, packageableElement);
			}
			if (packageableElement.getAppliedStereotype(I_DocumentStereotype.TABLEOFCONTENT_STEREOTYPE) != null) {
				transcription.writesectionTitle(out, 2, packageableElement);
				writeTOC(out, (Package)packageableElement);
			}
		}
	}



	/**
	 * Iterates on ownedComments of a comment stereotyped by {@link I_DocumentStereotype}.CONTENT_STEREOTYPE
	 * 
	 * @param out
	 * @param commentModel
	 */
	public void writeRefContent(StringBuffer out, Comment commentModel) {
		for (Iterator<Comment> iteComment = commentModel.getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment commentElement = iteComment.next();
			Stereotype refContentStereotype = commentElement.getAppliedStereotype(I_DocumentStereotype.REF_CONTENT_STEREOTYPE);
			if (refContentStereotype != null) {
				Object ref = commentElement.getValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT);
				
				/* Get the URI of the model element */
				if (ref instanceof NamedElement) {
					Element referent = IDMAbstractHandler.elt2DocElt.get((NamedElement)ref);
					if (referent != null) {
						String referentURI = ((XMIResource)referent.eResource()).getID(referent);
						String body = commentElement.getBody();
						
						/* Write the text */
						if (iteComment.hasNext()) {							
							body = body + ", ";
						}
						transcription.writeRefContent(out, referentURI, ((NamedElement)ref).getName(), body);
					}	
				}
			}
		}
	}

	/**
	 * Retrieves the Table of Contents "Section" Package 
	 * and iterates on it "Section" package.
	 * For each, write it name and URI in the output file. 
	 * Then, iterates on it child
	 * 
	 * @param out
	 * @param packageableElement
	 */
	public void writeTOC(StringBuffer out, Package packageableElement) {
		for (Iterator<Element> elements = packageableElement.getOwnedElements().iterator(); elements.hasNext();) {
			Element cddPackageableElement = elements.next();
			Stereotype sectionStereotype = cddPackageableElement.getAppliedStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
			if (sectionStereotype != null) {
				transcription.writeBeginTOC(out);
				Package chapter = (Package) cddPackageableElement;
				Package chapterDocElt = IDMAbstractHandler.Toc2DocElt.get(chapter);
				String URI = ((XMIResource)chapterDocElt.eResource()).getID(chapterDocElt);
				transcription.writeTOCSection(out, chapter.getName(), URI);
				writeSubSectionTOC(out, chapter); 
				transcription.writeEndTOC(out);
			}
		}
	}

	/**
	 * Retrieves the sub section of a "Section" package. 
	 * Then for each, writes it name and URI on the output file.
	 * It's a recursive method, so call it again with this package as argument.
	 *
	 * @param out
	 * @param chapter
	 */
	public void writeSubSectionTOC(StringBuffer out, Package chapter) {
		for (Iterator<Element> elements = chapter.getOwnedElements().iterator(); elements.hasNext();) {
			Element cddSubSection = elements.next();
			Stereotype sectionStereotype = cddSubSection.getAppliedStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
			if (sectionStereotype != null) {
				Package subSection = (Package)cddSubSection;
				Package subSectionDocElt = IDMAbstractHandler.Toc2DocElt.get(subSection);
				String URI = ((XMIResource)subSectionDocElt.eResource()).getID(subSectionDocElt);
				transcription.writeTOCSubSection(out, subSection.getName(), URI);
				transcription.writeBeginTOC(out);
				writeSubSectionTOC(out, subSection);
				transcription.writeEndTOC(out);
			}
		}
	}

	/**
	 * 
	 * This method generates the requirement table in the Requirements Coverage section.
	 * First, retrieves the comment with the "Table" stereotype.
	 * After that, iterates on it ownedComment and retrieves those which have the Line stereotype applied.
	 * For each "line", writes the ID of the requirement, element(s) which satisfied and verified the requirement.
	 * 
	 * @param out
	 * @param packageableElement
	 */
	public void writeTable(StringBuffer out, Element packageableElement) {
		Comment tableComment = (Comment)packageableElement;
		Stereotype tableStereotype = tableComment.getAppliedStereotype(I_DocumentStereotype.TABLE_STEREOTYPE);

		// Write the structure of the table and it head line
		String tableCaption = (String) ((Comment)packageableElement).getValue(tableStereotype, I_DocumentStereotype.TABLE_CAPTION_ATT);
		transcription.writeTable(out, tableCaption);

		// Iterates on table ownedComments
		for (Iterator<Comment> cddLineComment = tableComment.getOwnedComments().iterator(); cddLineComment.hasNext();) {
			Comment lineComment = cddLineComment.next();
			if (lineComment.getAppliedStereotype(I_DocumentStereotype.LINE_STEREOTYPE) != null) {
				transcription.writeBeginTRTag(out);
				// Iterates on line ownedComments 
				for (Iterator<Comment> cddCellComment = lineComment.getOwnedComments().iterator(); cddCellComment.hasNext();) {
					Comment cellComment = cddCellComment.next();
					if (cellComment.getAppliedStereotype(I_DocumentStereotype.CELL_STEREOTYPE) != null) {
						// Iterates on cellContent
						// Get the number of content in the cell.
						int cellSize = cellComment.getOwnedComments().size();
						String text = "";

						transcription.writeBeginTDTag(out);
						for (Iterator<Comment> cddRefContentComment = cellComment.getOwnedComments().iterator(); cddRefContentComment.hasNext();) {
							Comment refContentComment = cddRefContentComment.next();
							Stereotype refContentStereotype = refContentComment.getAppliedStereotype(I_DocumentStereotype.REF_CONTENT_STEREOTYPE);
							// Retrieve the cellContent stereotype to get values of the cell content
							if (refContentStereotype != null) {

								String referentURI = "";
								String referenceName = "";
								Object ref = refContentComment.getValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT);
															
								/* Get the URI of the model element */
								if (ref instanceof NamedElement) {
									NamedElement refElement = (NamedElement) ref;
									referenceName = refElement.getName();
									Element referentElement = IDMAbstractHandler.elt2DocElt.get(refElement);
									if (referentElement != null) {
										referentURI = ((XMIResource)referentElement.eResource()).getID(referentElement);
									}	
								}

								if (cellSize > 1 && cddRefContentComment.hasNext()) {
									text = refContentComment.getBody() + ", \n";
								} else {
									text = refContentComment.getBody();
								}
								// Write the content of the cell in the table
								transcription.writeLine(out, referentURI, referenceName, text);
								transcription.writeNewLine(out);
							}
						}
						transcription.writeEndTDTag(out);
					}
				}
				transcription.writeEndTRTag(out);
			}
		}
		transcription.writeEndingTable(out);		
	}
}
