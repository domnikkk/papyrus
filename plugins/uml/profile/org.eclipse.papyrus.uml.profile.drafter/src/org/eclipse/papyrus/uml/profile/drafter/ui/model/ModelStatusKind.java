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

import java.lang.annotation.Inherited;

import org.eclipse.uml2.uml.Stereotype;


/**
 * States of a ui model.
 * {@link #created} : The model is created by the user
 * {@link #owned} : The model is deduced from a property directly owned by the {@link Stereotype}
 * {@link Inherited} : The model is deduced from a property inherited by the {@link Stereotype}.
 * 
 * @author cedric dumoulin
 *
 */
public enum ModelStatusKind {

	created, inherited, owned;
}
