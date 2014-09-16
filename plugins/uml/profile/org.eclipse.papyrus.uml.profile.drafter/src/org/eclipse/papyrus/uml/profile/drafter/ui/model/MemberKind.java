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
 * Enumeration use to specify the type of a Member. Type can be inherited, owned.
 * {@link #owned} : The member is directly owned by its container
 * {@link Inherited} : The container inherit the member by a inheritance mechanism..
 * 
 * @author cedric dumoulin
 *
 */
public enum MemberKind {

	inherited, owned;
}
