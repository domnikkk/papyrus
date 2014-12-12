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
package org.eclipse.papyrus.uml.developper.mde.command;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.infra.hyperlink.helper.AbstractHyperLinkHelper;
import org.eclipse.papyrus.infra.hyperlink.helper.HyperLinkHelperFactory;
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkDocument;
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkObject;
import org.eclipse.papyrus.infra.hyperlink.util.HyperLinkException;
import org.eclipse.papyrus.infra.hyperlink.util.HyperLinkHelpersRegistrationUtil;
import org.eclipse.papyrus.uml.developper.mde.I_DeveloperIDMStereotype;
import org.eclipse.papyrus.uml.developper.mde.I_DocumentStereotype;
import org.eclipse.papyrus.uml.developper.mde.handler.IDMAbstractHandler;
import org.eclipse.papyrus.views.modelexplorer.NavigatorUtils;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UseCase;

/**
 * this command transform a model to document model
 *
 */
public class CreateDocumentModelCommand extends RecordingCommand {

	protected static final String TESTS = "Tests"; //$NON-NLS-1$
	protected static final String DESIGN = "Design"; //$NON-NLS-1$
	protected static final String HOW_TO = "How to"; //$NON-NLS-1$
	protected static final String USE_CASES = "Use Cases"; //$NON-NLS-1$
	private static final String SYS_ML_REQUIREMENTS_REQUIREMENT = "SysML::Requirements::Requirement"; //$NON-NLS-1$
	private static final String SYS_ML_REQUIREMENTS_TESTCASE = "SysML::Requirements::TestCase";
	protected static final String REQUIREMENTS = "Requirements"; //$NON-NLS-1$
	protected org.eclipse.uml2.uml.Package topModel;
	protected String directoryPath = null;
	protected HyperLinkHelperFactory hyperlinkHelperFactory;
	protected int nbUnsatisfiedRequirement = 0;
	protected int nbUnverifiedRequirement = 0;
	protected int nbRequirement = 0;


	/**
	 *
	 * Constructor to transform model into document model
	 *
	 * @param domain
	 * @param topModel
	 *            the root model
	 * @param directoryPath
	 *            the directory where image will be stored, pay attention directory must exist
	 */
	public CreateDocumentModelCommand(TransactionalEditingDomain domain, org.eclipse.uml2.uml.Package topModel, String directoryPath) {
		super(domain);
		this.topModel = topModel;
		this.directoryPath = directoryPath;
		ArrayList<AbstractHyperLinkHelper> hyperLinkHelpers = new ArrayList<AbstractHyperLinkHelper>();

		hyperLinkHelpers.addAll(HyperLinkHelpersRegistrationUtil.INSTANCE.getAllRegisteredHyperLinkHelper());
		hyperlinkHelperFactory = new HyperLinkHelperFactory(hyperLinkHelpers);
	}

