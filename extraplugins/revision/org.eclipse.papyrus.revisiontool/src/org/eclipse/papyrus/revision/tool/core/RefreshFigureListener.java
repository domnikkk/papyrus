/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.core;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.papyrus.revision.tool.ui.RevisonDiagLayer;

/**
 * This listener is used to refresh figures when the revision mode has been used.
 *
 */
public class RefreshFigureListener implements ResourceSetListener {
	protected ReviewResourceManager reviewResourceManager;
	protected RevisonDiagLayer diagLayer=new RevisonDiagLayer();

	/**
	 * constructor
	 * @param reviewResourceManager
	 */
	public RefreshFigureListener(ReviewResourceManager reviewResourceManager) {
		this.reviewResourceManager=reviewResourceManager;
	}

	@Override
	public NotificationFilter getFilter() {
		return null;
	}


	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event)
			throws RollbackException {
		return null;
	}



	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		diagLayer.run(reviewResourceManager);

	}


	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}


	@Override
	public boolean isPrecommitOnly() {
		return false;
	}


	@Override
	public boolean isPostcommitOnly() {
		return false;
	}

}
