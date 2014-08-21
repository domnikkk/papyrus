/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.cdo.core.resource;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.resource.ProxyModificationTrackingAdapter;


/**
 * A specialization of the {@link ProxyModificationTrackingAdapter} that knows how to deal with
 * CDO resources. In particular, that their dirty/save semantics is completely different from
 * that of workspace resources.
 */
public class CDOAwareProxyModificationTrackingAdapter extends ProxyModificationTrackingAdapter {

	public CDOAwareProxyModificationTrackingAdapter() {
		super();
	}

	@Override
	public boolean shouldSave(Resource resource) {
		boolean result;

		if (resource instanceof CDOResource) {
			CDOView view = ((CDOResource) resource).cdoView();
			if (view instanceof CDOTransaction) {
				// Saving CDO resources is done by committing the transaction
				result = ((CDOTransaction) view).isDirty();
			} else {
				// If there's no view or it's not a transaction, then saving is a non-starter
				result = false;
			}
		} else {
			result = super.shouldSave(resource);
		}

		return result;
	}

	@Override
	public void notifyChanged(Notification msg) {
		Object notifier = msg.getNotifier();

		// Only for non-CDO resources do we care if the URI has changed or contents been added, because
		// references within the repository use OIDs and are, therefore, not susceptible to URI changes
		if (!(notifier instanceof CDOResource)) {
			super.notifyChanged(msg);
		}
	}

}
