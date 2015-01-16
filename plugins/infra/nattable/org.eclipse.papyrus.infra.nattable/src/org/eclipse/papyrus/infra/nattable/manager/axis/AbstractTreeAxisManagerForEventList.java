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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.hideshow.RowHideShowLayer;
import org.eclipse.nebula.widgets.nattable.hideshow.command.MultiRowHideCommand;
import org.eclipse.nebula.widgets.nattable.hideshow.command.MultiRowShowCommand;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.sort.ISortModel;
import org.eclipse.nebula.widgets.nattable.tree.TreeLayer;
import org.eclipse.papyrus.commands.Activator;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.GMFUnsafe;
import org.eclipse.papyrus.infra.nattable.layer.PapyrusGridLayer;
import org.eclipse.papyrus.infra.nattable.layerstack.RowHeaderHierarchicalLayerStack;
import org.eclipse.papyrus.infra.nattable.manager.cell.CellManagerFactory;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderPackage;
import org.eclipse.papyrus.infra.nattable.tree.ITreeItemAxisHelper;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.EventListHelper;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;


/**
 * @author VL222926
 *
 */
public abstract class AbstractTreeAxisManagerForEventList extends AbstractAxisManagerForEventList implements ITreeItemAxisManagerForEventList {

	/**
	 * a map with the elements managed by this axis manager : keys are semantic elements and values a set of the representation of these elements in the table
	 */
	protected Map<Object, Set<ITreeItemAxis>> managedElements = new HashMap<Object, Set<ITreeItemAxis>>();

	/**
	 * the list of axis which have been expanded one time
	 */
	protected List<ITreeItemAxis> alreadyExpanded = new ArrayList<ITreeItemAxis>();

