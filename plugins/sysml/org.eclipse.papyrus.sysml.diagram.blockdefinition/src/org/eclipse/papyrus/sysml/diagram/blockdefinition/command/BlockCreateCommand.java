/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.diagram.clazz.edit.commands.ClassCreateCommand;
import org.eclipse.papyrus.diagram.common.helper.NamedElementHelper;
import org.eclipse.papyrus.sysml.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This create command would probably not be necessary when using the
 * extensible element type framework in a consistent manner (use of a HelperAdvice).
 * 
 * The HelperAdvice have been removed since it does not work 
 * except for ConfigureRequest.
 * 
 * Here Block specialize Class, when creating a Block in the Diagram (or Package),
 * the container returns this command instead of delegating to the ClassHelper.
 * 
 */
public class BlockCreateCommand extends ClassCreateCommand {

	public BlockCreateCommand(CreateElementRequest req) {
		super(req);
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		CommandResult result = super.doExecuteWithResult(monitor, info);
		Object returnValue = result.getReturnValue();

		if (returnValue instanceof org.eclipse.uml2.uml.Class) {
			Class createdClass = (org.eclipse.uml2.uml.Class)returnValue;

			// Set the element name
			String newElementName = NamedElementHelper.EINSTANCE.getNewUMLElementName(createdClass.getOwner(), BlocksPackage.eINSTANCE.getBlock());
			createdClass.setName(newElementName);

			// Apply stereotype
			// TODO if stereotype is not available warn the user
			Stereotype st = createdClass.getApplicableStereotype(SysmlResource.BLOCK_ID);
			createdClass.applyStereotype(st);
		}
		return result;
	}

}
