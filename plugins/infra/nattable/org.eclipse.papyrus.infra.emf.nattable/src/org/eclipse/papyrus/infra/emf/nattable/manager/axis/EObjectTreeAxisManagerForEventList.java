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
package org.eclipse.papyrus.infra.emf.nattable.manager.axis;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.core.sashwindows.di.Window;
import org.eclipse.papyrus.infra.nattable.dataprovider.HierarchicalRowLabelHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.manager.axis.AbstractTreeAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderPackage;
import org.eclipse.papyrus.infra.nattable.tree.ITreeItemAxisHelper;

//import org.eclipse.nebula.widgets.nattable.ui.NatEventData;

/**
 *
 * @author VL222926
 *         Class used to managed hierarchical axis
 */
public class EObjectTreeAxisManagerForEventList extends AbstractTreeAxisManagerForEventList implements IAxisManagerForEventList, ITreeItemAxisManagerForEventList {



	/**
	 * NOT IN THE API, only here to do the dev about the display of the category (intermediate level displayed filling configuration
	 *
	 */
	public static final boolean DISPLAY_CATEOGORY = HierarchicalRowLabelHeaderDataProvider.DISPLAY_CATEOGORY;


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getAddAxisCommand(org.eclipse.emf.transaction.TransactionalEditingDomain, java.util.Collection)
	 *
	 * @param domain
	 * @param objectToAdd
	 * @return
	 */
	@Override
	public Command getAddAxisCommand(TransactionalEditingDomain domain, Collection<Object> objectToAdd) {
		final Collection<IAxis> toAdd = new ArrayList<IAxis>();
		for (final Object object : objectToAdd) {
			if (isAllowedContents(object, null, null, 0) && !isAlreadyManaged(object)) {
				final EObjectAxis horizontalAxis = NattableaxisFactory.eINSTANCE.createEObjectTreeItemAxis();
				horizontalAxis.setElement((EObject) object);
				horizontalAxis.setManager(this.representedAxisManager);
				toAdd.add(horizontalAxis);
			}
		}
		if (!toAdd.isEmpty()) {
			return AddCommand.create(domain, getRepresentedContentProvider(), NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis(), toAdd);
		}
		return null;
	}



	/**
	 * @param objectToTest
	 * @param depth
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#isAllowedContents(java.lang.Object, Object, TreeFillingConfiguration, int)
	 *
	 * @return
	 */
	@Override
	public boolean isAllowedContents(Object objectToTest, Object semanticParent, TreeFillingConfiguration conf, int depth) {
		if (objectToTest instanceof EObject) {
			return true;
		}
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractTreeAxisManagerForEventList#isAllowedContents(java.lang.Object)
	 *
	 * @param object
	 * @return
	 * @deprecated
	 */
	@Deprecated
	@Override
	public boolean isAllowedContents(Object object) {
		return object instanceof EObject;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractTreeAxisManagerForEventList#createITreeItemAxis(org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis, java.lang.Object)
	 *
	 * @param parentAxis
	 * @param objectToAdd
	 * @return
	 */
	@Override
	protected ITreeItemAxis createITreeItemAxis(ITreeItemAxis parentAxis, Object objectToAdd) {
		return ITreeItemAxisHelper.createITreeItemAxis(getTableEditingDomain(), parentAxis, objectToAdd, this.representedAxisManager);
	}


	/**
	 *
	 * @param notification
	 *            a notification
	 * @return
	 *         <code>true</code> if the notification must be ignored
	 */
	@Override
	protected boolean ignoreEvent(final Notification notification) {
		boolean res = super.ignoreEvent(notification);
		if (res) {
			return res;
		}
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();
		if (feature == null) {
			return true;
		}
		if (notifier instanceof PageRef || notifier instanceof Window) {
			return true;
		}


		// I am not sure of the end of this method
		// List<EStructuralFeature> listenFeature = new ArrayList<EStructuralFeature>();
		// List<TreeFillingConfiguration> confs = FillingConfigurationUtils.getTreeFillingConfiguration(getTable(), representedAxisManager);
		// boolean derivedFeature = false;
		// for (TreeFillingConfiguration conf : confs) {
		// IAxis axis = conf.getAxisUsedAsAxisProvider();
		// if (axis instanceof EStructuralFeatureAxis) {
		// EStructuralFeature f = (EStructuralFeature) axis.getElement();
		// derivedFeature = derivedFeature || f.isDerived();
		// if (derivedFeature) {
		// return false;
		// }
		// }
		// }
		// if (listenFeature.contains(feature)) {
		// return false;
		// }
		//
		// if (confs.size() == listenFeature.size()) {
		// return false;
		// }
		// return true;
		return false;
	}
}
