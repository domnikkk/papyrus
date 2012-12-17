/*****************************************************************************
 * Copyright (c) 2012 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.readonly;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.resource.IReadOnlyManager;

@SuppressWarnings("rawtypes")
public class ReadOnlyAdapterFactory implements IAdapterFactory {

	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if(IReadOnlyManager.class == adapterType && adaptableObject instanceof PapyrusROTransactionalEditingDomain) {
			return new IReadOnlyManager() {

				public boolean isReadOnly(IFile[] files, EditingDomain editingDomain) {
					return ReadOnlyManager.isReadOnly(files, editingDomain);
				}

				public boolean enableWrite(IFile[] files, EditingDomain editingDomain) {
					return ReadOnlyManager.enableWrite(files, editingDomain);
				}
			};
		}
		return null;
	}

	public Class[] getAdapterList() {
		return new Class[]{ EditingDomain.class };
	}
}
