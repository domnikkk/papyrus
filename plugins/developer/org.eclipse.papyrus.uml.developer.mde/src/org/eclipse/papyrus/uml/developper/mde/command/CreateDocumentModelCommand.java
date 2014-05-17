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
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkObject;
import org.eclipse.papyrus.infra.hyperlink.util.HyperLinkException;
import org.eclipse.papyrus.infra.hyperlink.util.HyperLinkHelpersRegistrationUtil;
import org.eclipse.papyrus.uml.developper.mde.I_DeveloperIDMStereotype;
import org.eclipse.papyrus.uml.developper.mde.I_DocumentStereotype;
import org.eclipse.papyrus.views.modelexplorer.NavigatorUtils;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UseCase;

/**
 * this command transform a model to document model
 *
 */
public class CreateDocumentModelCommand extends RecordingCommand {

	protected org.eclipse.uml2.uml.Package topModel;
	protected String directoryPath=null;
	protected HyperLinkHelperFactory hyperlinkHelperFactory;

	public CreateDocumentModelCommand(TransactionalEditingDomain domain, org.eclipse.uml2.uml.Package topModel, String directoryPath) {
		super(domain);
		this.topModel=topModel;
		this.directoryPath=directoryPath;
		ArrayList<AbstractHyperLinkHelper> hyperLinkHelpers = new ArrayList<AbstractHyperLinkHelper>();

		hyperLinkHelpers.addAll(HyperLinkHelpersRegistrationUtil.INSTANCE.getAllRegisteredHyperLinkHelper());
		hyperlinkHelperFactory = new HyperLinkHelperFactory(hyperLinkHelpers);
	}

	@Override
	protected void doExecute() {
		CopyToImageUtil copyImageUtil = new CopyToImageUtil();
		Model documentModel=UMLFactory.eINSTANCE.createModel();
		topModel.getPackagedElements().add(documentModel);
		Stereotype stereotypeDocument =documentModel.getApplicableStereotype(I_DocumentStereotype.DOCUMENT_STEREOTYPE);
		documentModel.applyStereotype(stereotypeDocument);

		Stereotype stereotypeProject= topModel.getAppliedStereotype(I_DeveloperIDMStereotype.PROJECT_STEREOTYPE);
		documentModel.setName((String)topModel.getValue(stereotypeProject, I_DeveloperIDMStereotype.PROJECT_TITLE_ATT));
		documentModel.setValue(stereotypeDocument, I_DocumentStereotype.DOCUMENT_AUTHOR_ATT, ((String)topModel.getValue(stereotypeProject, I_DeveloperIDMStereotype.PROJECT_AUTHOR_ATT)));
		documentModel.setValue(stereotypeDocument, I_DocumentStereotype.DOCUMENT_VERSION_ATT, ((String)topModel.getValue(stereotypeProject, I_DeveloperIDMStereotype.PROJECT_VERSION_ATT)));



		for(Iterator<Comment> iteComment = (topModel).getOwnedComments().iterator(); iteComment.hasNext();) {
			Comment currentComment = (Comment)iteComment.next();
			transformToContentComment(documentModel, currentComment);

		}

		//get Requirement package
		generateRequirements(documentModel);
		//get UseCases package
		generateUseCases(copyImageUtil, documentModel);
		//getDesing package
		generateDesign(copyImageUtil, documentModel);

		generateTests(copyImageUtil, documentModel);

	}

