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
package org.eclipse.papyrus.req.reqif.integration.transformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.req.reqif.integration.assistant.ChooseReqIFTypeDialog;
import org.eclipse.papyrus.req.reqif.integration.command.DefineProfileCommand;
import org.eclipse.papyrus.req.reqif.transformation.ReqIFImporter;
import org.eclipse.papyrus.sysml.service.types.element.SysMLElementTypes;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

/**
 * implementation of a ReqIFImport dependent of Papyrus.
 *
 */

public class ReqIFImporterServiceEdit extends ReqIFImporter {

	
	/**
	 * 
	 * Constructor.
	 *
	 * @param domain the domain to execute command
	 * @param reqIFModel the reqIF model that is imported
	 * @param UMLModel the UML model that contain imported elements
	 */
	public ReqIFImporterServiceEdit(TransactionalEditingDomain domain, ReqIF reqIFModel, Package UMLModel) {
		super(domain, reqIFModel, UMLModel);
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.req.reqif.transformation.ReqIFImporter#createRequirementClass(org.eclipse.uml2.uml.Element)
	 *{@inheritDoc}
	 */
	protected Class createRequirementClass(org.eclipse.uml2.uml.Element owner) {
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(owner);
		if(provider == null) {
			return null;
		}

		ICommand createGMFCommand = provider.getEditCommand(new CreateElementRequest(domain, owner, SysMLElementTypes.REQUIREMENT));
		if(createGMFCommand != null) {
			Command emfCommand = new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(createGMFCommand);
			domain.getCommandStack().execute(emfCommand);
			return (Class)createGMFCommand.getCommandResult().getReturnValue();
		}
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.req.reqif.transformation.ReqIFImporter#createDependency(org.eclipse.uml2.uml.Package)
	 *{@inheritDoc}
	 */
	protected Dependency createDependency(Package uMLModel) {
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(uMLModel);
		if(provider == null) {
			return null;
		}

		ICommand createGMFCommand = provider.getEditCommand(new CreateElementRequest(domain, uMLModel,org.eclipse.papyrus.uml.service.types.element.UMLElementTypes.DEPENDENCY));
		if(createGMFCommand != null) {

			Command emfCommand = new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(createGMFCommand);
			domain.getCommandStack().execute(emfCommand);
			return (Dependency)createGMFCommand.getCommandResult().getReturnValue();
		}
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.req.reqif.transformation.ReqIFImporter#selectReqIFType(java.util.Collection)
	 *{@inheritDoc}
	 * 
	 */
	protected HashMap<String, SpecType> selectReqIFType(Collection<SpecType> availableReqiFTypes) {
		HashMap<String, SpecType> selectedReqiFType= new HashMap<String, SpecType>();
		ChooseReqIFTypeDialog assistedDialog= new ChooseReqIFTypeDialog(new Shell(), availableReqiFTypes);
		assistedDialog.open();
		ArrayList<Object> result=assistedDialog.getSelectedElements();
		for(Object object : result) {
			if(object instanceof SpecType){
				selectedReqiFType.put(((SpecType)object).getLongName(), ((SpecType)object));
			}
		}
		return selectedReqiFType;

	}

	/**
	 * 
	 * @see org.eclipse.papyrus.req.reqif.transformation.ReqIFImporter#defineProfile(org.eclipse.uml2.uml.Profile)
	 *
	 * {@inheritDoc}
	 */
	protected void defineProfile(Profile profile) {
		try {
			DefineProfileCommand defineProfileCmd= new DefineProfileCommand(domain, new  org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation(new org.eclipse.papyrus.uml.tools.profile.definition.Version(1, 0, 0), "generated by Papyrus Req","", GregorianCalendar.getInstance().getTime().toString(), "Papyrus Req"), profile, true);
			defineProfileCmd.execute(new NullProgressMonitor(), null);
			profile.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