	@Override
	protected void doExecute() {
		CopyToImageUtil copyImageUtil = new CopyToImageUtil();
		Model documentModel = UMLFactory.eINSTANCE.createModel();
		topModel.getPackagedElements().add(documentModel);
		Stereotype stereotypeDocument = documentModel.getApplicableStereotype(I_DocumentStereotype.DOCUMENT_STEREOTYPE);
		documentModel.applyStereotype(stereotypeDocument);

		Stereotype stereotypeProject = topModel.getAppliedStereotype(I_DeveloperIDMStereotype.PROJECT_STEREOTYPE);
		documentModel.setName((String) topModel.getValue(stereotypeProject, I_DeveloperIDMStereotype.PROJECT_TITLE_ATT));
		documentModel.setValue(stereotypeDocument, I_DocumentStereotype.DOCUMENT_AUTHOR_ATT, (topModel.getValue(stereotypeProject, I_DeveloperIDMStereotype.PROJECT_AUTHOR_ATT)));
		documentModel.setValue(stereotypeDocument, I_DocumentStereotype.DOCUMENT_VERSION_ATT, (topModel.getValue(stereotypeProject, I_DeveloperIDMStereotype.PROJECT_VERSION_ATT)));

		for (Iterator<Comment> iteComment = (topModel).getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment currentComment = iteComment.next();
			createImageFromHyperLink(copyImageUtil, documentModel, currentComment);
			transformToContentComment(documentModel, currentComment);

		}

		// generate Table Of Content package
		createTableOfContents(documentModel, "Table of Contents");

		// get Requirement package
		Model requirementsIn = getStereotypedPackage(I_DeveloperIDMStereotype.REQUIREMENTS_STEREOTYPE);
		if (requirementsIn != null) {
			Package requirementsOUT = createSection(documentModel, REQUIREMENTS);
			generateRequirements(requirementsIn, requirementsOUT);
		}
		// get UseCases package
		Model useCaseIN = getStereotypedPackage(I_DeveloperIDMStereotype.USECASES_STEREOTYPE);
		if (useCaseIN != null) {
			Package useCaseModelOUT = createSection(documentModel, USE_CASES);
			generateUseCases(copyImageUtil, useCaseIN, useCaseModelOUT);
		}

		// get Design package
		Model designPackageIn = getStereotypedPackage(I_DeveloperIDMStereotype.DESIGN_STEREOTYPE);
		if (designPackageIn != null) {
			Package designPackageOUT = createSection(documentModel, DESIGN);
			generateDesign(copyImageUtil, designPackageIn, designPackageOUT);
		}


		Model testIN = getStereotypedPackage(I_DeveloperIDMStereotype.TESTS_STEREOTYPE);
		if (testIN != null) {
			Package testModelOUT = createSection(documentModel, TESTS);
			generateTests(copyImageUtil, testIN, testModelOUT);
		}

		// Get the requirements model package from the model
		Model requirementsModel = getStereotypedPackage(I_DeveloperIDMStereotype.REQUIREMENTS_STEREOTYPE);
		//  For each requirements, creates a line in the table
		if (requirementsModel != null) {
			Package requirementsCoverageOUT = createSection(documentModel, "Requirements Coverage");
			generateTableCoverage(requirementsModel, requirementsCoverageOUT);
		}

		// Generate content of the Table of Contents package
		generateTableOfContents(documentModel);
	}


	/**
	 * Generate a package which represents a section on the table of content.
	 * First, iterates on each "Section" Package of the document model.
	 * Then, retrieves if the section has owned "section" package.
	 * 
	 * @param documentModel
	 */
	protected void generateTableOfContents(Model documentModel) {
		for (Iterator<Element> sections = documentModel.getOwnedElements().iterator(); sections.hasNext();) {
			Element section = sections.next();
			Stereotype sectionStereotype = section.getAppliedStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
			if (sectionStereotype != null) {
				Package toc = (Package) documentModel.getPackagedElement("Table of Contents");
				Stereotype tableOfContentStereotype = toc.getAppliedStereotype(I_DocumentStereotype.TABLEOFCONTENT_STEREOTYPE);
				if (!(section.isStereotypeApplied(tableOfContentStereotype))) {
					Package chapter = createSection(toc, ((Package)section).getName());
					IDMAbstractHandler.Toc2DocElt.put(chapter, (Package) section);
					setTableOfContents(section, chapter);
				}
			}
		}
	}

	/**
	 * 
	 * Generate a package which represents a sub section on the table of content
	 * This is the same algorithm as @see {@link CreateDocumentModelCommand}.generateTableOfContents()
	 * This method is recursive.
	 * 
	 * @param packageElement
	 * @param chapterPackage
	 */
	protected void setTableOfContents(Element packageElement, Package chapterPackage) {
		if (packageElement.getOwnedElements() != null) {
			for (Iterator<Element> elements = packageElement.getOwnedElements().iterator(); elements.hasNext();) {
				Element cddElement = elements.next();
				Stereotype sectionStereotype = cddElement.getAppliedStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
				if (sectionStereotype != null) {
					Package chapter = createSection(chapterPackage, ((Package)cddElement).getName());
					IDMAbstractHandler.Toc2DocElt.put(chapter, (Package) cddElement);
					setTableOfContents(cddElement, chapter);
				} 
			}
		}
	}


