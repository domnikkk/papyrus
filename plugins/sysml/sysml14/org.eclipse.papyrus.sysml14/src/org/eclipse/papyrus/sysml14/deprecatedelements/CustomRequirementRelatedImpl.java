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
import org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.sysml14.requirements.Satisfy;
import org.eclipse.papyrus.sysml14.requirements.Verify;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.profile.standard.Refine;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.profile.standard.Trace;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "RequirementRelated" stereotype see Requirement DerivedProperties Req0010 
 *
 */
public class CustomRequirementRelatedImpl extends RequirementRelatedImpl implements RequirementRelated {


	@Override
	public EList<Requirement> getRefines() {
		// This should return the Requirement(s) refined by current element
		EList<Requirement> refines = new BasicEList<Requirement>();
		Refine currentRefine = null;

		if (getBase_NamedElement() != null) {
			// Find Refine link
			Iterator<Dependency> itDep = getBase_NamedElement().getClientDependencies().iterator();

			while (itDep.hasNext()) {
				Dependency currentDependency = itDep.next();
				currentRefine = UMLUtil.getStereotypeApplication(currentDependency, Refine.class);

				if (currentRefine != null) {
					EList<NamedElement> suppliers = currentRefine.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							refines.add(currentRequirement);
						}
					}
				}
			}
		}

		UnmodifiableEList<Requirement> resultList = new UnmodifiableEList<Requirement>(this, DeprecatedelementsPackage.eINSTANCE.getRequirementRelated_Refines(), refines.size(), refines.toArray());
		return resultList;
	}

	@Override
	public EList<Requirement> getSatisfies() {
		// This should return the Requirement(s) satisfied by current element
		EList<Requirement> satisfies = new BasicEList<Requirement>();
		Satisfy currentSatisfy = null;

		if (getBase_NamedElement() != null) {
			// Find Satisfy link
			Iterator<Dependency> itDep = getBase_NamedElement().getClientDependencies().iterator();

			while (itDep.hasNext()) {
				Dependency currentDependency = itDep.next();
				currentSatisfy = UMLUtil.getStereotypeApplication(currentDependency, Satisfy.class);

				if (currentSatisfy != null) {
					EList<NamedElement> suppliers = currentSatisfy.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							satisfies.add(currentRequirement);
						}
					}
				}
			}
		}

		UnmodifiableEList<Requirement> resultList = new UnmodifiableEList<Requirement>(this, DeprecatedelementsPackage.eINSTANCE.getRequirementRelated_Satisfies(), satisfies.size(), satisfies.toArray());
		return resultList;
	}

	@Override
	public EList<Requirement> getTracedFrom() {

		// Derived from all requirements that are supplier of a "trace"
		// relationship for
		// which this element is a client.
		// "trace" subtypes are not included (see bug #352563).
		EList<Requirement> tracedFrom = new BasicEList<Requirement>();
		Trace currentTrace = null;

		if (getBase_NamedElement() != null) {
			// Find Trace link
			EList<DirectedRelationship> relationships = getBase_NamedElement().getSourceDirectedRelationships();
			Iterator<DirectedRelationship> itDep = relationships.iterator();

			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				currentTrace = UMLUtil.getStereotypeApplication(currentDRelationship, Trace.class);

				// Must be a Trace not a subtype (see bug #352563).
				if ((currentTrace != null) && (currentTrace.eClass() == StandardPackage.eINSTANCE.getTrace())) {
					EList<NamedElement> clients = currentTrace.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = clients.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							tracedFrom.add(currentRequirement);
						}
					}
				}
			}
		}

		UnmodifiableEList<Requirement> resultList = new UnmodifiableEList<Requirement>(this, DeprecatedelementsPackage.eINSTANCE.getRequirementRelated_TracedFrom(), tracedFrom.size(), tracedFrom.toArray());
		return resultList;
	}

	@Override
	public EList<Requirement> getVerifies() {
		// This should return the Requirement(s) verified by current element
		EList<Requirement> verifies = new BasicEList<Requirement>();
		Verify currentVerify = null;

		if (getBase_NamedElement() != null) {
			// Find Satisfy link
			Iterator<Dependency> itDep = getBase_NamedElement().getClientDependencies().iterator();

			while (itDep.hasNext()) {
				Dependency currentDependency = itDep.next();
				currentVerify = UMLUtil.getStereotypeApplication(currentDependency, Verify.class);

				if (currentVerify != null) {
					EList<NamedElement> suppliers = currentVerify.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							verifies.add(currentRequirement);
						}
					}
				}
			}
		}


		UnmodifiableEList<Requirement> resultList = new UnmodifiableEList<Requirement>(this, DeprecatedelementsPackage.eINSTANCE.getRequirementRelated_Verifies(), verifies.size(), verifies.toArray());
		return resultList;
	}

} 