	/**
	 * the current filling configuration used by this axis manager
	 */
	protected List<TreeFillingConfiguration> currentFillingConfiguration;

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#init(org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager, org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation,
	 *      org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider)
	 *
	 * @param manager
	 * @param rep
	 * @param provider
	 */
	@Override
	public void init(INattableModelManager manager, AxisManagerRepresentation rep, AbstractAxisProvider provider) {
		super.init(manager, rep, provider);
		this.currentFillingConfiguration = FillingConfigurationUtils.getTreeFillingConfiguration(getTable(), representedAxisManager);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#addListeners()
	 *
	 */
	@Override
	protected void addListeners() {
		// nothing to do here
	}

	/**
	 *
	 * @param parentAxis
	 *            the parent axis
	 * @param objectToAdd
	 *            the object to add as child of the parent axis
	 * @return
	 *         the created {@link ITreeItemAxis} representing objectToAdd
	 */
	protected final ITreeItemAxis addObject(final ITreeItemAxis parentAxis, final Object objectToAdd) {
		final ITreeItemAxis newAxis = createITreeItemAxis(parentAxis, objectToAdd);
		if (objectToAdd instanceof TreeFillingConfiguration) {
			TreeFillingConfiguration conf = (TreeFillingConfiguration) objectToAdd;
			if (this.alreadyExpanded.contains(parentAxis)) {
				// if the representation of the notifier has already been expanded, we need to add the new value to the list, if not it will be done during the expand of the notifier
				// we must to expand tree filling configuration when its is hidden and its parent is expanded
				if (StyleUtils.isHiddenDepth(getTableManager(), conf.getDepth())) {


					try {
						GMFUnsafe.write(getTableEditingDomain(), new Runnable() {

							@Override
							public void run() {
								newAxis.setExpanded(true);
							}
						});
					} catch (InterruptedException e) {
						Activator.log.error(e);
					} catch (RollbackException e) {
						Activator.log.error(e);
					}
					this.alreadyExpanded.add(newAxis);
				}
			}
		}
		ITreeItemAxisHelper.linkITreeItemAxisToSemanticElement(this.managedElements, newAxis);
		EventListHelper.addToEventList(this.eventList, newAxis);
		// seems not useful, but in doubt, I don't remove the code

		// int index = ((NattableModelManager) getTableManager()).getRowElementsList().indexOf(newAxis);
		// NatTable natTable = (NatTable) getTableManager().getAdapter(NatTable.class);
		// if (getTableManager() != null && getTableManager().getBodyLayerStack() != null) {
		// RowHideShowLayer rowHideLayer = getTableManager().getBodyLayerStack().getRowHideShowLayer();
		// if (index != -1 && natTable != null && rowHideLayer != null) {
		// // we need to notify the show hide layer than an object has been added
		//
		// TreeLayer treeLayer = getTreeLayer();
		// RowInsertEvent event = new RowInsertEvent(treeLayer, index);
		// rowHideLayer.handleLayerEvent(event);
		// }
		// }
		return newAxis;
	}


	/**
	 * TODO : find a better way to get the tree layer
	 *
	 * @return
	 *         the tree layer
	 */
	private TreeLayer getTreeLayer() {
		NatTable natTable = (NatTable) getTableManager().getAdapter(NatTable.class);
		ILayer layer = natTable.getLayer();
		if (layer instanceof PapyrusGridLayer) {
			PapyrusGridLayer gridLayer = (PapyrusGridLayer) layer;
			ILayer rowLayer = gridLayer.getRowHeaderLayer();
			if (rowLayer instanceof RowHeaderHierarchicalLayerStack) {
				return ((RowHeaderHierarchicalLayerStack) rowLayer).getTreeLayer();
			}
		}
		throw new UnknownError("TreeLayer has not been found"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canBeUsedAsColumnManager()
	 *
	 * @return
	 *         always false
	 */
	@Override
	public boolean canBeUsedAsColumnManager() {
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canCreateAxisElement(java.lang.String)
	 *
	 * @param elementId
	 * @return
	 */
	@Override
	public boolean canCreateAxisElement(String elementId) {
		return true;
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canDestroyAxis(java.lang.Integer)
	 *
	 * @param axisPosition
	 * @return
	 */
	@Override
	public boolean canDestroyAxis(Integer axisPosition) {
		IAxis axis = (IAxis) getTableManager().getRowElementsList().get(axisPosition.intValue());// we need to have the tree list here and not the basic event list!
		if (axis instanceof ITreeItemAxis) {
			return ((ITreeItemAxis) axis).getParent() == null;
		}
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canDropAxisElement(java.util.Collection)
	 *
	 * @param objectsToAdd
	 * @return
	 */
	@Override
	public boolean canDropAxisElement(Collection<Object> objectsToAdd) {
		// drop is allowed only when first level is not filled DnD
		return FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(this.tableManager.getTable(), representedAxisManager, 0) == false && super.canDropAxisElement(objectsToAdd);
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
	 * @see Comparator#compare(Object, Object)
	 */
	@Override
	public int compare(ISortModel sortModel, int depth, ITreeItemAxis axis1, ITreeItemAxis axis2) {
		if (axis1 == axis2) {
			return 0;
		}
		if (axis1.getParent() != axis2.getParent()) {
			Activator.log.warn("There is probably a bug, we are comparing 2 elements from differents level in the tree"); //$NON-NLS-1$
			return 0;
		}
		Object el1 = axis1.getElement();
		Object el2 = axis2.getElement();
		int index1 = -2;
		int index2 = -2;

		// we are comparing 2 filling configurations
		if (el1 instanceof TreeFillingConfiguration) {
			Assert.isTrue(el2 instanceof TreeFillingConfiguration);
			final List<TreeFillingConfiguration> confs = FillingConfigurationUtils.getTreeFillingConfiguration(getTable(), representedAxisManager);

			index1 = confs.indexOf(el1);
			index2 = confs.indexOf(el2);
		} else {// we must compare values
			// parent1 and parent2 are axis representing filling configuration
			ITreeItemAxis parent1 = axis1.getParent();
			if (parent1 == null) {
				// its root element, filled by DnD
				List<IAxis> axis = getRepresentedContentProvider().getAxis();
				index1 = axis.indexOf(axis1);
				index2 = axis.indexOf(axis2);
			} else {
				TreeFillingConfiguration conf = (TreeFillingConfiguration) parent1.getElement();
				ITreeItemAxis grandFather1 = parent1.getParent();
				Object context = null;
				if (grandFather1 == null) {
					context = getTableContext();
				} else {
					context = grandFather1.getElement();
				}
				Collection<?> values = getCellValueAsCollection(conf.getAxisUsedAsAxisProvider(), context);
				if (values instanceof List<?>) {
					index1 = ((List<?>) values).indexOf(axis1.getElement());
					index2 = ((List<?>) values).indexOf(axis2.getElement());
				}
			}
		}

		int res = index1 - index2;
		return Integer.signum(res);
	}

	/**
	 *
	 * @param parentAxis
	 *            the parent axis
	 * @param objectToAdd
	 *            the object to add
	 * @return
	 *         the ITreeItemAxis created to represents this object
	 */
	protected abstract ITreeItemAxis createITreeItemAxis(ITreeItemAxis parentAxis, Object objectToAdd);

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#dispose()
	 *
	 */
	@Override
	public void dispose() {
		super.dispose();
		this.managedElements.clear();
		this.alreadyExpanded.clear();
	}

	/**
	 *
	 * @param notification
	 *            update the list of the managed objects if its required
	 */
	protected void featureValueHasChanged(final Notification notification) {
		// nothing to do
	}

	/**
	 * This method add children representing TreeFillingConfiguration, only if there will be subelement to display for the TreeFillingConfiguration
	 *
	 * @param axis
	 *            a axis representing a semantic element
	 */
	protected void fillChildrenForSemanticElement(final ITreeItemAxis axis) {
		Assert.isTrue(axis == null || axis.getChildren().size() == 0);
		int nextDepth = -1;
		Object context;
		if (axis == null) {
			nextDepth = 0;
			context = getTableContext();
		} else {
			nextDepth = getSemanticDepth(axis) + 1;
			context = axis.getElement();
			Assert.isTrue(!(context instanceof TreeFillingConfiguration));
		}
		final List<TreeFillingConfiguration> confs = FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, nextDepth);
		for (TreeFillingConfiguration current : confs) {
			final Collection<?> values = getFilteredValueAsCollection(current, context, nextDepth);
			if (values.size() != 0) {
				ITreeItemAxis newAxis = addObject(axis, current);
				if (nextDepth == 0) {
					for (Object curr : values) {
						addObject(newAxis, curr);
					}
				}
			}
		}
	}

	/**
	 * Fills the list with the children of the axis-> children are semantic elements
	 *
	 * @param axis
	 *            an axis representing a tree filling configuration
	 */
	protected void fillChildrenForTreeFillingConfiguration(ITreeItemAxis axis) {
		Object tmp = axis.getElement();
		Assert.isTrue(tmp instanceof TreeFillingConfiguration);
		TreeFillingConfiguration conf = (TreeFillingConfiguration) tmp;
		ITreeItemAxis parent = axis.getParent();
		int nextDepth = conf.getDepth();
		Object context = null;
		if (parent != null) {
			context = parent.getElement();
		} else {
			context = getTableContext();
		}
		final Collection<?> values = getFilteredValueAsCollection(conf, context, nextDepth);
		for (final Object value : values) {
			addObject(axis, value);
		}
	}

	/**
	 *
	 * @param element
	 *            an element
	 */
	public void fillListWithGrandSon(final ITreeItemAxis element) {
		Object context = element.getElement();
		if (context instanceof TreeFillingConfiguration) {
			for (ITreeItemAxis child : element.getChildren()) {
				// child is a semantic element
				fillChildrenForSemanticElement(child);
			}
			return;
		}
		for (ITreeItemAxis child : element.getChildren()) {
			// child is a tree filling configuration
			fillChildrenForTreeFillingConfiguration(child);
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#fillRoot()
	 *
	 */
	@Override
	public void fillListWithRoots() {
		if (false == FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(tableManager.getTable(), representedAxisManager, 0)) {
			for (IAxis current : getRepresentedContentProvider().getAxis()) {
				if (current instanceof ITreeItemAxis) {
					Assert.isTrue((current.getElement() instanceof TreeFillingConfiguration) == false);
					ITreeItemAxisHelper.linkITreeItemAxisToSemanticElement(this.managedElements, (ITreeItemAxis) current);
					fillChildrenForSemanticElement((ITreeItemAxis) current);
				}
			}
			return;
		}
		fillChildrenForSemanticElement(null);
	}

	/**
	 *
	 * @param iaxis
	 * @param rowElement
	 *            the element
	 * @return
	 *         a collection of all values for the intersection of the iaxis and the row element. These values are not yet filtered by the method {@link #isAllowedContents(Object, Object, TreeFillingConfiguration, int)}
	 */
	protected final Collection<?> getCellValueAsCollection(final Object iaxis, final Object rowElement) {
		Object value = CellManagerFactory.INSTANCE.getCrossValue(iaxis, rowElement, this.tableManager);
		if (value == null) {
			return Collections.emptyList();
		}
		if (value instanceof Collection<?>) {
			return (Collection<?>) value;
		}

		if (value instanceof Object[]) {
			return Arrays.asList(value);
		}
		return Collections.emptyList();
	}

	/**
	 *
	 * @param axis
	 *            an object
	 * @return
	 *         the the
	 */
	protected int getDepth(final ITreeItemAxis axis) {
		final ITreeNattableModelManager manager = getTableManager();
		if (manager instanceof ITreeNattableModelManager) {
			return manager.getTreeItemDepth(axis);
		}
		return 0;
	}

	/**
	 *
	 * @param conf
	 *            axis used as row provider
	 * @param rowElement
	 *            row element
	 * @param depth
	 *            the depth of the new element
	 * @return
	 *         a collection with all values accepted as children of the rowElement. Returned values have been filtered by the method {@link #isAllowedContents(Object, Object, TreeFillingConfiguration, int)}
	 */
	protected final Collection<?> getFilteredValueAsCollection(final TreeFillingConfiguration conf, final Object rowElement, final int depth) {
		Collection<?> values = getCellValueAsCollection(conf.getAxisUsedAsAxisProvider(), rowElement);
		Collection<Object> returnedValues = new ArrayList<Object>();
		Object parent = AxisUtils.getRepresentedElement(rowElement);
		for (Object current : values) {
			if (isAllowedContents(current, parent, conf, depth)) {
				returnedValues.add(current);
			}
		}
		return returnedValues;
	}

	/**
	 *
	 * @param axis
	 *            an axis
	 * @return
	 *         the real depth of an element (semantic or {@link TreeFillingConfiguration}), that is to say than for {@link TreeFillingConfiguration} we return {@link TreeFillingConfiguration#getDepth()} and for a semantic element
	 *         we returns the depth of the {@link TreeFillingConfiguration} parent of the {@link ITreeItemAxis} represented it.
	 */
	public final int getSemanticDepth(final ITreeItemAxis axis) {
		final ITreeNattableModelManager manager = getTableManager();
		if (manager instanceof ITreeNattableModelManager) {
			return manager.getSemanticDepth(axis);
		}
		return 0;
	}

	protected Table getTable() {
		return this.tableManager.getTable();
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#initializeManagedObjectList()
	 *
	 */
	@Override
	protected void initializeManagedObjectList() {
		// now it is not used
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#isAllowedContents(java.lang.Object)
	 * @deprecated for ITreeItemAxisManagerForEventList, we must use isAllowedContents(Object, int depth)
	 * @param object
	 * @return
	 */
	@Override
	@Deprecated
	public boolean isAllowedContents(Object object) {
		return super.isAllowedContents(object);
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#isAlreadyManaged(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public boolean isAlreadyManaged(Object object) {
		if (this.managedElements.containsKey(object)) {
			for (final ITreeItemAxis current : this.managedElements.get(object)) {
				// an element can be displayed several time in the table, but only one as root
				if (current.eContainer() != null) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#isDynamic()
	 *
	 * @return
	 */
	@Override
	public boolean isDynamic() {
		return true;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#isSlave()
	 *
	 * @return
	 */
	@Override
	public boolean isSlave() {
		return false;
	}

	protected final void removeObject(final ITreeItemAxis axis) {
		Collection<ITreeItemAxis> children = new ArrayList<ITreeItemAxis>(axis.getChildren());
		for (ITreeItemAxis current : children) {
			removeObject(current);
			// EventListHelper.removeFromEventList(eventList, current);
			// ITreeItemAxisHelper.unlinkITreeItemAxisToSemanticElement(this.managedElements, current);
			// ITreeItemAxisHelper.destroyITreeItemAxis(getTableEditingDomain(), current);
		}
		final ITreeItemAxis parentAxis = axis.getParent();

		EventListHelper.removeFromEventList(eventList, axis);
		this.alreadyExpanded.remove(axis);
		ITreeItemAxisHelper.unlinkITreeItemAxisToSemanticElement(this.managedElements, axis);
		ITreeItemAxisHelper.destroyITreeItemAxis(getTableEditingDomain(), axis);
		if (parentAxis != null) {
			final Object representedElement = parentAxis.getElement();
			if (representedElement instanceof TreeFillingConfiguration && parentAxis.getChildren().size() == 0) {
				removeObject(parentAxis);
			}
		}
	}

	// /**
	// *
	// * @param axis
	// * the axis to remove. Its children will be remove too. If its parent represents a TreeFillingConfiguration, without children, it will be removed too.
	// */
	// protected final void removeObject(final ITreeItemAxis axis) {
	// Collection<ITreeItemAxis> children = new ArrayList<ITreeItemAxis>(axis.getChildren());
	// for (ITreeItemAxis current : children) {
	// //we must remove its children before to remove it!
	// removeObject(current);
	// }
	//
	//
	// final ITreeItemAxis parentAxis = axis.getParent();
	//
	//
	// this.alreadyExpanded.remove(axis);
	// ITreeItemAxisHelper.unlinkITreeItemAxisToSemanticElement(this.managedElements, axis);
	//
	//
	// //we unset its parent
	// ITreeItemAxisHelper.destroyITreeItemAxis(getTableEditingDomain(), axis);
	//
	//
	// //we remove it from the event list
	// EventListHelper.removeFromEventList(eventList, axis);
	//
	// if (parentAxis != null) {
	// final Object representedElement = parentAxis.getElement();
	// if (representedElement instanceof TreeFillingConfiguration && parentAxis.getChildren().size() == 0) {
	// removeObject(parentAxis);
	// }
	// }


	// V1 of the remove object method
	// Collection<ITreeItemAxis> children = new ArrayList<ITreeItemAxis>(axis.getChildren());
	// for (ITreeItemAxis current : children) {
	// removeObject(current);
	// EventListHelper.removeFromEventList(eventList, current);
	// ITreeItemAxisHelper.unlinkITreeItemAxisToSemanticElement(this.managedElements, current);
	// ITreeItemAxisHelper.destroyITreeItemAxis(getTableEditingDomain(), current);
	// }
	// final ITreeItemAxis parentAxis = axis.getParent();
	//
	// EventListHelper.removeFromEventList(eventList, axis);
	// this.alreadyExpanded.remove(axis);
	// ITreeItemAxisHelper.unlinkITreeItemAxisToSemanticElement(this.managedElements, axis);
	// ITreeItemAxisHelper.destroyITreeItemAxis(getTableEditingDomain(), axis);
	// if (parentAxis != null) {
	// final Object representedElement = parentAxis.getElement();
	// if (representedElement instanceof TreeFillingConfiguration && parentAxis.getChildren().size() == 0) {
	// removeObject(parentAxis);
	// }
	// }

	// }

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#setExpanded(org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis, java.util.List, boolean)
	 *
	 * @param element
	 * @param path
	 * @param expanded
	 */
	@Override
	public void setExpanded(final ITreeItemAxis element, List<ITreeItemAxis> path, boolean expanded) {
		if (!expanded) {
			return;
		}
		if (!this.alreadyExpanded.contains(element)) {
			fillListWithGrandSon(element);
			this.alreadyExpanded.add(element);
		}
	}

	/**
	 * Update the list of the managed objects, ignoring ordered elements
	 *
	 * @param toAdd
	 *            the list of the elements to add to the managed objects list
	 * @param toRemove
	 *            the list of the elements to remove to the managed objects list
	 */
	protected void updateManagedList(final List<Object> toAdd, final List<Object> toRemove) {
		// nothing to do
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
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			if (feature == NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis()) {
				return false;
			}
			EObject parent = ((EStructuralFeature) feature).eContainer();
			while (parent.eContainer() != null) {
				parent = parent.eContainer();
			}
			return parent == NattablePackage.eINSTANCE;
		}
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#fillListWithChildren(org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis)
	 *
	 * @param axis
	 */
	@Override
	public void fillListWithChildren(final ITreeItemAxis parentAxis) {
		Object element = parentAxis.getElement();
		if (element instanceof TreeFillingConfiguration) {
			fillChildrenForTreeFillingConfiguration(parentAxis);
			return;
		}
		fillChildrenForSemanticElement(parentAxis);
	}

	/**
	 *
	 * @param notification
	 */
	@Override
	protected void manageSetNotification(Notification notification) {
		manageAddNotification(notification);
		manageRemoveNotification(notification);
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#manageUnsetNotification(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	protected void manageUnsetNotification(Notification notification) {
		manageRemoveNotification(notification);
		manageAddNotification(notification);
	}


	/**
	 *
	 * @param toTest
	 *            the value to test
	 * @param conf
	 *            a tree filling configuration
	 * @param semanticParent
	 *            the context to use to get values
	 * @return
	 *         <code>true</code> if the value can be displayed as a child of the {@link TreeFillingConfiguration}
	 */
	protected boolean isProvidedByTreeFillingConfiguration(final Object toTest, final TreeFillingConfiguration conf, final Object semanticParent) {
		Collection<?> values = getFilteredValueAsCollection(conf, semanticParent, conf.getDepth());
		return values.contains(toTest);
	}

	/**
	 *
	 * @param possibleRepresentation
	 *            a list owning possible representation of an element
	 * @param object
	 *            the element
	 * @return
	 *         the {@link ITreeItemAxis} representing this element or <code>null</code> if not found
	 */
	public static final ITreeItemAxis getITreeItemAxisRepresentingObject(final Collection<ITreeItemAxis> possibleRepresentation, Object object) {
		for (ITreeItemAxis axis : possibleRepresentation) {
			if (axis.getElement() == object) {
				return axis;
			}
		}
		return null;
	}

	/**
	 * Adds the new axis to the list, and add its direct children
	 *
	 * @param axis
	 *            the new axis to add to the list
	 */
	protected void manageAddITreeItemAxisForSemanticElement(final ITreeItemAxis axis) {
		Assert.isTrue((axis.getElement() instanceof TreeFillingConfiguration) == false);
		ITreeItemAxisHelper.linkITreeItemAxisToSemanticElement(this.managedElements, axis);
		fillListWithChildren(axis);
	}

	/**
	 * @param notification
	 */
	@Override
	protected void manageAddNotification(Notification notification) {
		Object notifier = notification.getNotifier();
		Object newValue = notification.getNewValue();
		Object feature = notification.getFeature();
		// case 1 - the user added a new root axis by DnD
		if (feature == NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis() && newValue instanceof ITreeItemAxis && ((ITreeItemAxis) newValue).getElement() instanceof EObject) {
			manageAddITreeItemAxisForSemanticElement((ITreeItemAxis) newValue);
			return;
		}

		// case 2 : the notifier is the context of the table and we have filling configuration for level 0
		if (notifier == getTableContext() && FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), 0)) {
			for (final TreeFillingConfiguration current : FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, 0)) {
				if (isProvidedByTreeFillingConfiguration(newValue, current, notifier)) {
					Set<ITreeItemAxis> parentRepresentation = this.managedElements.get(current);
					// we are on the root, so the set is null or its size is 1;
					Assert.isTrue(parentRepresentation == null || parentRepresentation.size() == 1);
					ITreeItemAxis parentConf = null;
					if (parentRepresentation == null) {
						parentConf = addObject(null, current);
					} else {
						parentConf = parentRepresentation.iterator().next();
					}
					addObject(parentConf, newValue);
				}
			}
			return;
		}

		// case 3 - the notifier is a known element
		if (this.managedElements.containsKey(notifier)) {
			final Set<ITreeItemAxis> itemAxisRepresentations = this.managedElements.get(notifier);
			// we need to add a child for each representation of its parent in the table
			for (final ITreeItemAxis curr : itemAxisRepresentations) {

				// we update the conf only when the parent of the representation has already been filled (so expanded)
				if (curr.getParent() == null || this.alreadyExpanded.contains(curr.getParent())) {
					// 1.1 : get the depth for the new value
					int nextDepth = getSemanticDepth(curr) + 1;

					// 1.2 verify than the new value is allowed
					if (FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), representedAxisManager, nextDepth)) {

						// we cross the possible confs for this level
						for (TreeFillingConfiguration conf : FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, nextDepth)) {
							if (isProvidedByTreeFillingConfiguration(newValue, conf, notifier)) {
								// we must add the value
								ITreeItemAxis confRep = getITreeItemAxisRepresentingObject(curr.getChildren(), conf);


								if (confRep == null) {
									confRep = addObject(curr, conf);
								}
								// if the representation of the notifier has already been expanded, we need to add the new value to the list, if not it will be done during the expand of the notifier
								if (this.alreadyExpanded.contains(curr)) {
									addObject(confRep, newValue);
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @param notification
	 */
	@Override
	protected void manageAddManyNotification(final Notification notification) {
		final Object tmpValues = notification.getNewValue();
		if (!(tmpValues instanceof Collection<?>)) {
			return;
		}

		final Collection<?> values = (Collection<?>) tmpValues;
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();

		// case 1 - the user added a new roots axis by DnD
		if (feature == NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis()) {
			for (Object value : values) {
				if (value instanceof ITreeItemAxis && !(((ITreeItemAxis) value).getElement() instanceof ITreeItemAxis)) {
					manageAddITreeItemAxisForSemanticElement((ITreeItemAxis) value);
				}
			}
			return;
		}

		// case 2 : the notifier is the context of the table and we have filling configuration for level 0
		if (notifier == getTableContext() && FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), 0)) {
			for (final TreeFillingConfiguration current : FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, 0)) {

				// all values to display for this conf
				Collection<?> rows = getFilteredValueAsCollection(current, notifier, 0);
				// all values to add
				values.retainAll(rows);

				if (values.size() > 0) {
					Set<ITreeItemAxis> parentRepresentation = this.managedElements.get(current);
					// we are on the root, so the set is null or its size is 1;
					Assert.isTrue(parentRepresentation == null || parentRepresentation.size() == 1);
					ITreeItemAxis confRep;
					if (parentRepresentation == null) {
						confRep = addObject(null, current);
					} else {
						confRep = parentRepresentation.iterator().next();
					}
					// only one representation
					for (Object currVal : values) {
						addObject(confRep, currVal);
					}
				}
			}
			return;
		}

		// case 3 - the notifier is a known element
		if (!this.managedElements.containsKey(notifier)) {
			return;
		}
		final Set<ITreeItemAxis> itemAxisRepresentations = this.managedElements.get(notifier);
		// we need to add a child for each representation of its parent in the table
		for (final ITreeItemAxis curr : itemAxisRepresentations) {

			if (curr.getParent() == null || this.alreadyExpanded.contains(curr.getParent())) {
				// 1.1 : get the depth for the new value
				int nextDepth = getSemanticDepth(curr) + 1;
				for (Object newValue : values) {
					// 1.2 verify than the new value is allowed
					if (FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), representedAxisManager, nextDepth)) {

						// we cross the possible confs for this level
						for (TreeFillingConfiguration conf : FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, nextDepth)) {
							if (isProvidedByTreeFillingConfiguration(newValue, conf, notifier)) {
								// we must add the value
								ITreeItemAxis confRep = getITreeItemAxisRepresentingObject(curr.getChildren(), conf);
								if (confRep == null) {
									confRep = addObject(curr, conf);
								}
								// if the representation of the notifier has already been expanded, we need to add the new value to the list, if not it will be done during the expand of the notifier
								if (this.alreadyExpanded.contains(curr)) {
									addObject(confRep, newValue);
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @param notification
	 */
	@Override
	protected void manageMoveNotification(Notification notification) {
		// no usecase found
	}

	protected void manageRemoveITreeItemAxisForSemanticElement(final ITreeItemAxis axis) {
		Assert.isTrue((axis.getElement() instanceof TreeFillingConfiguration) == false);
		removeObject(axis);
	}

	/**
	 * @param notification
	 */
	@Override
	protected void manageRemoveNotification(Notification notification) {
		final Object oldValue = notification.getOldValue();

		// a ITreeItemAxis is destroyed
		if (oldValue instanceof ITreeItemAxis && !(((IAxis) oldValue).getElement() instanceof TreeFillingConfiguration)) {
			removeObject((ITreeItemAxis) oldValue);
			return;
		}

		manageRemoveSemanticElement(oldValue);
	}

	protected void manageRemoveSemanticElement(Object object) {
		Assert.isTrue(false == (object instanceof ITreeItemAxis));
		Assert.isTrue(false == (object instanceof TreeFillingConfiguration));
		if (this.managedElements.containsKey(object)) {
			Collection<ITreeItemAxis> itemAxisRepresentations = new ArrayList<ITreeItemAxis>(this.managedElements.get(object));
			for (final ITreeItemAxis current : itemAxisRepresentations) {
				ITreeItemAxis parent = current.getParent();
				// must always be a TreeFillingConfiguration
				TreeFillingConfiguration conf = (TreeFillingConfiguration) parent.getElement();
				Object context;
				ITreeItemAxis greatParent = parent.getParent();
				if (greatParent == null) {
					context = getTableContext();
				} else {
					context = greatParent.getElement();
				}
				Collection<?> values = getCellValueAsCollection(conf.getAxisUsedAsAxisProvider(), context);
				if (!values.contains(object)) {
					removeObject(current);
				}
			}
		}
	}


	/**
	 * @param notification
	 */
	@Override
	protected void manageRemoveManyNotification(Notification notification) {
		final Object tmpOldValues = notification.getOldValue();
		if (!(tmpOldValues instanceof Collection<?>)) {
			return;
		}

		Collection<?> oldValues = (Collection<?>) tmpOldValues;
		Object feature = notification.getFeature();

		// case 1 - a root IAxis has been destroyed by the user
		if (feature == NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis()) {
			for (Object value : oldValues) {
				if (value instanceof ITreeItemAxis && !(((ITreeItemAxis) value).getElement() instanceof ITreeItemAxis)) {
					manageRemoveITreeItemAxisForSemanticElement((ITreeItemAxis) value);
				}
			}
			return;
		}

		// case 2 - a semantic element has been removed
		for (Object val : oldValues) {
			manageRemoveSemanticElement(val);
		}
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#canDestroyAxisElement(java.lang.Integer)
	 *
	 * @param axisIndex
	 * @return
	 */
	@Override
	public boolean canDestroyAxisElement(Integer axisIndex) {
		return false;
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#getDestroyAxisElementCommand(org.eclipse.emf.transaction.TransactionalEditingDomain, java.lang.Integer)
	 *
	 * @param domain
	 * @param axisPosition
	 * @return
	 */
	@Override
	public Command getDestroyAxisElementCommand(TransactionalEditingDomain domain, Integer axisPosition) {
		return null;
	}

	/**
	 * Update the children of semanticElementRepresentation OR the roots of the table if the parameter is <code>null</code>
	 *
	 * Not really tested and not yet used in an offical Papyrus table
	 *
	 * @param semanticElementRepresentation
	 *            a {@link ITreeItemAxis} for which we want update the children, could be <code>null</code>, in this case we will update the root elements of the table
	 */
	protected void updateChildren(final ITreeItemAxis semanticElementRepresentation) {
		Assert.isTrue(semanticElementRepresentation == null || !(semanticElementRepresentation.getElement() instanceof TreeFillingConfiguration));
		ITreeItemAxis current = semanticElementRepresentation;
		if (current == null || (current.getParent() != null && this.alreadyExpanded.contains(current.getParent()))) {
			int nextDepth;
			Object context;
			if (semanticElementRepresentation == null) {
				nextDepth = 0;
				context = getTableContext();
			} else {
				nextDepth = getSemanticDepth(semanticElementRepresentation) + 1;
				context = semanticElementRepresentation.getElement();
			}

			List<TreeFillingConfiguration> confs = FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, nextDepth);
			for (TreeFillingConfiguration conf : confs) {
				ITreeItemAxis confRep = null;
				if (current != null) {
					confRep = getITreeItemAxisRepresentingObject(current.getChildren(), conf);
				} else if (nextDepth == 0) {
					if (managedElements.containsKey(conf)) {
						// we are on the root of the table, so the configuration can be represented only one time in the map
						confRep = managedElements.get(conf).iterator().next();
					}
				}

				final Collection<?> values = getFilteredValueAsCollection(conf, context, nextDepth);
				List<Object> knownElements = new ArrayList<Object>();
				List<ITreeItemAxis> toRemove = new ArrayList<ITreeItemAxis>();
				if (confRep != null) {
					List<ITreeItemAxis> children = new ArrayList<ITreeItemAxis>(confRep.getChildren());
					for (ITreeItemAxis child : children) {
						Object tmp = child.getElement();
						if (!values.contains(tmp)) {
							toRemove.add(child); // we can't remove them now, because confRep could be destroy here, and maybe we need it after
						}
						knownElements.add(child.getElement());
					}
					values.removeAll(knownElements);
					if (alreadyExpanded.contains(current)) {
						for (Object val : values) {
							addObject(confRep, val);
						}
					}

					for (ITreeItemAxis axis : toRemove) {
						removeObject(axis);
					}
				} else if (false == values.isEmpty()) {
					confRep = addObject(current, conf);
					if (alreadyExpanded.contains(current) || current == null) {// current==null for root
						for (Object val : values) {
							addObject(confRep, val);
						}
					}
				}
			}
		}
	}


	/**
	 * This method updates the contents of the table
	 *
	 * @param semanticElement
	 *            the semantic element for which we want to update the visibility
	 */
	protected void updateSemanticElement(final Object semanticElement) {
		if (FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), representedAxisManager, 0)) {
			// we update all the roots of the table : the element could be now visible or hidden
			updateChildren(null);
		}

		if (this.managedElements.containsKey(semanticElement)) {
			for (ITreeItemAxis sementicItemRep : this.managedElements.get(semanticElement)) {
				updateChildren(sementicItemRep);
			}
		}
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#managedHideShowCategoriesForDepth(java.util.List, java.util.List)
	 *
	 * @param depthToHide
	 * @param depthToShow
	 */
	@Override
	public void managedHideShowCategoriesForDepth(List<Integer> depthToHide, List<Integer> depthToShow) {
		hideCategories(depthToHide);
		showCategoriesForDepth(depthToShow);
	}

	/**
	 *
	 * @param depthToHide
	 *            the list of the depth for which we want to hide the categories
	 */
	protected void hideCategories(final List<Integer> depthToHide) {
		if (depthToHide == null || depthToHide.isEmpty()) {
			return;
		}
		RowHideShowLayer rowHideLayer = getRowHideShowLayer();
		if (rowHideLayer == null) {
			return;
		}
		NatTable natTable = (NatTable) getTableManager().getAdapter(NatTable.class);
		if (natTable == null) {
			return;
		}
		if (depthToHide != null && depthToHide.size() > 0) {
			Set<Integer> indexesToHide = new TreeSet<Integer>();
			for (Integer curr : depthToHide) {
				List<TreeFillingConfiguration> fillingConf = FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, curr);
				for (TreeFillingConfiguration treeFillingConfiguration : fillingConf) {
					if (this.managedElements.containsKey(treeFillingConfiguration)) {
						for (ITreeItemAxis axis : this.managedElements.get(treeFillingConfiguration)) {
							int index = getTableManager().getRowElementsList().indexOf(axis);
							ITreeItemAxis parentAxis = axis.getParent();
							if (parentAxis != null && parentAxis.isExpanded() && !axis.isExpanded()) {
								getTreeLayer().expandTreeRow(index);
								index = getTableManager().getRowElementsList().indexOf(axis);
							} else if (parentAxis == null) {
								getTreeLayer().expandTreeRow(index);
								index = getTableManager().getRowElementsList().indexOf(axis);
							}

							if (index != -1) {// -1 when not yet visible
								int convertedIndex = rowHideLayer.underlyingToLocalRowPosition(natTable, index);
								indexesToHide.add(convertedIndex);
							}
						}
					}
				}
			}

			if (indexesToHide.size() > 0) {
				int[] ar = new int[indexesToHide.size()];
				Iterator<Integer> iter = indexesToHide.iterator();
				int i = 0;
				while (iter.hasNext()) {
					ar[i] = iter.next();
					i++;
				}
				natTable.doCommand(new MultiRowHideCommand(rowHideLayer, ar));
			}
		}
	}

	/**
	 *
	 * @param depthToHide
	 *            the list of the depth for which we want to hide the categories
	 */
	protected void showCategoriesForDepth(final List<Integer> depthToShow) {
		if (depthToShow == null || depthToShow.isEmpty()) {
			return;
		}
		NatTable natTable = (NatTable) getTableManager().getAdapter(NatTable.class);
		if (natTable == null) {
			return;
		}
		List<Integer> indexesToShow = new ArrayList<Integer>();
		for (Integer curr : depthToShow) {
			List<TreeFillingConfiguration> fillingConf = FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, curr);
			for (TreeFillingConfiguration treeFillingConfiguration : fillingConf) {
				if (this.managedElements.containsKey(treeFillingConfiguration)) {
					for (ITreeItemAxis axis : this.managedElements.get(treeFillingConfiguration)) {
						indexesToShow.add(getTableManager().getRowElementsList().indexOf(axis));
					}
				}
			}
		}
		if (indexesToShow.size() > 0) {
			natTable.doCommand(new MultiRowShowCommand(indexesToShow));
		}
	}

	/**
	 *
	 * @return
	 *         the row hide show layer
	 */
	protected final RowHideShowLayer getRowHideShowLayer() {
		if (this.tableManager != null && this.tableManager.getBodyLayerStack() != null) {
			return this.tableManager.getBodyLayerStack().getRowHideShowLayer();
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList#fillingConfigurationsHaveChanged()
	 *
	 */
	@Override
	public void fillingConfigurationsHaveChanged() {
		List<TreeFillingConfiguration> oldFillingConfiguration = this.currentFillingConfiguration;
		List<TreeFillingConfiguration> newFillingConf = FillingConfigurationUtils.getTreeFillingConfiguration(getTable(), this.representedAxisManager);
		this.currentFillingConfiguration = newFillingConf;
		if (oldFillingConfiguration.equals(newFillingConf)) {
			return;
		}


		// 1. we remove all filling configuration which have been deleted
		List<TreeFillingConfiguration> confToRemove = new ArrayList<TreeFillingConfiguration>(oldFillingConfiguration);
		confToRemove.removeAll(newFillingConf);
		for (TreeFillingConfiguration current : confToRemove) {
			if (managedElements.containsKey(current)) {
				Set<ITreeItemAxis> axisRepresentation = new HashSet<ITreeItemAxis>(managedElements.get(current));
				for (ITreeItemAxis tmp : axisRepresentation) {
					removeObject(tmp);
				}
			}
		}

		List<TreeFillingConfiguration> confToAdd = new ArrayList<TreeFillingConfiguration>(newFillingConf);
		confToAdd.removeAll(oldFillingConfiguration);
		if (confToAdd.isEmpty()) {
			return;
		}
		for (TreeFillingConfiguration treeFillingConfiguration : confToAdd) {
			int depth = treeFillingConfiguration.getDepth();
			if (depth == 0) {
				updateChildren(null);
			} else {
				for (TreeFillingConfiguration previousConfig : FillingConfigurationUtils.getTreeFillingConfigurationForDepth(getTable(), representedAxisManager, depth - 1)) {
					if (this.managedElements.containsKey(previousConfig)) {
						for (ITreeItemAxis axis : this.managedElements.get(previousConfig)) {
							for (ITreeItemAxis child : axis.getChildren()) {
								updateSemanticElement(child.getElement());
							}
						}
					}
				}
			}
		}
	}
}
