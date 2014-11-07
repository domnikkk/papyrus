/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *      Christian W. Damus (CEA) - bug 413703
 *      Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.fr - Bug 436954
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer.newchild;


import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.newchild.CreationMenuFactory;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.Folder;
import org.eclipse.swt.widgets.Menu;

/**
 * This class has in charge to create menu from elementCreationMenuModel
 *
 */
public class DynamicNewChild extends org.eclipse.papyrus.infra.newchild.ui.DynamicNewChild {

	/**
	 *
	 * Constructor.
	 *
	 */
	public DynamicNewChild() {
		super();
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param id
	 */
	public DynamicNewChild(String id) {
		super(id);
	}

	@Override
	public void fill(Menu menu, int index) {
		EObject eObject = getSelection();
		if (eObject != null) {
			CreationMenuFactory creationMenuFactory = new ModelExplorerMenuFactory(editingDomain);
			ArrayList<Folder> folders = creationMenuRegistry.getRootFolder();
			Iterator<Folder> iterFolder = folders.iterator();
			while (iterFolder.hasNext()) {
				Folder currentFolder = iterFolder.next();
				boolean hasbeenBuild = creationMenuFactory.populateMenu(menu, currentFolder, eObject, index);
				if (hasbeenBuild) {
					index++;
				}
			}
		} else {
			super.fill(menu, index);
		}
	}

}
