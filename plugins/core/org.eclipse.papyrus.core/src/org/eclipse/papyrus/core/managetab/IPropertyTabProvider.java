/*****************************************************************************
 * Copyright (c) 2013 ATOS.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  EL AYADI Abdellah <abdellah.elayadi@atos.net> - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.managetab;

import org.eclipse.papyrus.core.editor.IMultiDiagramEditor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public interface IPropertyTabProvider {
	
	/**
	 * Return true if this shall provide return a {@link IPropertySheetPage}
	 * @param input Use this to determine if this provider shall provide something or not
	 * @return
	 */
	public boolean provider(IMultiDiagramEditor input);
	
	/**
	 * Return the {@link IPropertySheetPage} of this provider
	 * @param in
	 * @return
	 */
	public IPropertySheetPage getProvider(ITabbedPropertySheetPageContributor in);

}
