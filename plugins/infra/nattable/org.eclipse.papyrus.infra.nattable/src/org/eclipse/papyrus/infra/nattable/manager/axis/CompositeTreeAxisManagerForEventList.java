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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.manager.axis;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.nebula.widgets.nattable.sort.ISortModel;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.GMFUnsafe;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.EventListHelper;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;

import ca.odell.glazedlists.EventList;

/**
 *
 * @author VL222926
 *         Composite Axis manager for hierarchic table
 */
public class CompositeTreeAxisManagerForEventList extends CompositeAxisManagerForEventList implements ITreeItemAxisManagerForEventList {

	/**
	 * Constructor.
	 *
	 * @param eventList
	 */
	public CompositeTreeAxisManagerForEventList(EventList<Object> eventList) {
		super(eventList);
	}

	/**
	 * the id of this manager
	 */
	@SuppressWarnings("unused")
	private static final String MANAGER_ID = "org.eclipse.papyrus.infra.nattable.composite.tree.axis.manager.event.list"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.CompositeAxisManagerForEventList#setSubManagers(java.util.List)
	 *
	 * @param subManagers
	 */
	@Override
	public void setSubManagers(List<IAxisManagerForEventList> subManagers) {
		super.setSubManagers(subManagers);
		fillListWithRoots();
	}

	/**
	 * @param notification
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList#manageEvent(Notification)
	 */
	@Override
	public void manageEvent(Notification notification) {
		super.manageEvent(notification);
		// must not be done here -> to many call to refresh
		// getTableManager().refreshNatTable();
	}



	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList#fillListWithChildren(ca.odell.glazedlists.EventList, org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis)
	 *
	 * @param listToModify
	 * @param axis
	 */
	@Override
	public void fillListWithChildren(final ITreeItemAxis axis) {
		for (final IAxisManager current : this.subManagers) {
			if (current instanceof ITreeItemAxisManagerForEventList) {
				((ITreeItemAxisManagerForEventList) current).fillListWithChildren(axis);
			}
		}
		getTableManager().refreshNatTable();
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#isAllowedContents(java.lang.Object, Object, TreeFillingConfiguration, int)
	 *
	 * @param objectToTest
	 * @param depth
	 * @return
	 */
	@Override
	public boolean isAllowedContents(Object objectToTest, Object semanticParent, TreeFillingConfiguration conf, int depth) {
		if (isInitialConfiguration(conf)) {
			for (final IAxisManager current : this.subManagers) {
				if (current instanceof ITreeItemAxisManagerForEventList) {
					if (((ITreeItemAxisManagerForEventList) current).isAllowedContents(objectToTest, semanticParent, conf, depth)) {
						return true;
					}
				}
			}
			return false;
		}
		return true;
	}

	/**
	 *
	 * @param conf
	 *            a tree filling configuration
	 * @return
	 *         <code>true</code> if the tree filling configuration comes from the initial table configuration
	 */
	private final boolean isInitialConfiguration(TreeFillingConfiguration conf) {
		if (EMFHelper.isReadOnly(conf)) {
			return true;
		}
		TableHeaderAxisConfiguration axisConf = (TableHeaderAxisConfiguration) HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisInTableConfiguration(getTableManager().getTable());
		for (IAxisConfiguration curr : axisConf.getOwnedAxisConfigurations()) {
			if (curr instanceof TreeFillingConfiguration) {
				TreeFillingConfiguration treeConf = (TreeFillingConfiguration) curr;
				Object representedElement = treeConf.getAxisUsedAsAxisProvider().getElement();
				return representedElement.equals(conf.getAxisUsedAsAxisProvider().getElement());
			}
		}
		return false;
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#compare(org.eclipse.nebula.widgets.nattable.sort.ISortModel, int, org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis,
	 *      org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis)
	 *
	 * @param sortModel
	 * @param depth
	 * @param axis1
	 * @param axis2
	 * @return
	 */
	@Override
	public int compare(ISortModel sortModel, int depth, ITreeItemAxis axis1, ITreeItemAxis axis2) {
		final AxisManagerRepresentation manager1 = axis1.getManager();
		final AxisManagerRepresentation manager2 = axis2.getManager();
		if (manager1 == null || manager2 == null) {
			return 0;
		}
		if (manager1 == manager2) {
			for (final IAxisManagerForEventList current : this.subManagers) {
				if (current.getAxisManagerRepresentation() == manager1) {
					return ((ITreeItemAxisManagerForEventList) current).compare(sortModel, depth, axis1, axis2);
				}
			}
		}
		return 0;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#setExpanded(org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis, java.util.List, boolean)
	 *
	 * @param element
	 * @param path
	 * @param expanded
	 */
	@Override
	public void setExpanded(ITreeItemAxis element, List<ITreeItemAxis> path, boolean expanded) {
		for (final IAxisManager current : this.subManagers) {
			if (element.getManager() == current.getAxisManagerRepresentation() && current instanceof ITreeItemAxisManagerForEventList) {
				((ITreeItemAxisManagerForEventList) current).setExpanded(element, path, expanded);
			}
		}

		// we are modifying the model, so we need to do the expand is a command, but this action must not be done in the stack (and must not be available in the history)
		final SetCommand cmd = new SetCommand(getTableEditingDomain(), element, NattableaxisPackage.eINSTANCE.getITreeItemAxis_Expanded(), expanded);
		try {
			GMFUnsafe.write(getTableEditingDomain(), new Runnable() {

				@Override
				public void run() {
					cmd.execute();
				}
			});
		} catch (InterruptedException e) {
			Activator.log.error(e);
		} catch (RollbackException e) {
			Activator.log.error(e);
		}
		getTableManager().refreshNatTable();
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#fillRoot()
	 *
	 */
	@Override
	public void fillListWithRoots() {
		// 1. we fill the list with root elements saved in the table model
		for (final IAxis current : getRepresentedContentProvider().getAxis()) {
			if (current instanceof ITreeItemAxis) {
				EventListHelper.addToEventList(this.eventList, current);
			}
		}

		// 2. we update/create the root element calling the submanager
		for (final IAxisManager current : this.subManagers) {
			if (current instanceof ITreeItemAxisManagerForEventList) {
				((ITreeItemAxisManagerForEventList) current).fillListWithRoots();
			}
		}
		// required
		getTableManager().refreshNatTable();
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#managedHideShowCategoriesForDepth(java.util.List, java.util.List)
	 *
	 * @param toHide
	 * @param toShow
	 */
	@Override
	public void managedHideShowCategoriesForDepth(List<Integer> toHide, List<Integer> toShow) {
		for (final IAxisManager current : this.subManagers) {
			if (current instanceof ITreeItemAxisManagerForEventList) {
				((ITreeItemAxisManagerForEventList) current).managedHideShowCategoriesForDepth(toHide, toShow);
			}
		}
		// required
		getTableManager().refreshNatTable();
	}
}
