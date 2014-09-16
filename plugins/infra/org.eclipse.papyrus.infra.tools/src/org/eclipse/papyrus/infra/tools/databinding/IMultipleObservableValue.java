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

package org.eclipse.papyrus.infra.tools.databinding;

import java.util.List;

import org.eclipse.core.databinding.observable.value.IObservableValue;



/**
 * Interface for a multiple selection of observable values.
 */
public interface IMultipleObservableValue extends AggregatedObservable, IObservableValue {

	/**
	 * @return the list of sub-observable values
	 */
	List<IObservableValue> getObservableValues();

	/**
	 * @return the list of observed values
	 */
	List<Object> getObservedValues();

}