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
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.core;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.revision.tool.Activator;
import org.eclipse.papyrus.revision.tool.dialogs.CreateAuthorDialog;
import org.eclipse.papyrus.revision.tool.dialogs.CreateOrSelectReviewModelDialog;
import org.eclipse.papyrus.revision.tool.preference.RevisionPreferenceConstants;
import org.eclipse.papyrus.uml.extensionpoints.profile.RegisteredProfile;
import org.eclipse.papyrus.uml.extensionpoints.utils.Util;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * This class is used to manage the resource about the reviews and revisions.
 * It contains several important methods:
 *- load or get the current review model
 *- start and stop revision the connect or disconnect listener to register modification in the working model
 *- method to access to the ServiceRegistry
 */
public class ReviewResourceManager {

	protected Model UMLWorkingModel;
	protected ModelSet modelSet;
	protected Model reviewModel;
	protected Actor currentAuthor;
	protected AddingDiffListener addingDiffListener=null;
	protected RefreshFigureListener refreshFigureListener=null;
	protected Comparison diffModel=null;
	protected boolean modeRevisionRunning=false;


	/**
	 * constructor
	 */
	public ReviewResourceManager(){
		this.addingDiffListener= new AddingDiffListener(this);
		this.refreshFigureListener= new RefreshFigureListener(this);
	}

	/**
	 * used before kill the the resourcemanager, it remove listeners...
	 */
	public void dispose(){
		if(addingDiffListener!=null){
			getDomain().removeResourceSetListener(addingDiffListener);
		}
		if(refreshFigureListener!=null){
			getDomain().removeResourceSetListener(refreshFigureListener);
		}
		modeRevisionRunning=false;
		refreshFigureListener=null;
		diffModel=null;
		reviewModel=null;
		currentAuthor=null;
		UMLWorkingModel=null;
		modelSet=null;
	}
	/**
	 * used to get the the current workbenchPart
	 * @return
	 */
	protected IWorkbenchPart getBootstrapPart() {


		IWorkbenchPart part = null;
		try {
			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (activeWorkbenchWindow != null) {
				IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
				if (activePage != null) {
					part = activePage.getActiveEditor();
				}
			}
		} catch (NullPointerException e) {
			// An element is not active yet
			return null;
		}
		if (isImportant(part)) {
			return part;
		}
		// The current active part is not for us.
		return null;
	}
	/**
	 * 
	 * @return the current Review model, maybe null
	 */
	public Model getCurrentReviewModelWithoutLoading(){
		return  reviewModel;
	}
	/**
	 * 
	 * @return the current Review model,if null load it with GUI
	 */

	public Model getCurrentReviewModel(){
		if( reviewModel==null){
			CreateOrSelectReviewModelDialog dialog=new CreateOrSelectReviewModelDialog(new Shell(), this);
			dialog.open();
			getDomain().addResourceSetListener(refreshFigureListener);
		}

		return reviewModel;
	}

	/**
	 * 
	 * @return the EMF compare Diff model
	 */
	public Comparison getDiffModel(){
		if( diffModel==null){
			getCurrentReviewModel();
			Resource reviewResource= getCurrentReviewModel().eResource();
			for (EObject currentRoot : reviewResource.getContents()) {
				if( currentRoot instanceof Comparison){
					diffModel= (Comparison)currentRoot;
				}
			}
			if( diffModel==null){
				diffModel= CompareFactory.eINSTANCE.createComparison();
				Match match= CompareFactory.eINSTANCE.createMatch();
				match.setLeft(getWorkingModel());
				reviewResource.getContents().add(diffModel);
			}
			
		}
		return diffModel;
	}
	/**
	 * 
	 * @return the editing domain of papyrus
	 */
	public TransactionalEditingDomain getDomain(){
		return getCurrentModelSet().getTransactionalEditingDomain();
	}

