/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.strategy.paste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.infra.core.clipboard.IClipboardAdditionalData;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.AbstractPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.DefaultPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.commands.RestoreStereotypeCompartmentCommand;
import org.eclipse.papyrus.uml.diagram.common.preferences.IStereotypePasteStrategyPreferenceConstant;
import org.eclipse.papyrus.uml.tools.commands.ApplyProfileCommand;
import org.eclipse.papyrus.uml.tools.commands.DuplicateStereotypeCommand;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Offer a strategy for copying stereotypes.
 */
public class StereotypePasteStrategy extends AbstractPasteStrategy implements IPasteStrategy {

	/** The instance. */
	private static IPasteStrategy instance = new StereotypePasteStrategy();

	/**
	 * Gets the single instance of StereotypePasteStrategy.
	 *
	 * @return single instance of StereotypePasteStrategy
	 */
	public static IPasteStrategy getInstance() {
		return instance;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getLabel()
	 */
	public String getLabel() {
		return "StereotypeStrategy"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getID()
	 */
	public String getID() {
		return Activator.ID + ".StereotypeStrategy"; //".ClassifierToStructureCompDrop"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getDescription()
	 */
	public String getDescription() {
		return "Paste stereotype elements"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#dependsOn()
	 */
	@Override
	public IPasteStrategy dependsOn() {
		return DefaultPasteStrategy.getInstance();
	}	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getSemanticCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 * org.eclipse.emf.ecore.EObject, org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard)
	 */
	@Override
	public org.eclipse.emf.common.command.Command getSemanticCommand(EditingDomain domain, EObject targetOwner, PapyrusClipboard<Object> papyrusClipboard) {
		
		if (targetOwner instanceof Element){
			CompoundCommand compoundCommand = new CompoundCommand("Copy all stereotypes"); 
			
			Map<Profile,List<DuplicateStereotypeCommand>> missingProfiles = new HashMap<Profile,List<DuplicateStereotypeCommand>>();
			Package targetPackage = ((Element)targetOwner).getNearestPackage();
			
			// 1. init all ApplyStereotypeCommand
			for(Iterator<Object> iterator = papyrusClipboard.iterator(); iterator.hasNext();) {
				Object object = (Object)iterator.next();
				// get target Element
				EObject target = papyrusClipboard.getTragetCopyFromInternalClipboardCopy(object);
				if(target != null && target instanceof Element) {
					// get affiliate StereotypeClipboard
					Map<Object, ?> additionalDataMap = papyrusClipboard.getAdditionalDataForStrategy(getID());
					Object additionnalData = additionalDataMap.get(object);
					if(additionnalData instanceof StereotypeClipboard) {
						StereotypeClipboard stereotypeClipboard = (StereotypeClipboard)additionnalData;
						Collection<EObject> stereotypeApplications = stereotypeClipboard.getstereotypeApplications();
						for(EObject stereotypeApplication : stereotypeApplications) {
							DuplicateStereotypeCommand applyStereotypeCommand = new DuplicateStereotypeCommand((TransactionalEditingDomain)domain, (Element)target, stereotypeApplication );	
					
							Stereotype stereotypeInTargetContext = applyStereotypeCommand.getStereotypeInTargetContext();
							Profile profile = stereotypeInTargetContext.getProfile();
								
							if (isProfileAppliedRecursive(targetPackage, profile)){		
								compoundCommand.append(applyStereotypeCommand);
							} else { // Profile is missing
								Activator.getDefault().logInfo(profile.getName()+" is missing", null);
								List<DuplicateStereotypeCommand> stereotypeListMissingProfiles = missingProfiles.get(profile);
								if (stereotypeListMissingProfiles!= null && !stereotypeListMissingProfiles.isEmpty()){
									stereotypeListMissingProfiles.add(applyStereotypeCommand);
								} else {
									stereotypeListMissingProfiles = new ArrayList<DuplicateStereotypeCommand>();
									stereotypeListMissingProfiles.add(applyStereotypeCommand);
									missingProfiles.put(profile, stereotypeListMissingProfiles);
								}
							}
						}
					}
				}
			}
			
			// 2. user preferences (Apply profiles, data...)
			IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
			String preferenceProfileStrategy = preferenceStore.getString(IStereotypePasteStrategyPreferenceConstant.PROFILE_STRATEGY);	
		
			if (IStereotypePasteStrategyPreferenceConstant.ASK_POPUP.equals(preferenceProfileStrategy)){// Ask user for instruction
				// TODO:  2. user choices (Apply profiles, data...)
			} else if (IStereotypePasteStrategyPreferenceConstant.IMPORT_MISSING_PROFILE.equals(preferenceProfileStrategy)){ // apply profile
				Set<Profile> profiles = missingProfiles.keySet();
				Package rootPackage = PackageUtil.getRootPackage((Element)targetOwner);
				ApplyProfileCommand applyProfileCommand = new ApplyProfileCommand(rootPackage, profiles, (TransactionalEditingDomain)domain);
				compoundCommand.append(applyProfileCommand);
				for(Profile profile : profiles) {
					List<DuplicateStereotypeCommand> list = missingProfiles.get(profile);
					for(DuplicateStereotypeCommand applyStereotypeCommand : list) {
						compoundCommand.append(applyStereotypeCommand);
					}
				}
			}
			
			
			// An empty can't be executed 
			if(compoundCommand.getCommandList().isEmpty()) {
				return null;
			}
			return compoundCommand;			
		}
		return UnexecutableCommand.INSTANCE;

	}

	
	@Override
	public org.eclipse.gef.commands.Command getGraphicalCommand(EditingDomain domain, GraphicalEditPart targetEditPart, PapyrusClipboard<Object> papyrusClipboard) {
			org.eclipse.gef.commands.CompoundCommand compoundCommand = new org.eclipse.gef.commands.CompoundCommand("Copy all stereotypes"); 

			if (targetEditPart != null){
				Object model = targetEditPart.getModel();
				if (model instanceof View){
					View view = (View)model;
					EObject targetOwner = view.getElement();
					org.eclipse.emf.common.command.Command semanticCommand = this.getSemanticCommand(domain, targetOwner, papyrusClipboard);
					if (semanticCommand != null){
						compoundCommand.add(EMFtoGEFCommandWrapper.wrap(semanticCommand));
					}					
				}
			}

			for(Iterator<EObject> iterator = papyrusClipboard.getTarget().iterator(); iterator.hasNext();) {
				EObject eObject = iterator.next();
					if(eObject instanceof BasicCompartment) {
						BasicCompartment basicCompartment = (BasicCompartment) eObject;
						RestoreStereotypeCompartmentCommand refreshStereotypeCompartmentCommand = new RestoreStereotypeCompartmentCommand((TransactionalEditingDomain)domain,basicCompartment);
						Command wrap = EMFtoGEFCommandWrapper.wrap(refreshStereotypeCompartmentCommand);
						compoundCommand.add(wrap);
					}
			}			
			
			if(compoundCommand.getCommands().isEmpty()) {
				return null;
			}			
			return compoundCommand;
	}
	
	/**
	 * Checks recursively if a profile is applied .
	 *
	 * @param element
	 *        the element
	 * @param profile
	 *        the profile
	 * @return true, if is profile applied recursive
	 */
	protected boolean isProfileAppliedRecursive(Element element, Profile profile) {
		if(element instanceof Package) {
			Package pkg = (Package)element;
			boolean profileApplied = pkg.isProfileApplied(profile);

			if(pkg instanceof Model) {
				return profileApplied;
			}

			if(!profileApplied) {
				return isProfileAppliedRecursive(element.getOwner(), profile);
			} else {
				return true;
			}
		}
		return isProfileAppliedRecursive(element.getOwner(), profile);
	}





	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#prepare(org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard)
	 */
	@Override
	public void prepare(PapyrusClipboard<Object> papyrusClipboard, Collection<EObject> selection) {
		Map<Object, IClipboardAdditionalData> mapCopyToStereotypeData = new HashMap<Object, IClipboardAdditionalData>();
		for(Iterator<EObject> iterator = papyrusClipboard.iterateOnSource(); iterator.hasNext();) {
			EObject eObjectSource = (EObject)iterator.next();
			if(eObjectSource instanceof Element) {
				Element element = (Element)eObjectSource;
				EList<EObject> stereotypeApplications = element.getStereotypeApplications();
				if(stereotypeApplications != null && !stereotypeApplications.isEmpty()) {
					StereotypeClipboard stereotypeClipboard = new StereotypeClipboard(stereotypeApplications);
					Object copy = papyrusClipboard.getCopyFromSource(eObjectSource);
					mapCopyToStereotypeData.put(copy, stereotypeClipboard);
				}
			}
		}
		papyrusClipboard.pushAdditionalData(getID(), mapCopyToStereotypeData);
	}


	//	protected ICommand getOpenDialogCommand(final TransactionalEditingDomain domain, final Collection<EditPart> selectedEditPart, final Map<EditPart, Set<EObject>> availableLinks, final Collection<EObject> initialSelection, final Map<EObject, LinkEndsMapper> linkMapping) {
	//		final ICommand cmd = new AbstractTransactionalCommand(domain, "Open Show/HideDialogCommand", null) {//$NON-NLS-1$
	//
	//			@Override
	//			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	//				final ShowHideRelatedLinkSelectionDialog dialog = new ShowHideRelatedLinkSelectionDialog(Display.getDefault().getActiveShell(), new UMLLabelProvider(), new AbstractShowHideRelatedLinkEditPolicy.LinkContentProvider(availableLinks), availableLinks, linkMapping);
	//				dialog.setTitle("Show/Hide Links");//$NON-NLS-1$
	//				dialog.setMessage("Choose the links to show.");//$NON-NLS-1$
	//				dialog.setInput(selectedEditPart);
	//				dialog.setInitialSelection(initialSelection);
	//				dialog.setExpandedElements(selectedEditPart.toArray());
	//				dialog.setContainerMode(true);
	//				int status = dialog.open();
	//				if(status == Window.CANCEL) {
	//					return CommandResult.newCancelledCommandResult();
	//				}
	//				return CommandResult.newOKCommandResult(Arrays.asList(dialog.getResult()));
	//			}
	//		};
	//
	//		return cmd;
	//	}


	/**
	 * This Class store the stereotypes to be reapplied.
	 */
	protected class StereotypeClipboard implements IClipboardAdditionalData {

		/** The stereotype applications. */
		protected Collection<EObject> stereotypeApplications;
		
		public StereotypeClipboard(Collection<EObject> stereotypeApplications) {
			this.stereotypeApplications = stereotypeApplications;
		}		

		public Collection<EObject> getstereotypeApplications() {
			return stereotypeApplications;
		}
		
	}

}
