/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - override the comparer to give priority to IMatchingItem
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Keep a map of EObject-ModelElementItem and refresh the item when receiving an EObject in the refresh
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.jface.viewers.IElementComparer;
import org.eclipse.papyrus.modelexplorer.matching.IMatchingItem;
import org.eclipse.papyrus.modelexplorer.matching.IReferencable;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.ui.internal.navigator.dnd.NavigatorDnDService;
import org.eclipse.ui.navigator.CommonDragAdapter;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonViewer;

/**
 * this class was created in order to access to the drop adapter
 * 
 */
@SuppressWarnings("restriction")
public class CustomCommonViewer extends CommonViewer {

	protected CommonDropAdapter dropAdapter;

	protected Map<EObject, ModelElementItem> objsMap = new WeakHashMap<EObject, ModelElementItem>();

	protected Map<URI, ModelElementItem> unresolvedObjsMap = new HashMap<URI, ModelElementItem>();

	@Override
	protected void associate(Object element, Item item) {
		if (element instanceof ModelElementItem) {
			ModelElementItem modelElem = (ModelElementItem)element;
			EObject eObj = modelElem.getEObject();
			if (eObj != null) {
				if (eObj instanceof BasicEObjectImpl && eObj.eIsProxy()) {
					unresolvedObjsMap.put(((BasicEObjectImpl)eObj).eProxyURI(), modelElem);
				} else {
					objsMap.put(eObj, modelElem);
				}
			}
		}
		super.associate(element, item);
	}

	public CustomCommonViewer(String aViewerId, Composite aParent, int aStyle) {
		super(aViewerId, aParent, aStyle);

		// Use a specific comparer so that the equals of MatchingItem is
		// used in priority
		setComparer(new IElementComparer() {

			public int hashCode(Object element) {
				if(element instanceof IReferencable) {
					IReferencable ref = (IReferencable)element;
					return ref.getElementBehind().hashCode();
				}
				if(element instanceof IMatchingItem) {
					IMatchingItem matchItem = (IMatchingItem)element;
					return matchItem.matchingItemHashcode();
				}
				return element.hashCode();
			}

			public boolean equals(Object a, Object b) {
				if(a instanceof IMatchingItem) {
					return ((IMatchingItem)a).matchingItemEquals(b);
				}

				if(b != null) {
					return b.equals(a);
				}
				return false;
			}
		});
	}

	@Override
	public void update(Object element, String[] properties) {
		if (element != null) {
			super.update(getAssociatedItem(element), properties);
		}
	}

	@Override
	public void refresh(Object element, boolean updateLabels) {
		if (element != null) {
			super.refresh(getAssociatedItem(element), updateLabels);
		}
	}

	protected Object getAssociatedItem(Object obj) {
		if (obj instanceof EObject) {
			EObject eObj = (EObject)obj;
			ModelElementItem associatedItem = objsMap.get(eObj);
			if (associatedItem != null) {
				return associatedItem;
			}
			if (eObj.eResource() != null) {
				URI uri = eObj.eResource().getURI().appendFragment(eObj.eResource().getURIFragment(eObj));
				associatedItem = unresolvedObjsMap.get(uri);
				if (associatedItem != null) {
					unresolvedObjsMap.remove(uri);
					// if it is an unresolved eObj its parent needs to be refreshed
					// because the feature needs to be compute at least one time after the load
					// to link the loaded item with its parent (eContainer is null after a load)
					return associatedItem.getTreeParent();
				}
			}
		}
		return obj;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void initDragAndDrop() {
		dropAdapter = null;
		int operations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;

		CommonDragAdapter dragAdapter = createDragAdapter();
		addDragSupport(operations, dragAdapter.getSupportedDragTransfers(), dragAdapter);
		dropAdapter = createDropAdapter();
		addDropSupport(operations, dropAdapter.getSupportedDropTransfers(), dropAdapter);

		NavigatorDnDService dnd = (NavigatorDnDService)getNavigatorContentService().getDnDService();
		dnd.setDropAdaptor(dropAdapter);
	}

	/**
	 * get the listener in order to parameterize during the runtime the drop
	 * 
	 * @return the dropadapter
	 */
	public CommonDropAdapter getDropAdapter() {
		return dropAdapter;
	}

}
