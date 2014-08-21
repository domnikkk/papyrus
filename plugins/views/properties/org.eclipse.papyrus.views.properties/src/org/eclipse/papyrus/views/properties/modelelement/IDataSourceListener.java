/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.views.properties.modelelement;

import java.util.EventListener;

import org.eclipse.core.databinding.observable.IObservable;


/**
 * A listener protocol for changes to a {@link DataSource} (especially its selection). Data sources are not {@linkplain IObservable observables} because that would confuse the XWT bindings framework.
 *
 * @see DataSource
 * @see DataSource#addDataSourceListener(IDataSourceListener)
 */
public interface IDataSourceListener extends EventListener {

	void dataSourceChanged(DataSourceChangedEvent event);
}