	/**
	 *  used to add a review in the review model
	 *  @param element the container of the review
	 */
	public void addAReview(final Element element){
		getCurrentReviewModel();
		final Actor theauthor=getCurrentAuthor();

		RecordingCommand cmd= new RecordingCommand(getDomain(), "createAReview") {
			@Override
			protected void doExecute() {
				Comment cmt= UMLFactory.eINSTANCE.createComment();
				cmt.setBody("Your review");
				if(element instanceof Comment ){
					((Comment)element).getOwnedComments().add(cmt);
				}
				else{	reviewModel.getOwnedComments().add(cmt);}

				Stereotype review= cmt.getApplicableStereotype(I_ReviewStereotype.REVIEW_STEREOTYPE);
				cmt.applyStereotype(review);
				cmt.setValue(review, I_ReviewStereotype.COMMENT_SUBJECT_ATT, "subject");

				Stereotype authorStereotype= theauthor.getApplicableStereotype(I_VersioningStereotype.AUTHOR_STEREOTYPE);
				cmt.setValue(review, I_VersioningStereotype.VERSIONINGELEMENT_AUTHOR_ATT, theauthor.getStereotypeApplication(authorStereotype));

				// add tthe date
				Date today = new Date();
				DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
				cmt.setValue(review, I_VersioningStereotype.VERSIONINGELEMENT_DATE_ATT, shortDateFormat.format(today));
			}
		};
		getDomain().getCommandStack().execute(cmd);

	}

