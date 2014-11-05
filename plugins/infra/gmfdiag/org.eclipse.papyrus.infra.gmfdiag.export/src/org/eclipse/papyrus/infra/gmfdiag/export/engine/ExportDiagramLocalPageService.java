/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.fr - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.export.engine;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.service.AbstractLocalPageService;

/**
 * Definition of local page for Export All Diagrams feture.
 * 
 * @author Gabriel Pascual
 *
 */
public class ExportDiagramLocalPageService extends AbstractLocalPageService {

	/**
	 * Constructor.
	 *
	 * @param rootElement
	 */
	public ExportDiagramLocalPageService(Object rootElement) {
		super(rootElement);
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.service.ILocalPageService#isLocalPage(java.lang.Object)
	 *
	 * @param content
	 * @return
	 */
	@Override
	public boolean isLocalPage(Object content) {

		boolean localPage = false;

		// Page must be a diagram
		if (content instanceof Diagram) {

			EObject semanticElement = ((Diagram) content).getElement();
			EObject semanticContainer = EcoreUtil.getRootContainer(semanticElement);

			// Diagram must have same root
			return rootElement.equals(semanticContainer);
		}

		return localPage;


	}
}
