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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.ui.NatEventData;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.listener.UpdateTableContentListener;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderPackage;
import org.eclipse.papyrus.infra.nattable.utils.AxisComparator;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.EventListHelper;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.widgets.providers.CompoundFilteredRestrictedContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IRestrictedContentProvider;

import ca.odell.glazedlists.EventList;

/**
 * @author VL222926
 *
 */
public class CompositeAxisManagerForEventList extends AbstractAxisManagerForEventList implements IAxisManagerForEventList, ICompositeAxisManager {

	/**
	 * the id of this manager
	 */
	@SuppressWarnings("unused")
	private static final String MANAGER_ID = "org.eclipse.papyrus.infra.nattable.composite.axis.manager.event.list"; //$NON-NLS-1$

	/**
	 * the sub managers
	 */
	protected List<IAxisManagerForEventList> subManagers;

	/**
	 * the comparator used to sort the axis
	 */
	protected Comparator<Object> axisComparator;

	/**
	 * the resouce set listener
	 */
	private ResourceSetListener resourceSetListener;

	/**
	 * Constructor.
	 *
	 */
	public CompositeAxisManagerForEventList(final EventList<Object> eventList) {
		setEventList(eventList);
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#addListeners()
	 *
	 */
	@Override
	protected void addListeners() {
		this.resourceSetListener = new UpdateTableContentListener(getTableManager(), this);
		getTableEditingDomain().addResourceSetListener(this.resourceSetListener);
	}


	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ICompositeAxisManager#setSubAxisManager(java.util.List)
	 *
	 * @param managers
	 */
	@Override
	public final void setSubAxisManager(final List<IAxisManager> managers) {
		throw new UnsupportedOperationException("Use setSubAxisManagers(List<IAxisManagerForEventList> manager)"); //$NON-NLS-1$
	}

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
		for (final IAxis current : getRepresentedContentProvider().getAxis()) {
			if (current instanceof ITreeItemAxis) {
				EventListHelper.addToEventList(eventList, current);
			}
		}
	}

