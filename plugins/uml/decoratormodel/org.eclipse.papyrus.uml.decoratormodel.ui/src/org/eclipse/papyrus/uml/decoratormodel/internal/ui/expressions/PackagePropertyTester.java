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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.expressions;

import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;

/**
 * Tester for core-expressions properties contributed to the UML {@link Package} type.
 */
public class PackagePropertyTester extends PropertyTester {
	public static final String PROPERTY_OWNS_PROFILE_APPLICATIONS = "ownsProfileApplications"; //$NON-NLS-1$

	public static final String PROPERTY_HAS_EXTERNAL_PROFILE_APPLICATIONS = "hasExternalProfileApplications"; //$NON-NLS-1$

	public static final String PROPERTY_IS_DECORATOR_MODEL = "isDecoratorModel"; //$NON-NLS-1$

	public static final String PROPERTY_HAS_UNLOADED_DECORATOR_MODELS = "hasUnloadedDecoratorModels"; //$NON-NLS-1$

	public static final String PROPERTY_HAS_LOADED_DECORATOR_MODELS = "hasLoadedDecoratorModels"; //$NON-NLS-1$

	public PackagePropertyTester() {
		super();
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		boolean result = false;

		if (receiver instanceof IStructuredSelection) {
			receiver = ((IStructuredSelection) receiver).getFirstElement();
		} else if (receiver instanceof Iterable<?>) {
			receiver = Iterables.getFirst((Iterable<?>) receiver, null);
		}

		receiver = EMFHelper.getEObject(receiver);
		if (receiver instanceof Package) {
			Package package_ = (Package) receiver;

			if (PROPERTY_OWNS_PROFILE_APPLICATIONS.equals(property)) {
				result = ownsProfileApplications(package_);
			} else if (PROPERTY_HAS_EXTERNAL_PROFILE_APPLICATIONS.equals(property)) {
				result = hasExternalProfileApplications(package_);
			} else if (PROPERTY_IS_DECORATOR_MODEL.equals(property)) {
				result = isDecoratorModel(package_);
			} else if (PROPERTY_HAS_UNLOADED_DECORATOR_MODELS.equals(property)) {
				result = hasUnloadedDecoratorModels(package_, args);
			} else if (PROPERTY_HAS_LOADED_DECORATOR_MODELS.equals(property)) {
				result = hasLoadedDecoratorModels(package_, args);
			}

			// These are all boolean properties
			result = expectBoolean(expectedValue) == result;
		}

		return result;
	}

	private static boolean expectBoolean(Object expectedValue) {
		return (expectedValue == null) || ((expectedValue instanceof Boolean) && ((Boolean) expectedValue).booleanValue());
	}

	static boolean ownsProfileApplications(Package receiver) {
		return !receiver.getProfileApplications().isEmpty();
	}

	static boolean hasExternalProfileApplications(Package receiver) {
		return !Iterables.isEmpty(DecoratorModelUtils.getDecoratorModelProfileApplications(receiver));
	}

	static boolean isDecoratorModel(Package receiver) {
		return (receiver.getOwner() == null) && DecoratorModelUtils.hasExternalizationProfile(receiver);
	}

	static boolean hasUnloadedDecoratorModels(Package receiver, Object[] args) {
		Set<?> options = Sets.newHashSet(args);
		boolean recursive = options.contains("recursive"); //$NON-NLS-1$
		boolean optimistic = options.contains("optimistic"); //$NON-NLS-1$

		return hasUnloadedDecoratorModels(receiver, recursive, optimistic);
	}

	public static boolean hasUnloadedDecoratorModels(Package receiver, boolean recursive, boolean optimistic) {
		Future<Boolean> result = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(receiver, true);

		// Optimistic enablement in case the index is not yet ready. Allow for null result
		return result.isDone() ? Boolean.TRUE.equals(Futures.getUnchecked(result)) : optimistic;
	}

	static boolean hasLoadedDecoratorModels(Package receiver, Object[] args) {
		Set<?> options = Sets.newHashSet(args);
		boolean recursive = options.contains("recursive"); //$NON-NLS-1$

		return hasLoadedDecoratorModels(receiver, recursive);
	}

	private static boolean hasLoadedDecoratorModels(Package receiver, boolean recursive) {
		Resource resource = receiver.eResource();
		boolean result = !DecoratorModelUtils.getLoadedDecoratorModels(resource).isEmpty();

		if (!result && recursive) {
			for (Package next : DecoratorModelUtils.getLoadedSubUnitPackages(receiver)) {
				result = hasLoadedDecoratorModels(next, recursive);
				if (result) {
					break;
				}
			}
		}

		return result;
	}
}