	protected void generateRequirements(Model requirementsIn, Package requirementsOUT) {
		for (Iterator<EObject> itereq = requirementsIn.eAllContents(); itereq.hasNext();) {
			EObject packageableElement = itereq.next();
			if (packageableElement instanceof PackageImport) {
				PackageImport importedPackage = (PackageImport)packageableElement;
				if (importedPackage.getAppliedStereotype(I_DeveloperIDMStereotype.REQUIREMENTS_STEREOTYPE) != null) {
					Model importedRequirementPackageIn = (Model) importedPackage.getImportedPackage();
					generateRequirements(importedRequirementPackageIn, requirementsOUT);
				}
			} else if (packageableElement instanceof Element){
				Element currentReq = (Element) packageableElement;
				Stereotype reqStereotype = currentReq.getApplicableStereotype(SYS_ML_REQUIREMENTS_REQUIREMENT);
				if (reqStereotype != null) {
					String out = "- " + ((org.eclipse.uml2.uml.Class) currentReq).getName() + " (id=" + currentReq.getValue(reqStereotype, "id") + "): "; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
					out = out + "\n " + currentReq.getValue(reqStereotype, "text"); //$NON-NLS-1$ //$NON-NLS-2$

					Comment comment = requirementsOUT.createOwnedComment();
					Stereotype contentStereotype = comment.getApplicableStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE);
					comment.applyStereotype(contentStereotype);
					comment.setBody(out);
					IDMAbstractHandler.elt2DocElt.put(currentReq, comment);
				}
			}
		}
	}

	protected void generateUseCases(CopyToImageUtil copyImageUtil, Model useCaseIN, Package useCaseModelOUT) {
		// createRef diagram
		if (containedDiagrams(useCaseIN).size() > 0) {
			Diagram currentDiagram = containedDiagrams(useCaseIN).get(0);
			generateImg(copyImageUtil, useCaseModelOUT, currentDiagram);
		}
		for (Iterator<Comment> iteComment = (useCaseIN).getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment currentComment = iteComment.next();
			transformToContentComment(useCaseModelOUT, currentComment);
			createImageFromHyperLink(copyImageUtil, useCaseModelOUT, currentComment);
		}

		for (PackageableElement packageableElement : useCaseIN.getPackagedElements()) {
			if( (packageableElement instanceof Classifier) &&(!(packageableElement instanceof Actor)) &&(!(packageableElement instanceof Association) )){
				Classifier subjectIn = (Classifier) packageableElement;
				Package subSectionOUT = createSection(useCaseModelOUT, subjectIn.getName());
				generateUseCaseFromSubject(copyImageUtil, subjectIn, subSectionOUT);
			}
		}


	}

	protected void generateUseCaseFromSubject(CopyToImageUtil copyImageUtil, Classifier subjectIN, Package useCaseModelOUT){
		// createRef diagram
		if (containedDiagrams(subjectIN).size() > 0) {
			Diagram currentDiagram = containedDiagrams(subjectIN).get(0);
			generateImg(copyImageUtil, useCaseModelOUT, currentDiagram);
		}
		for (Iterator<Comment> iteComment = (subjectIN).getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment currentComment = iteComment.next();
			transformToContentComment(useCaseModelOUT, currentComment);
			createImageFromHyperLink(copyImageUtil, useCaseModelOUT, currentComment);
		}

		for (Iterator<EObject> iterator = subjectIN.eAllContents(); iterator.hasNext();) {
			EObject packageableElement = iterator.next();
			if (packageableElement instanceof UseCase) {
				Package useCaseSectionOUT = createSection(useCaseModelOUT, ((UseCase) packageableElement).getName());

				for (Iterator<Comment> iteComment = ((UseCase) packageableElement).getOwnedComments().iterator(); iteComment.hasNext();) {
					Comment currentComment = iteComment.next();
					transformToContentWithUser(copyImageUtil, useCaseSectionOUT, currentComment);
				}
			} else if (packageableElement instanceof PackageImport) {
				PackageImport importedPackage = (PackageImport)packageableElement;
				if (importedPackage.getAppliedStereotype(I_DeveloperIDMStereotype.USECASES_STEREOTYPE) != null) {
					Model importedUseCasesPackageIn = (Model) importedPackage.getImportedPackage();
					generateUseCases(copyImageUtil, importedUseCasesPackageIn, useCaseModelOUT);
				}
			}
		}

	}

	protected void transformToContentWithUser(CopyToImageUtil copyImageUtil, Package useCaseSectionOUT, Comment currentComment) {
		Stereotype isUser = currentComment.getAppliedStereotype(I_DeveloperIDMStereotype.USERDOC_STEREOTYPE);
		if (isUser != null) {
			Package HowToSection = (Package) useCaseSectionOUT.getPackagedElement(HOW_TO);
			if (HowToSection == null) {
				HowToSection = createSection(useCaseSectionOUT, HOW_TO);
			}
			transformToContentComment(HowToSection, currentComment);
			createImageFromHyperLink(copyImageUtil, HowToSection, currentComment);
		}
		else {
			transformToContentComment(useCaseSectionOUT, currentComment);
			createImageFromHyperLink(copyImageUtil, useCaseSectionOUT, currentComment);
		}
	}

	protected void generateDesign(CopyToImageUtil copyImageUtil, Package designPackageIn, Package designPackageOUT) {

		if(designPackageIn.getPackageImports().size()>0){
			for (PackageImport packageImport : designPackageIn.getPackageImports()) {
				if (packageImport.getAppliedStereotype(I_DeveloperIDMStereotype.DESIGN_STEREOTYPE) != null) {
					Package importedDesignPackageIn = (Package) packageImport.getImportedPackage();
					Package subSectionOUT = createSection(designPackageOUT, importedDesignPackageIn.getName());
					IDMAbstractHandler.elt2DocElt.put((Element) importedDesignPackageIn, subSectionOUT);
					generateDesign(copyImageUtil, importedDesignPackageIn, subSectionOUT);
				}
			}
		}

		// createRef diagram
		if (containedDiagrams(designPackageIn).size() > 0) {
			Diagram currentDiagram = containedDiagrams(designPackageIn).get(0);
			generateImg(copyImageUtil, designPackageOUT, currentDiagram);
		}
		for (Iterator<Comment> iteComment = (designPackageIn).getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment currentComment = iteComment.next();
			createImageFromHyperLink(copyImageUtil, designPackageOUT, currentComment);
			transformToContentComment(designPackageOUT, currentComment);
		}

		for (Iterator<PackageableElement> iterator = designPackageIn.getPackagedElements().iterator(); iterator.hasNext();) {
			EObject packageableElement = iterator.next();
			if (packageableElement instanceof Class) {
				Package designSectionOUT = createSection(designPackageOUT, ((Class)packageableElement).getName());
				IDMAbstractHandler.elt2DocElt.put((Element) packageableElement, designSectionOUT);
				for (Iterator<Comment> iteComment = ((Class) packageableElement).getOwnedComments().iterator(); iteComment.hasNext();) {
					Comment currentComment = iteComment.next();
					transformToContentWithUser(copyImageUtil, designSectionOUT, currentComment);
				}
			}
			if (packageableElement instanceof Package) {
				Package designSectionOUT = createSection(designPackageOUT, ((Package)packageableElement).getName());
				IDMAbstractHandler.elt2DocElt.put((Element) packageableElement, designSectionOUT);
				generateDesign(copyImageUtil, (Package)packageableElement, designSectionOUT);
			}

		}

	}


	protected void generateTests(CopyToImageUtil copyImageUtil, Package testIN, Package testModelOUT) {
		if(testIN.getPackageImports().size()>0){
			for (PackageImport packageImport : testIN.getPackageImports()) {
				if (packageImport.getAppliedStereotype(I_DeveloperIDMStereotype.EXECUTABLETEST_STEREOTYPE) != null
						|| packageImport.getAppliedStereotype(SYS_ML_REQUIREMENTS_TESTCASE) != null
						|| packageImport.getAppliedStereotype(I_DeveloperIDMStereotype.MANUALTEST_STEREOTYPE) != null) {
					Model importedTestPackageIn = (Model) packageImport.getImportedPackage();
					generateTests(copyImageUtil, importedTestPackageIn, testModelOUT);
				}
			}
		}

		// createRef diagram
		if (containedDiagrams(testIN).size() > 0) {
			Diagram currentDiagram = containedDiagrams(testIN).get(0);
			generateImg(copyImageUtil, testModelOUT, currentDiagram);
		}
		for (Iterator<Comment> iteComment = (testIN).getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment currentComment = iteComment.next();
			createImageFromHyperLink(copyImageUtil, testModelOUT, currentComment);
			transformToContentComment(testModelOUT, currentComment);
		}

		for (Iterator<PackageableElement> iterator = testIN.getPackagedElements().iterator(); iterator.hasNext();) {
			EObject packageableElement = iterator.next();

			if (packageableElement instanceof Package) {
				Package testCaseSectionOUT = createSection(testModelOUT, ((Package) packageableElement).getName());
				IDMAbstractHandler.elt2DocElt.put((Element) packageableElement, testCaseSectionOUT);
				generateTests(copyImageUtil, (Package)packageableElement, testCaseSectionOUT);
				for (Iterator<Comment> iteComment = ((Package) packageableElement).getOwnedComments().iterator(); iteComment.hasNext();) {
					Comment currentComment = iteComment.next();
					createImageFromHyperLink(copyImageUtil, testCaseSectionOUT, currentComment);
					transformToContentComment(testCaseSectionOUT, currentComment);
				}
			}
			else if	(packageableElement instanceof Behavior ||packageableElement instanceof Classifier) {

				Package testCaseSectionOUT = createSection(testModelOUT, ((NamedElement) packageableElement).getName());
				IDMAbstractHandler.elt2DocElt.put((Element) packageableElement, testCaseSectionOUT);
				for (Iterator<Comment> iteComment = ((NamedElement) packageableElement).getOwnedComments().iterator(); iteComment.hasNext();) {
					Comment currentComment = iteComment.next();
					createImageFromHyperLink(copyImageUtil, testCaseSectionOUT, currentComment);
					transformToContentComment(testCaseSectionOUT, currentComment);
				}
			}

		}
	}

	/**
	 * 
	 * Generate the Requirements Coverage "Section" Package in the document model.
	 * First, retrieves the requirements package in the model. 
	 * Then, for each requirement, create a comment with "Line" stereotype.
	 * A line has cells, and those cells are represented by a comment with the "Cell" stereotype.
	 * And a cell has contents, those contents are represented by a comment with the "CellContent" stereotype
	 * 
	 * @param documentModel
	 */
	protected void generateTableCoverage(Model requirementsModel, Package requirementsCoverageOUT) {		

		// Create the comment with the table stereotype
		Comment table = requirementsCoverageOUT.createOwnedComment();
		table.setBody("Requirements Coverage Table");

		Comment unsatisfiedRequirementComment = requirementsCoverageOUT.createOwnedComment();
		unsatisfiedRequirementComment.setBody("");
		Stereotype contentStereotype = unsatisfiedRequirementComment.getApplicableStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE);
		unsatisfiedRequirementComment.applyStereotype(contentStereotype);

		Comment unverifiedRequirementComment = requirementsCoverageOUT.createOwnedComment();
		unverifiedRequirementComment.setBody("");
		unverifiedRequirementComment.applyStereotype(contentStereotype);

		// "Loads" stereotypes will be used
		Stereotype tableStereotype = table.getApplicableStereotype(I_DocumentStereotype.TABLE_STEREOTYPE);

		// Add the caption of the table
		table.applyStereotype(tableStereotype);
		table.setValue(tableStereotype, I_DocumentStereotype.TABLE_CAPTION_ATT, "RequirementsCoverageTable");

		setTableCoverage(requirementsModel, requirementsCoverageOUT, table, unsatisfiedRequirementComment, unverifiedRequirementComment);
	}

	public void setTableCoverage(Model requirementsModel, Package requirementsCoverageOUT, Comment table, Comment unsatisfiedRequirementComment, Comment unverifiedRequirementComment) {

		// "Loads" stereotypes will be used
		Stereotype refContentStereotype = table.getApplicableStereotype(I_DocumentStereotype.REF_CONTENT_STEREOTYPE);
		Stereotype cellStereotype = table.getApplicableStereotype(I_DocumentStereotype.CELL_STEREOTYPE);
		Stereotype lineStereotype = table.getApplicableStereotype(I_DocumentStereotype.LINE_STEREOTYPE);

		// Iterates for each requirements 
		for (Iterator<EObject> itereq = requirementsModel.eAllContents(); itereq.hasNext();) {
			EObject packageableElement = itereq.next();
			if (packageableElement instanceof PackageImport) {
				PackageImport importedPackage = (PackageImport)packageableElement;
				if (importedPackage.getAppliedStereotype(I_DeveloperIDMStereotype.REQUIREMENTS_STEREOTYPE) != null) {
					Model importedRequirementPackageIn = (Model) importedPackage.getImportedPackage();
					setTableCoverage(importedRequirementPackageIn, requirementsCoverageOUT, table, unsatisfiedRequirementComment, unverifiedRequirementComment);
				}
			} else if (packageableElement instanceof Element) {

				Element currentReq = (Element) packageableElement;
				Stereotype reqStereotype = currentReq.getApplicableStereotype(SYS_ML_REQUIREMENTS_REQUIREMENT);
				if (reqStereotype != null) {
					nbRequirement++;
					String reqID = (String) currentReq.getValue(reqStereotype, "id");

					// Generate line of the table
					Comment lineComment = table.createOwnedComment();
					lineComment.applyStereotype(lineStereotype);
					lineComment.setBody("Line for the requirement with " + reqID + " as id");

					// Generate the cell ID of the table
					Comment commentCellID = lineComment.createOwnedComment();
					commentCellID.applyStereotype(cellStereotype);

					commentCellID.setBody("Requirement ID");

					// Generate the cellContent for the cell ID of the table
					Comment commentContentID = commentCellID.createOwnedComment();
					commentContentID.applyStereotype(refContentStereotype);

					if (currentReq instanceof NamedElement) {
						commentContentID.setBody(reqID);
					}

					commentContentID.setValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT, currentReq);

					// Generate SatisfiedBy cell of the table
					Comment satisfiedByCell = lineComment.createOwnedComment();
					satisfiedByCell.applyStereotype(cellStereotype);

					@SuppressWarnings("unchecked")
					List<NamedElement> cddSatisfiedBy = (List<NamedElement>) currentReq.getValue(reqStereotype, "satisfiedBy");

					/* If the requirement is unsatisfied,
					 * add it to the unsatisfiedRequirement list (for tracability)
					 * creates a comment with the cellContentStereotype (to add reference in the documentation)
					 */
					if (cddSatisfiedBy.size() == 0) {
						nbUnsatisfiedRequirement++;

						Comment unsatisfiedReq = unsatisfiedRequirementComment.createOwnedComment();
						unsatisfiedReq.applyStereotype(refContentStereotype);
						unsatisfiedReq.setValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT, currentReq);
						unsatisfiedReq.setBody((String) currentReq.getValue(reqStereotype, "id"));
					}

					/* Iterate on satisfied elements of the requirements.
					 * For each one, create the cellContent.
					 * Then, add it to the SatisfiedBy cell of the table */
					for (Iterator<NamedElement> iterSatisified = cddSatisfiedBy.iterator(); iterSatisified.hasNext();) {
						NamedElement satisfiedElement = iterSatisified.next();

						Comment satisfiedByCellContent = satisfiedByCell.createOwnedComment();
						satisfiedByCellContent.applyStereotype(refContentStereotype);		
						satisfiedByCellContent.setValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT, satisfiedElement);

						satisfiedByCellContent.setBody(satisfiedElement.getName());
					}

					satisfiedByCell.setBody("Satisfied elements");

					// Generate VerifiedBy cell of the table			
					Comment verifiedByCell = lineComment.createOwnedComment();
					verifiedByCell.applyStereotype(cellStereotype);

					@SuppressWarnings("unchecked")
					List<NamedElement> cddVerifiededBy = (List<NamedElement>) currentReq.getValue(reqStereotype, "verifiedBy");

					/* If the requirement is unverified,
					 * add it to the unverifiedRequirement list (for tracability)
					 * creates a comment with the cellContentStereotype (to add reference in the documentation)
					 */
					if (cddVerifiededBy.size() == 0) {
						nbUnverifiedRequirement++;

						Comment unverifiedReq = unverifiedRequirementComment.createOwnedComment();
						unverifiedReq.applyStereotype(refContentStereotype);
						unverifiedReq.setValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT, currentReq);
						unverifiedReq.setBody((String) currentReq.getValue(reqStereotype, "id"));
					}

					/* Iterate on verified elements of the requirements.
					 * For each one, create the cellContent.
					 * Then, add it to the VerifiedBy cell of the table 
					 */
					for (Iterator<NamedElement> iterVerified = cddVerifiededBy.iterator(); iterVerified.hasNext();) {
						NamedElement verifiedElement = iterVerified.next();

						Comment verifiedByCellContent = verifiedByCell.createOwnedComment();
						verifiedByCellContent.applyStereotype(refContentStereotype);		
						verifiedByCellContent.setValue(refContentStereotype, I_DocumentStereotype.REF_CONTENT_REF_ATT, verifiedElement);

						verifiedByCellContent.setBody(verifiedElement.getName()) ;
					}

					verifiedByCell.setBody("Verified elements");
				}

				unsatisfiedRequirementComment.setBody("Unsatisfied requirements (" + nbUnsatisfiedRequirement  + " out of " + nbRequirement + ") : ");
				unverifiedRequirementComment.setBody("Unverified requirements (" + nbUnverifiedRequirement + " out of " + nbRequirement + ") : ");
			}
		}
	}

	/**
	 * 
	 * Return the stereotyped model element.
	 * 
	 * @param stereotypeName
	 * @return
	 */
	public Model getStereotypedPackage(String stereotypeName) {
		Model cddModel = null;
		for (Iterator<PackageableElement> iterator = topModel.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = iterator.next();
			if ((packageableElement.getAppliedStereotype(stereotypeName)) != null) {
				cddModel = (Model) packageableElement;
			}
		}
		return cddModel;
	}



	/**
	 *
	 * @param namedElement
	 * @param topModel
	 * @return the list of elements that depends of the given named element (never null, empty list)
	 */
	public ArrayList<NamedElement> getAllDependentElement(NamedElement namedElement, Package topModel) {
		ArrayList<NamedElement> result = new ArrayList<NamedElement>();
		Iterator<EObject> iteratorEObject = topModel.eAllContents();
		while (iteratorEObject.hasNext()) {
			EObject eObject = iteratorEObject.next();
			if (eObject instanceof Dependency) {
				if (((Dependency) eObject).getSuppliers().contains(namedElement)) {
					result.addAll(((Dependency) eObject).getClients());
				}
			}

		}
		return result;

	}


	@SuppressWarnings("unchecked")
	protected void createImageFromHyperLink(CopyToImageUtil copyImageUtil, Package designPackageOUT, Comment currentComment) {
		List<Object> referedViews = NavigatorUtils.getEObjectViews(currentComment);
		if (referedViews.size() != 0) {
			for (Iterator<?> iterator = referedViews.iterator(); iterator.hasNext();) {
				Object currentView = iterator.next();
				if (currentView instanceof View) {
					ArrayList<HyperLinkObject> result = null;
					try {
						result = (ArrayList<HyperLinkObject>) hyperlinkHelperFactory.getAllreferenced((View) referedViews.get(0));
					} catch (HyperLinkException e) {
						e.printStackTrace();
					}
					for (Iterator<HyperLinkObject> iteratorhyperlink = result.iterator(); iteratorhyperlink.hasNext();) {
						HyperLinkObject hyperLinkObject = iteratorhyperlink.next();
						System.err.println(hyperLinkObject.getObject());
						if (hyperLinkObject.getObject() instanceof Diagram) {
							generateImg(copyImageUtil, designPackageOUT, ((Diagram) hyperLinkObject.getObject()));
						}
						if (hyperLinkObject instanceof HyperLinkDocument) {
							String IMGpath = ((HyperLinkDocument) hyperLinkObject).getHyperlinkDocument();
							Comment commentImg = designPackageOUT.createOwnedComment();
							Stereotype refStereotype = commentImg.getApplicableStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE);
							commentImg.applyStereotype(refStereotype);
							commentImg.setValue(refStereotype, I_DocumentStereotype.IMAGEREF_REF_ATT, IMGpath.toString());
							commentImg.setBody(hyperLinkObject.getTooltipText());
						}
					}
				}
			}
		}
	}

	/**
	 * create the element table of content from the package
	 * 
	 * @param documentModelOUT
	 * @param title
	 * @return
	 */
	protected Package createTableOfContents(Package documentModelOUT, String title) {
		Package tocPackageOUT = UMLFactory.eINSTANCE.createPackage();
		documentModelOUT.getPackagedElements().add(tocPackageOUT);
		Stereotype tocStereotype = tocPackageOUT.getApplicableStereotype(I_DocumentStereotype.TABLEOFCONTENT_STEREOTYPE);
		tocPackageOUT.applyStereotype(tocStereotype);
		tocPackageOUT.setName(title);
		return tocPackageOUT;
	}

	/**
	 * create the element section from the package
	 *
	 * @param documentModelOUT
	 * @param sectionTitle
	 * @return
	 */
	protected Package createSection(Package documentModelOUT, String sectionTitle) {
		Package sectionPackageOUT = UMLFactory.eINSTANCE.createPackage();
		documentModelOUT.getPackagedElements().add(sectionPackageOUT);
		Stereotype sectionStereotype = sectionPackageOUT.getApplicableStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
		sectionPackageOUT.applyStereotype(sectionStereotype);
		sectionPackageOUT.setName(sectionTitle);
		return sectionPackageOUT;
	}

	/**
	 * transform a comment to content Comment
	 *
	 * @param documentModel
	 * @param currentComment
	 */
	protected void transformToContentComment(Package documentModel, Comment currentComment) {

		Comment comment = documentModel.createOwnedComment();
		Stereotype contentStereotype = comment.getApplicableStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE);
		comment.applyStereotype(contentStereotype);
		comment.setBody(currentComment.getBody());
	}

	/**
	 * Transform a diagram to imageRefComment
	 *
	 * @param copyImageUtil
	 * @param currentModel
	 * @param currentDiagram
	 */
	protected void generateImg(CopyToImageUtil copyImageUtil, Package currentModel, Diagram currentDiagram) {
		Path imagePath = new Path("" + directoryPath + File.separator + "imgDOC" + File.separator + currentDiagram.getName().replaceAll(" ", "_") + ".png"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		try {

			copyImageUtil.copyToImage(currentDiagram,
					imagePath,
					ImageFileFormat.PNG,
					new NullProgressMonitor(),
					PreferencesHint.USE_DEFAULTS);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		Comment commentImg = currentModel.createOwnedComment();
		Stereotype refStereotype = commentImg.getApplicableStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE);
		commentImg.applyStereotype(refStereotype);
		commentImg.setValue(refStereotype, I_DocumentStereotype.IMAGEREF_REF_ATT, imagePath.toString());
		commentImg.setBody(currentDiagram.getName());
	}

	/**
	 *
	 * @param source
	 * @return the list of referenced diagram
	 */
	public ArrayList<Diagram> containedDiagrams(EObject source) {
		ArrayList<Diagram> result = new ArrayList<Diagram>();
		Iterator<EObject> roots = NavigatorUtils.getNotationRoots(source);
		if (roots == null) {
			return result;
		}

		while (roots.hasNext()) {
			EObject root = roots.next();
			if (root instanceof Diagram) {
				if (EcoreUtil.equals(DiagramUtils.getOwner((Diagram) root), source)) {
					result.add((Diagram) root);
				}
			}
		}
		return result;
	}
}
