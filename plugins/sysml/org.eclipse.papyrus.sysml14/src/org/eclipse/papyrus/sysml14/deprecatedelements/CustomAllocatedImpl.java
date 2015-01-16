/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml14.deprecatedelements;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml14.allocations.Allocate;
import org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "Allocated" stereotype see Requirement DerivedProperties Req0010 
 *
 */
public class CustomAllocatedImpl extends AllocatedImpl implements Allocated {


	@Override
	public EList<NamedElement> getAllocatedFrom() {
		// AllocatedFrom property lists all the named elements linked to current
		// by an Allocate link.
		// Current element is the target of the Allocate link.
		EList<NamedElement> allocatedFrom = new BasicEList<NamedElement>();
		Allocate currentAllocate = null;

		if (getBase_NamedElement() != null) {
			// Find Allocate link
			Iterator<DirectedRelationship> itDep = getBase_NamedElement().getTargetDirectedRelationships().iterator();
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				currentAllocate = UMLUtil.getStereotypeApplication(currentDRelationship, Allocate.class);

				if (currentAllocate != null) {
					EList<Element> targets = currentAllocate.getBase_Abstraction().getSources();
					Iterator<Element> it = targets.iterator();
					while (it.hasNext()) {
						Element currentElt = it.next();
						if (currentElt instanceof NamedElement) {
							allocatedFrom.add((NamedElement) currentElt);
						}
					}
				}
			}
		}

		UnmodifiableEList<NamedElement> resultList = new UnmodifiableEList<NamedElement>(this, DeprecatedelementsPackage.eINSTANCE.getAllocated_AllocatedFrom(), allocatedFrom.size(), allocatedFrom.toArray());
		return resultList;
	}

	@Override
	public EList<NamedElement> getAllocatedTo() {
		// AllocatedFrom property lists all the named elements linked to current
		// by an Allocate link.
		// Current element is the target of the Allocate link.
		EList<NamedElement> allocatedTo = new BasicEList<NamedElement>();
		Allocate currentAllocate = null;

		if (getBase_NamedElement() != null) {
			// Find Allocate link
			Iterator<Dependency> itDep = getBase_NamedElement().getClientDependencies().iterator();
			while (itDep.hasNext()) {
				Dependency currentDependency = itDep.next();
				currentAllocate = UMLUtil.getStereotypeApplication(currentDependency, Allocate.class);

				if (currentAllocate != null) {
					allocatedTo.addAll(currentAllocate.getBase_Abstraction().getSuppliers());
				}
			}
		}
		UnmodifiableEList<NamedElement> resultList = new UnmodifiableEList<NamedElement>(this, DeprecatedelementsPackage.eINSTANCE.getAllocated_AllocatedTo(), allocatedTo.size(), allocatedTo.toArray());
		return resultList;
	}

}
