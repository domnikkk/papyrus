/*****************************************************************************
 * Copyright (c) 2013 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.specialdrop;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;

/**
 * This interface can be used to specify special action when a drag&drop is done.
 * 
 * This will be used only when a standard drag&drop (which create a view) is not possible,
 * which usually means it will not be used on a compartment :  in this case the objects 
 * should be dropped on the header of the object to trigger those actions.
 * 
 * @author mvelten
 *
 */
public interface ISpecialDropProvider {

	/**
	 * This method is called for each feature of the eObject where the drop happened.
	 * This is also called on all the features of the applied stereotypes : 
	 * in this case obj is not the original eObject but the stereotype application.
	 * 
	 * This method should return on or more commands which assign the feature of the object
	 * with values or new elements derived from the values.
	 * 
	 * The user will then be able to choose between those commands when dropping,
	 * so it is recommended to provide an understandable label in the returned commands.
	 * 
	 */
	List<ICommand> getSetFeatureCommands(TransactionalEditingDomain editingDomain, EObject obj, EStructuralFeature f, List<EObject> values, String featureLabel);

	/**
	 * This method is a lot more generic than getSetFeatureCommands :
	 * it is called directly with the dropped objects and the element
	 * where the drop happened. No verification is done on the dropped objects
	 * so those can be IFile or String when dropped from the project explorer for example.
	 * 
	 */
	List<ICommand> getDropObjectsCommands(TransactionalEditingDomain editingDomain, EObject obj, List<Object> droppedObjs);
}
