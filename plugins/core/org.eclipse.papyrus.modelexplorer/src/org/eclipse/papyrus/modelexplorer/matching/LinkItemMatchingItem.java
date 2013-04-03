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
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *  Philippe Roland (Atos) philippe.roland@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer.matching;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.LinkItem;

/***
 * An IMatchingItem implementation that matches for LinkItems
 * 
 * @author proland
 */
public class LinkItemMatchingItem implements IMatchingItem {

	private EObject parent;

	private EReference ref = null;

	private String refName = null;

	public LinkItemMatchingItem(EObject parent, String refName) {
		this.parent = parent;
		this.refName = refName;
	}

	public LinkItemMatchingItem(EObject parent, EReference ref) {
		this.parent = parent;
		this.ref = ref;
	}

	public boolean matchingItemEquals(Object obj) {
		if(obj instanceof LinkItem) {
			if(ref != null && parent != null) {
				return parent.equals(((LinkItem)obj).getParent()) && (compareRef(obj) || compareRefName(obj));
			}
		}
		return super.equals(obj);
	}

	protected boolean compareRefName(Object obj) {
		return refName != null && refName.equals(((LinkItem)obj).getReference().getName());
	}

	protected boolean compareRef(Object obj) {
		return ref != null && ref.equals(((LinkItem)obj).getReference());
	}

	public int matchingItemHashcode() {
		if(ref != null && parent != null) {
			final int hashPrime1 = 47;
			final int hashPrime2 = 13;
			return ref.hashCode() * hashPrime1 + parent.hashCode() + hashPrime2;
		}
		return 0;
	}
}
