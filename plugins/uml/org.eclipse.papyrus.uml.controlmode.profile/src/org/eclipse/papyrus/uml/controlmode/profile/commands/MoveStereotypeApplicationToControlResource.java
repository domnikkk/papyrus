/*****************************************************************************
 * Copyright (c) 2013, 2014 Atos, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.controlmode.profile.commands;

import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.commands.AbstractControlCommand;
import org.eclipse.papyrus.uml.controlmode.profile.helpers.ProfileApplicationHelper;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.uml.Element;

import com.google.common.collect.Sets;

/**
 * Command to move stereotype application to new resource when controling or uncontroling elements
 *
 * @author adaussy
 *
 */
public final class MoveStereotypeApplicationToControlResource extends AbstractControlCommand {


	@SuppressWarnings("rawtypes")
	public MoveStereotypeApplicationToControlResource(List affectedFiles, ControlModeRequest request) {
		super("Move stereotype application", affectedFiles, request);
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		Element elem = (Element) getRequest().getTargetObject();
		Set<Element> elements = Sets.newHashSet(elem);
		TreeIterator<Object> contents = EcoreUtil.getAllProperContents(elem, true);
		while (contents.hasNext()) {
			EObject eObject = (EObject) contents.next();
			if (eObject instanceof Element) {
				elements.add((Element) eObject);
			}
		}

		Resource sourceResource = elem.eContainer().eResource();
		Resource targetResource = getRequest().getTargetResource(UmlModel.UML_FILE_EXTENSION);
		if (targetResource == null) {
			return createNewControlCommandError("No uml resource created");//
		}
		for (Element e : elements) {
			ProfileApplicationHelper.relocateStereotypeApplications(e, sourceResource, targetResource);
		}
		return CommandResult.newOKCommandResult();

	}
}