	/**
	 * 
	 * @return the author construct from preferences
	 */
	public Actor getCurrentAuthor(){
		if(currentAuthor==null||currentAuthor.eContainer()==null){
			//1. test if the author of preferences is not anonymous
			final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			final String  authorNamefromPreference=store.getString(RevisionPreferenceConstants.AUTHOR_NAME);
			if( authorNamefromPreference.equals(RevisionPreferenceConstants.ANONYMOUS_AUTHOR)){
				CreateAuthorDialog authorDialog= new CreateAuthorDialog(new Shell());
				authorDialog.open();
			}
			final String  authorName=store.getString(RevisionPreferenceConstants.AUTHOR_NAME).trim();
			final Model reviewModel=getCurrentReviewModel();
			NamedElement author=reviewModel.getPackagedElement(authorName);
			if( author==null||!(author instanceof Actor)){
				RecordingCommand cmd= new RecordingCommand(getDomain(), "createReviewModel") {
					@Override
					protected void doExecute() {
						currentAuthor=UMLFactory.eINSTANCE.createActor();
						currentAuthor.setName(authorName.trim());
						reviewModel.getPackagedElements().add(currentAuthor);
						Stereotype authorStereotype= currentAuthor.getApplicableStereotype(I_VersioningStereotype.AUTHOR_STEREOTYPE);
						currentAuthor.applyStereotype(authorStereotype);
						currentAuthor.setValue(authorStereotype, I_VersioningStereotype.AUTHOR_LANGUAGE_ATT, store.getString(RevisionPreferenceConstants.AUTHOR_LANGUAGE));
						RGB authorColor=PreferenceConverter.getColor(store, RevisionPreferenceConstants.AUTHOR_COLOR);
						String colorString=authorColor.red+":"+authorColor.green+":"+authorColor.blue;
						currentAuthor.setValue(authorStereotype, I_VersioningStereotype.AUTHOR_COLOR_ATT, colorString);
					}
				};
				getDomain().getCommandStack().execute(cmd);
			}
			else{
				currentAuthor=(Actor)author;
			}
		}
		return currentAuthor;
	}
	/**
	 * used to load a review model
	 * @return the obtained review model
	 */
	public Model loadReviewModel(){
		ElementTreeSelectionDialog dialog= new ElementTreeSelectionDialog(Display.getDefault().getActiveShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

		PatternFilter UMLPattern= new PatternFilter(){
			@Override
			public boolean isElementVisible(Viewer viewer, Object element) {
				if(viewer!=null){
					return super.isElementVisible(viewer, element);
				}
				return true;
			}};
			UMLPattern.setPattern("*.uml");
			dialog.setAllowMultiple(false);
			dialog.addFilter( UMLPattern);
			dialog.open();
			if(dialog.getResult().length>0){
				Object object=dialog.getResult()[0];
				if(object instanceof IFile){
					IFile aReviewModel=((IFile)object);
					Resource tmpResource =  getCurrentModelSet().getResource(URI.createPlatformResourceURI(aReviewModel.getFullPath().toOSString(), true),true);
					for (EObject contentEObject : tmpResource.getContents()) {
						if( contentEObject instanceof Model && (((Model)contentEObject).getAppliedStereotype(I_ReviewStereotype.REVIEWREPOSITORY_STEREOTYPE))!=null){
							reviewModel=(Model)contentEObject;
						}
					}
				}
			}
			getDomain().addResourceSetListener(refreshFigureListener);
			return reviewModel;
	}
	/**
	 * create a review model
	 * @param reviewModelName the name of the review model that will be created
	 * @return the review model
	 */
	public Model createReviewModel(final String reviewModelName){
		RecordingCommand cmd= new RecordingCommand(getDomain(), "createReviewModel") {
			@Override
			protected void doExecute() {
				URI umlModel_URI=getWorkingModel().eResource().getURI();
				String tmpURI=umlModel_URI.toString().replaceAll(umlModel_URI.lastSegment().toString(), reviewModelName+".uml");
				URI reviewURI=URI.createURI(tmpURI);
				Resource resource = getCurrentModelSet().createResource(reviewURI);
				reviewModel = UMLFactory.eINSTANCE.createModel();
				reviewModel.setName(reviewModelName);
				// apply profile  review
				{
					RegisteredProfile registeredProfile=(RegisteredProfile)RegisteredProfile.getRegisteredProfile("ReviewProfile");
					URI reviewProfileUri = registeredProfile.uri;
					final Resource modelResource = getCurrentModelSet().getResource(reviewProfileUri, true);
					Profile reviewProfile=(Profile) modelResource.getContents().get(0);
					reviewModel.applyProfile(reviewProfile);
					reviewModel.applyStereotype(reviewModel.getApplicableStereotype(I_ReviewStereotype.REVIEWREPOSITORY_STEREOTYPE));
					EObject stereappl=reviewModel.getStereotypeApplication(reviewModel.getApplicableStereotype(I_ReviewStereotype.REVIEWREPOSITORY_STEREOTYPE));
					resource.getContents().add(stereappl);
				}
				//apply profile versioning
				{
					RegisteredProfile registeredProfile=(RegisteredProfile)RegisteredProfile.getRegisteredProfile("VersioningProfile");
					URI reviewProfileUri = registeredProfile.uri;
					final Resource modelResource = getCurrentModelSet().getResource(reviewProfileUri, true);
					Profile reviewProfile=(Profile) modelResource.getContents().get(0);
					reviewModel.applyProfile(reviewProfile);
				}

				Dependency dependency= UMLFactory.eINSTANCE.createDependency();
				dependency.getSuppliers().add(getWorkingModel());
				dependency.getClients().add(reviewModel);
				dependency.setName("WorkingModelDependency");
				reviewModel.getPackagedElements().add(dependency);
				resource.getContents().add(reviewModel);

				diffModel= CompareFactory.eINSTANCE.createComparison();
				Match match= CompareFactory.eINSTANCE.createMatch();
				match.setLeft(getWorkingModel());
				resource.getContents().add(diffModel);

			}
		};
		getDomain().getCommandStack().execute(cmd);
		getDomain().addResourceSetListener(refreshFigureListener);

		return reviewModel;
	}

	/**
	 * get the working model
	 * @return the model that is modified inside papyrus
	 */
	public Model getWorkingModel(){
		if(UMLWorkingModel!=null){
			return UMLWorkingModel;
		}

		modelSet = getCurrentModelSet();
		UmlModel IUMLModel=(UmlModel)modelSet.getModel(UmlModel.MODEL_ID);
		try {
			UMLWorkingModel = (Model)IUMLModel.lookupRoot();
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		return UMLWorkingModel;
	}

	/**
	 * 
	 * @return the current model set of papyrus.
	 */
	public ModelSet getCurrentModelSet(){
		if(modelSet!=null){
			return modelSet;
		}
		IWorkbenchPart part=getBootstrapPart();
		if (part instanceof IMultiDiagramEditor){
			ServicesRegistry  registry=((IMultiDiagramEditor)part).getServicesRegistry();
			try {
				modelSet = registry.getService(ModelSet.class);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return modelSet;
	}

	/**
	 * @return current service registry
	 */
	public ServicesRegistry getServiceRegistry(){
		IWorkbenchPart part=getBootstrapPart();
		if (part instanceof IMultiDiagramEditor){
			ServicesRegistry  registry=((IMultiDiagramEditor)part).getServicesRegistry();
			return registry;
		}
		return null;
	}
	/**
	 * return true if the activated part is a {@link IMultiDiagramEditor}.
	 *
	 * @see org.eclipse.ui.part.PageBookView#isImportant(org.eclipse.ui.IWorkbenchPart)
	 *
	 * @param part
	 * @return
	 */
	protected boolean isImportant(IWorkbenchPart part) {


		if (part instanceof IMultiDiagramEditor) {
			return true;
		}

		return false;
	}

	protected void compare(final Model modelBefore, Model modelAfter) {

		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		final IMatchEngine thematchEngine = new DefaultMatchEngine(matcher , comparisonFactory);
		IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
		IMatchEngine.Factory engineFactory = new MatchEngineFactoryImpl() {
			public IMatchEngine getMatchEngine() {
				return thematchEngine;
			}
		};
		engineFactory.setRanking(20); // default engine ranking is 10, must be higher to override.
		registry.add(engineFactory);
		IComparisonScope scope = new DefaultComparisonScope(modelBefore,modelAfter,null);
		final Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).build().compare(scope);
		List<Diff> differences = comparison.getDifferences();
		for (Diff diff : differences) {
			final Diff diffRef= diff;
			System.out.println(diff);
		}

		RecordingCommand cmd= new RecordingCommand(getDomain(), "saveSnaphsot") {
			@Override
			protected void doExecute() {
				URI umlModel_URI=getWorkingModel().eResource().getURI();
				String tmpURI=umlModel_URI.toString().replaceAll(umlModel_URI.lastSegment().toString(), "diff.xmi");
				URI reviewURI=URI.createURI(tmpURI);
				Resource resourcesnapshot = Util.createTemporaryResourceSet().createResource(reviewURI);
				resourcesnapshot.getContents().add(comparison);
				try {
					resourcesnapshot.save(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		getDomain().getCommandStack().execute(cmd);
	}

	/**
	 * used to save compare model as another file
	 */
	public void savediff(){
		RecordingCommand cmd= new RecordingCommand(getDomain(), "savediff") {
			@Override
			protected void doExecute() {

				URI umlModel_URI=getWorkingModel().eResource().getURI();
				String tmpURIresultDiff=umlModel_URI.toString().replaceAll(umlModel_URI.lastSegment().toString(), "resultDiff.xmi");
				URI resultDiffURI=URI.createURI(tmpURIresultDiff);
				Resource resourceresultDiff = Util.createTemporaryResourceSet().createResource(resultDiffURI);
				resourceresultDiff.getContents().add(diffModel);
				try {
					resourceresultDiff.save(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		//getDomain().getCommandStack().execute(cmd);
	}

	/**
	 * 
	 * @return true is the revison mode is running
	 */
	public boolean modeRevisionRunning(){
		return modeRevisionRunning;
	}
	/**
	 * start the mode revision is order to register modif
	 */
	public void startModeRevision(){
		modeRevisionRunning=true;
		RecordingCommand cmd= new RecordingCommand(getDomain(), "savediff") {
			@Override
			protected void doExecute() {
				//getDiffModel().getConflicts().clear();
				//getDiffModel().getDifferences().clear();
				//getDiffModel().getMatches().clear();
				
				if( getDiffModel().getMatches().size()==0){
					Match match= CompareFactory.eINSTANCE.createMatch();
					match.setLeft(getWorkingModel());
					getDiffModel().getMatches().add(match);
				}
			}
		};
		getDomain().getCommandStack().execute(cmd);
		getDomain().addResourceSetListener(addingDiffListener);
	}
	/**
	 * stop the revision model and stop listening modifications
	 */
	public void stopModelRevision(){
		modeRevisionRunning=false;
		getDomain().removeResourceSetListener(addingDiffListener);

	}
}
