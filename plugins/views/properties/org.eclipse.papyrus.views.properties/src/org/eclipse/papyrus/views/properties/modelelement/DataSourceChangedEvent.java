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

import java.util.EventObject;


/**
 * This is the DataSourceChangedEvent type. Enjoy.
 */
public class DataSourceChangedEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	DataSourceChangedEvent(DataSource source) {
		super(source);
	}

	public DataSource getDataSource() {
		return (DataSource)getSource();
	}
}
