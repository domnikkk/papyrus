/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - bug 454997
 *
 */
package org.eclipse.papyrus.uml.modelrepair.internal.stereotypes;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Profile;

import com.google.common.base.Predicate;


/**
 * This is the IRepairAction type. Enjoy.
 */
public interface IRepairAction {

	IRepairAction NO_OP = new IRepairAction() {

		public Kind kind() {
			return Kind.NO_OP;
		}

		public boolean isNull() {
			return false;
		}

		public String getLabel() {
			return kind().displayName();
		}

		public boolean repair(Resource resource, EPackage profileDefinition, java.util.Collection<? extends EObject> stereotypeApplications, DiagnosticChain diagnostics, IProgressMonitor monitor) {
			return true;
		}
	};

	IRepairAction NULL = new IRepairAction() {

		public Kind kind() {
			return null;
		}

		public boolean isNull() {
			return true;
		}

		public String getLabel() {
			return "null action";
		}

		public boolean repair(Resource resource, EPackage profileDefinition, java.util.Collection<? extends EObject> stereotypeApplications, DiagnosticChain diagnostics, IProgressMonitor monitor) {
			throw new UnsupportedOperationException("null repair action"); //$NON-NLS-1$
		}
	};

	Predicate<IRepairAction> NOT_NULL = new Predicate<IRepairAction>() {

		public boolean apply(IRepairAction input) {
			return (input != null) && !input.isNull();
		}
	};

	Kind kind();

	boolean isNull();

	String getLabel();

	boolean repair(Resource resource, EPackage profileDefinition, Collection<? extends EObject> stereotypeApplications, DiagnosticChain diagnostics, IProgressMonitor monitor);

	//
	// Nested types
	//

	/*
	 * The interface for Apply Profile repair action.
	 */
	interface IApplyProfileAction {

		Profile getAppliedProfile();

		void setPreviousAppliedProfile(Profile previousProfile);
	}

	enum Kind {
		/** The lazy option. */
		NO_OP("Postpone"),
		/** The option to apply the profile to the model and migrate stereotypes to its latest definition. */
		APPLY_LATEST_PROFILE_DEFINITION("Migrate Profile"),
		/** The option to create problem markers for later review. */
		CREATE_MARKERS("Create Markers"),
		/** The option to delete all zombies. */
		DELETE("Delete Stereotypes");

		private final String displayName;

		private Kind(String displayName) {
			this.displayName = displayName;
		}

		public String displayName() {
			return displayName;
		}
	}
}
