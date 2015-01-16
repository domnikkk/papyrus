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
package org.eclipse.papyrus.infra.nattable.dataprovider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisIndexStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.tools.util.IntegerAndSpreadsheetNumberConverter;

/**
 *
 * Abstract class used to display index header
 *
 */
public abstract class AbstractIndexHeaderDataProvider extends AbstractDataProvider {

	/** fields used to know what display in the headers */
	protected boolean displayIndex;

	/** the style used to display the index of the axis */
	protected AxisIndexStyle style;


	/** listener on {@link Table#isInvertAxis()} feature */
	private Adapter invertedListener;

	/**
	 * listener on the axis configuration
	 */
	private Adapter axisListener;

	/**
	 * listener on the table
	 */
	private Adapter localHeaderConfigListener;

	/**
	 * the listen axis configuration
	 */
	private AbstractHeaderAxisConfiguration listenAxisConfiguration;

	/**
	 *
	 * Constructor.
	 *
	 * @param tableModelManager
	 *            the table manager
	 */
	public AbstractIndexHeaderDataProvider(final INattableModelManager tableModelManager) {
		super(tableModelManager);
		this.listenAxisConfiguration = getAxisConfiguration();
		initListeners();
		this.manager.getTable().eAdapters().add(this.invertedListener);
		this.manager.getTable().eAdapters().add(this.localHeaderConfigListener);
		initFields();
	}


	/**
	 * Create the listeners, but doesn't assign them to an object
	 */
	protected void initListeners() {
		this.axisListener = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				final Object feature = msg.getFeature();
				if (feature != null) {
					if (feature.equals(NattableaxisconfigurationPackage.eINSTANCE.getAbstractHeaderAxisConfiguration_DisplayIndex())) {
						displayIndex = msg.getNewBooleanValue();
					} else if (feature.equals(NattableaxisconfigurationPackage.eINSTANCE.getAbstractHeaderAxisConfiguration_IndexStyle())) {
						style = AxisIndexStyle.get(msg.getNewStringValue());
					}
				}
			}
		};
		this.invertedListener = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == NattablePackage.eINSTANCE.getTable_InvertAxis()) {
					final Object oldValue = msg.getOldValue();
					final Object newValue = msg.getNewValue();
					if (oldValue != null && newValue != null) {
						initFields();
					}
				}
			}
		};

		this.localHeaderConfigListener = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == NattablePackage.eINSTANCE.getTable_LocalColumnHeaderAxisConfiguration() || msg.getFeature() == NattablePackage.eINSTANCE.getTable_LocalRowHeaderAxisConfiguration()) {
					initFields();
				}
			}
		};
	}

	/**
	 * init the field value, and update the listen axis if required
	 */
	private void initFields() {
		if (this.listenAxisConfiguration != getAxisConfiguration() && this.listenAxisConfiguration != null) {
			this.listenAxisConfiguration.eAdapters().remove(this.axisListener);
		}
		this.listenAxisConfiguration = getAxisConfiguration();
		if (this.listenAxisConfiguration != null) {
			this.listenAxisConfiguration.eAdapters().add(this.axisListener);
			if (this.listenAxisConfiguration instanceof AbstractHeaderAxisConfiguration) {
				AbstractHeaderAxisConfiguration config = this.listenAxisConfiguration;
				this.style = config.getIndexStyle();
				this.displayIndex = config.isDisplayIndex();
			}
		}
	}

	/**
	 *
	 * @param axisIndex
	 *            the index of the axis
	 * @return
	 *         the index to display according to the index style
	 */
	protected Object getAxisIndex(int axisIndex) {
		if (axisIndex > -1) {
			switch (this.style) {
			case ALPHABETIC:
				return IntegerAndSpreadsheetNumberConverter.toString(axisIndex + 1);
			case NUMERIC:
				return axisIndex;
			}
		}
		return null;
	}


	/**
	 * remove the listener
	 */
	protected void removeListeners() {
		if (this.listenAxisConfiguration != null) {
			this.listenAxisConfiguration.eAdapters().remove(this.axisListener);
		}
		this.manager.getTable().eAdapters().remove(this.invertedListener);
		this.manager.getTable().eAdapters().remove(this.localHeaderConfigListener);
	}

	/**
	 *
	 * @return
	 *         the axis configuration to listen
	 */
	protected abstract AbstractHeaderAxisConfiguration getAxisConfiguration();

}
