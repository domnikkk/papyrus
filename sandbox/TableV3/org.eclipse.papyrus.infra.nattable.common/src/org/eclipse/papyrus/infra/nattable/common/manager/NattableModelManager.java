/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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
package org.eclipse.papyrus.infra.nattable.common.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.nattable.common.Activator;
import org.eclipse.papyrus.infra.nattable.common.factory.AxisManagerFactory;
import org.eclipse.papyrus.infra.nattable.common.solver.CellManagerFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecontentprovider.IAxisContentsProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;


public class NattableModelManager implements INattableModelManager {

	/**
	 * the column manager
	 */
	private IAxisManager columnManager;

	/**
	 * the line manager
	 */
	private IAxisManager rowManager;

	/**
	 * the model of the table on which we are working
	 */
	private final Table pTable;

	private List<Object> verticalElements;

	private List<Object> horizontalElements;

	private Adapter invertAxisListener;

	private IAxisContentsProvider rowProvider;

	private IAxisContentsProvider columnProvier;

	/**
	 *
	 * Constructor.
	 *
	 * @param rawModel
	 *
	 *        the model of the managed table
	 */
	public NattableModelManager(final Table rawModel) {
		this.pTable = rawModel;
		this.rowProvider = rawModel.getHorizontalContentProvider();
		this.columnProvier = rawModel.getVerticalContentProvider();
		this.verticalElements = new ArrayList<Object>();
		this.horizontalElements = new ArrayList<Object>();
		this.invertAxisListener = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if(msg.getEventType() == Notification.SET) {
					final Object oldValue = msg.getOldValue();
					final Object newValue = msg.getNewValue();
					if(oldValue != null && newValue != null) {
						if(msg.getFeature() == NattablePackage.eINSTANCE.getTable_HorizontalContentProvider()) {//do command and redo command
							if(oldValue == NattableModelManager.this.rowProvider && newValue == NattableModelManager.this.columnProvier) {
								NattableModelManager.this.columnProvier = NattableModelManager.this.rowProvider;
								NattableModelManager.this.rowProvider = (IAxisContentsProvider)newValue;
								List<Object> oldVertcialElement = NattableModelManager.this.verticalElements;
								NattableModelManager.this.verticalElements = NattableModelManager.this.horizontalElements;
								NattableModelManager.this.horizontalElements = oldVertcialElement;
								IAxisManager oldRowManager = NattableModelManager.this.rowManager;
								NattableModelManager.this.rowManager = NattableModelManager.this.columnManager;
								NattableModelManager.this.columnManager = oldRowManager;
								getNatTable().refresh();
							}
						} else if(msg.getFeature() == NattablePackage.eINSTANCE.getTable_VerticalContentProvider()) {//undo command
							if(oldValue == NattableModelManager.this.columnProvier && newValue == NattableModelManager.this.rowProvider) {
								NattableModelManager.this.columnProvier = NattableModelManager.this.rowProvider;
								NattableModelManager.this.rowProvider = (IAxisContentsProvider)oldValue;
								List<Object> oldVertcialElement = NattableModelManager.this.verticalElements;
								NattableModelManager.this.verticalElements = NattableModelManager.this.horizontalElements;
								NattableModelManager.this.horizontalElements = oldVertcialElement;
								IAxisManager oldRowManager = NattableModelManager.this.rowManager;
								NattableModelManager.this.rowManager = NattableModelManager.this.columnManager;
								NattableModelManager.this.columnManager = oldRowManager;
								getNatTable().refresh();
							}
						}
					}
				}
			}
		};
		rawModel.eAdapters().add(this.invertAxisListener);
		init();
	}

	/**
	 * create the line and the columns managers
	 */
	protected void init() {
		final List<String> verticalContentProviderIds = getVerticalContentProviderIds();
		assert !verticalContentProviderIds.isEmpty();
		this.columnManager = createAxisManager(verticalContentProviderIds, this.pTable.getVerticalContentProvider());

		final List<String> horizontalContentProviderIds = getHorizontalContentProviderIds();
		assert !horizontalContentProviderIds.isEmpty();
		this.rowManager = createAxisManager(horizontalContentProviderIds, this.pTable.getHorizontalContentProvider());
	}

	/**
	 *
	 * @param ids
	 *        the ids of the axis manager to use
	 * @param contentProvider
	 *        the content provider in the model
	 * @return
	 *         the created axis manager to use to manage the {@link IAxisContentsProvider}
	 */
	protected IAxisManager createAxisManager(final List<String> ids, final IAxisContentsProvider contentProvider) {
		final List<IAxisManager> managers = new ArrayList<IAxisManager>();
		for(final String id : ids) {
			final IAxisManager manager = AxisManagerFactory.INSTANCE.getAxisManager(this, id, this.pTable, contentProvider, ids.size() == 1);
			assert manager != null;
			managers.add(manager);
		}
		IAxisManager manager = null;
		if(managers.size() > 1) {
			manager = new CompositeAxisManager();
			manager.init(this, "", this.pTable, contentProvider, true);
			((CompositeAxisManager)manager).setAxisManager(managers);
		} else {
			manager = managers.get(0);
		}
		return manager;
	}

	/**
	 *
	 * @return
	 *         the list of the ids of the axis manager to use for the vertical axis
	 */
	protected List<String> getVerticalContentProviderIds() {
		return this.pTable.getVerticalContentProvider().getJavaContentProviderIds();
	}

	/**
	 *
	 * @return
	 *         the list of the ids of the axis manager to use for the horizontal axis
	 */

	protected List<String> getHorizontalContentProviderIds() {
		return this.pTable.getHorizontalContentProvider().getJavaContentProviderIds();
	}

	/**
	 *
	 * @see org.eclipse.ui.services.IDisposable#dispose()
	 *
	 */
	public void dispose() {
		this.columnManager.dispose();
		this.rowManager.dispose();
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager#addRows(java.util.Collection)
	 *
	 * @param objectToAdd
	 *        the list of the objects to add in rows
	 */
	public void addRows(final Collection<Object> objectToAdd) {
		final EditingDomain domain = getEditingDomain(this.pTable);
		final CompoundCommand cmd = new CompoundCommand("Add rows command");
		Command tmp = this.rowManager.getAddAxisCommand(domain, objectToAdd);
		if(tmp != null) {
			cmd.append(tmp);
		}
		tmp = this.columnManager.getComplementaryAddAxisCommand(domain, objectToAdd);
		if(tmp != null) {
			cmd.append(tmp);
		}
		if(!cmd.isEmpty()) {
			domain.getCommandStack().execute(cmd);
		}
	}

	//FIXME : this method should never be called, we should find another way to do the refresh
	private NatTable getNatTable() {
		final IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return (NatTable)part.getAdapter(NatTable.class);
	}

	/**
	 * called when the manager is used vertically
	 */
	public int getColumnCount() {
		return this.getColumnElementsList().size();
	}

	/**
	 * called when the manager is used horizontally
	 */

	public int getRowCount() {
		return this.getRowElementsList().size();
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager#addColumns(java.util.Collection)
	 *
	 * @param objectToAdd
	 *        the list of the objects to add in columns
	 */
	public void addColumns(final Collection<Object> objectToAdd) {
		final EditingDomain domain = getEditingDomain(this.pTable);
		final CompoundCommand cmd = new CompoundCommand("Add rows command");
		Command tmp = this.columnManager.getAddAxisCommand(domain, objectToAdd);
		if(tmp != null) {
			cmd.append(tmp);
		}
		tmp = this.rowManager.getComplementaryAddAxisCommand(domain, objectToAdd);
		if(tmp != null) {
			cmd.append(tmp);
		}
		if(!cmd.isEmpty()) {
			domain.getCommandStack().execute(cmd);
		}
	}

	/**
	 *
	 * @param obj
	 *        an eobject linked to the model
	 * @return
	 *         the editing domain to use
	 */
	private EditingDomain getEditingDomain(final EObject obj) {
		ServicesRegistry registry = null;
		try {
			registry = ServiceUtilsForResource.getInstance().getServiceRegistry(obj.eResource());
		} catch (final ServiceException e) {
			Activator.log.error("ServiceRegistry not found", e);
		}
		try {
			return registry.getService(TransactionalEditingDomain.class);
		} catch (final ServiceException e) {
			Activator.log.error("EditingDomain not found", e);
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager#getBodyDataProvider()
	 *
	 * @return
	 *         the data provider for the body of the table
	 */
	public IDataProvider getBodyDataProvider() {
		return this;
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#getDataValue(int, int)
	 *
	 * @param columnIndex
	 *        the index of the column
	 * @param rowIndex
	 *        the index of the row
	 * @return
	 *         the contents to display in the cell localted to columnIndex and rowIndex
	 */
	public Object getDataValue(final int columnIndex, final int rowIndex) {
		final Object obj1 = this.verticalElements.get(columnIndex);
		final Object obj2 = this.horizontalElements.get(rowIndex);
		return CellManagerFactory.INSTANCE.getCrossValue(obj1, obj2);
	}

	public void setDataValue(final int columnIndex, final int rowIndex, final Object newValue) {
		// TODO Auto-generated method stub
	}

	/**
	 * this method returns the column data provider and is able to manage inversion in the axis
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager#getColumnDataProvider()
	 *
	 * @return
	 *         the column data provider
	 */
	public IAxisManager getColumnDataProvider() {
		return this.columnManager;
	}

	/**
	 * this method returns the row data provider and is able to manage inversion in the axis
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager#getLineDataProvider()
	 *
	 * @return
	 *         the row data provider
	 */
	public IAxisManager getLineDataProvider() {
		return this.rowManager;
	}


	public void refreshNattable() {
		NatTable table = getNatTable();
		if(table != null && !table.isDisposed()) {
			table.refresh();
		}
	}

	public List<Object> getColumnElementsList() {
		return this.verticalElements;
	}

	public List<Object> getRowElementsList() {
		return this.horizontalElements;
	}

	public boolean canInsertRow(Collection<Object> objectsToAdd, int index) {
		return this.rowManager.canInsertAxis(objectsToAdd, index);
	}

	public boolean canInsertColumns(Collection<Object> objectsToAdd, int index) {
		return this.columnManager.canInsertAxis(objectsToAdd, index);
	}

	public boolean canDropColumnsElement(Collection<Object> objectsToAdd) {
		return this.columnManager.canDropAxisElement(objectsToAdd);
	}

	public boolean canDropRowElement(Collection<Object> objectsToAdd) {
		return this.rowManager.canDropAxisElement(objectsToAdd);
	}

	public void insertRows(Collection<Object> objectsToAdd, int index) {
		this.rowManager.getInsertAxisCommand(objectsToAdd, index);

	}

	public void insertColumns(Collection<Object> objectsToAdd, int index) {
		this.columnManager.getInsertAxisCommand(objectsToAdd, index);
	}

	public Object getColumnElement(int index) {
		return this.verticalElements.get(index);
	}

	public Object getRowElemen(int index) {
		return this.horizontalElements.get(index);
	}

	public List<Object> getElementsList(IAxisContentsProvider axisProvider) {
		if(axisProvider == this.columnProvier) {
			return this.verticalElements;
		} else if(axisProvider == this.rowProvider) {
			return this.horizontalElements;
		}
		return null;
	}

}
