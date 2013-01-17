/*******************************************************************************
 * Copyright (c) 2008 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *     modified by CEA-LIST
 *******************************************************************************/
package org.eclipse.papyrus.diagram.common.listeners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;

import com.google.common.collect.Lists;

/**
 * This class is used to handle drop event on diagram
 * 
 */
public abstract class DropTargetListener extends DiagramDropTargetListener {

	public static final String EVENT_DETAIL = "EVENT_DETAIL";
	
	public DropTargetListener(EditPartViewer viewer, Transfer xfer) {
		super(viewer, xfer);
	}


	@SuppressWarnings("unchecked")
	@Override
	protected Request createTargetRequest() {
		Request r = super.createTargetRequest();
		if (getCurrentEvent() != null) {
			r.getExtendedData().put(EVENT_DETAIL, getCurrentEvent().detail);
		}
		return r;
	}

	protected abstract Object getJavaObject(TransferData data);

	@Override
	protected List<Object> getObjectsBeingDropped() {
		// get objects from transfer
		TransferData data = getCurrentEvent().currentDataType;
		ArrayList<Object> objs = Lists.newArrayList(); // Array list to keep the
													// order of the selection

		Object transferedObject = getJavaObject(data);
		if(transferedObject instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection)transferedObject;
			for(Iterator<?> it = selection.iterator(); it.hasNext();) {
				Object nextSelectedObject = it.next();
				EObject eObj = null;
				if(nextSelectedObject instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable)nextSelectedObject;
					eObj = (EObject)adaptable.getAdapter(EObject.class);
				}
				if(eObj != null) {
					// retrieve the corresponding eobject using the resource set of the diagram and its uri
					Resource res = eObj.eResource();
					URI objUri = res.getURI().appendFragment(res.getURIFragment(eObj));
					EObject outputEObj = getTransactionalEditingDomain().getResourceSet().getEObject((URI)objUri, true);
					if (outputEObj != null) {
						objs.add(outputEObj);
					}
				} else {
					objs.add(nextSelectedObject);
				}
			}
		}

		return objs;
	}

	protected abstract TransactionalEditingDomain getTransactionalEditingDomain();

}
