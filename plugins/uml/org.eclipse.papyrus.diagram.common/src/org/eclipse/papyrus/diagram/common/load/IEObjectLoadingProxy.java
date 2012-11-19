/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Matthieu Boivineau (Atos) - Initial API and implementation 
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.load;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface IEObjectLoadingProxy {

	public List<EObject> getProxyEObjects(EObject obj);

}