	/**
	 * @param subManagers
	 *            the subManagers to set
	 */
	public void setSubManagers(List<IAxisManagerForEventList> subManagers) {
		this.subManagers = subManagers;
		for (IAxisManagerForEventList current : subManagers) {
			current.setEventList(eventList);
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#dispose()
	 *
	 */
	@Override
	public void dispose() {
		removeListeners();
		super.dispose();
		for (final IAxisManager current : this.subManagers) {
			current.dispose();
		}
		this.subManagers.clear();

	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#removeListeners()
	 *
	 */
	@Override
	protected void removeListeners() {
		getTableEditingDomain().removeResourceSetListener(this.resourceSetListener);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canBeUsedAsRowManager()
	 *
	 * @return
	 */
	@Override
	public boolean canBeUsedAsRowManager() {
		boolean answer = true;
		final Iterator<IAxisManagerForEventList> iter = this.subManagers.iterator();
		while (iter.hasNext() && answer) {
			answer = iter.next().canBeUsedAsRowManager();
		}
		return answer;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canBeUsedAsColumnManager()
	 *
	 * @return
	 */
	@Override
	public boolean canBeUsedAsColumnManager() {
		boolean answer = true;
		final Iterator<IAxisManagerForEventList> iter = this.subManagers.iterator();
		while (iter.hasNext() && answer) {
			answer = iter.next().canBeUsedAsColumnManager();
		}
		return answer;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canCreateAxisElement(java.lang.String)
	 *
	 * @param elementId
	 * @return
	 */
	@Override
	public boolean canCreateAxisElement(String elementId) {
		boolean canCreateAxisElement = false;
		for (IAxisManager manager : subManagers) {
			canCreateAxisElement |= manager.canCreateAxisElement(elementId);
		}
		return canCreateAxisElement;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getAddAxisCommand(TransactionalEditingDomain, java.util.Collection)
	 *
	 * @param domain
	 * @param objectToAdd
	 * @return
	 */
	@Override
	public Command getAddAxisCommand(final TransactionalEditingDomain domain, final Collection<Object> objectToAdd) {
		if (FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(this.tableManager.getTable(), 0)) {
			return null;
		}
		final CompoundCommand cmd = new CompoundCommand(Messages.CompositeAxisManager_AddAxisCommand);
		for (final IAxisManager current : this.subManagers) {
			final Command tmp = current.getAddAxisCommand(domain, objectToAdd);
			if (tmp != null) {
				cmd.append(tmp);
			}
		}
		if (cmd.isEmpty()) {
			return null;
		}
		return cmd;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#initializeManagedObjectList()
	 *
	 */
	@Override
	protected void initializeManagedObjectList() {
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getComplementaryAddAxisCommand(TransactionalEditingDomain, java.util.Collection)
	 *
	 * @param domain
	 * @param objectToAdd
	 * @return
	 */
	@Override
	public Command getComplementaryAddAxisCommand(final TransactionalEditingDomain domain, final Collection<Object> objectToAdd) {
		final CompoundCommand cmd = new CompoundCommand(Messages.CompositeAxisManager_AddAxisCommand);
		for (final IAxisManager current : this.subManagers) {
			final Command tmp = current.getComplementaryAddAxisCommand(domain, objectToAdd);
			if (tmp != null) {
				cmd.append(tmp);
			}
		}
		if (cmd.isEmpty()) {
			return null;
		}
		return cmd;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#isAllowedContents(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public boolean isAllowedContents(Object object) {
		for (final IAxisManager current : this.subManagers) {
			if (current.isAllowedContents(object)) {
				return true;
			}
		}
		return false;
	}



	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canMoveAxis()
	 *
	 * @return
	 */
	@Override
	public boolean canMoveAxis() {
		for (final IAxisManager current : this.subManagers) {
			if (!current.canMoveAxis() || current.isDynamic()) {
				return false;
			}
		}
		return true;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#sortAxisByName(boolean, org.eclipse.nebula.widgets.nattable.config.IConfigRegistry)
	 *
	 * @param inverted
	 * @param configRegistry
	 */
	@Override
	public void sortAxisByName(boolean alphabeticOrder, final IConfigRegistry configRegistry) {
		if (canMoveAxis()) {
			final List<IAxis> axis = new ArrayList<IAxis>(getRepresentedContentProvider().getAxis());
			Collections.sort(axis, new AxisComparator(alphabeticOrder, configRegistry));
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getRepresentedContentProvider());
			final AbstractEditCommandRequest request = new SetRequest(domain, getRepresentedContentProvider(), NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis(), axis);
			final IElementEditService provider = ElementEditServiceUtils.getCommandProvider(getRepresentedContentProvider());
			final ICommand cmd = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(cmd));
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#createPossibleAxisContentProvider(boolean)
	 *
	 * @param isRestricted
	 * @return a contents provider for this axis or <code>null</code> if it is not allowed
	 */
	@Override
	public IRestrictedContentProvider createPossibleAxisContentProvider(boolean isRestricted) {

		CompoundFilteredRestrictedContentProvider compoundContentProvider = null;
		for (final IAxisManager current : this.subManagers) {
			IRestrictedContentProvider contentProvider = current.createPossibleAxisContentProvider(isRestricted);
			if (contentProvider != null) {
				if (compoundContentProvider == null) {
					compoundContentProvider = new CompoundFilteredRestrictedContentProvider();
				}
				compoundContentProvider.add(contentProvider);
			}
		}
		return compoundContentProvider;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getDestroyAxisCommand(TransactionalEditingDomain, java.util.Collection)
	 *
	 * @param domain
	 * @param objectToDestroy
	 * @return
	 */
	@Override
	public Command getDestroyAxisCommand(TransactionalEditingDomain domain, Collection<Object> objectToDestroy) {
		final CompoundCommand cmd = new CompoundCommand(Messages.CompositeAxisManager_DestroyAxisCommand);
		for (final IAxisManager current : this.subManagers) {
			final Command tmp = current.getDestroyAxisCommand(domain, objectToDestroy);
			if (tmp != null) {
				cmd.append(tmp);
			}
		}
		if (cmd.isEmpty()) {
			return null;
		}
		return cmd;
	}




	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#isSlave()
	 *
	 * @return
	 *         <code>true</code> if one of the encapsulated manager is a slave
	 */
	@Override
	public boolean isSlave() {
		for (final IAxisManager manager : this.subManagers) {
			if (manager.isSlave()) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#isDynamic()
	 *
	 * @return
	 *         <code>true</code> if one of the embedded axis manager is dynamic
	 */
	@Override
	public boolean isDynamic() {
		for (final IAxisManager manager : this.subManagers) {
			if (manager.isDynamic()) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canDropAxisElement(java.util.Collection)
	 *
	 * @param objectsToAdd
	 * @return
	 */
	@Override
	public boolean canDropAxisElement(Collection<Object> objectsToAdd) {
		for (final IAxisManager current : this.subManagers) {
			if (current.canDropAxisElement(objectsToAdd)) {
				return true;
			}
		}
		return false;
	}


	/**
	 *
	 * @param elementToMove
	 * @param newIndex
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#moveAxis(java.lang.Object, int)
	 */
	@Override
	public void moveAxis(Object elementToMove, int newIndex) {
		if (!isDynamic() && elementToMove instanceof IAxis) {
			TransactionalEditingDomain domain = getTableEditingDomain();
			final Command command = MoveCommand.create(domain, getRepresentedContentProvider(), NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis(), elementToMove, newIndex);
			domain.getCommandStack().execute(command);
		}
	}

	@Override
	public boolean canEditAxisHeader(final NatEventData axisIndex) {
		if (canEditAxisHeader()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canEditAxisHeader()
	 *
	 * @return
	 */
	@Override
	public boolean canEditAxisHeader() {
		for (final IAxisManager current : this.subManagers) {
			if (!current.canEditAxisHeader()) {
				return false;
			}
		}
		return true;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getElementAxisName(org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis)
	 *
	 * @param axis
	 * @return
	 */
	@Override
	public String getElementAxisName(final IAxis axis) {
		final AxisManagerRepresentation manager = axis.getManager();
		for (final IAxisManager man : this.subManagers) {
			if (man.getAxisManagerRepresentation() == manager) {
				return man.getElementAxisName(axis);
			}
		}
		if (canEditAxisHeader()) {
			return null;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 *
	 * @param axis
	 *            an axis
	 * @return
	 *         the axis manager managing this axis
	 */
	protected IAxisManager getAxisManager(final IAxis axis) {
		final AxisManagerRepresentation rep = axis.getManager();
		for (final IAxisManager man : this.subManagers) {
			if (man.getAxisManagerRepresentation() == rep) {
				return man;
			}
		}
		return null;// must be impossible
	}


	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canDestroyAxis(java.lang.Integer)
	 *
	 * @param axisPosition
	 * @return
	 */
	@Override
	public boolean canDestroyAxis(final Integer axisPosition) {
		final List<Object> elements = getElements();
		final Object element = elements.get(axisPosition);
		if (element instanceof IAxis) {
			return getAxisManager((IAxis) element).canDestroyAxis(axisPosition);
		}
		// not yet managed
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#canDestroyAxisElement(java.lang.Integer)
	 *
	 * @param axisPosition
	 * @return
	 */
	@Override
	public boolean canDestroyAxisElement(Integer axisPosition) {
		final List<Object> elements = getElements();
		final Object element = elements.get(axisPosition);
		if (element instanceof IAxis) {
			return getAxisManager((IAxis) element).canDestroyAxisElement(axisPosition);
		} else if (subManagers.size() == 1) {
			return subManagers.get(0).canDestroyAxisElement(axisPosition);
		}
		// not yet managed
		return false;
	}


	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager#getDestroyAxisElementCommand(TransactionalEditingDomain, java.lang.Integer)
	 *
	 * @param domain
	 * @param axisPosition
	 * @return
	 */
	@Override
	public Command getDestroyAxisElementCommand(TransactionalEditingDomain domain, Integer axisPosition) {
		final List<Object> elements = getElements();
		final Object element = elements.get(axisPosition);
		if (element instanceof IAxis) {
			return getAxisManager((IAxis) element).getDestroyAxisElementCommand(domain, axisPosition);
		} else if (subManagers.size() == 1) {
			return subManagers.get(0).getDestroyAxisElementCommand(domain, axisPosition);
		}
		// not yet managed
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public boolean canBeSavedAsConfig() {
		boolean canBeSavedAsConfig = true;
		for (IAxisManager manager : subManagers) {
			canBeSavedAsConfig &= manager.canBeSavedAsConfig();
		}
		return canBeSavedAsConfig;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#getAdapter(java.lang.Class)
	 *
	 * @param adapter
	 * @return
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		for (final IAxisManager current : this.subManagers) {
			if (current.getClass() == adapter) {
				return current;
			}
		}
		return super.getAdapter(adapter);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ICompositeAxisManager#isInSortedState()
	 *
	 * @return
	 */
	@Override
	public boolean isInSortedState() {
		return this.axisComparator != null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ICompositeAxisManager#setAxisComparator(java.util.Comparator)
	 *
	 * @param comp
	 */
	@Override
	public void setAxisComparator(final Comparator<Object> comp) {
		this.axisComparator = comp;
		if (this.axisComparator != null) {
			List<Object> displayedElement = getElements();
			synchronized (displayedElement) {
				Collections.sort(displayedElement, comp);
				getTableManager().refreshNatTable();// useful?
			}
		} else {
			getTableManager().updateAxisContents(getRepresentedContentProvider());
		}
	}



	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#isAlreadyManaged(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public boolean isAlreadyManaged(final Object object) {
		for (final IAxisManager current : this.subManagers) {
			if (current.isAlreadyManaged(object)) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ICompositeAxisManager#getSetNewAxisOrderCommand(java.util.List)
	 *
	 * @param newOrder
	 * @return
	 */
	@Override
	public Command getSetNewAxisOrderCommand(final List<Object> newOrder) {
		if (canMoveAxis() && !isDynamic()) {
			return new RecordingCommand(getTableEditingDomain()) {

				@Override
				protected void doExecute() {
					final TreeMap<Integer, IAxis> order = new TreeMap<Integer, IAxis>();
					final AbstractAxisProvider provider = getRepresentedContentProvider();
					for (int i = 0; i < provider.getAxis().size(); i++) {
						final IAxis currentAxis = provider.getAxis().get(i);
						int index = newOrder.indexOf(currentAxis);
						if (index != -1) {
							order.put(Integer.valueOf(index), currentAxis);
						} else {
							Object resolvedObject = AxisUtils.getRepresentedElement(currentAxis);
							if (currentAxis instanceof IdAxis) {
								resolvedObject = getResolvedPath((IdAxis) currentAxis);
							}
							index = newOrder.indexOf(resolvedObject);
							if (index == -1) {
								throw new IndexOutOfBoundsException("A reordered element can't be resolved"); //$NON-NLS-1$
							}
							order.put(Integer.valueOf(index), currentAxis);
						}
					}

					final List<IAxis> newValues = new ArrayList<IAxis>();
					newValues.addAll(order.values());
					SetCommand.create(getTableEditingDomain(), provider, NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis(), newValues).execute();
				}
			};
		}
		return null;
	}

	/**
	 *
	 * @param axisManagerId
	 *            an axis
	 * @return
	 *         the axis manager managing it
	 */
	protected IAxisManager findAxisManager(final IAxis axis) {
		final String axisManagerId = axis.getManager().getAxisManagerId();
		for (final IAxisManager currentManager : this.subManagers) {
			if (currentManager.getAxisManagerRepresentation().getAxisManagerId().equals(axisManagerId)) {
				return currentManager;
			}
		}
		return null;
	}

	/**
	 *
	 * @param idAxis
	 *            an idAxis
	 * @return
	 *         the resolved path or the {@link String} represented by the idAxis if the path can't be resolved
	 */
	protected Object getResolvedPath(final IdAxis idAxis) {
		final String path = idAxis.getElement();
		final IAxisManager manager = findAxisManager(idAxis);
		if (manager instanceof IIdAxisManager) {
			final Object resolvedElement = ((IIdAxisManager) manager).resolvedPath(path);
			if (resolvedElement != null) {
				return resolvedElement;
			}
		}
		return path;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#manageSetNotification(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	protected void manageSetNotification(Notification notification) {
		propagateEvent(notification);
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManagerForEventList#manageUnsetNotification(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	protected void manageUnsetNotification(Notification notification) {
		propagateEvent(notification);
	}

	@Override
	protected void manageAddNotification(final Notification notification) {
		final Object newValue = notification.getNewValue();
		if (newValue instanceof IAxis && ((IAxis) newValue).eContainer() != null) {
			EventListHelper.addToEventList(eventList, newValue);
		}
		propagateEvent(notification);
	}



	@Override
	protected void manageAddManyNotification(final Notification notification) {
		final Object newValue = notification.getNewValue();
		if (newValue instanceof Collection<?>) {
			for (Object current : (Collection<?>) newValue) {
				if (current instanceof IAxis) {
					EventListHelper.addToEventList(eventList, current);
				}
			}

		}
		propagateEvent(notification);
	}

	@Override
	protected void manageMoveNotification(final Notification notification) {
		propagateEvent(notification);
	}

	@Override
	protected void manageRemoveNotification(final Notification notification) {
		final Object oldValue = notification.getOldValue();
		propagateEvent(notification);
		if (oldValue instanceof IAxis) {
			EventListHelper.removeFromEventList(eventList, oldValue);
		}
	}

	@Override
	protected void manageRemoveManyNotification(final Notification notification) {
		final Object oldValue = notification.getNewValue();
		propagateEvent(notification);
		if (oldValue instanceof Collection<?>) {
			for (Object current : (Collection<?>) oldValue) {
				if (current instanceof IAxis) {
					EventListHelper.removeFromEventList(eventList, current);
				}
			}

		}
	}

	/**
	 * This method propagates the notification to the submanagers in order to update the event list
	 *
	 * @param notification
	 *            a notification
	 *
	 */
	protected void propagateEvent(Notification notification) {
		for (final IAxisManager current : this.subManagers) {
			if (current instanceof IAxisManagerForEventList) {
				((IAxisManagerForEventList) current).manageEvent(notification);
			}
		}
		// must not be done here -> to many refresh are done
		// getTableManager().refreshNatTable();
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ICompositeAxisManager#updateAxisContents()
	 * @deprecated must be removed from the API
	 */
	@Override
	@Deprecated
	public void updateAxisContents() {
		// nothing to do
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList#treeFillingConfigurationHaveChanged()
	 *
	 */
	@Override
	public void fillingConfigurationsHaveChanged() {
		for (final IAxisManager current : this.subManagers) {
			if (current instanceof IAxisManagerForEventList) {
				((IAxisManagerForEventList) current).fillingConfigurationsHaveChanged();
			}
		}
		// required
		getTableManager().refreshNatTable();
	}
}
