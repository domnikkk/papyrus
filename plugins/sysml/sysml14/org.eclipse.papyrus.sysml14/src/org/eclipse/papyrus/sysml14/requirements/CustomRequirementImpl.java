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
package org.eclipse.papyrus.sysml14.requirements;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml14.requirements.Copy;
import org.eclipse.papyrus.sysml14.requirements.DeriveReqt;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml14.requirements.Satisfy;
import org.eclipse.papyrus.sysml14.requirements.Verify;
import org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.profile.standard.Refine;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.profile.standard.Trace;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "Requirement" stereotype see Requirement DerivedProperties Req0010 
 *
 */
public class CustomRequirementImpl extends RequirementImpl implements Requirement {

	@Override
	public Requirement basicGetMaster() {
		// The Requirement is the supplier of the Copy link between the master
		// Requirement and
		// current
		// This should return the TestCase verifying current Requirement
		Requirement master = null;
		Copy currentCopy = null;

		if (getBase_Class() != null) {
			Iterator<Dependency> itDep = getBase_Class().getClientDependencies().iterator();

			// Find Copy link
			while (itDep.hasNext()) {
				Dependency currentDep = itDep.next();
				currentCopy = UMLUtil.getStereotypeApplication(currentDep, Copy.class);

				if (currentCopy != null) {
					EList<NamedElement> suppliers = currentCopy.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext() && (master == null)) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							master = currentRequirement;
						}
					}
				}
			}
		}
		return master;
	}


	@Override
	public EList<Requirement> getDerived() {
		// This should return the Requirement(s) derived from current
		EList<Requirement> derived = new BasicEList<Requirement>();
		DeriveReqt currentDeriveReqt = null;

		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				DirectedRelationship currentDirectedRelationship = itDep.next();
				currentDeriveReqt = UMLUtil.getStereotypeApplication(currentDirectedRelationship, DeriveReqt.class);

				if (currentDeriveReqt != null) {
					EList<NamedElement> clients = currentDeriveReqt.getBase_Abstraction().getClients();
					Iterator<NamedElement> it = clients.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							derived.add(currentRequirement);
						}
					}
				}
			}
		}

		UnmodifiableEList<Requirement> resultList = new UnmodifiableEList<Requirement>(this, RequirementsPackage.eINSTANCE.getRequirement_Derived(), derived.size(), derived.toArray());
		return resultList;
	}

	@Override
	public EList<Requirement> getDerivedFrom() {
		// This should return the Requirement(s) this Requirement is derived
		// from
		EList<Requirement> derivedFrom = new BasicEList<Requirement>();
		DeriveReqt currentDeriveReqt = null;
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getSourceDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				currentDeriveReqt = UMLUtil.getStereotypeApplication(currentDRelationship, DeriveReqt.class);

				if (currentDeriveReqt != null) {
					EList<NamedElement> suppliers = currentDeriveReqt.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							derivedFrom.add(currentRequirement);
						}
					}
				}
			}
		}

		UnmodifiableEList<Requirement> resultList = new UnmodifiableEList<Requirement>(this, RequirementsPackage.eINSTANCE.getRequirement_DerivedFrom(), derivedFrom.size(), derivedFrom.toArray());
		return resultList;
	}


	@Override
	public EList<NamedElement> getRefinedBy() {
		// This should return the NamedElement(s) that refine current
		// Requirement
		EList<NamedElement> refinedBy = new BasicEList<NamedElement>();
		Refine currentRefine = null;

		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Refine link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				currentRefine = UMLUtil.getStereotypeApplication(currentDRelationship, Refine.class);

				if (currentRefine != null) {
					refinedBy.addAll(currentRefine.getBase_Abstraction().getClients());
				}
			}
		}

		UnmodifiableEList<NamedElement> resultList = new UnmodifiableEList<NamedElement>(this, RequirementsPackage.eINSTANCE.getRequirement_RefinedBy(), refinedBy.size(), refinedBy.toArray());
		return resultList;
	}

	

	@Override
	public EList<NamedElement> getSatisfiedBy() {
		// This should return the NamedElement(s) that satisfy current
		// Requirement
		EList<NamedElement> satisfyBy = new BasicEList<NamedElement>();
		Satisfy currentSatisfy = null;

		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Satisfy link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				currentSatisfy = UMLUtil.getStereotypeApplication(currentDRelationship, Satisfy.class);

				if (currentSatisfy != null) {
					satisfyBy.addAll(currentSatisfy.getBase_Abstraction().getClients());
				}
			}
		}

		UnmodifiableEList<NamedElement> resultList = new UnmodifiableEList<NamedElement>(this, RequirementsPackage.eINSTANCE.getRequirement_SatisfiedBy(), satisfyBy.size(), satisfyBy.toArray());
		return resultList;
	}


	@Override
	public EList<NamedElement> getTracedTo() {
		// This should return the NamedElement(s) traced by current Requirement
		// SysML spec. : Derived from all elements that are the client of a
		// «trace» relationship
		// for which this requirement is a supplier.
		EList<NamedElement> tracedTo = new BasicEList<NamedElement>();
		Trace currentTrace = null;

		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Trace link
			while (itDep.hasNext()) {
				DirectedRelationship currentDR = itDep.next();
				currentTrace = UMLUtil.getStereotypeApplication(currentDR, Trace.class);

				// Must be a Trace not a subtype (see bug #352563).
				if ((currentTrace != null) && (currentTrace.eClass() == StandardPackage.eINSTANCE.getTrace())) {
					EList<NamedElement> suppliers = currentTrace.getBase_Abstraction().getClients();
					tracedTo.addAll(suppliers);
				}
			}
		}

		UnmodifiableEList<NamedElement> resultList = new UnmodifiableEList<NamedElement>(this, RequirementsPackage.eINSTANCE.getRequirement_TracedTo(), tracedTo.size(), tracedTo.toArray());
		return resultList;
	}

	

	@Override
	public EList<NamedElement> getVerifiedBy() {
		// This should return the list of NamedElement verifying current
		// Requirement
		EList<NamedElement> verifiedBy = new BasicEList<NamedElement>();
		Verify currentVerify = null;

		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Verify link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				currentVerify = UMLUtil.getStereotypeApplication(currentDRelationship, Verify.class);

				if (currentVerify != null) {
					verifiedBy.addAll(currentVerify.getBase_Abstraction().getClients());
				}
			}
		}

		UnmodifiableEList<NamedElement> resultList = new UnmodifiableEList<NamedElement>(this, RequirementsPackage.eINSTANCE.getRequirement_VerifiedBy(), verifiedBy.size(), verifiedBy.toArray());
		return resultList;
	}


	

	@Override
	public void setMaster(Requirement newMaster) {

	}

	

} 
