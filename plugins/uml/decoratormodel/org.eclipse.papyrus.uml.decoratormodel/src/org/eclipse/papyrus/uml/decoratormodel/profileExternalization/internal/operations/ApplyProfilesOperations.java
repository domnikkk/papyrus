/**
 * Copyright (c) 2014 Christian W. Damus and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 */
package org.eclipse.papyrus.uml.decoratormodel.profileExternalization.internal.operations;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Apply Profiles</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getAppliedProfiles() <em>Get Applied Profiles</em>}</li>
 * <li>{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getExternalizedAppliedProfilePackages() <em>Get Externalized Applied Profile Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyProfilesOperations
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ApplyProfilesOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public static EList<Profile> getAppliedProfiles(ApplyProfiles applyProfiles) {
		Set<Profile> result = new HashSet<Profile>();

		for (org.eclipse.uml2.uml.Package package_ : applyProfiles.getExternalizedAppliedProfilePackages()) {
			result.addAll(package_.getAppliedProfiles());
		}

		return new BasicEList.UnmodifiableEList<Profile>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Package> getExternalizedAppliedProfilePackages(ApplyProfiles applyProfiles) {
		Set<org.eclipse.uml2.uml.Package> result = new HashSet<org.eclipse.uml2.uml.Package>();

		Dependency base = applyProfiles.getBase_Dependency();
		if (base != null) {
			for (NamedElement next : base.getSuppliers()) {
				if (next instanceof org.eclipse.uml2.uml.Package) {
					result.add((org.eclipse.uml2.uml.Package) next);
				}
			}
		}

		return new BasicEList.UnmodifiableEList<org.eclipse.uml2.uml.Package>(result.size(), result.toArray());
	}

} // ApplyProfilesOperations