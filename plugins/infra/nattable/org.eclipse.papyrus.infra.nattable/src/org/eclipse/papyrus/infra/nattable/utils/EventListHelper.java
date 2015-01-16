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

package org.eclipse.papyrus.infra.nattable.utils;

import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;

import ca.odell.glazedlists.EventList;

/**
 * @author VL222926
 *         This class provides methods to manipulate properly EventList calling appropriate lock and unlock methods
 */
public class EventListHelper {

	private EventListHelper() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param list
	 *            an event list to edit
	 * @param object
	 *            an object to add to the event list
	 */
	public static final void addToEventList(final EventList<Object> list, final Object object) {
		list.getReadWriteLock().readLock().lock();
		try {
			if (list.contains(object)) {
				return;
			}
		} catch (Exception e1) {
			Activator.log.error(e1);
		} finally {
			list.getReadWriteLock().readLock().unlock();
		}
		int parentIndex = -1;
		// 1. get the index to add the element
		if (object instanceof ITreeItemAxis) {
			IAxis parent = ((ITreeItemAxis) object).getParent();
			if (parent != null) {
				try {
					list.getReadWriteLock().readLock().lock();
					parentIndex = list.indexOf(parent);
				} catch (Exception e) {
					Activator.log.error(e);
				} finally {
					list.getReadWriteLock().readLock().unlock();
				}
			}
		}


		list.getReadWriteLock().writeLock().lock();
		try {
			if (parentIndex != -1) {
				list.add(parentIndex + 1, object);
			} else {
				list.add(object);
			}
		} catch (Exception e) {
			Activator.log.error(e);
		} finally {
			list.getReadWriteLock().writeLock().unlock();
		}
	}

	/**
	 *
	 * @param list
	 *            an event list to edit
	 * @param object
	 *            an object to remove from the list
	 */
	public static final void removeFromEventList(final EventList<Object> list, final Object object) {
		list.getReadWriteLock().readLock().lock();
		try {
			if (!list.contains(object)) {
				return;
			}
		} catch (Exception e1) {
			Activator.log.error(e1);
		} finally {
			list.getReadWriteLock().readLock().unlock();
		}

		list.getReadWriteLock().writeLock().lock();
		try {

			if (object instanceof ITreeItemAxis) {
				list.remove(object);
			} else {
				list.remove(object);
			}
		} catch (Exception e) {
			Activator.log.error(e);
		} finally {
			list.getReadWriteLock().writeLock().unlock();
		}
	}
}
