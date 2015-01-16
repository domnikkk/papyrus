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
package org.eclipse.papyrus.revision.tool.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.revision.tool.core.I_ReviewStereotype;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This handler is used to refuse a review from the review editor.
 */
public class RefuseReviewHandler extends RevisionAbstractHandler {
	/**
	 * The constructor.
	 */
	public RefuseReviewHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ArrayList<Element> elements=getSelectionSet();
		final IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if( part instanceof ReviewsEditor){
			if( elements.size()!=0){

				RecordingCommand cmd= new RecordingCommand(((ReviewsEditor)part).getReviewResourceManager().getDomain(), "Refuse currentReview") {
					@Override
					protected void doExecute() {
						for (Element element : elements) {

							Stereotype reviewtoDo= element.getAppliedStereotype(I_ReviewStereotype.TODO_STEREOTYPE);
							if(reviewtoDo!=null ){
								String diffuriFragment=(String)element.getValue(reviewtoDo, I_ReviewStereotype.COMMENT_DIFFREF_ATT);
								if( diffuriFragment!=null){

									//load EObject
									EObject eOject=element.eResource().getEObject(diffuriFragment);
									if(eOject instanceof ReferenceChange  ){
										ReferenceChange referenceChange= (ReferenceChange)eOject;
										//refuse Remove
										if( referenceChange.getKind().equals(DifferenceKind.DELETE)){
											refuseDELETE(part, element, referenceChange);
										}
										//refuse ADD
										else if( referenceChange.getKind().equals(DifferenceKind.ADD)){
											refuseADD(part, element, referenceChange);

										}
									}
									//refuse Set
									else if(eOject instanceof Match ){
										ReviewResourceManager r=((ReviewsEditor)part).getReviewResourceManager();
										if(((Match)eOject).getDifferences().size()>0){
											Diff diff=((Match)eOject).getDifferences().get(0);
											if( diff instanceof AttributeChange){
												Object oldValue= ((AttributeChange)diff).getValue();
												EStructuralFeature feature=((AttributeChange)diff).getAttribute();
												Command cmd=SetCommand.create(r.getDomain(), ((Match)eOject).getLeft(), feature, oldValue);
												cmd.execute();
												Match modelMatch=r.getDiffModel().getMatch(r.getWorkingModel());
												modelMatch.getSubmatches().remove(((Match)eOject));
											}
											else if (diff instanceof ReferenceChange){
												ReferenceChange referenceChange= (ReferenceChange)diff;
												//refuse Remove
												if( referenceChange.getKind().equals(DifferenceKind.DELETE)){
													EObject oldValue= referenceChange.getValue();
													EStructuralFeature feature=referenceChange.getReference();

													if(feature.isMany()){
														@SuppressWarnings("unchecked")
														List<EObject> set=(List<EObject>)((Match)eOject).getLeft().eGet(feature);
														set.add(oldValue);
														executeSeCommand(eOject, r, feature, set,element);
													}
													else{
														executeSeCommand(eOject, r, feature, oldValue, element);
													}
												}
												//refuse ADD
												else if( referenceChange.getKind().equals(DifferenceKind.ADD)){
													Object oldValue= referenceChange.getValue();
													EStructuralFeature feature=referenceChange.getReference();

													if(feature.isMany()){
														@SuppressWarnings("unchecked")
														List<EObject> set=(List<EObject>)((Match)eOject).getLeft().eGet(feature);
														set.remove(oldValue);
														executeSeCommand(eOject, r, feature, set, element);
													}
													else{
														executeSeCommand(eOject, r, feature, oldValue, element);
													}
												}
											}

										}
									}

								}

							}
						}

					}


				};
				((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(cmd);
			}
		}
		return null;
	}
	protected void refuseDELETE(final IWorkbenchPart part, Element element,
			ReferenceChange referenceChange) {
		ReviewResourceManager r=((ReviewsEditor)part).getReviewResourceManager();
		Match modelMatch=r.getDiffModel().getMatch(r.getWorkingModel());
		modelMatch.getDifferences().remove(referenceChange);
		((Element)element.eContainer()).getOwnedComments().remove(element);
	}

	protected void refuseADD(final IWorkbenchPart part, Element element, ReferenceChange referenceChange) {
		ReviewResourceManager r=((ReviewsEditor)part).getReviewResourceManager();
		EObject eObjectToRemove=referenceChange.getValue();
		refuseDELETE(part, element, referenceChange);
		DestroyElementRequest destroyrequest= new DestroyElementRequest(false); 
		destroyrequest.setEditingDomain(r.getDomain());
		destroyrequest.setElementToDestroy(eObjectToRemove);
		IElementEditService  provider = ElementEditServiceUtils.getCommandProvider(eObjectToRemove);
		if(provider != null) {
			// Retrieve delete command from the Element Edit service
			ICommand deleteCommand = provider.getEditCommand(destroyrequest);
			if(deleteCommand != null) {
				try {
					deleteCommand.execute(new NullProgressMonitor(), null);
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}
	}

	protected void executeSeCommand(EObject eOject, ReviewResourceManager r, EStructuralFeature feature, Object set,Element element) {
		SetRequest request= new SetRequest(((Match)eOject).getLeft(), feature, set);
		request.setEditingDomain(r.getDomain());
		IElementEditService  provider = ElementEditServiceUtils.getCommandProvider(request);
		if(provider != null) {
			// Retrieve delete command from the Element Edit service
			ICommand cmd = provider.getEditCommand(request);
			if(cmd != null) {
				try {
					cmd.execute(new NullProgressMonitor(), null);
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}
		Match modelMatch=r.getDiffModel().getMatch(r.getWorkingModel());
		modelMatch.getSubmatches().remove(((Match)eOject));
		((Element)element.eContainer()).getOwnedComments().remove(element);
	}

}
