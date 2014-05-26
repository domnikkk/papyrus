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

package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This interface is used to collect the data needed to create or update a {@link Stereotype}.
 * 
 * @author cedric dumoulin
 *
 */
public interface IStereotypeUpdateArgs {


	public abstract void setStereotypeToUpdate(Stereotype stereotypeToUpdate);

	public abstract Stereotype getStereotypeToUpdate();

	public abstract void setProfileName(String profileName);

	public abstract String getProfileName();

	public abstract void setStereotypeName(String stereotypeName);

	public abstract String getStereotypeName();

	public abstract List<Stereotype> getExtendedStereotypes();

	public abstract List<Class> getExtendedMetaclasses();

}
