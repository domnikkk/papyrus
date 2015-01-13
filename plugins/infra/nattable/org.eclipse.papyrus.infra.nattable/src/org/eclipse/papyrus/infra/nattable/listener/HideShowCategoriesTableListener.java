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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;

/**
 * This class listen the changes in the table model which require nattable update
 *
 * @author VL222926
 *
 */
public class HideShowCategoriesTableListener implements ResourceSetListener {

	private INattableModelManager tableManager;

	/**
	 * Constructor.
	 *
	 */
	public HideShowCategoriesTableListener(INattableModelManager tableManager) {
		this.tableManager = tableManager;
	}

	/**
	 *
	 * @param notification
	 *            a notification
	 */
	protected void manageHideShowCategories(Notification notification) {
		int eventType = notification.getEventType();
		Object notifier = notification.getNotifier();
		List<Integer> toShow = null;
		List<Integer> toHide = null;
		if (notifier instanceof Table) {
			if (eventType == Notification.REMOVE) {
				Object oldValue = notification.getOldValue();
				// we are showing categories
				Assert.isTrue(notification.getNewValue() == null);
				toShow = ((IntListValueStyle) oldValue).getIntListValue();
			} else if (eventType == Notification.ADD) {
				Object newValue = notification.getNewValue();
				// we are hiding all categories
				Assert.isTrue(notification.getOldValue() == null);
				toHide = ((IntListValueStyle) newValue).getIntListValue();
			}
		}
		if (notifier instanceof IntListValueStyle) {// && ((IntListValueStyle) notifier).getName().equals(NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH) && feature == NattablestylePackage.eINSTANCE.getIntListValueStyle_IntListValue()) {
			if (Notification.REMOVE == eventType) {
				Object oldValue = notification.getOldValue();
				Assert.isTrue(oldValue instanceof Integer);
				toShow = Collections.singletonList((Integer) oldValue);
			}
			if (Notification.ADD == eventType) {
				Object newValue = notification.getNewValue();
				Assert.isTrue(newValue instanceof Integer);
				toHide = Collections.singletonList((Integer) newValue);
			}
			if (Notification.ADD_MANY == eventType) {
				Object newValue = notification.getNewValue();
				Assert.isTrue(newValue instanceof Collection<?>);
				toHide = new ArrayList<Integer>();
				for (Object tmp : (Collection<?>) newValue) {
					Assert.isTrue(tmp instanceof Integer);
					toHide.add((Integer) tmp);
				}
			}
			if (Notification.REMOVE_MANY == eventType) {
				Object oldValue = notification.getOldValue();
				Assert.isTrue(oldValue instanceof Collection<?>);
				toShow = new ArrayList<Integer>();
				for (Object tmp : (Collection<?>) oldValue) {
					Assert.isTrue(tmp instanceof Integer);
					toShow.add((Integer) tmp);
				}
			}
		}

		if (toShow != null || toHide != null) {
			((ITreeNattableModelManager) this.tableManager).hideShowCategories(toHide, toShow);
		}
	}

