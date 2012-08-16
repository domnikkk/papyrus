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

import org.eclipse.emf.facet.infra.browser.uicore.internal.AppearanceConfiguration;


public class PapyrusAppearanceConfiguration extends AppearanceConfiguration {
	
	public PapyrusAppearanceConfiguration() {
		super(new PapyrusItemsFactory());
	}
}
