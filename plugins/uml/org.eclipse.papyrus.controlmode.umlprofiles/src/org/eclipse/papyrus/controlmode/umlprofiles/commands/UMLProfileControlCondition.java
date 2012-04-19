/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.umlprofiles.commands;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.controlmode.commands.IControlUncontrolCondition;
import org.eclipse.papyrus.controlmode.umlprofiles.validation.ProfileApplicationDuplicationChecker;
import org.eclipse.uml2.uml.Package;


public class UMLProfileControlCondition implements IControlUncontrolCondition {

	/**
	 * {@inheritDoc}
	 */
	public boolean enableControl(EObject selection) {
		return selection instanceof Package;
	}

	public boolean enableUnControl(EObject selection) {
		boolean result = false ;
		if (selection instanceof Package) {
			Package pack = (Package) selection;
			ProfileApplicationDuplicationChecker checker = new ProfileApplicationDuplicationChecker();
			Set<Package> controlledPack = checker.getControlledSubPackages(pack);
			result = checker.checkControlledPackagesUpdateable(controlledPack,false);
		}
		return result ;
	}

}
