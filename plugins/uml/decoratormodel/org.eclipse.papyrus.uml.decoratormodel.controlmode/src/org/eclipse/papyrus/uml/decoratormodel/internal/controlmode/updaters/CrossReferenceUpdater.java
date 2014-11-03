/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Implementation of the commands that refactor <em>unloaded</em> dependent decorator models for the changes
 * in the URIs of the base elements of stereotype applications.
 */
public class CrossReferenceUpdater implements IRefactoringStep {

	final TransactionalEditingDomain domain;
	URI decoratorModelURI;
	URI oldUserModelURI;
	URI newUserModelURI;

	public CrossReferenceUpdater(PackageRefactoringContext context, URI decoratorModelURI) {
		super();

		this.domain = context.getEditingDomain();
		this.decoratorModelURI = decoratorModelURI;
		this.oldUserModelURI = context.getOldUserModelURI();
		this.newUserModelURI = context.getNewUserModelURI();
	}

	@Override
	public boolean refactor(Resource resource, IProgressMonitor monitor) throws ExecutionException {
		return refactor(resource, oldUserModelURI, newUserModelURI, monitor);
	}

	@Override
	public boolean unrefactor(Resource resource, IProgressMonitor monitor) throws ExecutionException {
		return refactor(resource, newUserModelURI, oldUserModelURI, monitor);
	}

	protected boolean refactor(Resource resource, URI oldURI, URI newURI, IProgressMonitor monitor) throws ExecutionException {
		boolean result = false;
		monitor.beginTask(NLS.bind(Messages.CrossReferenceUpdater_0, decoratorModelURI), IProgressMonitor.UNKNOWN);

		// If the resource is not loaded, something didn't go right in the basic control step
		Resource newUserModelResource = domain.getResourceSet().getResource(newURI, false);
		if ((newUserModelResource != null) && newUserModelResource.isLoaded()) {
			final Predicate<EReference> needsRefactoring = needsRefactoring();
			for (Iterator<EObject> all = resource.getAllContents(); all.hasNext();) {
				EObject next = all.next();
				for (EReference ref : Iterables.filter(next.eClass().getEAllReferences(), needsRefactoring)) {
					if (next.eIsSet(ref)) {
						if (ref.isMany()) {
							for (Object xref : (Iterable<?>) next.eGet(ref)) {
								EObject eXRef = (EObject) xref;
								if (eXRef.eIsProxy()) {
									result = refactor(eXRef, oldURI, newURI, newUserModelResource) || result;
								}
							}
						} else {
							EObject eXRef = (EObject) next.eGet(ref);
							if ((eXRef != null) && eXRef.eIsProxy()) {
								result = refactor(eXRef, oldURI, newURI, newUserModelResource) || result;
							}
						}
					}
				}
			}
		}

		return result;
	}

	boolean refactor(EObject xref, URI oldURI, URI newURI, Resource newUserModelResource) {
		boolean result = false;

		InternalEObject proxy = (InternalEObject) xref;
		URI proxyURI = proxy.eProxyURI();
		if (proxyURI.trimFragment().equals(oldURI)) {
			String fragment = proxyURI.fragment();
			EObject target = newUserModelResource.getEObject(fragment);
			if (target != null) {
				// Proxy resolves to the new resource? Good. Rewrite it
				proxy.eSetProxyURI(newURI.appendFragment(fragment));
				result = true;
			}
		}

		return result;
	}

	static Predicate<EReference> needsRefactoring() {
		return new Predicate<EReference>() {
			@Override
			public boolean apply(EReference input) {
				return (input != null) && input.isChangeable() && !input.isDerived() && !input.isContainment() && !input.isContainer();
			}
		};
	}

}
