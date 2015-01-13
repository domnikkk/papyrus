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

package org.eclipse.papyrus.infra.nattable.listener;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.manager.axis.CompositeAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;


/**
 * @author VL222926
 *
 *         This listener is used to notify {@link CompositeAxisManagerForEventList} when an event comes
 *
 */
public class UpdateTableContentListener implements ResourceSetListener {

	/**
	 * the current table for which we want notify its axis manager
	 */
	protected NattableModelManager tableManager;

	/**
	 * the axis manager to notify
	 */
	protected IAxisManagerForEventList axisManager;

	/**
	 * Constructor.
	 *
	 */
	public UpdateTableContentListener(final NattableModelManager tableManager, final IAxisManagerForEventList axisManager) {
		this.tableManager = tableManager;
		this.axisManager = axisManager;
	}


	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#getFilter()
	 *
	 * @return
	 */
	@Override
	public NotificationFilter getFilter() {
		return new NotificationFilter.Custom() {

			@Override
			public boolean matches(Notification notification) {
				if (notification.isTouch() || notification.getNotifier() == null || notification.getFeature() == null) {
					return false;
				}
				Object notifier = notification.getNotifier();
				if (notifier instanceof EObject) {
					if (EcoreUtil.getRootContainer(((EObject) notifier).eClass()) == NattablePackage.eINSTANCE) {
						// we must verify than the notification concern the current managed table
						try {
							if (TableHelper.findTable((EObject) notifier) != tableManager.getTable()) {
								return false;
							}
						} catch (Exception e) {
							Activator.log.error(e);
						}
					}
				}

				return true;
			}
		};
	}


	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#transactionAboutToCommit(org.eclipse.emf.transaction.ResourceSetChangeEvent)
	 *
	 * @param event
	 * @return
	 * @throws RollbackException
	 */
	@Override
	public final Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		// nothing to do
		return null;
	}


	/**
	 * @return <code>true</code> if there are changes on TreeFillingConfiguration
	 */
	protected boolean containsTreeFillingConfigurationChange(ResourceSetChangeEvent event) {
		List<Notification> notifications = event.getNotifications();
		for (Notification current : notifications) {
			Object feature = current.getFeature();
			if (feature == NattableaxisconfigurationPackage.eINSTANCE.getAbstractHeaderAxisConfiguration_OwnedAxisConfigurations()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#resourceSetChanged(org.eclipse.emf.transaction.ResourceSetChangeEvent)
	 *
	 * @param event
	 */
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		if (containsTreeFillingConfigurationChange(event)) {
			this.axisManager.fillingConfigurationsHaveChanged();
			return;
		}
		List<Notification> notifications = event.getNotifications();
		for (int i = 0; i < notifications.size(); i++) {
			Notification current = notifications.get(i);

			// we need to verify that a remove_many is not followed by an add_many. in this case it is probably a move inside a list
			boolean isAMove = false;

			// filtering notification concerning creation of ITreeItemAxis created as children
			if (current.getEventType() == Notification.ADD) {
				if (current.getFeature() == NattableaxisPackage.eINSTANCE.getITreeItemAxis_Children()) {
					if (current.getNotifier() instanceof ITreeItemAxis && (((EObject) current.getNotifier()).eContainer() == null || (((EObject) current.getNotifier()).eContainer()) instanceof AbstractAxisProvider)) {
						continue;
					}
				}
			}
			if (i + 1 < notifications.size()) {
				Notification next = notifications.get(i + 1);
				int currentEvent = current.getEventType();
				int nextEventType = next.getEventType();
				if (currentEvent == Notification.REMOVE_MANY && nextEventType == Notification.ADD_MANY && current.getNotifier() == next.getNotifier() && current.getFeature() == next.getFeature()) {
					Collection<?> oldValue = (Collection<?>) current.getOldValue();
					Collection<?> newValue = (Collection<?>) next.getNewValue();
					if (oldValue.size() == newValue.size()) {
						for (Object object : newValue) {
							if (!oldValue.contains(object)) {
								isAMove = true;
							}
						}
					}
				}
			}
			// }
			if (isAMove) {
				// do nothing
				if (i + 2 < notifications.size()) {
					i = i + 1;
				}
				// TODO : we need to refresh the structure of the table
			} else {
				if (this.axisManager != null) {
					this.axisManager.manageEvent(current);
				}
			}

		}
		tableManager.refreshNatTable();

	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#isAggregatePrecommitListener()
	 *
	 * @return
	 */
	@Override
	public final boolean isAggregatePrecommitListener() {
		// nothing to do
		return false;
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#isPrecommitOnly()
	 *
	 * @return
	 */
	@Override
	public final boolean isPrecommitOnly() {
		// nothing to do
		return false;
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#isPostcommitOnly()
	 *
	 * @return
	 */
	@Override
	public final boolean isPostcommitOnly() {
		// nothing to do
		return false;
	}
}
