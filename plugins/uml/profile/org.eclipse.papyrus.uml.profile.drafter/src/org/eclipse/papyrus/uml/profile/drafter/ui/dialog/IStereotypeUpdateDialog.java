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

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Interface implemented by {@link Dialog} collecting data to create/update a {@link Stereotype}.
 * 
 * @author cedric dumoulin
 *
 */
public interface IStereotypeUpdateDialog {

	public IStereotypeUpdateArgs getUpdateArgs();
}
