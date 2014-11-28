/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.properties.constraints;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.constraints.constraints.AbstractConstraint;
import org.eclipse.papyrus.infra.constraints.constraints.Constraint;
import org.eclipse.papyrus.infra.core.resource.IEMFModel;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;

/**
 * Constraint for Imported Package in the Model.
 * 
 * @author Gabriel Pascual
 *
 */
public class IsImportedPackage extends AbstractConstraint {

	/**
	 * Constructor.
	 *
	 */
	public IsImportedPackage() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.infra.constraints.constraints.AbstractConstraint#equivalent(org.eclipse.papyrus.infra.constraints.constraints.Constraint)
	 *
	 * @param constraint
	 * @return
	 */
	@Override
	protected boolean equivalent(Constraint constraint) {
		boolean isEquivalent = false;
		if (this == constraint) {
			isEquivalent = true;
		} else if (constraint instanceof IsImportedPackage) {
			isEquivalent = true;
		}
		return isEquivalent;
	}

	/**
	 * @see org.eclipse.papyrus.infra.constraints.constraints.AbstractConstraint#match(java.lang.Object)
	 *
	 * @param selection
	 * @return
	 */
	@Override
	protected boolean match(Object selection) {
		boolean isImportedPackage = false;

		EObject selectedElement = EMFHelper.getEObject(selection);
		EObject rootContainer = null;
		try {
			ModelSet modelSet = ServiceUtilsForEObject.getInstance().getModelSet(selectedElement);
			IModel model = modelSet.getModelFor(selectedElement);
			if (model instanceof IEMFModel) {
				Resource resource = ((IEMFModel) model).getResource();
				rootContainer = resource.getContents().get(0);
			}
		} catch (ServiceException e) {

		}
		if (rootContainer instanceof Namespace) {
			if (selectedElement instanceof Package) {
				isImportedPackage = ((Namespace) rootContainer).getPackageImport((Package) selectedElement) != null;
			}
		}
		return isImportedPackage;
	}
}
