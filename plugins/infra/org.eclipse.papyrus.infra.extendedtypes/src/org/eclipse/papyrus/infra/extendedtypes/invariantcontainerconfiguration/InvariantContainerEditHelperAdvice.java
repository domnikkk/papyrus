/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.extendedtypes.invariantcontainerconfiguration;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.extendedtypes.Activator;
import org.eclipse.papyrus.infra.extendedtypes.invariantsemantictypeconfiguration.IInvariantEditHelperAdvice;
import org.eclipse.papyrus.infra.services.edit.internal.context.TypeContext;

/**
 * Edit Helper advice configured by the {@link InvariantHierarchyConfiguration}
 */
public class InvariantContainerEditHelperAdvice extends AbstractEditHelperAdvice implements IInvariantEditHelperAdvice<InvariantContainerConfiguration> {

	protected List<HierarchyPermission> permissions;

	protected IClientContext sharedContext;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		if (request instanceof SetRequest) {
			SetRequest setRequest = ((SetRequest) request);
			EStructuralFeature structuralFeature = setRequest.getFeature();
			if (structuralFeature instanceof EReference) {
				EReference reference = ((EReference) structuralFeature);
				if (reference.isContainment() && setRequest.getValue() != null) {
					// check new value
					return canContain(setRequest);
				}
			}
		} /*else if (request instanceof CreateElementRequest) {
			CreateElementRequest createElementRequest = ((CreateElementRequest) request);
			IElementType containerType = ElementTypeRegistry.getInstance().getElementType(createElementRequest.getContainer(), createElementRequest.getClientContext());
			boolean approvedRequest = InvariantContainerUtils.isContainerValid(containerType, false, permissions);
			return approvedRequest;
		}*/
		return super.approveRequest(request);
	}

	protected boolean canContain(SetRequest request) {
		IElementType[] containerTypes = ElementTypeRegistry.getInstance().getAllTypesMatching(request.getElementToEdit(), request.getClientContext());
		return InvariantContainerUtils.isContainerValid(containerTypes, false, permissions);
	}


	/**
	 * {@inheritDoc}
	 */
	public void init(InvariantContainerConfiguration configuration) {
		try {
			sharedContext = TypeContext.getContext();
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
		permissions = configuration.getPermissions();
	}
}
