/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.manager.axis;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import ca.odell.glazedlists.EventList;

/**
 * @author VL222926
 *
 */
public abstract class AbstractAxisManagerForEventList extends AbstractAxisManager implements IAxisManagerForEventList {

	/**
	 * the event list used for the managed axis
	 */
	protected EventList<Object> eventList;

	/** the message displayed by an exception when we call an inherited method from IAxisManager, forbidden for IAxisManagerForEventList */
	protected static final String EXCEPTION_MESSAGE = "This method cant be call for IAxisManagerForEventList";////$NON-NLS-1$

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList#setEventList(ca.odell.glazedlists.EventList)
	 *
	 * @param list
	 */
	@Override
	public final void setEventList(EventList<Object> list) {
		this.eventList = list;
	}


	/**
	 * @param notification
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList#manageEvent(Notification)
	 */
	@Override
	public void manageEvent(Notification notification) {
		if (ignoreEvent(notification)) {
			return;
		}
		final int eventType = notification.getEventType();
		switch (eventType) {
		case Notification.SET:
			manageSetNotification(notification);
			break;
		case Notification.UNSET:
			manageUnsetNotification(notification);
			break;
		case Notification.ADD:
			manageAddNotification(notification);
			break;
		case Notification.ADD_MANY:
			manageAddManyNotification(notification);
			break;
		case Notification.MOVE:
			manageMoveNotification(notification);
			break;
		case Notification.REMOVE:
			manageRemoveNotification(notification);
			break;
		case Notification.REMOVE_MANY:
			manageRemoveManyNotification(notification);
			break;
		default:
			return;
		}
	}

	/**
	 *
	 * @param notification
	 *            a notification
	 * @return
	 *         <code>true</code> if the notification must be ignored
	 */
	protected boolean ignoreEvent(final Notification notification) {
		if (notification.isTouch()) {
			return true;
		}
		return false;
	}

	/**
	 * @param notification
	 */
	protected abstract void manageRemoveManyNotification(Notification notification);

	/**
	 * @param notification
	 */
	protected abstract void manageRemoveNotification(Notification notification);

	/**
	 * @param notification
	 */
	protected abstract void manageMoveNotification(Notification notification);

	/**
	 * @param notification
	 */
	protected abstract void manageAddManyNotification(Notification notification);

	/**
	 * @param notification
	 */
	protected abstract void manageAddNotification(Notification notification);

	/**
	 *
	 * @param notification
	 */
	protected abstract void manageSetNotification(Notification notification);

	/**
	 *
	 * @param notification
	 */
	protected abstract void manageUnsetNotification(Notification notification);

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canEditAxisHeader()
	 *
	 * @return
	 */
	@Override
	public boolean canEditAxisHeader() {
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#createManagedObjectList()
	 *
	 * @return
	 */
	@Override
	protected final List<Object> createManagedObjectList() {
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#addListeners()
	 *
	 */
	@Override
	protected void addListeners() {
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#axisManagerHasChanged(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	protected final void axisManagerHasChanged(Notification notification) {
		throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#initializeManagedObjectList()
	 *
	 */
	@Override
	protected void initializeManagedObjectList() {
		throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#dispose()
	 *
	 */
	@Override
	public void dispose() {
		super.dispose();
		this.eventList = null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#isAlreadyManaged(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public boolean isAlreadyManaged(Object object) {
		return this.eventList.contains(object);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getAllManagedAxis()
	 *
	 * @return
	 */
	@Override
	public final List<Object> getAllManagedAxis() {
		throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getElements(java.util.List)
	 *
	 * @param axisPositions
	 * @return
	 */
	@Override
	protected final List<Object> getElements(List<Integer> axisPositions) {
		throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
	}

}
