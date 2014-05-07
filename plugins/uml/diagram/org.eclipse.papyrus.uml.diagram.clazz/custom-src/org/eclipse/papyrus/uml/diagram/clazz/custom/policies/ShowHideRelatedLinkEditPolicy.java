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
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.policies;

import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractUMLShowHideRelatedLinkEditPolicy;

/**
 * Show Hide link editpolicy for Class Diagram
 *
 *
 */
public class ShowHideRelatedLinkEditPolicy extends AbstractUMLShowHideRelatedLinkEditPolicy {

	/**
	 * 
	 * Constructor.
	 *
	 * @param host
	 */
	public ShowHideRelatedLinkEditPolicy() {
		super();
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IDiagramInformationProviderEditPolicy#getDiagramStructure()
	 *
	 * @return
	 */

	@Override
	public DiagramStructure getDiagramStructure() {
		return UMLVisualIDRegistry.TYPED_INSTANCE;
	}
}
