/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.ui.model;


/**
 * State indicating the life status of a model. Possible values are:
 * {@link #alive} The model is alived. Its values are taken into account.
 * {@link #deleted} The user has requested to delete the model. It will be deleted later (when all requested modifications will be applied).
 * 
 * @author cedric dumoulin
 *
 */
public enum LifeStatusKind {

	running, deleted;
}
