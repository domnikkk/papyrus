/*****************************************************************************
 * Copyright (c) 2012 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.facet.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.ItemsFactory;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.LinkItem;


public class PapyrusItemsFactory extends ItemsFactory {
	
	@Override
	public LinkItem createLinkItem(EObject parent, ITreeElement treeParent, EReference reference, AppearanceConfiguration appearanceConfiguration) {
		return new PapyrusLinkItem(parent, treeParent, reference, appearanceConfiguration);
	}
}
