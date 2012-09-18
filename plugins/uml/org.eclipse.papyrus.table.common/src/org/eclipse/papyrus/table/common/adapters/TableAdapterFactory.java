/*****************************************************************************
 * Copyright (c) 2011 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Tristan FAURE - tristan.faure@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.table.common.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.facet.widgets.nattable.instance.tableinstance2.TableInstance2;
import org.eclipse.papyrus.sasheditor.contentprovider.di.IOpenable;
import org.eclipse.papyrus.sasheditor.contentprovider.di.IOpenableWithContainer;
import org.eclipse.papyrus.table.instance.papyrustableinstance.PapyrusTableInstance;


public class TableAdapterFactory implements IAdapterFactory {

	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if(adapterType == IOpenable.class) {
			if (adaptableObject instanceof TableInstance2) {
				return new TableOpenable((TableInstance2)adaptableObject);
			}
			if (adaptableObject instanceof PapyrusTableInstance) {
				PapyrusTableInstance papyrusTableInstance = (PapyrusTableInstance)adaptableObject;
				if (papyrusTableInstance.getTable() != null) {
					return new IOpenableWithContainer.Openable(papyrusTableInstance, papyrusTableInstance.getTable().getContext());
				}
			}
		}
		return null;
	}

	public Class[] getAdapterList() {
		return new Class[]{IOpenable.class};
	}

}