	protected void generateRequirements(Model documentModel) {
		Model requirementsIn=null;
		for(Iterator<PackageableElement> iterator = topModel.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = (PackageableElement)iterator.next();
			if((packageableElement.getAppliedStereotype(I_DeveloperIDMStereotype.REQUIREMENTS_STEREOTYPE))!=null){
				requirementsIn=(Model)packageableElement;
			}
		}

		if (requirementsIn!= null){
			Package requirementsOUT=UMLFactory.eINSTANCE.createPackage();
			documentModel.getPackagedElements().add(requirementsOUT);
			Stereotype sectionStereotype= requirementsOUT.getApplicableStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
			requirementsOUT.applyStereotype(sectionStereotype);
			requirementsOUT.setName("Requirements");

			for(Iterator<Element> itereq = (requirementsIn).getOwnedElements().iterator(); itereq.hasNext();) {
				Element currentReq = (Element)itereq.next();
				Stereotype reqStereotype=currentReq.getApplicableStereotype("SysML::Requirements::Requirement");
				if(reqStereotype!=null){
					String out="- "+((org.eclipse.uml2.uml.Class)currentReq).getName()+" (id="+currentReq.getValue(reqStereotype, "id")+"): ";
					out=out+"\n "+currentReq.getValue(reqStereotype, "text");

					Comment comment=requirementsOUT.createOwnedComment();
					Stereotype contentStereotype= comment.getApplicableStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE);
					comment.applyStereotype(contentStereotype);
					comment.setBody(out);
				}
			}
		}
	}

	protected Model generateUseCases(CopyToImageUtil copyImageUtil, Model documentModel) {
		Model useCaseIN=null;
		for(Iterator<PackageableElement> iterator = topModel.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = (PackageableElement)iterator.next();
			if((packageableElement.getAppliedStereotype(I_DeveloperIDMStereotype.USECASES_STEREOTYPE))!=null){
				useCaseIN=(Model)packageableElement;
			}
		}

		if (useCaseIN!= null){
			Package useCaseModelOUT = createSection(documentModel, "Use Cases");

			//createRef diagram
			Diagram currentDiagram= containedDiagrams(useCaseIN).get(0);
			generateImg(copyImageUtil, useCaseModelOUT, currentDiagram);

			for(Iterator<Comment> iteComment = (useCaseIN).getOwnedComments().iterator(); iteComment.hasNext();) {
				Comment currentComment = (Comment)iteComment.next();
				transformToContentComment(useCaseModelOUT, currentComment);

			}

			for(Iterator<EObject> iterator = useCaseIN.eAllContents(); iterator.hasNext();) {
				EObject packageableElement = (EObject)iterator.next();
				if(packageableElement instanceof UseCase){
					Package useCaseSectionOUT= createSection(useCaseModelOUT, ((UseCase)packageableElement).getName());

					for(Iterator<Comment> iteComment = ((UseCase)packageableElement).getOwnedComments().iterator(); iteComment.hasNext();) {
						Comment currentComment = (Comment)iteComment.next();
						transformToContentComment(useCaseSectionOUT, currentComment);
					}
				}
			}

		}
		return useCaseIN;
	}

	protected void generateDesign(CopyToImageUtil copyImageUtil, Model documentModel) {
		//get Design package
		Model designPackageIn=null;
		for(Iterator<PackageableElement> iterator = topModel.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = (PackageableElement)iterator.next();
			if((packageableElement.getAppliedStereotype(I_DeveloperIDMStereotype.DESIGN_STEREOTYPE))!=null){
				designPackageIn=(Model)packageableElement;
			}
		}
		if(designPackageIn!=null){
			Package designPackageOUT= createSection(documentModel, "Design");
			//createRef diagram
			Diagram currentDiagram= containedDiagrams(designPackageIn).get(0);
			generateImg(copyImageUtil, designPackageOUT, currentDiagram);

			for(Iterator<Comment> iteComment = (designPackageIn).getOwnedComments().iterator(); iteComment.hasNext();) {
				Comment currentComment = (Comment)iteComment.next();
				createImageFromHyperLink(copyImageUtil, designPackageOUT, currentComment);
				transformToContentComment(designPackageOUT, currentComment);
			}
		}



	}

	protected Model generateTests(CopyToImageUtil copyImageUtil, Model documentModel) {
		Model testIN=null;
		for(Iterator<PackageableElement> iterator = topModel.getPackagedElements().iterator(); iterator.hasNext();) {
			PackageableElement packageableElement = (PackageableElement)iterator.next();
			if((packageableElement.getAppliedStereotype(I_DeveloperIDMStereotype.TESTS_STEREOTYPE))!=null){
				testIN=(Model)packageableElement;
			}
		}

		if (testIN!= null){
			Package testModelOUT = createSection(documentModel, "Tests");

			//createRef diagram
			Diagram currentDiagram= containedDiagrams(testIN).get(0);
			generateImg(copyImageUtil, testModelOUT, currentDiagram);

			for(Iterator<Comment> iteComment = (testIN).getOwnedComments().iterator(); iteComment.hasNext();) {
				Comment currentComment = (Comment)iteComment.next();
				transformToContentComment(testModelOUT, currentComment);

			}

			for(Iterator<EObject> iterator = testIN.eAllContents(); iterator.hasNext();) {
				EObject packageableElement = (EObject)iterator.next();
				if(packageableElement instanceof UseCase){
					Package useCaseSectionOUT= createSection(testModelOUT, ((UseCase)packageableElement).getName());
					for(Iterator<Comment> iteComment = ((UseCase)packageableElement).getOwnedComments().iterator(); iteComment.hasNext();) {
						Comment currentComment = (Comment)iteComment.next();
						transformToContentComment(useCaseSectionOUT, currentComment);
					}
					ArrayList<NamedElement> test= getAllDependentElement((UseCase)packageableElement, topModel);
					for(Iterator<NamedElement> iteratorTest = test.iterator(); iteratorTest.hasNext();) {
						NamedElement currentTest = (NamedElement)iteratorTest.next();
						createSection(useCaseSectionOUT, currentTest.getName());

					}
				}

			}

		}
		return testIN;
	}

	public ArrayList<NamedElement> getAllDependentElement(NamedElement namedElement, Package topModel){
		ArrayList<NamedElement> result= new ArrayList<NamedElement>();
		Iterator<EObject> iteratorEObject= topModel.eAllContents();
		while(iteratorEObject.hasNext()) {
			EObject eObject = (EObject)iteratorEObject.next();
			if(eObject instanceof Dependency){
				if(((Dependency)eObject).getSuppliers().contains(namedElement)){
					result.addAll(((Dependency)eObject).getClients());
					}
			}

		}
		return result;

	}


	protected void createImageFromHyperLink(CopyToImageUtil copyImageUtil, Package designPackageOUT, Comment currentComment) {
		List<Object>referedViews=NavigatorUtils.getEObjectViews(currentComment);
		if(referedViews.size()!=0){
			for(Iterator<?> iterator = referedViews.iterator(); iterator.hasNext();) {
				Object currentView = (Object)iterator.next();
				if( currentView instanceof View){
					ArrayList<HyperLinkObject> result=null;
					try {
						result = (ArrayList<HyperLinkObject>)hyperlinkHelperFactory.getAllreferenced((View)referedViews.get(0));
					} catch (HyperLinkException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for(Iterator<HyperLinkObject> iteratorhyperlink = result.iterator(); iteratorhyperlink.hasNext();) {
						HyperLinkObject hyperLinkObject = (HyperLinkObject)iteratorhyperlink.next();
						System.err.println(hyperLinkObject.getObject());
						if(hyperLinkObject.getObject() instanceof Diagram){
							generateImg(copyImageUtil, designPackageOUT, ((Diagram)hyperLinkObject.getObject()));
						}
					}
				}
			}
		}
	}

	/**
	 * create the element section from the package
	 * @param documentModelOUT
	 * @param sectiontitle
	 * @return
	 */
	protected Package createSection(Package documentModelOUT, String sectiontitle) {
		Package SectionPackageOUT=UMLFactory.eINSTANCE.createPackage();
		documentModelOUT.getPackagedElements().add(SectionPackageOUT);
		Stereotype sectionStereotype= SectionPackageOUT.getApplicableStereotype(I_DocumentStereotype.SECTION_STEREOTYPE);
		SectionPackageOUT.applyStereotype(sectionStereotype);
		SectionPackageOUT.setName(sectiontitle);
		return SectionPackageOUT;
	}

	/**
	 * transform a comment to content Comment
	 * @param documentModel
	 * @param currentComment
	 */
	protected void transformToContentComment(Package documentModel, Comment currentComment) {

		Comment comment=documentModel.createOwnedComment();
		Stereotype contentStereotype= comment.getApplicableStereotype(I_DocumentStereotype.CONTENT_STEREOTYPE);
		comment.applyStereotype(contentStereotype);
		comment.setBody(currentComment.getBody());
	}

	/**
	 * Transform a diagram to imageRefComment
	 * @param copyImageUtil
	 * @param currentModel
	 * @param currentDiagram
	 */
	protected void generateImg(CopyToImageUtil copyImageUtil, Package currentModel, Diagram currentDiagram) {
		Path imagePath= new Path(""+directoryPath+ File.separator +"imgDOC"+File.separator+ currentDiagram.getName().replaceAll(" ", "_")+".png");
		try {

			copyImageUtil.copyToImage(currentDiagram,
				imagePath,
				ImageFileFormat.PNG,
				new NullProgressMonitor(),
				PreferencesHint.USE_DEFAULTS);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		Comment commentImg=currentModel.createOwnedComment();
		Stereotype refStereotype= commentImg.getApplicableStereotype(I_DocumentStereotype.IMAGEREF_STEREOTYPE);
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
		if(roots == null) {
			return result;
		}

		while(roots.hasNext()) {
			EObject root = roots.next();
			if(root instanceof Diagram) {
				if (EcoreUtil.equals(DiagramUtils.getOwner((Diagram) root), source)) {
					result.add((Diagram)root);
				}
			}
		}
		return result;
	}
}