	/**
	 *
	 * @param notification
	 *            a notification about changing the appearance of the tree in the table (single to multi/multi to single column in row header)
	 */
	protected void manageChangeOnDisplayStyle(Notification notification) {
		boolean multiToSingle = false;
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();
		if (notifier instanceof TableDisplayStyle && feature == NattablestylePackage.eINSTANCE.getTableDisplayStyle_DisplayStyle()) {
			Object newValue = notification.getNewValue();
			if (newValue == DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN) {
				multiToSingle = false;
			} else if (newValue == DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN) {
				multiToSingle = true;
			} else {
				return;
			}
		}
		if (notifier instanceof Table && feature == NattablestylePackage.eINSTANCE.getStyledElement_Styles()) {
			Object tmp = notification.getNewValue();
			if (!(tmp instanceof TableDisplayStyle)) {
				return;
			}
			TableDisplayStyle newValue = (TableDisplayStyle) tmp;
			if (newValue.getDisplayStyle() == DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN) {
				multiToSingle = false;
			} else if (newValue.getDisplayStyle() == DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN) {
				multiToSingle = true;
			} else {
				return;
			}

		}

		if (multiToSingle) {
			NatTable natTable = (NatTable) ((IAdaptable) this.tableManager).getAdapter(NatTable.class);
			natTable.refresh();
			((ITreeNattableModelManager) this.tableManager).hideShowColumnCategoriesInRowHeader(null, null);
		} else {
			NatTable natTable = (NatTable) ((IAdaptable) this.tableManager).getAdapter(NatTable.class);
			natTable.refresh();
			((ITreeNattableModelManager) this.tableManager).hideShowColumnCategoriesInRowHeader(StyleUtils.getHiddenDepths(tableManager), null);
		}

	}



	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#resourceSetChanged(org.eclipse.emf.transaction.ResourceSetChangeEvent)
	 *
	 * @param arg0
	 */
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent arg0) {
		for (Notification current : arg0.getNotifications()) {
			if (isNotificationOnHideShowCategories(current)) {
				manageHideShowCategories(current);
			}
			if (isNotificationOnSingleOrMultiColumnInRowHeader(current)) {
				manageChangeOnDisplayStyle(current);
			}
		}
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#transactionAboutToCommit(org.eclipse.emf.transaction.ResourceSetChangeEvent)
	 *
	 * @param arg0
	 * @return
	 * @throws RollbackException
	 */
	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent arg0) throws RollbackException {
		// nothing to do
		return null;
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

						return isNotificationOnHideShowCategories(notification) || isNotificationOnSingleOrMultiColumnInRowHeader(notification);
					}
				}

				return false;
			}
		};
	}

	/**
	 *
	 * @param notification
	 *            a notification
	 * @return
	 *         <code>true</code> if the notification concerns the display style of the table
	 */
	private static final boolean isNotificationOnSingleOrMultiColumnInRowHeader(Notification notification) {
		Object feature = notification.getFeature();
		Object notifier = notification.getNotifier();
		if (notifier instanceof TableDisplayStyle && feature == NattablestylePackage.eINSTANCE.getTableDisplayStyle_DisplayStyle()) {
			return true;
		}
		if (notifier instanceof Table && feature == NattablestylePackage.eINSTANCE.getStyledElement_Styles()) {
			Object value = null;
			if (Notification.ADD == notification.getEventType()) {
				value = notification.getNewValue();
			}
			if (value instanceof TableDisplayStyle) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 * @param notification
	 *            a notification
	 * @return
	 *         <code>true</code> if the notification concerns the hide/show of the categoriesF
	 */
	private static final boolean isNotificationOnHideShowCategories(Notification notification) {
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();
		if (notifier instanceof Table && feature == NattablestylePackage.eINSTANCE.getStyledElement_Styles()) {
			Object style = notification.getOldValue();
			if (style == null) {
				style = notification.getNewValue();
			}
			return style instanceof IntListValueStyle && ((IntListValueStyle) style).getName().equals(NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH);
		}
		return notifier instanceof IntListValueStyle && ((IntListValueStyle) notifier).getName().equals(NamedStyleConstants.HIDDEN_CATEGORY_FOR_DEPTH) && feature == NattablestylePackage.eINSTANCE.getIntListValueStyle_IntListValue();
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#isAggregatePrecommitListener()
	 *
	 * @return
	 */
	@Override
	public boolean isAggregatePrecommitListener() {
		// nothing to do
		return false;
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#isPostcommitOnly()
	 *
	 * @return
	 */
	@Override
	public boolean isPostcommitOnly() {
		// nothing to do
		return false;
	}

	/**
	 * @see org.eclipse.emf.transaction.ResourceSetListener#isPrecommitOnly()
	 *
	 * @return
	 */
	@Override
	public boolean isPrecommitOnly() {
		// nothing to do
		return false;
	}

}
