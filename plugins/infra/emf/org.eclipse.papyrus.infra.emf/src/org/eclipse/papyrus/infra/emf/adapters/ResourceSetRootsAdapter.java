/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 451338
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.adapters;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * An EMF Adapter which listens on Resource Set root elements. For resource sets managed by {@link TransactionalEditingDomain}s,
 * consider using the {@link Transactional} subclass.
 *
 * @author Camille Letavernier
 *
 */
public abstract class ResourceSetRootsAdapter extends EContentAdapter {

	@Override
	public void notifyChanged(Notification msg) {
		switch (msg.getEventType()) {
		case Notification.ADD:
		case Notification.ADD_MANY:
		case Notification.REMOVE:
		case Notification.REMOVE_MANY:
		case Notification.UNSET:
			doNotify(msg);
			break;
		}

		super.notifyChanged(msg);
	}

	@Override
	protected void setTarget(ResourceSet target) {
		if (target instanceof ResourceSet) {
			ResourceSet resourceSet = target;
			if (!resourceSet.eAdapters().contains(this)) {
				addAdapter(resourceSet);
			}
		}
		super.setTarget(target);
	}

	@Override
	protected void setTarget(Resource target) {
		// Ignore
	}

	@Override
	protected void setTarget(EObject target) {
		// Ignore
	}

	@Override
	protected void unsetTarget(EObject target) {
		// Ignore
	}

	@Override
	protected void unsetTarget(Resource target) {
		// Ignore
	}

	@Override
	protected void addAdapter(Notifier notifier) {
		super.addAdapter(notifier);
	}

	@Override
	protected void removeAdapter(Notifier notifier) {
		super.removeAdapter(notifier);
	}

	@Override
	protected void unsetTarget(ResourceSet target) {
		if (target != null) {
			removeAdapter(target);
		}
		super.unsetTarget(target);
	}

	@Override
	protected void handleContainment(Notification notification) {
		if (notification.getEventType() == Notification.ADD || notification.getEventType() == Notification.ADD_MANY) {
			// Do not propagate listeners to EObjects. We're only interested on events on the ResourceSet (Add/remove resources) and Resources (Add/remove EObjects)
			if (notification.getNotifier() == getTarget()) {
				super.handleContainment(notification);
			}
		} else {
			super.handleContainment(notification);
		}
	}

	protected abstract void doNotify(Notification msg);

	//
	// Nested types
	//

	/**
	 * A variant of the {@link ResourceSetRootsAdapter} that is attached to a {@link TransactionalEditingDomain} to process batched notifications.
	 */
	public static abstract class Transactional extends ResourceSetRootsAdapter implements ResourceSetListener {
		private final boolean isPrecommit;

		private final NotificationFilter filter = NotificationFilter.NOT_TOUCH.and(createFilter());

		/**
		 * Initializes me as a post-commit resource-set roots notification handler.
		 */
		public Transactional() {
			this(false);
		}

		/**
		 * Initializes me as a pre- or post-commit resource-set roots notification handler.
		 * 
		 * @param isPrecommit
		 *            {@code true} to react to pre-commit notifications; {@code false} to react to post-commit notifications
		 */
		public Transactional(boolean isPrecommit) {
			this.isPrecommit = isPrecommit;
		}

		public boolean isAggregatePrecommitListener() {
			return false;
		}

		public boolean isPrecommitOnly() {
			return isPrecommit;
		}

		public boolean isPostcommitOnly() {
			return !isPrecommit;
		}

		/**
		 * Subclasses may override/extend this method to create custom filters, perhaps based on the default filter create by the superclass.
		 * <b>Note</b> that this method is invoked by the superclass constructor, so subclasses must not attempt to access their own state.
		 * 
		 * @return my notification filter
		 */
		protected NotificationFilter createFilter() {
			return NotificationFilter.createFeatureFilter(ResourceSet.class, ResourceSet.RESOURCE_SET__RESOURCES).or(
					NotificationFilter.createFeatureFilter(Resource.class, Resource.RESOURCE__CONTENTS));
		}

		public NotificationFilter getFilter() {
			return filter;
		}

		public void resourceSetChanged(ResourceSetChangeEvent event) {
			handleResourceSetChangeEvent(event);
		}

		public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
			handleResourceSetChangeEvent(event);
			return null;
		}

		/**
		 * Subclasses may override this to handle notifications as a group.
		 * 
		 * @param event
		 *            the resource-set changed event carrying notifications to process
		 * 
		 * @see #doNotify(Notification)
		 */
		protected void handleResourceSetChangeEvent(ResourceSetChangeEvent event) {
			for (Notification next : event.getNotifications()) {
				doNotify(next);
			}
		}

		/**
		 * Subclasses may override this to handle notifications individually.
		 * 
		 * @param msg
		 *            a notification from the group sent by the commit of a transaction
		 * 
		 * @see #handleResourceSetChangeEvent(ResourceSetChangeEvent)
		 */
		@Override
		protected void doNotify(Notification msg) {
			// Pass
		}

		@Override
		public final void setTarget(Notifier newTarget) {
			// Don't attach me to anything. I am fed directly by the editing domain
		}

		@Override
		public final void unsetTarget(Notifier oldTarget) {
			// Pass
		}

		@Override
		protected final void addAdapter(Notifier notifier) {
			// Don't attach me to anything. I am fed directly by the editing domain
		}

		@Override
		protected final void removeAdapter(Notifier notifier) {
			// Pass
		}
	}

}
