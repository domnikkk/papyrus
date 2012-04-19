/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.databinding;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.databinding.EObjectObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.commands.DestroyElementPapyrusCommand;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.properties.util.EMFHelper;

/**
 * An Observable value to edit EMF values through EMF commands.
 * 
 * @author Camille Letavernier
 */
public class EMFObservableValue extends EObjectObservableValue {

	/**
	 * The editing domain on which the commands will be executed
	 */
	protected EditingDomain domain;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param eObject
	 *        The eObject being edited
	 * @param eStructuralFeature
	 *        The structuralFeature being edited
	 * @param domain
	 *        The Editing domain on which the commands will be executed
	 */
	public EMFObservableValue(EObject eObject, EStructuralFeature eStructuralFeature, EditingDomain domain) {
		this(Realm.getDefault(), eObject, eStructuralFeature, domain);
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param realm
	 * @param eObject
	 *        The eObject being edited
	 * @param eStructuralFeature
	 *        The structuralFeature being edited
	 * @param domain
	 *        The Editing domain on which the commands will be executed
	 */
	public EMFObservableValue(Realm realm, EObject eObject, EStructuralFeature eStructuralFeature, EditingDomain domain) {
		super(realm, eObject, eStructuralFeature);
		this.domain = domain;
	}

	@Override
	protected void doSetValue(Object value) {
		EObject eObject = EMFHelper.getEObject(value);
		if(eObject != null) {
			value = eObject;
		}

		Command command = getSetCommand(value);
		domain.getCommandStack().execute(command);
	}

	/**
	 * Returns the command used to edit the value
	 * 
	 * @param value
	 *        The new value
	 * @return
	 *         The Set command used to edit the value
	 */
	protected Command getSetCommand(Object value) {
		Object oldValue = getValue();

		CompoundCommand cc = new CompoundCommand("Edit value");

		if (oldValue instanceof EObject && eStructuralFeature instanceof EReference && ((EReference)eStructuralFeature).isContainment()) {
			cc.append(new GMFtoEMFCommandWrapper(new DestroyElementPapyrusCommand(new DestroyElementRequest((TransactionalEditingDomain)domain, (EObject)oldValue, false))));
		}

		cc.append(new SetCommand(domain, eObject, eStructuralFeature, value));

		return cc;
	}
}
